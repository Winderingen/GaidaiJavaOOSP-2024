public class GraphReportFactory extends ReportFactory {
    @Override
    public Report createReport() {
        return new GraphReport();
    }
}