---
title: "System::Net::Cookie kelas"
linktitle: "Cookie"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Cookie kelas. Mewakili cookie HTTP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.net/cookie/
---
## Cookie class


Mewakili cookie HTTP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class Cookie : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() | Membuat salinan dari instance saat ini. |
| [Cookie](./cookie/)() | Membuat instance baru. |
| [Cookie](./cookie/)(String, String) | Membuat instance baru. |
| [Cookie](./cookie/)(String, String, String) | Membuat instance baru. |
| [Cookie](./cookie/)(String, String, String, String) | Membuat instance baru. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| [get_Comment](./get_comment/)() const | Mendapatkan nilai atribut 'Comment'. |
| [get_CommentUri](./get_commenturi/)() const | Mendapatkan nilai atribut 'CommentURL'. |
| [get_Discard](./get_discard/)() const | Mendapatkan nilai atribut 'Discard'. |
| [get_Domain](./get_domain/)() const | Mendapatkan nilai atribut 'Domain'. |
| [get_DomainImplicit](./get_domainimplicit/)() | Mendapatkan nilai yang menunjukkan apakah domain bersifat implisit. |
| [get_DomainKey](./get_domainkey/)() const | Mengembalikan kunci domain. |
| [get_Expired](./get_expired/)() | Mendapatkan nilai yang menunjukkan apakah cookie telah kedaluwarsa. |
| [get_Expires](./get_expires/)() | Mendapatkan nilai atribut 'Expires'. |
| [get_HttpOnly](./get_httponly/)() const | Mendapatkan nilai atribut 'HttpOnly'. |
| [get_Name](./get_name/)() const | Mendapatkan nama cookie. |
| [get_Path](./get_path/)() const | Mendapatkan nilai atribut 'Path'. |
| [get_Plain](./get_plain/)() const | Mengembalikan nilai yang menunjukkan apakah spesifikasi cookie adalah 'Plain'. |
| [get_Port](./get_port/)() const | Mendapatkan nilai atribut 'Port'. |
| [get_PortList](./get_portlist/)() const | Mengembalikan koleksi nilai atribut 'Port'. |
| [get_Secure](./get_secure/)() const | Mendapatkan nilai atribut 'Secure'. |
| [get_TimeStamp](./get_timestamp/)() const | Mengembalikan waktu saat cookie dibuat. |
| [get_Value](./get_value/)() const | Mendapatkan nilai cookie's'value. |
| [get_Variant](./get_variant/)() const | Mendapatkan spesifikasi cookie. |
| [get_Version](./get_version/)() const | Mendapatkan nilai atribut '[Version](../../system/version/)' |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| [InternalSetName](./internalsetname/)(String) | Metode ini dipanggil oleh metode lain untuk mengatur nama metode. |
| [set_Comment](./set_comment/)(String) | Mengatur nilai atribut 'Comment'. |
| [set_CommentUri](./set_commenturi/)(System::SharedPtr\<Uri\>) | Mengatur nilai atribut 'CommentURL'. |
| [set_Discard](./set_discard/)(bool) | Mengatur nilai atribut 'Discard'. |
| [set_Domain](./set_domain/)(String) | Mengatur nilai atribut 'Domain'. |
| [set_DomainImplicit](./set_domainimplicit/)(bool) | Mengatur nilai yang menunjukkan apakah domain bersifat implisit. |
| [set_Expired](./set_expired/)(bool) | Mengatur nilai yang menunjukkan apakah cookie telah kedaluwarsa. |
| [set_Expires](./set_expires/)(DateTime) | Mengatur nilai atribut 'Expires'. |
| [set_HttpOnly](./set_httponly/)(bool) | Mengatur nilai atribut 'HttpOnly'. |
| [set_Name](./set_name/)(String) | Mengatur nama cookie. |
| [set_Path](./set_path/)(String) | Mengatur nilai atribut 'Path'. |
| [set_Port](./set_port/)(String) | Mengatur nilai atribut 'Port'. |
| [set_Secure](./set_secure/)(bool) | Mengatur nilai atribut 'Secure'. |
| [set_Value](./set_value/)(String) | Mengatur nilai cookie. |
| [set_Variant](./set_variant/)(CookieVariant) | Mengatur spesifikasi cookie. |
| [set_Version](./set_version/)(int32_t) | Mengatur nilai atribut '[Version](../../system/version/)' |
| [ToServerString](./toserverstring/)() | Menyerialkan instance saat ini ke representasi string. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| [VerifySetDefaults](./verifysetdefaults/)(CookieVariant, System::SharedPtr\<Uri\>, bool, String, bool, bool) | Memverifikasi dan mengatur nilai atribut default. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [CommentAttributeName](./commentattributename/) | Nama atribut 'Comment'. |
| static [CommentUrlAttributeName](./commenturlattributename/) | Nama atribut 'CommentURL'. |
| static [DiscardAttributeName](./discardattributename/) | Nama atribut 'Discard'. |
| static [DomainAttributeName](./domainattributename/) | Nama atribut 'Domain'. |
| static [EqualsLiteral](./equalsliteral/) | Pemisah yang digunakan untuk memisahkan nama dan nilai sebuah atribut. |
| static [ExpiresAttributeName](./expiresattributename/) | Nama atribut 'Expires'. |
| static [HttpOnlyAttributeName](./httponlyattributename/) | Nama atribut 'HttpOnly'. |
| static [MaxAgeAttributeName](./maxageattributename/) | Nama atribut 'Max-Age'. |
| static [MaxSupportedVersion](./maxsupportedversion/) | Informasi RTTI. |
| static [MaxSupportedVersionString](./maxsupportedversionstring/) | Representasi string dari versi maksimum yang didukung. |
| static [PathAttributeName](./pathattributename/) | Nama atribut 'Path'. |
| static [PortAttributeName](./portattributename/) | Nama atribut 'Port'. |
| static [PortSplitDelimiters](./portsplitdelimiters/) | Array yang berisi pemisah untuk nilai atribut 'Port'. |
| static [QuotesLiteral](./quotesliteral/) | Simbol yang digunakan untuk membungkus bagian-bagian atribut. |
| static [ReservedToName](./reservedtoname/) | Nilai yang dipesan untuk nama cookie. |
| static [ReservedToValue](./reservedtovalue/) | Nilai yang dipesan untuk nilai cookie. |
| static [SecureAttributeName](./secureattributename/) | Nama atribut 'Secure'. |
| static [SeparatorLiteral](./separatorliteral/) | Pemisah atribut. |
| static [SpecialAttributeLiteral](./specialattributeliteral/) | Awalan nama atribut khusus. |
| static [VersionAttributeName](./versionattributename/) | Nama atribut '[Version](../../system/version/)' |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
