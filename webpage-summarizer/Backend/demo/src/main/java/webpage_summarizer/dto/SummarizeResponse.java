package webpage_summarizer.dto;

public class SummarizeResponse {

    private String summary;

    public SummarizeResponse(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }
}
