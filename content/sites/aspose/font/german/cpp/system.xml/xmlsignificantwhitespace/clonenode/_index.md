---
title: "System::Xml::XmlSignificantWhitespace::CloneNode Methode"
linktitle: "CloneNode"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlSignificantWhitespace::CloneNode Methode. Erstellt ein Duplikat dieses Knotens in C++."
type: docs
weight: 100
url: /de/cpp/system.xml/xmlsignificantwhitespace/clonenode/
---
## XmlSignificantWhitespace::CloneNode method


Erstellt ein Duplikat dieses Knotens.

```cpp
SharedPtr<XmlNode> System::Xml::XmlSignificantWhitespace::CloneNode(bool deep) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| deep | bool | **true** zum rekursiven Klonen des Unterbaums unter dem angegebenen Knoten; **false** zum Klonen nur des Knotens selbst. Für signifikante Leerzeichen‑Knoten enthält der geklonte Knoten stets den Datenwert, unabhängig von der Parametereinstellung. |

### ReturnValue

Der geklonte Knoten.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlSignificantWhitespace](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
