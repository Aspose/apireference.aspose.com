---
title: "Kelas System::Uri"
linktitle: "Uri"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Uri. Pengidentifikasi sumber daya terpadu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen di C++."
type: docs
weight: 6700
url: /id/cpp/system/uri/
---
## Uri class


Pengidentifikasi sumber daya terpadu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class Uri : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [CheckHostName](./checkhostname/)(String) | Menentukan tipe nama host yang ditentukan. |
| static [CheckSchemeName](./checkschemename/)(const String\&) | Menentukan apakah skema yang ditentukan valid. |
| static [Compare](./compare/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, UriComponents, UriFormat, StringComparison) | Membandingkan objek [Uri](./) yang ditentukan menggunakan aturan perbandingan yang ditentukan. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Menentukan apakah URI yang direpresentasikan oleh objek saat ini dan objek yang ditentukan sama. |
| static [EscapeDataString](./escapedatastring/)(const String\&) | Mengonversi string menjadi representasi yang di-escape. |
| static [EscapeUriString](./escapeuristring/)(const String\&) | Mengonversi string URI menjadi representasi yang di-escape. |
| static [FromHex](./fromhex/)(char16_t) | Mendapatkan nilai desimal dari digit heksadesimal. |
| [get_AbsolutePath](./get_absolutepath/)() const | Mengembalikan jalur absolut dari URI. |
| [get_AbsoluteUri](./get_absoluteuri/)() const | Mengembalikan URI absolut. |
| [get_Authority](./get_authority/)() const | Mengembalikan nama host dan nomor port untuk server. |
| [get_DnsSafeHost](./get_dnssafehost/)() const | Mengembalikan nama host yang tidak di-escape. |
| [get_Fragment](./get_fragment/)() const | Mengembalikan fragmen URI yang di-escape. |
| [get_Host](./get_host/)() const | Mengembalikan nama host. |
| [get_HostNameType](./get_hostnametype/)() const | Mengembalikan tipe nama host. |
| [get_IdnHost](./get_idnhost/)() const | Mengembalikan International Domain Name dari host. |
| [get_IsAbsoluteUri](./get_isabsoluteuri/)() const | Menentukan apakah URI yang diwakili oleh objek saat ini bersifat absolut. |
| [get_IsDefaultPort](./get_isdefaultport/)() const | Menentukan apakah URI yang diwakili oleh objek saat ini memiliki port default untuk skema URI. |
| [get_IsFile](./get_isfile/)() const | Menentukan apakah URI yang diwakili oleh objek saat ini adalah file. |
| [get_IsLoopback](./get_isloopback/)() const | Menentukan apakah URI yang diwakili oleh objek saat ini merujuk ke host lokal. |
| [get_IsUnc](./get_isunc/)() const | Menentukan apakah URI yang diwakili oleh objek saat ini adalah jalur UNC. |
| [get_LocalPath](./get_localpath/)() const | Mengembalikan representasi sistem operasi dari nama file yang dirujuk oleh URI yang diwakili oleh objek saat ini. |
| [get_OriginalString](./get_originalstring/)() const | Mengembalikan string URI yang diberikan ke konstruktor ketika objek saat ini dibuat. |
| [get_PathAndQuery](./get_pathandquery/)() const | Mengembalikan jalur absolut dan komponen kueri dari URI yang diwakili oleh objek saat ini yang dipisahkan oleh tanda tanya (?). |
| [get_Port](./get_port/)() const | Mengembalikan nomor port dari URI yang diwakili oleh objek saat ini. |
| [get_Query](./get_query/)() const | Mengembalikan informasi kueri yang termasuk dalam URI yang diwakili oleh objek saat ini. |
| [get_Scheme](./get_scheme/)() const | Mengembalikan skema dari URI yang diwakili oleh objek saat ini. |
| [get_Segments](./get_segments/)() const | Mengembalikan array string yang berisi segmen jalur dari URI yang diwakili oleh objek saat ini. |
| [get_UserEscaped](./get_userescaped/)() const | Menentukan apakah string URI yang diberikan ke konstruktor objek saat ini telah sepenuhnya di-escape. |
| [get_UserInfo](./get_userinfo/)() const | Mengembalikan nama pengguna, kata sandi, dan informasi pengguna lainnya yang terkait dengan URI yang diwakili oleh objek saat ini. |
| [GetComponents](./getcomponents/)(UriComponents, UriFormat) const | Mengembalikan komponen yang ditentukan dari URI yang diwakili oleh objek saat ini menggunakan escape yang ditentukan. |
| [GetHashCode](./gethashcode/)() const override | Mendapatkan kode hash untuk URI. |
| [GetLeftPart](./getleftpart/)(UriPartial) | Mengembalikan bagian yang ditentukan dari URI yang diwakili oleh objek saat ini. |
| static [HexEscape](./hexescape/)(char16_t) | Mengembalikan ekuivalen heksadesimal dari karakter yang ditentukan. |
| static [HexUnescape](./hexunescape/)(const String\&, int32_t\&) | Mengonversi representasi heksadesimal yang ditentukan dari sebuah karakter menjadi karakter. |
| [IsBaseOf](./isbaseof/)(const SharedPtr\<Uri\>\&) const | Menentukan apakah URI yang diwakili oleh objek [Uri](./) saat ini merupakan basis dari URI yang diwakili oleh objek [Uri](./) yang ditentukan. |
| static [IsHexDigit](./ishexdigit/)(char16_t) | Menentukan apakah karakter yang ditentukan merupakan digit heksadesimal yang valid. |
| static [IsHexEncoding](./ishexencoding/)(const String\&, int32_t) | Menentukan apakah karakter dalam string yang ditentukan pada posisi yang ditentukan dienkode secara heksadesimal. |
| [IsWellFormedOriginalString](./iswellformedoriginalstring/)() const | Menunjukkan apakah string yang digunakan untuk membuat [Uri](./) ini terbentuk dengan baik dan tidak perlu di-escape lebih lanjut. |
| static [IsWellFormedUriString](./iswellformeduristring/)(const String\&, UriKind) | Menentukan apakah string yang ditentukan merupakan URI yang terbentuk dengan baik. |
| [MakeRelative](./makerelative/)(const SharedPtr\<Uri\>\&) | Menentukan perbedaan antara dua instance [Uri](./). |
| [MakeRelativeUri](./makerelativeuri/)(const SharedPtr\<Uri\>\&) | Menentukan perbedaan antara URI yang diwakili oleh objek [Uri](./) saat ini dan objek yang ditentukan. |
| [ToString](./tostring/)() const override | Mengembalikan representasi string dari URI yang diwakili oleh objek saat ini. |
| static [TryCreate](./trycreate/)(const String\&, UriKind, SharedPtr\<Uri\>\&) | Membangun objek [Uri](./) yang mewakili URI yang ditentukan; sebuah argumen menentukan jenis URI. |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) | Membangun sebuah [Uri](./) objek dari objek [Uri](./) yang ditentukan yang mewakili URI dasar dan representasi string dari URI relatif. |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) | Membangun sebuah [Uri](./) objek dari URI dasar dan relatif yang ditentukan. |
| static [UnescapeDataString](./unescapedatastring/)(const String\&) | Membuka escape pada string yang di-escape yang ditentukan. |
| [Uri](./uri/)(const String\&) | Membangun objek [Uri](./) yang mewakili URI yang ditentukan. |
| [Uri](./uri/)(const String\&, bool) | Membangun objek [Uri](./) yang mewakili URI yang ditentukan; sebuah argumen menentukan apakah URI harus di-escape. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&, bool) | Membangun sebuah [Uri](./) objek dari objek [Uri](./) yang ditentukan yang mewakili URI dasar dan representasi string dari URI relatif; sebuah argumen menentukan apakah URI harus di-escape. |
| [Uri](./uri/)(const String\&, UriKind) | Membangun objek [Uri](./) yang mewakili URI yang ditentukan; sebuah argumen menentukan jenis URI. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&) | Membangun sebuah [Uri](./) objek dari URI dasar dan relatif yang ditentukan. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) | Membangun sebuah [Uri](./) objek dari URI dasar dan relatif yang ditentukan. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [SchemeDelimiter](./schemedelimiter/) | Menentukan karakter yang memisahkan skema protokol komunikasi dari bagian alamat [Uri](./). |
| static [UriSchemeFile](./urischemefile/) | Menentukan bahwa [Uri](./) adalah penunjuk ke sebuah file. |
| static [UriSchemeFtp](./urischemeftp/) | Menentukan bahwa [Uri](./) diakses melalui File Transfer Protocol. |
| static [UriSchemeGopher](./urischemegopher/) | Menentukan bahwa [Uri](./) diakses melalui protokol Gopher. |
| static [UriSchemeHttp](./urischemehttp/) | Menentukan bahwa [Uri](./) diakses melalui Hypertext Transfer Protocol. |
| static [UriSchemeHttps](./urischemehttps/) | Menentukan bahwa [Uri](./) diakses melalui Secure Hypertext Transfer Protocol. |
| static [UriSchemeMailto](./urischememailto/) | Menentukan bahwa [Uri](./) adalah alamat email dan diakses melalui Simple Mail Transport Protocol. |
| static [UriSchemeNetPipe](./urischemenetpipe/) | Menentukan bahwa [Uri](./) diakses melalui skema NetPipe yang digunakan oleh [Windows](../../system.windows/) Communication Foundation. |
| static [UriSchemeNetTcp](./urischemenettcp/) | Menentukan bahwa [Uri](./) diakses melalui skema NetTcp yang digunakan oleh [Windows](../../system.windows/) Communication Foundation. |
| static [UriSchemeNews](./urischemenews/) | Menentukan bahwa [Uri](./) adalah grup berita Internet dan diakses melalui Network News Transport Protocol. |
| static [UriSchemeNntp](./urischemenntp/) | Menentukan bahwa [Uri](./) adalah grup berita Internet dan diakses melalui Network News Transport Protocol. |
## Catatan



