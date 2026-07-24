---
title: "System::Text::RegularExpressions::Regex::IsMatch विधि"
linktitle: "IsMatch"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::RegularExpressions::Regex::IsMatch विधि। C++ में स्ट्रिंग के विरुद्ध रेगेक्स मिलाता है।"
type: docs
weight: 500
url: /hi/cpp/system.text.regularexpressions/regex/ismatch/
---
## Regex::IsMatch(const String\&, int) method


रेजेक्स को स्ट्रिंग के विरुद्ध मिलाता है।

```cpp
bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, int startat=0)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const String\& | लक्ष्य स्ट्रिंग। |
| startat | int | प्रारंभिक इंडेक्स। |

### ReturnValue

यदि स्ट्रिंग रेगेक्स से मेल खाती है तो सत्य, अन्यथा असत्य।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::IsMatch(const String\&, const String\&, RegexOptions, TimeSpan, int) method


जाँचता है कि स्ट्रिंग पैटर्न से मेल खाती है या नहीं।

```cpp
static bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const String\& | इनपुट स्ट्रिंग। |
| पैटर्न | const String\& | Regexp पैटर्न। |
| विकल्प | RegexOptions | मिलान विकल्प। |
| matchTimeout | TimeSpan | टाइमआउट। |
| startat | int | [मैच](../../match/) प्रारम्भिक स्थिति। |

### ReturnValue

यदि मैच पाया जाता है तो सत्य, अन्यथा असत्य।

## संबंधित देखें

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
