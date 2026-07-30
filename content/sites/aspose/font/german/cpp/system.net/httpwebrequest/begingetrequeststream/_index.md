---
title: "System::Net::HttpWebRequest::BeginGetRequestStream Methode"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Font für C++"
description: "System::Net::HttpWebRequest::BeginGetRequestStream Methode. Startet eine asynchrone Operation, um einen Stream zum Schreiben von Daten in die Ressource zu erhalten, in C++."
type: docs
weight: 400
url: /de/cpp/system.net/httpwebrequest/begingetrequeststream/
---
## HttpWebRequest::BeginGetRequestStream method


Startet einen asynchronen Vorgang, um einen Stream zum Schreiben von Daten in die Ressource zu erhalten.

```cpp
System::SharedPtr<IAsyncResult> System::Net::HttpWebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Rückruf | AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn der Vorgang abgeschlossen ist. |
| Zustand | System::SharedPtr\<Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Operation eindeutig zu identifizieren. |

### ReturnValue

Ein [IAsyncResult](../../../system/iasyncresult/)-Objekt, das die gestartete asynchrone Operation darstellt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
