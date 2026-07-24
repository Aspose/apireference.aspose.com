---
title: "System::Xml::XmlNodeReader::ReadAttributeValue method"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlNodeReader::ReadAttributeValue method. يحلل قيمة الخاصية إلى واحدة أو أكثر من عقد Text أو EntityReference أو EndEntity في C++."
type: docs
weight: 3100
url: /ar/cpp/system.xml/xmlnodereader/readattributevalue/
---
## XmlNodeReader::ReadAttributeValue method


يحلل قيمة الخاصية إلى واحدة أو أكثر من **[Text](../../../system.text/)**، **EntityReference**، أو **EndEntity** عقد.

```cpp
bool System::Xml::XmlNodeReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## انظر أيضًا

* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
