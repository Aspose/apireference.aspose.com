---
title: "Classe System::Text::DecoderReplacementFallback"
linktitle: "DecoderReplacementFallback"
second_title: "Aspose.Font per C++"
description: "Classe System::Text::DecoderReplacementFallback. Fornisce una strategia di fallback che sostituisce i simboli errati con un segnaposto. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 700
url: /it/cpp/system.text/decoderreplacementfallback/
---
## DecoderReplacementFallback class


Fornisce una strategia di fallback che sostituisce i simboli errati con un segnaposto. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

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
* Library [Aspose.Font for C++](../../)
