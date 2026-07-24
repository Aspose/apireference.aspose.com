---
title: "System::Net::Sockets::Socket::BeginReceive metode"
linktitle: "BeginReceive"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::Socket::BeginReceive metode. Memulai operasi penulisan asynchronous di C++."
type: docs
weight: 800
url: /id/cpp/system.net.sockets/socket/beginreceive/
---
## Socket::BeginReceive method


Memulai operasi tulis asynchronous.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginReceive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Buffer tempat data yang diterima akan ditempatkan. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte dalam array yang ditentukan mulai dari parameter 'offset'. |
| socketFlags | SocketFlags | Perilaku penerimaan. |
| callback | AsyncCallback | Callback yang akan dipanggil ketika operasi selesai. |
| state | System::SharedPtr\<Object\> | Data yang diberikan pengguna yang digunakan untuk mengidentifikasi secara unik setiap operasi penerimaan asynchronous. |

### ReturnValue

Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi penerimaan asinkron yang dimulai.

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
