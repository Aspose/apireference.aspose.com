---
title: "System::Net::Sockets::Socket::IOControl metodo"
linktitle: "IOControl"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::Socket::IOControl metodo. Imposta modalità operative a basso livello per il socket in C++."
type: docs
weight: 4000
url: /it/cpp/system.net.sockets/socket/iocontrol/
---
## Socket::IOControl(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Imposta le modalità operative a basso livello per il socket.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(int32_t ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ioControlCode | int32_t | Il codice di controllo dell'operazione da eseguire. |
| optionInValue | System::ArrayPtr\<uint8_t\> | L'array di byte che contiene i dati di input. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | L'array di byte che contiene i dati di output. |

### ReturnValue

Il numero di byte nel parametro **optionOutValue**.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::IOControl(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Imposta le modalità operative a basso livello per il socket.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(IOControlCode ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ioControlCode | IOControlCode | Il codice di controllo dell'operazione da eseguire. |
| optionInValue | System::ArrayPtr\<uint8_t\> | L'array di byte che contiene i dati di input. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | L'array di byte che contiene i dati di output. |

### ReturnValue

Il numero di byte nel parametro **optionOutValue**.

## Vedi anche

* Enum [IOControlCode](../../iocontrolcode/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
