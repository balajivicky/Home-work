class SMSNotificationFactory extends NotificationFactory 
{
    public Notification createNotification() 
	{
        return new SMSNotification();
    }
}