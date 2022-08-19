package UI.stepDefinitions.steps;

import API.dataProviders.MockDataGenerator;
import UI.dataProviders.EsensMockDataGenerator;
import UI.pagesPOM.addNotificationsEsen.AddNotifications;
import UI.pagesPOM.addNotificationsEsen.HomePage;
import UI.pagesPOM.addNotificationsEsen.NotificationsPage;

public class EsensBasePage {
    AddNotifications addNotifications = new AddNotifications();
    HomePage homePage = new HomePage();
    NotificationsPage notificationsPage = new NotificationsPage();
    EsensMockDataGenerator esensMockDataGenerator = new EsensMockDataGenerator();
}
