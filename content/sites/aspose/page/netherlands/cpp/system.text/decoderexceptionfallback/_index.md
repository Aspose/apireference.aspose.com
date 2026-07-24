---
title: "System::Text::DecoderExceptionFallback klasse"
linktitle: "DecoderExceptionFallback"
second_title: "Aspose.Page voor C++"
description: "System::Text::DecoderExceptionFallback klasse. Biedt een fallback-strategie die een uitzondering gooit. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 300
url: /nl/cpp/system.text/decoderexceptionfallback/
---
## DecoderExceptionFallback class


Biedt een fallback‑strategie die een uitzondering gooit. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class DecoderExceptionFallback : public System::Text::DecoderFallback
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Maakt fallback‑buffer aan. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Haalt het maximale aantal tekens op dat de instantie kan retourneren. |
## Zie ook

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
