---
title: "System::IO::FileStream kelas"
linktitle: "FileStream"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::IO::FileStream. Mewakili aliran file yang mendukung operasi baca dan tulis sinkron serta asinkron. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1500
url: /id/cpp/system.io/filestream/
---
## FileStream class


Mewakili aliran file yang mendukung operasi baca dan tulis sinkron serta asinkron. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class FileStream : public System::IO::Stream
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Close](./close/)() override | Menutup objek [FileStream](./) saat ini. |
| [FileStream](./filestream/)(const String\&, FileMode) | Membuat instance baru dari kelas [FileStream](./) dan menginisialisasinya dengan parameter yang ditentukan. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) | Membuat instance baru dari kelas [FileStream](./) dan menginisialisasinya dengan parameter yang ditentukan. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) | Membuat instance baru dari kelas [FileStream](./) dan menginisialisasinya dengan parameter yang ditentukan. |
| [FileStream](./filestream/)(const FileStream\&) |  |
| [Flush](./flush/)() override | Membersihkan buffer aliran ini dan menulis semua data yang di-buffer ke file yang mendasarinya. |
| [Flush](./flush/)(bool) | Membersihkan buffer aliran ini dan menulis semua data yang di-buffer ke file yang mendasarinya. Sinonim untuk metode [Flush()](./flush/). |
| [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) override | Secara asinkron membersihkan semua buffer untuk aliran ini, menyebabkan data yang di-buffer ditulis ke perangkat dasar, dan memantau permintaan pembatalan. |
| [get_CanRead](./get_canread/)() const override | Menentukan apakah aliran dapat dibaca. |
| [get_CanSeek](./get_canseek/)() const override | Menentukan apakah aliran mendukung pencarian. |
| [get_CanWrite](./get_canwrite/)() const override | Menentukan apakah aliran dapat ditulis. |
| [get_Length](./get_length/)() const override | Mengembalikan panjang aliran dalam byte. |
| [get_Name](./get_name/)() const | Mengembalikan nama file yang dibungkus oleh objek [FileStream](./) saat ini. |
| [get_Position](./get_position/)() const override | Mengembalikan posisi saat ini dari aliran. |
| [operator=](./operator=/)(const FileStream\&) |  |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | Secara asinkron membaca urutan byte dari aliran saat ini, memajukan posisi dalam aliran sebesar jumlah byte yang dibaca, dan memantau permintaan pembatalan. |
| [ReadByte](./readbyte/)() override | Membaca satu byte dari aliran dan mengembalikan nilai integer 32-bit yang setara dengan nilai byte yang dibaca. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Mengatur posisi aliran yang diwakili oleh objek saat ini. |
| [set_Position](./set_position/)(int64_t) override | Melakukan flush pada aliran dan kemudian mengatur posisi aliran. |
| [SetLength](./setlength/)(int64_t) override | Mengatur panjang aliran yang diwakili oleh objek saat ini. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | Secara asinkron menulis urutan byte ke aliran saat ini, memajukan posisi saat ini dalam aliran ini sebesar jumlah byte yang ditulis, dan memantau permintaan pembatalan. |
| [WriteByte](./writebyte/)(uint8_t) override | Menulis nilai integer tak bertanda 8-bit yang ditentukan ke aliran. |
| [~FileStream](./~filestream/)() | Destruktor. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static constexpr [DefaultBufferSize](./defaultbuffersize/) | Nilai default dari jumlah byte yang di-buffer selama operasi baca dan tulis. |
| static [Null](../stream/null/) | Aliran tanpa penyimpanan dasar. |
## Lihat Juga

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
