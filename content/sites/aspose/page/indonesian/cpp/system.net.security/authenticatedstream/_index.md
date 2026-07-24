---
title: "System::Net::Security::AuthenticatedStream class"
linktitle: "AuthenticatedStream"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Security::AuthenticatedStream class. Berisi metode untuk meneruskan kredensial melalui aliran. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.net.security/authenticatedstream/
---
## AuthenticatedStream class


Berisi metode untuk meneruskan kredensial melalui aliran. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class AuthenticatedStream : public System::IO::Stream
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [get_IsAuthenticated](./get_isauthenticated/)() const | Mengembalikan nilai yang menunjukkan apakah autentikasi berhasil dilewatkan. |
| virtual [get_IsEncrypted](./get_isencrypted/)() const | Mengembalikan nilai yang menunjukkan apakah data yang dikirim menggunakan aliran ini terenkripsi. |
| virtual [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const | Mengembalikan nilai yang menunjukkan apakah server dan klien telah terautentikasi. |
| virtual [get_IsServer](./get_isserver/)() const | Mengembalikan nilai yang menunjukkan apakah sisi lokal koneksi adalah server. |
| virtual [get_IsSigned](./get_issigned/)() const | Mengembalikan nilai yang menunjukkan apakah data yang dikirim menggunakan aliran ini ditandatangani. |
| [get_LeaveInnerStreamOpen](./get_leaveinnerstreamopen/)() const | Informasi RTTI. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Aliran tanpa penyimpanan dasar. |
## Lihat Juga

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
