---
title: "System::TimeZoneInfo::AdjustmentRule 类"
linktitle: "AdjustmentRule"
second_title: "Aspose.Font 适用于 C++"
description: "System::TimeZoneInfo::AdjustmentRule 类。提供有关时区调整的信息。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 3300
url: /zh/cpp/system/timezoneinfo/adjustmentrule/
---
## AdjustmentRule class


提供有关时区调整的信息。此类的对象只能使用 [System::MakeObject()](../../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class AdjustmentRule : public System::IEquatable<AdjustmentRulePtr>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) | 构造一个 [AdjustmentRule](./) 类的实例，该实例表示使用指定参数描述的时间调整规则。 |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) | 构造一个 [AdjustmentRule](./) 类的实例，该实例表示使用指定参数描述的时间调整规则。 |
| [Equals](./equals/)(AdjustmentRulePtr) override |  |
| [get_BaseUtcOffsetDelta](./get_baseutcoffsetdelta/)() const | 返回相对于默认 UTC 偏移量的增量。 |
| [get_DateEnd](./get_dateend/)() const | 返回一个 [DateTime](../../datetime/) 对象，表示调整规则失效的日期和时间。 |
| [get_DateStart](./get_datestart/)() const | 返回一个 [DateTime](../../datetime/) 对象，表示调整规则生效的日期和时间。 |
| [get_DaylightDelta](./get_daylightdelta/)() const | 返回一个 [TimeSpan](../../timespan/) 对象，表示时区形成夏令时所需的时间量。 |
| [get_DaylightTransitionEnd](./get_daylighttransitionend/)() const | 返回关于从标准时间到夏令时的转换信息。 |
| [get_DaylightTransitionStart](./get_daylighttransitionstart/)() const | 返回关于从夏令时到标准时间的转换信息。 |
| [get_HasDaylightSaving](./get_hasdaylightsaving/)() const | 仅供内部使用。 |
| [GetHashCode](./gethashcode/)() const override | C# 中 [Object.GetHashCode()](../../object/gethashcode/) 方法的类似实现。启用自定义对象的哈希功能。 |
## 另见

* Class [IEquatable](../../iequatable/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
