---
title: "kelas System::Net::Sockets::TcpListener"
linktitle: "TcpListener"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::TcpListener class. Mewakili pendengar untuk layanan jaringan TCP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 600
url: /id/cpp/system.net.sockets/tcplistener/
---
## TcpListener class


Mewakili pendengar untuk layanan jaringan TCP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class TcpListener : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AcceptSocket](./acceptsocket/)() | Menerima permintaan koneksi yang tertunda dan mengembalikan socket yang digunakan untuk mengirim dan menerima data. |
| [AcceptTcpClient](./accepttcpclient/)() | Menerima permintaan koneksi yang tertunda dan mengembalikan instance kelas TcpClient yang digunakan untuk mengirim dan menerima data. |
| [AllowNatTraversal](./allownattraversal/)(bool) | Mengaktifkan atau menonaktifkan NAT traversal. |
| [BeginAcceptSocket](./beginacceptsocket/)(AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi accept secara asynchronous. |
| [BeginAcceptTcpClient](./beginaccepttcpclient/)(AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi accept secara asynchronous. |
| static [Create](./create/)(int32_t) | Membuat instance baru menggunakan nomor port yang ditentukan. |
| [EndAcceptSocket](./endacceptsocket/)(System::SharedPtr\<IAsyncResult\>) | Menunggu hingga operasi accept asynchronous yang ditentukan selesai. |
| [EndAcceptTcpClient](./endaccepttcpclient/)(System::SharedPtr\<IAsyncResult\>) | Menunggu hingga operasi accept asynchronous yang ditentukan selesai. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Mendapatkan nilai yang menunjukkan apakah instance saat ini hanya mengizinkan satu klien menggunakan sebuah port. |
| [get_LocalEndpoint](./get_localendpoint/)() | Mengembalikan endpoint yang mendasari. |
| [get_Server](./get_server/)() | Informasi RTTI. |
| [Pending](./pending/)() | Mengembalikan nilai yang menunjukkan apakah ada permintaan koneksi yang tertunda. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Mengatur nilai yang menunjukkan apakah instance saat ini hanya mengizinkan satu klien menggunakan sebuah port. |
| [Start](./start/)() | Memulai mendengarkan koneksi masuk. |
| [Start](./start/)(int32_t) | Memulai mendengarkan koneksi masuk. |
| [Stop](./stop/)() | Menghentikan mendengarkan koneksi masuk. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPEndPoint\>) | Membuat instance baru. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPAddress\>, int32_t) | Membuat instance baru. |
| [TcpListener](./tcplistener/)(int32_t) | Membuat instance baru. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
