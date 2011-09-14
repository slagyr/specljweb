[:h3 "Tutorial"]

[:p "In this tutorial we will go through the following concepts..."]
[:ul
 [:li [:a {:href "#ch1"} "Getting Started"]]
 [:li [:a {:href "#ch2"} "Running Your 1st Test"]]
 [:li [:a {:href "#ch3"} "Understanding the Basics"]]
 [:li [:a {:href "#ch4"} "Splitting Test Code From Production Code"]]
 [:li [:a {:href "#ch5"} "Running Multiple Test Files"]]
 [:li [:a {:href "#ch6"} "Stubbing Standard Input and Output"]]
 [:li [:a {:href "#ch7"} "Run Tests Automatically"]]
 [:li [:a {:href "#ch8"} "Decoupling Tests"]]
 [:li [:a {:href "#ch9"} "Testing for Exceptions"]]
 [:li [:a {:href "#ch10"} "Testing Long Decimal Values with Simple Formatting"]]
]

[:h4 [:a {:name "ch1"} "Getting Started"]]
[:p "This tutorial will teach you Speclj by using it as we build a sample application that counts your change and converts it into dollars. Before we dive in, let's go over how to configure Speclj on your system."]

[:p "Speclj is a plugin for Leiningen. Leiningen is an application that does a lot of useful tasks for people working on Clojure projects. So in order to use Speclj, you need to have Leiningen installed on your system. Instructions on installing Leiningen can be found on their README file. https://github.com/technomancy/leiningen/blob/master/README.md"]

[:p "Next you need to create a new clojure project. To do this you need to open up your terminal and run the following command:"]

[:code "lein new change_counter"]


[:p "What did we just do? We told Leiningen to create a new clojure project called change_counter in the directory that we are currently in. As you can see, a lot of new files and directories were just created. To use Speclj, we need to make some minor adjustments to the standard directory structure. <a href=\"#f1\">Figure 1</a> shows the default directory structure that Leiningen creates, and <a href=\"#f2\">Figure 2</a> shows the directory structure that Speclj requires."]

[:h5 [:a {:name "f1"} "Figure 1"]]
[:img {:src "/images/tutorial_figs/figure1.png"}]

[:h5 [:a {:name "f2"} "Figure 2"]]
[:img {:src "/images/tutorial_figs/figure2.png"}]

[:p "Once you make the required changes to your project's directory, we are ready to install Speclj. If you have reviewed our Installation page, you would know that there are two ways we could do this. For this tutorial project, we will install using Leiningen. To do this we need to edit our project.clj file. <a href=\"#f3\">Figure 3</a> shows what our project.clj file will look like after we make the changes outlined by the Installation page."]

[:h5 [:a {:name "f3"} "Figure 3"]]
[:img {:src "/images/tutorial_figs/figure3.png"}]

[:p "Once that is saved run the following command from your terminal within your project's directory:"]

[:code "<pre>lein deps</pre>"]


[:p "That command we just ran installed all the dependencies listed in our project's project.clj file. Since we listed speclj 1.4.0, it installed Speclj. Now we are ready to write our first test."]

[:h4 [:a {:name "ch2"} "Running Your 1st Test"]]
[:p "If you open up your core_spec.clj file, we can begin to write our tests. First lets type the code from <a href=\"#f4\">Figure 4</a> into our core_spec.clj file."]

[:h5 [:a {:name "f4"} "Figure 4"]]
[:img {:src "/images/tutorial_figs/figure4.png"}]

[:p "So what does this code do? The first two lines set the namespace to be change_counter.core-spec and also gets all of the functions defined in the speclj.core namespace. From speclj.core we are using describe, it, should, and run-specs."]

[:p "The describe function wraps related tests. In this example we are testing the truthiness of functions, so we labeled our describe component truthiness. Technically you can label the describe component with any string. However it is helpful to other developers if you label your describe component based on what is being tested. The same can be said for the it component. If we really wanted we could label the it component as follows:"]

[:code "<pre>(it false
	(should true))</pre>"]
	

[:p "The test above will have a label of "false" and pass because the should method receives the value of true. Doing this would be of no help to other developers because the string "false" tells us nothing about the test code within the it component."]

[:p "Referring back to <a href=\"#f4\">Figure 4</a>, you can see that our it component was labeled \"tests if true-or-false? returns true.\" That should clue in the reader that the test will pass if a call to the method true-or-false resolves in a value of true. As you can see from our declaration of that method a couple lines above our test, it returns true. So what does that tell us about Speclj's should method? If should is passed the value of true the test passes, while if should is passed the value of false, the test fails."]

[:p "So let's put this code to the test and see if everything is working as we expect it to. To run the test we created, run the following command from your terminal within your project's directory:"]

[:code "<pre>lein spec</pre>"]

[:h4 [:a {:name "ch3"} "Understanding the Basics"]]
[:p "Let's add some more code to understand how Speclj works. Let's type the code from <a href=\"#f5\">Figure 5</a> into our core_spec.clj file to get a deeper understanding of how Speclj components work."]

[:h5 [:a {:name "f5"} "Figure 5"]]
[:img {:src "/images/tutorial_figs/figure5.png"}]

[:p "If you run the tests, it becomes obvious what the before-all, after-all, before, and after components do. In the case of <a href=\"#f5\">Figure 5</a> they are being used trivially to display their functionality, however they are very useful when a lot of your tests require the same setup or teardown code."]

[:p "Another thing to notice from <a href=\"#f5\">Figure 5</a> is the difference between the should, should-not, and should= components. In the case of should and should-not, they get passed a value of true or false and pass or fail accordingly. However the should= component takes two arguments. The 1st argument represents the expected result of the 2nd argument. The 2nd argument is the value actually being tested."]

