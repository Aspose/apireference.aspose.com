---
title: "kelas System::IO::BinaryReader"
linktitle: "BinaryReader"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::IO::BinaryReader. Mewakili pembaca yang membaca tipe data primitif sebagai data biner dalam enkoding tertentu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen di C++."
type: docs
weight: 800
url: /id/cpp/system.io/binaryreader/
---
## BinaryReader class


Mewakili pembaca yang membaca tipe data primitif sebagai data biner dalam enkoding tertentu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class BinaryReader : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&) | Membuat sebuah instance dari kelas [BinaryReader](./) yang membaca data dari aliran yang ditentukan menggunakan enkoding UTF-8. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | Membuat sebuah instance dari kelas [BinaryReader](./) yang membaca data dari aliran yang ditentukan menggunakan enkoding yang ditentukan. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&, bool) | Membuat sebuah instance dari kelas [BinaryReader](./) yang membaca data dari aliran yang ditentukan menggunakan enkoding yang ditentukan. |
| virtual [Close](./close/)() | Menutup objek [BinaryReader](./) saat ini dan aliran input yang mendasarinya. |
| [Dispose](./dispose/)() override | Melepaskan semua sumber daya yang digunakan oleh objek saat ini dan menutup aliran yang mendasarinya. |
| virtual [get_BaseStream](./get_basestream/)() | Mengembalikan aliran input. |
| virtual [PeekChar](./peekchar/)() | Membaca satu karakter dari aliran input tanpa mengubah kursor baca aliran. |
| virtual [Read](./read/)() | Membaca satu karakter dari aliran input. |
| virtual [Read](./read/)(ArrayPtr\<uint8_t\>, int, int) | Membaca sejumlah byte yang ditentukan dari aliran input dan menuliskannya ke array byte yang ditentukan. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | Membaca sejumlah karakter yang ditentukan dari aliran input, mengonversinya ke enkoding UTF-16 dan menuliskan karakter UTF-16 yang dihasilkan ke array karakter yang ditentukan mulai dari posisi yang ditentukan. |
| virtual [ReadBoolean](./readboolean/)() | Membaca satu byte dari aliran input dan mengembalikan representasi boolean-nya. |
| virtual [ReadByte](./readbyte/)() | Membaca satu byte dari aliran input. |
| virtual [ReadBytes](./readbytes/)(int) | Membaca sejumlah byte yang ditentukan dari aliran input. |
| virtual [ReadChar](./readchar/)() | Membaca satu karakter dari aliran input. |
| virtual [ReadChars](./readchars/)(int) | Membaca sejumlah karakter yang ditentukan dari aliran input dan mengembalikannya dalam enkoding UTF-16. |
| virtual [ReadDecimal](./readdecimal/)() | BELUM DIIMPLEMENTASIKAN. |
| virtual [ReadDouble](./readdouble/)() | Membaca 8 byte dari aliran input dan mengembalikannya sebagai nilai titik mengambang double-precision. |
| virtual [ReadInt16](./readint16/)() | Membaca 2 byte dari aliran masukan dan mengembalikannya sebagai nilai integer 16-bit. |
| virtual [ReadInt32](./readint32/)() | Membaca 4 byte dari aliran masukan dan mengembalikannya sebagai nilai integer 32-bit. |
| virtual [ReadInt64](./readint64/)() | Membaca 8 byte dari aliran masukan dan mengembalikannya sebagai nilai integer 64-bit. |
| virtual [ReadSByte](./readsbyte/)() | Membaca satu byte dari aliran masukan dan mengembalikannya sebagai nilai integer 8-bit bertanda. |
| virtual [ReadSingle](./readsingle/)() | Membaca 4 byte dari aliran masukan dan mengembalikannya sebagai nilai titik mengambang presisi tunggal. |
| virtual [ReadString](./readstring/)() | Membaca sebuah string dari aliran saat ini. String tersebut diawali dengan panjang, yang dikodekan sebagai integer tujuh bit sekaligus. |
| virtual [ReadUInt16](./readuint16/)() | Membaca 2 byte dari aliran masukan dan mengembalikannya sebagai nilai integer 16-bit tak bertanda. |
| virtual [ReadUInt32](./readuint32/)() | Membaca 4 byte dari aliran masukan dan mengembalikannya sebagai nilai integer 32-bit tak bertanda. |
| virtual [ReadUInt64](./readuint64/)() | Membaca 8 byte dari aliran masukan dan mengembalikannya sebagai nilai integer 64-bit tak bertanda. |
| virtual [~BinaryReader](./~binaryreader/)() | Destruktor. |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
