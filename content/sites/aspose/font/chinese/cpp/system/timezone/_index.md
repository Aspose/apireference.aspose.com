---
title: "System::TimeZone class"
linktitle: "TimeZone"
second_title: "Aspose.Font 适用于 C++"
description: "System::TimeZone 类。表示一个时区。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 6200
url: /zh/cpp/system/timezone/
---
## TimeZone class


表示一个时区。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class TimeZone : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [get_CurrentTimeZone](./get_currenttimezone/)() | 返回一个表示当前时区的 [TimeZone](./) 类的新实例。 |
| virtual [get_DaylightName](./get_daylightname/)() const | 返回当前对象所表示时区的夏令时名称。 |
| virtual [get_StandardName](./get_standardname/)() const | 返回当前对象所表示时区的标准时间名称。 |
| virtual [GetDaylightChanges](./getdaylightchanges/)(int32_t) | 返回特定年份的夏令时期间。 |
| virtual [GetUtcOffset](./getutcoffset/)(DateTime) | 返回指定本地时间的 UTC 偏移量。 |
| virtual [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) | 确定指定的 [DateTime](../datetime/) 对象所表示的日期时间值是否位于当前 [TimeZone](./) 对象所表示时区的夏令时范围内。 |
## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
