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
[:span {:id "lesson_nav"} [:a {:href "/tutorial/step3"} "Previous Step"] "&nbsp;&nbsp;|&nbsp;&nbsp;" [:a {:href "/tutorial/step5"} "Next Step"]]