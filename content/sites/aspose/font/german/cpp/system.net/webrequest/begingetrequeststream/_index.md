---
title: "System::Net::WebRequest::BeginGetRequestStream-Methode"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Font für C++"
description: "System::Net::WebRequest::BeginGetRequestStream-Methode. Startet eine asynchrone Operation, um einen Stream zum Schreiben von Daten in die Ressource in C++ zu erhalten."
type: docs
weight: 1000
url: /de/cpp/system.net/webrequest/begingetrequeststream/
---
## WebRequest::BeginGetRequestStream method


Startet einen asynchronen Vorgang, um einen Stream zum Schreiben von Daten in die Ressource zu erhalten.

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state)=0
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
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
