---
title: "Metodo System::Xml::XmlReader::ReadAttributeValue"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Page per C++"
description: "Metodo System::Xml::XmlReader::ReadAttributeValue. Quando sovrascritto in una classe derivata, analizza il valore dell'attributo in uno o più nodi Text, EntityReference o EndEntity in C++."
type: docs
weight: 3800
url: /it/cpp/system.xml/xmlreader/readattributevalue/
---
## XmlReader::ReadAttributeValue method


Quando sovrascritto in una classe derivata, analizza il valore dell'attributo in uno o più nodi **[Text](../../../system.text/)**, **EntityReference** o **EndEntity**.

```cpp
virtual bool System::Xml::XmlReader::ReadAttributeValue()=0
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Vedi anche

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
