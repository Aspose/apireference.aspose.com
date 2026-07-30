---
title: "Classe System::Collections::BitArray"
linktitle: "BitArray"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::BitArray. Tableau de bits pouvant être adressés par indice. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.collections/bitarray/
---
## BitArray class


[Array](../../system/array/) of bits which can be addressed by index. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class BitArray : public virtual System::Object,
                 public System::Collections::Generic::ICollection<bool>
```

## Nested classes

* Class [Enumerator](./enumerator/)
* Class [Reference](./reference/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const bool\&) override | Ajoute une valeur à la fin du conteneur. |
| [And](./and/)(const BitArrayPtr\&) | Calcule le 'and' bit à bit entre deux BitSets. |
| [BitArray](./bitarray/)(const bitset\&) | Constructeur de copie. |
| [BitArray](./bitarray/)(const BitArray\&) | Constructeur de copie. |
| [BitArray](./bitarray/)(const BitArrayPtr\&) | Constructeur de copie. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<bool\>\&) | Constructeur de copie. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<uint8_t\>\&) | Constructeur de copie. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<int\>\&) | Constructeur de copie. |
| [BitArray](./bitarray/)(int, bool) | Constructeur de remplissage. |
| [Clear](./clear/)() override | Supprime tous les éléments. |
| [Contains](./contains/)(const bool\&) const override | Vérifie si une valeur spécifique est présente dans le conteneur. Non implémenté. |
| [CopyTo](./copyto/)(System::ArrayPtr\<bool\>, int) override | Copie les données dans les éléments existants du tableau. |
| [data](./data/)() | Accès à la structure de données sous-jacente. |
| [data](./data/)() const | Accès à la structure de données sous-jacente. |
| [Get](./get/)(int) const | Obtient l'élément de [BitArray](./). |
| [get_Count](./get_count/)() const override | Obtient la taille du conteneur. |
| [get_Length](./get_length/)() const | Obtient la taille du conteneur. |
| [GetEnumerator](./getenumerator/)() override | Crée un objet énumérateur. |
| [idx_get](./idx_get/)(int) const | Fonction d'accès (getter). |
| [idx_set](./idx_set/)(int, bool) | Fonction de modification (setter). |
| [Not](./not/)() | Négation du BitSet. |
| [operator!=](./operator!=/)(const BitArray\&) const | Opérateur de comparaison bit à bit. |
| [operator==](./operator==/)(const BitArray\&) const | Opérateur de comparaison bit à bit. |
| [operator[]](./operator[]/)(int) | Fonction d'accès. |
| [Or](./or/)(const BitArrayPtr\&) | Calcule le 'ou' bit à bit entre deux BitSets. |
| [Remove](./remove/)(const bool\&) override | Renvoie la première occurrence de la valeur spécifiée. Non implémenté. |
| [Set](./set/)(int, bool) | Définit l'élément de [BitArray](./). |
| [SetAll](./setall/)(bool) | Définit tous les éléments à une valeur spécifique. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Implémentation formelle du mécanisme d'arguments de modèle faibles ; non applicable à cette classe. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Obtient l'implémentation de l'itérateur const begin pour le conteneur actuel. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Obtient l'implémentation de l'itérateur begin pour le conteneur actuel. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Obtient l'implémentation de l'itérateur const end pour le conteneur actuel. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Obtient l'implémentation de l'itérateur end pour le conteneur actuel. |
| [Xor](./xor/)(const BitArrayPtr\&) | Calcule le 'xor' bit à bit entre deux BitSets. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [bitset](./bitset/) | Informations RTTI. |
## Remarques



```cpp
#include <system/collections/bitarray.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void Print(const System::SmartPtr<System::Collections::Generic::IEnumerable<bool>> &bitArray)
{
  for (const auto item: bitArray)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Construit une nouvelle instance de la classe BitArray.
  auto bitArray = MakeObject<System::Collections::BitArray>(3);

  // Imprime les valeurs.
  Print(bitArray);

  return 0;
}
/*
This code example produces the following output:
0 0 0
*/
```

## Voir aussi

* Class [Object](../../system/object/)
* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
