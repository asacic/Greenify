import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.google.gson.Gson;
import org.omg.PortableInterceptor.INACTIVE;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Path("/api")
public class BigDataCall {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes("text/plain")
    public String getClichedMessage(@QueryParam("test")  @DefaultValue("Default") String var ) throws IOException {
        return "Server ALIVE";

    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes("text/plain")
    @Path("getLokal/")
    public String getLokal(@QueryParam("lokal")
                          @DefaultValue("0") String lokal) throws IOException {

        Double argParameter = 1.0;


        URL url = new URL("https://data.wien.gv.at/daten/geo?service=WFS&request=GetFeature&version=1.1.0&typeName=ogdwien:OEFFGRUENFLOGD&srsName=EPSG:4326&outputFormat=json");

        System.out.println("Starting...");
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Geometry.class, new GeomertyDeserializer());
        mapper.registerModule(module);
        DSource dsource = mapper.readValue(new File("/Users/Martin/Documents/glassfish5/OEFFGRUENFLOGD.json"), DSource.class);

        if(lokal.equals("1"))
        {
            argParameter = 1.0;
        }
        else
        {
            argParameter = 0.0;
        }

        Double finalArgParameter = argParameter;
        List<Feature> featureList = dsource.getFeatures().stream().filter(f -> f.getProperties().getOLOKAL().equals(finalArgParameter)).collect(Collectors.toList());

        String output = mapper.writeValueAsString(featureList);

        return  output ;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes("text/plain")
    @Path("getWC/")
    public String getWC(@QueryParam("wc")
                           @DefaultValue("0") String wc) throws IOException {

        Double argParameter = 1.0;


        URL url = new URL("https://data.wien.gv.at/daten/geo?service=WFS&request=GetFeature&version=1.1.0&typeName=ogdwien:OEFFGRUENFLOGD&srsName=EPSG:4326&outputFormat=json");

        System.out.println("Starting...");
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Geometry.class, new GeomertyDeserializer());
        mapper.registerModule(module);
        DSource dsource = mapper.readValue(new File("/Users/Martin/Documents/glassfish5/OEFFGRUENFLOGD.json"), DSource.class);

        if(wc.equals("1"))
        {
            argParameter = 1.0;
        }
        else
        {
            argParameter = 0.0;
        }

        Double finalArgParameter = argParameter;
        List<Feature> featureList = dsource.getFeatures().stream().filter(f -> f.getProperties().getQWC().equals(finalArgParameter)).collect(Collectors.toList());

        String output = mapper.writeValueAsString(featureList);

        return  output ;
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes("text/plain")
    @Path("getSpielplatz/")
    public String getSpielplatz(@QueryParam("sp")
                        @DefaultValue("0") String sp) throws IOException {

        Double argParameter = 1.0;


        URL url = new URL("https://data.wien.gv.at/daten/geo?service=WFS&request=GetFeature&version=1.1.0&typeName=ogdwien:OEFFGRUENFLOGD&srsName=EPSG:4326&outputFormat=json");

        System.out.println("Starting...");
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Geometry.class, new GeomertyDeserializer());
        mapper.registerModule(module);
        DSource dsource = mapper.readValue(new File("/Users/Martin/Documents/glassfish5/OEFFGRUENFLOGD.json"), DSource.class);

        if(sp.equals("1"))
        {
            argParameter = 1.0;
        }
        else
        {
            argParameter = 0.0;
        }

        Double finalArgParameter = argParameter;
        List<Feature> featureList = dsource.getFeatures().stream().filter(f -> f.getProperties().getQSPI().equals(finalArgParameter)).collect(Collectors.toList());

        String output = mapper.writeValueAsString(featureList);

        return  output ;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes("text/plain")
    @Path("getHundezone/")
    public String getHZ(@QueryParam("hz")
                        @DefaultValue("0") String hz) throws IOException {

        Double argParameter = 1.0;


        URL url = new URL("https://data.wien.gv.at/daten/geo?service=WFS&request=GetFeature&version=1.1.0&typeName=ogdwien:OEFFGRUENFLOGD&srsName=EPSG:4326&outputFormat=json");

        System.out.println("Starting...");
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Geometry.class, new GeomertyDeserializer());
        mapper.registerModule(module);
        DSource dsource = mapper.readValue(new File("/Users/Martin/Documents/glassfish5/OEFFGRUENFLOGD.json"), DSource.class);

        if(hz.equals("1"))
        {
            argParameter = 1.0;
        }
        else
        {
            argParameter = 0.0;
        }

        Double finalArgParameter = argParameter;
        List<Feature> featureList = dsource.getFeatures().stream().filter(f -> f.getProperties().getQHUN().equals(finalArgParameter)).collect(Collectors.toList());

        String output = mapper.writeValueAsString(featureList);

        return  output ;
    }

}