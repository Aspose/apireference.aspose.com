---
title: "System::Net::Sockets::Socket::Send metodu"
linktitle: "Gönder"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::Socket::Send metodu. Belirtilen veriyi C++'de sokete gönderir."
type: docs
weight: 4600
url: /tr/cpp/system.net.sockets/socket/send/
---
## Socket::Send(System::ArrayPtr\<uint8_t\>) method


Belirtilen veriyi sokete gönderir.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Gönderilecek veri. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Belirtilen veriyi sokete gönderir.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Gönderilecek veri. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Belirtilen dizide, 'offset' parametresinden başlayan bayt sayısı. |
| socketFlags | SocketFlags | Gönderme davranışı. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Belirtilen veriyi sokete gönderir.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Gönderilecek veri. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Belirtilen dizide, 'offset' parametresinden başlayan bayt sayısı. |
| socketFlags | SocketFlags | Gönderme davranışı. |
| errorCode | SocketError\& | Gönderme işlemi başarısız olduğunda hata kodunun atanacağı çıktı parametresi. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Belirtilen veriyi sokete gönderir.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Gönderilecek veri. |
| size | int32_t | Gönderilmesi gereken belirtilen veriden bayt sayısı. |
| socketFlags | SocketFlags | Gönderme davranışı. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Belirtilen veriyi sokete gönderir.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Gönderilecek veri. |
| socketFlags | SocketFlags | Gönderme davranışı. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>) method


Belirtilen veriyi sokete gönderir.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Gönderilecek veri. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Belirtilen veriyi sokete gönderir.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Gönderilecek veri. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Belirtilen dizide, 'offset' parametresinden başlayan bayt sayısı. |
| socketFlags | SocketFlags | Gönderme davranışı. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Belirtilen veriyi sokete gönderir.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Gönderilecek veri. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Belirtilen dizide, 'offset' parametresinden başlayan bayt sayısı. |
| socketFlags | SocketFlags | Gönderme davranışı. |
| errorCode | SocketError\& | Gönderme işlemi başarısız olduğunda hata kodunun atanacağı çıktı parametresi. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Belirtilen veriyi sokete gönderir.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Gönderilecek veri. |
| size | int32_t | Gönderilmesi gereken belirtilen veriden bayt sayısı. |
| socketFlags | SocketFlags | Gönderme davranışı. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Belirtilen veriyi sokete gönderir.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Gönderilecek veri. |
| socketFlags | SocketFlags | Gönderme davranışı. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&) method


Belirtilen veriyi sokete gönderir.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Gönderilecek veri. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Belirtilen veriyi sokete gönderir.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Gönderilecek veri. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Belirtilen dizide, 'offset' parametresinden başlayan bayt sayısı. |
| socketFlags | SocketFlags | Gönderme davranışı. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Belirtilen veriyi sokete gönderir.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Gönderilecek veri. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Belirtilen dizide, 'offset' parametresinden başlayan bayt sayısı. |
| socketFlags | SocketFlags | Gönderme davranışı. |
| errorCode | SocketError\& | Gönderme işlemi başarısız olduğunda hata kodunun atanacağı çıktı parametresi. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Belirtilen veriyi sokete gönderir.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Gönderilecek veri. |
| size | int32_t | Gönderilmesi gereken belirtilen veriden bayt sayısı. |
| socketFlags | SocketFlags | Gönderme davranışı. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Belirtilen veriyi sokete gönderir.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Gönderilecek veri. |
| socketFlags | SocketFlags | Gönderme davranışı. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Belirtilen veriyi sokete gönderir.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| tamponlar | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Verinin gönderilmesi gereken bayt dizilerinin bir koleksiyonu. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Belirtilen veriyi sokete gönderir.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| tamponlar | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Verinin gönderilmesi gereken bayt dizilerinin bir koleksiyonu. |
| socketFlags | SocketFlags | Gönderme davranışı. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Belirtilen veriyi sokete gönderir.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| tamponlar | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Verinin gönderilmesi gereken bayt dizilerinin bir koleksiyonu. |
| socketFlags | SocketFlags | Gönderme davranışı. |
| errorCode | SocketError\& | Gönderme işlemi başarısız olduğunda hata kodunun atanacağı çıktı parametresi. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
