---
title: "System::Text::EncoderReplacementFallback klasse"
linktitle: "EncoderReplacementFallback"
second_title: "Aspose.Page voor C++"
description: "System::Text::EncoderReplacementFallback klasse. Biedt een fallback‑strategie waarbij een foutief symbool wordt vervangen door een tijdelijke placeholder. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1400
url: /nl/cpp/system.text/encoderreplacementfallback/
---
## EncoderReplacementFallback class


Biedt een fallback‑strategie waarbij een foutief symbool wordt vervangen door een tijdelijke placeholder. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class EncoderReplacementFallback : public System::Text::EncoderFallback
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Maakt fallback‑buffer aan. |
| [EncoderReplacementFallback](./encoderreplacementfallback/)() | Constructor die de standaard "?" vervangingsreeks gebruikt. |
| [EncoderReplacementFallback](./encoderreplacementfallback/)(const String\&) | Constructor. |
| [get_DefaultString](./get_defaultstring/)() const | Haalt vervangingsreeks op. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Haalt het maximale aantal tekens op dat de instantie kan retourneren. |
## Zie ook

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
