[:h4 [:a {:name "ch3"} "Understanding the Basics"]]
[:p "Let's add some more code to understand how Speclj works. Let's type the code from <a href=\"#f5\">Figure 5</a> into our core_spec.clj file to get a deeper understanding of how Speclj components work."]

[:h5 [:a {:name "f5"} "Figure 5"]]
[:img {:src "/images/tutorial_figs/figure5.png"}]

[:p "If you run the tests, it becomes obvious what the before-all, after-all, before, and after components do. In the case of <a href=\"#f5\">Figure 5</a> they are being used trivially to display their functionality, however they are very useful when a lot of your tests require the same setup or teardown code."]

[:p "Another thing to notice from <a href=\"#f5\">Figure 5</a> is the difference between the should, should-not, and should= components. In the case of should and should-not, they get passed a value of true or false and pass or fail accordingly. However the should= component takes two arguments. The 1st argument represents the expected result of the 2nd argument. The 2nd argument is the value actually being tested."]
[:span {:id "lesson_nav"} [:a {:href "/tutorial/step2"} "Previous Step"] "&nbsp;&nbsp;|&nbsp;&nbsp;" [:a {:href "/tutorial/step4"} "Next Step"]]