---
title: "System::Net::SocketAddress class"
linktitle: "SocketAddress"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::SocketAddress. Digunakan untuk menyimpan informasi yang diserialisasi tentang instance kelas EndPoint. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3300
url: /id/cpp/system.net/socketaddress/
---
## SocketAddress class


Digunakan untuk menyimpan informasi yang diserialisasi tentang instance kelas [EndPoint](../endpoint/). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class SocketAddress : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| [get_Family](./get_family/)() | Informasi RTTI. |
| [get_Size](./get_size/)() | Mengembalikan ukuran buffer yang mendasari. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| [idx_get](./idx_get/)(int32_t) | Mendapatkan nilai dari buffer yang mendasari pada indeks yang ditentukan. |
| [idx_set](./idx_set/)(int32_t, uint8_t) | Menetapkan nilai pada buffer yang mendasari pada indeks yang ditentukan. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily) | Membuat instance baru. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily, int32_t) | Membuat instance baru. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
