Feature: тест раздела Group

  Background: проверить раздел Group

  Scenario:в разделе Group надо создать новую группу и обратно удалить
    Given пользователь находится на странице входа в систему
    Then заходит в систему используя следующие данные
    And  в USERNAME OR EMAIL вводит "aidar3107"
    And в PASSWORD вводит "Aidar548889"
    Then кликает кнопку Login
    Then пользователь зашел в систему в качестве админа
    And админ кликнул раздел Add group
    When админ зашел в раздел Add group
    And в поле Name написал Test
    Then в поле Description написал Test1
    And админ кликнул Group key
    Then в Group key очистил данные
    And в Group key написал test123
    Then админ кликнул Price
    And в поле прайс ввел цифру 200
    Then кликнул Add group
    When админ перешел на другую страницу
    Then добавил в группу пользователя нажав +
    Then админ в левом верхнем углу кликнул Courses
    Then выбрал несколько курсов нажав +
    And в левом верхнем углу кликнул Groups
    Then в списке кликнул группу test
    When админ зашел в группу
    Then кликнул в правом нижнем углу Delete
    And в всплывающем окне еще раз кликнул Delete
    Then админ вернулся на главную страницу кликнув в левом верхнем углу Home


