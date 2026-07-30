---
title: "System::ObjectExt sınıfı"
linktitle: "ObjectExt"
second_title: "Aspose.Font için C++"
description: "System::ObjectExt sınıfı. Nesne olmayan C++ tipleri (dizeler, sayılar vb.) için çağrılan C# Object yöntemlerini taklit eden statik metodlar sağlar. Bu, örnek hizmeti olmayan statik bir tiptir. C++'ta hiçbir şekilde onun örneklerini oluşturmayınız."
type: docs
weight: 4900
url: /tr/cpp/system/objectext/
---
## ObjectExt class


Nesne olmayan C++ tipleri (dizeler, sayılar vb.) için çağrılan C# [Object](../object/) yöntemlerini taklit eden statik metodlar sağlar. Bu, örnek hizmeti olmayan statik bir tiptir. Herhangi bir şekilde onun örneklerini oluşturmayınız.

```cpp
class ObjectExt : public System::ObjectType
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [ArrayInitializerCast](./arrayinitializercast/)(From ...) | Dizi temel değerlerini dönüştürür (C# bunu örtük olarak yapar ancak C++ muhtemelen yapmaz). |
| static [Box](./box/)(const T\&) | Değer tiplerini [Object](../object/) tipine dönüştürmek için kutular. Enum tipleri için uygulama. |
| static [Box](./box/)(const T\&) | Değer tiplerini [Object](../object/) tipine dönüştürmek için kutular. Enum olmayan tipler için uygulama. |
| static [Box](./box/)(const T\&) | [Nullable](../nullable/) tiplerini [Object](../object/) tipine dönüştürmek için kutular. |
| static [Box](./box/)(const String\&) | Dize değerlerini kutular. |
| static [BoxEnum](./boxenum/)(T) | Enum tiplerini [Object](../object/) olarak yayılmak üzere kutular. |
| static [CastToIList](./casttoilist/)(const SmartPtr\<Object\>\&) |  |
| static [Coalesce](./coalesce/)(T0, T1) | Null olmayan tipler için '??' operatörünün çevirisinin uygulanması. |
| static [Coalesce](./coalesce/)(System::Nullable\<T0\>, T1) | Null olabilir tipler için '??' operatörünün çevirisinin uygulanması. |
| static [CoalesceAssign](./coalesceassign/)(T0\&, T1) | '??=' operatörünün çevirisinin uygulanması. |
| static [CoalesceInternal](./coalesceinternal/)(RT1, F) | Null olmayan tipler için '??' operatörünün çevirisinin uygulanması. RT2'nin RT1'e dönüştürülebilir olduğu durum için aşırı yükleme. |
| static [Equals](./equals/)(const T\&, const T2\&) |  |
| static [Equals](./equals/)(const T\&, const T2\&) | C++'ta herhangi bir tip için çalışan C# [Object.Equals](../object/equals/) çağrılarının ikamesi. Akıllı işaretçi tipleri için aşırı yükleme. |
| static [Equals](./equals/)(T, const T2\&) | C++'ta herhangi bir tip için çalışan C# [Object.Equals](../object/equals/) çağrılarının ikamesi. Yapı tipleri için aşırı yükleme. |
| static [Equals](./equals/)(const T\&, const T2\&) | C++'ta herhangi bir tip için çalışan C# [Object.Equals](../object/equals/) çağrılarının ikamesi. Skaler tipler için aşırı yükleme. |
| static [Equals](./equals/)(const char_t(&), String) | C++'ta herhangi bir tip için çalışan C# [Object.Equals](../object/equals/) çağrılarının ikamesi. Dize karşılaştırmasıyla dize sabiti için aşırı yükleme. |
| static [Equals](./equals/)(const float\&, const float\&) | IEC 60559:1989'a göre NaN'in hiçbir değere, NaN dahil, eşit olmamasına rağmen, iki NaN'in eşit kabul edildiği C# tarzı kayan nokta karşılaştırmasını taklit eder. |
| static [Equals](./equals/)(const double\&, const double\&) | IEC 60559:1989'a göre NaN'in hiçbir değere, NaN dahil, eşit olmamasına rağmen, iki NaN'in eşit kabul edildiği C# tarzı kayan nokta karşılaştırmasını taklit eder. |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [GetHashCode](./gethashcode/)(const T\&) | [GetHashCode()](./gethashcode/) çağrılarını uygular; hem [Object](../object/) alt sınıflarında hem de ilişkili olmayan tiplerde çalışır. |
| static [Is](./is/)(const T\&) | 'is' operatörünün çevirisini uygular. Kutulanabilir (değer) tipler için özelleştirme; bu tiplerin tam olarak kutulanabilir olmasıdır. |
| static [Is](./is/)(const U\&) | 'is' operatörünün çevirisini uygular. 'final' sınıflar için optimize edilmiş işaretçi tipleri için özelleştirme. |
| static [Is](./is/)(const U\&) | 'is' operatörünün çevirisini uygular. İşaretçi tipleri için özelleştirme. |
| static [Is](./is/)(const Object\&) | 'is' operatörünün çevirisini uygular. Değer tipleri için özelleştirme. |
| static [Is](./is/)(const Object\&) | 'is' operatörünün çevirisini uygular. Dönüştürülemez tipler için özelleştirme. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | 'is' operatörünün çevirisini uygular. İşaretçi tipleri için özelleştirme. |
| static [Is](./is/)(const ExceptionWrapper\<U\>\&) | İstisna sarmalayıcı tipleri için 'is' operatörü çevirisini uygular. İstisna sarmalayıcı tipleri için özelleştirme. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Nullable tipleri için 'is' operatörü çevirisini uygular. Nullable tipleri için özelleştirme. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | == operatörü tanımlı kutlanabilir tipler için 'is' operatörü çevirisini uygular. == operatörü tanımlı kutlanabilir tipler için özelleştirme. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | == operatörü tanımlanmamış kutlanabilir tipler için 'is' operatörü çevirisini uygular. == operatörü tanımlanmamış kutlanabilir tipler için özelleştirme. |
| static [Is](./is/)(const SmartPtr\<V\>\&) | Arayüzlere kutlanan değer tipleri için 'is' operatörü çevirisini uygular. Değer tiplerinin arayüzlere kutlanması için özelleştirme. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Enum tipleri için 'is' operatörü çevirisini uygular. Enum tipleri için özelleştirme. |
| static [Is](./is/)(const WeakPtr\<U\>\&) | Enum tipleri ve zayıf işaretçiler için 'is' operatörü çevirisini uygular. Enum tipleri ve zayıf işaretçiler için özelleştirme. |
| static [Is](./is/)(const Nullable\<U\>\&) | [Nullable](../nullable/) tipi için 'is' operatörü çevirisini uygular. [Nullable](../nullable/) tipi için özelleştirme. |
| static [Is](./is/)(const char16_t *) | Dize sabiti için 'is' operatörü çevirisini uygular. Dize sabiti için özelleştirme. |
| static [Is](./is/)(int32_t) | Tamsayı sabiti için 'is' operatörü çevirisini uygular. Tamsayı sabiti için özelleştirme. |
| static [IsBoxedValue](./isboxedvalue/)(const SmartPtr\<Object\>\&) | Nesnenin kutlanmış bir değer olup olmadığını denetler. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | [Object](../object/) nesnesini bilinmeyen tipe dönüştürür, hem akıllı işaretçi tipini hem de kutlanmış değer durumlarını ele alır. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | [Object](../object/) nesnesini bilinmeyen tipe dönüştürür, hem akıllı işaretçi tipini hem de kutlanmış değer durumlarını ele alır. |
| static [ToString](./tostring/)(const char_t *) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer. |
| static [ToString](./tostring/)(const Nullable\<T\>\&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer. |
| static [ToString](./tostring/)(const T\&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer. |
| static [ToString](./tostring/)(const T\&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer. |
| static [ToString](./tostring/)(T\&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer. |
| static [ToString](./tostring/)(T\&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer. |
| static [ToString](./tostring/)(T\&&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer. |
| static [ToString](./tostring/)(T\&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer. |
| static [ToString](./tostring/)(const T\&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer. |
| static [ToString](./tostring/)(T\&&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun yerine geçer. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Değer tiplerini [Object](../object/) tipine dönüştürdükten sonra kutlamayı kaldırır. Enum tipleri için uygulanır. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Değer tiplerini [Object](../object/) tipine dönüştürdükten sonra kutlamayı kaldırır. Enum olmayan ve nullable olmayan tipler için uygulanır. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Değer tiplerini [Object](../object/) tipine dönüştürdükten sonra kutlamayı kaldırır. Enum olmayan ve nullable olmayan tipler için uygulanır. |
| static [Unbox](./unbox/)(E) | Enum tiplerinin kutlamasını kaldırarak tamsayıya dönüştürür. |
| static [Unbox](./unbox/)(E) | Enum tiplerini dönüştürür. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Dize değerlerinin kutlamasını kaldırır. |
| static [UnboxStringSafe](./unboxstringsafe/)(const SmartPtr\<Object\>\&) | Kutlanmış değerden dizeyi kutlamayı kaldırarak çıkarır. |
| static [UnboxToNullable](./unboxtonullable/)(const SmartPtr\<Object\>\&, bool) | Nesnenin kutlamasını kaldırarak nullable tipe dönüştürür. |
| static [UnknownIsNull](./unknownisnull/)(T) | Bilinmeyen tip nesnesinin nullptr olup olmadığını denetler. Skaler olmayan tipler için aşırı yükleme. |
| static [UnknownIsNull](./unknownisnull/)(T) | Bilinmeyen tip nesnesinin nullptr olup olmadığını denetler. Skaler tipler için aşırı yükleme. |
| static [UnknownToObject](./unknowntoobject/)(T) | Bilinmeyen tipi [Object](../object/) tipine dönüştürür, hem akıllı işaretçi tipini hem de değer tipi durumlarını ele alır. |
| static [UnknownToObject](./unknowntoobject/)(const T\&) | Bilinmeyen tipi [Object](../object/) tipine dönüştürür, hem akıllı işaretçi tipini hem de değer tipi durumlarını ele alır. |
## Ayrıca Bakınız

* Class [ObjectType](../objecttype/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
