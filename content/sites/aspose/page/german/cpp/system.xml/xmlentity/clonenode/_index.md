---
title: "System::Xml::XmlEntity::CloneNode Methode"
linktitle: "CloneNode"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlEntity::CloneNode Methode. Erstellt ein Duplikat dieses Knotens. Entity-Knoten können nicht geklont werden. Der Aufruf dieser Methode auf einem XmlEntity-Objekt wirft in C++ eine Ausnahme."
type: docs
weight: 100
url: /de/cpp/system.xml/xmlentity/clonenode/
---
## XmlEntity::CloneNode method


Erstellt ein Duplikat dieses Knotens. Entity-Knoten können nicht geklont werden. Der Aufruf dieser Methode auf einem [XmlEntity](../)-Objekt wirft eine Ausnahme.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntity::CloneNode(bool deep) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| deep | bool | **true**, um den Teilbaum unter dem angegebenen Knoten rekursiv zu klonen; **false**, um nur den Knoten selbst zu klonen. |

### ReturnValue

Eine Kopie des [XmlNode](../../xmlnode/), von dem die Methode aufgerufen wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntity](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
