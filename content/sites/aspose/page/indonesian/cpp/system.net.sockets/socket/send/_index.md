---
title: "System::Net::Sockets::Socket::Send metode"
linktitle: "Kirim"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::Socket::Send metode. Mengirim data yang ditentukan ke socket dalam C++."
type: docs
weight: 4600
url: /id/cpp/system.net.sockets/socket/send/
---
## Socket::Send(System::ArrayPtr\<uint8_t\>) method


Mengirim data yang ditentukan ke socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Data yang akan dikirim. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Mengirim data yang ditentukan ke socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Data yang akan dikirim. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte dalam array yang ditentukan mulai dari parameter 'offset'. |
| socketFlags | SocketFlags | Perilaku pengiriman. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Mengirim data yang ditentukan ke socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Data yang akan dikirim. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte dalam array yang ditentukan mulai dari parameter 'offset'. |
| socketFlags | SocketFlags | Perilaku pengiriman. |
| errorCode | SocketError\& | Parameter output tempat kode error akan diberikan ketika operasi pengiriman gagal. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Mengirim data yang ditentukan ke socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Data yang akan dikirim. |
| size | int32_t | Jumlah byte dari data yang ditentukan yang harus dikirim. |
| socketFlags | SocketFlags | Perilaku pengiriman. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Mengirim data yang ditentukan ke socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Data yang akan dikirim. |
| socketFlags | SocketFlags | Perilaku pengiriman. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>) method


Mengirim data yang ditentukan ke socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::ArrayView\<uint8_t\> | Data yang akan dikirim. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Mengirim data yang ditentukan ke socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::ArrayView\<uint8_t\> | Data yang akan dikirim. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte dalam array yang ditentukan mulai dari parameter 'offset'. |
| socketFlags | SocketFlags | Perilaku pengiriman. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Mengirim data yang ditentukan ke socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::ArrayView\<uint8_t\> | Data yang akan dikirim. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte dalam array yang ditentukan mulai dari parameter 'offset'. |
| socketFlags | SocketFlags | Perilaku pengiriman. |
| errorCode | SocketError\& | Parameter output tempat kode error akan diberikan ketika operasi pengiriman gagal. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Mengirim data yang ditentukan ke socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::ArrayView\<uint8_t\> | Data yang akan dikirim. |
| size | int32_t | Jumlah byte dari data yang ditentukan yang harus dikirim. |
| socketFlags | SocketFlags | Perilaku pengiriman. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Mengirim data yang ditentukan ke socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::ArrayView\<uint8_t\> | Data yang akan dikirim. |
| socketFlags | SocketFlags | Perilaku pengiriman. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&) method


Mengirim data yang ditentukan ke socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::StackArray\<uint8_t, N\>\& | Data yang akan dikirim. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Mengirim data yang ditentukan ke socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::StackArray\<uint8_t, N\>\& | Data yang akan dikirim. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte dalam array yang ditentukan mulai dari parameter 'offset'. |
| socketFlags | SocketFlags | Perilaku pengiriman. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Mengirim data yang ditentukan ke socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::StackArray\<uint8_t, N\>\& | Data yang akan dikirim. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte dalam array yang ditentukan mulai dari parameter 'offset'. |
| socketFlags | SocketFlags | Perilaku pengiriman. |
| errorCode | SocketError\& | Parameter output tempat kode error akan diberikan ketika operasi pengiriman gagal. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Mengirim data yang ditentukan ke socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::StackArray\<uint8_t, N\>\& | Data yang akan dikirim. |
| size | int32_t | Jumlah byte dari data yang ditentukan yang harus dikirim. |
| socketFlags | SocketFlags | Perilaku pengiriman. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Mengirim data yang ditentukan ke socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::Details::StackArray\<uint8_t, N\>\& | Data yang akan dikirim. |
| socketFlags | SocketFlags | Perilaku pengiriman. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Mengirim data yang ditentukan ke socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Koleksi array byte dari mana data harus dikirim. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Mengirim data yang ditentukan ke socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Koleksi array byte dari mana data harus dikirim. |
| socketFlags | SocketFlags | Perilaku pengiriman. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Mengirim data yang ditentukan ke socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Koleksi array byte dari mana data harus dikirim. |
| socketFlags | SocketFlags | Perilaku pengiriman. |
| errorCode | SocketError\& | Parameter output tempat kode error akan diberikan ketika operasi pengiriman gagal. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
