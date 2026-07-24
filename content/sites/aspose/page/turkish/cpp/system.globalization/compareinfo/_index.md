---
title: "System::Globalization::CompareInfo class"
linktitle: "CompareInfo"
second_title: "Aspose.Page için C++"
description: "System::Globalization::CompareInfo sınıfı. Kültüre duyarlı dize karşılaştırması yapar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 400
url: /tr/cpp/system.globalization/compareinfo/
---
## CompareInfo class


Kültüre duyarlı dize karşılaştırması yapar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class CompareInfo : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Compare](./compare/)(const String\&, const String\&) const | Dizeleri karşılaştırır. Henüz uygulanmadı. |
| virtual [Compare](./compare/)(const String\&, const String\&, CompareOptions) const | Dizeleri karşılaştırır. Yalnızca Ordinal ve OrdinalIgnoreCase modları desteklenir. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int) const | Bir dizenin bir bölümünü ikinci dizenin bir bölümüyle karşılaştırır. Henüz uygulanmadı. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int, CompareOptions) const | Bir dizenin son bölümünü ikinci dizenin son bölümüyle dize karşılaştırma yöntemleri kullanarak karşılaştırır. Henüz uygulanmadı. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int) const | Bir dizenin son bölümünü ikinci dizenin son bölümüyle karşılaştırır. Henüz uygulanmadı. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int, CompareOptions) const | Bir dizenin bir bölümünü ikinci dizenin bir bölümüyle dize karşılaştırma yöntemleri kullanarak karşılaştırır. Henüz uygulanmadı. |
| [CompareInfo](./compareinfo/)(const CompareInfo\&) | RTTI bilgisi. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LCID](./get_lcid/)() const | Karşılaştırıcıyla ilişkili kültürün LCID'sini alır. |
| virtual [get_Name](./get_name/)() const | Karşılaştırıcıyla ilişkili kültürün adını alır. |
| [get_Version](./get_version/)() const | Sıralama sürümü hakkında bilgi alır. |
| static [GetCompareInfo](./getcompareinfo/)(int, const SharedPtr\<Reflection::Assembly\>\&) | Belirtilen kültürle ilişkili [CompareInfo](./) alır ve belirtilen derlemedeki dize karşılaştırma yöntemlerini kullanır. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | Belirtilen kültürle ilişkili [CompareInfo](./) alır ve belirtilen derlemedeki dize karşılaştırma yöntemlerini kullanır. |
| static [GetCompareInfo](./getcompareinfo/)(int) | Belirtilen kültürle ilişkili [CompareInfo](./) alır. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&) | Belirtilen kültürle ilişkili [CompareInfo](./) alır. |
| virtual [GetHashCode](./gethashcode/)(const String\&, CompareOptions) const | Belirtilen karşılaştırma seçeneklerine göre dize karma kodunu alır. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hashlenmesini sağlar. |
| virtual [GetSortKey](./getsortkey/)(const String\&, CompareOptions) const | Belirtilen karşılaştırma seçeneklerini kullanarak belirtilen dize için [SortKey](../sortkey/) nesnesini alır. |
| virtual [GetSortKey](./getsortkey/)(const String\&) const | Belirtilen dize için [SortKey](../sortkey/) nesnesini alır. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int) const | Alt dizeyi arar. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, CompareOptions) const | Alt dizeyi arar. Yalnızca Sıralı (Ordinal) modu desteklenir. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int, CompareOptions) const | Alt dizeyi arar. Yalnızca Sıralı (Ordinal) modu desteklenir. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int, CompareOptions) const | Belirtilen karakteri arar. Yalnızca Sıralı (Ordinal) modu desteklenir. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int) const | Alt dizeyi arar. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t) const | Belirtilen karakteri arar. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&) const | Alt dizeyi arar. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, CompareOptions) const | Belirtilen karakteri arar. Yalnızca Sıralı (Ordinal) modu desteklenir. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int) const | Belirtilen karakteri arar. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int) const | Belirtilen karakteri arar. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, CompareOptions) const | Alt dizeyi arar. Yalnızca Sıralı (Ordinal) modu desteklenir. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, CompareOptions) const | Belirtilen karakteri arar. Yalnızca Sıralı (Ordinal) modu desteklenir. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&, CompareOptions) const | Belirtilen karşılaştırma seçeneklerini kullanarak belirtilen dize belirtilen önek ile başlayıp başlamadığını kontrol eder. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&) const | Belirtilen dize belirtilen önek ile başlayıp başlamadığını kontrol eder. |
| static [IsSortable](./issortable/)(char16_t) | Belirtilen bir karakterin sıralanabilir olup olmadığını kontrol eder. |
| static [IsSortable](./issortable/)(const String\&) | Belirtilen bir dizeyin sıralanabilir olup olmadığını kontrol eder. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&, CompareOptions) const | Belirtilen karşılaştırma seçeneklerini kullanarak belirtilen dize belirtilen sonek ile bitip bitmediğini kontrol eder. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&) const | Belirtilen dize belirtilen sonek ile bitip bitmediğini kontrol eder. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&) const | Belirtilen alt dizeyin son oluşumunu arar. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int, CompareOptions) const | Belirtilen karşılaştırma seçeneklerini kullanarak belirtilen alt dizeyin son oluşumunu arar. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int, CompareOptions) const | Belirtilen karşılaştırma seçeneklerini kullanarak belirtilen karakterin son oluşumunu arar. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int) const | Belirtilen dizeyin son oluşumunu arar. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, CompareOptions) const | Belirtilen karşılaştırma seçeneklerini kullanarak belirtilen dizeyin son oluşumunu arar. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, CompareOptions) const | Belirtilen karşılaştırma seçeneklerini kullanarak belirtilen karakterin son oluşumunu arar. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int) const | Belirtilen dizeyin son oluşumunu arar. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int) const | Belirtilen karakterin son oluşumunu arar. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, CompareOptions) const | Belirtilen karşılaştırma seçeneklerini kullanarak belirtilen dizeyin son oluşumunu arar. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, CompareOptions) const | Belirtilen karşılaştırma seçeneklerini kullanarak belirtilen karakterin son oluşumunu arar. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t) const | Belirtilen karakterin son oluşumunu arar. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int) const | Belirtilen karakterin son oluşumunu arar. |
| [operator=](./operator=/)(const CompareInfo\&) |  |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
