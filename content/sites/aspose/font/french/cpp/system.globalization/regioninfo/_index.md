---
title: "System::Globalization::RegionInfo classe"
linktitle: "RegionInfo"
second_title: "Aspose.Font pour C++"
description: "System::Globalization::RegionInfo classe. Fournit des informations sur la région. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2100
url: /fr/cpp/system.globalization/regioninfo/
---
## RegionInfo class


Fournit des informations sur la région. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class RegionInfo : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_CurrencyEnglishName](./get_currencyenglishname/)() const | Obtient le nom anglais de la devise. |
| virtual [get_CurrencyNativeName](./get_currencynativename/)() const | Obtient le nom natif de la devise. |
| virtual [get_CurrencySymbol](./get_currencysymbol/)() const | Obtient le symbole monétaire. |
| static [get_CurrentRegion](./get_currentregion/)() | Obtient la région définie dans le système. |
| virtual [get_DisplayName](./get_displayname/)() const | Obtient le nom complet de la région. |
| virtual [get_EnglishName](./get_englishname/)() const | Obtient le nom anglais de la région. |
| virtual [get_GeoId](./get_geoid/)() const | Obtient l'identifiant unique d'une région. |
| virtual [get_IsMetric](./get_ismetric/)() const | Vérifie si la région utilise le système métrique. |
| virtual [get_ISOCurrencySymbol](./get_isocurrencysymbol/)() const | Obtient le symbole ISO de la devise. |
| virtual [get_Name](./get_name/)() const | Obtient le nom de la région. |
| virtual [get_NativeName](./get_nativename/)() const | Obtient le nom natif de la région. |
| virtual [get_ThreeLetterISORegionName](./get_threeletterisoregionname/)() const | Obtient le code ISO de la région à 3 lettres. |
| virtual [get_ThreeLetterWindowsRegionName](./get_threeletterwindowsregionname/)() const | Obtient le code de région à 3 lettres [Windows](../../system.windows/). |
| virtual [get_TwoLetterISORegionName](./get_twoletterisoregionname/)() const | Obtient le code ISO de la région à 2 lettres. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| [operator=](./operator=/)(const RegionInfo\&) |  |
| [RegionInfo](./regioninfo/)(const String\&) | Informations RTTI. |
| [RegionInfo](./regioninfo/)(int) | Constructeur. |
| [RegionInfo](./regioninfo/)(const RegionInfo\&) |  |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
