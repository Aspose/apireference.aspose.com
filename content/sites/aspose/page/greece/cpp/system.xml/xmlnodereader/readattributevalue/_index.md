---
title: "System::Xml::XmlNodeReader::ReadAttributeValue μέθοδος"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNodeReader::ReadAttributeValue μέθοδος. Αναλύει την τιμή του χαρακτηριστικού σε έναν ή περισσότερους κόμβους Text, EntityReference ή EndEntity σε C++."
type: docs
weight: 3100
url: /el/cpp/system.xml/xmlnodereader/readattributevalue/
---
## XmlNodeReader::ReadAttributeValue method


Αναλύει την τιμή του χαρακτηριστικού σε έναν ή περισσότερους **[Text](../../../system.text/)**, **EntityReference**, ή **EndEntity** κόμβους.

```cpp
bool System::Xml::XmlNodeReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Δείτε επίσης

* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
