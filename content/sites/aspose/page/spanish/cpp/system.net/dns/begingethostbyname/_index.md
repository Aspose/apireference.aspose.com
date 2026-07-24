---
title: "System::Net::Dns::BeginGetHostByName método"
linktitle: "BeginGetHostByName"
second_title: "Aspose.Page para C++"
description: "System::Net::Dns::BeginGetHostByName método. Inicia una operación asincrónica para crear una nueva instancia de clase IPHostEntry usando el nombre de host especificado en C++."
type: docs
weight: 200
url: /es/cpp/system.net/dns/begingethostbyname/
---
## Dns::BeginGetHostByName method


Inicia una operación asíncrona para crear una nueva instancia de IPHostEntry-class usando el nombre de host especificado.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostByName(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| hostName | String | Un nombre de host. |
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
