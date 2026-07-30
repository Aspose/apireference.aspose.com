---
title: "System::Threading::CancellationTokenRegistration Klasse"
linktitle: "CancellationTokenRegistration"
second_title: "Aspose.Font für C++"
description: "System::Threading::CancellationTokenRegistration Klasse. Stellt eine Registrierung für einen Abbruch-Token-Callback in C++ dar."
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
| [Dispose](./dispose/)() | Gibt die Registrierung frei und entfernt den Callback aus der zugehörigen [CancellationTokenSource](../cancellationtokensource/). Nach Aufruf dieser Methode wird der registrierte Callback nicht mehr aufgerufen, wenn die zugehörige [CancellationTokenSource](../cancellationtokensource/) abgebrochen wird. |
## Hinweise


Diese Klasse ermöglicht die Abmeldung eines Callbacks von einem Cancellation‑Token. Beim Freigeben entfernt sie den Callback aus der zugehörigen [CancellationTokenSource](../cancellationtokensource/).
Diese Klasse sollte nicht direkt erstellt werden – sie wird von den Registrierungs‑Methoden des [CancellationToken](../cancellationtoken/) zurückgegeben.

## Siehe auch

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
