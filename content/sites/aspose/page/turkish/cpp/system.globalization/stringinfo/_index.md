---
title: "System::Globalization::StringInfo sınıfı"
linktitle: "StringInfo"
second_title: "Aspose.Page için C++"
description: "System::Globalization::StringInfo sınıfı. Dize bölümlerini yinelemek için Splitter. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2400
url: /tr/cpp/system.globalization/stringinfo/
---
## StringInfo class


Dize bölümlerini yinelemek için Splitter. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class StringInfo : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LengthInTextElements](./get_lengthintextelements/)() const | [StringInfo](./) nesnesindeki metin öğelerinin sayısını alır. |
| [get_String](./get_string/)() const | [StringInfo](./) nesnesinin değerini alır. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hashlenmesini sağlar. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&) | Belirtilen dizedeki ilk öğeyi alır. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&, int) | Belirtilen dizedeki belirtilen indeksteki öğeyi alır. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&) | Dizenin karakterlerini yinelemek için bir enumerator oluşturur. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&, int) | Belirtilen indeksten başlayarak dizenin karakterlerini yinelemek için bir enumerator oluşturur. |
| [operator=](./operator=/)(const StringInfo\&) |  |
| static [ParseCombiningCharacters](./parsecombiningcharacters/)(const String\&) | Temel karakterlerin, yüksek surrogların ve kontrol karakterlerinin indekslerini alır. |
| [set_String](./set_string/)(const String\&) | [StringInfo](./) nesnesinin değerini ayarlar. |
| [StringInfo](./stringinfo/)() | RTTI bilgisi. |
| [StringInfo](./stringinfo/)(const String\&) | Yapıcı. |
| [StringInfo](./stringinfo/)(const StringInfo\&) |  |
| [SubstringByTextElements](./substringbytextelements/)(int) const | Belirtilen metin öğesinden son metin öğesine kadar metin öğelerinin alt dizisini alır. |
| [SubstringByTextElements](./substringbytextelements/)(int, int) const | Belirtilen metin öğesinden belirtilen sayıda metin öğesine kadar metin öğelerinin alt dizisini alır. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
