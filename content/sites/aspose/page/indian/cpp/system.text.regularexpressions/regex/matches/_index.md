---
title: "System::Text::RegularExpressions::Regex::Matches मेथड"
linktitle: "मैच"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::RegularExpressions::Regex::Matches मेथड। C++ में बार‑बार मिलान करके दी गई स्ट्रिंग में रेगेक्स के सभी मैच प्राप्त करता है।"
type: docs
weight: 700
url: /hi/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


दिए गए स्ट्रिंग में रेजेक्स के सभी मैचों को बार‑बार मिलाकर प्राप्त करता है।

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const String\& | इनपुट स्ट्रिंग। |
| startat | int | मिलान शुरू करने के लिए इंडेक्स। |

### ReturnValue

पाए गए सभी मैचों का संग्रह।

## संबंधित देखें

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


स्ट्रिंग और पैटर्न के बीच सभी मैच प्राप्त करता है।

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
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

बार‑बार मिलान करके पाए गए सभी मैच।

## संबंधित देखें

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
