---
title: "System::Globalization::EastAsianLunisolarCalendar 类"
linktitle: "EastAsianLunisolarCalendar"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::EastAsianLunisolarCalendar 类。东亚阴阳历。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 800
url: /zh/cpp/system.globalization/eastasianlunisolarcalendar/
---
## EastAsianLunisolarCalendar class


东亚阴阳历。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class EastAsianLunisolarCalendar : public System::Globalization::Calendar
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_AlgorithmType](./get_algorithmtype/)() const override | RTTI 信息。 |
| [GetCelestialStem](./getcelestialstem/)(int) const | 获取天干。 |
| virtual [GetSexagenaryYear](./getsexagenaryyear/)(DateTime) const | 获取六十年循环中的年份。 |
| [GetTerrestrialBranch](./getterrestrialbranch/)(int) const | 获取地支。 |
## 另见

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
