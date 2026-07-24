---
title: "System::Net::Sockets::Socket::Send μέθοδος"
linktitle: "Αποστολή"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::Socket::Send μέθοδος. Στέλνει τα καθορισμένα δεδομένα στην υποδοχή σε C++."
type: docs
weight: 4600
url: /el/cpp/system.net.sockets/socket/send/
---
## Socket::Send(System::ArrayPtr\<uint8_t\>) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Τα δεδομένα προς αποστολή. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Τα δεδομένα προς αποστολή. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte στον καθορισμένο πίνακα ξεκινώντας από την παράμετρο 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Τα δεδομένα προς αποστολή. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte στον καθορισμένο πίνακα ξεκινώντας από την παράμετρο 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |
| errorCode | SocketError\& | Η παράμετρος εξόδου όπου θα εκχωρηθεί ο κωδικός σφάλματος όταν η λειτουργία αποστολής αποτύχει. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Τα δεδομένα προς αποστολή. |
| size | int32_t | Ο αριθμός των byte από τα καθορισμένα δεδομένα που πρέπει να σταλούν. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Τα δεδομένα προς αποστολή. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Τα δεδομένα προς αποστολή. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Τα δεδομένα προς αποστολή. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte στον καθορισμένο πίνακα ξεκινώντας από την παράμετρο 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Τα δεδομένα προς αποστολή. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte στον καθορισμένο πίνακα ξεκινώντας από την παράμετρο 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |
| errorCode | SocketError\& | Η παράμετρος εξόδου όπου θα εκχωρηθεί ο κωδικός σφάλματος όταν η λειτουργία αποστολής αποτύχει. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Τα δεδομένα προς αποστολή. |
| size | int32_t | Ο αριθμός των byte από τα καθορισμένα δεδομένα που πρέπει να σταλούν. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Τα δεδομένα προς αποστολή. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Τα δεδομένα προς αποστολή. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Τα δεδομένα προς αποστολή. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte στον καθορισμένο πίνακα ξεκινώντας από την παράμετρο 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Τα δεδομένα προς αποστολή. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte στον καθορισμένο πίνακα ξεκινώντας από την παράμετρο 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |
| errorCode | SocketError\& | Η παράμετρος εξόδου όπου θα εκχωρηθεί ο κωδικός σφάλματος όταν η λειτουργία αποστολής αποτύχει. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Τα δεδομένα προς αποστολή. |
| size | int32_t | Ο αριθμός των byte από τα καθορισμένα δεδομένα που πρέπει να σταλούν. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Τα δεδομένα προς αποστολή. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Μια συλλογή από πίνακες byte από τους οποίους πρέπει να σταλούν δεδομένα. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Μια συλλογή από πίνακες byte από τους οποίους πρέπει να σταλούν δεδομένα. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Στέλνει τα καθορισμένα δεδομένα στην υποδοχή.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Μια συλλογή από πίνακες byte από τους οποίους πρέπει να σταλούν δεδομένα. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |
| errorCode | SocketError\& | Η παράμετρος εξόδου όπου θα εκχωρηθεί ο κωδικός σφάλματος όταν η λειτουργία αποστολής αποτύχει. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
