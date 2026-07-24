---
title: "System::Xml::XmlNamedNodeMap::SetNamedItem मेथड"
linktitle: "SetNamedItem"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNamedNodeMap::SetNamedItem मेथड। C++ में XmlNode को उसके XmlNode::get_Name मान का उपयोग करके जोड़ता है।"
type: docs
weight: 1000
url: /hi/cpp/system.xml/xmlnamednodemap/setnameditem/
---
## XmlNamedNodeMap::SetNamedItem method


[XmlNode](../../xmlnode/) को उसके [XmlNode::get_Name](../../xmlnode/get_name/) मान का उपयोग करके जोड़ता है।

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::SetNamedItem(SharedPtr<XmlNode> node)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | [XmlNode](../../xmlnode/) को [XmlNamedNodeMap](../) में संग्रहीत करने के लिए। यदि उसी नाम वाला नोड पहले से मानचित्र में मौजूद है, तो उसे नए नोड से प्रतिस्थापित किया जाता है। |

### ReturnValue

यदि **node** समान नाम वाले मौजूदा नोड को प्रतिस्थापित करता है, तो पुराना नोड लौटाया जाता है; अन्यथा, **nullptr** लौटाया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
