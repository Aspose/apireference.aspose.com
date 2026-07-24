---
title: "System::Xml::XmlAttribute::InsertBefore विधि"
linktitle: "InsertBefore"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlAttribute::InsertBefore विधि। C++ में निर्दिष्ट नोड को निर्दिष्ट रेफ़रेंस नोड के तुरंत पहले सम्मिलित करता है।"
type: docs
weight: 1500
url: /hi/cpp/system.xml/xmlattribute/insertbefore/
---
## XmlAttribute::InsertBefore method


निर्दिष्ट रेफ़रेंस नोड के तुरंत पहले निर्दिष्ट नोड को सम्मिलित करता है।

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::InsertBefore(SharedPtr<XmlNode> newChild, SharedPtr<XmlNode> refChild) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | इन्सर्ट करने के लिए [XmlNode](../../xmlnode/)। |
| refChild | SharedPtr\<XmlNode\> | रेफ़रेंस नोड होने वाला [XmlNode](../../xmlnode/)। **newChild** इस नोड के पहले रखा जाता है। |

### ReturnValue

इन्सर्ट किया गया [XmlNode](../../xmlnode/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
