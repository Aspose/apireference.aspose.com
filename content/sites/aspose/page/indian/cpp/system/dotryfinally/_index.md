---
title: "System::DoTryFinally मेथड"
linktitle: "DoTryFinally"
second_title: "Aspose.Page C++ के लिए"
description: "System::DoTryFinally मेथड। वह एकल फ़ंक्शन जो C#''s try[-catch]-finally स्टेटमेंट के व्यवहार की नकल करता है। जब C#''s try[-catch]-finally स्टेटमेंट का अनुवाद translator''s option finally_statement_as_lambda को true पर सेट किया जाता है, तो यह स्टेटमेंट C++ में इस मेथड के कॉल में अनुवादित होता है।"
type: docs
weight: 16500
url: /hi/cpp/system/dotryfinally/
---
## System::DoTryFinally(T\&&, F\&&) method


वह एकल फ़ंक्शन जो C#'s try[-catch]-finally स्टेटमेंट के व्यवहार की नकल करता है। जब C#'s try[-catch]-finally स्टेटमेंट का अनुवाद translator's option finally_statement_as_lambda को true पर सेट किया जाता है, तो यह स्टेटमेंट इस मेथड के कॉल में अनुवादित होता है।

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_void<T>::value> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | इम्यूलेट किए जा रहे try[-catch]-finally स्टेटमेंट के try[-catch] भाग को लागू करने वाले फ़ंक्शन ऑब्जेक्ट का प्रकार। |
| F | इम्यूलेट किए जा रहे try[-catch]-finally स्टेटमेंट के finally भाग को लागू करने वाले फ़ंक्शन ऑब्जेक्ट का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| tryBlock | T\&& | इम्यूलेट किए जा रहे try[-catch]-finally स्टेटमेंट के try[-catch] भाग की कार्यान्वयन को शामिल करने वाला फ़ंक्शन ऑब्जेक्ट। |
| finallyBlock | F\&& | इम्यूलेट किए जा रहे try[-catch]-finally स्टेटमेंट के finally भाग की कार्यान्वयन को शामिल करने वाला फ़ंक्शन ऑब्जेक्ट। |

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


वह एकल फ़ंक्शन जो C#'s try[-catch]-finally स्टेटमेंट के व्यवहार की नकल करता है। जब C#'s try[-catch]-finally स्टेटमेंट का अनुवाद translator's option finally_statement_as_lambda को true पर सेट किया जाता है, तो यह स्टेटमेंट इस मेथड के कॉल में अनुवादित होता है। यह ओवरलोड उस स्थिति को संभालता है जहाँ try[-catch]-finally स्टेटमेंट के try[-catch] भाग को लागू करने वाले फ़ंक्शन ऑब्जेक्ट का रिटर्न वैल्यू बूलियन (bool) होता है।

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_boolref<T>::value, bool> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | इम्यूलेट किए जा रहे try[-catch]-finally स्टेटमेंट के try[-catch] भाग को लागू करने वाले फ़ंक्शन ऑब्जेक्ट का प्रकार। |
| F | इम्यूलेट किए जा रहे try[-catch]-finally स्टेटमेंट के finally भाग को लागू करने वाले फ़ंक्शन ऑब्जेक्ट का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| tryBlock | T\&& | इम्यूलेट किए जा रहे try[-catch]-finally स्टेटमेंट के try[-catch] भाग की कार्यान्वयन को शामिल करने वाला फ़ंक्शन ऑब्जेक्ट। |
| finallyBlock | F\&& | इम्यूलेट किए जा रहे try[-catch]-finally स्टेटमेंट के finally भाग की कार्यान्वयन को शामिल करने वाला फ़ंक्शन ऑब्जेक्ट। |

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


The sigle function that emulates behavior of C#'s try[-catch]-finally statement. During translation of C#'s try[-catch]-finally statement with translator's option finally_statement_as_lambda set to true, the statement is translated into the invocation of this method. This overload handles the case in which the return value of the function object that implements the try[-catch] part of the try[-catch]-finally statement is bool&.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_nonovoid_boolref<T>::value, std::optional<Details::ResultOf<T, bool &>>> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | इम्यूलेट किए जा रहे try[-catch]-finally स्टेटमेंट के try[-catch] भाग को लागू करने वाले फ़ंक्शन ऑब्जेक्ट का प्रकार। |
| F | इम्यूलेट किए जा रहे try[-catch]-finally स्टेटमेंट के finally भाग को लागू करने वाले फ़ंक्शन ऑब्जेक्ट का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| tryBlock | T\&& | इम्यूलेट किए जा रहे try[-catch]-finally स्टेटमेंट के try[-catch] भाग की कार्यान्वयन को शामिल करने वाला फ़ंक्शन ऑब्जेक्ट। |
| finallyBlock | F\&& | इम्यूलेट किए जा रहे try[-catch]-finally स्टेटमेंट के finally भाग की कार्यान्वयन को शामिल करने वाला फ़ंक्शन ऑब्जेक्ट। |

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
