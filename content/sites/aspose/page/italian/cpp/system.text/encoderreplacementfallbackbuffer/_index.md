---
title: "System::Text::EncoderReplacementFallbackBuffer classe"
linktitle: "EncoderReplacementFallbackBuffer"
second_title: "Aspose.Page per C++"
description: "Classe System::Text::EncoderReplacementFallbackBuffer. Buffer per la sostituzione della strategia di fallback della codifica. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1500
url: /it/cpp/system.text/encoderreplacementfallbackbuffer/
---
## EncoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing encoding fallback strategy. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderReplacementFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [EncoderReplacementFallbackBuffer](./encoderreplacementfallbackbuffer/)(const EncoderReplacementFallbackPtr\&) | Costruttore. |
| [Fallback](./fallback/)(char_t, int) override | Gestisce il fallimento della codifica. |
| [Fallback](./fallback/)(char_t, char_t, int) override | Gestisce il fallimento della codifica. |
| [get_Remaining](./get_remaining/)() const override | Ottiene il numero di caratteri rimanenti nel buffer. |
| [GetNextChar](./getnextchar/)() override | Ottiene il prossimo carattere disponibile. |
| [MovePrevious](./moveprevious/)() override | Si sposta al carattere precedente. |
| [Reset](./reset/)() override | Reimposta il buffer allo stato iniziale (prima della chiamata a [Fallback()](./fallback/)). |
## Vedi anche

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
