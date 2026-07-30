---
title: "Classe System::Collections::Generic::Dictionary::Enumerator"
linktitle: "Énumérateur"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::Generic::Dictionary::Enumerator. Énumérateur qui permet d'itérer à travers le dictionnaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1000
url: /fr/cpp/system.collections.generic/dictionary/enumerator/
---
## Enumerator class


[Enumerator](./) that allows iterating through the dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Informations RTTI. |
| [Enumerator](./enumerator/)(Ptr) | Crée un énumérateur. |
## Voir aussi

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
