[:h4 [:a {:name "ch8"} "Decoupling Tests"]]
[:p "So now we have a way to get user input, we need to validate that input. If we add the following test from <a href=\"#f9\">Figure 9</a> and function from <a href=\"#f10\">Figure 10</a>, we will have that functionality."]

[:h5 [:a {:name "f9"} "Figure 9"]]
[:img {:src "/images/tutorial_figs/figure9.png"}]

[:h5 [:a {:name "f10"} "Figure 10"]]
[:img {:src "/images/tutorial_figs/figure10.png"}]

[:p "This code might look a little bit more confusing to you than our last example. Our new function uses our prompt function to get a number representing the amount of coins the user has. They type of coin is supplied in the arguments. If the user gives us invalid input, we throw an error saying that it is not a valid amount."]

[:p "You might be asking yourself, won't our tests fail if something is wrong with the prompt method? Since this test is about the function get-coin-amount and our function depends on the prompt function, we need a way to ensure that the prompt function will return what we need it to. We can accomplish this by binding a new value to the prompt keyword (within the scope of our test). This is being done with the binding method. As you can see, for the first 4 assertions prompt will return the string value of 11, then for the last assertion it will return the string value of $5."]

[:h4 [:a {:name "ch9"} "Testing for Exceptions"]]
[:p "Won't the string value of $5 make get-coin-amount throw an error? Yes, and we can test that it should do that by using Speclj's should-throw component. On the flipside, when prompt returns a string value that can be parsed into an int without tripping the catch method, we can use the should-not-throw to test for an error and exception free execution of our method."]

[:p "The should=, should-not=, and should-fail assertions are all testing the same thing. We included them just to show how they can be used. The should= passes if the first argument equals the result of the second argument. On the other hand, the should-not= passes if the first argument doesn't equal the result of its second argument. Then finally, the should-fail fails the test and prints it's error message if it gets evaluated."]
[:span {:id "lesson_nav"} [:a {:href "/tutorial/step5"} "Previous Step"] "&nbsp;&nbsp;|&nbsp;&nbsp;" [:a {:href "/tutorial/step7"} "Next Step"]]