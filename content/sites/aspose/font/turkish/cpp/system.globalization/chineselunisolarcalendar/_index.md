---
title: "System::Globalization::ChineseLunisolarCalendar sınıfı"
linktitle: "ChineseLunisolarCalendar"
second_title: "Aspose.Font için C++"
description: "System::Globalization::ChineseLunisolarCalendar sınıfı. Çin lunisolar takvimi. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da operator new ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.globalization/chineselunisolarcalendar/
---
## ChineseLunisolarCalendar class


Çin lunisolar takvimi. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da operator new ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class ChineseLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ChineseLunisolarCalendar](./chineselunisolarcalendar/)() | Varsayılan yapıcı. |
| [Clone](./clone/)() override | RTTI bilgisi. |
| [get_Eras](./get_eras/)() const override | Takvimde mevcut olan dönemlerin listesini alır. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Takvim tarafından desteklenen en büyük zaman noktası. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Takvim tarafından desteklenen en küçük zaman noktası. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Belirli bir ay içindeki gün sayısını alır. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Belirli bir ay içindeki gün sayısını alır. |
| [GetEra](./getera/)(DateTime) const override | Belirtilen zaman noktası için dönemi alır. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Belirtilen yıl için artık ayı alır. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Belirtilen yıl için artık ayı alır. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Belirtilen yıldaki ay sayısını alır. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | RTTI bilgisi. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Günün artık olup olmadığını kontrol eder. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Günün artık olup olmadığını kontrol eder. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Ayın artık olup olmadığını kontrol eder. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Ayın artık olup olmadığını kontrol eder. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Yılın artık olup olmadığını kontrol eder. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Yılın artık olup olmadığını kontrol eder. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static constexpr [ChineseEra](./chineseera/) | Mevcut Çin dönemi. |
## Ayrıca Bakınız

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
