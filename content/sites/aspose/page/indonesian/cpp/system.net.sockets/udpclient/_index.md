---
title: "System::Net::Sockets::UdpClient class"
linktitle: "UdpClient"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::UdpClient class. Menyediakan layanan jaringan User Datagram Protocol (UDP). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 700
url: /id/cpp/system.net.sockets/udpclient/
---
## UdpClient class


Menyediakan layanan jaringan User Datagram Protocol (UDP). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class UdpClient : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Close](./close/)() | Menutup koneksi UDP. |
| [Connect](./connect/)(String, int32_t) | Membuat koneksi ke port yang ditentukan pada host yang ditentukan. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Membuat koneksi dengan host pada alamat yang ditentukan di port yang ditentukan. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | Membuat koneksi ke titik akhir remote. |
| [Dispose](./dispose/)() override | Melepaskan sumber daya yang dikelola dan tidak dikelola yang digunakan oleh [UdpClient](./). |
| [get_Client](./get_client/)() | Informasi RTTI. |
| [Receive](./receive/)(System::SharedPtr\<IPEndPoint\>\&) | Mengembalikan datagram yang dikirim oleh server. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) | Mengirim datagram UDP ke host pada titik akhir remote. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) | Mengirim datagram UDP ke port yang ditentukan pada host remote yang ditentukan. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t) | Mengirim datagram UDP ke host remote. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | Digunakan untuk menyediakan soket jaringan yang mendasari. |
| [UdpClient](./udpclient/)() | Menginisialisasi instance baru dari kelas [UdpClient](./). |
| [UdpClient](./udpclient/)(AddressFamily) | Menginisialisasi instance baru dari kelas [UdpClient](./). |
| [UdpClient](./udpclient/)(int32_t) | Menginisialisasi instance baru dari kelas [UdpClient](./). |
| [UdpClient](./udpclient/)(int32_t, AddressFamily) | Menginisialisasi instance baru dari kelas [UdpClient](./). |
| [UdpClient](./udpclient/)(System::SharedPtr\<IPEndPoint\>) | Menginisialisasi instance baru dari kelas [UdpClient](./). param local EP titik akhir lokal tempat Anda mengikat koneksi UDP. |
| [UdpClient](./udpclient/)(String, int32_t) | Membuat instance baru dari kelas [UdpClient](./) dan terhubung ke host remote yang ditentukan pada port yang ditentukan. |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
