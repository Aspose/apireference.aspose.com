---
title: "System::Xml::XmlNamedNodeMap::SetNamedItem-Methode"
linktitle: "SetNamedItem"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNamedNodeMap::SetNamedItem-Methode. Fügt einen XmlNode hinzu, indem dessen XmlNode::get_Name-Wert in C++ verwendet wird."
type: docs
weight: 1000
url: /de/cpp/system.xml/xmlnamednodemap/setnameditem/
---
## XmlNamedNodeMap::SetNamedItem method


Fügt einen [XmlNode](../../xmlnode/) hinzu, indem sein [XmlNode::get_Name](../../xmlnode/get_name/) Wert verwendet wird.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::SetNamedItem(SharedPtr<XmlNode> node)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | Ein [XmlNode](../../xmlnode/) zum Speichern in der [XmlNamedNodeMap](../). Wenn bereits ein Knoten mit diesem Namen in der Map vorhanden ist, wird er durch den neuen ersetzt. |

### ReturnValue

Wenn das **node** einen vorhandenen Knoten mit demselben Namen ersetzt, wird der alte Knoten zurückgegeben; andernfalls wird **nullptr** zurückgegeben.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
