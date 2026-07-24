---
title: "System::Net::Security::SslStream::BeginRead method"
linktitle: "BeginRead"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Security::SslStream::BeginRead method. Memulai operasi baca asinkron dalam C++."
type: docs
weight: 300
url: /id/cpp/system.net.security/sslstream/beginread/
---
## SslStream::BeginRead method


Memulai operasi baca asynchronous.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Array byte untuk membaca data dari. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| count | int32_t | Jumlah byte yang akan dibaca. |
| asyncCallback | AsyncCallback | Callback yang akan dipanggil ketika operasi selesai. |
| asyncState | System::SharedPtr\<Object\> | Data yang disediakan pengguna yang digunakan untuk mengidentifikasi secara unik setiap operasi baca asinkron. |

### ReturnValue

Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi baca asinkron yang dimulai.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
