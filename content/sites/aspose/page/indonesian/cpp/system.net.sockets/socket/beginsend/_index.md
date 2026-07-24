---
title: "Metode System::Net::Sockets::Socket::BeginSend"
linktitle: "BeginSend"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Net::Sockets::Socket::BeginSend. Memulai operasi pengiriman asynchronous dalam C++."
type: docs
weight: 900
url: /id/cpp/system.net.sockets/socket/beginsend/
---
## Socket::BeginSend method


Memulai operasi pengiriman asinkron.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginSend(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Buffer untuk membaca data. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte dalam array yang ditentukan mulai dari parameter 'offset'. |
| socketFlags | SocketFlags | Perilaku pengiriman. |
| callback | AsyncCallback | Callback yang akan dipanggil ketika operasi selesai. |
| state | System::SharedPtr\<Object\> | Data yang disediakan pengguna yang digunakan untuk mengidentifikasi secara unik setiap operasi pengiriman asynchronous. |

### ReturnValue

Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi pengiriman asynchronous yang dimulai.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
