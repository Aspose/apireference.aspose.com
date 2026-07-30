---
title: "System::Net::Sockets::Socket::GetSocketOption method"
linktitle: "GetSocketOption"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::Socket::GetSocketOption method. C++'da belirtilen seçenek adını karşılayan değeri döndürür."
type: docs
weight: 3900
url: /tr/cpp/system.net.sockets/socket/getsocketoption/
---
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName) method


Belirtilen seçenek adına karşılık gelen değeri döndürür.

```cpp
System::SharedPtr<Object> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | Soket seçenek seviyesi. |
| optionName | SocketOptionName | Seçenek adı. |

### ReturnValue

Belirtilen seçenek adını karşılayan değer.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, int32_t) method


Belirtilen seçenek adına karşılık gelen değeri döndürür.

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, int32_t optionLength)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | Soket seçenek seviyesi. |
| optionName | SocketOptionName | Seçenek adı. |
| optionLength | int32_t | Seçenek uzunluğu. |

### ReturnValue

Belirtilen seçenek adını karşılayan değer.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) method


Belirtilen seçenek adına karşılık gelen değeri alır.

```cpp
void System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, System::ArrayPtr<uint8_t> optionValue)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | Soket seçenek seviyesi. |
| optionName | SocketOptionName | Seçenek adı. |
| optionValue | System::ArrayPtr\<uint8_t\> | İlgili değerin atanacağı çıktı parametresi. |

## Ayrıca Bakınız

* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
