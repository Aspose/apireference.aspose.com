---
title: "Kelas System::IO::BinaryWriter"
linktitle: "BinaryWriter"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::IO::BinaryWriter. Mewakili penulis yang menulis nilai-nilai tipe primitif ke aliran byte. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 900
url: /id/cpp/system.io/binarywriter/
---
## BinaryWriter class


Mewakili penulis yang menulis nilai-nilai tipe primitif ke aliran byte. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class BinaryWriter : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [BinaryWriter](./binarywriter/)(const StreamPtr\&, const EncodingPtr\&, bool) | Membuat instance dari kelas [BinaryWriter](./) yang menulis data ke aliran yang ditentukan menggunakan enkoding yang ditentukan. |
| [Close](./close/)() | Menutup objek [BinaryWriter](./) saat ini dan aliran output yang mendasarinya. |
| [Dispose](./dispose/)() override | Melepaskan semua sumber daya yang digunakan oleh objek saat ini dan menutup aliran yang mendasarinya. |
| [Flush](./flush/)() | Mengosongkan aliran keluaran. |
| [get_BaseStream](./get_basestream/)() | Mengembalikan aliran keluaran. |
| [Seek](./seek/)(int, System::IO::SeekOrigin) | Mengatur posisi aliran yang diwakili oleh objek saat ini. |
| virtual [Write](./write/)(uint8_t) | Menulis nilai integer tak bertanda 8-bit yang ditentukan ke aliran keluaran. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int, int) | Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran keluaran. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int, int) | Menulis subrentang karakter UTF-16 yang ditentukan dari array karakter yang ditentukan ke aliran keluaran. |
| virtual [Write](./write/)(bool) | Menulis satu byte dengan nilai 0 jika **value** adalah 'true' dan 1 jika **value** adalah 'false' ke aliran keluaran. |
| virtual [Write](./write/)(char16_t) | Menulis nilai karakter lebar 16-bit yang ditentukan ke aliran keluaran. |
| virtual [Write](./write/)(int16_t) | Menulis nilai integer 16-bit yang ditentukan ke aliran keluaran. |
| virtual [Write](./write/)(int) | Menulis nilai integer 32-bit yang ditentukan ke aliran keluaran. |
| virtual [Write](./write/)(int64_t) | Menulis nilai integer 64-bit yang ditentukan ke aliran keluaran. |
| virtual [Write](./write/)(uint16_t) | Menulis nilai integer tak bertanda 16-bit yang ditentukan ke aliran keluaran. |
| virtual [Write](./write/)(uint32_t) | Menulis nilai integer tak bertanda 32-bit yang ditentukan ke aliran keluaran. |
| virtual [Write](./write/)(uint64_t) | Menulis nilai integer tak bertanda 64-bit yang ditentukan ke aliran keluaran. |
| virtual [Write](./write/)(float) | Menulis nilai titik mengambang presisi tunggal yang ditentukan ke aliran keluaran. |
| virtual [Write](./write/)(double) | Menulis nilai titik mengambang presisi ganda yang ditentukan ke aliran keluaran. |
| virtual [Write](./write/)(const Decimal\&) | Menulis representasi byte dari nilai [Decimal](../../system/decimal/) yang ditentukan ke aliran keluaran. |
| virtual [Write](./write/)(const String\&) | Menulis string dengan prefiks panjang dalam enkoding saat ini ke aliran keluaran. |
| virtual [Write](./write/)(const char_t *) | Menulis string dengan prefiks panjang dalam enkoding saat ini ke aliran keluaran. |
| [~BinaryWriter](./~binarywriter/)() | Destruktor. |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
