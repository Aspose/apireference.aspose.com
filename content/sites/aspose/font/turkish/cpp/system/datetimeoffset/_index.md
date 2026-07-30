---
title: "System::DateTimeOffset sınıfı"
linktitle: "DateTimeOffset"
second_title: "Aspose.Font için C++"
description: "System::DateTimeOffset sınıfı. Koordinatlı Evrensel Zaman'a göre tarih ve saat içerir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle oluşturmaktan kaçının; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1700
url: /tr/cpp/system/datetimeoffset/
---
## DateTimeOffset class


Tarihi ve saati, Koordinatlı Evrensel Zaman'a göre içerir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle oluşturmaktan kaçının; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class DateTimeOffset
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Belirtilen zaman aralığını [DateTimeOffset](./) nesnesine ekler. |
| [AddDays](./adddays/)(double) const | Belirtilen gün sayısını [DateTimeOffset](./) nesnesine ekler. |
| [AddHours](./addhours/)(double) const | Belirtilen saat sayısını [DateTimeOffset](./) nesnesine ekler. |
| [AddMilliseconds](./addmilliseconds/)(double) const | Belirtilen milisaniye sayısını [DateTimeOffset](./) nesnesine ekler. |
| [AddMinutes](./addminutes/)(double) const | Belirtilen dakika sayısını [DateTimeOffset](./) nesnesine ekler. |
| [AddMonths](./addmonths/)(int) const | Belirtilen ay sayısını [DateTimeOffset](./) nesnesine ekler. |
| [AddSeconds](./addseconds/)(double) const | Belirtilen sayıda saniyeyi [DateTimeOffset](./) nesnesine ekler. |
| [AddTicks](./addticks/)(int64_t) const | Belirtilen sayıda tik'i [DateTimeOffset](./) nesnesine ekler. |
| [AddYears](./addyears/)(int) const | Belirtilen sayıda yılı [DateTimeOffset](./) nesnesine ekler. |
| static [Compare](./compare/)(const DateTimeOffset\&, const DateTimeOffset\&) | İki [DateTimeOffset](./) nesnesini karşılaştırır. |
| [CompareTo](./compareto/)(const DateTimeOffset\&) const | İki [DateTimeOffset](./) nesnesini karşılaştırır. |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | İki [DateTimeOffset](./) nesnesini karşılaştırır. |
| [DateTimeOffset](./datetimeoffset/)() | Varsayılan yapıcı. |
| [DateTimeOffset](./datetimeoffset/)(DateTime) | Yapıcı. |
| [DateTimeOffset](./datetimeoffset/)(int64_t, TimeSpan) | Yapıcı. |
| [DateTimeOffset](./datetimeoffset/)(DateTime, TimeSpan) | Yapıcı. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, TimeSpan) | Yapıcı. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, TimeSpan) | Yapıcı. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, TimeSpan) | Yapıcı. |
| static [Equals](./equals/)(const DateTimeOffset\&, const DateTimeOffset\&) | İki [DateTimeOffset](./) nesnesinin aynı zaman noktasını temsil edip etmediğini denetler. |
| [Equals](./equals/)(const DateTimeOffset\&) const | İki [DateTimeOffset](./) nesnesinin aynı zaman noktasını temsil edip etmediğini denetler. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | İki [DateTimeOffset](./) nesnesinin aynı zaman noktasını temsil edip etmediğini denetler. |
| [EqualsExact](./equalsexact/)(const DateTimeOffset\&) const | İki [DateTimeOffset](./) nesnesinin aynı zaman noktasını temsil edip aynı ofsete sahip olup olmadığını denetler. |
| [EqualsExact](./equalsexact/)(const SharedPtr\<Object\>\&) const | İki [DateTimeOffset](./) nesnesinin aynı zaman noktasını temsil edip aynı ofsete sahip olup olmadığını denetler. |
| static [FromFileTime](./fromfiletime/)(int64_t) | [Convert](../convert/)[Windows](../../system.windows/) dosya zamanını yerel saat ofsetiyle tarih ve saate dönüştürür. |
| static [FromUnixTimeMilliseconds](./fromunixtimemilliseconds/)(int64_t) | [Convert](../convert/) Unix zamanını [DateTimeOffset](./) nesnesine dönüştürür. |
| static [FromUnixTimeSeconds](./fromunixtimeseconds/)(int64_t) | [Convert](../convert/) Unix zamanını [DateTimeOffset](./) nesnesine dönüştürür. |
| [get_Date](./get_date/)() const | Geçerli nesnenin tarih bileşenini alır. |
| [get_DateTime](./get_datetime/)() const | [DateTime](../datetime/) değerini alır. |
| [get_Day](./get_day/)() const | Geçerli nesnenin ay gününü alır. |
| [get_DayOfWeek](./get_dayofweek/)() const | Geçerli nesnenin haftanın gününü alır. |
| [get_DayOfYear](./get_dayofyear/)() const | Geçerli nesnenin yıl içindeki gününü alır. |
| [get_Hour](./get_hour/)() const | Geçerli nesnenin saat bileşenini alır. |
| [get_LocalDateTime](./get_localdatetime/)() const | Yerel tarih ve saati temsil eden [DateTime](../datetime/) değerini alır. |
| [get_Millisecond](./get_millisecond/)() const | Geçerli nesnenin milisaniye bileşenini alır. |
| [get_Minute](./get_minute/)() const | Geçerli nesnenin dakika bileşenini alır. |
| [get_Month](./get_month/)() const | Geçerli nesnenin ay bileşenini alır. |
| static [get_Now](./get_now/)() | Tarihi ve saati geçerli yerel zamana, ofseti ise yerel zamanın ofsetine ayarlanmış [DateTimeOffset](./) nesnesini alır. |
| [get_Offset](./get_offset/)() const | UTC'den ofseti alır. |
| [get_Second](./get_second/)() const | Geçerli nesnenin saniye bileşenini alır. |
| [get_Ticks](./get_ticks/)() const | Geçerli nesnenin tik sayısını alır. |
| [get_TimeOfDay](./get_timeofday/)() const | Geçerli nesnenin gün içindeki zamanını alır. |
| [get_UtcDateTime](./get_utcdatetime/)() const | UTC tarih ve saatini temsil eden [DateTime](../datetime/) değerini alır. |
| static [get_UtcNow](./get_utcnow/)() | Alır [DateTimeOffset](./) nesnesini, tarih ve saati geçerli UTC zamanına ayarlanmış ve ofseti [TimeSpan::Zero](../timespan/zero/) olan. |
| [get_UtcTicks](./get_utcticks/)() const | Geçerli nesnenin UTC zamanındaki tik sayısını alır. |
| [get_Year](./get_year/)() const | Geçerli nesnenin yıl bileşenini alır. |
| [GetHashCode](./gethashcode/)() const | Geçerli [DateTimeOffset](./) nesnesi için karma kodunu alır. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(const DateTimeOffset\&) const | Geçerli nesne ile belirtilen [DateTimeOffset](./) nesnesinin farklı tarih ve zaman değerlerini temsil edip etmediğini belirler. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Geçerli nesnenin temsil ettiği değer ile belirtilen zaman aralığının toplamını temsil eden tarih ve zaman değerini gösteren yeni bir [DateTimeOffset](./) sınıf örneği döndürür. |
| [operator-](./operator-/)(TimeSpan) const | Geçerli nesnenin temsil ettiği değerden belirtilen zaman aralığının çıkarılmasıyla elde edilen tarih ve zaman değerini temsil eden yeni bir [DateTimeOffset](./) sınıf örneği döndürür. |
| [operator-](./operator-/)(const DateTimeOffset\&) const | Geçerli ve belirtilen nesneler tarafından temsil edilen tarih ve zaman değerleri arasındaki zaman aralığını temsil eden bir [TimeSpan](../timespan/) sınıf örneği döndürür. |
| [operator<](./operator_/)(const DateTimeOffset\&) const | Geçerli nesnenin, belirtilen [DateTimeOffset](./) nesnesi tarafından temsil edilen değerden daha erken bir tarih ve zaman değerini temsil edip etmediğini belirler. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(const DateTimeOffset\&) const | Geçerli nesnenin, belirtilen [DateTimeOffset](./) nesnesi tarafından temsil edilen değer ile aynı ya da daha erken bir tarih ve zaman değerini temsil edip etmediğini belirler. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator==](./operator==/)(const DateTimeOffset\&) const | Geçerli nesne ile belirtilen [DateTimeOffset](./) nesnesinin aynı tarih ve zaman değerini temsil edip etmediğini belirler. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(const DateTimeOffset\&) const | Geçerli nesnenin, belirtilen [DateTimeOffset](./) nesnesi tarafından temsil edilen değerden daha sonraki bir tarih ve zaman değerini temsil edip etmediğini belirler. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(const DateTimeOffset\&) const | Geçerli nesnenin, belirtilen [DateTimeOffset](./) nesnesi tarafından temsil edilen değer ile aynı ya da daha sonraki bir tarih ve zaman değerini temsil edip etmediğini belirler. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Belirtilen dizeyi [DateTimeOffset](./) eşdeğerine dönüştürür. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Belirtilen dizeyi, belirtilen biçim sağlayıcısı ve biçimlendirme stili kullanarak [DateTimeOffset](./) nesnesine dönüştürür. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Belirtilen dizeyi, belirtilen biçim, biçim sağlayıcısı ve biçimlendirme stili kullanarak [DateTimeOffset](./) nesnesine dönüştürür. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Belirtilen dizeyi, belirtilen biçimler, biçim sağlayıcısı ve biçimlendirme stili kullanarak [DateTimeOffset](./) nesnesine dönüştürür. |
| [Subtract](./subtract/)(TimeSpan) const | Belirtilen bir zaman aralığını geçerli nesneden çıkarır. |
| [Subtract](./subtract/)(const DateTimeOffset\&) const | Belirtilen bir [DateTimeOffset](./) değerini geçerli nesneden çıkarır. |
| [ToFileTime](./tofiletime/)() const | Geçerli nesneyi [Windows](../../system.windows/) dosya zamanına dönüştürür. |
| [ToLocalTime](./tolocaltime/)() const | Geçerli nesneyi yerel zamanı temsil eden bir nesneye dönüştürür. |
| [ToOffset](./tooffset/)(TimeSpan) const | Geçerli nesnenin ofsetini belirtilen ofset ile değiştirir. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Geçerli nesneyi belirtilen biçim ve biçim sağlayıcısını kullanarak dizeye dönüştürür. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Geçerli nesneyi belirtilen biçim sağlayıcısını kullanarak dizeye dönüştürür. |
| [ToString](./tostring/)(const String\&) const | Geçerli nesneyi belirtilen biçimi kullanarak dizeye dönüştürür. |
| [ToString](./tostring/)() const | Geçerli nesneyi dizeye dönüştürür. |
| [ToUniversalTime](./touniversaltime/)() const | Geçerli nesneyi UTC zamanını temsil eden bir nesneye dönüştürür,. |
| [ToUnixTimeMilliseconds](./tounixtimemilliseconds/)() const | Unix epoch başlangıcından itibaren geçen milisaniyeleri alır. |
| [ToUnixTimeSeconds](./tounixtimeseconds/)() const | Unix epoch başlangıcından itibaren geçen saniyeleri alır. |
| static [TryParse](./tryparse/)(const String\&, DateTimeOffset\&) | Belirtilen dizeyi [DateTimeOffset](./) nesnesine dönüştürmeye çalışır. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Belirtilen dizeyi belirtilen biçim sağlayıcısı ve biçimlendirme stili kullanarak [DateTimeOffset](./) nesnesine dönüştürmeye çalışır. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Belirtilen dizeyi belirtilen biçimler, biçim sağlayıcısı ve biçimlendirme stili kullanarak [DateTimeOffset](./) nesnesine dönüştürmeye çalışır. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Belirtilen dizeyi belirtilen biçim, biçim sağlayıcısı ve biçimlendirme stili kullanarak [DateTimeOffset](./) nesnesine dönüştürmeye çalışır. |
| static [Type](./type/)() | Bir [TypeInfo](../typeinfo/) nesnesi döndürür; bu nesne [TimeSpan](../timespan/) yapısını temsil eder. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static constexpr [MaxOffset](./maxoffset/) | Maksimum offseti tick cinsinden alır. |
| static [MaxValue](./maxvalue/) | En büyük [DateTimeOffset](./) değerini alır. |
| static constexpr [MinOffset](./minoffset/) | Minimum offseti tick cinsinden alır. |
| static [MinValue](./minvalue/) | En erken [DateTimeOffset](./) değerini alır. |
| static [UnixEpoch](./unixepoch/) | Unix epoch başlangıcını alır. |
## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
