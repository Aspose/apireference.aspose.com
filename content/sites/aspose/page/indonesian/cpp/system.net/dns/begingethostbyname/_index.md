---
title: "metode System::Net::Dns::BeginGetHostByName"
linktitle: "BeginGetHostByName"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Net::Dns::BeginGetHostByName. Memulai operasi asynchronous untuk membuat instance kelas IPHostEntry baru menggunakan nama host yang ditentukan di C++."
type: docs
weight: 200
url: /id/cpp/system.net/dns/begingethostbyname/
---
## Dns::BeginGetHostByName method


Memulai operasi asynchronous untuk membuat instance IPHostEntry-class baru menggunakan nama host yang ditentukan.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostByName(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| hostName | String | Nama host. |
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
