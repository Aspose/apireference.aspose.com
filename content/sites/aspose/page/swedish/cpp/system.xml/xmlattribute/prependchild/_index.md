---
title: "System::Xml::XmlAttribute::PrependChild metod"
linktitle: "PrependChild"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlAttribute::PrependChild metod. Lägger till den angivna noden i början av listan med barnnoder för denna nod i C++."
type: docs
weight: 1600
url: /sv/cpp/system.xml/xmlattribute/prependchild/
---
## XmlAttribute::PrependChild method


Lägger till den angivna noden i början av listan med barnnoder för denna nod.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::PrependChild(SharedPtr<XmlNode> newChild) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | Den [XmlNode](../../xmlnode/) som ska läggas till. Om det är ett [XmlDocumentFragment](../../xmldocumentfragment/) flyttas hela innehållet i dokumentfragmentet till barnlistan för denna nod. |

### ReturnValue

Den tillagda [XmlNode](../../xmlnode/).

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
