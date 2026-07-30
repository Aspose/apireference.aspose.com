---
title: "System::Net::Sockets::Socket::Receive metodu"
linktitle: "Al"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::Socket::Receive metodu. Soketten veri alır ve C++'da belirtilen bayt dizisine yazar."
type: docs
weight: 4300
url: /tr/cpp/system.net.sockets/socket/receive/
---
## Socket::Receive(System::ArrayPtr\<uint8_t\>) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | 'offset' indeksinden itibaren belirtilen bayt dizisine atanacak alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | 'offset' indeksinden itibaren belirtilen bayt dizisine atanacak alınacak bayt sayısı. |
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
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| size | int32_t | Alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | 'offset' indeksinden itibaren belirtilen bayt dizisine atanacak alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | 'offset' indeksinden itibaren belirtilen bayt dizisine atanacak alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |
| errorCode | SocketError\& | Alma işlemi başarısız olduğunda hata kodunun atanacağı çıkış parametresi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| size | int32_t | Alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Alınan verinin atanacağı bayt dizisi. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Alınan verinin atanacağı bayt dizisi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Alınan verinin atanacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | 'offset' indeksinden itibaren belirtilen bayt dizisine atanacak alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Alınan verinin atanacağı bayt dizisi. |
| offset | int32_t | Belirtilen dizideki bayt cinsinden ofset. |
| size | int32_t | 'offset' indeksinden itibaren belirtilen bayt dizisine atanacak alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |
| errorCode | SocketError\& | Alma işlemi başarısız olduğunda hata kodunun atanacağı çıkış parametresi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Alınan verinin atanacağı bayt dizisi. |
| size | int32_t | Alınacak bayt sayısı. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizisine yazar.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Alınan verinin atanacağı bayt dizisi. |
| socketFlags | SocketFlags | Alma davranışı. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Soketten veri alır ve belirtilen bayt dizilerine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| tamponlar | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Alınan verinin atanacağı bayt dizileri. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Soketten veri alır ve belirtilen bayt dizilerine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| tamponlar | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Alınan verinin atanacağı bayt dizileri. |
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
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Soketten veri alır ve belirtilen bayt dizilerine yazar.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| tamponlar | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Alınan verinin atanacağı bayt dizileri. |
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
* Library [Aspose.Font for C++](../../../)
