---
title: "System::Text::EncoderExceptionFallback klasse"
linktitle: "EncoderExceptionFallback"
second_title: "Aspose.Page voor C++"
description: "System::Text::EncoderExceptionFallback klasse. Biedt een fallback-strategie die een uitzondering gooit. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1000
url: /nl/cpp/system.text/encoderexceptionfallback/
---
## EncoderExceptionFallback class


Biedt een fallback‑strategie die een uitzondering gooit. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class EncoderExceptionFallback : public System::Text::EncoderFallback
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Maakt fallback‑buffer aan. |
| [EncoderExceptionFallback](./encoderexceptionfallback/)() | Constructor. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Haalt het maximale aantal tekens op dat de instantie kan retourneren. |
## Zie ook

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
