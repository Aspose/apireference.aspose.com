---
title: "System::Threading::CancellationTokenRegistration class"
linktitle: "CancellationTokenRegistration"
second_title: "Aspose.Page für C++"
description: "System::Threading::CancellationTokenRegistration class. Stellt eine Registrierung für einen Cancellation-Token-Callback in C++ dar."
type: docs
weight: 300
url: /de/cpp/system.threading/cancellationtokenregistration/
---
## CancellationTokenRegistration class


Stellt eine Registrierung für einen Abbruch-Token-Callback dar.

```cpp
class CancellationTokenRegistration
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Dispose](./dispose/)() | Entfernt die Registrierung und löscht den Callback aus der zugehörigen [CancellationTokenSource](../cancellationtokensource/). Nach dem Aufruf dieser Methode wird der registrierte Callback nicht mehr aufgerufen, wenn die zugehörige [CancellationTokenSource](../cancellationtokensource/) abgebrochen wird. |
## Hinweise


Diese Klasse ermöglicht die Deregistrierung eines Callbacks von einem Cancellation-Token. Beim Entsorgen entfernt sie den Callback aus der zugehörigen [CancellationTokenSource](../cancellationtokensource/).
Diese Klasse sollte nicht direkt erstellt werden – sie wird von den Registrierungs‑Methoden des [CancellationToken](../cancellationtoken/) zurückgegeben.

## Siehe auch

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
