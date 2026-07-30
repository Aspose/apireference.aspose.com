---
title: "classe System::Collections::CollectionBase"
linktitle: "CollectionBase"
second_title: "Aspose.Font pour C++"
description: "classe System::Collections::CollectionBase. Fournit une classe de base abstraite pour une collection fortement typée en C++."
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
| [get_Capacity](./get_capacity/)() | Renvoie le nombre d'éléments que la collection peut contenir. |
| [get_Count](./get_count/)() | Renvoie le nombre d'éléments contenus dans l'instance de la collection. Cette méthode ne peut pas être remplacée. |
| [GetEnumerator](./getenumerator/)() override | Renvoie un énumérateur qui parcourt l'instance de la collection. |
| [RemoveAt](./removeat/)(int32_t) | Supprime l'élément à l'index spécifié de l'instance de la collection. Cette méthode n'est pas surchargeable. |
| [set_Capacity](./set_capacity/)(int32_t) | Définit le nombre d'éléments que la collection peut contenir. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Définir le n-ième argument de modèle comme un pointeur faible (plutôt que partagé). Permet de basculer les pointeurs dans les conteneurs en mode faible. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |

## Voir aussi

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
