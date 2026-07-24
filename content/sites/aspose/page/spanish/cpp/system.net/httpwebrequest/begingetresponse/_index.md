---
title: "Método System::Net::HttpWebRequest::BeginGetResponse"
linktitle: "BeginGetResponse"
second_title: "Aspose.Page para C++"
description: "Método System::Net::HttpWebRequest::BeginGetResponse. Inicia una solicitud asíncrona para el recurso en C++."
type: docs
weight: 500
url: /es/cpp/system.net/httpwebrequest/begingetresponse/
---
## HttpWebRequest::BeginGetResponse method


Inicia una solicitud asincrónica para el recurso.

```cpp
System::SharedPtr<IAsyncResult> System::Net::HttpWebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| callback | AsyncCallback | Una devolución de llamada que se invocará cuando la operación se complete. |
| estado | System::SharedPtr\<Object\> | Datos proporcionados por el usuario usados para identificar de forma única cada operación asincrónica. |

### ReturnValue

Un objeto [IAsyncResult](../../../system/iasyncresult/) que representa la operación asincrónica iniciada.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
