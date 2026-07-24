---
title: "System::Globalization::TextInfo klasse"
linktitle: "TextInfo"
second_title: "Aspose.Page voor C++"
description: "System::Globalization::TextInfo klasse. Definieert op de locale gebaseerde teksteigenschappen. Setter‑bewerkingen zijn alleen ingeschakeld voor objecten die niet alleen‑lezen zijn. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze aan functies door te geven als argument in C++."
type: docs
weight: 2800
url: /nl/cpp/system.globalization/textinfo/
---
## TextInfo class


Definieert op de locale gebaseerde teksteigenschappen. Setter‑bewerkingen zijn alleen ingeschakeld voor objecten die niet alleen‑lezen zijn. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze aan functies door te geven als argument.

```cpp
class TextInfo : public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() override | RTTI-informatie. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_ANSICodePage](./get_ansicodepage/)() const | Haalt ANSI‑codepagina op. |
| [get_CultureName](./get_culturename/)() const | Haalt cultuurnaam op. |
| virtual [get_EBCDICCodePage](./get_ebcdiccodepage/)() const | Haalt EBCDIC‑codepagina op. |
| [get_IsReadOnly](./get_isreadonly/)() const | Controleert of de opmaak alleen-lezen is. |
| [get_IsRightToLeft](./get_isrighttoleft/)() const | Controleert of tekst van links naar rechts is geschreven. |
| [get_LCID](./get_lcid/)() const | Haalt locale‑ID op. |
| virtual [get_ListSeparator](./get_listseparator/)() const | Haalt lijstscheidingsteken op. |
| virtual [get_MacCodePage](./get_maccodepage/)() const | Haalt Macintosh‑codepagina op. |
| virtual [get_OEMCodePage](./get_oemcodepage/)() const | Haalt OEM‑codepagina op. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| [operator=](./operator=/)(const TextInfo\&) |  |
| static [ReadOnly](./readonly/)(const TextInfoPtr\&) | Haalt een alleen‑lezen versie van de cultuur op. |
| virtual [set_ListSeparator](./set_listseparator/)(String) | Stelt lijstscheidingsteken in. |
| [TextInfo](./textinfo/)(const TextInfo\&) | RTTI-informatie. |
| virtual [ToLower](./tolower/)(char_t) const | Converteert teken naar kleine letters. |
| virtual [ToLower](./tolower/)(String) const | Converteert tekenreeks naar kleine letters. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| [ToTitleCase](./totitlecase/)(String) const | Converteert tekenreeks naar titelcase (behalve voor acroniemen die al in hoofdletters staan). |
| virtual [ToUpper](./toupper/)(char_t) const | Converteert teken naar hoofdletters. |
| virtual [ToUpper](./toupper/)(String) const | Converteert tekenreeks naar hoofdletters. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
