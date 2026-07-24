---
title: "Kelas System::Net::Sockets::LingerOption"
linktitle: "LingerOption"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::LingerOption class. Menentukan apakah socket akan tetap terhubung setelah pemanggilan metode Close() atau Close(). Ini juga menentukan periode socket akan tetap terhubung jika pengiriman data terus berlanjut. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 200
url: /id/cpp/system.net.sockets/lingeroption/
---
## LingerOption class


Menentukan apakah socket akan tetap terhubung setelah pemanggilan metode Close() atau Close(). Ini juga menentukan periode socket akan tetap terhubung jika pengiriman data terus berlanjut. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class LingerOption : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Enabled](./get_enabled/)() | Informasi RTTI. |
| [get_LingerTime](./get_lingertime/)() | Mendapatkan batas waktu tunda dalam detik. |
| [LingerOption](./lingeroption/)(bool, int32_t) | Membuat instance baru. |
| [set_Enabled](./set_enabled/)(bool) | Mengatur nilai yang menunjukkan apakah socket akan menunda penutupan untuk mencoba mengirim semua data yang tertunda. |
| [set_LingerTime](./set_lingertime/)(int32_t) | Mengatur batas waktu tunda dalam detik. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
