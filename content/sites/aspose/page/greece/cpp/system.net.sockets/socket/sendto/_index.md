---
title: "System::Net::Sockets::Socket::SendTo μέθοδος"
linktitle: "SendTo"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::Socket::SendTo μέθοδος. Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο τερματισμού σε C++."
type: docs
weight: 4700
url: /el/cpp/system.net.sockets/socket/sendto/
---
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Τα δεδομένα προς αποστολή. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte στον καθορισμένο πίνακα ξεκινώντας από την παράμετρο 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |
| remoteEP | System::SharedPtr\<EndPoint\> | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Τα δεδομένα προς αποστολή. |
| size | int32_t | Ο αριθμός των byte στον καθορισμένο πίνακα. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |
| remoteEP | System::SharedPtr\<EndPoint\> | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Τα δεδομένα προς αποστολή. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |
| remoteEP | System::SharedPtr\<EndPoint\> | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Τα δεδομένα προς αποστολή. |
| remoteEP | System::SharedPtr\<EndPoint\> | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Τα δεδομένα προς αποστολή. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte στον καθορισμένο πίνακα ξεκινώντας από την παράμετρο 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |
| remoteEP | System::SharedPtr\<EndPoint\> | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Τα δεδομένα προς αποστολή. |
| size | int32_t | Ο αριθμός των byte στον καθορισμένο πίνακα. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |
| remoteEP | System::SharedPtr\<EndPoint\> | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Τα δεδομένα προς αποστολή. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |
| remoteEP | System::SharedPtr\<EndPoint\> | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::ArrayView\<uint8_t\> | Τα δεδομένα προς αποστολή. |
| remoteEP | System::SharedPtr\<EndPoint\> | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Τα δεδομένα προς αποστολή. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte στον καθορισμένο πίνακα ξεκινώντας από την παράμετρο 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |
| remoteEP | System::SharedPtr\<EndPoint\> | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Τα δεδομένα προς αποστολή. |
| size | int32_t | Ο αριθμός των byte στον καθορισμένο πίνακα. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |
| remoteEP | System::SharedPtr\<EndPoint\> | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) method


Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Τα δεδομένα προς αποστολή. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |
| remoteEP | System::SharedPtr\<EndPoint\> | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) method


Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::Details::StackArray\<uint8_t, N\>\& | Τα δεδομένα προς αποστολή. |
| remoteEP | System::SharedPtr\<EndPoint\> | Το απομακρυσμένο σημείο τερματισμού. |

### ReturnValue

Ο αριθμός των σταλμένων byte.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
