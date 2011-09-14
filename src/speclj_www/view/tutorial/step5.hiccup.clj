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
[:span {:id "lesson_nav"} [:a {:href "/tutorial/step4"} "Previous Step"] "&nbsp;&nbsp;|&nbsp;&nbsp;" [:a {:href "/tutorial/step6"} "Next Step"]]