---
title: "System::Text::DecoderExceptionFallbackBuffer::Fallback 方法"
linktitle: "Fallback"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::DecoderExceptionFallbackBuffer::Fallback 方法。 在 C++ 中处理解码失败。"
type: docs
weight: 200
url: /zh/cpp/system.text/decoderexceptionfallbackbuffer/fallback/
---
## DecoderExceptionFallbackBuffer::Fallback method


处理解码失败。

```cpp
virtual bool System::Text::DecoderExceptionFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) 未知字节数组；已忽略。 |
| 索引 | int | 未知字节偏移量；已忽略。 |

### ReturnValue

从不实际返回，而是抛出异常。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
