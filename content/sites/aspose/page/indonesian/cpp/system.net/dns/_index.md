---
title: "System::Net::Dns kelas"
linktitle: "Dns"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Dns kelas. Menyediakan metode untuk bekerja dengan DNS dalam C++."
type: docs
weight: 700
url: /id/cpp/system.net/dns/
---
## Dns class


Menyediakan metode untuk bekerja dengan DNS.

```cpp
class Dns : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [BeginGetHostAddresses](./begingethostaddresses/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi asynchronous untuk membuat instance IPHostEntry-class baru menggunakan string yang ditentukan yang berisi nama host atau alamat IP. |
| static [BeginGetHostByName](./begingethostbyname/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi asynchronous untuk membuat instance IPHostEntry-class baru menggunakan nama host yang ditentukan. |
| static [BeginGetHostEntry](./begingethostentry/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi asynchronous untuk membuat instance IPHostEntry-class baru menggunakan string yang ditentukan yang berisi nama host atau alamat IP. |
| static [BeginGetHostEntry](./begingethostentry/)(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi asynchronous untuk membuat instance IPHostEntry-class baru menggunakan alamat IP yang ditentukan. |
| static [BeginResolve](./beginresolve/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi asynchronous untuk membuat instance IPHostEntry-class baru menggunakan nama host yang ditentukan. |
| [Dns](./dns/)() | Konstruktor default yang dihapus. |
| static [EndGetHostAddresses](./endgethostaddresses/)(System::SharedPtr\<IAsyncResult\>) | Menunggu hingga operasi asynchronous yang ditentukan untuk membuat instance IPHostEntry-class selesai. |
| static [EndGetHostByName](./endgethostbyname/)(System::SharedPtr\<IAsyncResult\>) | Menunggu hingga operasi asynchronous yang ditentukan untuk membuat instance IPHostEntry-class selesai. |
| static [EndGetHostEntry](./endgethostentry/)(System::SharedPtr\<IAsyncResult\>) | Menunggu hingga operasi asynchronous yang ditentukan untuk membuat instance IPHostEntry-class selesai. |
| static [EndResolve](./endresolve/)(System::SharedPtr\<IAsyncResult\>) | Menunggu hingga operasi asynchronous yang ditentukan untuk membuat instance IPHostEntry-class selesai. |
| static [GetHostAddresses](./gethostaddresses/)(String) | Mengembalikan kumpulan alamat IP dari nama host atau alamat IP yang ditentukan. |
| static [GetHostByAddress](./gethostbyaddress/)(String) | Membuat instance IPHostEntry-class baru menggunakan representasi string dari alamat IP yang ditentukan. |
| static [GetHostByAddress](./gethostbyaddress/)(System::SharedPtr\<IPAddress\>) | Membuat instance IPHostEntry-class baru menggunakan alamat IP yang ditentukan. |
| static [GetHostByName](./gethostbyname/)(String) | Informasi RTTI. |
| static [GetHostEntry](./gethostentry/)(String) | Membuat instance IPHostEntry-class baru menggunakan string yang ditentukan yang berisi nama host atau alamat IP. |
| static [GetHostEntry](./gethostentry/)(System::SharedPtr\<IPAddress\>) | Membuat instance IPHostEntry-class baru menggunakan alamat IP yang ditentukan. |
| static [GetHostName](./gethostname/)() | Mengembalikan nama host dari mesin lokal. |
| static [Resolve](./resolve/)(String) | Membuat instance IPHostEntry-class baru menggunakan nama host yang ditentukan. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
