---
title: "System::Xml::XmlEntity::CloneNode Methode"
linktitle: "CloneNode"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlEntity::CloneNode Methode. Erstellt ein Duplikat dieses Knotens. Entity-Knoten können nicht geklont werden. Der Aufruf dieser Methode auf einem XmlEntity-Objekt löst in C++ eine Ausnahme aus."
type: docs
weight: 100
url: /de/cpp/system.xml/xmlentity/clonenode/
---
## XmlEntity::CloneNode method


Erstellt ein Duplikat dieses Knotens. Entity-Knoten können nicht geklont werden. Der Aufruf dieser Methode auf einem [XmlEntity](../)-Objekt löst eine Ausnahme aus.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntity::CloneNode(bool deep) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| deep | bool | **true** zum rekursiven Klonen des Teilbaums unter dem angegebenen Knoten; **false** zum Klonen nur des Knotens selbst. |

### ReturnValue

Eine Kopie des [XmlNode](../../xmlnode/), von dem die Methode aufgerufen wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntity](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
