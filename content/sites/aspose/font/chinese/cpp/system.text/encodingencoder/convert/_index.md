---
title: "System::Text::EncodingEncoder::Convert 方法"
linktitle: "Convert"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::EncodingEncoder::Convert 方法。将字符转换为 C++ 中的字节。"
type: docs
weight: 100
url: /zh/cpp/system.text/encodingencoder/convert/
---
## EncodingEncoder::Convert(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) method


将字符转换为字节。

```cpp
virtual void System::Text::EncodingEncoder::Convert(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | 要编码的字符。 |
| charIndex | int | 输入缓冲区偏移量。 |
| charCount | int | 输入缓冲区大小。 |
| 字节 | ArrayPtr\<uint8_t\> | 目标字节缓冲区。 |
| byteIndex | int | 目标数组偏移量。 |
| byteCount | int | 目标数组大小。 |
| flush | bool | 如果为 true，则在计算后清除内部编码器状态。 |
| charsUsed | int\& | 用于存储读取字符计数的变量的引用。 |
| bytesUsed | int\& | 用于存储写入字节计数的变量的引用。 |
| completed | bool\& | 如果输入缓冲区已耗尽则设为 true，否则设为 false 的变量引用。 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [EncodingEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## EncodingEncoder::Convert(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) method


将字符转换为字节。

```cpp
virtual void System::Text::EncodingEncoder::Convert(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | const char_t * | 要编码的字符。 |
| charCount | int | 输入缓冲区大小。 |
| 字节 | uint8_t * | 目标字节缓冲区。 |
| byteCount | int | 目标数组大小。 |
| flush | bool | 如果为 true，则在计算后清除内部编码器状态。 |
| charsUsed | int\& | 用于存储读取字符计数的变量的引用。 |
| bytesUsed | int\& | 用于存储写入字节计数的变量的引用。 |
| completed | bool\& | 如果输入缓冲区已耗尽则设为 true，否则设为 false 的变量引用。 |

## 另见

* Class [EncodingEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
