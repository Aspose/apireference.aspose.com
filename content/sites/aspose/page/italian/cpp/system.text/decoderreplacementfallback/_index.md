---
title: "System::Text::DecoderReplacementFallback class"
linktitle: "DecoderReplacementFallback"
second_title: "Aspose.Page per C++"
description: "System::Text::DecoderReplacementFallback class. Fornisce una strategia di fallback che sostituisce il simbolo errato con un segnaposto. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 700
url: /it/cpp/system.text/decoderreplacementfallback/
---
## DecoderReplacementFallback class


Fornisce una strategia di fallback che sostituisce il simbolo errato con un segnaposto. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class DecoderReplacementFallback : public System::Text::DecoderFallback
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Crea il buffer di fallback. |
| [DecoderReplacementFallback](./decoderreplacementfallback/)() | Costruttore che utilizza la stringa di sostituzione predefinita "?". |
| [DecoderReplacementFallback](./decoderreplacementfallback/)(const String\&) | Costruttore. |
| [get_DefaultString](./get_defaultstring/)() const | Ottiene la stringa di sostituzione. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Ottiene il conteggio massimo di caratteri che l'istanza può restituire. |
## Vedi anche

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
