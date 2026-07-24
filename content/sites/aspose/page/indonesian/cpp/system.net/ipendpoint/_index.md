---
title: "System::Net::IPEndPoint class"
linktitle: "IPEndPoint"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::IPEndPoint. Mewakili sebuah endpoint jaringan yang berisi alamat IP dan sebuah port. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2500
url: /id/cpp/system.net/ipendpoint/
---
## IPEndPoint class


Mewakili sebuah endpoint jaringan yang berisi alamat IP dan sebuah port. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class IPEndPoint : public System::Net::EndPoint
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Create](./create/)(System::SharedPtr\<SocketAddress\>) override | Buat instance baru dari kelas [EndPoint](../endpoint/) menggunakan alamat soket yang ditentukan. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| [get_Address](./get_address/)() | Mendapatkan alamat endpoint. |
| [get_AddressFamily](./get_addressfamily/)() override | Informasi RTTI. |
| [get_Port](./get_port/)() | Mendapatkan nomor port. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| [GetImpl](./getimpl/)() const override | Mengembalikan pointer ke implementasi. |
| [IPEndPoint](./ipendpoint/)(int64_t, int32_t) | Membuat instance baru. |
| [IPEndPoint](./ipendpoint/)(System::SharedPtr\<IPAddress\>, int32_t) | Membuat instance baru. |
| [set_Address](./set_address/)(System::SharedPtr\<IPAddress\>) | Mengatur alamat endpoint. |
| [set_Port](./set_port/)(int32_t) | Mengatur nomor port. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Any](./any/) | Endpoint untuk sembarang alamat IPv4 dan sembarang port. |
| static [AnyPort](./anyport/) | Nilai yang menunjukkan apakah sembarang port dapat digunakan. |
| static [IPv6Any](./ipv6any/) | Endpoint untuk sembarang alamat IPv6 dan sembarang port. |
| static [MaxPort](./maxport/) | Nomor port maksimum. |
| static [MinPort](./minport/) | Informasi RTTI. |
## Lihat Juga

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
