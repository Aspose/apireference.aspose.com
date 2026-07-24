---
title: "kelas System::IO::UnmanagedMemoryStream"
linktitle: "UnmanagedMemoryStream"
second_title: "Aspose.Page untuk C++"
description: "kelas System::IO::UnmanagedMemoryStream. Menyediakan akses ke memori yang tidak dikelola. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2800
url: /id/cpp/system.io/unmanagedmemorystream/
---
## UnmanagedMemoryStream class


Menyediakan akses ke memori yang tidak dikelola. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class UnmanagedMemoryStream : public System::IO::Stream
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Flush](./flush/)() override | Tidak melakukan apa-apa. |
| [get_CanRead](./get_canread/)() const override | Menentukan apakah aliran dapat dibaca. |
| [get_CanSeek](./get_canseek/)() const override | Menentukan apakah aliran mendukung pencarian. |
| [get_CanWrite](./get_canwrite/)() const override | Menentukan apakah aliran dapat ditulis. |
| virtual [get_Capacity](./get_capacity/)() const | Mengembalikan kapasitas saat ini dari buffer memori yang mendasarinya. |
| [get_Length](./get_length/)() const override | Mengembalikan panjang aliran dalam byte. |
| [get_Position](./get_position/)() const override | Mengembalikan posisi saat ini dari aliran. |
| [get_PositionPointer](./get_positionpointer/)() | BELUM DIIMPLEMENTASIKAN. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Mengatur posisi aliran yang diwakili oleh objek saat ini. |
| [set_Position](./set_position/)(int64_t) override | Mengatur posisi aliran. |
| [set_PositionPointer](./set_positionpointer/)(uint8_t *) | BELUM DIIMPLEMENTASIKAN. |
| [SetLength](./setlength/)(int64_t) override | BELUM DIIMPLEMENTASIKAN. |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t) | Membuat instance baru dari [UnmanagedMemoryStream](./). |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t, int64_t, FileAccess) | Membuat instance baru dari [UnmanagedMemoryStream](./). |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | BELUM DIIMPLEMENTASIKAN. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | BELUM DIIMPLEMENTASIKAN. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Null](../stream/null/) | Aliran tanpa penyimpanan dasar. |
## Lihat Juga

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
