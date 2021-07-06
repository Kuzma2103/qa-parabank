package data;

import com.github.javafaker.Faker;

import java.util.ArrayList;

public class RegistrationData {

    public static ArrayList<String> registrationData(ArrayList<String> data) {
        Faker faker = new Faker();

        data.add(faker.name().firstName()); // 0 First Name
        data.add(faker.name().lastName()); // 1 Last Name
        data.add(faker.address().streetName()); // 2 Address
        data.add(faker.address().city()); // 3 City
        data.add(faker.address().state()); // 4 State
        data.add(faker.number().digits(5)); // 5 Zip Code
        data.add(faker.phoneNumber().cellPhone()); // 6 Phone
        data.add(faker.number().digits(13)); // 7 Social security number SSN
        data.add(faker.name().username()); // 8 Username
        data.add(faker.internet().password()); // 9 Password

        return data;
    }
}
