---
title: "System::Text::EncoderFallbackBuffer::Fallback 方法"
linktitle: "Fallback"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::EncoderFallbackBuffer::Fallback 方法。在 C++ 中实现实际的回退过程。"
type: docs
weight: 100
url: /zh/cpp/system.text/encoderfallbackbuffer/fallback/
---
## EncoderFallbackBuffer::Fallback(char_t, int) method


实现实际的回退过程。

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknown, int index)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| charUnknown | char_t | 字符编码器编码失败。 |
| 索引 | int | 触发错误的字符索引。 |

### ReturnValue

如果缓冲区处理未知字符则为 true，若忽略它们则为 false。

## 另见

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## EncoderFallbackBuffer::Fallback(char_t, char_t, int) method


实现实际的回退过程。

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| charUnknownHigh | char_t | 触发错误的代理对的高位部分。 |
| charUnknownLow | char_t | 触发错误的代理对的低位部分。 |
| 索引 | int | 触发错误的字符索引。 |

### ReturnValue

如果缓冲区处理未知字符则为 true，若忽略它们则为 false。

## 另见

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
