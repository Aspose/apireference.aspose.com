---
title: "System::Threading::Interlocked klasse"
linktitle: "Interlocked"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Interlocked klasse. Biedt een API voor thread‑veilige bewerkingen. Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken in C++."
type: docs
weight: 600
url: /nl/cpp/system.threading/interlocked/
---
## Interlocked class


Biedt een API voor thread-veilige bewerkingen. Dit is een statisch type zonder instantie-services. Je mag onder geen enkele omstandigheid instanties ervan maken.

```cpp
class Interlocked
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Add](./add/)(int32_t\&, int32_t) | Verhoogt de waarde atomisch. |
| static [Add](./add/)(int64_t\&, int64_t) | Verhoogt de waarde atomisch. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Vergelijkt en wisselt de waarde op een variabele: controleert of de variabele gelijk is aan een specifieke waarde en slaat de nieuwe waarde alleen op als de opgeslagen waarde overeenkomt met de verwachte. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Vergelijkt en wisselt de waarde op een variabele: controleert of de variabele gelijk is aan een specifieke waarde en slaat de nieuwe waarde alleen op als de opgeslagen waarde overeenkomt met de verwachte. Niet geïmplementeerd. |
| static [CompareExchange](./compareexchange/)(int32_t\&, int32_t, int32_t, bool\&) | Vergelijkt en wisselt de waarde op een variabele: controleert of de variabele gelijk is aan een specifieke waarde en slaat de nieuwe waarde alleen op als de opgeslagen waarde overeenkomt met de verwachte. |
| static [Decrement](./decrement/)(int32_t\&) | Verlaagt de waarde atomisch. |
| static [Decrement](./decrement/)(int64_t\&) | Verlaagt de waarde atomisch. |
| static [Exchange](./exchange/)(T\&, T) | Wisselt de waarde op een variabele: slaat de nieuwe waarde op en retourneert de waarde die de variabele onmiddellijk vóór het opslaan had. |
| static [Exchange](./exchange/)(T\&, T) | Wisselt de waarde op een variabele: slaat de nieuwe waarde op en retourneert de waarde die de variabele onmiddellijk vóór het opslaan had. Niet geïmplementeerd. |
| static [ExchangeAdd](./exchangeadd/)(int32_t\&, int32_t) | Verhoogt de waarde atomisch via een exchange‑add‑procedure. |
| static [ExchangeAdd](./exchangeadd/)(int64_t\&, int64_t) | Verhoogt de waarde atomisch via een exchange‑add‑procedure. |
| static [Increment](./increment/)(int32_t\&) | Verhoogt de waarde atomisch. |
| static [Increment](./increment/)(int64_t\&) | Verhoogt de waarde atomisch. |
| static [Read](./read/)(int64_t\&) | Retourneert een 64‑bit waarde, geladen als een atomische bewerking. |
## Zie ook

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
