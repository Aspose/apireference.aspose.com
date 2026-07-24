---
title: "Método System::Net::Sockets::Socket::BeginReceive"
linktitle: "BeginReceive"
second_title: "Aspose.Page para C++"
description: "Método System::Net::Sockets::Socket::BeginReceive. Inicia una operación de escritura asíncrona en C++."
type: docs
weight: 800
url: /es/cpp/system.net.sockets/socket/beginreceive/
---
## Socket::BeginReceive method


Inicia una operación de escritura asíncrona.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginReceive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| búfer | System::ArrayPtr\<uint8_t\> | Un búfer donde se asignarán los datos recibidos. |
| desplazamiento | int32_t | El desplazamiento en bytes en la matriz especificada. |
| size | int32_t | El número de bytes en la matriz especificada a partir del parámetro 'offset'. |
| socketFlags | SocketFlags | El comportamiento de recepción. |
| callback | AsyncCallback | Un callback que será llamado cuando la operación se complete. |
| estado | System::SharedPtr\<Object\> | Datos proporcionados por el usuario utilizados para identificar de forma única cada operación de recepción asíncrona. |

### ReturnValue

Un objeto [IAsyncResult](../../../system/iasyncresult/) que representa la operación de recepción asíncrona iniciada.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
