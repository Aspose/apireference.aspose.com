---
title: "System::Xml::XmlDeclaration::CloneNode Methode"
linktitle: "CloneNode"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlDeclaration::CloneNode Methode. Erstellt ein Duplikat dieses Knotens in C++."
type: docs
weight: 100
url: /de/cpp/system.xml/xmldeclaration/clonenode/
---
## XmlDeclaration::CloneNode method


Erstellt ein Duplikat dieses Knotens.

```cpp
SharedPtr<XmlNode> System::Xml::XmlDeclaration::CloneNode(bool deep) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| deep | bool | **true** um den Teilbaum unter dem angegebenen Knoten rekursiv zu klonen; **false** um nur den Knoten selbst zu klonen. Da [XmlDeclaration](../)‑Knoten keine Kinder haben, enthält der geklonte Knoten stets den Datenwert, unabhängig von der Parametereinstellung. |

### ReturnValue

Der geklonte Knoten.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
