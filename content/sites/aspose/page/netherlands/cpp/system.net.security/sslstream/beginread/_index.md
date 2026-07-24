---
title: "System::Net::Security::SslStream::BeginRead methode"
linktitle: "BeginRead"
second_title: "Aspose.Page voor C++"
description: "System::Net::Security::SslStream::BeginRead methode. Initialiseert een asynchrone leesbewerking in C++."
type: docs
weight: 300
url: /nl/cpp/system.net.security/sslstream/beginread/
---
## SslStream::BeginRead method


Initieert een asynchrone leesbewerking.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De byte-array om gegevens uit te lezen. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| count | int32_t | Het aantal bytes om te lezen. |
| asyncCallback | AsyncCallback | Een callback die wordt aangeroepen wanneer de bewerking is voltooid. |
| asyncState | System::SharedPtr\<Object\> | Door de gebruiker geleverde gegevens die worden gebruikt om elke asynchrone leesbewerking uniek te identificeren. |

### ReturnValue

Een [IAsyncResult](../../../system/iasyncresult/) object dat de geïnitieerde asynchrone leesbewerking vertegenwoordigt.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
