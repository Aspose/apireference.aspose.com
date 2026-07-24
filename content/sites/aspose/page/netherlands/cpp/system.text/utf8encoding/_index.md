---
title: "System::Text::UTF8Encoding klasse"
linktitle: "UTF8Encoding"
second_title: "Aspose.Page voor C++"
description: "System::Text::UTF8Encoding klasse. UTF-8‑codering. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2800
url: /nl/cpp/system.text/utf8encoding/
---
## UTF8Encoding class


UTF-8‑codering. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik die pointer om deze als argument aan functies door te geven.

```cpp
class UTF8Encoding : public System::Text::ICUEncoding
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() override | Kopieert coderingsobject. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vergelijkt met object. |
| [GetHashCode](./gethashcode/)() const override | Haalt de hashcode van de codering op. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Haal het maximale aantal bytes op dat nodig is om een opgegeven aantal tekens te coderen. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Haal het maximale aantal tekens op dat nodig is om een opgegeven aantal bytes te decoderen. |
| [GetPreamble](./getpreamble/)() override | Haal de preambule van de codepagina op. |
| [operator==](./operator==/)(const UTF8Encoding\&) const | Vergelijkt parameters van coderingen. |
| [UTF8Encoding](./utf8encoding/)() | Constructor. |
| [UTF8Encoding](./utf8encoding/)(bool) | Constructor. |
| [UTF8Encoding](./utf8encoding/)(bool, bool) | Constructor. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Standaardwaarde van de codepagina. |
| static constexpr [UTF8_CODE_PAGE](./utf8_code_page/) | RTTI-informatie. |
## Zie ook

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
