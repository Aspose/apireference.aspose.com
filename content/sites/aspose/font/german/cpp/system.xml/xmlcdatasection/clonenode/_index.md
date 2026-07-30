---
title: "System::Xml::XmlCDataSection::CloneNode-Methode"
linktitle: "CloneNode"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlCDataSection::CloneNode-Methode. Erstellt ein Duplikat dieses Knotens in C++."
type: docs
weight: 100
url: /de/cpp/system.xml/xmlcdatasection/clonenode/
---
## XmlCDataSection::CloneNode method


Erstellt ein Duplikat dieses Knotens.

```cpp
SharedPtr<XmlNode> System::Xml::XmlCDataSection::CloneNode(bool deep) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| deep | bool | **true** zum rekursiven Klonen des Teilbaums unter dem angegebenen Knoten; **false** zum Klonen nur des Knotens selbst. Da CDATA-Knoten keine Kinder haben, wird der geklonte Knoten unabhängig von der Parameter-Einstellung immer den Dateninhalt enthalten. |

### ReturnValue

Der geklonte Knoten.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlCDataSection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
