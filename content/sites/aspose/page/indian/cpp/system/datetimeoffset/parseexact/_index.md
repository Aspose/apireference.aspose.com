---
title: "System::DateTimeOffset::ParseExact मेथड"
linktitle: "ParseExact"
second_title: "Aspose.Page C++ के लिए"
description: "System::DateTimeOffset::ParseExact मेथड। C++ में निर्दिष्ट फ़ॉर्मैट, फ़ॉर्मैट प्रोवाइडर और फ़ॉर्मैटिंग स्टाइल का उपयोग करके निर्दिष्ट स्ट्रिंग को DateTimeOffset ऑब्जेक्ट में परिवर्तित करता है।"
type: docs
weight: 5600
url: /hi/cpp/system/datetimeoffset/parseexact/
---
## DateTimeOffset::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


निर्दिष्ट फ़ॉर्मैट, फ़ॉर्मैट प्रोवाइडर और फ़ॉर्मैटिंग स्टाइल का उपयोग करके निर्दिष्ट स्ट्रिंग को [DateTimeOffset](../) ऑब्जेक्ट में परिवर्तित करता है।

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const String\& | [String](../../string/) को परिवर्तित करने के लिए। |
| formats | const ArrayPtr\<String\>\& | [Array](../../array/) फ़ॉर्मैट स्ट्रिंग्स की एरे। |
| प्रदाता | const SharedPtr\<IFormatProvider\>\& | फ़ॉर्मैट प्रोवाइडर। |
| शैलियाँ | Globalization::DateTimeStyles | तारीख और समय स्वरूपण शैलियाँ। |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## संबंधित देखें

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


निर्दिष्ट स्ट्रिंग को निर्दिष्ट फ़ॉर्मेट, फ़ॉर्मेट प्रदाता और स्वरूपण शैली का उपयोग करके [DateTimeOffset](../) ऑब्जेक्ट में परिवर्तित करता है।

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const String\& | [String](../../string/) को परिवर्तित करने के लिए। |
| फ़ॉर्मेट | const String\& | फ़ॉर्मेट स्ट्रिंग। |
| प्रदाता | const SharedPtr\<IFormatProvider\>\& | फ़ॉर्मैट प्रोवाइडर। |
| शैलियाँ | Globalization::DateTimeStyles | तारीख और समय स्वरूपण शैलियाँ। |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## संबंधित देखें

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
