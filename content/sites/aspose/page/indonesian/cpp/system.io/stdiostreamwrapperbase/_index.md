---
title: "Kelas System::IO::STDIOStreamWrapperBase"
linktitle: "STDIOStreamWrapperBase"
second_title: "Aspose.Page untuk C++"
description: "System::IO::STDIOStreamWrapperBase class. Mewakili kelas dasar untuk pembungkus mirip System.IO.Stream. Objek dari kelas ini hanya boleh dialokasikan menggunakan System::MakeObject() function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam System::SmartPtr pointer dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2000
url: /id/cpp/system.io/stdiostreamwrapperbase/
---
## STDIOStreamWrapperBase class


Mewakili kelas dasar untuk pembungkus mirip [System.IO.Stream](../stream/). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
template<typename T,typename>class STDIOStreamWrapperBase : public System::IO::Stream
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_CanRead](./get_canread/)() const override | Menentukan apakah aliran mendukung pembacaan. |
| [get_CanSeek](./get_canseek/)() const override | Menentukan apakah aliran mendukung pencarian. |
| [get_CanWrite](./get_canwrite/)() const override | Menentukan apakah aliran mendukung penulisan. |
| [get_Length](./get_length/)() const override | Mengembalikan panjang aliran. |
| [get_Position](./get_position/)() const override | Mengembalikan posisi saat ini dari aliran. |
| [operator=](./operator=/)(const STDIOStreamWrapperBase\&) | Operator penugasan penyalin. Dihapus. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Mengatur posisi aliran yang diwakili oleh objek saat ini. |
| [set_Position](./set_position/)(int64_t) override | Mengatur posisi aliran. |
| [STDIOStreamWrapperBase](./stdiostreamwrapperbase/)(const STDIOStreamWrapperBase\&) | Konstruktor penyalin. Dihapus. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Null](../stream/null/) | Aliran tanpa penyimpanan dasar. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | Informasi RTTI. |
| [int_type](./int_type/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Lihat Juga

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
