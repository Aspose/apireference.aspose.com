---
title: "System::DateTimeOffset sınıfı"
linktitle: "DateTimeOffset"
second_title: "Aspose.Page için C++"
description: "System::DateTimeOffset sınıfı. Koordinatlı Evrensel Zaman'a göre tarih ve saat içerir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) göstericisine sarın ve bu göstericiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1700
url: /tr/cpp/system/datetimeoffset/
---
## DateTimeOffset class


Koordinatlı Evrensel Zaman'a göre tarih ve saat içerir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirin.

```cpp
class DateTimeOffset
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(TimeSpan) const | [DateTimeOffset](./) nesnesine belirtilen zaman aralığını ekler. |
| [AddDays](./adddays/)(double) const | [DateTimeOffset](./) nesnesine belirtilen gün sayısını ekler. |
| [AddHours](./addhours/)(double) const | [DateTimeOffset](./) nesnesine belirtilen saat sayısını ekler. |
| [AddMilliseconds](./addmilliseconds/)(double) const | [DateTimeOffset](./) nesnesine belirtilen milisaniye sayısını ekler. |
| [AddMinutes](./addminutes/)(double) const | [DateTimeOffset](./) nesnesine belirtilen dakika sayısını ekler. |
| [AddMonths](./addmonths/)(int) const | [DateTimeOffset](./) nesnesine belirtilen ay sayısını ekler. |
| [AddSeconds](./addseconds/)(double) const | [DateTimeOffset](./) nesnesine belirtilen saniye sayısını ekler. |
| [AddTicks](./addticks/)(int64_t) const | [DateTimeOffset](./) nesnesine belirtilen tik sayısını ekler. |
| [AddYears](./addyears/)(int) const | [DateTimeOffset](./) nesnesine belirtilen yıl sayısını ekler. |
| static [Compare](./compare/)(const DateTimeOffset\&, const DateTimeOffset\&) | İki [DateTimeOffset](./) nesneyi karşılaştırır. |
| [CompareTo](./compareto/)(const DateTimeOffset\&) const | İki [DateTimeOffset](./) nesneyi karşılaştırır. |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | İki [DateTimeOffset](./) nesneyi karşılaştırır. |
| [DateTimeOffset](./datetimeoffset/)() | Varsayılan yapıcı. |
| [DateTimeOffset](./datetimeoffset/)(DateTime) | Yapıcı. |
| [DateTimeOffset](./datetimeoffset/)(int64_t, TimeSpan) | Yapıcı. |
| [DateTimeOffset](./datetimeoffset/)(DateTime, TimeSpan) | Yapıcı. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, TimeSpan) | Yapıcı. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, TimeSpan) | Yapıcı. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, TimeSpan) | Yapıcı. |
| static [Equals](./equals/)(const DateTimeOffset\&, const DateTimeOffset\&) | İki [DateTimeOffset](./) nesnenin aynı zaman noktasını temsil edip etmediğini denetler. |
| [Equals](./equals/)(const DateTimeOffset\&) const | İki [DateTimeOffset](./) nesnenin aynı zaman noktasını temsil edip etmediğini denetler. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | İki [DateTimeOffset](./) nesnenin aynı zaman noktasını temsil edip etmediğini denetler. |
| [EqualsExact](./equalsexact/)(const DateTimeOffset\&) const | İki [DateTimeOffset](./) nesnenin aynı zaman noktasını temsil edip aynı ofsete sahip olup olmadığını denetler. |
| [EqualsExact](./equalsexact/)(const SharedPtr\<Object\>\&) const | İki [DateTimeOffset](./) nesnenin aynı zaman noktasını temsil edip aynı ofsete sahip olup olmadığını denetler. |
| static [FromFileTime](./fromfiletime/)(int64_t) | [Convert](../convert/)[Windows](../../system.windows/) dosya zamanını yerel zaman ofsetiyle tarih ve saate dönüştürür. |
| static [FromUnixTimeMilliseconds](./fromunixtimemilliseconds/)(int64_t) | [Convert](../convert/) Unix zamanını [DateTimeOffset](./) nesnesine dönüştürür. |
| static [FromUnixTimeSeconds](./fromunixtimeseconds/)(int64_t) | [Convert](../convert/) Unix zamanını [DateTimeOffset](./) nesnesine dönüştürür. |
| [get_Date](./get_date/)() const | Geçerli nesnenin tarih bileşenini alır. |
| [get_DateTime](./get_datetime/)() const | [DateTime](../datetime/) değerini alır. |
| [get_Day](./get_day/)() const | Geçerli nesnenin ay gününü alır. |
| [get_DayOfWeek](./get_dayofweek/)() const | Geçerli nesnenin haftanın gününü alır. |
| [get_DayOfYear](./get_dayofyear/)() const | Geçerli nesnenin yıl içindeki gününü alır. |
| [get_Hour](./get_hour/)() const | Geçerli nesnenin saat bileşenini alır. |
| [get_LocalDateTime](./get_localdatetime/)() const | [DateTime](../datetime/) değerini alır; bu değer yerel tarih ve zamanı temsil eder. |
| [get_Millisecond](./get_millisecond/)() const | Geçerli nesnenin milisaniye bileşenini alır. |
| [get_Minute](./get_minute/)() const | Geçerli nesnenin dakika bileşenini alır. |
| [get_Month](./get_month/)() const | Geçerli nesnenin ay bileşenini alır. |
| static [get_Now](./get_now/)() | Tarih ve saati geçerli yerel zamana, ofseti ise yerel zamanın ofsetine ayarlanmış [DateTimeOffset](./) nesnesini alır. |
| [get_Offset](./get_offset/)() const | UTC'den ofseti alır. |
| [get_Second](./get_second/)() const | Geçerli nesnenin saniye bileşenini alır. |
| [get_Ticks](./get_ticks/)() const | Geçerli nesnenin tik sayısını alır. |
| [get_TimeOfDay](./get_timeofday/)() const | Geçerli nesnenin gün içindeki zamanını alır. |
| [get_UtcDateTime](./get_utcdatetime/)() const | [DateTime](../datetime/) değerini alır; bu değer UTC tarih ve zamanını temsil eder. |
| static [get_UtcNow](./get_utcnow/)() | Tarih ve saati geçerli UTC zamanına, ofseti ise [TimeSpan::Zero](../timespan/zero/) olarak ayarlanmış [DateTimeOffset](./) nesnesini alır. |
| [get_UtcTicks](./get_utcticks/)() const | Geçerli nesnenin UTC zamanındaki tik sayısını alır. |
| [get_Year](./get_year/)() const | Geçerli nesnenin yıl bileşenini alır. |
| [GetHashCode](./gethashcode/)() const | Geçerli [DateTimeOffset](./) nesnesi için karma kodunu alır. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(const DateTimeOffset\&) const | Geçerli nesne ve belirtilen [DateTimeOffset](./) nesnesinin farklı tarih ve saat değerlerini temsil edip etmediğini belirler. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Geçerli nesnenin temsil ettiği değer ile belirtilen zaman aralığının toplamını temsil eden tarih ve saat değerini gösteren yeni bir [DateTimeOffset](./) sınıf örneği döndürür. |
| [operator-](./operator-/)(TimeSpan) const | Geçerli nesnenin temsil ettiği değerden belirtilen zaman aralığının çıkarılması sonucu oluşan tarih ve saat değerini temsil eden yeni bir [DateTimeOffset](./) sınıf örneği döndürür. |
| [operator-](./operator-/)(const DateTimeOffset\&) const | Geçerli ve belirtilen nesnelerin temsil ettiği tarih ve saat değerleri arasındaki zaman aralığını temsil eden bir [TimeSpan](../timespan/) sınıf örneği döndürür. |
| [operator<](./operator_/)(const DateTimeOffset\&) const | Geçerli nesnenin, belirtilen [DateTimeOffset](./) nesnesinin temsil ettiği değerden daha erken bir tarih ve saat değerini temsil edip etmediğini belirler. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(const DateTimeOffset\&) const | Geçerli nesnenin, belirtilen [DateTimeOffset](./) nesnesinin temsil ettiği değerle aynı veya daha erken bir tarih ve saat değerini temsil edip etmediğini belirler. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator==](./operator==/)(const DateTimeOffset\&) const | Geçerli nesne ve belirtilen [DateTimeOffset](./) nesnesinin aynı tarih ve saat değerini temsil edip etmediğini belirler. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(const DateTimeOffset\&) const | Geçerli nesnenin, belirtilen [DateTimeOffset](./) nesnesinin temsil ettiği değerden daha sonraki bir tarih ve saat değerini temsil edip etmediğini belirler. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(const DateTimeOffset\&) const | Geçerli nesnenin, belirtilen [DateTimeOffset](./) nesnesinin temsil ettiği değerle aynı veya daha sonraki bir tarih ve saat değerini temsil edip etmediğini belirler. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Belirtilen dizeyi [DateTimeOffset](./) eşdeğerine dönüştürür. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Belirtilen dizeyi, belirtilen biçim sağlayıcısı ve biçimlendirme stili kullanarak [DateTimeOffset](./) nesnesine dönüştürür. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Belirtilen dizeyi, belirtilen biçim, biçim sağlayıcısı ve biçimlendirme stili kullanarak [DateTimeOffset](./) nesnesine dönüştürür. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Belirtilen dizeyi, belirtilen biçimler, biçim sağlayıcısı ve biçimlendirme stili kullanarak [DateTimeOffset](./) nesnesine dönüştürür. |
| [Subtract](./subtract/)(TimeSpan) const | Geçerli nesneden belirtilen bir zaman aralığını çıkarır. |
| [Subtract](./subtract/)(const DateTimeOffset\&) const | Geçerli nesneden belirtilen bir [DateTimeOffset](./) değerini çıkarır. |
| [ToFileTime](./tofiletime/)() const | Geçerli nesneyi [Windows](../../system.windows/) dosya zamanına dönüştürür. |
| [ToLocalTime](./tolocaltime/)() const | Geçerli nesneyi yerel zamanı temsil eden bir nesneye dönüştürür. |
| [ToOffset](./tooffset/)(TimeSpan) const | Geçerli nesnenin ofsetini belirtilen ofset ile değiştirir. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Geçerli nesneyi belirtilen biçim ve biçim sağlayıcısını kullanarak dizeye dönüştürür. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Geçerli nesneyi belirtilen biçim sağlayıcısını kullanarak dizeye dönüştürür. |
| [ToString](./tostring/)(const String\&) const | Geçerli nesneyi belirtilen biçimi kullanarak dizeye dönüştürür. |
| [ToString](./tostring/)() const | Geçerli nesneyi dizeye dönüştürür. |
| [ToUniversalTime](./touniversaltime/)() const | Geçerli nesneyi UTC zamanını temsil eden bir nesneye dönüştürür. |
| [ToUnixTimeMilliseconds](./tounixtimemilliseconds/)() const | Unix epoch başlangıcından itibaren geçen milisaniyeleri alır. |
| [ToUnixTimeSeconds](./tounixtimeseconds/)() const | Unix epoch başlangıcından geçen saniyeleri alır. |
| static [TryParse](./tryparse/)(const String\&, DateTimeOffset\&) | Belirtilen dizeyi [DateTimeOffset](./) nesnesine dönüştürmeye çalışır. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Belirtilen dizeyi, belirtilen format sağlayıcısı ve biçimlendirme stili kullanarak [DateTimeOffset](./) nesnesine dönüştürmeye çalışır. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Belirtilen dizeyi, belirtilen formatlar, format sağlayıcısı ve biçimlendirme stili kullanarak [DateTimeOffset](./) nesnesine dönüştürmeye çalışır. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Belirtilen dizeyi, belirtilen format, format sağlayıcısı ve biçimlendirme stili kullanarak [DateTimeOffset](./) nesnesine dönüştürmeye çalışır. |
| static [Type](./type/)() | [TimeSpan](../timespan/) yapısını temsil eden bir [TypeInfo](../typeinfo/) nesnesi döndürür. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static constexpr [MaxOffset](./maxoffset/) | Maksimum offset'i tick cinsinden alır. |
| static [MaxValue](./maxvalue/) | En büyük [DateTimeOffset](./) değerini alır. |
| static constexpr [MinOffset](./minoffset/) | Minimum offset'i tick cinsinden alır. |
| static [MinValue](./minvalue/) | En erken [DateTimeOffset](./) değerini alır. |
| static [UnixEpoch](./unixepoch/) | Unix epoch başlangıcını alır. |
## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
