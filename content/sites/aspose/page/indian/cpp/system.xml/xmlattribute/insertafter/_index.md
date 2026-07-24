---
title: "System::Xml::XmlAttribute::InsertAfter विधि"
linktitle: "InsertAfter"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlAttribute::InsertAfter विधि। निर्दिष्ट नोड को तुरंत निर्दिष्ट रेफ़रेंस नोड के बाद C++ में सम्मिलित करता है।"
type: docs
weight: 1400
url: /hi/cpp/system.xml/xmlattribute/insertafter/
---
## XmlAttribute::InsertAfter method


निर्दिष्ट रेफ़रेंस नोड के तुरंत बाद निर्दिष्ट नोड को सम्मिलित करता है।

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::InsertAfter(SharedPtr<XmlNode> newChild, SharedPtr<XmlNode> refChild) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | इन्सर्ट करने के लिए [XmlNode](../../xmlnode/)। |
| refChild | SharedPtr\<XmlNode\> | रेफ़रेंस नोड होने वाला [XmlNode](../../xmlnode/)। **newChild** को **refChild** के बाद रखा जाता है। |

### ReturnValue

इन्सर्ट किया गया [XmlNode](../../xmlnode/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
