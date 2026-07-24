---
title: "System::Text::DecoderReplacementFallbackBuffer Klasse"
linktitle: "DecoderReplacementFallbackBuffer"
second_title: "Aspose.Page für C++"
description: "System::Text::DecoderReplacementFallbackBuffer Klasse. Puffer zum Ersetzen der Dekodierungs‑Fallback‑Strategie in C++."
type: docs
weight: 800
url: /de/cpp/system.text/decoderreplacementfallbackbuffer/
---
## DecoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing decoding fallback strategy.

```cpp
class DecoderReplacementFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DecoderReplacementFallbackBuffer](./decoderreplacementfallbackbuffer/)(const DecoderReplacementFallbackPtr\&) | Konstruktor. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | Behandelt Dekodierungsfehler. |
| [get_Remaining](./get_remaining/)() const override | Ermittelt die Anzahl der verbleibenden Zeichen im Puffer. |
| [GetNextChar](./getnextchar/)() override | Ermittelt das nächste verfügbare Zeichen. |
| [MovePrevious](./moveprevious/)() override | Wechselt zum vorherigen Zeichen. |
| [Reset](./reset/)() override | Setzt den Puffer auf den Ausgangszustand zurück (vor dem Aufruf von [Fallback()](./fallback/)). |
## Siehe auch

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
