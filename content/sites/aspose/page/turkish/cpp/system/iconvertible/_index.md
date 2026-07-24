---
title: "System::IConvertible sınıfı"
linktitle: "IConvertible"
second_title: "Aspose.Page için C++"
description: "System::IConvertible sınıfı. Uygulayan referans veya değer tipinin değerini eşdeğer bir değere sahip ortak dil çalışma zamanı tipine dönüştüren yöntemler tanımlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türün örneği yığına (stack) veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 3400
url: /tr/cpp/system/iconvertible/
---
## IConvertible class


Uygulayan referans veya değer tipinin değerini eşdeğer bir değere sahip ortak dil çalışma zamanı tipine dönüştüren yöntemler tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneği yığına (stack) veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class IConvertible : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() | Bu örnek için tip kodunu döndürür. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir [Boolean](../boolean/) değerine dönüştürür. |
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
| virtual [ToString](./tostring/)() const | C# [Object.ToString()](../object/tostring/) metodunun benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| virtual [ToType](./totype/)(const TypeInfo\&, System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen System::Type tipine sahip bir [System::Object](../object/) nesnesine, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir değerle dönüştürür. |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir 16-bit uint32_teger değerine dönüştürür. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir 32-bit uint32_teger'e dönüştürür. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<System::IFormatProvider\>) | Bu örneğin değerini belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak eşdeğer bir 64-bit uint32_teger'e dönüştürür. |
## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
