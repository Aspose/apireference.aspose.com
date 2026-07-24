---
title: "System::IO::Stream::WriteAsync methode"
linktitle: "WriteAsync"
second_title: "Aspose.Page voor C++"
description: "System::IO::Stream::WriteAsync methode. Schrijft asynchroon een reeks bytes naar de huidige stream, verplaatst de huidige positie binnen deze stream met het aantal geschreven bytes, en houdt annuleringsverzoeken bij in C++."
type: docs
weight: 2700
url: /nl/cpp/system.io/stream/writeasync/
---
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Schrijft asynchroon een reeks bytes naar de huidige stream, verplaatst de huidige positie binnen deze stream met het aantal geschreven bytes, en bewaakt annuleringsverzoeken.

```cpp
TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | De array die de te schrijven bytes bevat. |
| offset | int32_t | Een 0‑gebaseerde index van het element in **buffer** waarop de subreeks om te schrijven begint. |
| count | int32_t | Het aantal elementen in het subbereik dat moet worden geschreven. |

### ReturnValue

Een taak die de asynchrone schrijfoperatie vertegenwoordigt.

## Zie ook

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


Schrijft asynchroon een reeks bytes naar de huidige stream, verplaatst de huidige positie binnen deze stream met het aantal geschreven bytes, en bewaakt annuleringsverzoeken.

```cpp
virtual TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | De array die de te schrijven bytes bevat. |
| offset | int32_t | Een 0‑gebaseerde index van het element in **buffer** waarop de subreeks om te schrijven begint. |
| count | int32_t | Het aantal elementen in het subbereik dat moet worden geschreven. |
| cancellationToken | const Threading::CancellationToken\& | Het token om te bewaken voor annuleringsverzoeken. |

### ReturnValue

Een taak die de asynchrone schrijfoperatie vertegenwoordigt.

## Zie ook

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
