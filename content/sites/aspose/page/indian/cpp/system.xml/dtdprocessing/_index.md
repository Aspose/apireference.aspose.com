---
title: "System::Xml::DtdProcessing enum"
linktitle: "DtdProcessing"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::DtdProcessing enum। DTDs को प्रोसेस करने के विकल्प निर्दिष्ट करता है। DtdProcessing एन्यूमरेशन C++ में XmlReaderSettings क्लास द्वारा उपयोग किया जाता है।"
type: docs
weight: 4700
url: /hi/cpp/system.xml/dtdprocessing/
---
## DtdProcessing enum


DTD प्रोसेसिंग के विकल्प निर्दिष्ट करता है। [DtdProcessing](./) एन्यूमरेशन को [XmlReaderSettings](../xmlreadersettings/) क्लास द्वारा उपयोग किया जाता है।

```cpp
enum class DtdProcessing
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| Prohibit | 0 | निर्दिष्ट करता है कि जब DTD मिलता है, तो एक [XmlException](../xmlexception/) फेंका जाता है जिसमें यह संदेश होता है कि DTDs प्रतिबंधित हैं। यह डिफ़ॉल्ट व्यवहार है। |
| Ignore | 1 | DOCTYPE तत्व को अनदेखा कर देता है। कोई DTD प्रोसेसिंग नहीं होती, और DTD/DOCTYPE आउटपुट में खो जाता है। |
| Parse | 2 | DTD को पार्स करने के लिए उपयोग किया जाता है। |

## संबंधित देखें

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
