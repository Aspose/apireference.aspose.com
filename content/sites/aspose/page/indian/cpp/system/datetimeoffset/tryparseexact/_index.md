---
title: "System::DateTimeOffset::TryParseExact मेथड"
linktitle: "TryParseExact"
second_title: "Aspose.Page C++ के लिए"
description: "System::DateTimeOffset::TryParseExact मेथड। निर्दिष्ट स्ट्रिंग को निर्दिष्ट फ़ॉर्मेट, फ़ॉर्मेट प्रोवाइडर और फ़ॉर्मेटिंग स्टाइल का उपयोग करके C++ में DateTimeOffset ऑब्जेक्ट में परिवर्तित करने का प्रयास करता है।"
type: docs
weight: 5800
url: /hi/cpp/system/datetimeoffset/tryparseexact/
---
## DateTimeOffset::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


निर्दिष्ट स्ट्रिंग को निर्दिष्ट फ़ॉर्मेट, फ़ॉर्मेट प्रोवाइडर और फ़ॉर्मेटिंग स्टाइल का उपयोग करके [DateTimeOffset](../) ऑब्जेक्ट में परिवर्तित करने का प्रयास करता है।

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const String\& | [String](../../string/) को परिवर्तित करने के लिए। |
| फ़ॉर्मेट्स | const ArrayPtr\<String\>\& | फ़ॉर्मेट स्ट्रिंग्स की एरेज़। |
| प्रदाता | const SharedPtr\<IFormatProvider\>\& | फ़ॉर्मैट प्रोवाइडर। |
| शैलियाँ | Globalization::DateTimeStyles | तारीख और समय स्वरूपण शैलियाँ। |
| result | DateTimeOffset\& | [DateTimeOffset](../) जो **input** के बराबर है। |

### ReturnValue

यदि **input** सफलतापूर्वक परिवर्तित हो गया तो true, अन्यथा - false।

## संबंधित देखें

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


निर्दिष्ट स्ट्रिंग को निर्दिष्ट फ़ॉर्मेट, फ़ॉर्मेट प्रोवाइडर और फ़ॉर्मेटिंग स्टाइल का उपयोग करके [DateTimeOffset](../) ऑब्जेक्ट में परिवर्तित करने का प्रयास करता है।

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const String\& | [String](../../string/) को परिवर्तित करने के लिए। |
| फ़ॉर्मेट | const String\& | फ़ॉर्मेट स्ट्रिंग। |
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
