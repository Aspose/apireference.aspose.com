---
title: "Classe System::Collections::IListImplRefType"
linktitle: "IListImplRefType"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::IListImplRefType. Ébauche qui implémente l'interface System::Collections::IList sur l'objet System::Collections::Generic::List. Implémentation pour les types de référence en C++."
type: docs
weight: 1100
url: /fr/cpp/system.collections/ilistimplreftype/
---
## IListImplRefType class


Ébauche qui implémente l'interface [System::Collections::IList](../ilist/) sur l'objet [System::Collections::Generic::List](../../system.collections.generic/list/). Implémentation pour les types de référence.

```cpp
template<typename T>class IListImplRefType : public virtual System::Collections::IList
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | Ajoute un élément à la fin de la liste. |
| static [BoxValue](./boxvalue/)(System::SharedPtr\<T\>) | Conversion d'une référence de type en valeur d'objet. |
| [Clear](./clear/)() override | Supprime tous les éléments. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | Vérifie si l'élément est présent dans la liste. |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) implémentation des méthodes Obtient le nombre d'éléments dans la collection. |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) implémentation Retourne un énumérateur qui parcourt une collection. |
| [idx_get](./idx_get/)(int, int) const override | Obtient l'élément à l'index spécifié. |
| [IListImplRefType](./ilistimplreftype/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<T\>\>\>) | Crée une nouvelle instance d'objet. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | Obtient l'index de la première apparition de l'élément dans le conteneur. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | Insère l'élément à la position spécifiée, en décalant les autres éléments. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | Supprime la première occurrence d'un élément spécifique de la liste. |
| [RemoveAt](./removeat/)(int) override | Supprime l'élément à la position spécifiée. |
| static [UnboxValue](./unboxvalue/)(System::SharedPtr\<System::Object\>) | Conversion d'une valeur d'objet en référence de type particulier. |
## Voir aussi

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
