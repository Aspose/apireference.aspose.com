---
title: "System::Globalization::TaiwanCalendar sınıfı"
linktitle: "TaiwanCalendar"
second_title: "Aspose.Font için C++"
description: "System::Globalization::TaiwanCalendar sınıfı. Tayvan takvimi. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da operator new ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2500
url: /tr/cpp/system.globalization/taiwancalendar/
---
## TaiwanCalendar class


Tayvan takvimi. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da operator new ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class TaiwanCalendar : public System::Globalization::Calendar
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() override | RTTI bilgisi. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Algoritma türünü alır. |
| [get_Eras](./get_eras/)() const override | Takvimde mevcut olan dönemlerin listesini alır. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Takvim tarafından desteklenen en büyük zaman noktası. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Takvim tarafından desteklenen en küçük zaman noktası. |
| [GetDayOfMonth](./getdayofmonth/)(DateTime) const override | Belirtilen zaman noktası için ayın gününü alır. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Belirtilen zaman noktası için haftanın gününü alır. |
| [GetDayOfYear](./getdayofyear/)(DateTime) const override | Belirtilen zaman noktası için yılın gününü alır. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Belirli bir ay içindeki gün sayısını alır. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Belirli bir ay içindeki gün sayısını alır. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | Belirli bir yıldaki gün sayısını alır. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Belirli bir yıldaki gün sayısını alır. |
| [GetEra](./getera/)(DateTime) const override | Belirtilen zaman noktası için dönemi alır. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Belirtilen yıl için artık ayı alır. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Belirtilen yıl için artık ayı alır. |
| [GetMonth](./getmonth/)(DateTime) const override | Belirtilen zaman noktası için ayı alır. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Belirtilen yıldaki ay sayısını alır. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | RTTI bilgisi. |
| [GetYear](./getyear/)(DateTime) const override | Belirtilen zaman noktasının yılını alır. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Günün artık olup olmadığını kontrol eder. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Günün artık olup olmadığını kontrol eder. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Ayın artık olup olmadığını kontrol eder. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Ayın artık olup olmadığını kontrol eder. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Yılın artık olup olmadığını kontrol eder. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Yılın artık olup olmadığını kontrol eder. |
| [TaiwanCalendar](./taiwancalendar/)() | Yapıcı. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | Bileşenlerden [DateTime](../../system/datetime/) nesnesi oluşturur. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Bileşenlerden [DateTime](../../system/datetime/) nesnesi oluşturur. |
## Ayrıca Bakınız

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
