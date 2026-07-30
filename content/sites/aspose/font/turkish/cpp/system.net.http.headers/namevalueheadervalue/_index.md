---
title: "System::Net::Http::Headers::NameValueHeaderValue sınıfı"
linktitle: "NameValueHeaderValue"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::NameValueHeaderValue sınıfı. Başlıklarda kullanılmak üzere bir anahtar/değer çifti temsil eder. Bu sınıfın nesneleri System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1400
url: /tr/cpp/system.net.http.headers/namevalueheadervalue/
---
## NameValueHeaderValue class


Başlıklarda kullanılmak üzere bir anahtar/değer çifti temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class NameValueHeaderValue : public virtual System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| static [Find](./find/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, String) | Belirtilen ada göre bir koleksiyonda NameValueHeaderValue-sınıfı örneğini bulur. |
| [get_Name](./get_name/)() | Geçerli örneğin adını döndürür. |
| [get_Value](./get_value/)() | Geçerli örneğin değerini alır. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| static [GetHashCode](./gethashcode/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | Koleksiyonun tüm öğelerinin bir karma kodunu döndürür. |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) | Belirtilen indeksten verilen bir dizeyi [NameValueHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) | Belirtilen indeksten verilen bir dizeyi [NameValueHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| static [GetNameValueListLength](./getnamevaluelistlength/)(String, int32_t, char16_t, System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | Belirtilen indeksten verilen bir dizeyi NameValueHeaderValue-class örneklerinin koleksiyonuna dönüştürür ve ayrıştırılan bir alt dize uzunluğunu döndürür. |
| static [GetValueLength](./getvaluelength/)(String, int32_t) | Belirtilen indeksten bir değerin uzunluğunu döndürür. |
| [NameValueHeaderValue](./namevalueheadervalue/)() | Yeni bir örnek oluşturur. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String) | Yeni bir örnek oluşturur. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String, String) | Yeni bir örnek oluşturur. |
| static [Parse](./parse/)(String) | Verilen bir dizeyi [NameValueHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [set_Value](./set_value/)(String) | Geçerli örneğin bir değerini ayarlar. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool, System::SharedPtr\<Text::StringBuilder\>) | NameValueHeaderValue-class örneklerinin koleksiyonunun bir dize temsilini döndürür. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool) | NameValueHeaderValue-class örneklerinin koleksiyonunun bir dize temsilini döndürür. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueHeaderValue\>\&) | Verilen bir dizeyi [NameValueHeaderValue](./) sınıfının bir örneğine dönüştürmeye çalışır. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
