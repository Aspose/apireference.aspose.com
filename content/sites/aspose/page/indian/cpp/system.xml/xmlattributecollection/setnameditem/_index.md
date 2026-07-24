---
title: "System::Xml::XmlAttributeCollection::SetNamedItem मेथड"
linktitle: "SetNamedItem"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlAttributeCollection::SetNamedItem मेथड। C++ में XmlNode::get_Name परिणाम का उपयोग करके एक XmlNode जोड़ता है।"
type: docs
weight: 1000
url: /hi/cpp/system.xml/xmlattributecollection/setnameditem/
---
## XmlAttributeCollection::SetNamedItem method


एक [XmlNode](../../xmlnode/) को उसके [XmlNode::get_Name](../../xmlnode/get_name/) परिणाम का उपयोग करके जोड़ता है।

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttributeCollection::SetNamedItem(SharedPtr<XmlNode> node) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नोड | SharedPtr\<XmlNode\> | इस संग्रह में संग्रहित करने के लिए एक एट्रिब्यूट नोड। नोड बाद में नोड के नाम का उपयोग करके उपलब्ध होगा। यदि उसी नाम का नोड पहले से संग्रह में मौजूद है, तो उसे नए नोड द्वारा प्रतिस्थापित किया जाता है; अन्यथा, नोड को संग्रह के अंत में जोड़ा जाता है। |

### ReturnValue

यदि **node** समान नाम वाले मौजूदा नोड को प्रतिस्थापित करता है, तो पुराना नोड लौटाया जाता है; अन्यथा, जोड़ा गया नोड लौटाया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
