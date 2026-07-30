---
title: "Classe System::Collections::Generic::Dictionary"
linktitle: "Dictionnaire"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::Generic::Dictionary. Déclaration anticipée de la classe Dictionary en C++."
type: docs
weight: 1100
url: /fr/cpp/system.collections.generic/dictionary/
---
## Dictionary class


Déclaration anticipée de la classe [Dictionary](./).

```cpp
template<typename TKey,typename TValue>class Dictionary : public System::Collections::Generic::BaseDictionary<std::unordered_map<TKey, TValue, EqualityComparerHashAdapter<TKey>, EqualityComparerAdapter<TKey>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
```


| Paramètre | Description |
| --- | --- |
| TKey | Type de clé. |
| TValue | Type valeur. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [Dictionary](./dictionary/)() | Crée un dictionnaire vide. |
| [Dictionary](./dictionary/)(const map_t\&) | Copie les données depuis la map. |
| [Dictionary](./dictionary/)(int) | Surcharge correspondant à la création d'un dictionnaire pré‑alloué ; ne fait en fait aucune allocation. |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Constructeur de copie. |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Constructeur de copie. |
| [Dictionary](./dictionary/)(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Crée un dictionnaire vide. |
| [Dictionary](./dictionary/)(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Crée un dictionnaire vide. |
| [GetEnumerator](./getenumerator/)() override | Crée un objet énumérateur. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Pointeur vers l'interface énumérable. |
| [IEnumeratorPtr](./ienumeratorptr/) | Pointeur vers l'énumérateur. |
| [KeyCollection](./keycollection/) | Informations RTTI. |
| [KVPair](./kvpair/) | Type de paire clé-valeur. |
| [map_t](./map_t/) | Type de données sous-jacent. |
| [Ptr](./ptr/) | Type de pointeur. |
| [ValueCollection](./valuecollection/) | Collection de valeurs à extraire. |
## Remarques


[Dictionary](./) that maps values to keys. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Créer l'instance de la classe Dictionary.
  auto dictionary = MakeObject<Dictionary<int, String>>();

  // Remplir le dictionnaire.
  dictionary->Add(0, u"Foo");
  dictionary->Add(1, u"Bar");
  dictionary->Add(2, u"Baz");

  // Imprimer les éléments du dictionnaire.
  for (const auto &pair: dictionary)
  {
    std::cout << pair.get_Key() << " - " << pair.get_Value() << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
0 - Foo
1 - Bar
2 - Baz
*/
```

## Voir aussi

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
