---
title: "System::Xml::XmlAttributeCollection::SetNamedItem metod"
linktitle: "SetNamedItem"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlAttributeCollection::SetNamedItem metod. Lägger till en XmlNode med hjälp av dess XmlNode::get_Name-resultat i C++."
type: docs
weight: 1000
url: /sv/cpp/system.xml/xmlattributecollection/setnameditem/
---
## XmlAttributeCollection::SetNamedItem method


Lägger till en [XmlNode](../../xmlnode/) med hjälp av dess [XmlNode::get_Name](../../xmlnode/get_name/) resultat.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttributeCollection::SetNamedItem(SharedPtr<XmlNode> node) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| nod | SharedPtr\<XmlNode\> | En attributnod att lagra i denna samling. Noden kommer senare att vara åtkomlig med hjälp av nodens namn. Om en nod med det namnet redan finns i samlingen ersätts den av den nya; annars läggs noden till i slutet av samlingen. |

### ReturnValue

Om **node** ersätter en befintlig nod med samma namn, returneras den gamla noden; annars returneras den tillagda noden.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
