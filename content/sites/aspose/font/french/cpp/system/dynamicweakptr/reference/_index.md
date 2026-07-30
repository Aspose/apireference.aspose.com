---
title: "System::DynamicWeakPtr::Reference classe"
linktitle: "Reference"
second_title: "Aspose.Font pour C++"
description: "System::DynamicWeakPtr::Reference classe. Classe de référence qui garantit que DynamicWeakPtr::Apply est appelé. Utilisée si DynamicWeakPtr est passé comme paramètre de référence SmartPtr à une fonction qui peut lui assigner une valeur en C++."
type: docs
weight: 700
url: /fr/cpp/system/dynamicweakptr/reference/
---
## Reference class


[Reference](./) class which ensures that DynamicWeakPtr::Apply is called. Used if [DynamicWeakPtr](../) is passed as [SmartPtr](../../smartptr/) reference parameter to function which may assign to it.

```cpp
class Reference
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [operator DynamicWeakPtr_ &](./operatordynamicweakptr_&/)() const | Opérateur de conversion. Permet d'utiliser [Reference](./) dans les contextes où [DynamicWeakPtr_](../dynamicweakptr_/) est requis. |
| [Reference](./reference/)(DynamicWeakPtr_\&) | Crée une référence de pointeur intelligent. |
| [Reference](./reference/)(Reference\&&) | Construit par déplacement une référence de pointeur intelligent. |
| [~Reference](./~reference/)() | Détruit la référence. Garantit l'appel de Apply() sur le pointeur intelligent référencé. |
## Voir aussi

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
