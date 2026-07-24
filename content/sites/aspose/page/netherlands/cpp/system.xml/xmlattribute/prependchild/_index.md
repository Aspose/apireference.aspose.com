---
title: "System::Xml::XmlAttribute::PrependChild methode"
linktitle: "PrependChild"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlAttribute::PrependChild methode. Voegt het opgegeven knooppunt toe aan het begin van de lijst met kindknooppunten voor dit knooppunt in C++."
type: docs
weight: 1600
url: /nl/cpp/system.xml/xmlattribute/prependchild/
---
## XmlAttribute::PrependChild method


Voegt het opgegeven knooppunt toe aan het begin van de lijst met onderliggende knooppunten van dit knooppunt.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::PrependChild(SharedPtr<XmlNode> newChild) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | De [XmlNode](../../xmlnode/) om toe te voegen. Als het een [XmlDocumentFragment](../../xmldocumentfragment/) is, wordt de volledige inhoud van het documentfragment verplaatst naar de kindlijst van dit knooppunt. |

### ReturnValue

De [XmlNode](../../xmlnode/) toegevoegd.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
