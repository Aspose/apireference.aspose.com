---
title: "System::Text::Encoder::GetByteCount 方法"
linktitle: "GetByteCount"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::Encoder::GetByteCount 方法。获取在 C++ 中对缓冲区进行编码所需的字节数。"
type: docs
weight: 400
url: /zh/cpp/system.text/encoder/getbytecount/
---
## Encoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


获取编码缓冲区所需的字节数。

```cpp
virtual int System::Text::Encoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | 要编码的字符。 |
| index | int | [Buffer](../../../system/buffer/) 偏移。 |
| count | int | 要编码的字符数。 |
| flush | bool | 如果为 true，则在计算后清除内部编码器状态。 |

### ReturnValue

对缓冲区进行编码所需的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoder::GetByteCount(const char_t *, int, bool) method


获取编码缓冲区所需的字节数。

```cpp
virtual int System::Text::Encoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| chars | const char_t * | 要编码的字符。 |
| count | int | 要编码的字符数。 |
| flush | bool | 如果为 true，则在计算后清除内部编码器状态。 |

### ReturnValue

对缓冲区进行编码所需的字节数。

## 另见

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
