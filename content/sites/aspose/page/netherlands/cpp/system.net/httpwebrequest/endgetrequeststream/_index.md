---
title: "System::Net::HttpWebRequest::EndGetRequestStream methode"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Page voor C++"
description: "System::Net::HttpWebRequest::EndGetRequestStream methode. Wacht tot de opgegeven asynchrone bewerking om een stream te verkrijgen voltooid is in C++."
type: docs
weight: 600
url: /nl/cpp/system.net/httpwebrequest/endgetrequeststream/
---
## HttpWebRequest::EndGetRequestStream method


Wacht tot de opgegeven asynchrone bewerking om een stream te verkrijgen voltooid is.

```cpp
System::SharedPtr<IO::Stream> System::Net::HttpWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
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
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
