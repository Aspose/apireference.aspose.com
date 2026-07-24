---
title: "System::Xml::XmlNodeReader::ReadAttributeValue-methode"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNodeReader::ReadAttributeValue-methode. Parseert de attribuutwaarde naar een of meer Text-, EntityReference- of EndEntity-knooppunten in C++."
type: docs
weight: 3100
url: /nl/cpp/system.xml/xmlnodereader/readattributevalue/
---
## XmlNodeReader::ReadAttributeValue method


Parseert de attribuutwaarde naar een of meer **[Text](../../../system.text/)**, **EntityReference**, of **EndEntity** knooppunten.

```cpp
bool System::Xml::XmlNodeReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Zie ook

* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
