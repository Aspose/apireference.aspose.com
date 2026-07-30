---
title: "System::Xml::XmlValidatingReader::ReadElementContentAsBinHex 方法"
linktitle: "ReadElementContentAsBinHex"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlValidatingReader::ReadElementContentAsBinHex 方法。读取元素并在 C++ 中解码 BinHex 内容。"
type: docs
weight: 4400
url: /zh/cpp/system.xml/xmlvalidatingreader/readelementcontentasbinhex/
---
## XmlValidatingReader::ReadElementContentAsBinHex method


读取元素并解码 BinHex 内容。

```cpp
int32_t System::Xml::XmlValidatingReader::ReadElementContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | ArrayPtr\<uint8_t\> | 用于复制生成文本的缓冲区。此值不能为 **nullptr**。 |
| 索引 | int32_t | 在缓冲区中开始复制结果的偏移量。 |
| count | int32_t | 要复制到缓冲区的最大字节数。实际复制的字节数由此方法返回。 |

### ReturnValue

写入缓冲区的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
