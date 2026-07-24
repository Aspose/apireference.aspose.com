---
title: "System::Text::UnicodeEncoding class"
linktitle: "UnicodeEncoding"
second_title: "Aspose.Page voor C++"
description: "System::Text::UnicodeEncoding‑klasse. Unicode‑codering. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2500
url: /nl/cpp/system.text/unicodeencoding/
---
## UnicodeEncoding class


Unicode‑codering. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class UnicodeEncoding : public System::Text::ICUEncoding
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() override | Kopieert coderingsobject. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vergelijkt coderingen. |
| [GetHashCode](./gethashcode/)() const override | Hasht codering. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Haal het maximale aantal bytes op dat nodig is om een opgegeven aantal tekens te coderen. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Haal het maximale aantal tekens op dat nodig is om een opgegeven aantal bytes te decoderen. |
| [GetPreamble](./getpreamble/)() override | Retourneert een reeks bytes die de codering aanduidt (bijv. BOM). |
| [operator==](./operator==/)(const UnicodeEncoding\&) const | Vergelijkt coderingen op codepagina's en vlaggen. |
| [UnicodeEncoding](./unicodeencoding/)() | Constructor. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool) | Constructor. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool, bool) | Constructor. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static constexpr [BIG_UNICODE_CODE_PAGE](./big_unicode_code_page/) | Big‑endian codepaginanummer. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Standaardwaarde van de codepagina. |
| static constexpr [UNICODE_CODE_PAGE](./unicode_code_page/) | Little‑endian codepaginanummer. |
## Zie ook

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
