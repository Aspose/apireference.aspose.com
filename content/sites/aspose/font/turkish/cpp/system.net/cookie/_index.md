---
title: "System::Net::Cookie sınıfı"
linktitle: "Çerez"
second_title: "Aspose.Font için C++"
description: "System::Net::Cookie sınıfı. Bir HTTP çerezini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.net/cookie/
---
## Cookie class


Bir HTTP çerezini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Cookie : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() | Mevcut örneğin bir kopyasını oluşturur. |
| [Cookie](./cookie/)() | Yeni bir örnek oluşturur. |
| [Cookie](./cookie/)(String, String) | Yeni bir örnek oluşturur. |
| [Cookie](./cookie/)(String, String, String) | Yeni bir örnek oluşturur. |
| [Cookie](./cookie/)(String, String, String, String) | Yeni bir örnek oluşturur. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_Comment](./get_comment/)() const | 'Comment' özniteliğinin değerini alır. |
| [get_CommentUri](./get_commenturi/)() const | 'CommentURL' özniteliğinin değerini alır. |
| [get_Discard](./get_discard/)() const | 'Discard' özniteliğinin değerini alır. |
| [get_Domain](./get_domain/)() const | 'Domain' özniteliğinin değerini alır. |
| [get_DomainImplicit](./get_domainimplicit/)() | Etkinin örtük olup olmadığını gösteren bir değeri alır. |
| [get_DomainKey](./get_domainkey/)() const | Domain anahtarını döndürür. |
| [get_Expired](./get_expired/)() | Çerezin süresi dolmuş olup olmadığını gösteren bir değeri alır. |
| [get_Expires](./get_expires/)() | 'Expires' özniteliğinin değerini alır. |
| [get_HttpOnly](./get_httponly/)() const | 'HttpOnly' özniteliğinin değerini alır. |
| [get_Name](./get_name/)() const | Çerezin adını alır. |
| [get_Path](./get_path/)() const | 'Path' özniteliğinin değerini alır. |
| [get_Plain](./get_plain/)() const | Çerez spesifikasyonunun 'Plain' olup olmadığını gösteren bir değeri döndürür. |
| [get_Port](./get_port/)() const | 'Port' özniteliğinin değerini alır. |
| [get_PortList](./get_portlist/)() const | 'Port' özniteliğinin değer koleksiyonunu döndürür. |
| [get_Secure](./get_secure/)() const | 'Secure' özniteliğinin değerini alır. |
| [get_TimeStamp](./get_timestamp/)() const | Çerezin oluşturulduğu zamanı döndürür. |
| [get_Value](./get_value/)() const | Çerezin değerini alır. |
| [get_Variant](./get_variant/)() const | Çerezin spesifikasyonunu alır. |
| [get_Version](./get_version/)() const | '[Version](../../system/version/)' özniteliğinin değerini alır. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| [InternalSetName](./internalsetname/)(String) | Bu yöntem, bir yöntem adını ayarlamak için diğer yöntemler tarafından çağrılır. |
| [set_Comment](./set_comment/)(String) | 'Comment' özniteliğinin değerini ayarlar. |
| [set_CommentUri](./set_commenturi/)(System::SharedPtr\<Uri\>) | 'CommentURL' özniteliğinin değerini ayarlar. |
| [set_Discard](./set_discard/)(bool) | 'Discard' özniteliğinin değerini ayarlar. |
| [set_Domain](./set_domain/)(String) | 'Domain' özniteliğinin değerini ayarlar. |
| [set_DomainImplicit](./set_domainimplicit/)(bool) | Etki alanının örtük olup olmadığını gösteren bir değeri ayarlar. |
| [set_Expired](./set_expired/)(bool) | Çerezin süresi dolmuş olup olmadığını gösteren bir değeri ayarlar. |
| [set_Expires](./set_expires/)(DateTime) | 'Expires' özniteliğinin değerini ayarlar. |
| [set_HttpOnly](./set_httponly/)(bool) | 'HttpOnly' özniteliğinin değerini ayarlar. |
| [set_Name](./set_name/)(String) | Çerezin adını ayarlar. |
| [set_Path](./set_path/)(String) | 'Path' özniteliğinin değerini ayarlar. |
| [set_Port](./set_port/)(String) | 'Port' özniteliğinin değerini ayarlar. |
| [set_Secure](./set_secure/)(bool) | 'Secure' özniteliğinin değerini ayarlar. |
| [set_Value](./set_value/)(String) | Çerezin değerini ayarlar. |
| [set_Variant](./set_variant/)(CookieVariant) | Çerezin spesifikasyonunu ayarlar. |
| [set_Version](./set_version/)(int32_t) | '[Version](../../system/version/)' özniteliğinin değerini ayarlar. |
| [ToServerString](./toserverstring/)() | Geçerli örneği dize temsiline serileştirir. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| [VerifySetDefaults](./verifysetdefaults/)(CookieVariant, System::SharedPtr\<Uri\>, bool, String, bool, bool) | Varsayılan öznitelik değerlerini doğrular ve ayarlar. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [CommentAttributeName](./commentattributename/) | 'Comment' özniteliğinin adı. |
| static [CommentUrlAttributeName](./commenturlattributename/) | 'CommentURL' özniteliğinin adı. |
| static [DiscardAttributeName](./discardattributename/) | 'Discard' özniteliğinin adı. |
| static [DomainAttributeName](./domainattributename/) | 'Domain' özniteliğinin adı. |
| static [EqualsLiteral](./equalsliteral/) | Bir özniteliğin adını ve değerini ayırmak için kullanılan ayırıcı. |
| static [ExpiresAttributeName](./expiresattributename/) | 'Expires' özniteliğinin adı. |
| static [HttpOnlyAttributeName](./httponlyattributename/) | 'HttpOnly' özniteliğinin adı. |
| static [MaxAgeAttributeName](./maxageattributename/) | 'Max-Age' özniteliğinin adı. |
| static [MaxSupportedVersion](./maxsupportedversion/) | RTTI bilgisi. |
| static [MaxSupportedVersionString](./maxsupportedversionstring/) | Maksimum desteklenen sürümün dize temsili. |
| static [PathAttributeName](./pathattributename/) | 'Path' özniteliğinin adı. |
| static [PortAttributeName](./portattributename/) | 'Port' özniteliğinin adı. |
| static [PortSplitDelimiters](./portsplitdelimiters/) | 'Port' özniteliğinin değerleri için ayırıcıları içeren dizi. |
| static [QuotesLiteral](./quotesliteral/) | Özniteliğin bölümlerini sarmak için kullanılan sembol. |
| static [ReservedToName](./reservedtoname/) | Çerez adı için ayrılmış bir değer. |
| static [ReservedToValue](./reservedtovalue/) | Çerez değeri için ayrılmış bir değer. |
| static [SecureAttributeName](./secureattributename/) | 'Secure' özniteliğinin adı. |
| static [SeparatorLiteral](./separatorliteral/) | Öznitelik ayırıcı. |
| static [SpecialAttributeLiteral](./specialattributeliteral/) | Özel öznitelik adlarının öneki. |
| static [VersionAttributeName](./versionattributename/) | '[Version](../../system/version/)' özniteliğinin adı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
