---
title: "System::Text::DecoderExceptionFallbackBuffer class"
linktitle: "DecoderExceptionFallbackBuffer"
second_title: "Aspose.Font per C++"
description: "System::Text::DecoderExceptionFallbackBuffer class. Buffer per la strategia di fallback di decodifica che lancia eccezioni. Non memorizza nulla effettivamente, ma lancia un'eccezione. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system.text/decoderexceptionfallbackbuffer/
---
## DecoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing decoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DecoderExceptionFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DecoderExceptionFallbackBuffer](./decoderexceptionfallbackbuffer/)() | Costruttore. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | Gestisce il fallimento della decodifica. |
| [get_Remaining](./get_remaining/)() const override | Restituisce il numero di caratteri rimanenti. |
| [GetNextChar](./getnextchar/)() override | Ottiene il prossimo carattere disponibile. |
| [MovePrevious](./moveprevious/)() override | Sposta al carattere precedente. |
## Vedi anche

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
