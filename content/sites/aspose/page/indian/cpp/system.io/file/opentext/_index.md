---
title: "System::IO::File::OpenText मेथड"
linktitle: "OpenText"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::File::OpenText मेथड. निर्दिष्ट मौजूदा फ़ाइल को UTF-8 एन्कोडिंग का उपयोग करके, बिना शेयरिंग के, C++ में टेक्स्ट पढ़ने के लिए खोलता है।"
type: docs
weight: 2100
url: /hi/cpp/system.io/file/opentext/
---
## File::OpenText method


UTF-8 एन्कोडिंग का उपयोग करके पाठ पढ़ने के लिए, बिना साझा किए, निर्दिष्ट मौजूदा फ़ाइल खोलता है।

```cpp
static StreamReaderPtr System::IO::File::OpenText(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | खोलने के लिए फ़ाइल का पथ |
| encoding | const EncodingPtr\& | उपयोग करने के लिए कैरेक्टर एन्कोडिंग |

### ReturnValue

खुले हुए फ़ाइल से जुड़े एक [StreamWriter](../../streamwriter/) ऑब्जेक्ट का एक साझा पॉइंटर

## संबंधित देखें

* Typedef [StreamReaderPtr](../../../system/streamreaderptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
