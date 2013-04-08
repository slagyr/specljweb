[:h3 [:a {:name "ch1"} "Getting Started"]]
[:p "This tutorial will teach you Speclj by using it as we build a sample application that counts your change and converts it into dollars. Before we dive in, let's go over how to configure Speclj on your system."]

[:p "Speclj is a plugin for Leiningen. Leiningen is an application that does a lot of useful tasks for people working on Clojure projects. So in order to use Speclj, you need to have Leiningen installed on your system. Instructions on installing Leiningen can be found on their <a href=\"https://github.com/technomancy/leiningen/blob/master/README.md\">README</a> file."]

[:p "Next you need to create a new Clojure project that uses Speclj. The simplest way to do this is to run the following command:"]

[:code "lein new speclj change-counter"]

[:p "You can open the files at `src/change_counter/core.clj` and `spec/change_counter/core_spec.clj` and remove the contents. We will be creating the code for these files in the following steps. You can now continue to Step 2."]

[:h4 "Create a Speclj project step-by-step"]

[:p "Alternatively, you could create the Speclj project manually by doing the following:"]

[:code "lein new change-counter"]


[:p "What did we just do? We told Leiningen to create a new clojure project called change-counter in the directory that we are currently in. As you can see, a lot of new files and directories were just created. To use Speclj, we need to make some minor adjustments to the standard directory structure. <a href=\"#f1\">Figure 1</a> shows the default directory structure that Leiningen creates, and <a href=\"#f2\">Figure 2</a> shows the directory structure that Speclj requires."]

[:div {:id "float_pic1"}
  [:h5 [:a {:name "f1"} "Figure 1"]]
  [:img {:src "/images/figure1.png"}]]

[:div {:id "float_pic2"}
  [:h5 [:a {:name "f2"} "Figure 2"]]
  [:img {:src "/images/figure2.png"}]]

[:p "Once you make the required changes to your project's directory, we are ready to install Speclj. If you have reviewed our <a href=\"/install\">Installation</a> page, you would know that there are two ways we could do this. For this tutorial project, we will install using Leiningen. To do this we need to edit our project.clj file. <a href=\"#f3\">Figure 3</a> shows what our project.clj file will look like after we make the changes outlined by the Installation page."]

