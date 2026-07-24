---
title: "System::IO::Stream::BeginRead metode"
linktitle: "BeginRead"
second_title: "Aspose.Page untuk C++"
description: "System::IO::Stream::BeginRead metode. Memulai operasi pembacaan asinkron dalam C++."
type: docs
weight: 100
url: /id/cpp/system.io/stream/beginread/
---
## Stream::BeginRead method


Memulai operasi baca asynchronous.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginRead(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Buffer untuk dibaca |
| offset | int | Offset berbasis 0 dalam **buffer** yang menunjukkan posisi dari mana mulai menulis data yang dibaca. |
| count | int | Jumlah byte yang akan dibaca |
| callback | System::AsyncCallback | Callback yang akan dipanggil ketika operasi selesai. |
| state | System::SharedPtr\<System::Object\> | Data yang disediakan pengguna digunakan untuk mengidentifikasi secara unik setiap operasi baca asinkron |

### ReturnValue

Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi baca asinkron yang dimulai

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
