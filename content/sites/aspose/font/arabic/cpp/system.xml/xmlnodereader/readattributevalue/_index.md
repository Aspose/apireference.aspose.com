---
title: "طريقة System::Xml::XmlNodeReader::ReadAttributeValue"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlNodeReader::ReadAttributeValue. تحلل قيمة الخاصية إلى عقدة واحدة أو أكثر من نوع Text أو EntityReference أو EndEntity في C++."
type: docs
weight: 3100
url: /ar/cpp/system.xml/xmlnodereader/readattributevalue/
---
## XmlNodeReader::ReadAttributeValue method


تحلل قيمة الخاصية إلى عقدة واحدة أو أكثر من **[Text](../../../system.text/)**، **EntityReference**، أو **EndEntity**.

```cpp
bool System::Xml::XmlNodeReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## انظر أيضًا

* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
