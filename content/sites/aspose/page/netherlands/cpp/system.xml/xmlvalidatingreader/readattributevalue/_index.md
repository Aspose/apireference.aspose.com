---
title: "System::Xml::XmlValidatingReader::ReadAttributeValue method"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlValidatingReader::ReadAttributeValue method. Parseert de attribuutwaarde naar een of meer Text-, EntityReference- of EndEntity-knooppunten in C++."
type: docs
weight: 4000
url: /nl/cpp/system.xml/xmlvalidatingreader/readattributevalue/
---
## XmlValidatingReader::ReadAttributeValue method


Parseert de attribuutwaarde naar een of meer **[Text](../../../system.text/)**, **EntityReference**, of **EndEntity** knooppunten.

```cpp
bool System::Xml::XmlValidatingReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Zie ook

* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
