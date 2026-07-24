---
title: "System::IO::File::ReadAllLines मेथड"
linktitle: "ReadAllLines"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::File::ReadAllLines मेथड. निर्दिष्ट टेक्स्ट फ़ाइल की सामग्री को लाइन दर लाइन पढ़कर, निर्दिष्ट कैरेक्टर एन्कोडिंग का उपयोग करके, C++ में स्ट्रिंग्स की एक एरे में रखता है।"
type: docs
weight: 2400
url: /hi/cpp/system.io/file/readalllines/
---
## File::ReadAllLines method


निर्दिष्ट अक्षर एन्कोडिंग का उपयोग करके, निर्दिष्ट पाठ फ़ाइल की सामग्री को पंक्ति दर पंक्ति स्ट्रिंग्स की ऐरे में पढ़ता है।

```cpp
static ArrayPtr<String> System::IO::File::ReadAllLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | पढ़ने के लिए फ़ाइल का पथ |
| encoding | const EncodingPtr\& | उपयोग करने के लिए कैरेक्टर एन्कोडिंग |

### ReturnValue

एक स्ट्रिंग एरे, जिसका प्रत्येक तत्व निर्दिष्ट फ़ाइल की एकल पंक्ति का प्रतिनिधित्व करता है

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
