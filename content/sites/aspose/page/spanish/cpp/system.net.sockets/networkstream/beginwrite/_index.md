---
title: "System::Net::Sockets::NetworkStream::BeginWrite método"
linktitle: "BeginWrite"
second_title: "Aspose.Page para C++"
description: "System::Net::Sockets::NetworkStream::BeginWrite método. Inicia una operación de escritura asíncrona en C++."
type: docs
weight: 400
url: /es/cpp/system.net.sockets/networkstream/beginwrite/
---
## NetworkStream::BeginWrite method


Inicia una operación de escritura asíncrona.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| búfer | System::ArrayPtr\<uint8_t\> | Un búfer que contiene datos para ser escritos. |
| desplazamiento | int32_t | El desplazamiento en bytes en la matriz especificada. |
| size | int32_t | El número de bytes a escribir. |
| callback | AsyncCallback | Una devolución de llamada que se invocará cuando la operación se complete. |
| estado | System::SharedPtr\<Object\> | Datos proporcionados por el usuario utilizados para identificar de forma única cada operación de escritura asíncrona. |

### ReturnValue

Un objeto [IAsyncResult](../../../system/iasyncresult/) que representa la operación de escritura asíncrona iniciada.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
