---
title: "System::IO::Stream::BeginWrite-methode"
linktitle: "BeginWrite"
second_title: "Aspose.Page voor C++"
description: "System::IO::Stream::BeginWrite-methode. Initieert een asynchrone schrijfoperatie in C++."
type: docs
weight: 200
url: /nl/cpp/system.io/stream/beginwrite/
---
## Stream::BeginWrite method


Initieert een asynchrone schrijfbewerking.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Een buffer die gegevens bevat die moeten worden geschreven |
| offset | int | Een 0-gebaseerde offset in **buffer** die de positie aangeeft vanaf waar de te schrijven gegevens beginnen |
| count | int | Het aantal bytes om te schrijven |
| callback | System::AsyncCallback | Een callback die wordt aangeroepen wanneer de bewerking voltooid is |
| state | System::SharedPtr\<System::Object\> | Door de gebruiker geleverde gegevens die worden gebruikt om elke asynchrone schrijfoperatie uniek te identificeren |

### ReturnValue

Een [IAsyncResult](../../../system/iasyncresult/) object dat de geïnitieerde asynchrone schrijfoperatie vertegenwoordigt

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
