import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeomertyDeserializer extends StdDeserializer<Geometry> {

    public GeomertyDeserializer() {
        this(null);
    }

    public GeomertyDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Geometry deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        JsonNode node = jp.getCodec().readTree(jp);
        String type = node.get("type").asText();

        JsonNode coor = node.get("coordinates");

        List<Coordinates> coordinates = new ArrayList<Coordinates>();

        Double lat, lon;

        if(type.equals("Polygon")) {
            JsonNode jsonNode1 = coor.get(0);
            setCoordinates(coordinates, jsonNode1);
        } else {
            JsonNode jsonNode1 = coor.get(0);
            for ( int j = 0; j < jsonNode1.size(); j++) {
                JsonNode jsonNode2 = jsonNode1.get(j);
                setCoordinates(coordinates, jsonNode2);
            }
        }
        return new Geometry(type, coordinates);
    }

    private void setCoordinates(List<Coordinates> coordinates, JsonNode jsonNode1) {
        Double lon;
        Double lat;
        for (int j = 0; j < jsonNode1.size(); j++) {
            JsonNode jsonNode2 = jsonNode1.get(j);
            lon = jsonNode2.get(0).asDouble();
            lat = jsonNode2.get(1).asDouble();
            Coordinates c = new Coordinates(lat, lon);
            coordinates.add(c);
        }
    }
}