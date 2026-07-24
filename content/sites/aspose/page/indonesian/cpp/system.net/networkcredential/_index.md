---
title: "System::Net::NetworkCredential class"
linktitle: "NetworkCredential"
second_title: "Aspose.Page untuk C++"
description: "System::Net::NetworkCredential class. Menyediakan kredensial untuk skema otentikasi berbasis kata sandi. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2900
url: /id/cpp/system.net/networkcredential/
---
## NetworkCredential class


Menyediakan kredensial untuk skema otentikasi berbasis kata sandi. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class NetworkCredential : public System::Net::ICredentials,
                          public System::Net::ICredentialsByHost,
                          public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Domain](./get_domain/)() | Mendapatkan domain yang memverifikasi kredensial. |
| [get_Password](./get_password/)() | Mendapatkan kata sandi. |
| [get_UserName](./get_username/)() | Informasi RTTI. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | Mengembalikan kredensial untuk URI dan tipe otentikasi yang ditentukan. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | Mengembalikan kredensial untuk nama host, port, dan tipe otentikasi yang ditentukan. |
| [NetworkCredential](./networkcredential/)() | Membuat instance baru. |
| [NetworkCredential](./networkcredential/)(String, String) | Membuat instance baru. |
| [NetworkCredential](./networkcredential/)(String, String, String) | Membuat instance baru. |
| [set_Domain](./set_domain/)(String) | Mengatur domain yang memverifikasi kredensial. |
| [set_Password](./set_password/)(String) | Mengatur kata sandi. |
| [set_UserName](./set_username/)(String) | Mengatur nama pengguna. |
## Lihat Juga

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
