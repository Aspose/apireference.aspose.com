---
title: "System::Net::CookieContainer sınıfı"
linktitle: "CookieContainer"
second_title: "Aspose.Font için C++"
description: "System::Net::CookieContainer sınıfı. CookieCollection-sınıfı örnekleri için bir kapsayıcı sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve C++'ta fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın."
type: docs
weight: 400
url: /tr/cpp/system.net/cookiecontainer/
---
## CookieContainer class


CookieCollection sınıfı örnekleri için bir kapsayıcı sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class CookieContainer : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Cookie\>) | Koleksiyona bir çerez ekler. |
| [Add](./add/)(System::SharedPtr\<Cookie\>, bool) | Koleksiyona bir çerez ekler. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | Belirtilen koleksiyondan çerezleri mevcut koleksiyona kopyalar. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<Cookie\>) | Belirtilen URI için bir çerez ekler. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<CookieCollection\>) | Belirtilen URI'ye ait belirtilen koleksiyondan çerezleri mevcut koleksiyona kopyalar. |
| [CookieContainer](./cookiecontainer/)() | Yeni bir örnek oluşturur. |
| [CookieContainer](./cookiecontainer/)(int32_t) | Yeni bir örnek oluşturur. |
| [CookieContainer](./cookiecontainer/)(int32_t, int32_t, int32_t) | Yeni bir örnek oluşturur. |
| [CookieCutter](./cookiecutter/)(System::SharedPtr\<Uri\>, String, String, bool) | Belirtilen URI için belirtilen HTTP başlığından çerezleri kopyalar. |
| [get_Capacity](./get_capacity/)() | Koleksiyon kapasitesini alır. |
| [get_Count](./get_count/)() | Koleksiyonun öğe sayısını döndürür. |
| [get_MaxCookieSize](./get_maxcookiesize/)() | Maksimum çerez boyutunu alır. |
| [get_PerDomainCapacity](./get_perdomaincapacity/)() | Alan başına koleksiyon kapasitesini alır. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>) | Belirtilen URI ile ilişkili çerezleri içeren bir HTTP başlığı döndürür. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>, String\&) | Belirtilen URI ile ilişkili çerezleri içeren bir HTTP başlığı döndürür. |
| [GetCookies](./getcookies/)(System::SharedPtr\<Uri\>) | Belirtilen URI ile ilişkili çerezlerin bir koleksiyonunu döndürür. |
| [InternalGetCookies](./internalgetcookies/)(System::SharedPtr\<Uri\>) | Belirtilen URI ile ilişkili çerezlerin bir koleksiyonunu döndürür. |
| [IsLocalDomain](./islocaldomain/)(String) | Belirtilen alanın localhost olup olmadığını kontrol eder. |
| [set_Capacity](./set_capacity/)(int32_t) | Koleksiyon kapasitesini ayarlar. |
| [set_MaxCookieSize](./set_maxcookiesize/)(int32_t) | Maksimum çerez boyutunu ayarlar. |
| [set_PerDomainCapacity](./set_perdomaincapacity/)(int32_t) | Alan başına koleksiyon kapasitesini ayarlar. |
| [SetCookies](./setcookies/)(System::SharedPtr\<Uri\>, String) | Belirtilen başlıktan çerezleri koleksiyona kopyalar ve bunları belirtilen URI ile ilişkilendirir. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [DefaultCookieLengthLimit](./defaultcookielengthlimit/) | Maksimum çerez boyutu. |
| static [DefaultCookieLimit](./defaultcookielimit/) | RTTI bilgisi. |
| static [DefaultPerDomainCookieLimit](./defaultperdomaincookielimit/) | Alan başına koleksiyon öğelerinin maksimum sayısı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
