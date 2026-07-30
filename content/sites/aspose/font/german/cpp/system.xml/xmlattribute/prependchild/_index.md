---
title: "System::Xml::XmlAttribute::PrependChild-Methode"
linktitle: "PrependChild"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlAttribute::PrependChild-Methode. Fügt den angegebenen Knoten am Anfang der Liste der Kindknoten dieses Knotens in C++ hinzu."
type: docs
weight: 1600
url: /de/cpp/system.xml/xmlattribute/prependchild/
---
## XmlAttribute::PrependChild method


Fügt den angegebenen Knoten am Anfang der Liste von Kindknoten dieses Knotens hinzu.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::PrependChild(SharedPtr<XmlNode> newChild) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | Der [XmlNode](../../xmlnode/) zum Hinzufügen. Wenn es ein [XmlDocumentFragment](../../xmldocumentfragment/) ist, werden die gesamten Inhalte des Dokumentfragments in die Kindliste dieses Knotens verschoben. |

### ReturnValue

Der [XmlNode](../../xmlnode/) hinzugefügt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
