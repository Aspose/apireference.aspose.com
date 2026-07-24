---
title: "System::IO::FileStream::WriteAsync method"
linktitle: "WriteAsync"
second_title: "Aspose.Page voor C++"
description: "System::IO::FileStream::WriteAsync method. Schrijft asynchroon een reeks bytes naar de huidige stream, verplaatst de huidige positie binnen deze stream met het aantal geschreven bytes, en bewaakt annuleringsverzoeken in C++."
type: docs
weight: 2000
url: /nl/cpp/system.io/filestream/writeasync/
---
## FileStream::WriteAsync method


Schrijft asynchroon een reeks bytes naar de huidige stream, verplaatst de huidige positie binnen deze stream met het aantal geschreven bytes, en bewaakt annuleringsverzoeken.

```cpp
TaskPtr System::IO::FileStream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
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
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
