---
title: "System::Threading::SynchronizationContext Klasse"
linktitle: "SynchronizationContext"
second_title: "Aspose.Font für C++"
description: "System::Threading::SynchronizationContext Klasse. Bietet die grundlegende Funktionalität zum Weiterleiten eines Synchronisationskontexts über verschiedene Synchronisationsvorgänge in C++."
type: docs
weight: 1100
url: /de/cpp/system.threading/synchronizationcontext/
---
## SynchronizationContext class


Bietet die Grundfunktionalität zum Weitergeben eines Synchronisationskontexts über verschiedene Synchronisationsvorgänge.

```cpp
class SynchronizationContext : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [get_Current](./get_current/)() | Liefert den Synchronisationskontext für den aktuellen Thread. |
| virtual [Post](./post/)(SendOrPostCallback, SharedPtr\<Object\>) | Führt den Rückruf asynchron aus. |
| virtual [Send](./send/)(SendOrPostCallback, SharedPtr\<Object\>) | Führt den Rückruf synchron aus. |
| static [SetSynchronizationContext](./setsynchronizationcontext/)(const SharedPtr\<SynchronizationContext\>\&) | Setzt den Synchronisationskontext für den aktuellen Thread. |
| [SynchronizationContext](./synchronizationcontext/)() | RTTI-Informationen. |
## Hinweise


Diese Klasse ermöglicht die Weitergabe des Synchronisationskontexts zwischen Threads und wird verwendet, um Rückrufe oder Aufrufe an den entsprechenden Thread oder Synchronisationskontext zu marshallen.
Dummy-Implementierung.

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
