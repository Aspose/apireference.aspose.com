---
title: "System::Net::IPHostEntry class"
linktitle: "IPHostEntry"
second_title: "Aspose.Page untuk C++"
description: "System::Net::IPHostEntry class. Mewakili informasi tentang alamat host internet. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2600
url: /id/cpp/system.net/iphostentry/
---
## IPHostEntry class


Mewakili informasi tentang alamat host internet. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class IPHostEntry : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_AddressList](./get_addresslist/)() | Mendapatkan koleksi alamat IP host. |
| [get_Aliases](./get_aliases/)() | Mendapatkan koleksi alias host. |
| [get_HostName](./get_hostname/)() const | Informasi RTTI. |
| [IPHostEntry](./iphostentry/)() | Membuat instance baru. |
| [set_AddressList](./set_addresslist/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>) | Mengatur koleksi alamat IP host. |
| [set_Aliases](./set_aliases/)(System::ArrayPtr\<String\>) | Mengatur koleksi alias host. |
| [set_HostName](./set_hostname/)(String) | Mengatur nama host. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
