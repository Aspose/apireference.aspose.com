---
title: "System::Text::EncoderFallback classe"
linktitle: "EncoderFallback"
second_title: "Aspose.Font per C++"
description: "System::Text::EncoderFallback classe. Fornisce un'API di fallback per gestire gli errori di codifica. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1200
url: /it/cpp/system.text/encoderfallback/
---
## EncoderFallback class


Fornisce un'API di fallback per gestire gli errori di codifica. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class EncoderFallback : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | Ottiene il buffer associato all'algoritmo di fallback. |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | Ottiene l'implementazione predefinita di fallback per le eccezioni. |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | Ottiene il numero massimo di caratteri che può essere restituito dal fallback. |
| static [get_ReplacementFallback](./get_replacementfallback/)() | Ottiene l'implementazione predefinita di fallback di sostituzione. |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | Ottiene l'implementazione predefinita di fallback standard sicuro. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
