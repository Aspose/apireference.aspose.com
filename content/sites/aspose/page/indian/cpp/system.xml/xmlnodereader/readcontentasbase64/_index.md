---
title: "System::Xml::XmlNodeReader::ReadContentAsBase64 method"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNodeReader::ReadContentAsBase64 method. यह सामग्री को पढ़ता है और C++ में Base64 डिकोड किए गए बाइनरी बाइट्स लौटाता है।"
type: docs
weight: 3200
url: /hi/cpp/system.xml/xmlnodereader/readcontentasbase64/
---
## XmlNodeReader::ReadContentAsBase64 method


सामग्री को पढ़ता है और Base64 डिकोड किए गए बाइनरी बाइट्स लौटाता है।

```cpp
int32_t System::Xml::XmlNodeReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | ArrayPtr\<uint8_t\> | वह बफ़र जिसमें परिणामी पाठ को कॉपी किया जाना है। यह मान **nullptr** नहीं हो सकता। |
| सूचकांक | int32_t | बफ़र में वह ऑफ़सेट जहाँ से परिणाम की कॉपी शुरू की जानी है। |
| count | int32_t | बफ़र में कॉपी करने के लिए अधिकतम बाइट्स की संख्या। वास्तविक कॉपी की गई बाइट्स की संख्या इस मेथड से लौटाई जाती है। |

### ReturnValue

बफ़र में लिखी गई बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
