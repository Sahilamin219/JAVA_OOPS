package com.company;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder(toBuilder = true)
public class HelloWorldTest {
//    @Default
//    private boolean isHelloWorld = false;

    public HelloWorldTest() {

    }

    public void main(){
        HelloWorld a  = HelloWorld.builder().Name("sahil").SurName("Amin").build();
        System.out.println("Ended");
        a.main();

    }
}
