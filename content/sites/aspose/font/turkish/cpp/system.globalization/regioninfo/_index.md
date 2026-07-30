---
title: "System::Globalization::RegionInfo class"
linktitle: "RegionInfo"
second_title: "Aspose.Font için C++"
description: "System::Globalization::RegionInfo class. Bölge hakkında bilgi sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2100
url: /tr/cpp/system.globalization/regioninfo/
---
## RegionInfo class


Bölge hakkında bilgi sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class RegionInfo : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_CurrencyEnglishName](./get_currencyenglishname/)() const | Para biriminin İngilizce adını alır. |
| virtual [get_CurrencyNativeName](./get_currencynativename/)() const | Para biriminin yerel adını alır. |
| virtual [get_CurrencySymbol](./get_currencysymbol/)() const | Para birimi simgesini alır. |
| static [get_CurrentRegion](./get_currentregion/)() | Sistemde ayarlanan bölgeyi alır. |
| virtual [get_DisplayName](./get_displayname/)() const | Bölgenin tam adını alır. |
| virtual [get_EnglishName](./get_englishname/)() const | Bölgenin İngilizce adını alır. |
| virtual [get_GeoId](./get_geoid/)() const | Bir bölge için benzersiz tanımlayıcıyı alır. |
| virtual [get_IsMetric](./get_ismetric/)() const | Bölgenin metrik sistem kullanıp kullanmadığını kontrol eder. |
| virtual [get_ISOCurrencySymbol](./get_isocurrencysymbol/)() const | ISO para birimi simgesini alır. |
| virtual [get_Name](./get_name/)() const | Bölge adını alır. |
| virtual [get_NativeName](./get_nativename/)() const | Bölgenin yerel adını alır. |
| virtual [get_ThreeLetterISORegionName](./get_threeletterisoregionname/)() const | 3 harflik ISO bölge kodunu alır. |
| virtual [get_ThreeLetterWindowsRegionName](./get_threeletterwindowsregionname/)() const | 3 harflik [Windows](../../system.windows/) bölge kodunu alır. |
| virtual [get_TwoLetterISORegionName](./get_twoletterisoregionname/)() const | 2 harflik ISO bölge kodunu alır. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| [operator=](./operator=/)(const RegionInfo\&) |  |
| [RegionInfo](./regioninfo/)(const String\&) | RTTI bilgisi. |
| [RegionInfo](./regioninfo/)(int) | Yapıcı. |
| [RegionInfo](./regioninfo/)(const RegionInfo\&) |  |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
