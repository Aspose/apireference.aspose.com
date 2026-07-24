---
title: "System::Drawing::Printing::PrintEventArgs kelas"
linktitle: "PrintEventArgs"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::Printing::PrintEventArgs kelas. Menyediakan data untuk peristiwa BeginPrint dan EndPrint. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 800
url: /id/cpp/system.drawing.printing/printeventargs/
---
## PrintEventArgs class


Menyediakan data untuk peristiwa BeginPrint dan EndPrint. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class PrintEventArgs : public System::ComponentModel::CancelEventArgs
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_PrintAction](./get_printaction/)() | Mengembalikan nilai yang menentukan aksi cetak yang diwakili oleh objek saat ini. |
| [PrintEventArgs](./printeventargs/)() | Membuat instance baru dari objek [PrintEventArgs](./). |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Anggota statis yang mewakili sebuah [EventArgs](../../system/eventargs/) pointer bersama "kosong" (null-pointer). |
## Lihat Juga

* Class [CancelEventArgs](../../system.componentmodel/canceleventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
