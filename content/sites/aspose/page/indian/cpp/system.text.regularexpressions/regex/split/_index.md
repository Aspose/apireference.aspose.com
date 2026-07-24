---
title: "System::Text::RegularExpressions::Regex::Split मेथड"
linktitle: "स्प्लिट"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::RegularExpressions::Regex::Split मेथड। C++ में रेगेक्स मैचों द्वारा स्ट्रिंग को विभाजित करता है।"
type: docs
weight: 900
url: /hi/cpp/system.text.regularexpressions/regex/split/
---
## Regex::Split(const String\&) method


स्ट्रिंग को रेजेक्स मिलानों द्वारा विभाजित करता है।

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const String\& | [स्ट्रिंग](../../../system/string/) को विभाजित करने के लिए। |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int) method


स्ट्रिंग को रेजेक्स मिलानों द्वारा विभाजित करता है।

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const String\& | [स्ट्रिंग](../../../system/string/) को विभाजित करने के लिए। |
| count | int | उपस्ट्रिंग्स की संख्या सीमा। |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int, int) method


इनपुट स्ट्रिंग को निर्दिष्ट अधिकतम बार उपस्ट्रिंग्स की एक एरे में विभाजित करता है, उन स्थितियों पर जो [Regex](../) कंस्ट्रक्टर में निर्दिष्ट नियमित अभिव्यक्ति द्वारा परिभाषित होती हैं। नियमित अभिव्यक्ति पैटर्न की खोज इनपुट स्ट्रिंग में निर्दिष्ट अक्षर स्थिति से शुरू होती है।

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count, int startat)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const String\& | विभाजित की जाने वाली स्ट्रिंग। |
| count | int | विभाजन के होने की अधिकतम संख्या। |
| startat | int | इनपुट स्ट्रिंग में वह अक्षर स्थिति जहाँ खोज शुरू होगी। |

### ReturnValue

स्ट्रिंग्स की एक एरे।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, int, RegexOptions, TimeSpan) method


स्ट्रिंग को रेगएक्सप्र द्वारा विभाजित करता है।

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, int count, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const String\& | इनपुट स्ट्रिंग। |
| पैटर्न | const String\& | Regexp पैटर्न। |
| count | int | [Match](../../match/) संख्या सीमा। |
| विकल्प | RegexOptions | मिलान विकल्प। |
| matchTimeout | TimeSpan | टाइमआउट। |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, RegexOptions, TimeSpan) method


स्ट्रिंग को रेगएक्सप्र द्वारा विभाजित करता है।

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const String\& | इनपुट स्ट्रिंग। |
| पैटर्न | const String\& | Regexp पैटर्न। |
| विकल्प | RegexOptions | मिलान विकल्प। |
| matchTimeout | TimeSpan | टाइमआउट। |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
