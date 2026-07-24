---
title: "System::Globalization::IdnMapping klasse"
linktitle: "IdnMapping"
second_title: "Aspose.Page voor C++"
description: "System::Globalization::IdnMapping klasse. IdnMapping wordt gebruikt om namen naar Punycode te mappen. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 1300
url: /nl/cpp/system.globalization/idnmapping/
---
## IdnMapping class


[IdnMapping](./) used to map names to Punycode. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class IdnMapping : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vergelijkt twee [IdnMapping](./) objecten. |
| [get_AllowUnassigned](./get_allowunassigned/)() const | Haalt de vlag op die aangeeft of niet‑toegewezen codepunten worden gebruikt in bewerkingen. |
| [get_UseStd3AsciiRules](./get_usestd3asciirules/)() const | Haalt de vlag op die aangeeft of standaardnaamgevingsconventies worden gebruikt in bewerkingen. |
| [GetAscii](./getascii/)(const String\&) const | [Convert](../../system/convert/) unicode-domeinnaam naar ascii‑equivalent. |
| [GetAscii](./getascii/)(const String\&, int) const | [Convert](../../system/convert/) unicode-domeinnaam naar ascii‑equivalent. |
| [GetAscii](./getascii/)(const String\&, int, int) const | [Convert](../../system/convert/) unicode-domeinnaam naar ascii‑equivalent. |
| [GetHashCode](./gethashcode/)() const override | Haalt de hashcode op voor het huidige [IdnMapping](./) object. |
| [GetUnicode](./getunicode/)(const String\&) const | [Convert](../../system/convert/) ascii-domeinnaam naar unicode‑equivalent. |
| [GetUnicode](./getunicode/)(const String\&, int) const | [Convert](../../system/convert/) ascii-domeinnaam naar unicode‑equivalent. |
| [GetUnicode](./getunicode/)(const String\&, int, int) const | [Convert](../../system/convert/) ascii-domeinnaam naar unicode‑equivalent. |
| [IdnMapping](./idnmapping/)() | RTTI-informatie. |
| [IdnMapping](./idnmapping/)(const IdnMapping\&) |  |
| [operator=](./operator=/)(const IdnMapping\&) |  |
| [set_AllowUnassigned](./set_allowunassigned/)(bool) | Stelt vlag in die aangeeft of niet-toegewezen codepunten worden gebruikt in bewerkingen. |
| [set_UseStd3AsciiRules](./set_usestd3asciirules/)(bool) | Stelt vlag in die aangeeft of standaard naamgevingsconventies worden gebruikt in bewerkingen. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
