---
title: "System::Text::RegularExpressions::Regex::Match method"
linktitle: "Match"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::RegularExpressions::Regex::Match method. C++ में स्ट्रिंग के विरुद्ध regex से मेल खाता है।"
type: docs
weight: 600
url: /hi/cpp/system.text.regularexpressions/regex/match/
---
## Regex::Match(const String\&) method


रेजेक्स को स्ट्रिंग के विरुद्ध मिलाता है।

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const String\& | लक्ष्य स्ट्रिंग। |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## संबंधित देखें

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Match(const String\&, int, int) method


रेजेक्स को स्ट्रिंग के विरुद्ध मिलाता है।

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, int startat, int length=0)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const String\& | लक्ष्य स्ट्रिंग। |
| startat | int | प्रारंभिक इंडेक्स। |
| length | int | देखने के लिए अक्षरों की संख्या (पूरी स्ट्रिंग देखने के लिए 0)। |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## संबंधित देखें

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Match(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


स्ट्रिंग और पैटर्न को मिलाता है।

```cpp
static MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const String\& | इनपुट स्ट्रिंग। |
| पैटर्न | const String\& | Regexp पैटर्न। |
| विकल्प | RegexOptions | मिलान विकल्प। |
| matchTimeout | TimeSpan | टाइमआउट। |
| startat | int | [मैच](../../match/) प्रारम्भिक स्थिति। |
| length | int | देखने के लिए अक्षरों की संख्या (0 सीमा को अक्षम करता है)। |

### ReturnValue

पहला मिलान मिला।

## संबंधित देखें

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
