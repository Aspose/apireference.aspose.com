---
title: "classe System::Threading::Interlocked"
linktitle: "Interlocked"
second_title: "Aspose.Font pour C++"
description: "classe System::Threading::Interlocked. Fournit une API pour les opérations thread-safe. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci par quelque moyen que ce soit en C++."
type: docs
weight: 600
url: /fr/cpp/system.threading/interlocked/
---
## Interlocked class


Fournit une API pour les opérations thread-safe. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci, quels que soient les moyens.

```cpp
class Interlocked
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Add](./add/)(int32_t\&, int32_t) | Augmente la valeur de façon atomique. |
| static [Add](./add/)(int64_t\&, int64_t) | Augmente la valeur de façon atomique. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Comparer les échanges de valeur sur la variable : vérifie si la variable est égale à une valeur spécifique et stocke la nouvelle valeur uniquement si la valeur stockée correspond à celle attendue. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Comparer les échanges de valeur sur la variable : vérifie si la variable est égale à une valeur spécifique et stocke la nouvelle valeur uniquement si la valeur stockée correspond à celle attendue. Non implémenté. |
| static [CompareExchange](./compareexchange/)(int32_t\&, int32_t, int32_t, bool\&) | Comparer les échanges de valeur sur la variable : vérifie si la variable est égale à une valeur spécifique et stocke la nouvelle valeur uniquement si la valeur stockée correspond à celle attendue. |
| static [Decrement](./decrement/)(int32_t\&) | Décrémente la valeur de façon atomique. |
| static [Decrement](./decrement/)(int64_t\&) | Décrémente la valeur de façon atomique. |
| static [Exchange](./exchange/)(T\&, T) | Échange la valeur sur la variable : stocke la nouvelle valeur et renvoie la valeur que la variable possédait immédiatement avant le stockage. |
| static [Exchange](./exchange/)(T\&, T) | Échange la valeur sur la variable : stocke la nouvelle valeur et renvoie la valeur que la variable possédait immédiatement avant le stockage. Non implémenté. |
| static [ExchangeAdd](./exchangeadd/)(int32_t\&, int32_t) | Augmente la valeur de façon atomique via la procédure d'échange-add. |
| static [ExchangeAdd](./exchangeadd/)(int64_t\&, int64_t) | Augmente la valeur de façon atomique via la procédure d'échange-add. |
| static [Increment](./increment/)(int32_t\&) | Incrémente la valeur de façon atomique. |
| static [Increment](./increment/)(int64_t\&) | Incrémente la valeur de façon atomique. |
| static [Read](./read/)(int64_t\&) | Renvoie une valeur 64 bits, chargée comme une opération atomique. |
## Voir aussi

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
