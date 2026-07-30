---
title: "System::Text::ICUDecoder::GetChars 方法"
linktitle: "GetChars"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::ICUDecoder::GetChars 方法。获取在 C++ 中解码缓冲区后产生的字符。"
type: docs
weight: 500
url: /zh/cpp/system.text/icudecoder/getchars/
---
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


获取解码缓冲区后得到的字符。

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字节 | ArrayPtr\<uint8_t\> | 待解码的字节。 |
| byteIndex | int | 输入缓冲区偏移量。 |
| byteCount | int | 输入缓冲区大小。 |
| chars | ArrayPtr\<char_t\> | 目标字符缓冲区。 |
| charIndex | int | 目标数组偏移量。 |

### ReturnValue

写入的字符数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


获取解码缓冲区后得到的字符。

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字节 | ArrayPtr\<uint8_t\> | 待解码的字节。 |
| byteIndex | int | 输入缓冲区偏移量。 |
| byteCount | int | 输入缓冲区大小。 |
| chars | ArrayPtr\<char_t\> | 目标字符缓冲区。 |
| charIndex | int | 目标数组偏移量。 |
| flush | bool | 如果为 true，则在计算后清除内部解码器状态。 |

### ReturnValue

写入的字符数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


获取解码缓冲区后得到的字符。

```cpp
virtual int System::Text::ICUDecoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字节 | const uint8_t * | 待解码的字节。 |
| byteCount | int | 输入缓冲区大小。 |
| chars | char_t * | 目标字符缓冲区。 |
| charCount | int | 目标数组大小。 |
| flush | bool | 如果为 true，则在计算后清除内部解码器状态。 |

### ReturnValue

写入的字符数。

## 另见

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
