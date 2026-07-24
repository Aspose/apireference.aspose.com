---
title: "System::Drawing::Printing::PrintPageEventArgs kelas"
linktitle: "PrintPageEventArgs"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::Printing::PrintPageEventArgs kelas. Menyediakan data untuk peristiwa PrintPage. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 900
url: /id/cpp/system.drawing.printing/printpageeventargs/
---
## PrintPageEventArgs class


Menyediakan data untuk peristiwa PrintPage. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class PrintPageEventArgs : public System::EventArgs
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Graphics](./get_graphics/)() | BELUM DIIMPLEMENTASIKAN. |
| [get_HasMorePages](./get_hasmorepages/)() | BELUM DIIMPLEMENTASIKAN. |
| [get_PageSettings](./get_pagesettings/)() | BELUM DIIMPLEMENTASIKAN. |
| [PrintPageEventArgs](./printpageeventargs/)(const SharedPtr\<Graphics\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<PageSettings\>\&) | Membuat instance baru dari kelas [PrintPageEventArgs](./). |
| [set_HasMorePages](./set_hasmorepages/)(bool) | BELUM DIIMPLEMENTASIKAN. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Anggota statis yang mewakili sebuah [EventArgs](../../system/eventargs/) pointer bersama "kosong" (null-pointer). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [ptr](./ptr/) | Alias untuk pointer bersama ke sebuah instance dari kelas ini. |
## Lihat Juga

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
