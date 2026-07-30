---
title: "System::Net::Http::Headers::RangeHeaderValue class"
linktitle: "RangeHeaderValue"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::Headers::RangeHeaderValue class. Représente une valeur de l’en-tête ''Range''. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en argument en C++."
type: docs
weight: 2000
url: /fr/cpp/system.net.http.headers/rangeheadervalue/
---
## RangeHeaderValue class


Représente une valeur de l’en-tête 'Range'. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument.

```cpp
class RangeHeaderValue : public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| [get_Ranges](./get_ranges/)() | Renvoie la collection des intervalles. |
| [get_Unit](./get_unit/)() | Informations RTTI. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [GetRangeLength](./getrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Convertit une chaîne passée à partir de l’index spécifié en une instance de la classe [RangeHeaderValue](./). |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [RangeHeaderValue](./). |
| [RangeHeaderValue](./rangeheadervalue/)() | Construit une nouvelle instance. |
| [RangeHeaderValue](./rangeheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | Construit une nouvelle instance. |
| [set_Unit](./set_unit/)(String) | Définit une unité. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeHeaderValue\>\&) | Essaie de convertir une chaîne passée en une instance de la classe [RangeHeaderValue](./). |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
