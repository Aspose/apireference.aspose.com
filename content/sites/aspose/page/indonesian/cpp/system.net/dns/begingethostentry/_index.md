---
title: "System::Net::Dns::BeginGetHostEntry metode"
linktitle: "BeginGetHostEntry"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Dns::BeginGetHostEntry metode. Memulai operasi asynchronous untuk membuat instance kelas IPHostEntry baru menggunakan string yang berisi nama host atau alamat IP yang ditentukan dalam C++."
type: docs
weight: 300
url: /id/cpp/system.net/dns/begingethostentry/
---
## Dns::BeginGetHostEntry(String, AsyncCallback, System::SharedPtr\<Object\>) method


Memulai operasi asynchronous untuk membuat instance IPHostEntry-class baru menggunakan string yang ditentukan yang berisi nama host atau alamat IP.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| hostNameOrAddress | String | String yang berisi nama host atau alamat IP. |
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
## Dns::BeginGetHostEntry(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) method


Memulai operasi asynchronous untuk membuat instance IPHostEntry-class baru menggunakan alamat IP yang ditentukan.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(System::SharedPtr<IPAddress> address, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| alamat | System::SharedPtr\<IPAddress\> | Alamat IP. |
| requestCallback | AsyncCallback | Callback yang akan dipanggil ketika operasi selesai. |
| stateObject | System::SharedPtr\<Object\> | Data yang disediakan pengguna untuk mengidentifikasi secara unik setiap operasi asynchronous. |

### ReturnValue

Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi asynchronous yang dimulai.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
