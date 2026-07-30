---
title: "System::Net::Sockets::Socket::GetSocketOption méthode"
linktitle: "GetSocketOption"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::Socket::GetSocketOption méthode. Retourne la valeur qui correspond au nom d'option spécifié en C++."
type: docs
weight: 3900
url: /fr/cpp/system.net.sockets/socket/getsocketoption/
---
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName) method


Renvoie la valeur correspondant au nom d'option spécifié.

```cpp
System::SharedPtr<Object> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | Le niveau d'option du socket. |
| optionName | SocketOptionName | Le nom de l'option. |

### ReturnValue

La valeur qui correspond au nom d'option spécifié.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, int32_t) method


Renvoie la valeur correspondant au nom d'option spécifié.

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, int32_t optionLength)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | Le niveau d'option du socket. |
| optionName | SocketOptionName | Le nom de l'option. |
| optionLength | int32_t | La longueur de l'option. |

### ReturnValue

La valeur qui correspond au nom d'option spécifié.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) method


Obtient la valeur correspondant au nom d'option spécifié.

```cpp
void System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, System::ArrayPtr<uint8_t> optionValue)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | Le niveau d'option du socket. |
| optionName | SocketOptionName | Le nom de l'option. |
| optionValue | System::ArrayPtr\<uint8_t\> | Le paramètre de sortie où la valeur correspondante sera assignée. |

## Voir aussi

* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
