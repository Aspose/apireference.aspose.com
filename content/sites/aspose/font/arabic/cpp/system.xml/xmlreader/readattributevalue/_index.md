---
title: "System::Xml::XmlReader::ReadAttributeValue طريقة"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlReader::ReadAttributeValue طريقة. عند تجاوزها في فئة مشتقة، تقوم بتحليل قيمة السمة إلى عقدة أو أكثر من Text أو EntityReference أو EndEntity في C++."
type: docs
weight: 3800
url: /ar/cpp/system.xml/xmlreader/readattributevalue/
---
## XmlReader::ReadAttributeValue method


عند تجاوزها في فئة مشتقة، تقوم بتحليل قيمة السمة إلى عقدة أو أكثر من **[Text](../../../system.text/)**، **EntityReference**، أو **EndEntity**.

```cpp
virtual bool System::Xml::XmlReader::ReadAttributeValue()=0
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## انظر أيضًا

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
