---
title: "System::Net::WebRequest::BeginGetResponse-Methode"
linktitle: "BeginGetResponse"
second_title: "Aspose.Font für C++"
description: "System::Net::WebRequest::BeginGetResponse-Methode. Initiert eine asynchrone Anforderung für die Ressource in C++."
type: docs
weight: 1100
url: /de/cpp/system.net/webrequest/begingetresponse/
---
## WebRequest::BeginGetResponse method


Startet eine asynchrone Anforderung für die Ressource.

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state)=0
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
