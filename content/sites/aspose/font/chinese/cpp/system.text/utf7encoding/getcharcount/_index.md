---
title: "System::Text::UTF7Encoding::GetCharCount 方法"
linktitle: "GetCharCount"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::UTF7Encoding::GetCharCount 方法。获取在 C++ 中解码字节缓冲区所需的字符数。"
type: docs
weight: 600
url: /zh/cpp/system.text/utf7encoding/getcharcount/
---
## UTF7Encoding::GetCharCount(ArrayPtr\<uint8_t\>) method


获取对字节缓冲区进行解码所需的字符数。

```cpp
virtual int System::Text::Encoding::GetCharCount(ArrayPtr<uint8_t> bytes)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字节 | ArrayPtr\<uint8_t\> | 待解码的字节。 |

### ReturnValue

字符数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetCharCount(ArrayPtr\<uint8_t\>, int, int) method


获取对字节缓冲区进行解码所需的字符数。

```cpp
int System::Text::UTF7Encoding::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字节 | ArrayPtr\<uint8_t\> | 待解码的字节。 |
| 索引 | int | 切片起始位置。 |
| count | int | 切片大小。 |

### ReturnValue

字符数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetCharCount(const uint8_t *, int) method


获取对字节缓冲区进行解码所需的字符数。

```cpp
int System::Text::UTF7Encoding::GetCharCount(const uint8_t *bytes, int count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字节 | const uint8_t * | 待解码的字节。 |
| count | int | 字节计数。 |

### ReturnValue

字符数。

## 另见

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