```cpp
#include "system/smart_ptr.h"
#include "system/uri.h"
#include <iostream>

int main()
{
  const auto uri = System::MakeObject<System::Uri>(u"https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/");

std::cout <<
  "AbsolutePath: " << uri->get_AbsolutePath() << std::endl <<
  "AbsoluteUri: " << uri->get_AbsoluteUri() << std::endl <<
  "Authority: " << uri->get_Authority() << std::endl <<
  "DnsSafeHost: " << uri->get_DnsSafeHost() << std::endl <<
  "Fragment: " << uri->get_Fragment() << std::endl <<
  "Host: " << uri->get_Host() << std::endl <<
  "IdnHost: " << uri->get_IdnHost() << std::endl <<
  "LocalPath: " << uri->get_LocalPath() << std::endl <<
  "OriginalString: " << uri->get_OriginalString() << std::endl <<
  "PathAndQuery: " << uri->get_PathAndQuery() << std::endl <<
  "Port: " << uri->get_Port() << std::endl <<
  "Query: " << uri->get_Query() << std::endl <<
  "Scheme: " << uri->get_Scheme() << std::endl;

  return 0;
}
/*
This code example produces the following output:
AbsolutePath: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
AbsoluteUri: https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
Authority: docs.codeporting.com
DnsSafeHost: docs.codeporting.com
Fragment:
Host: docs.codeporting.com
IdnHost: docs.codeporting.com
LocalPath: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
OriginalString: https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
PathAndQuery: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
Port: 443
Query:
Scheme: https
*/
```

## Lihat Juga

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
