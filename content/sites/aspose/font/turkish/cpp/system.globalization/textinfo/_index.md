---
title: "System::Globalization::TextInfo class"
linktitle: "TextInfo"
second_title: "Aspose.Font için C++"
description: "System::Globalization::TextInfo class. Yerel ayarlara özgü metin özelliklerini tanımlar. Ayarlayıcı (setter) işlemleri yalnızca yalnızca okunamayan (read-only olmayan) nesnelerde etkinleştirilir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2800
url: /tr/cpp/system.globalization/textinfo/
---
## TextInfo class


Yerel ayara özgü metin özelliklerini tanımlar. Ayarlayıcı işlemler yalnızca okuma korumalı olmayan nesneler üzerinde etkinleştirilir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class TextInfo : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() override | RTTI bilgisi. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_ANSICodePage](./get_ansicodepage/)() const | ANSI kod sayfasını alır. |
| [get_CultureName](./get_culturename/)() const | Kültür adını alır. |
| virtual [get_EBCDICCodePage](./get_ebcdiccodepage/)() const | EBCDIC kod sayfasını alır. |
| [get_IsReadOnly](./get_isreadonly/)() const | Biçimin yalnızca okunur olup olmadığını denetler. |
| [get_IsRightToLeft](./get_isrighttoleft/)() const | Metnin soldan sağa yazılıp yazılmadığını kontrol eder. |
| [get_LCID](./get_lcid/)() const | Yerel ayar kimliğini alır. |
| virtual [get_ListSeparator](./get_listseparator/)() const | Liste ayırıcıyı alır. |
| virtual [get_MacCodePage](./get_maccodepage/)() const | Macintosh kod sayfasını alır. |
| virtual [get_OEMCodePage](./get_oemcodepage/)() const | OEM kod sayfasını alır. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| [operator=](./operator=/)(const TextInfo\&) |  |
| static [ReadOnly](./readonly/)(const TextInfoPtr\&) | Kültürün yalnızca okunabilir bir sürümünü alır. |
| virtual [set_ListSeparator](./set_listseparator/)(String) | Liste ayırıcıyı ayarlar. |
| [TextInfo](./textinfo/)(const TextInfo\&) | RTTI bilgisi. |
| virtual [ToLower](./tolower/)(char_t) const | Karakteri küçük harfe dönüştürür. |
| virtual [ToLower](./tolower/)(String) const | Dizgiyi küçük harfe dönüştürür. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| [ToTitleCase](./totitlecase/)(String) const | Dizgiyi başlık biçimine dönüştürür (zaten büyük harfle yazılmış kısaltmalar hariç). |
| virtual [ToUpper](./toupper/)(char_t) const | Karakteri büyük harfe dönüştürür. |
| virtual [ToUpper](./toupper/)(String) const | Dizgiyi büyük harfe dönüştürür. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
