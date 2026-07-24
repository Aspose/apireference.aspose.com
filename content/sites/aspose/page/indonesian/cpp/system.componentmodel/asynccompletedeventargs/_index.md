---
title: "Kelas System::ComponentModel::AsyncCompletedEventArgs"
linktitle: "AsyncCompletedEventArgs"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::ComponentModel::AsyncCompletedEventArgs. Sebuah instance dari kelas ini diteruskan sebagai argumen ke delegasi AsyncCompletedEventHandler. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.componentmodel/asynccompletedeventargs/
---
## AsyncCompletedEventArgs class


Sebuah instance dari kelas ini diteruskan sebagai argumen ke delegasi AsyncCompletedEventHandler. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class AsyncCompletedEventArgs : public System::EventArgs
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)() | Konstruktor. |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) | Menginisialisasi sebuah instance baru dari kelas [System.ComponentModel.AsyncCompletedEventArgs](./). |
| [get_Cancelled](./get_cancelled/)() const | Mendapatkan nilai yang menunjukkan apakah operasi asynchronous telah dibatalkan. true jika operasi latar belakang telah dibatalkan; jika tidak false. Nilai default adalah false. |
| [get_Error](./get_error/)() const | Mendapatkan nilai yang menunjukkan kesalahan apa yang terjadi selama operasi asynchronous. |
| [get_UserState](./get_userstate/)() const | Mendapatkan pengidentifikasi unik untuk tugas asynchronous. Referensi objek yang secara unik mengidentifikasi tugas asynchronous; jika tidak, null jika tidak ada nilai yang diatur. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Anggota statis yang mewakili sebuah [EventArgs](../../system/eventargs/) pointer bersama "kosong" (null-pointer). |
## Lihat Juga

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
