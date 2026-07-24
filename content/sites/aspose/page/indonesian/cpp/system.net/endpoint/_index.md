---
title: "kelas System::Net::EndPoint"
linktitle: "EndPoint"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Net::EndPoint. Kelas abstrak ini berisi alamat jaringan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 900
url: /id/cpp/system.net/endpoint/
---
## EndPoint class


Kelas abstrak ini berisi alamat jaringan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class EndPoint : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<SocketAddress\>) | Buat instance baru dari kelas [EndPoint](./) menggunakan alamat soket yang ditentukan. |
| virtual [get_AddressFamily](./get_addressfamily/)() | Informasi RTTI. |
| virtual [GetImpl](./getimpl/)() const | Mengembalikan pointer ke implementasi. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [ImplPtr](./implptr/) | Pointer ke implementasi. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
