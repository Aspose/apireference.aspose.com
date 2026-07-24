---
title: "System::Threading::SynchronizationContext klasse"
linktitle: "SynchronizationContext"
second_title: "Aspose.Page voor C++"
description: "System::Threading::SynchronizationContext klasse. Biedt de basisfunctionaliteit voor het propageren van een synchronisatie‑context over verschillende synchronisatie‑operaties in C++."
type: docs
weight: 1100
url: /nl/cpp/system.threading/synchronizationcontext/
---
## SynchronizationContext class


Biedt de basisfunctionaliteit voor het doorgeven van een synchronisatie-context over verschillende synchronisatie-bewerkingen.

```cpp
class SynchronizationContext : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [get_Current](./get_current/)() | Haalt de synchronisatie‑context op voor de huidige thread. |
| static [SetSynchronizationContext](./setsynchronizationcontext/)(const SharedPtr\<SynchronizationContext\>\&) | Stelt de synchronisatie‑context in voor de huidige thread. |
| [SynchronizationContext](./synchronizationcontext/)() | RTTI-informatie. |
## Opmerkingen


Deze klasse maakt de propagatie van synchronisatie‑context tussen threads mogelijk en wordt gebruikt om callbacks of aanroepen te marshallen naar de juiste thread of synchronisatie‑context.
Dummy‑implementatie.

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
