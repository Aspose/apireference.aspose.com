---
title: "System::Net::Security::SslStream class"
linktitle: "SslStream"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Security::SslStream class. Sebuah aliran yang menggunakan protokol SSL untuk mengautentikasi server dan secara opsional klien dalam C++."
type: docs
weight: 200
url: /id/cpp/system.net.security/sslstream/
---
## SslStream class


Aliran yang menggunakan protokol SSL untuk mengautentikasi server dan secara opsional klien.

```cpp
class SslStream : public System::Net::Security::AuthenticatedStream
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String) | Mengautentikasi sisi klien dari koneksi. |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) | Mengautentikasi sisi klien dari koneksi. |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Memulai operasi baca asynchronous. |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Memulai operasi tulis asynchronous. |
| [Close](./close/)() override | Menutup aliran. |
| [Dispose](./dispose/)(bool) override | Melepaskan semua sumber daya yang digunakan oleh objek saat ini dan menutup aliran. |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | Menunggu hingga operasi baca asynchronous yang ditentukan selesai. |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | Mengakhiri operasi tulis asynchronous. Menunggu hingga operasi tulis asynchronous yang ditentukan selesai. |
| [Flush](./flush/)() override | Membersihkan buffer aliran ini dan menulis semua data yang di-buffer ke penyimpanan dasar. |
| [get_CanRead](./get_canread/)() const override | Menentukan apakah aliran dapat dibaca. |
| [get_CanSeek](./get_canseek/)() const override | Menentukan apakah aliran mendukung pencarian. |
| [get_CanTimeout](./get_cantimeout/)() const override | Mendapatkan nilai yang menentukan apakah aliran saat ini dapat mengalami timeout. |
| [get_CanWrite](./get_canwrite/)() const override | Menentukan apakah aliran dapat ditulis. |
| virtual [get_CheckCertRevocationStatus](./get_checkcertrevocationstatus/)() | Mengembalikan nilai yang menunjukkan apakah daftar pencabutan sertifikat diperiksa selama proses validasi sertifikat. |
| virtual [get_CipherAlgorithm](./get_cipheralgorithm/)() | Mengembalikan algoritma enkripsi. |
| virtual [get_CipherStrength](./get_cipherstrength/)() | Mengembalikan kekuatan algoritma enkripsi yang digunakan. |
| virtual [get_HashAlgorithm](./get_hashalgorithm/)() | Mengembalikan algoritma hash. |
| virtual [get_HashStrength](./get_hashstrength/)() | Mengembalikan kekuatan algoritma hash yang digunakan. |
| [get_IsAuthenticated](./get_isauthenticated/)() const override | Mengembalikan nilai yang menunjukkan apakah autentikasi berhasil dilewatkan. |
| [get_IsEncrypted](./get_isencrypted/)() const override | Mengembalikan nilai yang menunjukkan apakah data yang dikirim menggunakan aliran ini terenkripsi. |
| [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const override | Mengembalikan nilai yang menunjukkan apakah server dan klien telah terautentikasi. |
| [get_IsServer](./get_isserver/)() const override | Mengembalikan nilai yang menunjukkan apakah sisi lokal koneksi adalah server. |
| [get_IsSigned](./get_issigned/)() const override | Mengembalikan nilai yang menunjukkan apakah data yang dikirim menggunakan aliran ini ditandatangani. |
| virtual [get_KeyExchangeStrength](./get_keyexchangestrength/)() | Mengembalikan kekuatan algoritma pertukaran kunci yang digunakan. |
| [get_Length](./get_length/)() const override | Mengembalikan panjang aliran dalam byte. |
| virtual [get_LocalCertificate](./get_localcertificate/)() | Mengembalikan sertifikat yang digunakan untuk mengautentikasi titik akhir lokal. |
| [get_Position](./get_position/)() const override | Mengembalikan posisi saat ini dari aliran. |
| [get_ReadTimeout](./get_readtimeout/)() const override | Mendapatkan nilai, dalam milidetik, yang menentukan berapa lama aliran akan mencoba membaca sebelum timeout. |
| virtual [get_RemoteCertificate](./get_remotecertificate/)() | Mengembalikan sertifikat yang digunakan untuk mengautentikasi titik akhir remote. |
| virtual [get_SslProtocol](./get_sslprotocol/)() | Mengembalikan protokol SSL. |
| [get_WriteTimeout](./get_writetimeout/)() const override | Mendapatkan nilai, dalam milidetik, yang menentukan berapa lama aliran akan mencoba menulis sebelum waktu habis. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Mengatur posisi aliran yang diwakili oleh objek saat ini. |
| [set_Position](./set_position/)(int64_t) override | Mengatur posisi aliran. |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | Mengatur nilai yang menentukan apakah aliran saat ini dapat mengalami batas waktu. |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | Mengatur nilai, dalam milidetik, yang menentukan berapa lama aliran akan mencoba membaca sebelum waktu habis. |
| [SetLength](./setlength/)(int64_t) override | Mengatur panjang aliran yang diwakili oleh objek saat ini. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>) | Membuat instance baru. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool) | Membuat instance baru. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) | Membuat instance baru. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) | Membuat instance baru. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) | Membuat instance baru. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&) | Menulis array byte yang ditentukan ke aliran. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&) | Menulis array byte yang ditentukan ke aliran. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Aliran tanpa penyimpanan dasar. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [AsyncResultType](./asyncresulttype/) | Informasi RTTI. |
| [StreamImplementationPtr](./streamimplementationptr/) | Tipe pointer ke implementasi. |
## Lihat Juga

* Class [AuthenticatedStream](../authenticatedstream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
