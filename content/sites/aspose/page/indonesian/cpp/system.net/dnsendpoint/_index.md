---
title: "Kelas System::Net::DnsEndPoint"
linktitle: "DnsEndPoint"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::DnsEndPoint. Berisi informasi yang digunakan oleh aplikasi untuk terhubung ke layanan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen di C++."
type: docs
weight: 800
url: /id/cpp/system.net/dnsendpoint/
---
## DnsEndPoint class


Berisi informasi yang digunakan oleh aplikasi untuk terhubung ke layanan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class DnsEndPoint : public System::Net::EndPoint
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t) | Membuat instance baru. |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t, System::Net::Sockets::AddressFamily) | Membuat instance baru. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| [get_AddressFamily](./get_addressfamily/)() override | Informasi RTTI. |
| [get_Host](./get_host/)() | Informasi RTTI. |
| [get_Port](./get_port/)() | Mengembalikan nomor port. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
## Lihat Juga

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
