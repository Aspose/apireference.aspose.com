---
title: "System::Xml::XmlReaderSettings::get_NameTable विधि"
linktitle: "get_NameTable"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReaderSettings::get_NameTable विधि। C++ में एटॉमाइज़्ड स्ट्रिंग तुलना के लिए उपयोग किए जाने वाले XmlNameTable को लौटाता है।"
type: docs
weight: 1500
url: /hi/cpp/system.xml/xmlreadersettings/get_nametable/
---
## XmlReaderSettings::get_NameTable method


एटॉमाइज़्ड स्ट्रिंग तुलना के लिए उपयोग किए जाने वाले [XmlNameTable](../../xmlnametable/) को लौटाता है।

```cpp
SharedPtr<XmlNameTable> System::Xml::XmlReaderSettings::get_NameTable()
```


### ReturnValue

यह [XmlNameTable](../../xmlnametable/) सभी एटॉमाइज़्ड स्ट्रिंग्स को संग्रहीत करता है जो सभी [XmlReader](../../xmlreader/) इंस्टेंस द्वारा उपयोग की जाती हैं, जो इस [XmlReaderSettings](../) ऑब्जेक्ट का उपयोग करके बनाए गए हैं। डिफ़ॉल्ट मान **nullptr** है। यदि यह मान **nullptr** है, तो बनाया गया [XmlReader](../../xmlreader/) इंस्टेंस एक नया खाली [NameTable](../../nametable/) उपयोग करेगा।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
