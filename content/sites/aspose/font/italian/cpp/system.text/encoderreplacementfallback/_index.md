---
title: "classe System::Text::EncoderReplacementFallback"
linktitle: "EncoderReplacementFallback"
second_title: "Aspose.Font per C++"
description: "classe System::Text::EncoderReplacementFallback. Fornisce una strategia di fallback che sostituisce il simbolo errato con un segnaposto. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1400
url: /it/cpp/system.text/encoderreplacementfallback/
---
## EncoderReplacementFallback class


Fornisce una strategia di fallback che sostituisce i simboli errati con un segnaposto. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderReplacementFallback : public System::Text::EncoderFallback
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Crea il buffer di fallback. |
| [EncoderReplacementFallback](./encoderreplacementfallback/)() | Costruttore che utilizza la stringa di sostituzione predefinita "?". |
| [EncoderReplacementFallback](./encoderreplacementfallback/)(const String\&) | Costruttore. |
| [get_DefaultString](./get_defaultstring/)() const | Ottiene la stringa di sostituzione. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Ottiene il conteggio massimo di caratteri che l'istanza può restituire. |
## Vedi anche

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
