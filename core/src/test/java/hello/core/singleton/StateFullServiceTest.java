package hello.core.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StateFullServiceTest {

    @Test
    void statefulServiceSingleton() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StateFullService stateFullService1 = ac.getBean(StateFullService.class);
        StateFullService stateFullService2 = ac.getBean(StateFullService.class);

        int userAPrice = stateFullService1.order("userA", 10000);

        int userBPrice = stateFullService2.order("userB", 20000);

        // int price = stateFullService1.getPrice();
        System.out.println("price = " + userAPrice);


        //org.assertj.core.api.Assertions.assertThat(stateFullService1.getPrice()).isEqualTo(20000);
    }

    static class TestConfig {

        @Bean
        public StateFullService stateFullService() {
            return new StateFullService();
        }
    }

}