---
title: "System::Text::ICUDecoder::Convert 方法"
linktitle: "Convert"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::ICUDecoder::Convert 方法。将字节转换为 C++ 中的字符。"
type: docs
weight: 300
url: /zh/cpp/system.text/icudecoder/convert/
---
## ICUDecoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


将字节转换为字符。

```cpp
virtual void System::Text::ICUDecoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字节 | ArrayPtr\<uint8_t\> | 待解码的字节。 |
| byteIndex | int | 输入缓冲区偏移量。 |
| byteCount | int | 输入缓冲区大小。 |
| chars | ArrayPtr\<char_t\> | 目标字符缓冲区。 |
| charIndex | int | 目标数组偏移量。 |
| charCount | int | 目标数组大小。 |
| flush | bool | 如果为 true，则在计算后清除内部解码器状态。 |
| bytesUsed | int\& | 用于存储已读取字节计数的变量引用。 |
| charsUsed | int\& | 用于存储已写入字符计数的变量引用。 |
| completed | bool\& | 如果输入缓冲区已耗尽则设为 true，否则设为 false 的变量引用。 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


将字节转换为字符。

```cpp
virtual void System::Text::ICUDecoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字节 | const uint8_t * | 待解码的字节。 |
| byteCount | int | 输入缓冲区大小。 |
| chars | char_t * | 目标字符缓冲区。 |
| charCount | int | 目标数组大小。 |
| flush | bool | 如果为 true，则在计算后清除内部解码器状态。 |
| bytesUsed | int\& | 用于存储已读取字节计数的变量引用。 |
| charsUsed | int\& | 用于存储已写入字符计数的变量引用。 |
| completed | bool\& | 如果输入缓冲区已耗尽则设为 true，否则设为 false 的变量引用。 |

## 另见

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
