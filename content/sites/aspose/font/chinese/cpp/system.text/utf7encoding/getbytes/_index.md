---
title: "System::Text::UTF7Encoding::GetBytes 方法"
linktitle: "GetBytes"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::UTF7Encoding::GetBytes 方法。获取在 C++ 中对字符缓冲区进行编码后产生的字节。"
type: docs
weight: 500
url: /zh/cpp/system.text/utf7encoding/getbytes/
---
## UTF7Encoding::GetBytes(ArrayPtr\<char_t\>) method


获取对字符缓冲区进行编码后产生的字节。

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | 要编码的字符。 |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) method


获取对字符缓冲区进行编码后产生的字节。

```cpp
int System::Text::UTF7Encoding::GetBytes(ArrayPtr<char_t> chars, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | 要编码的字符。 |
| char_index | int | 字符切片起始位置。 |
| char_count | int | 要转换的字符数。 |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) 用于放置字符。 |
| byte_index | int | 输出缓冲区偏移量。 |

### ReturnValue

已写入的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(ArrayPtr\<char_t\>, int, int) method


获取对字符缓冲区进行编码后产生的字节。

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int index, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | 要编码的字符。 |
| 索引 | int | 字符切片起始位置。 |
| count | int | 要转换的字符数。 |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(const char_t *, int, uint8_t *, int) method


获取对字符缓冲区进行编码后产生的字节。

```cpp
int System::Text::UTF7Encoding::GetBytes(const char_t *chars, int char_count, uint8_t *bytes, int byte_count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | const char_t * | 要编码的字符。 |
| char_count | int | 要转换的字符数。 |
| bytes | uint8_t * | [Buffer](../../../system/buffer/) 用于放置字符。 |
| byte_count | int | 输出缓冲区大小。 |

### ReturnValue

已写入的字节数。

## 另见

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(const String\&) method


获取对字符缓冲区进行编码后产生的字节。

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const String &s)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) 用于编码。 |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(const String\&, int, int, ArrayPtr\<uint8_t\>, int) method


获取对字符缓冲区进行编码后产生的字节。

```cpp
int System::Text::UTF7Encoding::GetBytes(const String &s, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) 用于编码。 |
| char_index | int | 字符切片起始位置。 |
| char_count | int | 要转换的字符数。 |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) 用于放置字符。 |
| byte_index | int | 输出缓冲区偏移量。 |

### ReturnValue

已写入的字节数。

## 另见

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(const System::Details::ArrayView\<char_t\>\&, int, int) method


获取对字符缓冲区进行编码后产生的字节。

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::ArrayView<char_t> &chars, int index, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | const System::Details::ArrayView\<char_t\>\& | 要编码的字符。 |
| 索引 | int | 字符切片起始位置。 |
| count | int | 要转换的字符数。 |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(const System::Details::StackArray\<char_t, N\>\&, int, int) method


获取对字符缓冲区进行编码后产生的字节。

```cpp
template<std::size_t> ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::StackArray<char_t, N> &chars, int index, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | const System::Details::StackArray\<char_t, N\>\& | 要编码的字符。 |
| 索引 | int | 字符切片起始位置。 |
| count | int | 要转换的字符数。 |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) method


获取对字符缓冲区进行编码后产生的字节。

```cpp
virtual int System::Text::Encoding::GetBytes(System::Details::ArrayView<char_t> chars, int char_index, int char_count, System::Details::ArrayView<uint8_t> bytes, int byte_index)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | System::Details::ArrayView\<char_t\> | 要编码的字符。 |
| char_index | int | 字符切片起始位置。 |
| char_count | int | 要转换的字符数。 |
| bytes | System::Details::ArrayView\<uint8_t\> | [Buffer](../../../system/buffer/) 用于放置字符。 |
| byte_index | int | 输出缓冲区偏移量。 |

### ReturnValue

已写入的字节数。

## 另见

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) method


获取对字符缓冲区进行编码后产生的字节。

```cpp
template<std::size_t,std::size_t> int System::Text::Encoding::GetBytes(System::Details::StackArray<char_t, SC> &chars, int char_index, int char_count, System::Details::StackArray<uint8_t, SB> &bytes, int byte_index)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | System::Details::StackArray\<char_t, SC\>\& | 要编码的字符。 |
| char_index | int | 字符切片起始位置。 |
| char_count | int | 要转换的字符数。 |
| bytes | System::Details::StackArray\<uint8_t, SB\>\& | [Buffer](../../../system/buffer/) 用于放置字符。 |
| byte_index | int | 输出缓冲区偏移量。 |

### ReturnValue

已写入的字节数。

## 另见

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
