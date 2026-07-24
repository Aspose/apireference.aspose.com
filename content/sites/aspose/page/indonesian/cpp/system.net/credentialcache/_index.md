---
title: "Kelas System::Net::CredentialCache"
linktitle: "CredentialCache"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::CredentialCache. Menyediakan penyimpanan kredensial. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 600
url: /id/cpp/system.net/credentialcache/
---
## CredentialCache class


Menyediakan penyimpanan kredensial. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class CredentialCache : public System::Net::ICredentials,
                        public System::Net::ICredentialsByHost
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) | Menambahkan kredensial jaringan yang ditentukan ke dalam cache. |
| [Add](./add/)(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) | Menambahkan kredensial jaringan yang ditentukan ke dalam cache. |
| [CredentialCache](./credentialcache/)() | Membuat instance baru. |
| static [get_DefaultCredentials](./get_defaultcredentials/)() | Informasi RTTI. |
| static [get_DefaultNetworkCredentials](./get_defaultnetworkcredentials/)() | Mengembalikan kredensial jaringan dari pengguna atau aplikasi saat ini. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | Mengembalikan kredensial untuk awalan URI dan tipe autentikasi yang ditentukan. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | Mengembalikan kredensial untuk nama host, port, dan tipe otentikasi yang ditentukan. |
| [Remove](./remove/)(System::SharedPtr\<Uri\>, String) | Menghapus kredensial jaringan untuk awalan URI dan tipe autentikasi yang ditentukan. |
| [Remove](./remove/)(String, int32_t, String) | Menghapus kredensial jaringan untuk nama host, port, dan tipe autentikasi yang ditentukan. |
## Lihat Juga

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
