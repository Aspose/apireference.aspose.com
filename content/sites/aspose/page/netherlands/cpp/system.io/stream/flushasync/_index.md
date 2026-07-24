---
title: "System::IO::Stream::FlushAsync methode"
linktitle: "FlushAsync"
second_title: "Aspose.Page voor C++"
description: "System::IO::Stream::FlushAsync-methode. Wischt asynchroon alle buffers voor deze stream, zorgt ervoor dat alle gebufferde gegevens naar het onderliggende apparaat worden geschreven, en bewaakt annuleringsverzoeken in C++."
type: docs
weight: 900
url: /nl/cpp/system.io/stream/flushasync/
---
## Stream::FlushAsync() method


Maakt asynchroon alle buffers voor deze stream leeg, zorgt ervoor dat alle gebufferde gegevens naar het onderliggende apparaat worden geschreven, en bewaakt annuleringsverzoeken.

```cpp
TaskPtr System::IO::Stream::FlushAsync()
```


### ReturnValue

Een taak die de asynchrone flush‑operatie vertegenwoordigt.

## Zie ook

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::FlushAsync(const Threading::CancellationToken\&) method


Maakt asynchroon alle buffers voor deze stream leeg, zorgt ervoor dat alle gebufferde gegevens naar het onderliggende apparaat worden geschreven, en bewaakt annuleringsverzoeken.

```cpp
virtual TaskPtr System::IO::Stream::FlushAsync(const Threading::CancellationToken &cancellationToken)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | Het token om te bewaken voor annuleringsverzoeken. |

### ReturnValue

Een taak die de asynchrone flush‑operatie vertegenwoordigt.

## Zie ook

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
