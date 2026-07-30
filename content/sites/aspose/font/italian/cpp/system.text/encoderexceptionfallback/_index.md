---
title: "Classe System::Text::EncoderExceptionFallback"
linktitle: "EncoderExceptionFallback"
second_title: "Aspose.Font per C++"
description: "Classe System::Text::EncoderExceptionFallback. Fornisce una strategia di fallback che genera eccezioni. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1000
url: /it/cpp/system.text/encoderexceptionfallback/
---
## EncoderExceptionFallback class


Fornisce una strategia di fallback che lancia eccezioni. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderExceptionFallback : public System::Text::EncoderFallback
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Crea il buffer di fallback. |
| [EncoderExceptionFallback](./encoderexceptionfallback/)() | Costruttore. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Ottiene il conteggio massimo di caratteri che l'istanza può restituire. |
## Vedi anche

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
