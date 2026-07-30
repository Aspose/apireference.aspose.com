---
title: "Metodo System::Net::Sockets::Socket::GetSocketOption"
linktitle: "GetSocketOption"
second_title: "Aspose.Font per C++"
description: "Metodo System::Net::Sockets::Socket::GetSocketOption. Restituisce il valore corrispondente al nome dell'opzione specificata in C++."
type: docs
weight: 3900
url: /it/cpp/system.net.sockets/socket/getsocketoption/
---
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName) method


Restituisce il valore che corrisponde al nome dell'opzione specificata.

```cpp
System::SharedPtr<Object> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | Il livello dell'opzione del socket. |
| optionName | SocketOptionName | Il nome dell'opzione. |

### ReturnValue

Il valore che corrisponde al nome dell'opzione specificata.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, int32_t) method


Restituisce il valore che corrisponde al nome dell'opzione specificata.

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, int32_t optionLength)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | Il livello dell'opzione del socket. |
| optionName | SocketOptionName | Il nome dell'opzione. |
| optionLength | int32_t | La lunghezza dell'opzione. |

### ReturnValue

Il valore che corrisponde al nome dell'opzione specificata.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) method


Ottiene il valore che corrisponde al nome dell'opzione specificata.

```cpp
void System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, System::ArrayPtr<uint8_t> optionValue)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | Il livello dell'opzione del socket. |
| optionName | SocketOptionName | Il nome dell'opzione. |
| optionValue | System::ArrayPtr\<uint8_t\> | Il parametro di output dove verrà assegnato il valore corrispondente. |

## Vedi anche

* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
