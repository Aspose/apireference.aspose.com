---
title: "Kelas System::IO::BufferedStream"
linktitle: "BufferedStream"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::IO::BufferedStream. Menambahkan lapisan buffering di atas stream lain. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.io/bufferedstream/
---
## BufferedStream class


Menambahkan lapisan buffering di atas stream lain. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class BufferedStream : public System::IO::Stream
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&) | Membuat objek [BufferedStream](./) yang membungkus stream yang ditentukan dan menggunakan buffer sepanjang 4096 byte. |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&, int) | Membuat objek [BufferedStream](./) yang membungkus stream yang ditentukan dan menggunakan buffer dengan ukuran yang ditentukan. |
| [Flush](./flush/)() override | Menulis konten buffer ke stream yang mendasarinya. |
| [get_CanRead](./get_canread/)() const override | Menentukan apakah aliran dapat dibaca. |
| [get_CanSeek](./get_canseek/)() const override | Menentukan apakah aliran mendukung pencarian. |
| [get_CanWrite](./get_canwrite/)() const override | Menentukan apakah aliran dapat ditulis. |
| [get_Length](./get_length/)() const override | Mengembalikan panjang stream. |
| [get_Position](./get_position/)() const override | Mengembalikan posisi saat ini dari aliran. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Membaca sejumlah byte yang ditentukan dari stream yang mendasarinya dan menuliskannya ke array byte yang ditentukan. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Membaca sejumlah byte yang ditentukan dari stream yang mendasarinya dan menuliskannya ke array byte yang ditentukan. |
| [ReadByte](./readbyte/)() override | Membaca satu byte dari aliran dasar dan mengembalikan nilai integer 32-bit yang setara dengan nilai byte yang dibaca. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Mengatur posisi aliran yang diwakili oleh objek saat ini. |
| [set_Position](./set_position/)(int64_t) override | Mengosongkan buffer ke aliran dasar dan kemudian mengatur posisi aliran. |
| [SetLength](./setlength/)(int64_t) override | Mengatur panjang aliran yang diwakili oleh objek saat ini. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran dasar. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran dasar. |
| [WriteByte](./writebyte/)(uint8_t) override | Menulis nilai integer tak bertanda 8-bit yang ditentukan ke aliran dasar. |
| virtual [~BufferedStream](./~bufferedstream/)() | Destruktor. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Null](../stream/null/) | Aliran tanpa penyimpanan dasar. |
## Lihat Juga

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
