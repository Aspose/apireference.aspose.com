---
title: "System::IO::Stream::BeginRead methode"
linktitle: "BeginRead"
second_title: "Aspose.Page voor C++"
description: "System::IO::Stream::BeginRead methode. Initialiseert een asynchrone leesbewerking in C++."
type: docs
weight: 100
url: /nl/cpp/system.io/stream/beginread/
---
## Stream::BeginRead method


Initieert een asynchrone leesbewerking.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginRead(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Een buffer om naar te lezen |
| offset | int | Een 0-gebaseerde offset in **buffer** die de positie aangeeft vanaf waar de gelezen gegevens moeten worden geschreven |
| count | int | Het aantal bytes om te lezen |
| callback | System::AsyncCallback | Een callback die wordt aangeroepen wanneer de bewerking voltooid is |
| state | System::SharedPtr\<System::Object\> | Door de gebruiker geleverde gegevens die worden gebruikt om elke asynchrone leesbewerking uniek te identificeren |

### ReturnValue

Een [IAsyncResult](../../../system/iasyncresult/) object dat de geïnitieerde asynchrone leesbewerking vertegenwoordigt

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
