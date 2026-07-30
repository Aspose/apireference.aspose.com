---
title: "System::Xml::XmlAttributeCollection::SetNamedItem Methode"
linktitle: "SetNamedItem"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlAttributeCollection::SetNamedItem Methode. Fügt ein XmlNode hinzu, indem das Ergebnis von XmlNode::get_Name verwendet wird, in C++."
type: docs
weight: 1000
url: /de/cpp/system.xml/xmlattributecollection/setnameditem/
---
## XmlAttributeCollection::SetNamedItem method


Fügt ein [XmlNode](../../xmlnode/) mithilfe seines [XmlNode::get_Name](../../xmlnode/get_name/) Ergebnisses hinzu.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttributeCollection::SetNamedItem(SharedPtr<XmlNode> node) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Knoten | SharedPtr\<XmlNode\> | Ein Attributknoten, der in dieser Sammlung gespeichert werden soll. Der Knoten ist später über den Namen des Knotens zugänglich. Wenn bereits ein Knoten mit diesem Namen in der Sammlung vorhanden ist, wird er durch den neuen ersetzt; andernfalls wird der Knoten am Ende der Sammlung angehängt. |

### ReturnValue

Wenn der **node** einen vorhandenen Knoten mit demselben Namen ersetzt, wird der alte Knoten zurückgegeben; andernfalls wird der hinzugefügte Knoten zurückgegeben.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
