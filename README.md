# TelegraphChallenge
For api calls, I chose to use retrofit since you can attach json parsers like gson and coroutine adapters easily. I chose to use kotlin coroutines instead of rxJava, since I did not really have a need for any of the rxJava operators, and I like the sequential, direct style associated with coroutines. In terms of Architectural Patterns, I chose to follow MVVM with the Architecture components, since the architecture components are lifecycle aware, and the viewModel made it easy to support orientation changes. 
