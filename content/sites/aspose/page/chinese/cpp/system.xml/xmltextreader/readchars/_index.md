---
title: "System::Xml::XmlTextReader::ReadChars 方法"
linktitle: "ReadChars"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlTextReader::ReadChars 方法。将元素的文本内容读取到字符缓冲区中。此方法旨在通过在 C++ 中连续调用来读取大型嵌入文本流。"
type: docs
weight: 4600
url: /zh/cpp/system.xml/xmltextreader/readchars/
---
## XmlTextReader::ReadChars method


将元素的文本内容读取到字符缓冲区中。此方法旨在通过连续调用来读取大块嵌入文本流。

```cpp
int32_t System::Xml::XmlTextReader::ReadChars(const ArrayPtr<char16_t> &buffer, int32_t index, int32_t count)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | const ArrayPtr\<char16_t\>\& | 用于存放写入文本内容的字符数组，充当缓冲区。 |
| 索引 | int32_t | 方法可以开始写入文本内容的 **buffer** 中的位置。 |
| count | int32_t | 写入 **buffer** 的字符数量。 |

### ReturnValue

读取的字符数。如果读取器未定位在元素上或当前上下文中没有更多文本内容可返回，则可能为 0。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
