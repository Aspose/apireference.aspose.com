---
title: "System::Net::WebRequest::EndGetRequestStream method"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Font für C++"
description: "System::Net::WebRequest::EndGetRequestStream method. Wartet, bis die angegebene asynchrone Operation zum Abrufen eines Streams in C++ abgeschlossen ist."
type: docs
weight: 1200
url: /de/cpp/system.net/webrequest/endgetrequeststream/
---
## WebRequest::EndGetRequestStream method


Wartet, bis der angegebene asynchrone Vorgang zum Abrufen eines Streams abgeschlossen ist.

```cpp
virtual System::SharedPtr<IO::Stream> System::Net::WebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ein [IAsyncResult](../../../system/iasyncresult/) Objekt, das eine asynchrone Operation zum Abrufen eines Streams darstellt. |

### ReturnValue

Der Stream zum Schreiben von Daten in die Ressource.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
