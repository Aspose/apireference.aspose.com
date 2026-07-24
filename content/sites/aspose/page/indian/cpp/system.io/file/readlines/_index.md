---
title: "System::IO::File::ReadLines मेथड"
linktitle: "ReadLines"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::File::ReadLines मेथड। निर्दिष्ट टेक्स्ट फ़ाइल की सामग्री को निर्दिष्ट कैरेक्टर एन्कोडिंग का उपयोग करके पंक्ति दर पंक्ति पढ़ता है और C++ में स्ट्रिंग्स का एक एन्यूमेरेबल संग्रह लौटाता है, जहाँ प्रत्येक स्ट्रिंग फ़ाइल की सामग्री की एकल पंक्ति का प्रतिनिधित्व करती है।"
type: docs
weight: 2600
url: /hi/cpp/system.io/file/readlines/
---
## File::ReadLines method


निर्दिष्ट अक्षर एन्कोडिंग का उपयोग करके, निर्दिष्ट पाठ फ़ाइल की सामग्री को पंक्ति दर पंक्ति पढ़ता है और स्ट्रिंग्स का एक enumerable संग्रह लौटाता है, जिसमें प्रत्येक फ़ाइल की सामग्री की एकल पंक्ति का प्रतिनिधित्व करता है।

```cpp
static SharedPtr<Collections::Generic::IEnumerable<String>> System::IO::File::ReadLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | पढ़ने के लिए फ़ाइल का पथ |
| encoding | const EncodingPtr\& | उपयोग करने के लिए कैरेक्टर एन्कोडिंग |

### ReturnValue

निर्दिष्ट फ़ाइल की सामग्री को दर्शाने वाली स्ट्रिंग्स का एक गणनीय संग्रह

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
