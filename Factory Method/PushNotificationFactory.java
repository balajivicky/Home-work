class PushNotificationFactory extends NotificationFactory 
{
    public Notification createNotification() 
	{
        return new PushNotification();
    }
}