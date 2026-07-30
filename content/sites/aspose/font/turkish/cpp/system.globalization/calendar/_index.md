---
title: "System::Globalization::Calendar sınıfı"
linktitle: "Calendar"
second_title: "Aspose.Font için C++"
description: "System::Globalization::Calendar sınıfı. Tarihlerin nasıl işlendiğini, hesaplandığını, biçimlendirildiğini vb. tanımlayan takvim. Ayarlayıcı (setter) işlemleri yalnızca okunamayan (read-only) olmayan nesnelerde etkinleştirilir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.globalization/calendar/
---
## Calendar class


[Calendar](./) which defines how the dates are handled, calculated, formatted, etc. Setter operations are only enabled on non-read-only objects. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Calendar : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [AddDays](./adddays/)(DateTime, int) const | Zaman noktasına gün ekler. |
| virtual [AddHours](./addhours/)(DateTime, int) const | Zaman noktasına saat ekler. |
| virtual [AddMilliseconds](./addmilliseconds/)(DateTime, double) const | Zaman noktasına milisaniye ekler. |
| virtual [AddMinutes](./addminutes/)(DateTime, int) const | Zaman noktasına dakika ekler. |
| virtual [AddMonths](./addmonths/)(DateTime, int) const | Zaman noktasına ay ekler. |
| virtual [AddSeconds](./addseconds/)(DateTime, int) const | Zaman noktasına saniye ekler. |
| virtual [AddWeeks](./addweeks/)(DateTime, int) const | Zaman noktasına hafta ekler. |
| virtual [AddYears](./addyears/)(DateTime, int) const | Zaman noktasına yıl ekler. |
| [Calendar](./calendar/)(const Calendar\&) | RTTI bilgisi. |
| virtual [get_AlgorithmType](./get_algorithmtype/)() const | Algoritma türünü alır. |
| [get_CurrentEra](./get_currentera/)() const | Mevcut dönemin indeksini alır. |
| [get_CurrentEraValue](./get_currenteravalue/)() const | Mevcut dönemin değerini alır. |
| virtual [get_Eras](./get_eras/)() const | Takvimde mevcut olan dönemlerin listesini alır. |
| virtual [get_ID](./get_id/)() const | Takvim tanımlayıcısını alır. |
| [get_IsReadOnly](./get_isreadonly/)() const | Takvimin yalnızca okunur olup olmadığını denetler. |
| virtual [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const | Takvim tarafından desteklenen en büyük zaman noktası. |
| virtual [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const | Takvim tarafından desteklenen en küçük zaman noktası. |
| virtual [get_TwoDigitYearMax](./get_twodigityearmax/)() const | 2 basamakla temsil edilebilecek son yılı alır. |
| virtual [GetDayOfMonth](./getdayofmonth/)(DateTime) const | Belirtilen zaman noktası için ayın gününü alır. |
| virtual [GetDayOfWeek](./getdayofweek/)(DateTime) const | Belirtilen zaman noktası için haftanın gününü alır. |
| virtual [GetDayOfYear](./getdayofyear/)(DateTime) const | Belirtilen zaman noktası için yılın gününü alır. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Belirli bir ay içindeki gün sayısını alır. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const | Belirli bir ay içindeki gün sayısını alır. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Belirli bir yıldaki gün sayısını alır. |
| virtual [GetDaysInYear](./getdaysinyear/)(int, int) const | Belirli bir yıldaki gün sayısını alır. |
| virtual [GetEra](./getera/)(DateTime) const | Belirtilen zaman noktası için dönemi alır. |
| virtual [GetHour](./gethour/)(DateTime) const | Belirtilen zaman noktası için saatleri alır. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Belirtilen yıl için artık ayı alır. |
| virtual [GetLeapMonth](./getleapmonth/)(int, int) const | Belirtilen yıl için artık ayı alır. |
| virtual [GetMilliseconds](./getmilliseconds/)(DateTime) const | Belirtilen zaman noktası için milisaniyeleri alır. |
| virtual [GetMinute](./getminute/)(DateTime) const | Belirtilen zaman noktası için dakikaları alır. |
| virtual [GetMonth](./getmonth/)(DateTime) const | Belirtilen zaman noktası için ayı alır. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Belirtilen yıldaki ay sayısını alır. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int, int) const | Belirtilen yıldaki ay sayısını alır. |
| virtual [GetSecond](./getsecond/)(DateTime) const | Belirtilen zaman noktası için saniyeleri alır. |
| virtual [GetWeekOfYear](./getweekofyear/)(DateTime, CalendarWeekRule, DayOfWeek) const | Belirtilen zaman noktası için yılın haftasını alır. |
| virtual [GetYear](./getyear/)(DateTime) const | Belirtilen zaman noktasının yılını alır. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Günün artık olup olmadığını kontrol eder. |
| virtual [IsLeapDay](./isleapday/)(int, int, int, int) const | Günün artık olup olmadığını kontrol eder. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Ayın artık olup olmadığını kontrol eder. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int, int) const | Ayın artık olup olmadığını kontrol eder. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Yılın artık olup olmadığını kontrol eder. |
| virtual [IsLeapYear](./isleapyear/)(int, int) const | Yılın artık olup olmadığını kontrol eder. |
| [IsValidDay](./isvalidday/)(int, int, int, int) const | Yıl, ay, gün ve dönem değerlerini denetler. |
| [operator=](./operator=/)(const Calendar\&) |  |
| static [ReadOnly](./readonly/)(const CalendarPtr\&) | Takvimin yalnızca okunur sürümünü alır. |
| virtual [set_TwoDigitYearMax](./set_twodigityearmax/)(int) | 2 basamakla temsil edilebilecek son yılı ayarlar. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Bileşenlerden [DateTime](../../system/datetime/) nesnesi oluşturur. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const | Bileşenlerden [DateTime](../../system/datetime/) nesnesi oluşturur. |
| virtual [ToFourDigitYear](./tofourdigityear/)(int) const | TwoDigitYearMax özelliğini kullanarak yılı 4 basamaklı yıla dönüştürür. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
