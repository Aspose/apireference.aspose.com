---
title: "Kelas System::Net::Sockets::NetworkStream"
linktitle: "NetworkStream"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::Sockets::NetworkStream. Menyediakan aliran dasar data untuk akses jaringan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 300
url: /id/cpp/system.net.sockets/networkstream/
---
## NetworkStream class


Menyediakan aliran dasar data untuk akses jaringan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class NetworkStream : public System::IO::Stream
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Memulai operasi baca asynchronous. |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Memulai operasi tulis asynchronous. |
| [Close](./close/)(int) | Menutup instance saat ini setelah waktu yang ditentukan habis. |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | Menunggu hingga operasi baca asynchronous yang ditentukan selesai. |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | Mengakhiri operasi tulis asynchronous. Menunggu hingga operasi tulis asynchronous yang ditentukan selesai. |
| [Flush](./flush/)() override | Membersihkan buffer aliran ini dan menulis semua data yang di-buffer ke penyimpanan dasar. |
| [get_CanRead](./get_canread/)() const override | Informasi RTTI. |
| [get_CanSeek](./get_canseek/)() const override | Menentukan apakah aliran mendukung pencarian. |
| [get_CanTimeout](./get_cantimeout/)() const override | Mendapatkan nilai yang menentukan apakah aliran saat ini dapat mengalami timeout. |
| [get_CanWrite](./get_canwrite/)() const override | Menentukan apakah aliran dapat ditulis. |
| [get_DataAvailable](./get_dataavailable/)() const | Mengembalikan nilai yang menunjukkan apakah ada data yang tersedia untuk dibaca. |
| [get_Length](./get_length/)() const override | Mengembalikan panjang aliran dalam byte. |
| [get_Position](./get_position/)() const override | Mengembalikan posisi saat ini dari aliran. |
| [get_ReadTimeout](./get_readtimeout/)() const override | Mendapatkan nilai, dalam milidetik, yang menentukan berapa lama aliran akan mencoba membaca sebelum timeout. |
| [get_Socket](./get_socket/)() | Mendapatkan [Socket](../socket/) dasar. |
| [get_WriteTimeout](./get_writetimeout/)() const override | Mendapatkan nilai, dalam milidetik, yang menentukan berapa lama aliran akan mencoba menulis sebelum waktu habis. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>) | Membuat instance baru. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, System::IO::FileAccess, bool) | Membuat instance baru. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, bool) | Membuat instance baru. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Mengatur posisi aliran yang diwakili oleh objek saat ini. |
| [set_Position](./set_position/)(int64_t) override | Mengatur posisi aliran. |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | Mengatur nilai yang menentukan apakah aliran saat ini dapat mengalami batas waktu. |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | Mengatur nilai, dalam milidetik, yang menentukan berapa lama aliran akan mencoba membaca sebelum waktu habis. |
| [SetLength](./setlength/)(int64_t) override | Mengatur panjang aliran yang diwakili oleh objek saat ini. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran. |
| virtual [~NetworkStream](./~networkstream/)() | Menghancurkan instance saat ini. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Aliran tanpa penyimpanan dasar. |
## Lihat Juga

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
