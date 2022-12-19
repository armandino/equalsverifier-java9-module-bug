module user {
    requires nl.jqno.equalsverifier;

    // Uncomment to resolve ClassNotFoundException java.sql.Date
    // requires java.sql;

    // Subsequent error: ClassNotFoundException sun.reflect.ReflectionFactory

    opens org.example.domain;
}