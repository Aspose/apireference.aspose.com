---
title: "classe System::Collections::Concurrent::ConcurrentDictionary"
linktitle: "ConcurrentDictionary"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Concurrent::ConcurrentDictionary classe. Implémentation de dictionnaire thread-safe. Les objets de cette classe doivent être alloués uniquement à l'aide de la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.collections.concurrent/concurrentdictionary/
---
## ConcurrentDictionary class


Implémentation de dictionnaire thread-safe. Les objets de cette classe doivent être alloués uniquement à l'aide de la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
template<class TKey,class TValue>class ConcurrentDictionary : public System::Collections::Generic::Dictionary<TKey, TValue>
```


| Paramètre | Description |
| --- | --- |
| TKey | Type de clé. |
| TValue | Type valeur. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const TKey\&, const TValue\&) override | Ajoute une valeur dans le dictionnaire. |
| [Clear](./clear/)() override | Supprime tous les éléments du conteneur. |
| [CopyTo](./copyto/)(ArrayPtr\<System::Collections::Generic::KeyValuePair\<TKey, TValue\>\>, int) override | Copie les éléments du conteneur vers des éléments de tableau existants. |
| [get_KeysInternal](./get_keysinternal/)() const override | Obtient la collection d'enveloppe pour accéder aux clés du dictionnaire. |
| [idx_set](./idx_set/)(const TKey\&, TValue) override | Informations RTTI. |
| [Remove](./remove/)(const TKey\&) override | Supprime l'élément du conteneur. |
| [TryAdd](./tryadd/)(const TKey\&, const TValue\&) | Tente d'ajouter une paire clé/valeur dans le dictionnaire. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [BaseType](./basetype/) | Type d'implémentation. |
| [ThisType](./thistype/) | Ce type. |
## Remarques



```cpp
#include <system/collections/concurrent/concurrent_dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  const int itemsCount = 32;

  // Créez l'instance de la classe ConcurrentDictionary.
  auto concurrentDictionary = MakeObject<ConcurrentDictionary<int, int>>();

  // Remplissez le dictionnaire concurrent.
  for (auto i = 0; i < itemsCount; ++i)
  {
    concurrentDictionary->Add(i, i * i);
  }

  Console::WriteLine(concurrentDictionary->idx_get(3));

  return 0;
}
/*
This code example produces the following output:
9
*/
```

## Voir aussi

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Concurrent](../)
* Library [Aspose.Font for C++](../../)
