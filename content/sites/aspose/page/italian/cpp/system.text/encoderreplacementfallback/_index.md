---
title: "classe System::Text::EncoderReplacementFallback"
linktitle: "EncoderReplacementFallback"
second_title: "Aspose.Page per C++"
description: "classe System::Text::EncoderReplacementFallback. Fornisce una strategia di fallback che sostituisce il simbolo errato con un segnaposto. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1400
url: /it/cpp/system.text/encoderreplacementfallback/
---
## EncoderReplacementFallback class


Fornisce una strategia di fallback che sostituisce il simbolo errato con un segnaposto. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

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
* Library [Aspose.Page for C++](../../)
