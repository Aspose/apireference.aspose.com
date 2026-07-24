---
title: "System::Net::Sockets::Socket::GetSocketOption μέθοδος"
linktitle: "GetSocketOption"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::Socket::GetSocketOption μέθοδος. Επιστρέφει την τιμή που αντιστοιχεί στο καθορισμένο όνομα επιλογής σε C++."
type: docs
weight: 3900
url: /el/cpp/system.net.sockets/socket/getsocketoption/
---
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName) method


Επιστρέφει την τιμή που αντιστοιχεί στο καθορισμένο όνομα επιλογής.

```cpp
System::SharedPtr<Object> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | Το επίπεδο επιλογής του socket. |
| optionName | SocketOptionName | Το όνομα επιλογής. |

### ReturnValue

Η τιμή που αντιστοιχεί στο καθορισμένο όνομα επιλογής.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, int32_t) method


Επιστρέφει την τιμή που αντιστοιχεί στο καθορισμένο όνομα επιλογής.

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, int32_t optionLength)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | Το επίπεδο επιλογής του socket. |
| optionName | SocketOptionName | Το όνομα επιλογής. |
| optionLength | int32_t | Το μήκος επιλογής. |

### ReturnValue

Η τιμή που αντιστοιχεί στο καθορισμένο όνομα επιλογής.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) method


Λαμβάνει την τιμή που αντιστοιχεί στο καθορισμένο όνομα επιλογής.

```cpp
void System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, System::ArrayPtr<uint8_t> optionValue)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | Το επίπεδο επιλογής του socket. |
| optionName | SocketOptionName | Το όνομα επιλογής. |
| optionValue | System::ArrayPtr\<uint8_t\> | Η παράμετρος εξόδου όπου θα εκχωρηθεί η αντίστοιχη τιμή. |

## Δείτε επίσης

* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
