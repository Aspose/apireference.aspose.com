---
title: "System::Xml::XmlComment::CloneNode-Methode"
linktitle: "CloneNode"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlComment::CloneNode-Methode. Erstellt ein Duplikat dieses Knotens in C++."
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
| deep | bool | **true** zum rekursiven Klonen des Teilbaums unter dem angegebenen Knoten; **false** zum Klonen nur des Knotens selbst. Da Kommentar-Knoten keine Kinder haben, enthält der geklonte Knoten immer den Textinhalt, unabhängig von der Parametereinstellung. |

### ReturnValue

Der geklonte Knoten.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlComment](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
