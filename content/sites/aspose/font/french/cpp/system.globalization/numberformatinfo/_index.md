---
title: "System::Globalization::NumberFormatInfo classe"
linktitle: "InfoFormatNombre"
second_title: "Aspose.Font pour C++"
description: "System::Globalization::NumberFormatInfo classe. Contient des informations sur la façon de formater les nombres. Les opérations de définition ne sont activées que sur des objets non en lecture seule. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1900
url: /fr/cpp/system.globalization/numberformatinfo/
---
## NumberFormatInfo class


Contient des informations sur la façon de formater les nombres. Les opérations de définition ne sont activées que sur des objets non en lecture seule. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class NumberFormatInfo : public virtual System::Object,
                         public System::IFormatProvider,
                         public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Clone les informations de format. |
| [get_CurrencyDecimalDigits](./get_currencydecimaldigits/)() const | Obtient le nombre de décimales monétaires. |
| [get_CurrencyDecimalSeparator](./get_currencydecimalseparator/)() const | Obtient le séparateur décimal monétaire. |
| [get_CurrencyGroupSeparator](./get_currencygroupseparator/)() const | Obtient le séparateur de groupe monétaire. |
| [get_CurrencyGroupSizes](./get_currencygroupsizes/)() const | Obtient le nombre de décimales monétaires par groupe. |
| [get_CurrencyNegativePattern](./get_currencynegativepattern/)() const | Obtient le modèle négatif de la devise. |
| [get_CurrencyPositivePattern](./get_currencypositivepattern/)() const | Obtient le modèle positif de la devise. |
| [get_CurrencySymbol](./get_currencysymbol/)() const | Obtient le symbole monétaire. |
| static [get_CurrentInfo](./get_currentinfo/)() | Obtient les informations de format numérique définies par la culture du thread actuel. |
| [get_DigitSubstitution](./get_digitsubstitution/)() const | Obtient une valeur qui spécifie comment afficher la forme d'un chiffre. |
| static [get_InvariantInfo](./get_invariantinfo/)() | Obtient les informations de format numérique définies par la culture invariante. |
| [get_IsReadOnly](./get_isreadonly/)() const | Vérifie si le format est en lecture seule. |
| [get_NaNSymbol](./get_nansymbol/)() const | Obtient le symbole NaN. |
| [get_NativeDigits](./get_nativedigits/)() const | Obtient les symboles des chiffres (0 à 9). |
| [get_NegativeInfinitySymbol](./get_negativeinfinitysymbol/)() const | Obtient le symbole d'infini négatif. |
| [get_NegativeSign](./get_negativesign/)() const | Obtient le signe négatif. |
| [get_NumberDecimalDigits](./get_numberdecimaldigits/)() const | Obtient le nombre de chiffres décimaux. |
| [get_NumberDecimalSeparator](./get_numberdecimalseparator/)() const | Obtient le séparateur décimal. |
| [get_NumberGroupSeparator](./get_numbergroupseparator/)() const | Obtient le séparateur de groupe de nombres. |
| [get_NumberGroupSizes](./get_numbergroupsizes/)() const | Obtient le nombre de chiffres par groupe. |
| [get_NumberNegativePattern](./get_numbernegativepattern/)() const | Obtient le modèle négatif du nombre. |
| [get_PercentDecimalDigits](./get_percentdecimaldigits/)() const | Obtient le nombre de décimales dans les valeurs en pourcentage. |
| [get_PercentDecimalSeparator](./get_percentdecimalseparator/)() const | Obtient le séparateur décimal dans les valeurs en pourcentage. |
| [get_PercentGroupSeparator](./get_percentgroupseparator/)() const | Obtient le séparateur de groupe dans les valeurs en pourcentage. |
| [get_PercentGroupSizes](./get_percentgroupsizes/)() const | Obtient le nombre de chiffres par groupe de valeurs en pourcentage. |
| [get_PercentNegativePattern](./get_percentnegativepattern/)() const | Obtient le modèle négatif du pourcentage. |
| [get_PercentPositivePattern](./get_percentpositivepattern/)() const | Obtient le modèle positif du pourcentage. |
| [get_PercentSymbol](./get_percentsymbol/)() const | Obtient le symbole de pourcentage. |
| [get_PerMilleSymbol](./get_permillesymbol/)() const | Obtient le symbole du pour mille. |
| [get_PositiveInfinitySymbol](./get_positiveinfinitysymbol/)() const | Obtient le symbole d'infini positif. |
| [get_PositiveSign](./get_positivesign/)() const | Obtient le signe positif. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Obtient le formateur d'un type spécifique. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | Obtient le formateur associé au fournisseur de format. |
| [NumberFormatInfo](./numberformatinfo/)() | Constructeur par défaut (invariant [NumberFormatInfo](./)). |
| [operator=](./operator=/)(const NumberFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(NumberFormatInfoPtr) | Obtient la version en lecture seule du formateur. |
| [set_CurrencyDecimalDigits](./set_currencydecimaldigits/)(int) | Définit le nombre de décimales de la monnaie. |
| [set_CurrencyDecimalSeparator](./set_currencydecimalseparator/)(const String\&) | Définit le séparateur décimal de la monnaie. |
| [set_CurrencyGroupSeparator](./set_currencygroupseparator/)(const String\&) | Définit le séparateur de groupe de la monnaie. |
| [set_CurrencyGroupSizes](./set_currencygroupsizes/)(const ArrayPtr\<int\>\&) | Définit le nombre de décimales de la monnaie par groupe. |
| [set_CurrencyNegativePattern](./set_currencynegativepattern/)(int) | Définit le modèle négatif de la monnaie. |
| [set_CurrencyPositivePattern](./set_currencypositivepattern/)(int) | Définit le modèle positif de la monnaie. |
| [set_CurrencySymbol](./set_currencysymbol/)(const String\&) | Définit le symbole monétaire. |
| [set_DigitSubstitution](./set_digitsubstitution/)(DigitShapes) | Définit une valeur qui spécifie comment afficher la forme d'un chiffre. |
| [set_NaNSymbol](./set_nansymbol/)(const String\&) | Définit le symbole Not-a-Number. |
| [set_NativeDigits](./set_nativedigits/)(const ArrayPtr\<String\>\&) | Définit les symboles des chiffres (0 à 9). |
| [set_NegativeInfinitySymbol](./set_negativeinfinitysymbol/)(const String\&) | Définit le symbole d'infini négatif. |
| [set_NegativeSign](./set_negativesign/)(const String\&) | Définit le signe négatif. |
| [set_NumberDecimalDigits](./set_numberdecimaldigits/)(int) | Définit le nombre de décimales. |
| [set_NumberDecimalSeparator](./set_numberdecimalseparator/)(const String\&) | Définit le séparateur décimal. |
| [set_NumberGroupSeparator](./set_numbergroupseparator/)(const String\&) | Définit le séparateur de groupe de nombres. |
| [set_NumberGroupSizes](./set_numbergroupsizes/)(const ArrayPtr\<int\>\&) | Définit le nombre de chiffres par groupe. |
| [set_NumberNegativePattern](./set_numbernegativepattern/)(int) | Définit le modèle négatif des nombres. |
| [set_PercentDecimalDigits](./set_percentdecimaldigits/)(int) | Définit le nombre de décimales dans les valeurs en pourcentage. |
| [set_PercentDecimalSeparator](./set_percentdecimalseparator/)(const String\&) | Définit le séparateur décimal dans les valeurs en pourcentage. |
| [set_PercentGroupSeparator](./set_percentgroupseparator/)(const String\&) | Définit le séparateur de groupe dans les valeurs en pourcentage. |
| [set_PercentGroupSizes](./set_percentgroupsizes/)(const ArrayPtr\<int\>\&) | Définit le nombre de chiffres par groupe de valeur en pourcentage. |
| [set_PercentNegativePattern](./set_percentnegativepattern/)(int) | Définit le modèle négatif du pourcentage. |
| [set_PercentPositivePattern](./set_percentpositivepattern/)(int) | Définit le modèle positif du pourcentage. |
| [set_PercentSymbol](./set_percentsymbol/)(const String\&) | Définit le symbole du pourcentage. |
| [set_PerMilleSymbol](./set_permillesymbol/)(const String\&) | Définit le symbole du per mille. |
| [set_PositiveInfinitySymbol](./set_positiveinfinitysymbol/)(const String\&) | Définit le symbole de l'infini positif. |
| [set_PositiveSign](./set_positivesign/)(const String\&) | Définit le signe positif. |
## Voir aussi

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
