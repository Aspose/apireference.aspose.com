---
title: "Classe System::StringComparer"
linktitle: "StringComparer"
second_title: "Aspose.Font pour C++"
description: "Classe System::StringComparer. Compare les chaînes en utilisant différents modes de comparaison. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() fonction. Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 5900
url: /fr/cpp/system/stringcomparer/
---
## StringComparer class


Compare les chaînes en utilisant différents modes de comparaison. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/) fonction. Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class StringComparer : public virtual System::Object,
                       public System::Collections::Generic::IComparer<String>,
                       public System::Collections::Generic::IEqualityComparer<String>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | Compare deux chaînes en utilisant les paramètres actuels. |
| static [Create](./create/)(const System::SharedPtr\<System::Globalization::CultureInfo\>\&, bool) | Crée un comparateur spécifique à la culture. |
| [Equals](./equals/)(String, String) const override | Vérifie si deux chaînes sont égales en utilisant les paramètres actuels. |
| static [get_CurrentCulture](./get_currentculture/)() | Singleton du comparateur de culture actuelle. |
| static [get_CurrentCultureIgnoreCase](./get_currentcultureignorecase/)() | Singleton du comparateur de culture actuelle insensible à la casse. |
| static [get_InvariantCulture](./get_invariantculture/)() | Singleton du comparateur de culture invariante. |
| static [get_InvariantCultureIgnoreCase](./get_invariantcultureignorecase/)() | Singleton du comparateur de culture invariante insensible à la casse. |
| static [get_Ordinal](./get_ordinal/)() | Singleton du comparateur ordinal. |
| static [get_OrdinalIgnoreCase](./get_ordinalignorecase/)() | Singleton du comparateur ordinal insensible à la casse. |
| [GetHashCode](./gethashcode/)(String) const override | Obtient le code de hachage de la chaîne. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [args_type](./args_type/) | Informations RTTI. |
## Voir aussi

* Class [Object](../object/)
* Class [IComparer](../../system.collections.generic/icomparer/)
* Class [IEqualityComparer](../../system.collections.generic/iequalitycomparer/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
