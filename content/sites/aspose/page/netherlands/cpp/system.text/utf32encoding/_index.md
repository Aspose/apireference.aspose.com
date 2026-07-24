---
title: "System::Text::UTF32Encoding klasse"
linktitle: "UTF32Encoding"
second_title: "Aspose.Page voor C++"
description: "System::Text::UTF32Encoding klasse. UTF-32‑codering. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2600
url: /nl/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


UTF-32 codering. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class UTF32Encoding : public System::Text::ICUEncoding
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() override | Kopieert coderingsobject. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vergelijkt met object. |
| [GetHashCode](./gethashcode/)() const override | Haalt de hashcode van de codering op. |
| [GetPreamble](./getpreamble/)() override | Haal de preambule van de codepagina op. |
| [operator==](./operator==/)(const UTF32Encoding\&) const | Vergelijkt de parameters van coderingen. |
| [UTF32Encoding](./utf32encoding/)() | Constructor. |
| [UTF32Encoding](./utf32encoding/)(bool, bool) | Constructor. |
| [UTF32Encoding](./utf32encoding/)(bool, bool, bool) | Constructor. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | Magisch getal gebruikt door [Windows](../../system.windows/) voor big‑endian UTF-32 codepagina‑id. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Standaardwaarde van de codepagina. |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | Magisch getal gebruikt door [Windows](../../system.windows/) voor little‑endian UTF-32 codepagina‑id. |
## Zie ook

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
