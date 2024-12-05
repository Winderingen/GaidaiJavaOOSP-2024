public class Main {
    public static void main(String[] args) {
        ReportFactory textFactory = new TextReportFactory();
        Report textReport = textFactory.createReport();
        textReport.generate();

        ReportFactory tableFactory = new TableReportFactory();
        Report tableReport = tableFactory.createReport();
        tableReport.generate();

        ReportFactory graphFactory = new GraphReportFactory();
        Report graphReport = graphFactory.createReport();
        graphReport.generate();
        
    }
}