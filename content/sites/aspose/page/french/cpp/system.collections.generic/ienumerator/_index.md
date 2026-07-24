---
title: "System::Collections::Generic::IEnumerator class"
linktitle: "IEnumerator"
second_title: "Aspose.Page pour C++"
description: "System::Collections::Generic::IEnumerator class. Interface d'un énumérateur pouvant être utilisé pour parcourir certains éléments. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2300
url: /fr/cpp/system.collections.generic/ienumerator/
---
## IEnumerator class


Interface de l'énumérateur qui peut être utilisée pour parcourir certains éléments. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
template<typename T>class IEnumerator : public virtual System::IDisposable,
                                        public System::Details::EnumeratorBasedIterator<T>,
                                        protected System::Details::IteratorPointerUpdater<T, false>
```


| Paramètre | Description |
| --- | --- |
| T | Type d'élément. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [AsVirtualizedIterator](./asvirtualizediterator/)() | Prépare l'itérateur pour être utilisé par la classe VirtualizedIterator. |
| [CloneIterator](./cloneiterator/)() const override | Clone l'itérateur actuel. |
| virtual [Current](./current/)() const | Obtient l'élément actuel. |
| virtual [get_Current](./get_current/)() const | Obtient l'élément actuel. |
| [IEnumerator](./ienumerator/)() |  |
| [IncrementIterator](./incrementiterator/)() override | Déplace l'itérateur d'un pas en avant. |
| [InitializeIterator](./initializeiterator/)() override | Effectue le premier appel [MoveNext()](./movenext/) et prépare l'objet énumérateur pour être utilisé par VirtualizedIterator. |
| [MarkOwnedByVirtualizedIterator](./markownedbyvirtualizediterator/)() | Marque l'énumérateur possédé par l'itérateur virtualisé. |
| virtual [MoveNext](./movenext/)() | Déplace l'énumérateur vers l'élément suivant. Si aucun élément n'avait été référencé auparavant, définit la référence sur le premier élément disponible. Si la fin du conteneur est atteinte, ne fait rien. |
| virtual [Reset](./reset/)() | Réinitialise l'énumérateur à la position avant le premier élément. |
| virtual [~IEnumerator](./~ienumerator/)() |  |
## Typedefs

| Typedef | Description |
| --- | --- |
| [ValueType](./valuetype/) | Type valeur. |
## Remarques



```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Crée l'instance de la classe List.
  auto collection = MakeObject<List<int>>();

  // Remplit la liste.
  collection->Add(1);
  collection->Add(2);
  collection->Add(3);

  // Obtenez l'énumérateur de la liste.
  auto enumerator = collection->GetEnumerator();

  while (enumerator->MoveNext())
  {
    // Obtenez l'élément actuel et affichez-le.
    std::cout << enumerator->get_Current() << ' ';
  }

  // Réinitialisez l'énumérateur.
  enumerator->Reset();

  return 0;
}
/*
This code example produces the following output:
1 2 3
*/
```

## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
