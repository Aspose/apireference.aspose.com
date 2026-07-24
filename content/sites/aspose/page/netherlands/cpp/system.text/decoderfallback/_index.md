---
title: "System::Text::DecoderFallback klasse"
linktitle: "DecoderFallback"
second_title: "Aspose.Page voor C++"
description: "System::Text::DecoderFallback klasse. Biedt een fallback‑API om decodeerfouten af te handelen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject() function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 500
url: /nl/cpp/system.text/decoderfallback/
---
## DecoderFallback class


Biedt een fallback‑API om decodeerfouten af te handelen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/) function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class DecoderFallback : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | Haalt de buffer op die geassocieerd is met het fallback‑algoritme. |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | Haalt de standaard‑exception‑fallback‑implementatie op. |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | Haalt het maximale aantal tekens op dat door fallback kan worden geretourneerd. |
| static [get_ReplacementFallback](./get_replacementfallback/)() | Haalt de standaard vervangings‑fallback‑implementatie op. |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | Haalt de standaard veilige fallback‑implementatie op. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
