---
title: "System::Xml::XmlReader::ReadValueChunk 方法"
linktitle: "ReadValueChunk"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlReader::ReadValueChunk 方法。读取嵌入在 XML 文档中的大块文本流（C++）。"
type: docs
weight: 7400
url: /zh/cpp/system.xml/xmlreader/readvaluechunk/
---
## XmlReader::ReadValueChunk method


读取嵌入在 XML 文档中的大文本流。

```cpp
virtual int32_t System::Xml::XmlReader::ReadValueChunk(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | ArrayPtr\<char16_t\> | 用于存放写入文本内容的缓冲区的字符数组。该值不能为 **nullptr**。 |
| index | int32_t | 缓冲区中的偏移量，指示 [XmlReader](../) 可以开始复制结果的位置。 |
| count | int32_t | 要复制到缓冲区的最大字符数。实际复制的字符数由此方法返回。 |

### ReturnValue

读取到缓冲区的字符数。当没有更多文本内容时返回值为零。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
