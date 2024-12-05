public class TableReportFactory extends ReportFactory {
    @Override
    public Report createReport() {
        return new TableReport();
    }
}