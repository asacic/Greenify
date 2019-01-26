import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OBJECTID",
    "TEXT13ID",
    "F_TYP",
    "T_TEXT",
    "T_LANG",
    "O",
    "P",
    "O_UEREG",
    "O_REGION",
    "O_LOKAL",
    "P_WLD",
    "P_WAS",
    "P_WIE",
    "P_WGT",
    "P_LW",
    "P_PK",
    "P_GPK",
    "P_GST",
    "P_SGR",
    "P_AGR",
    "P_RGR",
    "P_URB",
    "Q_MOB",
    "Q_SPI",
    "Q_GRI",
    "Q_HUN",
    "Q_BAB",
    "Q_WC",
    "Q_SPO",
    "Q_TRB",
    "UMFANG",
    "FLAECHE",
    "SE_ANNO_CAD_DATA"
})
public class Properties {

    @JsonProperty("OBJECTID")
    private Double oBJECTID;
    @JsonProperty("TEXT13ID")
    private String tEXT13ID;
    @JsonProperty("F_TYP")
    private String fTYP;
    @JsonProperty("T_TEXT")
    private String tTEXT;
    @JsonProperty("T_LANG")
    private String tLANG;
    @JsonProperty("O")
    private Double o;
    @JsonProperty("P")
    private Double p;
    @JsonProperty("O_UEREG")
    private Double oUEREG;
    @JsonProperty("O_REGION")
    private Double oREGION;
    @JsonProperty("O_LOKAL")
    private Double oLOKAL;
    @JsonProperty("P_WLD")
    private Double pWLD;
    @JsonProperty("P_WAS")
    private Double pWAS;
    @JsonProperty("P_WIE")
    private Double pWIE;
    @JsonProperty("P_WGT")
    private Double pWGT;
    @JsonProperty("P_LW")
    private Double pLW;
    @JsonProperty("P_PK")
    private Double pPK;
    @JsonProperty("P_GPK")
    private Double pGPK;
    @JsonProperty("P_GST")
    private Double pGST;
    @JsonProperty("P_SGR")
    private Double pSGR;
    @JsonProperty("P_AGR")
    private Double pAGR;
    @JsonProperty("P_RGR")
    private Double pRGR;
    @JsonProperty("P_URB")
    private Double pURB;
    @JsonProperty("Q_MOB")
    private Double qMOB;
    @JsonProperty("Q_SPI")
    private Double qSPI;
    @JsonProperty("Q_GRI")
    private Double qGRI;
    @JsonProperty("Q_HUN")
    private Double qHUN;
    @JsonProperty("Q_BAB")
    private Double qBAB;
    @JsonProperty("Q_WC")
    private Double qWC;
    @JsonProperty("Q_SPO")
    private Double qSPO;
    @JsonProperty("Q_TRB")
    private Double qTRB;
    @JsonProperty("UMFANG")
    private Double uMFANG;
    @JsonProperty("FLAECHE")
    private Double fLAECHE;
    @JsonProperty("SE_ANNO_CAD_DATA")
    private Object sEANNOCADDATA;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("OBJECTID")
    public Double getOBJECTID() {
        return oBJECTID;
    }

    @JsonProperty("OBJECTID")
    public void setOBJECTID(Double oBJECTID) {
        this.oBJECTID = oBJECTID;
    }

    @JsonProperty("TEXT13ID")
    public String getTEXT13ID() {
        return tEXT13ID;
    }

    @JsonProperty("TEXT13ID")
    public void setTEXT13ID(String tEXT13ID) {
        this.tEXT13ID = tEXT13ID;
    }

    @JsonProperty("F_TYP")
    public String getFTYP() {
        return fTYP;
    }

    @JsonProperty("F_TYP")
    public void setFTYP(String fTYP) {
        this.fTYP = fTYP;
    }

    @JsonProperty("T_TEXT")
    public String getTTEXT() {
        return tTEXT;
    }

    @JsonProperty("T_TEXT")
    public void setTTEXT(String tTEXT) {
        this.tTEXT = tTEXT;
    }

    @JsonProperty("T_LANG")
    public String getTLANG() {
        return tLANG;
    }

    @JsonProperty("T_LANG")
    public void setTLANG(String tLANG) {
        this.tLANG = tLANG;
    }

    @JsonProperty("O")
    public Double getO() {
        return o;
    }

    @JsonProperty("O")
    public void setO(Double o) {
        this.o = o;
    }

    @JsonProperty("P")
    public Double getP() {
        return p;
    }

    @JsonProperty("P")
    public void setP(Double p) {
        this.p = p;
    }

    @JsonProperty("O_UEREG")
    public Double getOUEREG() {
        return oUEREG;
    }

    @JsonProperty("O_UEREG")
    public void setOUEREG(Double oUEREG) {
        this.oUEREG = oUEREG;
    }

    @JsonProperty("O_REGION")
    public Double getOREGION() {
        return oREGION;
    }

    @JsonProperty("O_REGION")
    public void setOREGION(Double oREGION) {
        this.oREGION = oREGION;
    }

    @JsonProperty("O_LOKAL")
    public Double getOLOKAL() {
        return oLOKAL;
    }

    @JsonProperty("O_LOKAL")
    public void setOLOKAL(Double oLOKAL) {
        this.oLOKAL = oLOKAL;
    }

