public class TextReportFactory extends ReportFactory {
    @Override
    public Report createReport() {
        return new TextReport();
    }
}