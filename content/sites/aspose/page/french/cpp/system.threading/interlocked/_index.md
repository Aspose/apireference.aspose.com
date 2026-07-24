---
title: "System::Threading::Interlocked classe"
linktitle: "Interlocked"
second_title: "Aspose.Page pour C++"
description: "System::Threading::Interlocked classe. Fournit une API pour des opérations thread-safe. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci par quelque moyen que ce soit en C++."
type: docs
weight: 600
url: /fr/cpp/system.threading/interlocked/
---
## Interlocked class


Fournit une API pour les opérations thread‑safe. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui‑ci par quelque moyen que ce soit.

```cpp
class Interlocked
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Add](./add/)(int32_t\&, int32_t) | Augmente la valeur de manière atomique. |
| static [Add](./add/)(int64_t\&, int64_t) | Augmente la valeur de manière atomique. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Compare-échange la valeur d'une variable : vérifie si la variable est égale à une valeur spécifique et stocke la nouvelle valeur uniquement si la valeur stockée correspond à celle attendue. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Compare-échange la valeur d'une variable : vérifie si la variable est égale à une valeur spécifique et stocke la nouvelle valeur uniquement si la valeur stockée correspond à celle attendue. Non implémenté. |
| static [CompareExchange](./compareexchange/)(int32_t\&, int32_t, int32_t, bool\&) | Compare-échange la valeur d'une variable : vérifie si la variable est égale à une valeur spécifique et stocke la nouvelle valeur uniquement si la valeur stockée correspond à celle attendue. |
| static [Decrement](./decrement/)(int32_t\&) | Décrémente la valeur de manière atomique. |
| static [Decrement](./decrement/)(int64_t\&) | Décrémente la valeur de manière atomique. |
| static [Exchange](./exchange/)(T\&, T) | Échange la valeur d'une variable : stocke la nouvelle valeur et renvoie la valeur que la variable possédait immédiatement avant le stockage. |
| static [Exchange](./exchange/)(T\&, T) | Échange la valeur d'une variable : stocke la nouvelle valeur et renvoie la valeur que la variable possédait immédiatement avant le stockage. Non implémenté. |
| static [ExchangeAdd](./exchangeadd/)(int32_t\&, int32_t) | Augmente la valeur de manière atomique via la procédure d'échange-addition. |
| static [ExchangeAdd](./exchangeadd/)(int64_t\&, int64_t) | Augmente la valeur de manière atomique via la procédure d'échange-addition. |
| static [Increment](./increment/)(int32_t\&) | Incrémente la valeur de manière atomique. |
| static [Increment](./increment/)(int64_t\&) | Incrémente la valeur de manière atomique. |
| static [Read](./read/)(int64_t\&) | Renvoie une valeur 64 bits, chargée comme une opération atomique. |
## Voir aussi

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
