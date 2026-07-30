---
title: "System::Text::DecoderReplacementFallbackBuffer class"
linktitle: "DecoderReplacementFallbackBuffer"
second_title: "Aspose.Font için C++"
description: "System::Text::DecoderReplacementFallbackBuffer sınıfı. C++'ta kod çözme geri dönüş stratejisini değiştirmek için tampon."
type: docs
weight: 800
url: /tr/cpp/system.text/decoderreplacementfallbackbuffer/
---
## DecoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing decoding fallback strategy.

```cpp
class DecoderReplacementFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [DecoderReplacementFallbackBuffer](./decoderreplacementfallbackbuffer/)(const DecoderReplacementFallbackPtr\&) | Yapıcı. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | Kod çözme hatasını işler. |
| [get_Remaining](./get_remaining/)() const override | Tampondaki kalan karakter sayısını alır. |
| [GetNextChar](./getnextchar/)() override | Sonraki kullanılabilir karakteri alır. |
| [MovePrevious](./moveprevious/)() override | Önceki karaktere hareket eder. |
| [Reset](./reset/)() override | Tamponu başlangıç durumuna sıfırlar ([Fallback()](./fallback/) çağrısından önce). |
## Ayrıca Bakınız

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
