---
title: "System::Net::Dns::BeginGetHostAddresses method"
linktitle: "BeginGetHostAddresses"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Dns::BeginGetHostAddresses method. Memulai operasi asynchronous untuk membuat instance kelas IPHostEntry baru menggunakan string yang ditentukan yang berisi nama host atau alamat IP dalam C++."
type: docs
weight: 100
url: /id/cpp/system.net/dns/begingethostaddresses/
---
## Dns::BeginGetHostAddresses method


Memulai operasi asynchronous untuk membuat instance IPHostEntry-class baru menggunakan string yang ditentukan yang berisi nama host atau alamat IP.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostAddresses(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| hostNameOrAddress | String | Sebuah string yang berisi nama host atau alamat IP. |
| requestCallback | AsyncCallback | Callback yang akan dipanggil ketika operasi selesai. |
| state | System::SharedPtr\<Object\> | Data yang disediakan pengguna untuk mengidentifikasi secara unik setiap operasi asynchronous. |

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
