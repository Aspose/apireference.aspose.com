---
title: "System::Text::Encoding::Convert 方法"
linktitle: "Convert"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::Encoding::Convert 方法。在 C++ 中将字节在两种编码之间进行转换。"
type: docs
weight: 3000
url: /zh/cpp/system.text/encoding/convert/
---
## Encoding::Convert(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) method


在两种编码之间转换字节。

```cpp
static ArrayPtr<uint8_t> System::Text::Encoding::Convert(const EncodingPtr &src_encoding, const EncodingPtr &dst_encoding, const ArrayPtr<uint8_t> &bytes)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| src_encoding | const EncodingPtr\& | 源编码。 |
| dst_encoding | const EncodingPtr\& | 目标编码。 |
| 字节 | const ArrayPtr\<uint8_t\>\& | 待转换的字节。 |

### ReturnValue

已转换的字节。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::Convert(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) method


在两种编码之间转换字节。

```cpp
static ArrayPtr<uint8_t> System::Text::Encoding::Convert(const EncodingPtr &src_encoding, const EncodingPtr &dst_encoding, const ArrayPtr<uint8_t> &bytes, int index, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| src_encoding | const EncodingPtr\& | 源编码。 |
| dst_encoding | const EncodingPtr\& | 目标编码。 |
| 字节 | const ArrayPtr\<uint8_t\>\& | 待转换的字节。 |
| 索引 | int | 切片起始位置。 |
| count | int | 切片大小。 |

### ReturnValue

已转换的字节。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
