---
title: "System::Text::DecoderReplacementFallbackBuffer::Fallback 方法"
linktitle: "Fallback"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::DecoderReplacementFallbackBuffer::Fallback 方法。处理 C++ 中的解码失败。"
type: docs
weight: 200
url: /zh/cpp/system.text/decoderreplacementfallbackbuffer/fallback/
---
## DecoderReplacementFallbackBuffer::Fallback method


处理解码失败。

```cpp
virtual bool System::Text::DecoderReplacementFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) 未知字节数组；已忽略。 |
| 索引 | int | 未知字节偏移量；已忽略。 |

### ReturnValue

如果提供了替换字符串且非空，则为 true；否则为 false。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
