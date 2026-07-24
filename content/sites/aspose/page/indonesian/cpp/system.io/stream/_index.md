---
title: "System::IO::Stream class"
linktitle: "Stream"
second_title: "Aspose.Page untuk C++"
description: "System::IO::Stream class. Kelas dasar untuk berbagai implementasi aliran. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2100
url: /id/cpp/system.io/stream/
---
## Stream class


Kelas dasar untuk berbagai implementasi aliran. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class Stream : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | Memulai operasi baca asynchronous. |
| virtual [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | Memulai operasi tulis asynchronous. |
| virtual [Close](./close/)() | Menutup aliran. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&) | Menyalin byte ke aliran yang ditentukan. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&, int32_t) | Menyalin byte ke aliran yang ditentukan, menggunakan ukuran buffer yang ditentukan. |
| [Dispose](./dispose/)() override | Melepaskan semua sumber daya yang digunakan oleh objek saat ini dan menutup aliran. |
| virtual [EndRead](./endread/)(System::SharedPtr\<System::IAsyncResult\>) | Menunggu hingga operasi baca asynchronous yang ditentukan selesai. |
| virtual [EndWrite](./endwrite/)(System::SharedPtr\<System::IAsyncResult\>) | Mengakhiri operasi tulis asynchronous. Menunggu hingga operasi tulis asynchronous yang ditentukan selesai. |
| virtual [Flush](./flush/)() | Membersihkan buffer aliran ini dan menulis semua data yang di-buffer ke penyimpanan dasar. |
| virtual [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) | Secara asinkron membersihkan semua buffer untuk aliran ini, menyebabkan data yang di-buffer ditulis ke perangkat dasar, dan memantau permintaan pembatalan. |
| [FlushAsync](./flushasync/)() | Secara asinkron membersihkan semua buffer untuk aliran ini, menyebabkan data yang di-buffer ditulis ke perangkat dasar, dan memantau permintaan pembatalan. |
| virtual [get_CanRead](./get_canread/)() const | Menentukan apakah aliran dapat dibaca. |
| virtual [get_CanSeek](./get_canseek/)() const | Menentukan apakah aliran mendukung pencarian. |
| virtual [get_CanTimeout](./get_cantimeout/)() const | Mendapatkan nilai yang menentukan apakah aliran saat ini dapat mengalami timeout. |
| virtual [get_CanWrite](./get_canwrite/)() const | Menentukan apakah aliran dapat ditulis. |
| virtual [get_Length](./get_length/)() const | Mengembalikan panjang aliran dalam byte. |
| virtual [get_Position](./get_position/)() const | Mengembalikan posisi saat ini dari aliran. |
| virtual [get_ReadTimeout](./get_readtimeout/)() const | Mendapatkan nilai, dalam milidetik, yang menentukan berapa lama aliran akan mencoba membaca sebelum timeout. |
| virtual [get_WriteTimeout](./get_writetimeout/)() const | Mendapatkan nilai, dalam milidetik, yang menentukan berapa lama aliran akan mencoba menulis sebelum waktu habis. |
| virtual [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan. |
| virtual [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan. |
| [Read](./read/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan. |
| virtual [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | Secara asinkron membaca urutan byte dari aliran saat ini, memajukan posisi dalam aliran sebesar jumlah byte yang dibaca, dan memantau permintaan pembatalan. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Secara asinkron membaca urutan byte dari aliran saat ini, memajukan posisi dalam aliran sebesar jumlah byte yang dibaca, dan memantau permintaan pembatalan. |
| virtual [ReadByte](./readbyte/)() | Membaca satu byte dari aliran dan mengembalikan nilai integer 32-bit yang setara dengan nilai byte yang dibaca. |
| virtual [Seek](./seek/)(int64_t, SeekOrigin) | Mengatur posisi aliran yang diwakili oleh objek saat ini. |
| virtual [set_Position](./set_position/)(int64_t) | Mengatur posisi aliran. |
| virtual [set_ReadTimeout](./set_readtimeout/)(int) | Mengatur nilai yang menentukan apakah aliran saat ini dapat mengalami batas waktu. |
| virtual [set_WriteTimeout](./set_writetimeout/)(int) | Mengatur nilai, dalam milidetik, yang menentukan berapa lama aliran akan mencoba membaca sebelum waktu habis. |
| virtual [SetLength](./setlength/)(int64_t) | Mengatur panjang aliran yang diwakili oleh objek saat ini. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran. |
| virtual [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran. |
| [Write](./write/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran. |
| virtual [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | Secara asinkron menulis urutan byte ke aliran saat ini, memajukan posisi saat ini dalam aliran ini sebesar jumlah byte yang ditulis, dan memantau permintaan pembatalan. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Secara asinkron menulis urutan byte ke aliran saat ini, memajukan posisi saat ini dalam aliran ini sebesar jumlah byte yang ditulis, dan memantau permintaan pembatalan. |
| virtual [WriteByte](./writebyte/)(uint8_t) | Menulis nilai integer tak bertanda 8-bit yang ditentukan ke aliran. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Null](./null/) | Aliran tanpa penyimpanan dasar. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke kelas ini. |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
