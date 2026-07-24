---
title: "System::Net::Dns::BeginResolve método"
linktitle: "BeginResolve"
second_title: "Aspose.Page para C++"
description: "System::Net::Dns::BeginResolve método. Inicia una operación asíncrona para crear una nueva instancia de la clase IPHostEntry usando el nombre de host especificado en C++."
type: docs
weight: 400
url: /es/cpp/system.net/dns/beginresolve/
---
## Dns::BeginResolve method


Inicia una operación asíncrona para crear una nueva instancia de IPHostEntry-class usando el nombre de host especificado.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginResolve(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| hostName | String | Un nombre de host que se utiliza para crear una nueva instancia de la clase [IPHostEntry](../../iphostentry/). |
| requestCallback | AsyncCallback | Una devolución de llamada que se invocará cuando la operación se complete. |
| stateObject | System::SharedPtr\<Object\> | Datos proporcionados por el usuario usados para identificar de forma única cada operación asincrónica. |

### ReturnValue

Un objeto [IAsyncResult](../../../system/iasyncresult/) que representa la operación asincrónica iniciada.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
