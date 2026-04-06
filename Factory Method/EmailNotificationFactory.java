class EmailNotificationFactory extends NotificationFactory 
{
    public Notification createNotification() 
	{
        return new EmailNotification();
    }
}