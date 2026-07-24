---
title: "System::Xml::XmlAttributeCollection::SetNamedItem methode"
linktitle: "SetNamedItem"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlAttributeCollection::SetNamedItem methode. Voegt een XmlNode toe met behulp van het resultaat van XmlNode::get_Name in C++."
type: docs
weight: 1000
url: /nl/cpp/system.xml/xmlattributecollection/setnameditem/
---
## XmlAttributeCollection::SetNamedItem method


Voegt een [XmlNode](../../xmlnode/) toe met behulp van het resultaat van [XmlNode::get_Name](../../xmlnode/get_name/).

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttributeCollection::SetNamedItem(SharedPtr<XmlNode> node) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| knooppunt | SharedPtr\<XmlNode\> | Een attribuutnode om op te slaan in deze collectie. De node zal later toegankelijk zijn via de naam van de node. Als er al een node met die naam aanwezig is in de collectie, wordt deze vervangen door de nieuwe; anders wordt de node aan het einde van de collectie toegevoegd. |

### ReturnValue

Als de **node** een bestaande node met dezelfde naam vervangt, wordt de oude node geretourneerd; anders wordt de toegevoegde node geretourneerd.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
