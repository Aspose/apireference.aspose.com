---
title: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue klasse"
linktitle: "MediaTypeWithQualityHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue klasse. Stelt een MIME‑type met een extra kwaliteitsfactor in een waarde van de ''Content-Type'' header voor. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 1300
url: /nl/cpp/system.net.http.headers/mediatypewithqualityheadervalue/
---
## MediaTypeWithQualityHeaderValue class


Stelt een MIME‑type met een extra kwaliteitsfactor in een waarde van de 'Content-Type' header voor. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class MediaTypeWithQualityHeaderValue : public System::Net::Http::Headers::MediaTypeHeaderValue
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Quality](./get_quality/)() | RTTI-informatie. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)() | Construeert een nieuw exemplaar. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String) | Construeert een nieuw exemplaar. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String, double) | Construeert een nieuw exemplaar. |
| static [Parse](./parse/)(String) | Converteert een opgegeven tekenreeks naar een instantie van de [MediaTypeWithQualityHeaderValue](./) klasse. |
| [set_Quality](./set_quality/)(Nullable\<double\>) | Stelt een kwaliteitswaarde in. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeWithQualityHeaderValue\>\&) | Probeert een opgegeven tekenreeks te converteren naar een instantie van de [MediaTypeWithQualityHeaderValue](./) klasse. |
## Zie ook

* Class [MediaTypeHeaderValue](../mediatypeheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
