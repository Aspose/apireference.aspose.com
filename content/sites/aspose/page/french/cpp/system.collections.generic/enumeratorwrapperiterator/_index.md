---
title: "classe System::Collections::Generic::EnumeratorWrapperIterator"
linktitle: "EnumeratorWrapperIterator"
second_title: "Aspose.Page pour C++"
description: "classe System::Collections::Generic::EnumeratorWrapperIterator. Itérateur qui encapsule l'énumérateur pré-créé et redirige tous les appels vers celui-ci en C++."
type: docs
weight: 1500
url: /fr/cpp/system.collections.generic/enumeratorwrapperiterator/
---
## EnumeratorWrapperIterator class


Itérateur qui encapsule l'énumérateur pré-créé et redirige tous les appels vers celui-ci.

```cpp
template<typename Element>class EnumeratorWrapperIterator : public System::Details::VirtualizedIteratorBase<Element>
```


| Paramètre | Description |
| --- | --- |
| Element | Type d'élément. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clone l'itérateur actuel. |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/)(const SharedPtr\<IEnumerator\<Element\>\>\&) |  |
| [IncrementIterator](./incrementiterator/)() override | Déplace l'itérateur d'un pas en avant. Doit mettre à jour m_is_end et m_pointer. |
| [IteratorEquals](./iteratorequals/)(System::Details::VirtualizedIteratorBase\<Element\> *) const override | Vérifie si deux itérateurs pointent vers le même élément. |
| virtual [~EnumeratorWrapperIterator](./~enumeratorwrapperiterator/)() | Destructeur. |

## Voir aussi

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
