---
title: "System::Net::HttpWebRequest::EndGetRequestStream Methode"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Font für C++"
description: "System::Net::HttpWebRequest::EndGetRequestStream Methode. Wartet, bis die angegebene asynchrone Operation zum Abrufen eines Streams abgeschlossen ist, in C++."
type: docs
weight: 600
url: /de/cpp/system.net/httpwebrequest/endgetrequeststream/
---
## HttpWebRequest::EndGetRequestStream method


Wartet, bis der angegebene asynchrone Vorgang zum Abrufen eines Streams abgeschlossen ist.

```cpp
System::SharedPtr<IO::Stream> System::Net::HttpWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
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
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