[:h4 [:a {:name "ch4"} "Splitting Test Code From Production Code"]]
[:p "You may have noticed that in <a href=\"#f5\">Figure 5</a>, the code we are testing is in the test file itself. This is not a good convention to follow because we want a clear separation between production code and test code so that the reader can easily follow what is going on. So let's see what happens when we move our equals-5? method into the core.clj file. <a href=\"#f6\">Figure 6</a> shows us the updated core.clj file."]

[:h5 [:a {:name "f6"} "Figure 6"]]
[:img {:src "/images/tutorial_figs/figure6.png"}]

[:p "If we run the tests we get the following error:"]

[:code "<pre>java.lang.Exception: Unable to resolve symbol: equals-5? in this context</pre>"]


[:p "Basically this tells us that the core_spec.clj file doesn't know where the equals-5? method is anymore. Just like we had to explicitly tell our spec file to get methods from the speclj.core namespace, we have to tell our spec file to get methods from the change_counter.core namespace. To do this, we have to update the change_counter.core-spec namespace declaration as follows:"]

[:code "<pre>(ns yibble.core-spec
	(:use [speclj.core] [yibble.core]))</pre>"]


[:p "If we run our tests again, the spec file will know where the equals-5? method is and the tests will pass again."]

[:h4 [:a {:name "ch5"} "Running Multiple Test Files"]]
[:p "If we have a project that has many files, we will want to have many test files that each focus on a specific aspect of functionality. Speclj makes this easy. Every file in the spec directory automatically gets evaluated when we run our tests. The convention is to add _spec to the end of the file name to let readers know that it is a spec file."]

[:h4 [:a {:name "ch6"} "Stubbing Standard Input and Output"]]
[:p "Now that we have a basic understanding of how Speclj is used, let's start building our change counter application. We want this application to ask the user how many pennies, nickels, dimes, quarters, half dollars, and silver dollars they have. Then based off of those coin totals, return a count of how much money they have in dollar format."]

[:p "So let's get started. You should delete all of the code we added to core_spec.clj and core.clj, because that was just there for learning purposes. Now we want our core_spec.clj and core.clj files to look like <a href=\"#f7\">Figure 7</a> and <a href=\"#f8\">Figure 8</a> respectively."]


[:h5 [:a {:name "f7"} "Figure 7"]]
[:img {:src "/images/tutorial_figs/figure7.png"}]

[:h5 [:a {:name "f8"} "Figure 8"]]
[:img {:src "/images/tutorial_figs/figure8.png"}]

[:p "If we run our test it should pass, but what are we actually testing here? The prompt method simply prints a message to standard output and returns a value from standard input. So we want to write two tests, one to test the input and one to test the output. In order to write our tests we need an automated way of passing and returning information from standard input and standard output. We do this by using Clojure's with-in-str and with-out-str methods. Then we test the return values against our expectations using Speclj's should= component."]

[:p "You might be wondering why the output from calling the prompt function isn't showing up in your tests. This output would be a nuisance, so we used Speclj's around component. Around gets called every time a test is run and takes the actual test as an argument. We use the around component to wrap our test in the with-out-str function (which stubs all output)."]

[:h4 [:a {:name "ch7"} "Run Tests Automatically"]]
[:p "You might notice that loading up our tests takes a long time, yet actually running our tests happens extremely quickly. This occurs because Clojure runs on the Java Virtual Machine (JVM). One way we can bypass this annoying load up time is by setting our tests to stay loaded up and run whenever we save any changes to our code. This can be accomplished by running the following command from our terminal:"]

[:code "<pre>lein spec -a</pre>"]


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

[:h4 [:a {:name "ch10"} "Testing Long Decimal Values with Simple Formatting"]]
[:p "Now that we have functions that can get valid user input for all types of coins, we can call them once for each coin type and add their result. Then we can make another function that converts that total into dollars. <a href=\"#f11\">Figure 11</a> and <a href=\"#f12\">Figure 12</a> represent the additional tests and functions that we need to add to make this happen."]

[:h5 [:a {:name "f11"} "Figure 11"]]
[:img {:src "/images/tutorial_figs/figure11.png"}]

[:h5 [:a {:name "f12"} "Figure 12"]]
[:img {:src "/images/tutorial_figs/figure12.png"}]

[:p "Our test for the count-change method doesn't introduce any new concepts. But to review, it binds all calls to get-coin-amount to the value of 2. So when our count-change method makes the calls to get-coin-amount for pennies, nickels, dimes, etc it gets a return value of 2 coins. Then we test that we should get a value of 382 given our inputs of 2 of each coin."]

[:p "The next test uses a symbol called dollar-format which is declared using Speclj's with component. The with component declares a reference-able symbol that we can use later within the scope of our describe component. So when we are running our test we format the output of convert-to-dollars method into an easily testable value of $11.34."]

[:p "And that's it. Our application meets all of the requirements we set for the application. <a href=\"#f13\">Figure 13</a> and <a href=\"#f14\">Figure 14</a> represent what the final project should look like."]

[:h5 [:a {:name "f13"} "Figure 13"]]
[:img {:src "/images/tutorial_figs/figure13.png"}]

[:h5 [:a {:name "f14"} "Figure 14"]]
[:img {:src "/images/tutorial_figs/figure14.png"}]

[:p "By now, you should understand how to use Speclj to test your Clojure applications. I hope you enjoyed this tutorial. For additional information and a quick reference to all of Speclj's components, check out our <a href=\"/docs\">documentation</a> page."]