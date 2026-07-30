---
title: "System::IConvertible sınıfı"
linktitle: "IConvertible"
second_title: "Aspose.Font için C++"
description: "System::IConvertible sınıfı. Uygulayan referans veya değer tipinin değerini eşdeğer bir değere sahip ortak dil çalışma zamanı tipine dönüştüren yöntemler tanımlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin bir örneğini yığına (stack) ya da new operatörüyle oluşturmaya çalışmayın; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3400
url: /tr/cpp/system/iconvertible/
---
## IConvertible class


Uygulayan referans veya değer tipinin değerini eşdeğer bir değere sahip ortak dil çalışma zamanı tipine dönüştüren yöntemler tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin bir örneğini yığına (stack) ya da new operatörüyle oluşturmaya çalışmayın; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class IConvertible : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() | Bu örnek için tip kodunu döndürür. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir [Boolean](../boolean/) değere dönüştürür. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir 8-bit uint32_teger değerine dönüştürür. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir Unicode karakterine dönüştürür. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir [System::DateTime](../datetime/) değerine dönüştürür. |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir [System::Decimal](../decimal/) sayısına dönüştürür. |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir çift duyarlıklı kayan nokta sayısına dönüştürür. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir 16-bit işaretli tam sayıya dönüştürür. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir 32-bit işaretli tam sayıya dönüştürür. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir 64-bit işaretli tam sayıya dönüştürür. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir 8-bit işaretli tam sayıya dönüştürür. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir tek duyarlıklı kayan nokta sayısına dönüştürür. |
| virtual [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir [System::String](../string/) değerine dönüştürür. |
| virtual [ToString](./tostring/)() const | C# [Object.ToString()](../object/tostring/) metodunun analoğu. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| virtual [ToType](./totype/)(const TypeInfo\&, System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen System::Type türüne eşdeğer bir değere sahip bir [System::Object](../object/) olarak, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak dönüştürür. |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir 16-bit uint32_teger'a dönüştürür. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir 32-bit uint32_teger'a dönüştürür. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir 64-bit uint32_teger'a dönüştürür. |
## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
