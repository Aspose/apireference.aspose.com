---
title: "System::IO::BinaryWriter::BinaryWriter कंस्ट्रक्टर"
linktitle: "BinaryWriter"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::BinaryWriter::BinaryWriter कंस्ट्रक्टर। C++ में निर्दिष्ट एन्कोडिंग का उपयोग करके निर्दिष्ट स्ट्रीम में डेटा लिखने वाले BinaryWriter क्लास का एक इंस्टेंस बनाता है।"
type: docs
weight: 100
url: /hi/cpp/system.io/binarywriter/binarywriter/
---
## BinaryWriter::BinaryWriter constructor


निर्दिष्ट एन्कोडिंग का उपयोग करके निर्दिष्ट स्ट्रीम में डेटा लिखने वाले [BinaryWriter](../) क्लास का एक इंस्टेंस बनाता है।

```cpp
System::IO::BinaryWriter::BinaryWriter(const StreamPtr &stream, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked(), bool leaveopen=false)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | const StreamPtr\& | आउटपुट स्ट्रीम |
| encoding | const EncodingPtr\& | उपयोग करने के लिए एन्कोडिंग |
| leaveopen | bool | निर्दिष्ट करता है कि क्या स्ट्रीम **stream** को वर्तमान ऑब्जेक्ट के डिस्पोज़ होने के बाद (true) खुला छोड़ना चाहिए या नहीं (false)। |

## संबंधित देखें

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
