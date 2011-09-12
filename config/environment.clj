(use 'joodo.env)

(def environment {
  :joodo.core.namespace "speclj_www.core"
  ; environment settings go here
  })

(swap! *env* merge environment)