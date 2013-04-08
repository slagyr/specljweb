[:h3 [:a {:name "ch2"} "Running Your 1st Test"]]
[:p "If you open up your core_spec.clj file, we can begin to write our tests. First lets type the code from <a href=\"#f4\">Figure 4</a> into our core_spec.clj file."]

[:h5 [:a {:name "f4"} "Figure 4"]]
[:p "<pre class=\"textmate-source twilight\"><span class=\"source source_clojure\"><span class=\"meta meta_function meta_function_namespace meta_function_namespace_clojure\">(<span class=\"support support_function support_function_namespace support_function_namespace_clojure\">ns</span> <span class=\"entity entity_name entity_name_namespace entity_name_namespace_clojure\"><span class=\"source source_symbol source_symbol_clojure\">change-counter</span><span class=\"keyword keyword_operator keyword_operator_classpath keyword_operator_classpath_clojure\">.</span><span class=\"source source_symbol source_symbol_clojure\">core-spec</span></span>
  (<span class=\"support support_other support_other_keyword support_other_keyword_namespace support_other_keyword_namespace_clojure\">:use</span> [<span class=\"source source_symbol source_symbol_clojure\">speclj</span><span class=\"keyword keyword_operator keyword_operator_classpath keyword_operator_classpath_clojure\">.</span><span class=\"source source_symbol source_symbol_clojure\">core</span>]))</span>

<span class=\"meta meta_function meta_function_clojure\">(<span class=\"storage storage_type storage_type_function storage_type_function_type storage_type_function_type_clojure\">defn</span> <span class=\"entity entity_name entity_name_function entity_name_function_clojure\"><span class=\"source source_symbol source_symbol_clojure\">true-or-false</span></span> <span class=\"meta meta_function meta_function_body meta_function_body_clojure\"><span class=\"meta meta_function meta_function_parameters meta_function_parameters_vector meta_function_parameters_vector_clojure\"><span class=\"punctuation punctuation_definition punctuation_definition_vector punctuation_definition_vector_begin punctuation_definition_vector_begin_clojure\">[</span><span class=\"punctuation punctuation_definition punctuation_definition_vector punctuation_definition_vector_end punctuation_definition_vector_end_clojure\">]</span></span><span class=\"meta meta_function meta_function_body meta_function_body_code meta_function_body_code_clojure\">
  <span class=\"constant constant_language constant_language_clojure\">true</span></span></span>)</span>

<span class=\"meta meta_sexpr meta_sexpr_clojure\">(<span class=\"source source_symbol source_symbol_clojure\">describe</span> <span class=\"string string_quoted string_quoted_double string_quoted_double_clojure\"><span class=\"punctuation punctuation_definition punctuation_definition_string punctuation_definition_string_begin punctuation_definition_string_begin_clojure\">\"</span>truthiness<span class=\"punctuation punctuation_definition punctuation_definition_string punctuation_definition_string_end punctuation_definition_string_end_clojure\">\"</span></span>
  <span class=\"meta meta_sexpr meta_sexpr_clojure\">(<span class=\"source source_symbol source_symbol_clojure\">it</span> <span class=\"string string_quoted string_quoted_double string_quoted_double_clojure\"><span class=\"punctuation punctuation_definition punctuation_definition_string punctuation_definition_string_begin punctuation_definition_string_begin_clojure\">\"</span>tests if true-or-false returns true<span class=\"punctuation punctuation_definition punctuation_definition_string punctuation_definition_string_end punctuation_definition_string_end_clojure\">\"</span></span>
    <span class=\"meta meta_sexpr meta_sexpr_clojure\">(<span class=\"source source_symbol source_symbol_clojure\">should</span> <span class=\"meta meta_sexpr meta_sexpr_clojure\">(<span class=\"source source_symbol source_symbol_clojure\">true-or-false</span>)</span>)</span>)</span>)</span>

<span class=\"meta meta_sexpr meta_sexpr_clojure\">(<span class=\"source source_symbol source_symbol_clojure\">run-specs</span>)</span></span></pre>"]

[:p "So what does this code do? The first two lines set the namespace to be change-counter.core-spec and also gets all of the functions defined in the speclj.core namespace. From speclj.core we are using describe, it, should, and run-specs."]

[:p "The describe function wraps related tests. In this example we are testing the truthiness of functions, so we labeled our describe component truthiness. Technically you can label the describe component with any string. However it is helpful to other developers if you label your describe component based on what is being tested. The same can be said for the it component. If we really wanted we could label the it component as follows:"]

[:p "<pre class=\"textmate-source twilight\"><span class=\"source source_clojure\"><span class=\"meta meta_sexpr meta_sexpr_clojure\">(<span class=\"source source_symbol source_symbol_clojure\">it</span> <span class=\"constant constant_language constant_language_clojure\">false</span>
  <span class=\"meta meta_sexpr meta_sexpr_clojure\">(<span class=\"source source_symbol source_symbol_clojure\">should</span> <span class=\"constant constant_language constant_language_clojure\">true</span>)</span>)</span></span></pre>"]


[:p "The test above will have a label of "false" and pass because the should method receives the value of true. Doing this would be of no help to other developers because the string "false" tells us nothing about the test code within the it component."]

[:p "Referring back to <a href=\"#f4\">Figure 4</a>, you can see that our it component was labeled \"tests if true-or-false returns true.\" That should clue in the reader that the test will pass if a call to the method true-or-false resolves in a value of true. As you can see from our declaration of that method a couple lines above our test, it returns true. So what does that tell us about Speclj's should method? If should is passed the value of true the test passes, while if should is passed the value of false, the test fails."]

[:p "So let's put this code to the test and see if everything is working as we expect it to. To run the test we created, run the following command from your terminal within your project's directory:"]

[:code "lein spec"]

[:span {:id "lesson_nav"} [:a {:href "/tutorial/step1"} "<-- Getting Started"] "&nbsp;&nbsp;|&nbsp;&nbsp;" [:a {:href "/tutorial/step3"} "The Basics -->"]]
