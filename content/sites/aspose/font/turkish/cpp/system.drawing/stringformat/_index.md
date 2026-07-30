---
title: "System::Drawing::StringFormat sınıfı"
linktitle: "StringFormat"
second_title: "Aspose.Font için C++"
description: "System::Drawing::StringFormat sınıfı. Metin yerleşim bilgilerini, görüntü manipülasyonlarını ve OpenType özelliklerini kapsar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tür bir örnek, yığıt (stack) üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Her zaman bu sınıfı System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2500
url: /tr/cpp/system.drawing/stringformat/
---
## StringFormat class


Metin yerleşim bilgilerini, görüntü manipülasyonlarını ve OpenType özelliklerini kapsar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class StringFormat : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() | Geçerli nesnenin tam bir kopyasını döndürür. |
| [get_Alignment](./get_alignment/)() const | Dizgenin yatay hizalamasını gösteren bir değer döndürür. |
| [get_DigitSubstitutionLanguage](./get_digitsubstitutionlanguage/)() const | Yerel rakamlar batı rakamlarıyla değiştirildiğinde kullanılan dili gösteren bir değer döndürür. |
| [get_DigitSubstitutionMethod](./get_digitsubstitutionmethod/)() const | Rakam ikame yöntemini döndürür. |
| [get_FormatFlags](./get_formatflags/)() const | Geçerli nesne tarafından temsil edilen dize biçimini belirten [StringFormatFlags](../stringformatflags/) öğesinin bit düzeyinde bir birleşimini döndürür. |
| static [get_GenericDefault](./get_genericdefault/)() | Genel bir varsayılan biçimi temsil eden bir [StringFormat](./) nesnesi döndürür. |
| static [get_GenericTypographic](./get_generictypographic/)() | Genel bir tipografik biçimi temsil eden bir [StringFormat](./) nesnesi döndürür. |
| [get_HotkeyPrefix](./get_hotkeyprefix/)() const | Kısayol tuşu önekinin nasıl gösterileceğini belirten değeri döndürür. |
| [get_LineAlignment](./get_linealignment/)() const | Dizgenin dikey hizalamasını gösteren bir değer döndürür. |
| [get_Trimming](./get_trimming/)() const | Dizgenin nasıl kırpıldığını gösteren bir değer döndürür. |
| [GetCharacterRangesCount](./getcharacterrangescount/)() const | [CharacterRange](../characterrange/) dizisinin boyutunu alır. |
| [GetTabStops](./gettabstops/)(float\&) const | Geçerli [StringFormat](./) nesnesi için sekme duraklarını döndürür. |
| [set_Alignment](./set_alignment/)(StringAlignment) | Dizgenin yatay hizalamasını ayarlar. |
| [set_FormatFlags](./set_formatflags/)(StringFormatFlags) | Dize biçim bayraklarını ayarlar. |
| [set_HotkeyPrefix](./set_hotkeyprefix/)(Text::HotkeyPrefix) | Kısayol tuşu önekinin nasıl gösterileceğini belirten değeri ayarlar. |
| [set_LineAlignment](./set_linealignment/)(StringAlignment) | Dizgenin dikey hizalamasını ayarlar. |
| [set_Trimming](./set_trimming/)(StringTrimming) | Dizgenin nasıl kırpılacağını belirten bir değeri ayarlar. |
| [SetDigitSubstitution](./setdigitsubstitution/)(int32_t, StringDigitSubstitute) | Rakam ikame dili ve yöntemini ayarlar. |
| [SetMeasurableCharacterRanges](./setmeasurablecharacterranges/)(const ArrayPtr\<CharacterRange\>\&) | [CharacterRange](../characterrange/) nesnelerinden oluşan bir dizi ayarlar; bu nesneler MeasureCharacterRanges() yöntemi çağrısı ile ölçülen karakter aralıklarını temsil eder. |
| [SetTabStops](./settabstops/)(float, const ArrayPtr\<float\>\&) | Geçerli [StringFormat](./) nesnesi için sekme duraklarını ayarlar. |
| [StringFormat](./stringformat/)() | [StringFormat](./) sınıfının yeni bir örneğini oluşturur. |
| [StringFormat](./stringformat/)(StringFormatFlags, int32_t) | Belirtilen biçim bayrakları ve dil ile [StringFormat](./) sınıfının yeni bir örneğini oluşturur. |
| [StringFormat](./stringformat/)(const SharedPtr\<StringFormat\>\&) | Kopya yapıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
