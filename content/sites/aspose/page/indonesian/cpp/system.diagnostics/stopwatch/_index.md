---
title: "System::Diagnostics::Stopwatch kelas"
linktitle: "Stopwatch"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Diagnostics::Stopwatch. Memungkinkan pengukuran waktu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 700
url: /id/cpp/system.diagnostics/stopwatch/
---
## Stopwatch class


Memungkinkan pengukuran waktu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class Stopwatch : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Elapsed](./get_elapsed/)() const | Mendapatkan total waktu yang telah berlalu yang diukur oleh instance saat ini. |
| [get_ElapsedMilliseconds](./get_elapsedmilliseconds/)() const | Mendapatkan total waktu yang telah berlalu yang diukur oleh instance saat ini, dalam milidetik. |
| [get_ElapsedTicks](./get_elapsedticks/)() const | Mendapatkan total waktu yang telah berlalu yang diukur oleh instance saat ini, dalam tick timer. |
| [get_IsRunning](./get_isrunning/)() const | Memeriksa apakah stopwatch sedang berjalan. |
| [Reset](./reset/)() | Menghentikan pengukuran waktu, mengatur interval yang diukur menjadi nol. |
| [Restart](./restart/)() | Mengatur interval yang diukur menjadi nol, lalu memulai pengukuran waktu. |
| [Start](./start/)() | Memulai pengukuran waktu. |
| static [StartNew](./startnew/)() | Membuat objek [Stopwatch](./) baru dan memulai pengukuran. |
| [Stop](./stop/)() | Menghentikan pengukuran waktu. |
| [Stopwatch](./stopwatch/)() | Informasi RTTI. |
| virtual [~Stopwatch](./~stopwatch/)() | Destruktor. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
