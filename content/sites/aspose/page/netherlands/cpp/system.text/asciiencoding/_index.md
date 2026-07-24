---
title: "System::Text::ASCIIEncoding klasse"
linktitle: "ASCIIEncoding"
second_title: "Aspose.Page voor C++"
description: "System::Text::ASCIIEncoding klasse. Vertegenwoordigt ASCII‑codering. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.text/asciiencoding/
---
## ASCIIEncoding class


Vertegenwoordigt ASCII‑codering. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ASCIIEncoding : public System::Text::ICUEncoding
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ASCIIEncoding](./asciiencoding/)() | Constructor. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Haalt het maximale aantal bytes op dat nodig is om een string met een bekend aantal tekens op te slaan. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Haal het maximale aantal tekens op dat nodig is om een opgegeven aantal bytes te decoderen. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static constexpr [ASCII_CODE_PAGE](./ascii_code_page/) | RTTI. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Standaardwaarde van de codepagina. |
## Zie ook

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
