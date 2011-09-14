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

[:span {:id "lesson_nav"} [:a {:href "/tutorial/step2"} "Next Step"]]