---
title: "System::Text::EncoderReplacementFallbackBuffer::Fallback 方法"
linktitle: "Fallback"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::EncoderReplacementFallbackBuffer::Fallback 方法。处理 C++ 中的编码失败。"
type: docs
weight: 200
url: /zh/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


处理编码失败。

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| charUnknown | char_t | 未知字符；已忽略。 |
| 索引 | int | 未知字符位置；已忽略。 |

### ReturnValue

如果提供了替换字符串且非空，则为 true；否则为 false。

## 另见

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


处理编码失败。

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| charUnknownHigh | char_t | 触发错误的代理对的高位部分。 |
| charUnknownLow | char_t | 触发错误的代理对的低位部分。 |
| 索引 | int | 未知字符位置；已忽略。 |

### ReturnValue

如果提供了替换字符串且非空，则为 true；否则为 false。

## 另见

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
