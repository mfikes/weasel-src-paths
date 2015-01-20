# weasel-src-paths

This is a small repository making it easy to reproduce a [problem](https://github.com/tomjakubowski/weasel/issues/28) with Weasel in the case of multiple source path roots.

## Usage

First, in the project directory start up a REPL
```
lein repl
```
and then
```
user=> (simple-brepl)

ExceptionInfo No such namespace: bar.baz at line 1 /Users/mfikes/Documents/Projects/weasel-src-paths/src/weasel_src_paths/core.cljs  clojure.core/ex-info (core.clj:4403)
```

## License

Copyright © 2015 Mike Fikes

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
