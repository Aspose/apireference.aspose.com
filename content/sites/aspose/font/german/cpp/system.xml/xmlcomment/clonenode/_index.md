---
title: "System::Xml::XmlComment::CloneNode Methode"
linktitle: "CloneNode"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlComment::CloneNode Methode. Erstellt ein Duplikat dieses Knotens in C++."
type: docs
weight: 100
url: /de/cpp/system.xml/xmlcomment/clonenode/
---
## XmlComment::CloneNode method


Erstellt ein Duplikat dieses Knotens.

```cpp
SharedPtr<XmlNode> System::Xml::XmlComment::CloneNode(bool deep) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| deep | bool | **true**, um den Unterbaum unter dem angegebenen Knoten rekursiv zu klonen; **false**, um nur den Knoten selbst zu klonen. Da Kommentar-Knoten keine Kinder haben, enthält der geklonte Knoten stets den Textinhalt, unabhängig von der Parameter-Einstellung. |

### ReturnValue

Der geklonte Knoten.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlComment](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
