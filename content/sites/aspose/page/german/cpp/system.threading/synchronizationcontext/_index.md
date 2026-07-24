---
title: "System::Threading::SynchronizationContext Klasse"
linktitle: "SynchronizationContext"
second_title: "Aspose.Page für C++"
description: "System::Threading::SynchronizationContext Klasse. Bietet die grundlegende Funktionalität zum Weiterleiten eines Synchronisationskontexts über verschiedene Synchronisationsvorgänge in C++."
type: docs
weight: 1100
url: /de/cpp/system.threading/synchronizationcontext/
---
## SynchronizationContext class


Stellt die Grundfunktionalität zum Weitergeben eines Synchronisationskontexts über verschiedene Synchronisationsvorgänge bereit.

```cpp
class SynchronizationContext : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [get_Current](./get_current/)() | Ermittelt den Synchronisationskontext für den aktuellen Thread. |
| static [SetSynchronizationContext](./setsynchronizationcontext/)(const SharedPtr\<SynchronizationContext\>\&) | Setzt den Synchronisationskontext für den aktuellen Thread. |
| [SynchronizationContext](./synchronizationcontext/)() | RTTI-Informationen. |
## Hinweise


Diese Klasse ermöglicht die Weiterleitung des Synchronisationskontexts zwischen Threads und wird verwendet, um Rückrufe oder Aufrufe an den entsprechenden Thread bzw. Synchronisationskontext zu marshallen.
Dummy‑Implementierung.

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
