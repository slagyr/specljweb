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
[:span {:id "lesson_nav"} [:a {:href "/tutorial/step6"} "Previous Step"]]