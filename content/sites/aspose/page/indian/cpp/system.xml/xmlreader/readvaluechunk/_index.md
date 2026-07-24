---
title: "System::Xml::XmlReader::ReadValueChunk मेथड"
linktitle: "ReadValueChunk"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::ReadValueChunk मेथड। C++ में XML दस्तावेज़ में एम्बेडेड बड़े टेक्स्ट स्ट्रीम को पढ़ता है।"
type: docs
weight: 7400
url: /hi/cpp/system.xml/xmlreader/readvaluechunk/
---
## XmlReader::ReadValueChunk method


XML दस्तावेज़ में एम्बेडेड बड़े टेक्स्ट स्ट्रीम को पढ़ता है।

```cpp
virtual int32_t System::Xml::XmlReader::ReadValueChunk(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | ArrayPtr\<char16_t\> | वह अक्षर एरे जो बफ़र के रूप में कार्य करता है, जिसमें टेक्स्ट सामग्री लिखी जाती है। यह मान **nullptr** नहीं हो सकता। |
| index | int32_t | बफ़र के भीतर वह ऑफ़सेट जहाँ से [XmlReader](../) परिणामों की कॉपी शुरू कर सकता है। |
| count | int32_t | बफ़र में कॉपी करने के लिए अधिकतम अक्षरों की संख्या। कॉपी किए गए वास्तविक अक्षरों की संख्या इस मेथड से लौटाई जाती है। |

### ReturnValue

बफ़र में पढ़े गए अक्षरों की संख्या। जब और कोई टेक्स्ट सामग्री नहीं रहती, तो शून्य मान लौटाया जाता है।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
