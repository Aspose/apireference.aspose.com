---
title: "System::DateTimeOffset::TryParse मेथड"
linktitle: "TryParse"
second_title: "Aspose.Page C++ के लिए"
description: "System::DateTimeOffset::TryParse मेथड। C++ में निर्दिष्ट फ़ॉर्मेट प्रदाता और फ़ॉर्मेटिंग शैली का उपयोग करके निर्दिष्ट स्ट्रिंग को DateTimeOffset ऑब्जेक्ट में परिवर्तित करने का प्रयास करता है।"
type: docs
weight: 5700
url: /hi/cpp/system/datetimeoffset/tryparse/
---
## DateTimeOffset::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


निर्दिष्ट फ़ॉर्मेट प्रदाता और फ़ॉर्मेटिंग शैली का उपयोग करके निर्दिष्ट स्ट्रिंग को [DateTimeOffset](../) ऑब्जेक्ट में परिवर्तित करने का प्रयास करता है।

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const String\& | [String](../../string/) को परिवर्तित करने के लिए। |
| प्रदाता | const SharedPtr\<IFormatProvider\>\& | फ़ॉर्मैट प्रोवाइडर। |
| शैलियाँ | Globalization::DateTimeStyles | तारीख और समय स्वरूपण शैलियाँ। |
| result | DateTimeOffset\& | [DateTimeOffset](../) जो **input** के बराबर है। |

### ReturnValue

यदि **input** सफलतापूर्वक परिवर्तित हो गया तो true, अन्यथा - false।

## संबंधित देखें

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::TryParse(const String\&, DateTimeOffset\&) method


निर्दिष्ट स्ट्रिंग को [DateTimeOffset](../) ऑब्जेक्ट में परिवर्तित करने का प्रयास करता है।

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, DateTimeOffset &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const String\& | [String](../../string/) को परिवर्तित करने के लिए। |
| result | DateTimeOffset\& | [DateTimeOffset](../) जो **input** के बराबर है। |

### ReturnValue

यदि **input** सफलतापूर्वक परिवर्तित हो गया तो true, अन्यथा - false।

## संबंधित देखें

* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
