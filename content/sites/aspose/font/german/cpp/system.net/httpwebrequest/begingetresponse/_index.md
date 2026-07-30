---
title: "System::Net::HttpWebRequest::BeginGetResponse-Methode"
linktitle: "BeginGetResponse"
second_title: "Aspose.Font für C++"
description: "System::Net::HttpWebRequest::BeginGetResponse-Methode. Startet eine asynchrone Anforderung für die Ressource in C++."
type: docs
weight: 500
url: /de/cpp/system.net/httpwebrequest/begingetresponse/
---
## HttpWebRequest::BeginGetResponse method


Startet eine asynchrone Anforderung für die Ressource.

```cpp
System::SharedPtr<IAsyncResult> System::Net::HttpWebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state) override
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
