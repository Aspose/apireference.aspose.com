---
title: "System::IO::MemoryStream class"
linktitle: "MemoryStream"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::IO::MemoryStream. Mewakili aliran yang membaca dari dan menulis ke memori. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1800
url: /id/cpp/system.io/memorystream/
---
## MemoryStream class


Mewakili aliran yang membaca dari dan menulis ke memori. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class MemoryStream : public System::IO::Stream
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Close](./close/)() override | Menutup aliran. |
| [Flush](./flush/)() override | Tidak melakukan apa-apa. |
| [get_CanRead](./get_canread/)() const override | Menentukan apakah aliran dapat dibaca. |
| [get_CanSeek](./get_canseek/)() const override | Menentukan apakah aliran mendukung pencarian. |
| [get_CanWrite](./get_canwrite/)() const override | Menentukan apakah aliran dapat ditulis. |
| [get_Capacity](./get_capacity/)() | Mengembalikan kapasitas saat ini dari buffer memori yang mendasarinya. |
| [get_Length](./get_length/)() const override | Mengembalikan panjang aliran dalam byte. |
| [get_Position](./get_position/)() const override | Mengembalikan posisi saat ini dari aliran. |
| virtual [GetBuffer](./getbuffer/)() | Mengembalikan pointer ke buffer yang mendasari. |
| [MemoryStream](./memorystream/)() | Membuat instance baru dari kelas [MemoryStream](./) dengan kapasitas awal sebesar 0. |
| [MemoryStream](./memorystream/)(int) | Membuat instance baru dari kelas [MemoryStream](./) yang mewakili aliran berdasarkan buffer memori dengan ukuran yang ditentukan. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, bool) | Membuat instance baru dari kelas [MemoryStream](./) yang mewakili aliran memori yang terhubung ke buffer memori yang ditentukan. Sebuah parameter menentukan apakah aliran dapat ditulis. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) | Membuat instance baru dari kelas [MemoryStream](./) yang mewakili aliran memori yang terhubung ke segmen buffer memori yang ditentukan, dimulai pada indeks yang ditentukan dan mencakup jumlah elemen yang ditentukan. Parameter menentukan apakah aliran dapat ditulis dan apakah metode GetBytes() dapat dipanggil. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan. |
| [ReadByte](./readbyte/)() override | Membaca satu byte dari aliran dan mengembalikan nilai integer 32-bit yang setara dengan nilai byte yang dibaca. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Mengatur posisi aliran yang diwakili oleh objek saat ini. |
| [set_Capacity](./set_capacity/)(int) | Mengatur kapasitas buffer memori yang mendasari. |
| [set_Position](./set_position/)(int64_t) override | Mengatur posisi aliran. |
| [SetLength](./setlength/)(int64_t) override | Mengatur panjang aliran yang diwakili oleh objek saat ini. |
| virtual [ToArray](./toarray/)() | Mengembalikan salinan buffer memori yang mendasari sebagai array byte. |
| [TryGetBuffer](./trygetbuffer/)(ArraySegment\<uint8_t\>\&) | Mengembalikan array byte tak bertanda dari mana aliran ini dibuat. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran. |
| [WriteByte](./writebyte/)(uint8_t) override | Menulis nilai integer tak bertanda 8-bit yang ditentukan ke aliran. |
| virtual [WriteTo](./writeto/)(SharedPtr\<Stream\>) | Menulis konten buffer yang mendasari ke aliran yang ditentukan. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Null](../stream/null/) | Aliran tanpa penyimpanan dasar. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke dirinya sendiri. |
## Lihat Juga

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
