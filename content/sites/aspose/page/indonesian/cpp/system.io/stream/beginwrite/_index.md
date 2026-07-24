---
title: "metode System::IO::Stream::BeginWrite"
linktitle: "BeginWrite"
second_title: "Aspose.Page untuk C++"
description: "metode System::IO::Stream::BeginWrite. Memulai operasi penulisan asinkron dalam C++."
type: docs
weight: 200
url: /id/cpp/system.io/stream/beginwrite/
---
## Stream::BeginWrite method


Memulai operasi tulis asynchronous.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | System::ArrayPtr\<uint8_t\> | Buffer yang berisi data yang akan ditulis |
| offset | int | Offset berbasis 0 dalam **buffer** yang menunjukkan posisi di mana data yang akan ditulis dimulai |
| count | int | Jumlah byte yang akan ditulis |
| callback | System::AsyncCallback | Callback yang akan dipanggil ketika operasi selesai. |
| state | System::SharedPtr\<System::Object\> | Data yang disediakan pengguna yang digunakan untuk mengidentifikasi secara unik setiap operasi penulisan asinkron |

### ReturnValue

Objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi penulisan asinkron yang dimulai

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
