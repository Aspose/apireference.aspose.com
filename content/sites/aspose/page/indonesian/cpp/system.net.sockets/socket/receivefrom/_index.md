---
title: "Metode System::Net::Sockets::Socket::ReceiveFrom"
linktitle: "ReceiveFrom"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Net::Sockets::Socket::ReceiveFrom. Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan dalam C++."
type: docs
weight: 4400
url: /id/cpp/system.net.sockets/socket/receivefrom/
---
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte yang akan diterima dan akan ditempatkan ke array byte yang ditentukan mulai dari indeks 'offset'. |
| socketFlags | SocketFlags | Perilaku penerimaan. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Endpoint remote. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| size | int32_t | Jumlah byte yang akan diterima dan akan ditempatkan ke array byte yang ditentukan mulai dari indeks 'offset'. |
| socketFlags | SocketFlags | Perilaku penerimaan. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Endpoint remote. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| socketFlags | SocketFlags | Perilaku penerimaan. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Endpoint remote. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| socketFlags | SocketFlags | Perilaku penerimaan. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Endpoint remote. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Endpoint remote. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::ArrayView\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte yang akan diterima dan akan ditempatkan ke array byte yang ditentukan mulai dari indeks 'offset'. |
| socketFlags | SocketFlags | Perilaku penerimaan. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Endpoint remote. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::ArrayView\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| size | int32_t | Jumlah byte yang akan diterima dan akan ditempatkan ke array byte yang ditentukan mulai dari indeks 'offset'. |
| socketFlags | SocketFlags | Perilaku penerimaan. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Endpoint remote. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::ArrayView\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| socketFlags | SocketFlags | Perilaku penerimaan. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Endpoint remote. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::ArrayView\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Endpoint remote. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::StackArray\<uint8_t, N\>\& | Array byte tempat data yang diterima akan ditempatkan. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte yang akan diterima dan akan ditempatkan ke array byte yang ditentukan mulai dari indeks 'offset'. |
| socketFlags | SocketFlags | Perilaku penerimaan. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Endpoint remote. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::StackArray\<uint8_t, N\>\& | Array byte tempat data yang diterima akan ditempatkan. |
| size | int32_t | Jumlah byte yang akan diterima dan akan ditempatkan ke array byte yang ditentukan mulai dari indeks 'offset'. |
| socketFlags | SocketFlags | Perilaku penerimaan. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Endpoint remote. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) method


Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::StackArray\<uint8_t, N\>\& | Array byte tempat data yang diterima akan ditempatkan. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Endpoint remote. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
