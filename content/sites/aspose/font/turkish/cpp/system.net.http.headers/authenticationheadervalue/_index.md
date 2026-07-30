---
title: "System::Net::Http::Headers::AuthenticationHeaderValue sınıfı"
linktitle: "AuthenticationHeaderValue"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::AuthenticationHeaderValue sınıfı. ''Authorization'', ''ProxyAuthorization'', ''WWW-Authenticate'' ve ''Proxy-Authenticate'' başlıklarının değerlerini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türün bir örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.net.http.headers/authenticationheadervalue/
---
## AuthenticationHeaderValue class


''Authorization'', ''ProxyAuthorization'', ''WWW-Authenticate'' ve ''Proxy-Authenticate'' başlıklarının değerlerini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün bir örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class AuthenticationHeaderValue : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String) | Yapıcı. |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String, String) | Yapıcı. |
| [Clone](./clone/)() override | RTTI bilgisi. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_Parameter](./get_parameter/)() | Kimlik doğrulama bilgilerini içeren kimlik bilgilerini alır. |
| [get_Scheme](./get_scheme/)() | RTTI bilgisi. |
| static [GetAuthenticationLength](./getauthenticationlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Belirtilen dizeyi ayrıştırır ve dize temsilinin son indeksini döndürür. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| static [Parse](./parse/)(String) | Geçilen dizeyi [AuthenticationHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<AuthenticationHeaderValue\>\&) | Geçilen dizeyi [AuthenticationHeaderValue](./) sınıfının bir örneğine dönüştürmeye çalışıyor. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
