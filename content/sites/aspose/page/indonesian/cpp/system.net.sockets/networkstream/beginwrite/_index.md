---
title: "System::Net::Sockets::NetworkStream::BeginWrite method"
linktitle: "BeginWrite"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::NetworkStream::BeginWrite method. Memulai operasi penulisan asinkron dalam C++."
type: docs
weight: 400
url: /id/cpp/system.net.sockets/networkstream/beginwrite/
---
## NetworkStream::BeginWrite method


Memulai operasi tulis asynchronous.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Buffer yang berisi data yang akan ditulis. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte yang akan ditulis. |
| callback | AsyncCallback | Callback yang akan dipanggil ketika operasi selesai. |
| state | System::SharedPtr\<Object\> | Data yang disediakan pengguna yang digunakan untuk mengidentifikasi secara unik setiap operasi penulisan asinkron. |

### ReturnValue

Objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi penulisan asinkron yang dimulai.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
