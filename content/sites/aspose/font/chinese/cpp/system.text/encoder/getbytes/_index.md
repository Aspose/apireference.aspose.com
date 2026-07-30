---
title: "System::Text::Encoder::GetBytes 方法"
linktitle: "GetBytes"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::Encoder::GetBytes 方法。获取在 C++ 中对缓冲区进行编码后产生的字节。"
type: docs
weight: 500
url: /zh/cpp/system.text/encoder/getbytes/
---
## Encoder::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) method


获取编码缓冲区后得到的字节。

```cpp
virtual int System::Text::Encoder::GetBytes(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, bool flush)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | 要编码的字符。 |
| charIndex | int | 源数组偏移量。 |
| charCount | int | 源子数组长度。 |
| 字节 | ArrayPtr\<uint8_t\> | 目标字节缓冲区。 |
| byteIndex | int | 目标缓冲区偏移量。 |
| flush | bool | 如果为 true，则在计算后清除内部编码器状态。 |

### ReturnValue

已写入的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoder::GetBytes(const char_t *, int, uint8_t *, int, bool) method


获取编码缓冲区后得到的字节。

```cpp
virtual int System::Text::Encoder::GetBytes(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | const char_t * | 要编码的字符。 |
| charCount | int | 源数组长度。 |
| 字节 | uint8_t * | 目标字节缓冲区。 |
| byteCount | int | 目标缓冲区大小。 |
| flush | bool | 如果为 true，则在计算后清除内部编码器状态。 |

### ReturnValue

已写入的字节数。

## 另见

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
