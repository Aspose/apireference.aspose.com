---
title: "System::Net::Dns::BeginResolve metode"
linktitle: "BeginResolve"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Dns::BeginResolve metode. Memulai operasi asynchronous untuk membuat instance kelas IPHostEntry baru menggunakan nama host yang ditentukan dalam C++."
type: docs
weight: 400
url: /id/cpp/system.net/dns/beginresolve/
---
## Dns::BeginResolve method


Memulai operasi asynchronous untuk membuat instance IPHostEntry-class baru menggunakan nama host yang ditentukan.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginResolve(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| hostName | String | Nama host yang digunakan untuk membuat instance baru dari kelas [IPHostEntry](../../iphostentry/). |
| requestCallback | AsyncCallback | Callback yang akan dipanggil ketika operasi selesai. |
| stateObject | System::SharedPtr\<Object\> | Data yang disediakan pengguna untuk mengidentifikasi secara unik setiap operasi asynchronous. |

### ReturnValue

Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi asynchronous yang dimulai.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
