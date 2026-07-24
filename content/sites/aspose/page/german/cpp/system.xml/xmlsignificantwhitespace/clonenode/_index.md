---
title: "System::Xml::XmlSignificantWhitespace::CloneNode-Methode"
linktitle: "CloneNode"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlSignificantWhitespace::CloneNode-Methode. Erstellt ein Duplikat dieses Knotens in C++."
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
| deep | bool | **true**, um den Teilbaum unter dem angegebenen Knoten rekursiv zu klonen; **false**, um nur den Knoten selbst zu klonen. Für signifikante Whitespace‑Knoten enthält der geklonte Knoten immer den Datenwert, unabhängig von der Parametereinstellung. |

### ReturnValue

Der geklonte Knoten.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlSignificantWhitespace](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
