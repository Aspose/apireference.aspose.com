---
title: "System::Threading::Semaphore::WaitOne methode"
linktitle: "WaitOne"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Semaphore::WaitOne methode. Vergrendelt de semaphore. Voert onbeperkt wachten uit indien nodig in C++."
type: docs
weight: 500
url: /nl/cpp/system.threading/semaphore/waitone/
---
## Semaphore::WaitOne() method


Vergrendelt semaphore. Voert onbeperkt wachten uit indien nodig.

```cpp
virtual bool System::Threading::Semaphore::WaitOne() override
```


### ReturnValue

Geeft altijd true terug omdat het niet terugkeert totdat de semaphore is vergrendeld.

## Zie ook

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Semaphore::WaitOne(int) method


Vergrendelt semaphore. Voert wachten uit indien nodig.

```cpp
virtual bool System::Threading::Semaphore::WaitOne(int millisecondsTimeout) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| millisecondsTimeout | int | Wachttijd in milliseconden. |

### ReturnValue

Geeft true terug als de semaphore vergrendeld was of false als de timeout is overschreden.

## Zie ook

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
