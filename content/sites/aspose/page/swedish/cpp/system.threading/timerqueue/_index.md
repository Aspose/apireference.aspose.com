---
title: "System::Threading::TimerQueue class"
linktitle: "TimerQueue"
second_title: "Aspose.Page för C++"
description: "System::Threading::TimerQueue class. Kö som hanterar Timer‑objekt. Detta är bara en implementation. Timer‑objekt registrerar sig själva där, du behöver inte göra det för att använda dem – använd Timer‑klassens API istället. Detta är en singleton‑typ med minneshantering som sköts av åtkomstfunktion(er). Du bör aldrig skapa instanser av den direkt i C++."
type: docs
weight: 1600
url: /sv/cpp/system.threading/timerqueue/
---
## TimerQueue class


Kö som hanterar [Timer](../timer/)‑objekt. Detta är bara en implementation. [Timer](../timer/)‑objekt registrerar sig själva där, du behöver inte göra det för att använda dem – använd [Timer](../timer/)‑klassens API istället. Detta är en singleton‑typ med minneshantering som sker via åtkomstfunktion(er). Du bör aldrig skapa instanser av den direkt.

```cpp
class TimerQueue
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(Timer *) | Registrerar timer i kön. |
| [Delete](./delete/)(Timer *) | Tar bort timer från kön. |
| static [GetInstance](./getinstance/)() | Implementationssingleton. |
| static [JoinWorkerThread](./joinworkerthread/)() | Går med i arbets‑tråden. Väntar oändligt om det krävs. |
| [operator=](./operator=/)(const TimerQueue\&) | Ingen kopiering. |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | Ingen kopiering. |
## Se även

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
