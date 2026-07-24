---
title: "System::ComponentModel::ProgressChangedEventArgs kelas"
linktitle: "ProgressChangedEventArgs"
second_title: "Aspose.Page untuk C++"
description: "System::ComponentModel::ProgressChangedEventArgs kelas. Sebuah instance dari kelas ini diteruskan sebagai argumen ke delegasi ProgressChangedEventHandler. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance dari tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.componentmodel/progresschangedeventargs/
---
## ProgressChangedEventArgs class


Sebuah instance dari kelas ini diteruskan sebagai argumen ke delegasi ProgressChangedEventHandler. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance dari tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class ProgressChangedEventArgs : public System::EventArgs
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_ProgressPercentage](./get_progresspercentage/)() const | Mendapatkan persentase kemajuan tugas asynchronous. |
| [get_UserState](./get_userstate/)() const | Mendapatkan status pengguna yang unik. |
| [ProgressChangedEventArgs](./progresschangedeventargs/)(int, System::SharedPtr\<System::Object\>) | Konstruktor. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Anggota statis yang mewakili sebuah [EventArgs](../../system/eventargs/) pointer bersama "kosong" (null-pointer). |
## Lihat Juga

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
