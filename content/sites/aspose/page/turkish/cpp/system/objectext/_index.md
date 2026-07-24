---
title: "System::ObjectExt sınıfı"
linktitle: "ObjectExt"
second_title: "Aspose.Page için C++"
description: "System::ObjectExt sınıfı. Nesne olmayan C++ türleri (dizeler, sayılar vb.) için çağrılan C# Object yöntemlerini taklit eden statik yöntemler sağlar. Bu, örnek hizmeti olmayan bir statik türdür. C++'ta hiçbir şekilde onun örneklerini oluşturmayınız."
type: docs
weight: 4900
url: /tr/cpp/system/objectext/
---
## ObjectExt class


Nesne olmayan C++ türleri (dizeler, sayılar vb.) için çağrılan C# [Object](../object/) yöntemlerini taklit eden statik yöntemler sağlar. Bu, örnek hizmeti olmayan bir statik türdür. Herhangi bir şekilde onun örneklerini oluşturmayınız.

```cpp
class ObjectExt : public System::ObjectType
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [ArrayInitializerCast](./arrayinitializercast/)(From ...) | Dizi temel değerlerini dönüştürür (C# bunu otomatik yapar ancak C++ görünüşe göre yapmaz). |
| static [Box](./box/)(const T\&) | Değer tiplerini [Object](../object/) tipine dönüştürmek için kutular. Enum tipleri için uygulama. |
| static [Box](./box/)(const T\&) | Değer tiplerini [Object](../object/) tipine dönüştürmek için kutular. Enum olmayan tipler için uygulama. |
| static [Box](./box/)(const T\&) | [Nullable](../nullable/) tiplerini [Object](../object/) tipine dönüştürmek için kutular. |
| static [Box](./box/)(const String\&) | Dize değerlerini kutular. |
| static [BoxEnum](./boxenum/)(T) | Enum tiplerini [Object](../object/) olarak yayılmak üzere kutular. |
| static [CastToIList](./casttoilist/)(const SmartPtr\<Object\>\&) |  |
| static [Coalesce](./coalesce/)(T0, T1) | Null olmayan tipler için '??' operatörü çevirisinin uygulanması. |
| static [Coalesce](./coalesce/)(System::Nullable\<T0\>, T1) | Null olabilir tipler için '??' operatörü çevirisinin uygulanması. |
| static [CoalesceInternal](./coalesceinternal/)(RT1, F) | Null olmayan tipler için '??' operatörü çevirisinin uygulanması. RT2'nin RT1'e dönüştürülebilir olduğu durum için aşırı yükleme. |
| static [Equals](./equals/)(const T\&, const T2\&) |  |
| static [Equals](./equals/)(const T\&, const T2\&) | C++'ta herhangi bir tip için çalışan C# [Object.Equals](../object/equals/) çağrılarının yerine geçme. Akıllı işaretçi tipleri için aşırı yükleme. |
| static [Equals](./equals/)(T, const T2\&) | C++'ta herhangi bir tip için çalışan C# [Object.Equals](../object/equals/) çağrılarının yerine geçme. Yapı tipleri için aşırı yükleme. |
| static [Equals](./equals/)(const T\&, const T2\&) | C++'ta herhangi bir tip için çalışan C# [Object.Equals](../object/equals/) çağrılarının yerine geçme. Skaler tipler için aşırı yükleme. |
| static [Equals](./equals/)(const char_t(&), String) | C++'ta herhangi bir tip için çalışan C# [Object.Equals](../object/equals/) çağrılarının yerine geçme. Dize karşılaştırmasıyla dize sabiti için aşırı yükleme. |
| static [Equals](./equals/)(const float\&, const float\&) | IEC 60559:1989'a göre NaN'in herhangi bir değere, NaN dahil, eşit olmamasına rağmen, iki NaN'in eşit kabul edildiği C# tarzı kayan nokta karşılaştırmasını taklit eder. |
| static [Equals](./equals/)(const double\&, const double\&) | IEC 60559:1989'a göre NaN'in herhangi bir değere, NaN dahil, eşit olmamasına rağmen, iki NaN'in eşit kabul edildiği C# tarzı kayan nokta karşılaştırmasını taklit eder. |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [GetHashCode](./gethashcode/)(const T\&) | [GetHashCode()](./gethashcode/) çağrılarını uygular; hem [Object](../object/) alt sınıflarında hem de ilişkili olmayan tiplerde çalışır. |
| static [Is](./is/)(const T\&) | 'is' operatörü çevirisini uygular. Kutulanabilir (değer) tipler için özelleştirme; bu tiplerin tam olarak bu olduğu anlamına gelir. |
| static [Is](./is/)(const U\&) | 'is' operatörü çevirisini uygular. 'final' sınıflar için optimize edilmiş işaretçi tipleri için özelleştirme. |
| static [Is](./is/)(const U\&) | 'is' operatörü çevirisini uygular. İşaretçi tipleri için özelleştirme. |
| static [Is](./is/)(const Object\&) | 'is' operatörü çevirisini uygular. Değer tipleri için özelleştirme. |
| static [Is](./is/)(const Object\&) | 'is' operatörünün çevirisini uygular. Dönüştürülemez tipler için özelleştirme. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | 'is' operatörü çevirisini uygular. İşaretçi tipleri için özelleştirme. |
| static [Is](./is/)(const ExceptionWrapper\<U\>\&) | 'is' operatörünün çevirisini uygular. İstisna sarmalayıcı tipleri için özelleştirme. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | 'is' operatörünün çevirisini uygular. Nullable tipler için özelleştirme. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | 'is' operatörünün çevirisini uygular. == operatörü tanımlı kutulanabilir tipler için özelleştirme. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | 'is' operatörünün çevirisini uygular. == operatörü tanımlanmamış kutulanabilir tipler için özelleştirme. |
| static [Is](./is/)(const SmartPtr\<V\>\&) | 'is' operatörünün çevirisini uygular. Arabirimlere kutulanmış değer tipleri için özelleştirme. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | 'is' operatörünün çevirisini uygular. Enum tipleri için özelleştirme. |
| static [Is](./is/)(const WeakPtr\<U\>\&) | 'is' operatörünün çevirisini uygular. Enum tipleri ve zayıf işaretçiler için özelleştirme. |
| static [Is](./is/)(const Nullable\<U\>\&) | 'is' operatörünün çevirisini uygular. [Nullable](../nullable/) tipi için özelleştirme. |
| static [Is](./is/)(const char16_t *) | 'is' operatörünün çevirisini uygular. Dize sabiti için özelleştirme. |
| static [Is](./is/)(int32_t) | 'is' operatörünün çevirisini uygular. Tam sayı sabiti için özelleştirme. |
| static [IsBoxedValue](./isboxedvalue/)(const SmartPtr\<Object\>\&) | Nesnenin kutulanmış bir değer olup olmadığını denetler. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | [Object](../object/) nesnesini bilinmeyen tipe dönüştürür, hem akıllı işaretçi tipini hem de kutulanmış değer durumlarını ele alır. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | [Object](../object/) nesnesini bilinmeyen tipe dönüştürür, hem akıllı işaretçi tipini hem de kutulanmış değer durumlarını ele alır. |
| static [ToString](./tostring/)(const char_t *) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi. |
| static [ToString](./tostring/)(const Nullable\<T\>\&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi. |
| static [ToString](./tostring/)(const T\&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi. |
| static [ToString](./tostring/)(const T\&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi. |
| static [ToString](./tostring/)(T\&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi. |
| static [ToString](./tostring/)(T\&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi. |
| static [ToString](./tostring/)(T\&&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi. |
| static [ToString](./tostring/)(T\&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi. |
| static [ToString](./tostring/)(const T\&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi. |
| static [ToString](./tostring/)(T\&&) | Herhangi bir C++ tipinde çalışması için C# ToString metodunun ikamesi. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | [Object](../object/) tipine dönüştürdükten sonra değer tiplerini kutudan çıkarır. Enum tipleri için uygulama. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | [Object](../object/) tipine dönüştürdükten sonra değer tiplerini kutudan çıkarır. Enum olmayan ve nullable olmayan tipler için uygulama. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | [Object](../object/) tipine dönüştürdükten sonra değer tiplerini kutudan çıkarır. Enum olmayan ve nullable olmayan tipler için uygulama. |
| static [Unbox](./unbox/)(E) | Enum tiplerini tam sayıya kutudan çıkarır. |
| static [Unbox](./unbox/)(E) | Enum tiplerini dönüştürür. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Dize değerlerini kutudan çıkarır. |
| static [UnboxStringSafe](./unboxstringsafe/)(const SmartPtr\<Object\>\&) | Kutulanmış değerden dizeyi kutudan çıkarır. |
| static [UnboxToNullable](./unboxtonullable/)(const SmartPtr\<Object\>\&, bool) | Nesneyi nullable tipe kutudan çıkarır. |
| static [UnknownIsNull](./unknownisnull/)(T) | Bilinmeyen tip nesnesinin nullptr olup olmadığını denetler. Skaler olmayan tipler için aşırı yükleme. |
| static [UnknownIsNull](./unknownisnull/)(T) | Bilinmeyen tip nesnesinin nullptr olup olmadığını denetler. Skaler tipler için aşırı yükleme. |
| static [UnknownToObject](./unknowntoobject/)(T) | Bilinmeyen tipi [Object](../object/) tipine dönüştürür, hem akıllı işaretçi tipini hem de değer tipi durumlarını ele alır. |
| static [UnknownToObject](./unknowntoobject/)(const T\&) | Bilinmeyen tipi [Object](../object/) tipine dönüştürür, hem akıllı işaretçi tipini hem de değer tipi durumlarını ele alır. |
## Ayrıca Bakınız

* Class [ObjectType](../objecttype/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
