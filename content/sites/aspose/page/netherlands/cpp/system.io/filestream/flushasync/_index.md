---
title: "System::IO::FileStream::FlushAsync methode"
linktitle: "FlushAsync"
second_title: "Aspose.Page voor C++"
description: "System::IO::FileStream::FlushAsync-methode. Leegt asynchroon alle buffers voor deze stream, zorgt ervoor dat alle gebufferde gegevens naar het onderliggende apparaat worden geschreven, en bewaakt annuleringsverzoeken in C++."
type: docs
weight: 500
url: /nl/cpp/system.io/filestream/flushasync/
---
## FileStream::FlushAsync method


Maakt asynchroon alle buffers voor deze stream leeg, zorgt ervoor dat alle gebufferde gegevens naar het onderliggende apparaat worden geschreven, en bewaakt annuleringsverzoeken.

```cpp
TaskPtr System::IO::FileStream::FlushAsync(const Threading::CancellationToken &cancellationToken) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | Het token om te bewaken voor annuleringsverzoeken. |

### ReturnValue

Een taak die de asynchrone flush‑operatie vertegenwoordigt.

## Zie ook

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
