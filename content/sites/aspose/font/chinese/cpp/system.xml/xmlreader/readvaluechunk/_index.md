---
title: "System::Xml::XmlReader::ReadValueChunk 方法"
linktitle: "ReadValueChunk"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::ReadValueChunk 方法。 在 C++ 中读取嵌入在 XML 文档中的大块文本流。"
type: docs
weight: 7400
url: /zh/cpp/system.xml/xmlreader/readvaluechunk/
---
## XmlReader::ReadValueChunk method


读取嵌入在 XML 文档中的大文本流。

```cpp
virtual int32_t System::Xml::XmlReader::ReadValueChunk(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | ArrayPtr\<char16_t\> | 用于存放文本内容的字符数组缓冲区。 此值不能为 **nullptr**。 |
| index | int32_t | 缓冲区中的偏移量，供 [XmlReader](../) 开始复制结果。 |
| count | int32_t | 要复制到缓冲区的最大字符数。 实际复制的字符数由此方法返回。 |

### ReturnValue

读取到缓冲区的字符数。当没有更多文本内容时返回值为零。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
