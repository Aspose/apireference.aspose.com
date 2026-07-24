---
title: "System::Net::Security::SslStream::BeginWrite metode"
linktitle: "BeginWrite"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Security::SslStream::BeginWrite metode. Memulai operasi penulisan asinkron dalam C++."
type: docs
weight: 400
url: /id/cpp/system.net.security/sslstream/beginwrite/
---
## SslStream::BeginWrite method


Memulai operasi tulis asynchronous.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Array byte untuk menuliskan data ke. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| count | int32_t | Jumlah byte yang akan ditulis. |
| asyncCallback | AsyncCallback | Callback yang akan dipanggil ketika operasi selesai. |
| asyncState | System::SharedPtr\<Object\> | Data yang disediakan pengguna yang digunakan untuk mengidentifikasi secara unik setiap operasi penulisan asinkron. |

### ReturnValue

Objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi penulisan asinkron yang dimulai.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
