---
title: "System::Collections::CollectionBase classe"
linktitle: "CollectionBase"
second_title: "Aspose.Page pour C++"
description: "System::Collections::CollectionBase classe. Fournit une classe de base abstraite pour une collection fortement typée en C++."
type: docs
weight: 300
url: /fr/cpp/system.collections/collectionbase/
---
## CollectionBase class


Fournit une classe de base abstraite pour une collection fortement typée.

```cpp
template<typename T>class CollectionBase : public virtual System::Collections::Generic::IEnumerable<T>
```


| Paramètre | Description |
| --- | --- |
| T | Type des éléments de la collection |
## Nested classes

* Class [ListImpl](./listimpl/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [Clear](./clear/)() | Supprime tous les objets de l'instance de la collection. Cette méthode ne peut pas être remplacée. |
| [get_Capacity](./get_capacity/)() | Retourne le nombre d'éléments que la collection peut contenir. |
| [get_Count](./get_count/)() | Retourne le nombre d'éléments contenus dans l'instance de la collection. Cette méthode ne peut pas être remplacée. |
| [GetEnumerator](./getenumerator/)() override | Retourne un énumérateur qui parcourt l'instance de la collection. |
| [RemoveAt](./removeat/)(int32_t) | Supprime l'élément à l'index spécifié de l'instance de la collection. Cette méthode n'est pas remplaçable. |
| [set_Capacity](./set_capacity/)(int32_t) | Définit le nombre d'éléments que la collection peut contenir. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Définit le n-ième argument de modèle comme un pointeur faible (plutôt que partagé). Permet de basculer les pointeurs dans les conteneurs en mode faible. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |

## Voir aussi

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
