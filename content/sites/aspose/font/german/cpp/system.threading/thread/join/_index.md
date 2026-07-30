---
title: "System::Threading::Thread::Join-Methode"
linktitle: "Join"
second_title: "Aspose.Font für C++"
description: "System::Threading::Thread::Join-Methode. Verbindet den verwalteten Thread. Führt bei Bedarf unbegrenztes Warten in C++ aus."
type: docs
weight: 1400
url: /de/cpp/system.threading/thread/join/
---
## Thread::Join() method


Wartet auf den verwalteten Thread. Führt bei Bedarf unbegrenztes Warten aus.

```cpp
void System::Threading::Thread::Join()
```

## Siehe auch

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Thread::Join(int) method


Wartet auf den verwalteten Thread. Führt begrenztes Warten aus.

```cpp
bool System::Threading::Thread::Join(int millisecondsTimeout)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| millisecondsTimeout | int | Wartezeit-Timeout in Millisekunden. |

### ReturnValue

Wahr, wenn der Thread erfolgreich verbunden wurde, falsch, wenn das Timeout überschritten wurde.

## Siehe auch

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Thread::Join(TimeSpan) method


Wartet auf den verwalteten Thread. Führt begrenztes Warten aus.

```cpp
bool System::Threading::Thread::Join(TimeSpan timeout)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| timeout | TimeSpan | Ein [TimeSpan](../../../system/timespan/) festgelegt auf die Zeit, die gewartet werden soll, bis der Thread beendet ist. |

### ReturnValue

Wahr, wenn der Thread erfolgreich verbunden wurde, falsch, wenn das Timeout überschritten wurde.

## Siehe auch

* Class [TimeSpan](../../../system/timespan/)
* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
