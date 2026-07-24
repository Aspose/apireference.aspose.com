---
title: "System::IO::Stream::WriteAsync‑metod"
linktitle: "WriteAsync"
second_title: "Aspose.Page för C++"
description: "System::IO::Stream::WriteAsync‑metod. Skriver asynkront en sekvens av byte till den aktuella strömmen, avancerar den aktuella positionen i strömmen med antalet skrivna byte och övervakar avbokningsförfrågningar i C++."
type: docs
weight: 2700
url: /sv/cpp/system.io/stream/writeasync/
---
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Skriver asynkront en sekvens av byte till den aktuella strömmen, förflyttar den aktuella positionen i denna ström med antalet skrivna byte och övervakar avbokningsförfrågningar.

```cpp
TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const ArrayPtr\<uint8_t\>\& | Arrayen som innehåller byte att skriva. |
| offset | int32_t | Ett 0‑baserat index för elementet i **buffer** där delintervallet som ska skrivas börjar. |
| count | int32_t | Antalet element i delintervallet att skriva. |

### ReturnValue

En uppgift som representerar den asynkrona skrivoperationen.

## Se även

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


Skriver asynkront en sekvens av byte till den aktuella strömmen, förflyttar den aktuella positionen i denna ström med antalet skrivna byte och övervakar avbokningsförfrågningar.

```cpp
virtual TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const ArrayPtr\<uint8_t\>\& | Arrayen som innehåller byte att skriva. |
| offset | int32_t | Ett 0‑baserat index för elementet i **buffer** där delintervallet som ska skrivas börjar. |
| count | int32_t | Antalet element i delintervallet att skriva. |
| cancellationToken | const Threading::CancellationToken\& | Tokenet för att övervaka avbokningsförfrågningar. |

### ReturnValue

En uppgift som representerar den asynkrona skrivoperationen.

## Se även

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