    @JsonProperty("P_WLD")
    public Double getPWLD() {
        return pWLD;
    }

    @JsonProperty("P_WLD")
    public void setPWLD(Double pWLD) {
        this.pWLD = pWLD;
    }

    @JsonProperty("P_WAS")
    public Double getPWAS() {
        return pWAS;
    }

    @JsonProperty("P_WAS")
    public void setPWAS(Double pWAS) {
        this.pWAS = pWAS;
    }

    @JsonProperty("P_WIE")
    public Double getPWIE() {
        return pWIE;
    }

    @JsonProperty("P_WIE")
    public void setPWIE(Double pWIE) {
        this.pWIE = pWIE;
    }

    @JsonProperty("P_WGT")
    public Double getPWGT() {
        return pWGT;
    }

    @JsonProperty("P_WGT")
    public void setPWGT(Double pWGT) {
        this.pWGT = pWGT;
    }

    @JsonProperty("P_LW")
    public Double getPLW() {
        return pLW;
    }

    @JsonProperty("P_LW")
    public void setPLW(Double pLW) {
        this.pLW = pLW;
    }

    @JsonProperty("P_PK")
    public Double getPPK() {
        return pPK;
    }

    @JsonProperty("P_PK")
    public void setPPK(Double pPK) {
        this.pPK = pPK;
    }

    @JsonProperty("P_GPK")
    public Double getPGPK() {
        return pGPK;
    }

    @JsonProperty("P_GPK")
    public void setPGPK(Double pGPK) {
        this.pGPK = pGPK;
    }

    @JsonProperty("P_GST")
    public Double getPGST() {
        return pGST;
    }

    @JsonProperty("P_GST")
    public void setPGST(Double pGST) {
        this.pGST = pGST;
    }

    @JsonProperty("P_SGR")
    public Double getPSGR() {
        return pSGR;
    }

    @JsonProperty("P_SGR")
    public void setPSGR(Double pSGR) {
        this.pSGR = pSGR;
    }

    @JsonProperty("P_AGR")
    public Double getPAGR() {
        return pAGR;
    }

    @JsonProperty("P_AGR")
    public void setPAGR(Double pAGR) {
        this.pAGR = pAGR;
    }

    @JsonProperty("P_RGR")
    public Double getPRGR() {
        return pRGR;
    }

    @JsonProperty("P_RGR")
    public void setPRGR(Double pRGR) {
        this.pRGR = pRGR;
    }

    @JsonProperty("P_URB")
    public Double getPURB() {
        return pURB;
    }

    @JsonProperty("P_URB")
    public void setPURB(Double pURB) {
        this.pURB = pURB;
    }

    @JsonProperty("Q_MOB")
    public Double getQMOB() {
        return qMOB;
    }

    @JsonProperty("Q_MOB")
    public void setQMOB(Double qMOB) {
        this.qMOB = qMOB;
    }

    @JsonProperty("Q_SPI")
    public Double getQSPI() {
        return qSPI;
    }

    @JsonProperty("Q_SPI")
    public void setQSPI(Double qSPI) {
        this.qSPI = qSPI;
    }

    @JsonProperty("Q_GRI")
    public Double getQGRI() {
        return qGRI;
    }

    @JsonProperty("Q_GRI")
    public void setQGRI(Double qGRI) {
        this.qGRI = qGRI;
    }

    @JsonProperty("Q_HUN")
    public Double getQHUN() {
        return qHUN;
    }

    @JsonProperty("Q_HUN")
    public void setQHUN(Double qHUN) {
        this.qHUN = qHUN;
    }

    @JsonProperty("Q_BAB")
    public Double getQBAB() {
        return qBAB;
    }

    @JsonProperty("Q_BAB")
    public void setQBAB(Double qBAB) {
        this.qBAB = qBAB;
    }

    @JsonProperty("Q_WC")
    public Double getQWC() {
        return qWC;
    }

    @JsonProperty("Q_WC")
    public void setQWC(Double qWC) {
        this.qWC = qWC;
    }

    @JsonProperty("Q_SPO")
    public Double getQSPO() {
        return qSPO;
    }

    @JsonProperty("Q_SPO")
    public void setQSPO(Double qSPO) {
        this.qSPO = qSPO;
    }

    @JsonProperty("Q_TRB")
    public Double getQTRB() {
        return qTRB;
    }

    @JsonProperty("Q_TRB")
    public void setQTRB(Double qTRB) {
        this.qTRB = qTRB;
    }

    @JsonProperty("UMFANG")
    public Double getUMFANG() {
        return uMFANG;
    }

    @JsonProperty("UMFANG")
    public void setUMFANG(Double uMFANG) {
        this.uMFANG = uMFANG;
    }

    @JsonProperty("FLAECHE")
    public Double getFLAECHE() {
        return fLAECHE;
    }

    @JsonProperty("FLAECHE")
    public void setFLAECHE(Double fLAECHE) {
        this.fLAECHE = fLAECHE;
    }

    @JsonProperty("SE_ANNO_CAD_DATA")
    public Object getSEANNOCADDATA() {
        return sEANNOCADDATA;
    }

    @JsonProperty("SE_ANNO_CAD_DATA")
    public void setSEANNOCADDATA(Object sEANNOCADDATA) {
        this.sEANNOCADDATA = sEANNOCADDATA;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
