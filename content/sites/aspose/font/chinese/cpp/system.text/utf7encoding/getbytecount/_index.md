---
title: "System::Text::UTF7Encoding::GetByteCount 方法"
linktitle: "GetByteCount"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::UTF7Encoding::GetByteCount 方法。获取在 C++ 中对字符缓冲区进行编码所需的字符数。"
type: docs
weight: 400
url: /zh/cpp/system.text/utf7encoding/getbytecount/
---
## UTF7Encoding::GetByteCount(ArrayPtr\<char_t\>) method


获取对字符缓冲区进行编码所需的字符数。

```cpp
virtual int System::Text::Encoding::GetByteCount(ArrayPtr<char_t> chars)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | 字符缓冲区。 |

### ReturnValue

所需缓冲区大小。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetByteCount(ArrayPtr\<char_t\>, int, int) method


获取对字符缓冲区进行编码所需的字符数。

```cpp
virtual int System::Text::Encoding::GetByteCount(ArrayPtr<char_t> chars, int index, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | 字符缓冲区。 |
| 索引 | int | 切片开始。 |
| count | int | 切片大小。 |

### ReturnValue

所需缓冲区大小。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetByteCount(const char_t *, int) method


获取对字符缓冲区进行编码所需的字符数。

```cpp
int System::Text::UTF7Encoding::GetByteCount(const char_t *chars, int count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | const char_t * | 字符缓冲区。 |
| count | int | [Buffer](../../../system/buffer/) 大小。 |

### ReturnValue

所需缓冲区大小。

## 另见

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetByteCount(const String\&) method


获取对字符串进行编码所需的字符数。

```cpp
virtual int System::Text::Encoding::GetByteCount(const String &s)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) 用于编码。 |

### ReturnValue

所需缓冲区大小。

## 另见

* Class [String](../../../system/string/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetByteCount(const System::Details::StackArray\<char_t, N\>\&, int, int) method


获取对字符缓冲区进行编码所需的字符数。

```cpp
template<std::size_t> int System::Text::Encoding::GetByteCount(const System::Details::StackArray<char_t, N> &chars, int index, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | const System::Details::StackArray\<char_t, N\>\& | 字符缓冲区。 |
| 索引 | int | 切片开始。 |
| count | int | 切片大小。 |

### ReturnValue

所需缓冲区大小。

## 另见

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetByteCount(System::Details::ArrayView\<char_t\>, int, int) method


获取对字符缓冲区进行编码所需的字符数。

```cpp
virtual int System::Text::Encoding::GetByteCount(System::Details::ArrayView<char_t> chars, int index, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | System::Details::ArrayView\<char_t\> | 字符缓冲区。 |
| 索引 | int | 切片开始。 |
| count | int | 切片大小。 |

### ReturnValue

所需缓冲区大小。

## 另见

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
