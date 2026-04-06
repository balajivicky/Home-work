public class MainFactory 
{
    public static void main(String[] args) 
	{

        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification email = emailFactory.createNotification();
        email.sendMessage();

        NotificationFactory smsFactory = new SMSNotificationFactory();
        Notification sms = smsFactory.createNotification();
        sms.sendMessage();

        NotificationFactory pushFactory = new PushNotificationFactory();
        Notification push = pushFactory.createNotification();
        push.sendMessage();
    }
}