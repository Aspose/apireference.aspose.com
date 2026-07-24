---
title: "Μέθοδος System::Xml::XmlTextReader::ReadAttributeValue"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Xml::XmlTextReader::ReadAttributeValue. Αναλύει την τιμή του χαρακτηριστικού σε έναν ή περισσότερους κόμβους Text, EntityReference ή EndEntity σε C++."
type: docs
weight: 4300
url: /el/cpp/system.xml/xmltextreader/readattributevalue/
---
## XmlTextReader::ReadAttributeValue method


Αναλύει την τιμή του χαρακτηριστικού σε έναν ή περισσότερους **[Text](../../../system.text/)**, **EntityReference**, ή **EndEntity** κόμβους.

```cpp
bool System::Xml::XmlTextReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Δείτε επίσης

* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
