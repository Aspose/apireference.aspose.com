---
title: "System::Net::Http::Headers::HttpContentHeaders sınıfı"
linktitle: "HttpContentHeaders"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::HttpContentHeaders sınıfı. ''Content'' başlıklarının koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate (ayrılmalı). Bu tipin örneğini yığına (stack) ya da new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 600
url: /tr/cpp/system.net.http.headers/httpcontentheaders/
---
## HttpContentHeaders class


'Content' başlıklarının koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class HttpContentHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Bilinen başlıkları belirtilen koleksiyona ekler. |
| [get_Allow](./get_allow/)() | RTTI bilgisi. |
| [get_ContentDisposition](./get_contentdisposition/)() | 'Content-Disposition' başlığının değerini alır. |
| [get_ContentEncoding](./get_contentencoding/)() | 'Content-Encoding' başlığının değerini alır. |
| [get_ContentLanguage](./get_contentlanguage/)() | 'Content-Language' başlığının değerini alır. |
| [get_ContentLength](./get_contentlength/)() | 'Content-Length' başlığının değerini alır. |
| [get_ContentLocation](./get_contentlocation/)() | 'Content-Location' başlığının değerini alır. |
| [get_ContentMD5](./get_contentmd5/)() | 'Content-MD5' başlığının değerini alır. |
| [get_ContentRange](./get_contentrange/)() | 'Content-Range' başlığının değerini alır. |
| [get_ContentType](./get_contenttype/)() | 'Content-Type' başlığının değerini alır. |
| [get_Expires](./get_expires/)() | 'Expires' başlığının değerini alır. |
| [get_LastModified](./get_lastmodified/)() | 'Last-Modified' başlığının değerini alır. |
| [HttpContentHeaders](./httpcontentheaders/)(HeaderFunc\<Nullable\<int64_t\>\>) | Yeni bir örnek oluşturur. |
| [set_ContentDisposition](./set_contentdisposition/)(System::SharedPtr\<ContentDispositionHeaderValue\>) | 'Content-Disposition' başlığının değerini ayarlar. |
| [set_ContentLength](./set_contentlength/)(Nullable\<int64_t\>) | 'Content-Length' başlığının değerini ayarlar. |
| [set_ContentLocation](./set_contentlocation/)(System::SharedPtr\<Uri\>) | 'Content-Location' başlığının değerini ayarlar. |
| [set_ContentMD5](./set_contentmd5/)(System::ArrayPtr\<uint8_t\>) | 'Content-MD5' başlığının değerini ayarlar. |
| [set_ContentRange](./set_contentrange/)(System::SharedPtr\<ContentRangeHeaderValue\>) | 'Content-Range' başlığının değerini ayarlar. |
| [set_ContentType](./set_contenttype/)(System::SharedPtr\<MediaTypeHeaderValue\>) | 'Content-Type' başlığının değerini ayarlar. |
| [set_Expires](./set_expires/)(Nullable\<DateTimeOffset\>) | 'Expires' başlığının değerini ayarlar. |
| [set_LastModified](./set_lastmodified/)(Nullable\<DateTimeOffset\>) | 'Last-Modified' başlığının değerini ayarlar. |
## Ayrıca Bakınız

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
