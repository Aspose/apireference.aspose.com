---
title: "System::DynamicWeakPtr class"
linktitle: "DynamicWeakPtr"
second_title: "Aspose.Font pour C++"
description: "System::DynamicWeakPtr class. Classe de pointeur intelligent qui suit les modes de pointeur des arguments de modèle de l'objet stocké et les met à jour après chaque affectation. Ce type est un pointeur destiné à gérer la suppression d'un autre objet. Il doit être alloué sur la pile et passé aux fonctions soit par valeur, soit par référence constante en C++."
type: docs
weight: 2200
url: /fr/cpp/system/dynamicweakptr/
---
## DynamicWeakPtr class


Classe de pointeur intelligent qui suit les modes de pointeur des arguments de modèle de l'objet stocké et les met à jour après chaque affectation. Ce type est un pointeur destiné à gérer la suppression d'autres objets. Il doit être alloué sur la pile et passé aux fonctions soit par valeur, soit par référence constante.

```cpp
template<typename T,SmartPtrMode,unsigned int ...>class DynamicWeakPtr : public System::SmartPtr<T>
```


| Paramètre | Description |
| --- | --- |
| Objet pointé | type. |
| trunkMode | Mode du pointeur intelligent lui-même, partagé ou faible. |
| weakLeafs | Indices des arguments de modèle du type stocké qui doivent être définis en mode pointeur faible. |
## Nested classes

* Class [Reference](./reference/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [DynamicWeakPtr](./dynamicweakptr/)(std::nullptr_t) | Crée un pointeur intelligent nul. |
| [DynamicWeakPtr](./dynamicweakptr/)(Pointee_ *) | Crée un pointeur intelligent pointant vers l'objet donné. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr_\&) | Construit par copie le pointeur intelligent. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr\<Q\>\&) | Construit par copie le pointeur intelligent. |
| [DynamicWeakPtr](./dynamicweakptr/)(const DynamicWeakPtr_\&) | Construit par copie le pointeur intelligent. |
| [DynamicWeakPtr](./dynamicweakptr/)(SmartPtr_\&&) | Construit par déplacement le pointeur intelligent. |
| [operator=](./operator=/)(SmartPtr_\&&) | Assigne par déplacement le pointeur intelligent. |
| [operator=](./operator=/)(const SmartPtr_\&) | Assigne par copie le pointeur intelligent. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Assigne par copie le pointeur intelligent. |
| [operator=](./operator=/)(typename SmartPtr_::Pointee_ *) | Assigne le pointeur intelligent. |
| [operator=](./operator=/)(std::nullptr_t) | Met le pointeur intelligent à nul. |
| [operator==](./operator==/)(std::nullptr_t) const | Vérifie si le pointeur intelligent est null. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [DynamicWeakPtr_](./dynamicweakptr_/) | Alias du type lui-même. |
| [Pointee_](./pointee_/) | Type pointé. |
| [SmartPtr_](./smartptr_/) | [SmartPtr](../smartptr/) alias de classe de base. |

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
