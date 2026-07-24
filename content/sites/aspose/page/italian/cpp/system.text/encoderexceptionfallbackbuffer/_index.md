---
title: "classe System::Text::EncoderExceptionFallbackBuffer"
linktitle: "EncoderExceptionFallbackBuffer"
second_title: "Aspose.Page per C++"
description: "classe System::Text::EncoderExceptionFallbackBuffer. Buffer per la strategia di fallback di codifica che genera eccezioni. Non memorizza realmente nulla, ma lancia eccezioni. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1100
url: /it/cpp/system.text/encoderexceptionfallbackbuffer/
---
## EncoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing encoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderExceptionFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [EncoderExceptionFallbackBuffer](./encoderexceptionfallbackbuffer/)() | Costruttore. |
| [Fallback](./fallback/)(char_t, int) override | Gestisce il fallimento della codifica. |
| [Fallback](./fallback/)(char_t, char_t, int) override | Gestisce il fallimento della codifica. |
| [get_Remaining](./get_remaining/)() const override | Restituisce il numero di caratteri rimanenti. |
| [GetNextChar](./getnextchar/)() override | Ottiene il prossimo carattere disponibile. |
| [MovePrevious](./moveprevious/)() override | Si sposta al carattere precedente. |
## Vedi anche

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
