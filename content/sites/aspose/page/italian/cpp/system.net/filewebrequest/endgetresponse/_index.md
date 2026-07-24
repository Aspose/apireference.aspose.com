---
title: "Metodo System::Net::FileWebRequest::EndGetResponse"
linktitle: "EndGetResponse"
second_title: "Aspose.Page per C++"
description: "Metodo System::Net::FileWebRequest::EndGetResponse. Attende fino al completamento della richiesta asincrona specificata per la risorsa in C++."
type: docs
weight: 600
url: /it/cpp/system.net/filewebrequest/endgetresponse/
---
## FileWebRequest::EndGetResponse method


Attende fino al completamento della richiesta asincrona specificata per la risorsa.

```cpp
virtual System::SharedPtr<WebResponse> System::Net::FileWebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta una richiesta asincrona per la risorsa. |

### ReturnValue

La risposta web.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WebResponse](../../webresponse/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