[:h5 [:a {:name "f3"} "Figure 3"]]
[:p "<pre class=\"textmate-source twilight\"><span class=\"source source_clojure\"><span class=\"meta meta_sexpr meta_sexpr_clojure\">(<span class=\"support support_function support_function_match support_function_match_clojure\">defproject</span> <span class=\"source source_symbol source_symbol_clojure\">change-counter</span> <span class=\"string string_quoted string_quoted_double string_quoted_double_clojure\"><span class=\"punctuation punctuation_definition punctuation_definition_string punctuation_definition_string_begin punctuation_definition_string_begin_clojure\">\"</span>1.0.0-SNAPSHOT<span class=\"punctuation punctuation_definition punctuation_definition_string punctuation_definition_string_end punctuation_definition_string_end_clojure\">\"</span></span>
  <span class=\"constant constant_string constant_string_symbole constant_string_symbole_clojure\"><span class=\"keyword keyword_operator keyword_operator_symbole keyword_operator_symbole_clojure\">:</span><span class=\"source source_symbol source_symbol_clojure\">description</span></span> <span class=\"string string_quoted string_quoted_double string_quoted_double_clojure\"><span class=\"punctuation punctuation_definition punctuation_definition_string punctuation_definition_string_begin punctuation_definition_string_begin_clojure\">\"</span>Adds together your spare change<span class=\"punctuation punctuation_definition punctuation_definition_string punctuation_definition_string_end punctuation_definition_string_end_clojure\">\"</span></span>
  <span class=\"constant constant_string constant_string_symbole constant_string_symbole_clojure\"><span class=\"keyword keyword_operator keyword_operator_symbole keyword_operator_symbole_clojure\">:</span><span class=\"source source_symbol source_symbol_clojure\">dependencies</span></span> <span class=\"meta meta_expression meta_expression_vector meta_expression_vector_clojure\"><span class=\"punctuation punctuation_definition punctuation_definition_vector punctuation_definition_vector_begin punctuation_definition_vector_begin_clojure\">[</span><span class=\"meta meta_expression meta_expression_vector meta_expression_vector_clojure\"><span class=\"punctuation punctuation_definition punctuation_definition_vector punctuation_definition_vector_begin punctuation_definition_vector_begin_clojure\">[</span><span class=\"source source_symbol source_symbol_clojure\">org</span><span class=\"keyword keyword_operator keyword_operator_classpath keyword_operator_classpath_clojure\">.</span><span class=\"source source_symbol source_symbol_clojure\">clojure</span><span class=\"keyword keyword_operator keyword_operator_qualified keyword_operator_qualified_clojure\">/</span><span class=\"source source_symbol source_symbol_clojure\">clojure</span> <span class=\"string string_quoted string_quoted_double string_quoted_double_clojure\"><span class=\"punctuation punctuation_definition punctuation_definition_string punctuation_definition_string_begin punctuation_definition_string_begin_clojure\">\"</span>1.5.1<span class=\"punctuation punctuation_definition punctuation_definition_string punctuation_definition_string_end punctuation_definition_string_end_clojure\">\"</span></span><span class=\"punctuation punctuation_definition punctuation_definition_vector punctuation_definition_vector_end punctuation_definition_vector_end_clojure\">]</span></span><span class=\"punctuation punctuation_definition punctuation_definition_vector punctuation_definition_vector_end punctuation_definition_vector_end_clojure\">]</span></span>
  <span class=\"constant constant_string constant_string_symbole constant_string_symbole_clojure\"><span class=\"keyword keyword_operator keyword_operator_symbole keyword_operator_symbole_clojure\">:</span><span class=\"source source_symbol source_symbol_clojure\">dev-dependencies</span></span> <span class=\"meta meta_expression meta_expression_vector meta_expression_vector_clojure\"><span class=\"punctuation punctuation_definition punctuation_definition_vector punctuation_definition_vector_begin punctuation_definition_vector_begin_clojure\">[</span><span class=\"meta meta_expression meta_expression_vector meta_expression_vector_clojure\"><span class=\"punctuation punctuation_definition punctuation_definition_vector punctuation_definition_vector_begin punctuation_definition_vector_begin_clojure\">[</span><span class=\"source source_symbol source_symbol_clojure\">speclj</span> <span class=\"string string_quoted string_quoted_double string_quoted_double_clojure\"><span class=\"punctuation punctuation_definition punctuation_definition_string punctuation_definition_string_begin punctuation_definition_string_begin_clojure\">\"</span>2.5.0<span class=\"punctuation punctuation_definition punctuation_definition_string punctuation_definition_string_end punctuation_definition_string_end_clojure\">\"</span></span><span class=\"punctuation punctuation_definition punctuation_definition_vector punctuation_definition_vector_end punctuation_definition_vector_end_clojure\">]</span></span><span class=\"punctuation punctuation_definition punctuation_definition_vector punctuation_definition_vector_end punctuation_definition_vector_end_clojure\">]</span></span>
  <span class=\"constant constant_string constant_string_symbole constant_string_symbole_clojure\"><span class=\"keyword keyword_operator keyword_operator_symbole keyword_operator_symbole_clojure\">:</span><span class=\"source source_symbol source_symbol_clojure\">test-path</span></span> <span class=\"string string_quoted string_quoted_double string_quoted_double_clojure\"><span class=\"punctuation punctuation_definition punctuation_definition_string punctuation_definition_string_begin punctuation_definition_string_begin_clojure\">\"</span>spec/<span class=\"punctuation punctuation_definition punctuation_definition_string punctuation_definition_string_end punctuation_definition_string_end_clojure\">\"</span></span>
  <span class=\"constant constant_string constant_string_symbole constant_string_symbole_clojure\"><span class=\"keyword keyword_operator keyword_operator_symbole keyword_operator_symbole_clojure\">:</span><span class=\"source source_symbol source_symbol_clojure\">main</span></span> <span class=\"source source_symbol source_symbol_clojure\">change-counter</span><span class=\"keyword keyword_operator keyword_operator_classpath keyword_operator_classpath_clojure\">.</span><span class=\"source source_symbol source_symbol_clojure\">core</span>
)</span></span></pre>"]

[:p "Once that is saved run the following command from your terminal within your project's directory:"]

[:code "lein deps"]


[:p "That command we just ran installed all the dependencies listed in our project's project.clj file. Since we listed speclj 2.5.0, it installed Speclj. Now we are ready to write our first test."]

[:span {:id "lesson_nav"} [:a {:href "/tutorial/step2"} "Running 1st Test -->"]]
