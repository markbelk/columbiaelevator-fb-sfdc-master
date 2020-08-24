import org.apache.camel.builder.RouteBuilder;

public class IntegrationRouteBuilder extends RouteBuilder {
        public void configure() {
            // from(uri="direct:query");
            // to(uri="salesforce:query?sObjectQuery=SELECT id,name from Opportunity&amp;sObjectClass=org.apache.camel.salesforce.dto.Opportunity.class");
            // to(uri="log: Query result back from Salesforce:${body}");
    }
}