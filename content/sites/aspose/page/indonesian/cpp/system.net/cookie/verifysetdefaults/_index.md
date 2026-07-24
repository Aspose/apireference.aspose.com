---
title: "System::Net::Cookie::VerifySetDefaults method"
linktitle: "VerifySetDefaults"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Net::Cookie::VerifySetDefaults. Memverifikasi dan mengatur nilai atribut default dalam C++."
type: docs
weight: 4200
url: /id/cpp/system.net/cookie/verifysetdefaults/
---
## Cookie::VerifySetDefaults method


Memverifikasi dan mengatur nilai atribut default.

```cpp
bool System::Net::Cookie::VerifySetDefaults(CookieVariant variant, System::SharedPtr<Uri> uri, bool isLocalDomain, String localDomain, bool setDefault, bool shouldThrow)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| varian | CookieVariant | Spesifikasi cookie. |
| uri | System::SharedPtr\<Uri\> | Instansi kelas Uri yang digunakan untuk menginisialisasi bidang internal. |
| isLocalDomain | bool | Nilai yang menunjukkan apakah cookie dimasukkan ke dalam domain lokal. |
| localDomain | String | Nama domain lokal. |
| setDefault | bool | Nilai yang menunjukkan apakah atribut cookie harus diinisialisasi menggunakan nilai default mereka. |
| shouldThrow | bool | Nilai yang menunjukkan apakah pengecualian harus dilempar ketika nilai yang ditentukan tidak valid. |

### ReturnValue

Benar ketika semua nilai valid, jika tidak maka salah.

## Lihat Juga

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
