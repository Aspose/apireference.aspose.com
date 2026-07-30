---
title: "System::Collections::Generic::SortedList::Enumerator classe"
linktitle: "Énumérateur"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::SortedList::Enumerator classe. Classe d'énumérateur pour parcourir la liste. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2600
url: /fr/cpp/system.collections.generic/sortedlist/enumerator/
---
## Enumerator class


[Enumerator](./) class to iterate through list. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | Crée un énumérateur parcourant un dictionnaire spécifique. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) alias de type. |
## Voir aussi

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
