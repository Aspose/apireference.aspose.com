---
title: "Metodo System::Net::WebRequest::EndGetResponse"
linktitle: "EndGetResponse"
second_title: "Aspose.Font per C++"
description: "System::Net::WebRequest::EndGetResponse method. Attende fino al completamento della richiesta asincrona specificata per la risorsa in C++."
type: docs
weight: 1300
url: /it/cpp/system.net/webrequest/endgetresponse/
---
## WebRequest::EndGetResponse method


Attende finché la richiesta asincrona specificata per la risorsa non termina.

```cpp
virtual System::SharedPtr<WebResponse> System::Net::WebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult)=0
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
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
