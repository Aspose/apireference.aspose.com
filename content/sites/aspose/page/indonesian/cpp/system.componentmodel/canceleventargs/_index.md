---
title: "Kelas System::ComponentModel::CancelEventArgs"
linktitle: "CancelEventArgs"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::ComponentModel::CancelEventArgs. Argumen dari peristiwa yang dapat dibatalkan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 300
url: /id/cpp/system.componentmodel/canceleventargs/
---
## CancelEventArgs class


Argumen dari peristiwa yang dapat dibatalkan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class CancelEventArgs : public System::EventArgs
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CancelEventArgs](./canceleventargs/)(bool) | Informasi RTTI. |
| [CancelEventArgs](./canceleventargs/)() | Konstruktor; mengatur properti Cancel menjadi false. |
| [get_Cancel](./get_cancel/)() | Mendapatkan nilai yang menunjukkan apakah peristiwa harus dibatalkan. |
| [set_Cancel](./set_cancel/)(bool) | Mengatur nilai yang menunjukkan apakah peristiwa harus dibatalkan. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Anggota statis yang mewakili sebuah [EventArgs](../../system/eventargs/) pointer bersama "kosong" (null-pointer). |
## Lihat Juga

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
