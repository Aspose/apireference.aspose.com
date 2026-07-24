---
title: "System::Net::Http::Headers::AuthenticationHeaderValue kelas"
linktitle: "AuthenticationHeaderValue"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::AuthenticationHeaderValue kelas. Mewakili nilai-nilai header ''Authorization'', ''ProxyAuthorization'', ''WWW-Authenticate'', dan ''Proxy-Authenticate''. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.net.http.headers/authenticationheadervalue/
---
## AuthenticationHeaderValue class


Mewakili nilai-nilai header 'Authorization', 'ProxyAuthorization', 'WWW-Authenticate', dan 'Proxy-Authenticate'. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class AuthenticationHeaderValue : public System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String) | Konstruktor. |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String, String) | Konstruktor. |
| [Clone](./clone/)() override | Informasi RTTI. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| [get_Parameter](./get_parameter/)() | Mendapatkan kredensial yang berisi informasi autentikasi. |
| [get_Scheme](./get_scheme/)() | Informasi RTTI. |
| static [GetAuthenticationLength](./getauthenticationlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Menganalisis string yang ditentukan dan mengembalikan indeks terakhir dari representasi string. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| static [Parse](./parse/)(String) | Mengonversi string yang diberikan menjadi instance dari kelas [AuthenticationHeaderValue](./). |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<AuthenticationHeaderValue\>\&) | Mencoba mengonversi string yang diberikan menjadi instance dari kelas [AuthenticationHeaderValue](./). |
## Lihat Juga

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
