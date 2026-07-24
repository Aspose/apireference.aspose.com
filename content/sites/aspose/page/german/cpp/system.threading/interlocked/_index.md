---
title: "System::Threading::Interlocked Klasse"
linktitle: "Interlocked"
second_title: "Aspose.Page für C++"
description: "System::Threading::Interlocked Klasse. Stellt eine API für thread‑sichere Operationen bereit. Es handelt sich um einen statischen Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise in C++ erstellen."
type: docs
weight: 600
url: /de/cpp/system.threading/interlocked/
---
## Interlocked class


Stellt eine API für thread‑sichere Vorgänge bereit. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise erstellen.

```cpp
class Interlocked
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Add](./add/)(int32_t\&, int32_t) | Erhöht den Wert atomar. |
| static [Add](./add/)(int64_t\&, int64_t) | Erhöht den Wert atomar. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Vergleicht und tauscht den Wert einer Variablen aus: prüft, ob die Variable einem bestimmten Wert entspricht und speichert den neuen Wert nur, wenn der gespeicherte Wert dem erwarteten entspricht. |
| static [CompareExchange](./compareexchange/)(T\&, T, T) | Vergleicht und tauscht den Wert einer Variablen aus: prüft, ob die Variable einem bestimmten Wert entspricht und speichert den neuen Wert nur, wenn der gespeicherte Wert dem erwarteten entspricht. Nicht implementiert. |
| static [CompareExchange](./compareexchange/)(int32_t\&, int32_t, int32_t, bool\&) | Vergleicht und tauscht den Wert einer Variablen aus: prüft, ob die Variable einem bestimmten Wert entspricht und speichert den neuen Wert nur, wenn der gespeicherte Wert dem erwarteten entspricht. |
| static [Decrement](./decrement/)(int32_t\&) | Dekrementiert den Wert atomar. |
| static [Decrement](./decrement/)(int64_t\&) | Dekrementiert den Wert atomar. |
| static [Exchange](./exchange/)(T\&, T) | Tauscht den Wert einer Variablen aus: speichert den neuen Wert und gibt den Wert zurück, den die Variable unmittelbar vor dem Speichern hatte. |
| static [Exchange](./exchange/)(T\&, T) | Tauscht den Wert einer Variablen aus: speichert den neuen Wert und gibt den Wert zurück, den die Variable unmittelbar vor dem Speichern hatte. Nicht implementiert. |
| static [ExchangeAdd](./exchangeadd/)(int32_t\&, int32_t) | Erhöht den Wert atomar mittels Austausch‑Add‑Verfahren. |
| static [ExchangeAdd](./exchangeadd/)(int64_t\&, int64_t) | Erhöht den Wert atomar mittels Austausch‑Add‑Verfahren. |
| static [Increment](./increment/)(int32_t\&) | Inkrementiert den Wert atomar. |
| static [Increment](./increment/)(int64_t\&) | Inkrementiert den Wert atomar. |
| static [Read](./read/)(int64_t\&) | Gibt einen 64‑Bit‑Wert zurück, der als atomare Operation geladen wird. |
## Siehe auch

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
