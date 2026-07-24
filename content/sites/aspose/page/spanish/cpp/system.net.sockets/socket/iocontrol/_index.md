---
title: "Método System::Net::Sockets::Socket::IOControl"
linktitle: "IOControl"
second_title: "Aspose.Page para C++"
description: "Método System::Net::Sockets::Socket::IOControl. Establece modos de operación de bajo nivel para el socket en C++."
type: docs
weight: 4000
url: /es/cpp/system.net.sockets/socket/iocontrol/
---
## Socket::IOControl(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Establece modos de operación de bajo nivel para el socket.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(int32_t ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ioControlCode | int32_t | El código de control de la operación a realizar. |
| optionInValue | System::ArrayPtr\<uint8_t\> | La matriz de bytes que contiene los datos de entrada. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | La matriz de bytes que contiene los datos de salida. |

### ReturnValue

El número de bytes en el parámetro **optionOutValue**.

## Ver también

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::IOControl(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Establece modos de operación de bajo nivel para el socket.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(IOControlCode ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ioControlCode | IOControlCode | El código de control de la operación a realizar. |
| optionInValue | System::ArrayPtr\<uint8_t\> | La matriz de bytes que contiene los datos de entrada. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | La matriz de bytes que contiene los datos de salida. |

### ReturnValue

El número de bytes en el parámetro **optionOutValue**.

## Ver también

* Enum [IOControlCode](../../iocontrolcode/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
