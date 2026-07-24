---
title: "kelas System::IO::BasicSTDIStreamWrapper"
linktitle: "BasicSTDIStreamWrapper"
second_title: "Aspose.Page untuk C++"
description: "System::IO::BasicSTDIStreamWrapper class. Mewakili pembungkus mirip System.IO.Stream untuk std::basic_istream dan objek turunanannya. Objek kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 200
url: /id/cpp/system.io/basicstdistreamwrapper/
---
## BasicSTDIStreamWrapper class


Mewakili pembungkus mirip [System.IO.Stream](../stream/) untuk std::basic_istream dan objek turunanannya. Objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
template<typename T,typename>class BasicSTDIStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | Membuat instance baru dari [BasicSTDIStreamWrapper](./). |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(const BasicSTDIStreamWrapper\&) | Konstruktor penyalin. Dihapus. |
| [Flush](./flush/)() override | Mengosongkan buffer aliran ini dan menulis semua data yang di-buffer ke penyimpanan dasar. Tidak didukung! |
| [operator=](./operator=/)(const BasicSTDIStreamWrapper\&) | Operator penugasan penyalin. Dihapus. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Jika mode pembungkus adalah biner, membaca jumlah byte yang ditentukan dari aliran, jika tidak membaca jumlah karakter yang ditentukan dan mengonversinya ke tipe uint8_t. Menulis hasil pembacaan ke array byte yang ditentukan. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan. |
| [ReadByte](./readbyte/)() override | Jika mode pembungkus adalah biner, membaca satu byte dari penyimpanan karakter terdekripsi terakhir, jika tidak membaca satu karakter dari aliran dan mengonversinya ke tipe uint8_t. |
| [SetLength](./setlength/)(int64_t) override | Mengatur panjang aliran yang diwakili oleh objek saat ini. Tidak didukung! |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Jika mode pembungkus adalah biner, menulis ke aliran subrentang byte yang ditentukan dari array byte yang diberikan, jika tidak mengonversi subrentang byte yang ditentukan dari array byte yang diberikan ke tipe [char_type](./char_type/) dan kemudian menulis hasilnya ke aliran. Tidak didukung! |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran. |
| [WriteByte](./writebyte/)(uint8_t) override | Jika mode pembungkus adalah biner, menulis ke aliran nilai integer tak bertanda 8-bit yang ditentukan, jika tidak mengonversinya ke tipe [char_type](./char_type/) dan kemudian menulis hasilnya ke aliran. Tidak didukung! |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Null](../stream/null/) | Aliran tanpa penyimpanan dasar. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | Informasi RTTI. |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Lihat Juga

* Class [STDIOStreamWrapperBase](../stdiostreamwrapperbase/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
