---
title: "System::Net::Sockets::Socket::Receive yöntemi"
linktitle: "Al"
second_title: "Aspose.Page için C++"
description: "System::Net::Sockets::Socket::Receive yöntemi. Soketten veri alır ve C++'ta belirtilen bayt dizisine yazar."
type: docs
weight: 4300
url: /tr/cpp/system.net.sockets/socket/receive/
---
## Socket::Receive(System::ArrayPtr\<uint8_t\>) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Belirtilen bayt dizisine 'offset' indeksinden atanacak alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Belirtilen bayt dizisine 'offset' indeksinden atanacak alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |
| errorCode | SocketError\& | Alma işlemi başarısız olduğunda hata kodunun atanacağı çıkış parametresi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| size | int32_t | Alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Belirtilen bayt dizisine 'offset' indeksinden atanacak alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Belirtilen bayt dizisine 'offset' indeksinden atanacak alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |
| errorCode | SocketError\& | Alma işlemi başarısız olduğunda hata kodunun atanacağı çıkış parametresi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| size | int32_t | Alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Alınan verinin atanacağı bayt dizisi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Alınan verinin atanacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Belirtilen bayt dizisine 'offset' indeksinden atanacak alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Alınan verinin atanacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | Belirtilen bayt dizisine 'offset' indeksinden atanacak alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |
| errorCode | SocketError\& | Alma işlemi başarısız olduğunda hata kodunun atanacağı çıkış parametresi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Alınan verinin atanacağı bayt dizisi. |
| size | int32_t | Alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Alınan verinin atanacağı bayt dizisi. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Soketten veri alır ve belirtilen bayt dizilerine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Alınan verinin atanacağı bayt dizileri. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizilerine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Alınan verinin atanacağı bayt dizileri. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Soketten veri alır ve belirtilen bayt dizilerine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Alınan verinin atanacağı bayt dizileri. |
| socketFlags | SocketFlags | Alma davranışı. |
| errorCode | SocketError\& | Alma işlemi başarısız olduğunda hata kodunun atanacağı çıkış parametresi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
