---
title: "Método System::Net::HttpWebRequest::EndGetResponse"
linktitle: "EndGetResponse"
second_title: "Aspose.Page para C++"
description: "Método System::Net::HttpWebRequest::EndGetResponse. Espera hasta que la solicitud asíncrona especificada para el recurso se complete en C++."
type: docs
weight: 700
url: /es/cpp/system.net/httpwebrequest/endgetresponse/
---
## HttpWebRequest::EndGetResponse method


Espera hasta que la solicitud asincrónica especificada para el recurso se complete.

```cpp
System::SharedPtr<WebResponse> System::Net::HttpWebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un objeto [IAsyncResult](../../../system/iasyncresult/) que representa una solicitud asíncrona para el recurso. |

### ReturnValue

La respuesta web.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WebResponse](../../webresponse/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
