---
title: "Método System::Net::Dns::BeginGetHostAddresses"
linktitle: "BeginGetHostAddresses"
second_title: "Aspose.Page para C++"
description: "Método System::Net::Dns::BeginGetHostAddresses. Inicia una operación asincrónica para crear una nueva instancia de la clase IPHostEntry usando la cadena especificada que contiene un nombre de host o una dirección IP en C++."
type: docs
weight: 100
url: /es/cpp/system.net/dns/begingethostaddresses/
---
## Dns::BeginGetHostAddresses method


Inicia una operación asíncrona para crear una nueva instancia de IPHostEntry-class usando la cadena especificada que contiene un nombre de host o una dirección IP.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostAddresses(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| hostNameOrAddress | String | Una cadena que contiene un nombre de host o dirección IP. |
| requestCallback | AsyncCallback | Una devolución de llamada que se invocará cuando la operación se complete. |
| estado | System::SharedPtr\<Object\> | Datos proporcionados por el usuario usados para identificar de forma única cada operación asincrónica. |

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
