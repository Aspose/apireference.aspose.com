---
title: "System::Text::DecoderReplacementFallbackBuffer 类"
linktitle: "DecoderReplacementFallbackBuffer"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::DecoderReplacementFallbackBuffer 类。用于在 C++ 中替换解码回退策略的缓冲区。"
type: docs
weight: 800
url: /zh/cpp/system.text/decoderreplacementfallbackbuffer/
---
## DecoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing decoding fallback strategy.

```cpp
class DecoderReplacementFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [DecoderReplacementFallbackBuffer](./decoderreplacementfallbackbuffer/)(const DecoderReplacementFallbackPtr\&) | 构造函数。 |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | 处理解码失败。 |
| [get_Remaining](./get_remaining/)() const override | 获取缓冲区中剩余字符的数量。 |
| [GetNextChar](./getnextchar/)() override | 获取下一个可用字符。 |
| [MovePrevious](./moveprevious/)() override | 移动到上一个字符。 |
| [Reset](./reset/)() override | 将缓冲区重置为初始状态（在调用 [Fallback()](./fallback/) 之前）。 |
## 另见

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
