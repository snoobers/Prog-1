// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.BeforeEach;

// public class TestStudent {
    
//     private Student BroMama;
//     private Student JoeMama;

//     @BeforeEach
//     public void setUp(){
//         this.BroMama = new Student("BroMama");
//         this.JoeMama = new Student("JoeMama");
//     }

//     @Test
//     public void testConstructor_ShouldInitializeFieldsCorrectly(){
//         assertEquals("BroMama", BroMama.getName());
//         assertEquals("JoeMama", JoeMama.getName());
//         assertEquals(0, BroMama.getNumberOfTasks());
//     }

//     @Test
//     public void testIncreaseTaskAmount_ShouldIncreaseCorrectly(){
//         JoeMama.increaseTaskAmount(10);
//         assertEquals(10, JoeMama.getNumberOfTasks());
//     }

//     @Test
//     public void testToString_ShouldReturnCorrectString(){
//         assertEquals("BroMama has completed 0 tasks.", BroMama.toString());
//     }
// }
