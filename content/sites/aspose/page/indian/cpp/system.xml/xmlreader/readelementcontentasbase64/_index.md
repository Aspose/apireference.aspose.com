---
title: "System::Xml::XmlReader::ReadElementContentAsBase64 मेथड"
linktitle: "ReadElementContentAsBase64"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::ReadElementContentAsBase64 मेथड। तत्व को पढ़ता है और C++ में Base64 सामग्री को डिकोड करता है।"
type: docs
weight: 5300
url: /hi/cpp/system.xml/xmlreader/readelementcontentasbase64/
---
## XmlReader::ReadElementContentAsBase64 method


तत्व को पढ़ता है और **Base64** सामग्री को डिकोड करता है।

```cpp
virtual int32_t System::Xml::XmlReader::ReadElementContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count)
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
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
