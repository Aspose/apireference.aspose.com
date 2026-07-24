---
title: "System::Text::DecoderReplacementFallbackBuffer klasse"
linktitle: "DecoderReplacementFallbackBuffer"
second_title: "Aspose.Page voor C++"
description: "System::Text::DecoderReplacementFallbackBuffer klasse. Buffer voor het vervangen van de decodeer‑fallback‑strategie in C++."
type: docs
weight: 800
url: /nl/cpp/system.text/decoderreplacementfallbackbuffer/
---
## DecoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing decoding fallback strategy.

```cpp
class DecoderReplacementFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [DecoderReplacementFallbackBuffer](./decoderreplacementfallbackbuffer/)(const DecoderReplacementFallbackPtr\&) | Constructor. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | Verwerkt decodeerfout. |
| [get_Remaining](./get_remaining/)() const override | Haalt het aantal resterende tekens in de buffer op. |
| [GetNextChar](./getnextchar/)() override | Haalt het volgende beschikbare teken op. |
| [MovePrevious](./moveprevious/)() override | Verplaatst naar het vorige teken. |
| [Reset](./reset/)() override | Reset de buffer naar de initiële staat (voor de [Fallback()](./fallback/) aanroep). |
## Zie ook

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
