---
title: "Espace de noms System::Collections"
linktitle: "System::Collections"
second_title: "Aspose.Page pour C++"
description: "Comment utiliser l'espace de noms System::Collections en C++."
type: docs
weight: 2200
url: /fr/cpp/system.collections/
---



## Classes

| Classe | Description |
| --- | --- |
| [BitArray](./bitarray/) | [Array](../system/array/) de bits qui peuvent être adressés par indice. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument. |
| [BitArrayPtr](./bitarrayptr/) | Pointeur vers [BitArray](./bitarray/). Ce type est un pointeur pour gérer la suppression d'un autre objet. Il doit être alloué sur la pile et passé aux fonctions soit par valeur, soit par référence constante. |
| [CollectionBase](./collectionbase/) | Fournit une classe de base abstraite pour une collection fortement typée. |
| [ICollection](./icollection/) | Définit l'interface d'une collection non générique. |
| [IEnumerable](./ienumerable/) | [IEnumerable](./ienumerable/) est l'interface de base pour toutes les collections non génériques qui peuvent être énumérées. |
| [IEnumerator](./ienumerator/) | Interface d'énumérateur qui peut être utilisée pour parcourir certains éléments. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/) | Wrapper qui crée une implémentation non générique de [IEnumerator](./ienumerator/) sur l'itérateur générique [IEnumeratorImplRefType](./ienumeratorimplreftype/) - wrapper pour les types de référence. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/) | Wrapper qui crée une implémentation non générique de [IEnumerator](./ienumerator/) sur l'itérateur générique [IEnumeratorImplRefType](./ienumeratorimplreftype/) - wrapper pour les types valeur. |
| [IEqualityComparer](./iequalitycomparer/) |  |
| [IList](./ilist/) | [IList](./ilist/) Représente une collection non générique d'objets qui peuvent être accédés individuellement par indice. |
| [IListImplRefType](./ilistimplreftype/) | Ébauche qui implémente l'interface [System::Collections::IList](./ilist/) sur l'objet [System::Collections::Generic::List](../system.collections.generic/list/) Implémentation pour les types de référence. |
| [IListImplValueType](./ilistimplvaluetype/) | Ébauche qui implémente l'interface [System::Collections::IList](./ilist/) sur l'objet [System::Collections::Generic::List](../system.collections.generic/list/) Implémentation pour les types valeur. |
| [IListWrapper](./ilistwrapper/) | Interface pour prendre en charge le cast d'une collection générique vers une collection non générique. |
| [Invalidatable](./invalidatable/) | Classe qui permet de suivre l'état de ses descendants via des objets [InvalidatableTracker](./invalidatabletracker/). |
| [InvalidatableTracker](./invalidatabletracker/) | Classe qui implémente les traqueurs d'objets [Invalidatable](./invalidatable/). |
