---
title: "System::IO::StringWriter klasse"
linktitle: "StringWriter"
second_title: "Aspose.Page voor C++"
description: "System::IO::StringWriter klasse. Implementeert een TextWriter die informatie naar een string schrijft. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2500
url: /nl/cpp/system.io/stringwriter/
---
## StringWriter class


Implementeert een [TextWriter](../textwriter/) die informatie naar een string schrijft. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class StringWriter : public System::IO::TextWriter
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Retourneert de momenteel gebruikte codering. |
| virtual [GetStringBuilder](./getstringbuilder/)() | Retourneert de momenteel gebruikte StringBuilder. |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&, const IFormatProviderPtr\&) | Construeert een nieuw exemplaar van [StringWriter](./) met behulp van de opgegeven StringBuilder en [IFormatProvider](../../system/iformatprovider/). |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&) | Construeert een nieuw exemplaar van [StringWriter](./) met behulp van de opgegeven StringBuilder en [IFormatProvider](../../system/iformatprovider/) uit de huidige cultuur. |
| [StringWriter](./stringwriter/)(const IFormatProviderPtr\&) | Construeert een nieuw exemplaar van [StringWriter](./) met behulp van de opgegeven [IFormatProvider](../../system/iformatprovider/). |
| [StringWriter](./stringwriter/)() | Construeert een nieuw exemplaar van [StringWriter](./) met behulp van [IFormatProvider](../../system/iformatprovider/) uit de huidige cultuur. |
| [ToString](./tostring/)() const override | Retourneert de onderliggende tekenreeks. |
| [Write](./write/)(char_t) override | Schrijft het opgegeven teken naar de stream. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Schrijft het opgegeven subbereik van tekens uit de opgegeven tekenarray naar de stroom. |
| [Write](./write/)(const String\&) override | Schrijft de opgegeven tekenreeks naar de stream. |
## Zie ook

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
