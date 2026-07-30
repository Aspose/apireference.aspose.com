---
title: "System::Xml::XmlValidatingReader::ReadContentAsBinHex 方法"
linktitle: "ReadContentAsBinHex"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlValidatingReader::ReadContentAsBinHex 方法。读取内容并在 C++ 中返回 BinHex 解码后的二进制字节。"
type: docs
weight: 4200
url: /zh/cpp/system.xml/xmlvalidatingreader/readcontentasbinhex/
---
## XmlValidatingReader::ReadContentAsBinHex method


读取内容并返回 BinHex 解码后的二进制字节。

```cpp
int32_t System::Xml::XmlValidatingReader::ReadContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
