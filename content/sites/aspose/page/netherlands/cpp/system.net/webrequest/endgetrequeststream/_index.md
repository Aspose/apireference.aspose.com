---
title: "System::Net::WebRequest::EndGetRequestStream method"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Page voor C++"
description: "System::Net::WebRequest::EndGetRequestStream method. Wacht tot de opgegeven asynchrone bewerking om een stream te verkrijgen voltooid is in C++."
type: docs
weight: 1200
url: /nl/cpp/system.net/webrequest/endgetrequeststream/
---
## WebRequest::EndGetRequestStream method


Wacht tot de opgegeven asynchrone bewerking om een stream te verkrijgen voltooid is.

```cpp
virtual System::SharedPtr<IO::Stream> System::Net::WebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Een [IAsyncResult](../../../system/iasyncresult/) object dat een asynchrone bewerking vertegenwoordigt om een stream te verkrijgen. |

### ReturnValue

De stream voor het schrijven van gegevens naar de bron.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
