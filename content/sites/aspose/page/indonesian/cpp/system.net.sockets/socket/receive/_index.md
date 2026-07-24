---
title: "metode System::Net::Sockets::Socket::Receive"
linktitle: "Terima"
second_title: "Aspose.Page untuk C++"
description: "metode System::Net::Sockets::Socket::Receive. Menerima data dari soket dan menuliskannya ke array byte yang ditentukan dalam C++."
type: docs
weight: 4300
url: /id/cpp/system.net.sockets/socket/receive/
---
## Socket::Receive(System::ArrayPtr\<uint8_t\>) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte yang akan diterima dan akan ditempatkan ke array byte yang ditentukan mulai dari indeks 'offset'. |
| socketFlags | SocketFlags | Perilaku penerimaan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte yang akan diterima dan akan ditempatkan ke array byte yang ditentukan mulai dari indeks 'offset'. |
| socketFlags | SocketFlags | Perilaku penerimaan. |
| errorCode | SocketError\& | Parameter output tempat kode kesalahan akan ditempatkan ketika operasi penerimaan gagal. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| size | int32_t | Jumlah byte yang akan diterima. |
| socketFlags | SocketFlags | Perilaku penerimaan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| socketFlags | SocketFlags | Perilaku penerimaan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::ArrayView\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::ArrayView\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte yang akan diterima dan akan ditempatkan ke array byte yang ditentukan mulai dari indeks 'offset'. |
| socketFlags | SocketFlags | Perilaku penerimaan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::ArrayView\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte yang akan diterima dan akan ditempatkan ke array byte yang ditentukan mulai dari indeks 'offset'. |
| socketFlags | SocketFlags | Perilaku penerimaan. |
| errorCode | SocketError\& | Parameter output tempat kode kesalahan akan ditempatkan ketika operasi penerimaan gagal. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::ArrayView\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| size | int32_t | Jumlah byte yang akan diterima. |
| socketFlags | SocketFlags | Perilaku penerimaan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::ArrayView\<uint8_t\> | Array byte tempat data yang diterima akan ditempatkan. |
| socketFlags | SocketFlags | Perilaku penerimaan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::StackArray\<uint8_t, N\>\& | Array byte tempat data yang diterima akan ditempatkan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::StackArray\<uint8_t, N\>\& | Array byte tempat data yang diterima akan ditempatkan. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte yang akan diterima dan akan ditempatkan ke array byte yang ditentukan mulai dari indeks 'offset'. |
| socketFlags | SocketFlags | Perilaku penerimaan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::StackArray\<uint8_t, N\>\& | Array byte tempat data yang diterima akan ditempatkan. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte yang akan diterima dan akan ditempatkan ke array byte yang ditentukan mulai dari indeks 'offset'. |
| socketFlags | SocketFlags | Perilaku penerimaan. |
| errorCode | SocketError\& | Parameter output tempat kode kesalahan akan ditempatkan ketika operasi penerimaan gagal. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::StackArray\<uint8_t, N\>\& | Array byte tempat data yang diterima akan ditempatkan. |
| size | int32_t | Jumlah byte yang akan diterima. |
| socketFlags | SocketFlags | Perilaku penerimaan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::StackArray\<uint8_t, N\>\& | Array byte tempat data yang diterima akan ditempatkan. |
| socketFlags | SocketFlags | Perilaku penerimaan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Array byte tempat data yang diterima akan ditempatkan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Array byte tempat data yang diterima akan ditempatkan. |
| socketFlags | SocketFlags | Perilaku penerimaan. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Menerima data dari socket dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Array byte tempat data yang diterima akan ditempatkan. |
| socketFlags | SocketFlags | Perilaku penerimaan. |
| errorCode | SocketError\& | Parameter output tempat kode kesalahan akan ditempatkan ketika operasi penerimaan gagal. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
