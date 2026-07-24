---
title: "System::Xml::XmlNotation::CloneNode-Methode"
linktitle: "CloneNode"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlNotation::CloneNode-Methode. Erstellt ein Duplikat dieses Knotens. Notationsknoten können nicht geklont werden. Der Aufruf dieser Methode auf einem XmlNotation-Objekt löst in C++ eine Ausnahme aus."
type: docs
weight: 100
url: /de/cpp/system.xml/xmlnotation/clonenode/
---
## XmlNotation::CloneNode method


Erstellt ein Duplikat dieses Knotens. Notationsknoten können nicht geklont werden. Der Aufruf dieser Methode auf einem [XmlNotation](../)-Objekt löst eine Ausnahme aus.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNotation::CloneNode(bool deep) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| deep | bool | **true**, um den Teilbaum unter dem angegebenen Knoten rekursiv zu klonen; **false**, um nur den Knoten selbst zu klonen. |

### ReturnValue

Eine [XmlNode](../../xmlnode/)-Kopie des Knotens, von dem die Methode aufgerufen wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNotation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
