---
title: "System::Uri sınıfı"
linktitle: "Uri"
second_title: "Aspose.Font için C++"
description: "System::Uri sınıfı. Birleşik kaynak tanımlayıcısı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve C++'da fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın."
type: docs
weight: 6700
url: /tr/cpp/system/uri/
---
## Uri class


Birleşik kaynak tanımlayıcısı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Uri : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [CheckHostName](./checkhostname/)(String) | Belirtilen ana bilgisayar adının türünü belirler. |
| static [CheckSchemeName](./checkschemename/)(const String\&) | Belirtilen şemanın geçerli olup olmadığını belirler. |
| static [Compare](./compare/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, UriComponents, UriFormat, StringComparison) | Belirtilen karşılaştırma kurallarını kullanarak belirtilen [Uri](./) nesnelerini karşılaştırır. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Geçerli ve belirtilen nesneler tarafından temsil edilen URI'ların eşit olup olmadığını belirler. |
| static [EscapeDataString](./escapedatastring/)(const String\&) | Bir dizeyi kaçışlı temsiline dönüştürür. |
| static [EscapeUriString](./escapeuristring/)(const String\&) | Bir URI dizesini kaçışlı temsiline dönüştürür. |
| static [FromHex](./fromhex/)(char16_t) | Bir onaltılık basamağın ondalık değerini alır. |
| [get_AbsolutePath](./get_absolutepath/)() const | URI'nin mutlak yolunu döndürür. |
| [get_AbsoluteUri](./get_absoluteuri/)() const | Mutlak URI'yı döndürür. |
| [get_Authority](./get_authority/)() const | Bir sunucu için ana bilgisayar adını ve bağlantı noktasını döndürür. |
| [get_DnsSafeHost](./get_dnssafehost/)() const | Kaçış yapılmamış bir ana bilgisayar adını döndürür. |
| [get_Fragment](./get_fragment/)() const | Kaçış yapılmış URI parçacığını döndürür. |
| [get_Host](./get_host/)() const | Ana bilgisayar adını döndürür. |
| [get_HostNameType](./get_hostnametype/)() const | Ana bilgisayar adı türünü döndürür. |
| [get_IdnHost](./get_idnhost/)() const | Ana bilgisayarın Uluslararası Alan Adını döndürür. |
| [get_IsAbsoluteUri](./get_isabsoluteuri/)() const | Geçerli nesne tarafından temsil edilen URI'nın mutlak olup olmadığını belirler. |
| [get_IsDefaultPort](./get_isdefaultport/)() const | Geçerli nesne tarafından temsil edilen URI'nın şema için varsayılan bağlantı noktasına sahip olup olmadığını belirler. |
| [get_IsFile](./get_isfile/)() const | Geçerli nesne tarafından temsil edilen URI'nın bir dosya olup olmadığını belirler. |
| [get_IsLoopback](./get_isloopback/)() const | Geçerli nesne tarafından temsil edilen URI'nın yerel bir ana bilgisayara referans verip vermediğini belirler. |
| [get_IsUnc](./get_isunc/)() const | Geçerli nesne tarafından temsil edilen URI'nın UNC yolu olup olmadığını belirler. |
| [get_LocalPath](./get_localpath/)() const | Geçerli nesne tarafından temsil edilen URI tarafından referans verilen dosya adının işletim sistemi temsiliğini döndürür. |
| [get_OriginalString](./get_originalstring/)() const | Geçerli nesne oluşturulduğunda yapıcıya geçirilen URI dizesini döndürür. |
| [get_PathAndQuery](./get_pathandquery/)() const | Geçerli nesne tarafından temsil edilen URI'nın mutlak yol ve sorgu bileşenlerini soru işareti (?) ile ayırarak döndürür. |
| [get_Port](./get_port/)() const | Geçerli nesne tarafından temsil edilen URI'nın bağlantı noktasını döndürür. |
| [get_Query](./get_query/)() const | Geçerli nesne tarafından temsil edilen URI'ya dahil edilen sorgu bilgisini döndürür. |
| [get_Scheme](./get_scheme/)() const | Geçerli nesne tarafından temsil edilen URI'nın şemasını döndürür. |
| [get_Segments](./get_segments/)() const | Geçerli nesne tarafından temsil edilen URI'nın yol segmentlerini içeren bir dizi dize döndürür. |
| [get_UserEscaped](./get_userescaped/)() const | Geçerli nesnenin yapıcısına geçirilen URI dizesinin tamamen kaçış yapılmış olup olmadığını belirler. |
| [get_UserInfo](./get_userinfo/)() const | Kullanıcı adı, şifre ve geçerli nesne tarafından temsil edilen URI ile ilişkili diğer kullanıcı bilgilerini döndürür. |
| [GetComponents](./getcomponents/)(UriComponents, UriFormat) const | Geçerli nesne tarafından temsil edilen URI'nın belirtilen kaçış yöntemi kullanılarak belirtilen bileşenlerini döndürür. |
| [GetHashCode](./gethashcode/)() const override | URI için karma kodunu alır. |
| [GetLeftPart](./getleftpart/)(UriPartial) | Geçerli nesne tarafından temsil edilen URI'nın belirtilen bölümünü döndürür. |
| static [HexEscape](./hexescape/)(char16_t) | Belirtilen karakterin onaltılık eşdeğerini döndürür. |
| static [HexUnescape](./hexunescape/)(const String\&, int32_t\&) | Belirtilen karakterin onaltılık temsilini bir karaktere dönüştürür. |
| [IsBaseOf](./isbaseof/)(const SharedPtr\<Uri\>\&) const | Geçerli [Uri](./) nesnesi tarafından temsil edilen URI'nin, belirtilen [Uri](./) nesnesi tarafından temsil edilen URI'nin temel olup olmadığını belirler. |
| static [IsHexDigit](./ishexdigit/)(char16_t) | Belirtilen karakterin geçerli bir onaltılık basamak temsil edip etmediğini belirler. |
| static [IsHexEncoding](./ishexencoding/)(const String\&, int32_t) | Belirtilen dizenin belirtilen konumundaki karakterin onaltılık olarak kodlanıp kodlanmadığını belirler. |
| [IsWellFormedOriginalString](./iswellformedoriginalstring/)() const | Bu [Uri](./) nesnesini oluşturmak için kullanılan dizenin düzgün biçimlendirilip daha fazla kaçışa ihtiyaç duyup duymadığını gösterir. |
| static [IsWellFormedUriString](./iswellformeduristring/)(const String\&, UriKind) | Belirtilen dizenin düzgün biçimlendirilmiş bir URI olup olmadığını belirler. |
| [MakeRelative](./makerelative/)(const SharedPtr\<Uri\>\&) | İki [Uri](./) örneği arasındaki farkı belirler. |
| [MakeRelativeUri](./makerelativeuri/)(const SharedPtr\<Uri\>\&) | Geçerli ve belirtilen [Uri](./) nesneleri tarafından temsil edilen URI'ler arasındaki farkı belirler. |
| [ToString](./tostring/)() const override | Geçerli nesne tarafından temsil edilen URI'nin dize temsili döndürür. |
| static [TryCreate](./trycreate/)(const String\&, UriKind, SharedPtr\<Uri\>\&) | Belirtilen URI'yi temsil eden bir [Uri](./) nesnesi oluşturur; bir argüman URI türünü belirtir. |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) | Temel URI'yi temsil eden belirtilen [Uri](./) nesnesi ve göreli URI'nin dize temsili kullanılarak bir [Uri](./) nesnesi oluşturur. |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) | Belirtilen temel ve göreli URI'lerden bir [Uri](./) nesnesi oluşturur. |
| static [UnescapeDataString](./unescapedatastring/)(const String\&) | Belirtilen kaçışlı dizenin kaçışını kaldırır. |
| [Uri](./uri/)(const String\&) | Belirtilen URI'yi temsil eden bir [Uri](./) nesnesi oluşturur. |
| [Uri](./uri/)(const String\&, bool) | Belirtilen URI'yi temsil eden bir [Uri](./) nesnesi oluşturur; bir argüman URI'nin kaçış yapılması gerekip gerekmediğini belirtir. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&, bool) | Temel URI'yi temsil eden belirtilen [Uri](./) nesnesi ve göreli URI'nin dize temsili kullanılarak bir [Uri](./) nesnesi oluşturur; bir argüman URI'nin kaçış yapılması gerekip gerekmediğini belirtir. |
| [Uri](./uri/)(const String\&, UriKind) | Belirtilen URI'yi temsil eden bir [Uri](./) nesnesi oluşturur; bir argüman URI türünü belirtir. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&) | Belirtilen temel ve göreli URI'lerden bir [Uri](./) nesnesi oluşturur. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) | Belirtilen temel ve göreli URI'lerden bir [Uri](./) nesnesi oluşturur. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [SchemeDelimiter](./schemedelimiter/) | [Uri](./) nesnesinin adres bölümünü iletişim protokolü şemasından ayıran karakterleri belirtir. |
| static [UriSchemeFile](./urischemefile/) | [Uri](./) nesnesinin bir dosyaya işaret ettiğini belirtir. |
| static [UriSchemeFtp](./urischemeftp/) | [Uri](./) nesnesinin Dosya Transfer Protokolü (FTP) üzerinden erişildiğini belirtir. |
| static [UriSchemeGopher](./urischemegopher/) | [Uri](./) nesnesinin Gopher protokolü üzerinden erişildiğini belirtir. |
| static [UriSchemeHttp](./urischemehttp/) | [Uri](./) nesnesinin Hipermetin Transfer Protokolü (HTTP) üzerinden erişildiğini belirtir. |
| static [UriSchemeHttps](./urischemehttps/) | [Uri](./) nesnesinin Güvenli Hipermetin Transfer Protokolü (HTTPS) üzerinden erişildiğini belirtir. |
| static [UriSchemeMailto](./urischememailto/) | [Uri](./) nesnesinin bir e-posta adresi olduğunu ve Basit Posta Taşıma Protokolü (SMTP) üzerinden erişildiğini belirtir. |
| static [UriSchemeNetPipe](./urischemenetpipe/) | [Uri](./) nesnesinin [Windows](../../system.windows/) İletişim Temeli tarafından kullanılan NetPipe şeması üzerinden erişildiğini belirtir. |
| static [UriSchemeNetTcp](./urischemenettcp/) | [Uri](./) nesnesinin [Windows](../../system.windows/) İletişim Temeli tarafından kullanılan NetTcp şeması üzerinden erişildiğini belirtir. |
| static [UriSchemeNews](./urischemenews/) | [Uri](./) nesnesinin bir Internet haber grubu olduğunu ve Ağ Haber Taşıma Protokolü (NNTP) üzerinden erişildiğini belirtir. |
| static [UriSchemeNntp](./urischemenntp/) | [Uri](./) nesnesinin bir Internet haber grubu olduğunu ve Ağ Haber Taşıma Protokolü (NNTP) üzerinden erişildiğini belirtir. |
## Açıklamalar



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

## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
