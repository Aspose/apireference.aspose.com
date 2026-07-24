---
title: "System::Globalization::StringInfo class"
linktitle: "StringInfo"
second_title: "Aspose.Page voor C++"
description: "System::Globalization::StringInfo klasse. Splitter om door tekenreeksdelen te itereren. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 2400
url: /nl/cpp/system.globalization/stringinfo/
---
## StringInfo class


Splitter om door tekenreeksdelen te itereren. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class StringInfo : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LengthInTextElements](./get_lengthintextelements/)() const | Haalt het aantal tekstelementen op in het [StringInfo](./) object. |
| [get_String](./get_string/)() const | Haalt de waarde op van het [StringInfo](./) object. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&) | Haalt het eerste element op in de opgegeven tekenreeks. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&, int) | Haalt het element op op de opgegeven index van de opgegeven tekenreeks. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&) | Maakt een enumerator om door de tekens van de tekenreeks te itereren. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&, int) | Maakt een enumerator om door de tekens van de tekenreeks te itereren, beginnend bij de opgegeven index. |
| [operator=](./operator=/)(const StringInfo\&) |  |
| static [ParseCombiningCharacters](./parsecombiningcharacters/)(const String\&) | Haalt de indexen op van de basis‑tekens, high surrogates en controle‑tekens. |
| [set_String](./set_string/)(const String\&) | Stelt de waarde in van het [StringInfo](./) object. |
| [StringInfo](./stringinfo/)() | RTTI-informatie. |
| [StringInfo](./stringinfo/)(const String\&) | Constructor. |
| [StringInfo](./stringinfo/)(const StringInfo\&) |  |
| [SubstringByTextElements](./substringbytextelements/)(int) const | Haalt een subreeks op van tekstelementen vanaf het opgegeven tekstelement tot het laatste tekstelement. |
| [SubstringByTextElements](./substringbytextelements/)(int, int) const | Haalt een subreeks op van tekstelementen vanaf het opgegeven tekstelement tot het opgegeven aantal tekstelementen. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
