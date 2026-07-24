---
title: "System::Globalization::NumberFormatInfo klasse"
linktitle: "NumberFormatInfo"
second_title: "Aspose.Page voor C++"
description: "System::Globalization::NumberFormatInfo klasse. Bevat informatie over hoe getallen op te maken. Setter‑bewerkingen zijn alleen ingeschakeld voor objecten die niet alleen-lezen zijn. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 1900
url: /nl/cpp/system.globalization/numberformatinfo/
---
## NumberFormatInfo class


Bevat informatie over hoe getallen op te maken. Setter‑bewerkingen zijn alleen ingeschakeld voor objecten die niet alleen‑lezen zijn. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class NumberFormatInfo : public virtual System::Object,
                         public System::IFormatProvider,
                         public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() override | Kopieert opmaakinfo. |
| [get_CurrencyDecimalDigits](./get_currencydecimaldigits/)() const | Haalt het aantal decimale cijfers van de valuta op. |
| [get_CurrencyDecimalSeparator](./get_currencydecimalseparator/)() const | Haalt het decimale scheidingsteken van de valuta op. |
| [get_CurrencyGroupSeparator](./get_currencygroupseparator/)() const | Haalt het valutagroepscheidingsteken op. |
| [get_CurrencyGroupSizes](./get_currencygroupsizes/)() const | Haalt het aantal valutadecimale cijfers per groep op. |
| [get_CurrencyNegativePattern](./get_currencynegativepattern/)() const | Haalt het negatieve patroon van de valuta op. |
| [get_CurrencyPositivePattern](./get_currencypositivepattern/)() const | Haalt het positieve patroon van de valuta op. |
| [get_CurrencySymbol](./get_currencysymbol/)() const | Haalt het valutateken op. |
| static [get_CurrentInfo](./get_currentinfo/)() | Haalt de door de huidige threadcultuur gedefinieerde getalopmaakinfo op. |
| [get_DigitSubstitution](./get_digitsubstitution/)() const | Haalt een waarde op die aangeeft hoe de vorm van een cijfer wordt weergegeven. |
| static [get_InvariantInfo](./get_invariantinfo/)() | Haalt de door de invariantcultuur gedefinieerde getalopmaakinfo op. |
| [get_IsReadOnly](./get_isreadonly/)() const | Controleert of de opmaak alleen-lezen is. |
| [get_NaNSymbol](./get_nansymbol/)() const | Haalt het Not-a-Number‑symbool op. |
| [get_NativeDigits](./get_nativedigits/)() const | Haalt cijfertekens op (0 tot en met 9). |
| [get_NegativeInfinitySymbol](./get_negativeinfinitysymbol/)() const | Haalt het negatieve oneindigheidssymbool op. |
| [get_NegativeSign](./get_negativesign/)() const | Haalt het negatieve teken op. |
| [get_NumberDecimalDigits](./get_numberdecimaldigits/)() const | Haalt het aantal decimale cijfers op. |
| [get_NumberDecimalSeparator](./get_numberdecimalseparator/)() const | Haalt het decimale scheidingsteken op. |
| [get_NumberGroupSeparator](./get_numbergroupseparator/)() const | Haalt het getalgroepscheidingsteken op. |
| [get_NumberGroupSizes](./get_numbergroupsizes/)() const | Haalt het aantal cijfers per groep op. |
| [get_NumberNegativePattern](./get_numbernegativepattern/)() const | Haalt het negatieve patroon van het getal op. |
| [get_PercentDecimalDigits](./get_percentdecimaldigits/)() const | Haalt het aantal decimale plaatsen in procentwaarden op. |
| [get_PercentDecimalSeparator](./get_percentdecimalseparator/)() const | Haalt het decimale scheidingsteken in procentwaarden op. |
| [get_PercentGroupSeparator](./get_percentgroupseparator/)() const | Haalt het groepscheidingsteken in procentwaarden op. |
| [get_PercentGroupSizes](./get_percentgroupsizes/)() const | Haalt het aantal cijfers per procentwaardengroep op. |
| [get_PercentNegativePattern](./get_percentnegativepattern/)() const | Haalt het negatieve patroon van procent op. |
| [get_PercentPositivePattern](./get_percentpositivepattern/)() const | Haalt het positieve patroon van procent op. |
| [get_PercentSymbol](./get_percentsymbol/)() const | Haalt het procentsymbool op. |
| [get_PerMilleSymbol](./get_permillesymbol/)() const | Haalt het promillesymbool op. |
| [get_PositiveInfinitySymbol](./get_positiveinfinitysymbol/)() const | Haalt het symbool voor positieve oneindigheid op. |
| [get_PositiveSign](./get_positivesign/)() const | Haalt het positieve teken op. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Haalt formatter van specifiek type op. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | Haalt formatter op die geassocieerd is met formatprovider. |
| [NumberFormatInfo](./numberformatinfo/)() | Standaardconstructor (invariant [NumberFormatInfo](./)). |
| [operator=](./operator=/)(const NumberFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(NumberFormatInfoPtr) | Haalt de alleen-lezen versie van formatter op. |
| [set_CurrencyDecimalDigits](./set_currencydecimaldigits/)(int) | Stelt het aantal valutadecimale cijfers in. |
| [set_CurrencyDecimalSeparator](./set_currencydecimalseparator/)(const String\&) | Stelt de decimale scheidingsteken voor valuta in. |
| [set_CurrencyGroupSeparator](./set_currencygroupseparator/)(const String\&) | Stelt het groepsscheidingsteken voor valuta in. |
| [set_CurrencyGroupSizes](./set_currencygroupsizes/)(const ArrayPtr\<int\>\&) | Stelt het aantal valutadecimale cijfers per groep in. |
| [set_CurrencyNegativePattern](./set_currencynegativepattern/)(int) | Stelt het negatieve patroon voor valuta in. |
| [set_CurrencyPositivePattern](./set_currencypositivepattern/)(int) | Stelt het positieve patroon voor valuta in. |
| [set_CurrencySymbol](./set_currencysymbol/)(const String\&) | Stelt het valutasymbool in. |
| [set_DigitSubstitution](./set_digitsubstitution/)(DigitShapes) | Stelt een waarde in die bepaalt hoe de vorm van een cijfer wordt weergegeven. |
| [set_NaNSymbol](./set_nansymbol/)(const String\&) | Stelt het Not-a-Number-symbool in. |
| [set_NativeDigits](./set_nativedigits/)(const ArrayPtr\<String\>\&) | Stelt cijfer-symbolen in (0 tot en met 9). |
| [set_NegativeInfinitySymbol](./set_negativeinfinitysymbol/)(const String\&) | Stelt het symbool voor negatieve oneindigheid in. |
| [set_NegativeSign](./set_negativesign/)(const String\&) | Stelt het negatieve teken in. |
| [set_NumberDecimalDigits](./set_numberdecimaldigits/)(int) | Stelt het aantal decimale cijfers in. |
| [set_NumberDecimalSeparator](./set_numberdecimalseparator/)(const String\&) | Stelt het decimale scheidingsteken in. |
| [set_NumberGroupSeparator](./set_numbergroupseparator/)(const String\&) | Stelt het groepsscheidingsteken voor getallen in. |
| [set_NumberGroupSizes](./set_numbergroupsizes/)(const ArrayPtr\<int\>\&) | Stelt het aantal cijfers per groep in. |
| [set_NumberNegativePattern](./set_numbernegativepattern/)(int) | Stelt het negatieve patroon voor getallen in. |
| [set_PercentDecimalDigits](./set_percentdecimaldigits/)(int) | Stelt het aantal decimalen in procentwaarden in. |
| [set_PercentDecimalSeparator](./set_percentdecimalseparator/)(const String\&) | Stelt het decimale scheidingsteken in procentwaarden in. |
| [set_PercentGroupSeparator](./set_percentgroupseparator/)(const String\&) | Stelt het groepsscheidingsteken in procentwaarden in. |
| [set_PercentGroupSizes](./set_percentgroupsizes/)(const ArrayPtr\<int\>\&) | Stelt het aantal cijfers per groep van procentwaarden in. |
| [set_PercentNegativePattern](./set_percentnegativepattern/)(int) | Stelt het negatieve patroon voor procenten in. |
| [set_PercentPositivePattern](./set_percentpositivepattern/)(int) | Stelt het positieve patroon voor procenten in. |
| [set_PercentSymbol](./set_percentsymbol/)(const String\&) | Stelt het procentsymbool in. |
| [set_PerMilleSymbol](./set_permillesymbol/)(const String\&) | Stelt het promillesymbool in. |
| [set_PositiveInfinitySymbol](./set_positiveinfinitysymbol/)(const String\&) | Stelt het symbool voor positieve oneindigheid in. |
| [set_PositiveSign](./set_positivesign/)(const String\&) | Stelt het positieve teken in. |
## Zie ook

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
