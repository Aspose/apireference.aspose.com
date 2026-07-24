---
title: "System::Net::Sockets::TcpClient kelas"
linktitle: "TcpClient"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::TcpClient kelas. Mewakili klien untuk layanan jaringan TCP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 500
url: /id/cpp/system.net.sockets/tcpclient/
---
## TcpClient class


Mewakili klien untuk layanan jaringan TCP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class TcpClient : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi koneksi asinkron. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi koneksi asinkron. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi koneksi asinkron. |
| [Close](./close/)() | Menutup koneksi dan membuang instance saat ini. |
| [Connect](./connect/)(String, int32_t) | Membuat koneksi ke host remote yang ditentukan. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Membuat koneksi ke host remote yang ditentukan. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | Membuat koneksi ke host remote yang ditentukan. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | Membuat koneksi ke host remote yang ditentukan. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | Menunggu hingga operasi koneksi asinkron yang ditentukan selesai. |
| [get_Available](./get_available/)() | Mengembalikan jumlah byte yang diterima dan siap dibaca. |
| [get_Client](./get_client/)() | Informasi RTTI. |
| [get_Connected](./get_connected/)() | Mengembalikan nilai yang menunjukkan apakah soket terhubung ke host remote. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Mendapatkan nilai yang menunjukkan apakah instance saat ini hanya mengizinkan satu klien menggunakan sebuah port. |
| [get_LingerState](./get_lingerstate/)() | Mendapatkan nilai yang menunjukkan apakah soket akan menunda penutupan dalam upaya mengirim semua data yang tertunda. |
| [get_NoDelay](./get_nodelay/)() | Mendapatkan nilai yang menunjukkan apakah instance saat ini menggunakan algoritma Nagle. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Mendapatkan ukuran buffer yang digunakan untuk menerima data. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | Mendapatkan nilai yang menunjukkan jumlah waktu setelah mana penerimaan data akan berakhir (timeout). |
| [get_SendBufferSize](./get_sendbuffersize/)() | Mendapatkan ukuran buffer yang digunakan untuk mengirim data. |
| [get_SendTimeout](./get_sendtimeout/)() | Mendapatkan nilai yang menunjukkan jumlah waktu setelah mana pengiriman data akan berakhir (timeout). |
| [GetStream](./getstream/)() | Mengembalikan aliran yang digunakan untuk mengirim dan menerima data. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | Mengatur soket. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Mengatur nilai yang menunjukkan apakah instance saat ini hanya mengizinkan satu klien menggunakan sebuah port. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | Mengatur nilai yang menunjukkan apakah socket akan menunda penutupan untuk mencoba mengirim semua data yang tertunda. |
| [set_NoDelay](./set_nodelay/)(bool) | Mengatur nilai yang menunjukkan apakah instance saat ini menggunakan algoritma Nagle. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Mengatur ukuran buffer yang digunakan untuk menerima data. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | Mengatur nilai yang menunjukkan jumlah waktu setelah mana penerimaan data akan berakhir (timeout). |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | Mengatur ukuran buffer yang digunakan untuk mengirim data. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | Mengatur nilai yang menunjukkan jumlah waktu setelah mana pengiriman data akan berakhir (timeout). |
| [TcpClient](./tcpclient/)(System::SharedPtr\<IPEndPoint\>) | Membuat instance baru. |
| [TcpClient](./tcpclient/)() | Membuat instance baru. |
| [TcpClient](./tcpclient/)(AddressFamily) | Membuat instance baru. |
| [TcpClient](./tcpclient/)(String, int32_t) | Membuat instance baru. |
| virtual [~TcpClient](./~tcpclient/)() | Menghancurkan instance saat ini. |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
