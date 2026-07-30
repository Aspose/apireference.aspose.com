---
title: "System::Globalization::CultureInfo 类"
linktitle: "CultureInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::CultureInfo 类。收集特定于文化的值和算法。仅在非只读对象上启用设置操作。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 500
url: /zh/cpp/system.globalization/cultureinfo/
---
## CultureInfo class


收集特定于文化的值和算法。仅在非只读对象上启用设置操作。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class CultureInfo : public virtual System::Object,
                    public System::IFormatProvider,
                    public System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ClearCachedData](./clearcacheddata/)() | 刷新缓存的文化信息。 |
| [Clone](./clone/)() override | 克隆文化信息。 |
| static [CreateSpecificCulture](./createspecificculture/)(const String\&) | 按名称创建文化。 |
| explicit [CultureInfo](./cultureinfo/)(int) | RTTI 信息。 |
| [CultureInfo](./cultureinfo/)(int, bool) | 构造函数。 |
| explicit [CultureInfo](./cultureinfo/)(const String\&) | 构造函数。 |
| [CultureInfo](./cultureinfo/)(const String\&, bool) | 构造函数。 |
| [CultureInfo](./cultureinfo/)(std::nullptr_t) | 始终抛出 ArgumentNullException。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 比较对象。 |
| virtual [get_Calendar](./get_calendar/)() const | 获取该文化使用的日历。 |
| virtual [get_CompareInfo](./get_compareinfo/)() const | 获取遵循文化规则的字符串比较器。 |
| [get_CultureTypes](./get_culturetypes/)() const | 获取描述当前文化的文化类型的按位联合。 |
| static [get_CurrentCulture](./get_currentculture/)() | 获取为当前线程设置的文化。 |
| static [get_CurrentUICulture](./get_currentuiculture/)() | 获取当前线程的 UI 文化。 |
| virtual [get_DateTimeFormat](./get_datetimeformat/)() const | 获取日期格式信息。 |
| static [get_DefaultThreadCurrentCulture](./get_defaultthreadcurrentculture/)() | 获取当前应用程序域中的默认文化。 |
| static [get_DefaultThreadCurrentUICulture](./get_defaultthreadcurrentuiculture/)() | 获取当前应用程序域中的默认 UI 文化。 |
| virtual [get_DisplayName](./get_displayname/)() const | 获取文化的显示名称。 |
| virtual [get_EnglishName](./get_englishname/)() const | 获取文化的英文名称。 |
| [get_IetfLanguageTag](./get_ietflanguagetag/)() const | 获取语言的 RFC 4646 名称。 |
| static [get_InstalledUICulture](./get_installeduiculture/)() | 获取随操作系统安装的文化。 |
| static [get_InvariantCulture](./get_invariantculture/)() | 获取不变文化。 |
| virtual [get_IsNeutralCulture](./get_isneutralculture/)() const | 检查文化是否为中性。 |
| [get_IsReadOnly](./get_isreadonly/)() const | 检查文化对象是否为只读。 |
| virtual [get_KeyboardLayoutId](./get_keyboardlayoutid/)() const | 获取活动输入区域标识符。 |
| virtual [get_LCID](./get_lcid/)() const | 获取文化标识符。 |
| virtual [get_Name](./get_name/)() const | 获取文化名称。 |
| virtual [get_NativeName](./get_nativename/)() const | 获取区域性本地名称。 |
| virtual [get_NumberFormat](./get_numberformat/)() const | 获取数字格式信息。 |
| virtual [get_OptionalCalendars](./get_optionalcalendars/)() const | 可与该区域性一起使用的日历列表。 |
| virtual [get_Parent](./get_parent/)() const | 获取父区域性。 |
| virtual [get_TextInfo](./get_textinfo/)() const | 获取该区域性使用的文本参数。 |
| virtual [get_ThreeLetterISOLanguageName](./get_threeletterisolanguagename/)() const | 获取三字母 ISO 639-2 语言代码。 |
| virtual [get_ThreeLetterWindowsLanguageName](./get_threeletterwindowslanguagename/)() const | 获取在 [Windows](../../system.windows/) API 中定义的语言三字母代码。 |
| virtual [get_TwoLetterISOLanguageName](./get_twoletterisolanguagename/)() const | 获取与该区域性关联的两字母 ISO 语言名称。 |
| [get_UseUserOverride](./get_useuseroverride/)() const | 获取指示 [CultureInfo](./) 是否使用用户选择的区域性设置的标志。 |
| [GetConsoleFallbackUICulture](./getconsolefallbackuiculture/)() const | 获取适用于控制台应用程序的备用区域性。 |
| static [GetCultureInfo](./getcultureinfo/)(const String\&) | 通过名称获取区域性。等同于 CreateSpecificCulture。 |
| static [GetCultureInfo](./getcultureinfo/)(const String\&, const String\&) | 通过名称获取区域性。 |
| static [GetCultureInfo](./getcultureinfo/)(int32_t) | 通过 ID 获取区域性。 |
| static [GetCultureInfoByIetfLanguageTag](./getcultureinfobyietflanguagetag/)(const String\&) | 已弃用。通过指定的 RFC 4646 语言标签获取只读的 [CultureInfo](./) 对象。 |
| static [GetCultures](./getcultures/)(CultureTypes) | 获取属于指定类型的区域性。 |
| [GetFormat](./getformat/)(const TypeInfo\&) override | 获取特定类型的格式对象。 |
| [GetHashCode](./gethashcode/)() const override | 返回对象哈希码。 |
| [IsInherited](./isinherited/)() const | 获取是否继承的标志。仅供内部使用。 |
| [operator=](./operator=/)(const CultureInfo\&) |  |
| [operator==](./operator==/)(const CultureInfo\&) const | 比较区域性参数。 |
| static [ReadOnly](./readonly/)(const CultureInfoPtr\&) | 获取只读的文化版本。 |
| static [set_CurrentCulture](./set_currentculture/)(const CultureInfoPtr\&) | 为当前线程设置区域性。 |
| static [set_CurrentUICulture](./set_currentuiculture/)(const CultureInfoPtr\&) | 设置当前线程的 UI 区域性。 |
| virtual [set_DateTimeFormat](./set_datetimeformat/)(DateTimeFormatInfoPtr) | 设置日期格式信息。 |
| static [set_DefaultThreadCurrentCulture](./set_defaultthreadcurrentculture/)(const CultureInfoPtr\&) | 在当前应用程序域中设置默认区域性。 |
| static [set_DefaultThreadCurrentUICulture](./set_defaultthreadcurrentuiculture/)(const CultureInfoPtr\&) | 在当前应用程序域中设置默认 UI 区域性。 |
| virtual [set_NumberFormat](./set_numberformat/)(NumberFormatInfoPtr) | 获取数字格式信息。 |
| [ToString](./tostring/)() const override | 将区域性转换为字符串。 |
## 另见

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
