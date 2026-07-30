---
title: "System::Text::DecoderFallbackBuffer::Fallback 方法"
linktitle: "Fallback"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::DecoderFallbackBuffer::Fallback 方法。实现实际的回退过程（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.text/decoderfallbackbuffer/fallback/
---
## DecoderFallbackBuffer::Fallback method


实现实际的回退过程。

```cpp
virtual bool System::Text::DecoderFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) 包含解码器无法解码的字节的字节数组。 |
| 索引 | int | 触发错误的字节索引。 |

### ReturnValue

如果缓冲区处理未知字节则为 true，否则忽略它们则为 false。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
