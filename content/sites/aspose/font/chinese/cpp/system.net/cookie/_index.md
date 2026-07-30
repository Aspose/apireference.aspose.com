---
title: "System::Net::Cookie 类"
linktitle: "Cookie"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Cookie 类。表示一个 HTTP cookie。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 100
url: /zh/cpp/system.net/cookie/
---
## Cookie class


表示一个 HTTP cookie。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Cookie : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() | 创建当前实例的副本。 |
| [Cookie](./cookie/)() | 构造一个新实例。 |
| [Cookie](./cookie/)(String, String) | 构造一个新实例。 |
| [Cookie](./cookie/)(String, String, String) | 构造一个新实例。 |
| [Cookie](./cookie/)(String, String, String, String) | 构造一个新实例。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| [get_Comment](./get_comment/)() const | 获取 'Comment' 属性的值。 |
| [get_CommentUri](./get_commenturi/)() const | 获取 'CommentURL' 属性的值。 |
| [get_Discard](./get_discard/)() const | 获取 'Discard' 属性的值。 |
| [get_Domain](./get_domain/)() const | 获取 'Domain' 属性的值。 |
| [get_DomainImplicit](./get_domainimplicit/)() | 获取一个值，指示域是否为隐式。 |
| [get_DomainKey](./get_domainkey/)() const | 返回域键。 |
| [get_Expired](./get_expired/)() | 获取一个值，指示 cookie 是否已过期。 |
| [get_Expires](./get_expires/)() | 获取 'Expires' 属性的值。 |
| [get_HttpOnly](./get_httponly/)() const | 获取 'HttpOnly' 属性的值。 |
| [get_Name](./get_name/)() const | 获取 cookie 的名称。 |
| [get_Path](./get_path/)() const | 获取 'Path' 属性的值。 |
| [get_Plain](./get_plain/)() const | 返回一个值，指示 cookie 规范是否为 'Plain'。 |
| [get_Port](./get_port/)() const | 获取 'Port' 属性的值。 |
| [get_PortList](./get_portlist/)() const | 返回 'Port' 属性的值集合。 |
| [get_Secure](./get_secure/)() const | 获取 'Secure' 属性的值。 |
| [get_TimeStamp](./get_timestamp/)() const | 返回 cookie 创建的时间。 |
| [get_Value](./get_value/)() const | 获取 cookie 的值。 |
| [get_Variant](./get_variant/)() const | 获取 cookie 的规范。 |
| [get_Version](./get_version/)() const | 获取 '[Version](../../system/version/)' 属性的值。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| [InternalSetName](./internalsetname/)(String) | 此方法被其他方法调用以设置方法名。 |
| [set_Comment](./set_comment/)(String) | 设置 'Comment' 属性的值。 |
| [set_CommentUri](./set_commenturi/)(System::SharedPtr\<Uri\>) | 设置 'CommentURL' 属性的值。 |
| [set_Discard](./set_discard/)(bool) | 设置 'Discard' 属性的值。 |
| [set_Domain](./set_domain/)(String) | 设置 'Domain' 属性的值。 |
| [set_DomainImplicit](./set_domainimplicit/)(bool) | 设置指示域是否隐式的值。 |
| [set_Expired](./set_expired/)(bool) | 设置指示 cookie 是否已过期的值。 |
| [set_Expires](./set_expires/)(DateTime) | 设置 'Expires' 属性的值。 |
| [set_HttpOnly](./set_httponly/)(bool) | 设置 'HttpOnly' 属性的值。 |
| [set_Name](./set_name/)(String) | 设置 cookie 的名称。 |
| [set_Path](./set_path/)(String) | 设置 'Path' 属性的值。 |
| [set_Port](./set_port/)(String) | 设置 'Port' 属性的值。 |
| [set_Secure](./set_secure/)(bool) | 设置 'Secure' 属性的值。 |
| [set_Value](./set_value/)(String) | 设置 cookie 的值。 |
| [set_Variant](./set_variant/)(CookieVariant) | 设置 cookie 的规范。 |
| [set_Version](./set_version/)(int32_t) | 设置 '[Version](../../system/version/)' 属性的值。 |
| [ToServerString](./toserverstring/)() | 将当前实例序列化为字符串表示形式。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
| [VerifySetDefaults](./verifysetdefaults/)(CookieVariant, System::SharedPtr\<Uri\>, bool, String, bool, bool) | 验证并设置默认属性的值。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [CommentAttributeName](./commentattributename/) | 'Comment' 属性的名称。 |
| static [CommentUrlAttributeName](./commenturlattributename/) | 'CommentURL' 属性的名称。 |
| static [DiscardAttributeName](./discardattributename/) | 'Discard' 属性的名称。 |
| static [DomainAttributeName](./domainattributename/) | 'Domain' 属性的名称。 |
| static [EqualsLiteral](./equalsliteral/) | 用于分隔属性名称和值的分隔符。 |
| static [ExpiresAttributeName](./expiresattributename/) | 'Expires' 属性的名称。 |
| static [HttpOnlyAttributeName](./httponlyattributename/) | 'HttpOnly' 属性的名称。 |
| static [MaxAgeAttributeName](./maxageattributename/) | 'Max-Age' 属性的名称。 |
| static [MaxSupportedVersion](./maxsupportedversion/) | RTTI 信息。 |
| static [MaxSupportedVersionString](./maxsupportedversionstring/) | 最大支持版本的字符串表示形式。 |
| static [PathAttributeName](./pathattributename/) | 'Path' 属性的名称。 |
| static [PortAttributeName](./portattributename/) | 'Port' 属性的名称。 |
| static [PortSplitDelimiters](./portsplitdelimiters/) | 包含 'Port' 属性值分隔符的数组。 |
| static [QuotesLiteral](./quotesliteral/) | 用于包装属性各部分的符号。 |
| static [ReservedToName](./reservedtoname/) | 为 cookie 名称保留的值。 |
| static [ReservedToValue](./reservedtovalue/) | 为 cookie 值保留的值。 |
| static [SecureAttributeName](./secureattributename/) | 'Secure' 属性的名称。 |
| static [SeparatorLiteral](./separatorliteral/) | 属性分隔符。 |
| static [SpecialAttributeLiteral](./specialattributeliteral/) | 特殊属性名称的前缀。 |
| static [VersionAttributeName](./versionattributename/) | '[Version](../../system/version/)' 属性的名称。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
