---
title: "System::Xml::XmlValidatingReader::ReadAttributeValue metode"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlValidatingReader::ReadAttributeValue metode. Mengurai nilai atribut menjadi satu atau lebih node Text, EntityReference, atau EndEntity dalam C++."
type: docs
weight: 4000
url: /id/cpp/system.xml/xmlvalidatingreader/readattributevalue/
---
## XmlValidatingReader::ReadAttributeValue method


Mengurai nilai atribut menjadi satu atau lebih node **[Text](../../../system.text/)**, **EntityReference**, atau **EndEntity**.

```cpp
bool System::Xml::XmlValidatingReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Lihat Juga

* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
