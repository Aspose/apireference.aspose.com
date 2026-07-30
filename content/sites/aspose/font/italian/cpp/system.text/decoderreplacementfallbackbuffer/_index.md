---
title: "System::Text::DecoderReplacementFallbackBuffer classe"
linktitle: "DecoderReplacementFallbackBuffer"
second_title: "Aspose.Font per C++"
description: "System::Text::DecoderReplacementFallbackBuffer classe. Buffer per sostituire la strategia di fallback di decodifica in C++."
type: docs
weight: 800
url: /it/cpp/system.text/decoderreplacementfallbackbuffer/
---
## DecoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing decoding fallback strategy.

```cpp
class DecoderReplacementFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DecoderReplacementFallbackBuffer](./decoderreplacementfallbackbuffer/)(const DecoderReplacementFallbackPtr\&) | Costruttore. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | Gestisce il fallimento della decodifica. |
| [get_Remaining](./get_remaining/)() const override | Ottiene il numero di caratteri rimanenti nel buffer. |
| [GetNextChar](./getnextchar/)() override | Ottiene il prossimo carattere disponibile. |
| [MovePrevious](./moveprevious/)() override | Sposta al carattere precedente. |
| [Reset](./reset/)() override | Reimposta il buffer allo stato iniziale (prima della chiamata a [Fallback()](./fallback/)). |
## Vedi anche

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
