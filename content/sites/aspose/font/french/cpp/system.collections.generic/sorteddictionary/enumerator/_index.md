---
title: "System::Collections::Generic::SortedDictionary::Enumerator classe"
linktitle: "Énumérateur"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::SortedDictionary::Enumerator classe. Type d'énumérateur pour parcourir le dictionnaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2100
url: /fr/cpp/system.collections.generic/sorteddictionary/enumerator/
---
## Enumerator class


[Enumerator](./) type to iterate through dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | Construit un énumérateur sur un dictionnaire spécifique. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) alias de type. |
## Voir aussi

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedDictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
