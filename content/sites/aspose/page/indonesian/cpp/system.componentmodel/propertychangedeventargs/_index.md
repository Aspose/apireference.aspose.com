---
title: "Kelas System::ComponentModel::PropertyChangedEventArgs"
linktitle: "PropertyChangedEventArgs"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::ComponentModel::PropertyChangedEventArgs. Argumen dari event PropertyChanged. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.componentmodel/propertychangedeventargs/
---
## PropertyChangedEventArgs class


Argumen dari event PropertyChanged. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class PropertyChangedEventArgs : public System::EventArgs
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [get_PropertyName](./get_propertyname/)() | Informasi RTTI. |
| [PropertyChangedEventArgs](./propertychangedeventargs/)(const String\&) | Menginisialisasi argumen event PropertyChanged. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Anggota statis yang mewakili sebuah [EventArgs](../../system/eventargs/) pointer bersama "kosong" (null-pointer). |
## Lihat Juga

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
