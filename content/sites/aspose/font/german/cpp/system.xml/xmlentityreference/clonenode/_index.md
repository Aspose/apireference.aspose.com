---
title: "System::Xml::XmlEntityReference::CloneNode-Methode"
linktitle: "CloneNode"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlEntityReference::CloneNode-Methode. Erstellt ein Duplikat dieses Knotens in C++."
type: docs
weight: 100
url: /de/cpp/system.xml/xmlentityreference/clonenode/
---
## XmlEntityReference::CloneNode method


Erstellt ein Duplikat dieses Knotens.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntityReference::CloneNode(bool deep) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| deep | bool | **true** zum rekursiven Klonen des Unterbaums unter dem angegebenen Knoten; **false** zum Klonen nur des Knotens selbst. Für [XmlEntityReference](../)-Knoten gibt diese Methode immer einen EntityReference-Knoten ohne Kinder zurück. Der Ersetzungstext wird gesetzt, wenn der Knoten in ein übergeordnetes Element eingefügt wird. |

### ReturnValue

Der geklonte Knoten.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntityReference](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
