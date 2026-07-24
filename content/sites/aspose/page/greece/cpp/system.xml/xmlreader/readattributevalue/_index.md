---
title: "Μέθοδος System::Xml::XmlReader::ReadAttributeValue"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Xml::XmlReader::ReadAttributeValue. Όταν παρακαμφθεί σε μια κληρονομημένη κλάση, αναλύει την τιμή του χαρακτηριστικού σε έναν ή περισσότερους κόμβους Text, EntityReference ή EndEntity σε C++."
type: docs
weight: 3800
url: /el/cpp/system.xml/xmlreader/readattributevalue/
---
## XmlReader::ReadAttributeValue method


Όταν παρακαμφθεί σε μια κληρονομημένη κλάση, αναλύει την τιμή του χαρακτηριστικού σε έναν ή περισσότερους κόμβους **[Text](../../../system.text/)**, **EntityReference**, ή **EndEntity**.

```cpp
virtual bool System::Xml::XmlReader::ReadAttributeValue()=0
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Δείτε επίσης

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
