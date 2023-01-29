public class Main {
    public static void main(String[] args) {
        EmailLogger logger = new EmailLogger();
        logger.log("Log mesaji ");
           BaseLogger[] loggers = new BaseLogger[]{
                  new FileLogger(),
                  new EmailLogger(),
                  new DatabaseLogger(),
                  new ConsoleLogger()
          };
           for(BaseLogger loggerm : loggers){
              loggerm.log("Log Mesaji");
          }
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.Add();
    }
}