---
title: "System::Net::Sockets::Socket::Receive μέθοδος"
linktitle: "Λήψη"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::Socket::Receive μέθοδος. Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte σε C++."
type: docs
weight: 4300
url: /el/cpp/system.net.sockets/socket/receive/
---
## Socket::Receive(System::ArrayPtr\<uint8_t\>) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte προς λήψη που θα εκχωρηθούν στον καθορισμένο πίνακα byte από το δείκτη 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte προς λήψη που θα εκχωρηθούν στον καθορισμένο πίνακα byte από το δείκτη 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |
| errorCode | SocketError\& | Η παράμετρος εξόδου όπου θα εκχωρηθεί ο κωδικός σφάλματος όταν η λειτουργία λήψης αποτύχει. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| size | int32_t | Ο αριθμός των byte προς λήψη. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte προς λήψη που θα εκχωρηθούν στον καθορισμένο πίνακα byte από το δείκτη 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte προς λήψη που θα εκχωρηθούν στον καθορισμένο πίνακα byte από το δείκτη 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |
| errorCode | SocketError\& | Η παράμετρος εξόδου όπου θα εκχωρηθεί ο κωδικός σφάλματος όταν η λειτουργία λήψης αποτύχει. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| size | int32_t | Ο αριθμός των byte προς λήψη. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte προς λήψη που θα εκχωρηθούν στον καθορισμένο πίνακα byte από το δείκτη 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte προς λήψη που θα εκχωρηθούν στον καθορισμένο πίνακα byte από το δείκτη 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |
| errorCode | SocketError\& | Η παράμετρος εξόδου όπου θα εκχωρηθεί ο κωδικός σφάλματος όταν η λειτουργία λήψης αποτύχει. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| size | int32_t | Ο αριθμός των byte προς λήψη. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στους καθορισμένους πίνακες byte.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Οι πίνακες byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |

### ReturnValue

Ο αριθμός των byte που λαμβάνονται.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στους καθορισμένους πίνακες byte.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Οι πίνακες byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στους καθορισμένους πίνακες byte.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Οι πίνακες byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |
| errorCode | SocketError\& | Η παράμετρος εξόδου όπου θα εκχωρηθεί ο κωδικός σφάλματος όταν η λειτουργία λήψης αποτύχει. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
