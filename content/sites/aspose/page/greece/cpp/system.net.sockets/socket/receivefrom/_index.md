---
title: "System::Net::Sockets::Socket::ReceiveFrom μέθοδος"
linktitle: "ReceiveFrom"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::Socket::ReceiveFrom μέθοδος. Λαμβάνει δεδομένα από το καθορισμένο σημείο τερματισμού και τα γράφει στον καθορισμένο πίνακα byte σε C++."
type: docs
weight: 4400
url: /el/cpp/system.net.sockets/socket/receivefrom/
---
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte προς λήψη που θα εκχωρηθούν στον καθορισμένο πίνακα byte από το δείκτη 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| size | int32_t | Ο αριθμός των byte προς λήψη που θα εκχωρηθούν στον καθορισμένο πίνακα byte από το δείκτη 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte προς λήψη που θα εκχωρηθούν στον καθορισμένο πίνακα byte από το δείκτη 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| size | int32_t | Ο αριθμός των byte προς λήψη που θα εκχωρηθούν στον καθορισμένο πίνακα byte από το δείκτη 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte προς λήψη που θα εκχωρηθούν στον καθορισμένο πίνακα byte από το δείκτη 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| size | int32_t | Ο αριθμός των byte προς λήψη που θα εκχωρηθούν στον καθορισμένο πίνακα byte από το δείκτη 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) method


Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Ο πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
