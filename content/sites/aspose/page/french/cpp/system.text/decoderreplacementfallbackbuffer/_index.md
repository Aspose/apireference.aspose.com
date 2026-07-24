---
title: "System::Text::DecoderReplacementFallbackBuffer classe"
linktitle: "DecoderReplacementFallbackBuffer"
second_title: "Aspose.Page pour C++"
description: "System::Text::DecoderReplacementFallbackBuffer classe. Tampon pour remplacer la stratégie de secours de décodage en C++."
type: docs
weight: 800
url: /fr/cpp/system.text/decoderreplacementfallbackbuffer/
---
## DecoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing decoding fallback strategy.

```cpp
class DecoderReplacementFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [DecoderReplacementFallbackBuffer](./decoderreplacementfallbackbuffer/)(const DecoderReplacementFallbackPtr\&) | Constructeur. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | Gère les échecs de décodage. |
| [get_Remaining](./get_remaining/)() const override | Obtient le nombre de caractères restants dans le tampon. |
| [GetNextChar](./getnextchar/)() override | Obtient le caractère suivant disponible. |
| [MovePrevious](./moveprevious/)() override | Se déplace au caractère précédent. |
| [Reset](./reset/)() override | Réinitialise le tampon à l'état initial (avant l'appel de [Fallback()](./fallback/)). |
## Voir aussi

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
