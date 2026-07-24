---
title: "System::Threading::Thread::Join-methode"
linktitle: "Join"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Thread::Join-methode. Voegt beheerde thread samen. Voert onbeperkt wachten uit indien nodig in C++."
type: docs
weight: 1400
url: /nl/cpp/system.threading/thread/join/
---
## Thread::Join() method


Voegt zich bij een beheerde thread. Voert onbeperkt wachten uit indien nodig.

```cpp
void System::Threading::Thread::Join()
```

## Zie ook

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Thread::Join(int) method


Voegt zich bij een beheerde thread. Voert beperkt wachten uit.

```cpp
bool System::Threading::Thread::Join(int millisecondsTimeout)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| millisecondsTimeout | int | Wachttijd in milliseconden. |

### ReturnValue

True als de thread succesvol is samengevoegd, false als de time‑out is overschreden.

## Zie ook

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Thread::Join(TimeSpan) method


Voegt zich bij een beheerde thread. Voert beperkt wachten uit.

```cpp
bool System::Threading::Thread::Join(TimeSpan timeout)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| timeout | TimeSpan | Een [TimeSpan](../../../system/timespan/) ingesteld op de hoeveelheid tijd om te wachten tot de thread beëindigt. |

### ReturnValue

True als de thread succesvol is samengevoegd, false als de time‑out is overschreden.

## Zie ook

* Class [TimeSpan](../../../system/timespan/)
* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
