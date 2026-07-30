---
title: "System::Globality::RegionInfo 类"
linktitle: "RegionInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::RegionInfo 类。提供区域信息。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 2100
url: /zh/cpp/system.globalization/regioninfo/
---
## RegionInfo class


提供有关地区的信息。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class RegionInfo : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_CurrencyEnglishName](./get_currencyenglishname/)() const | 获取货币的英文名称。 |
| virtual [get_CurrencyNativeName](./get_currencynativename/)() const | 获取货币的本地名称。 |
| virtual [get_CurrencySymbol](./get_currencysymbol/)() const | 获取货币符号。 |
| static [get_CurrentRegion](./get_currentregion/)() | 获取系统中设置的地区。 |
| virtual [get_DisplayName](./get_displayname/)() const | 获取完整的地区名称。 |
| virtual [get_EnglishName](./get_englishname/)() const | 获取地区的英文名称。 |
| virtual [get_GeoId](./get_geoid/)() const | 获取地区的唯一标识符。 |
| virtual [get_IsMetric](./get_ismetric/)() const | 检查地区是否使用公制系统。 |
| virtual [get_ISOCurrencySymbol](./get_isocurrencysymbol/)() const | 获取 ISO 货币符号。 |
| virtual [get_Name](./get_name/)() const | 获取地区名称。 |
| virtual [get_NativeName](./get_nativename/)() const | 获取地区的本地名称。 |
| virtual [get_ThreeLetterISORegionName](./get_threeletterisoregionname/)() const | 获取 3 字母 ISO 地区代码。 |
| virtual [get_ThreeLetterWindowsRegionName](./get_threeletterwindowsregionname/)() const | 获取 3 字母 [Windows](../../system.windows/) 地区代码。 |
| virtual [get_TwoLetterISORegionName](./get_twoletterisoregionname/)() const | 获取 2 字母 ISO 地区代码。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| [operator=](./operator=/)(const RegionInfo\&) |  |
| [RegionInfo](./regioninfo/)(const String\&) | RTTI 信息。 |
| [RegionInfo](./regioninfo/)(int) | 构造函数。 |
| [RegionInfo](./regioninfo/)(const RegionInfo\&) |  |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
