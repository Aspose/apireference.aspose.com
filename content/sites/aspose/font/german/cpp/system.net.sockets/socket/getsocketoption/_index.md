---
title: "System::Net::Sockets::Socket::GetSocketOption-Methode"
linktitle: "GetSocketOption"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::Socket::GetSocketOption-Methode. Gibt den Wert zurück, der dem angegebenen Optionsnamen in C++ entspricht."
type: docs
weight: 3900
url: /de/cpp/system.net.sockets/socket/getsocketoption/
---
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName) method


Gibt den Wert zurück, der dem angegebenen Optionsnamen entspricht.

```cpp
System::SharedPtr<Object> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | Die Socket-Optionsebene. |
| optionName | SocketOptionName | Der Optionsname. |

### ReturnValue

Der Wert, der dem angegebenen Optionsnamen entspricht.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, int32_t) method


Gibt den Wert zurück, der dem angegebenen Optionsnamen entspricht.

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, int32_t optionLength)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | Die Socket-Optionsebene. |
| optionName | SocketOptionName | Der Optionsname. |
| optionLength | int32_t | Die Optionslänge. |

### ReturnValue

Der Wert, der dem angegebenen Optionsnamen entspricht.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) method


Ermittelt den Wert, der dem angegebenen Optionsnamen entspricht.

```cpp
void System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, System::ArrayPtr<uint8_t> optionValue)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | Die Socket-Optionsebene. |
| optionName | SocketOptionName | Der Optionsname. |
| optionValue | System::ArrayPtr\<uint8_t\> | Der Ausgabeparameter, dem der entsprechende Wert zugewiesen wird. |

## Siehe auch

* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
