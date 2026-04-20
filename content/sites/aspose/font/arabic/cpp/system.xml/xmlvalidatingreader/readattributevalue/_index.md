---
title: "System::Xml::XmlValidatingReader::ReadAttributeValue method"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlValidatingReader::ReadAttributeValue method. يحلل قيمة السمة إلى عقدة أو أكثر من نوع Text أو EntityReference أو EndEntity في C++."
type: docs
weight: 4000
url: /ar/cpp/system.xml/xmlvalidatingreader/readattributevalue/
---
## XmlValidatingReader::ReadAttributeValue method


تحلل قيمة الخاصية إلى عقدة واحدة أو أكثر من **[Text](../../../system.text/)**، **EntityReference**، أو **EndEntity**.

```cpp
bool System::Xml::XmlValidatingReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## انظر أيضًا

* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
