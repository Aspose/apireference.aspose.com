---
title: "Kelas System::Security::Cryptography::CryptoStream"
linktitle: "CryptoStream"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Security::Cryptography::CryptoStream. Implementasi stream yang membungkus stream yang ada dengan fungsi kriptografi. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 500
url: /id/cpp/system.security.cryptography/cryptostream/
---
## CryptoStream class


Implementasi stream yang membungkus stream yang ada dengan fungsi kriptografi. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class CryptoStream : public System::IO::Stream
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Close](./close/)() override | Menutup koneksi. |
| [CryptoStream](./cryptostream/)(const SharedPtr\<System::IO::Stream\>\&, const SharedPtr\<ICryptoTransform\>\&, CryptoStreamMode) | Konstruktor. |
| [Flush](./flush/)() override | Mengosongkan buffer ke dalam stream yang dibungkus. Tidak melakukan apa-apa karena algoritma transformasi masih dapat menunggu data lebih lanjut. |
| [FlushFinalBlock](./flushfinalblock/)() | Menulis data yang masih berada di buffer ke stream. |
| [get_CanRead](./get_canread/)() const override | Memeriksa apakah stream dapat dibaca. |
| [get_CanSeek](./get_canseek/)() const override | Memeriksa apakah stream dapat di-seek. |
| [get_CanWrite](./get_canwrite/)() const override | Memeriksa apakah stream dapat ditulis. |
| [get_Length](./get_length/)() const override | Mengambil panjang stream. Tidak didukung. |
| [get_Position](./get_position/)() const override | Mengambil posisi saat ini dalam stream. Tidak didukung. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Membaca data dari stream. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Membaca data dari stream. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Mencari posisi dalam stream. Tidak didukung. |
| [set_Position](./set_position/)(int64_t) override | Mencari posisi dalam stream. Tidak didukung. |
| [SetLength](./setlength/)(int64_t) override | Mencari ukuran stream. Tidak didukung. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Menulis data ke stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Menulis data ke stream. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Aliran tanpa penyimpanan dasar. |
## Lihat Juga

* Class [Stream](../../system.io/stream/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
