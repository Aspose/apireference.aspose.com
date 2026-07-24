---
title: "Kelas System::ComponentModel::DoWorkEventArgs"
linktitle: "DoWorkEventArgs"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::ComponentModel::DoWorkEventArgs. Argumen peristiwa DoWork. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 600
url: /id/cpp/system.componentmodel/doworkeventargs/
---
## DoWorkEventArgs class


Argumen peristiwa DoWork. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class DoWorkEventArgs : public System::ComponentModel::CancelEventArgs
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [DoWorkEventArgs](./doworkeventargs/)(const SharedPtr\<System::Object\>\&) | Informasi RTTI. |
| [get_Argument](./get_argument/)() | Mendapatkan properti Argument; belum diimplementasikan. |
| [get_Result](./get_result/)() | Mendapatkan properti Result; belum diimplementasikan. |
| [set_Result](./set_result/)(const SharedPtr\<System::Object\>\&) | Mengatur properti Result; belum diimplementasikan. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Anggota statis yang mewakili sebuah [EventArgs](../../system/eventargs/) pointer bersama "kosong" (null-pointer). |
## Lihat Juga

* Class [CancelEventArgs](../canceleventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
