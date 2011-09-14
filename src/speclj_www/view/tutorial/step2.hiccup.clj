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

[:span {:id "lesson_nav"} [:a {:href "/tutorial/step1"} "Previous Step"] "&nbsp;&nbsp;|&nbsp;&nbsp;" [:a {:href "/tutorial/step3"} "Next Step"]]