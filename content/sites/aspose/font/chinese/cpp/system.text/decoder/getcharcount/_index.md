---
title: "System::Text::Decoder::GetCharCount 方法"
linktitle: "GetCharCount"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::Decoder::GetCharCount 方法。获取在 C++ 中解码缓冲区所需的字符数。"
type: docs
weight: 400
url: /zh/cpp/system.text/decoder/getcharcount/
---
## Decoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int) method


获取解码缓冲区所需的字符数。

```cpp
virtual int System::Text::Decoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字节 | ArrayPtr\<uint8_t\> | 待解码的字节。 |
| index | int | [Buffer](../../../system/buffer/) 偏移。 |
| count | int | 要解码的字节数。 |

### ReturnValue

解码缓冲区所需的字符数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Decoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int, bool) method


获取解码缓冲区所需的字符数。

```cpp
virtual int System::Text::Decoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count, bool flush)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字节 | ArrayPtr\<uint8_t\> | 待解码的字节。 |
| index | int | [Buffer](../../../system/buffer/) 偏移。 |
| count | int | 要解码的字节数。 |
| flush | bool | 如果为 true，则在计算后清除内部解码器状态。 |

### ReturnValue

解码缓冲区所需的字符数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Decoder::GetCharCount(const uint8_t *, int, bool) method


获取解码缓冲区所需的字符数。

```cpp
virtual int System::Text::Decoder::GetCharCount(const uint8_t *bytes, int count, bool flush)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字节 | const uint8_t * | 待解码的字节。 |
| count | int | 要解码的字节数。 |
| flush | bool | 如果为 true，则在计算后清除内部解码器状态。 |

### ReturnValue

解码缓冲区所需的字符数。

## 另见

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
