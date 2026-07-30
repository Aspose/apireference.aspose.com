---
title: "System::Text::ICUEncoding::GetChars 方法"
linktitle: "GetChars"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::ICUEncoding::GetChars 方法。获取在 C++ 中从解码字节缓冲区得到的字符。"
type: docs
weight: 500
url: /zh/cpp/system.text/icuencoding/getchars/
---
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>) method


获取对字节缓冲区进行解码后产生的字符。

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) 用于读取字节。 |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


获取对字节缓冲区进行解码后产生的字符。

```cpp
virtual int System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) 用于读取字节。 |
| byte_index | int | 输入缓冲区偏移量。 |
| byte_count | int | 输入缓冲区大小。 |
| chars | ArrayPtr\<char_t\> | [Buffer](../../../system/buffer/) 用于放置字符。 |
| char_index | int | 输出缓冲区偏移量。 |

### ReturnValue

写入的字符数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


获取对字节缓冲区进行解码后产生的字符。

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int index, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) 用于读取字节。 |
| 索引 | int | 输入缓冲区偏移量。 |
| count | int | 输入缓冲区大小。 |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetChars(const uint8_t *, int, char_t *, int) method


获取对字节缓冲区进行解码后产生的字符。

```cpp
int System::Text::ICUEncoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| bytes | const uint8_t * | [Buffer](../../../system/buffer/) 用于读取字节。 |
| byte_count | int | 输入缓冲区大小。 |
| chars | char_t * | [Buffer](../../../system/buffer/) 用于放置字符。 |
| char_count | int | 输出缓冲区大小。 |

### ReturnValue

写入的字符数。

## 另见

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
