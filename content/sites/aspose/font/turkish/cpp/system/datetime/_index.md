---
title: "System::DateTime sınıfı"
linktitle: "DateTime"
second_title: "Aspose.Font için C++"
description: "System::DateTime sınıfı. Zaman kontinuumunda belirli bir tarih ve saat değerini temsil eder. Bu tür, yığına (stack) tahsis edilmeli ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. C++'ta bu türün nesnelerini yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 1600
url: /tr/cpp/system/datetime/
---
## DateTime class


Zaman kontinuumunda belirli bir tarih ve saat değerini temsil eder. Bu tür, yığına tahsis edilmeli ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu türün nesnelerini yönetmek için [System::SmartPtr](../smartptr/) sınıfını asla kullanmayın.

```cpp
class DateTime
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Mevcut nesnenin temsil ettiği tarih ve saat değerine belirtilen zaman aralığının eklenmesiyle oluşan tarih ve saat değerini temsil eden yeni bir [DateTime](./) sınıf örneği döndürür. |
| [AddDays](./adddays/)(double) const | Mevcut nesnenin temsil ettiği değer ile belirtilen gün sayısının toplamı olan tarih ve saat değerini temsil eden yeni bir [DateTime](./) sınıf örneği döndürür. |
| [AddHours](./addhours/)(double) const | Mevcut nesnenin temsil ettiği değer ile belirtilen saat sayısının toplamı olan tarih ve saat değerini temsil eden yeni bir [DateTime](./) sınıf örneği döndürür. |
| [AddMilliseconds](./addmilliseconds/)(double) const | Mevcut nesnenin temsil ettiği değer ile belirtilen milisaniye sayısının toplamı olan tarih ve saat değerini temsil eden yeni bir [DateTime](./) sınıf örneği döndürür. |
| [AddMinutes](./addminutes/)(double) const | Mevcut nesnenin temsil ettiği değer ile belirtilen dakika sayısının toplamı olan tarih ve saat değerini temsil eden yeni bir [DateTime](./) sınıf örneği döndürür. |
| [AddMonths](./addmonths/)(int) const | Mevcut nesnenin temsil ettiği değer ile belirtilen ay sayısının toplamı olan tarih ve saat değerini temsil eden yeni bir [DateTime](./) sınıf örneği döndürür. |
| [AddSeconds](./addseconds/)(double) const | Mevcut nesnenin temsil ettiği değer ile belirtilen saniye sayısının toplamı olan tarih ve saat değerini temsil eden yeni bir [DateTime](./) sınıf örneği döndürür. |
| [AddTicks](./addticks/)(int64_t) const | Mevcut nesnenin temsil ettiği değer ile belirtilen 100-nanosanı aralık sayısının toplamı olan tarih ve saat değerini temsil eden yeni bir [DateTime](./) sınıf örneği döndürür. |
| [AddYears](./addyears/)(int) const | Mevcut nesnenin temsil ettiği değerin yıl bileşeni belirtilen sayı kadar artırılarak eşit olduğu tarih ve saat değerini temsil eden yeni bir [DateTime](./) sınıf örneği döndürür. |
| static [Compare](./compare/)(DateTime, DateTime) | Belirtilen [DateTime](./) sınıf örnekleri tarafından temsil edilen iki değeri karşılaştırır ve değerlerin zaman çizelgesindeki göreli konumlarını gösteren bir değer döndürür. |
| [CompareTo](./compareto/)(DateTime) const | Mevcut nesne ve belirtilen [DateTime](./) sınıf örneği tarafından temsil edilen iki tarih ve saat değerini karşılaştırır ve değerlerin zaman çizelgesindeki göreli konumlarını gösteren bir değer döndürür. |
| [DateTime](./datetime/)() | MinValue değerine eşit olan mümkün olan en küçük tarih ve saat değerini temsil eden bir örnek oluşturur. |
| [DateTime](./datetime/)(int, int, int) | Belirli bir yıl, ay ve gün olarak belirtilen bir tarih ve saat değerini temsil eden bir örnek oluşturur. |
| [DateTime](./datetime/)(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | Belirtilen takvimde belirli bir yıl, ay ve gün olarak belirtilen bir tarih ve saat değerini temsil eden bir örnek oluşturur. |
| [DateTime](./datetime/)(int, int, int, int, int, int) | Belirli bir yıl, ay, gün, saat, dakika ve saniye olarak belirtilen bir tarih ve saat değerini temsil eden bir örnek oluşturur. |
| [DateTime](./datetime/)(int, int, int, int, int, int, DateTimeKind) | Belirli bir yıl, ay, gün, saat, dakika ve saniye olarak belirtilen bir tarih ve saat değerini temsil eden bir örnek oluşturur. |
| [DateTime](./datetime/)(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | Belirtilen takvimde belirli bir yıl, ay, gün, saat, dakika ve saniye olarak belirtilen bir tarih ve saat değerini temsil eden bir örnek oluşturur. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, DateTimeKind) | Belirli bir yıl, ay, gün, saat, dakika, saniye ve milisaniye olarak belirtilen bir tarih ve saat değerini temsil eden bir örnek oluşturur. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) | Belirtilen takvimde belirli bir yıl, ay, gün, saat, dakika, saniye ve milisaniye olarak belirtilen bir tarih ve saat değerini temsil eden bir örnek oluşturur. |
| [DateTime](./datetime/)(int64_t, DateTimeKind) | Tik sayısı olarak belirtilen bir tarih ve saat değerini temsil eden bir örnek oluşturur. |
| [DateTime](./datetime/)(int64_t, DateTimeKind, bool) | Tik sayısı olarak belirtilen bir tarih ve saat değerini temsil eden bir örnek oluşturur. DAHİL KULLANIM İÇİN. |
| [DateTime](./datetime/)(const DateTime\&) | Bir örneği kopya oluşturur. |
| static [DaysInMonth](./daysinmonth/)(int, int) | Belirtilen yılın belirtilen ayındaki gün sayısını döndürür. |
| static [Equals](./equals/)(DateTime, DateTime) | Belirtilen [DateTime](./) sınıfı örneklerinin aynı tarih ve saat değerini temsil edip etmediğini belirler. |
| [Equals](./equals/)(DateTime) const | Belirtilen [DateTime](./) sınıfı örneğinin mevcut nesneyle aynı tarih ve saat değerini temsil edip etmediğini belirler. |
| static [FromBinary](./frombinary/)(int64_t) | Belirtilen işaretsiz 64-bit tamsayıdan tarih saat değerini ayrıştırır ve yeni [DateTime](./) sınıfı örneğini bu değere ayarlar. |
| static [FromFileTime](./fromfiletime/)(int64_t) | Belirtilen Dosya zamanını, yerel zamanla aynı tarih ve saat değerini temsil eden bir [DateTime](./) sınıfı örneğine dönüştürür. |
| static [FromFileTimeUtc](./fromfiletimeutc/)(int64_t) | Belirtilen Dosya zamanını, UTC zamanı ile aynı tarih ve saat değerini temsil eden bir [DateTime](./) sınıfı örneğine dönüştürür. |
| static [FromOADate](./fromoadate/)(double) | Belirtilen OLE Automation Tarihi'ne eşdeğer tarih ve saat değerini temsil eden bir [DateTime](./) sınıfı örneğini döndürür. |
| static [FromUnixTime](./fromunixtime/)(time_t) | Belirtilen Unix zaman değerini bir [DateTime](./) sınıfı örneğine dönüştürür. DAHİL KULLANIM İÇİN. |
| [get_Date](./get_date/)() const | Mevcut nesnenin temsil ettiği tarih ve saat değerinin tarih kısmını, zaman kısmının tüm bileşenleri 0 olarak ayarlanmış şekilde temsil eden yeni bir [DateTime](./) sınıfı örneğini döndürür. |
| [get_Day](./get_day/)() const | Mevcut nesnenin temsil ettiği ay içindeki günün sıra numarasını döndürür. |
| [get_DayOfWeek](./get_dayofweek/)() const | Mevcut nesnenin temsil ettiği haftanın gününü temsil eden bir değeri döndürür. |
| [get_DayOfYear](./get_dayofyear/)() const | Mevcut nesnenin temsil ettiği yıldaki günün sıra numarasını döndürür. |
| [get_Hour](./get_hour/)() const | Mevcut nesnenin temsil ettiği tarih ve saat değerinin saat bileşenini döndürür. |
| [get_Kind](./get_kind/)() const | Mevcut nesnenin temsil ettiği tarih ve saat değerinin yerel mi, UTC mi yoksa hiçbiri mi olduğunu temsil eden değeri döndürür. |
| [get_Millisecond](./get_millisecond/)() const | Mevcut nesnenin temsil ettiği tarih ve saat değerinin milisaniye bileşenini döndürür. |
| [get_Minute](./get_minute/)() const | Geçerli nesne tarafından temsil edilen tarih ve saat değerinin dakika bileşenini döndürür. |
| [get_Month](./get_month/)() const | Geçerli nesne tarafından temsil edilen yıldaki ayın sıra numarasını döndürür. |
| static [get_Now](./get_now/)() | [DateTime](./) sınıfının, geçerli zamanı yerel zaman olarak temsil eden bir örneğini döndürür. |
| [get_Second](./get_second/)() const | Geçerli nesne tarafından temsil edilen tarih ve saat değerinin saniye bileşenini döndürür. |
| [get_Ticks](./get_ticks/)() const | Geçerli nesne tarafından temsil edilen tarih ve saate kadar, Gregoryen takviminde 1 Ocak 0001, 0:00:00 UTC'den itibaren geçen 100 nanosanlık aralıkların sayısını döndürür. |
| [get_TimeOfDay](./get_timeofday/)() const | Geçerli nesne tarafından temsil edilen günün başlangıcından, aynı nesne tarafından temsil edilen tarih ve saat değerine kadar olan zaman aralığını temsil eden değeri döndürür. |
| static [get_Today](./get_today/)() | [DateTime](./) sınıfının, nesne tarafından temsil edilen değerin zaman kısmının her bileşeni 0 olarak ayarlanmış geçerli tarihi temsil eden bir örneğini döndürür. |
| static [get_UtcNow](./get_utcnow/)() | [DateTime](./) sınıfının, geçerli zamanı UTC olarak temsil eden bir örneğini döndürür. |
| [get_Year](./get_year/)() const | Geçerli nesne tarafından temsil edilen yılı döndürür. |
| [GetDateComponents](./getdatecomponents/)(int\&, int\&, int\&) const | Tarih bölümlerini alır. DAHİL KULLANIM İÇİN. |
| [GetDateTimeFormats](./getdatetimeformats/)() const | Her bir öğesi, geçerli nesnenin standart tarih ve saat biçim belirteçlerinden biriyle biçimlendirilmiş dize temsili olan dize dizisini döndürür. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t) const | Her bir öğesi, geçerli nesnenin belirtilen standart tarih ve saat biçim belirteciyle biçimlendirilmiş dize temsili olan dize dizisini döndürür. |
| [GetDateTimeFormats](./getdatetimeformats/)(const SharedPtr\<IFormatProvider\>\&) const | Her bir öğesi, geçerli nesnenin standart tarih ve saat biçim belirteçlerinden biri ve belirtilen biçim sağlayıcıyla biçimlendirilmiş dize temsili olan dize dizisini döndürür. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t, const SharedPtr\<IFormatProvider\>\&) const | Her bir öğesi, geçerli nesnenin belirtilen standart tarih ve saat biçim belirteci ve biçim sağlayıcıyla biçimlendirilmiş dize temsili olan dize dizisini döndürür. |
| [GetHashCode](./gethashcode/)() const | Mevcut nesne için bir karma kodu döndürür. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)() const | Geçerli nesne tarafından temsil edilen tarih ve saat değerinin, geçerli saat dilimi için yaz saati uygulama aralığına düşüp düşmediğini belirler. |
| static [IsLeapYear](./isleapyear/)(int) | Belirtilen yılın artık yıl olup olmadığını belirler. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(DateTime) const | Geçerli nesne ile belirtilen [DateTime](./) nesnesinin farklı tarih ve saat değerlerini temsil edip etmediğini belirler. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | [DateTime](./) sınıfının, geçerli nesne tarafından temsil edilen değer ile belirtilen zaman aralığının toplamı olan tarih ve saat değerini temsil eden yeni bir örneğini döndürür. |
| [operator+=](./operator+=/)(TimeSpan) | Geçerli nesneyi, geçerli nesne tarafından temsil edilen değer ile belirtilen zaman aralığının toplamı olan tarih ve saat değerine ayarlar. |
| [operator-](./operator-/)(TimeSpan) const | [DateTime](./) sınıfının, geçerli nesne tarafından temsil edilen değerden belirtilen zaman aralığının çıkarılmasıyla elde edilen tarih ve saat değerini temsil eden yeni bir örneğini döndürür. |
| [operator-](./operator-/)(DateTime) const | Geçerli ve belirtilen nesneler tarafından temsil edilen tarih ve zaman değerleri arasındaki zaman aralığını temsil eden bir [TimeSpan](../timespan/) sınıf örneği döndürür. |
| [operator-=](./operator-=/)(TimeSpan) | Geçerli nesneyi, geçerli nesne tarafından temsil edilen tarih ve saat değerinden belirtilen zaman aralığının çıkarılmasıyla elde edilen tarih ve saat değerine ayarlar. |
| [operator<](./operator_/)(DateTime) const | Geçerli nesnenin, belirtilen [DateTime](./) nesnesi tarafından temsil edilen değerden daha erken bir tarih ve saat değerini temsil edip etmediğini belirler. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(DateTime) const | Geçerli nesnenin, belirtilen [DateTime](./) nesnesi tarafından temsil edilen değer ile aynı ya da daha erken bir tarih ve saat değerini temsil edip etmediğini belirler. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const DateTime\&) | Belirtilen [DateTime](./) örneği tarafından temsil edilen değeri geçerli nesneye atar. |
| [operator==](./operator==/)(DateTime) const | Geçerli nesne ile belirtilen [DateTime](./) nesnesinin aynı tarih ve saat değerini temsil edip etmediğini belirler. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(DateTime) const | Geçerli nesnenin, belirtilen [DateTime](./) nesnesi tarafından temsil edilen değerden daha sonraki tarih ve saat değerini temsil edip etmediğini belirler. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(DateTime) const | Geçerli nesnenin, belirtilen [DateTime](./) nesnesi tarafından temsil edilen değerle aynı veya daha sonraki tarih ve saat değerini temsil edip etmediğini belirler. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Belirtilen tarih ve saat değerinin dize temsiliğini eşdeğer [DateTime](./) nesnesine dönüştürür. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Belirtilen tarih ve saat değerinin dize temsiliğini, kültüre özgü biçim bilgilerini kullanarak eşdeğer [DateTime](./) nesnesine dönüştürür. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Belirtilen tarih ve saat değerinin dize temsiliğini, belirtilen biçim ve kültüre özgü biçim bilgilerini kullanarak eşdeğer [DateTime](./) nesnesine dönüştürür. Dize temsiliğinin biçimi, belirtilen biçime tam olarak uymalıdır. Dönüştürme başarısız olursa bir istisna fırlatılır. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Belirtilen tarih ve saat değerinin dize temsiliğini, belirtilen biçimler, kültüre özgü biçim bilgileri ve stil kullanarak eşdeğer [DateTime](./) nesnesine dönüştürür. Dize temsiliğinin biçimi, belirtilen biçimlerden bir veya daha fazlasına tam olarak uymalıdır. Dönüştürme başarısız olursa bir istisna fırlatılır. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [SpecifyKind](./specifykind/)(DateTime, DateTimeKind) | Belirtilen [DateTime](./) nesnesiyle aynı sayıda tik'i temsil eden ve argüman **kind** tarafından belirtilen şekilde yerel zaman, UTC zamanı veya hiçbirini temsil etmeyen yeni bir [DateTime](./) nesnesi oluşturur. |
| [Subtract](./subtract/)(TimeSpan) const | [DateTime](./) sınıfının, geçerli nesne tarafından temsil edilen değerden belirtilen zaman aralığının çıkarılmasıyla elde edilen tarih ve saat değerini temsil eden yeni bir örneğini döndürür. |
| [Subtract](./subtract/)(DateTime) const | Geçerli ve belirtilen nesneler tarafından temsil edilen tarih ve saat değerleri arasındaki zaman aralığını temsil eden [TimeSpan](../timespan/) sınıfının bir örneğini döndürür. |
| [ToBinary](./tobinary/)() const | Geçerli nesneyi serileştirir. |
| [ToFileTime](./tofiletime/)() const | Geçerli nesne tarafından temsil edilen tarih ve saat değerini Dosya zamanı olarak temsil eden bir değeri döndürür. |
| [ToFileTimeUtc](./tofiletimeutc/)() const | Geçerli nesne tarafından temsil edilen tarih ve saat değerini UTC Dosya zamanına dönüştürür. |
| [ToLocalTime](./tolocaltime/)() const | Geçerli nesne tarafından temsil edilen tarih ve saat değerini yerel zaman olarak temsil eden yeni bir [DateTime](./) sınıf örneğini döndürür. |
| [ToLongDateString](./tolongdatestring/)() const | Geçerli nesnenin uzun tarih dize temsiliini içeren bir dize döndürür. |
| [ToLongTimeString](./tolongtimestring/)() const | Geçerli nesnenin uzun saat dize temsiliini içeren bir dize döndürür. |
| [ToOADate](./tooadate/)() const | Geçerli nesne tarafından temsil edilen tarih ve saat değerini OLE Automation Tarihi olarak döndürür. |
| [ToShortDateString](./toshortdatestring/)() const | Geçerli nesnenin kısa tarih dize temsiliini içeren bir dize döndürür. |
| [ToShortTimeString](./toshorttimestring/)() const | Geçerli nesnenin kısa saat dize temsiliini içeren bir dize döndürür. |
| [ToString](./tostring/)() const | Geçerli nesne tarafından temsil edilen tarih ve saat değerinin, geçerli kültür tarafından tanımlanan biçimlendirme kurallarını kullanarak dize temsiliini döndürür. |
| [ToString](./tostring/)(const String\&) const | Geçerli nesne tarafından temsil edilen tarih ve saat değerinin, belirtilen biçim ve geçerli kültür tarafından tanımlanan biçimlendirme kurallarını kullanarak dize temsiliini döndürür. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Geçerli nesne tarafından temsil edilen tarih ve saat değerinin, belirtilen biçim bilgilerini kullanarak dize temsiliini döndürür. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Geçerli nesne tarafından temsil edilen tarih ve saat değerinin, belirtilen biçim bilgilerini kullanarak dize temsiliini döndürür. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToUniversalTime](./touniversaltime/)() const | Geçerli nesne tarafından temsil edilen tarih ve saat değerini UTC olarak temsil eden yeni bir [DateTime](./) sınıf örneğini döndürür. |
| [ToUnixTime](./tounixtime/)() const | Geçerli nesne tarafından temsil edilen tarih ve saat değerini Unix zamanı olarak temsil eden bir değeri döndürür. DAHİL KULLANIM İÇİN. |
| static [TryParse](./tryparse/)(const String\&, DateTime\&) | Belirtilen tarih ve saat değerinin dize temsiliğini eşdeğer [DateTime](./) nesnesine dönüştürür. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Belirtilen tarih ve saat değerinin dize temsiliğini, belirtilen kültüre özgü biçim bilgileri ve stil kullanarak eşdeğer [DateTime](./) nesnesine dönüştürür. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Belirtilen tarih ve saat değerinin dize temsiliğini, belirtilen biçim, kültüre özgü biçim bilgileri ve stil kullanarak eşdeğer [DateTime](./) nesnesine dönüştürür. Dize temsiliğinin biçimi, belirtilen biçime tam olarak uymalıdır. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Belirtilen tarih ve saat değerinin dize temsiliğini, belirtilen biçimler, kültüre özgü biçim bilgileri ve stil kullanarak eşdeğer [DateTime](./) nesnesine dönüştürür. Dize temsiliğinin biçimi, belirtilen biçimlerden bir veya daha fazlasına tam olarak uymalıdır. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [Type](./type/)() | Bu sınıf hakkında bilgi içeren bir [TypeInfo](../typeinfo/) nesnesi döndürür. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static constexpr [MaxTicks](./maxticks/) | Minimum olası ve maksimum olası [DateTime](./) değeri arasındaki zaman aralığındaki 100 nanosaniye sayısı. |
| static [MaxValue](./maxvalue/) | Maksimum olası tarih ve saat değerini temsil eden bir [DateTime](./) sınıfı örneği. |
| static constexpr [MinTicks](./minticks/) | [DateTime](./) sınıfının bir örneğinin temsil edebileceği minimum tik sayısı. |
| static [MinValue](./minvalue/) | Minimum olası tarih ve saat değerini temsil eden bir [DateTime](./) sınıfı örneği. |
| static constexpr [TicksPerDay](./ticksperday/) | Bir günde bulunan tik sayısı. |
| static constexpr [TicksPerHour](./ticksperhour/) | Bir saatte bulunan tik sayısı. |
| static constexpr [TicksPerMicrosecond](./tickspermicrosecond/) | Bir mikrosaniyede bulunan tik sayısı. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | Bir milisaniyede bulunan tik sayısı. |
| static constexpr [TicksPerMinute](./ticksperminute/) | Bir dakikada bulunan tik sayısı. |
| static constexpr [TicksPerSecond](./tickspersecond/) | Bir saniyede bulunan tik sayısı. |
| static [UnixEpoch](./unixepoch/) | Unix epoch başlangıcını (1970.01.01 00:00:00) temsil eden bir [DateTime](./) sınıfı örneği. |
## Açıklamalar



```cpp
#include "system/console.h"
#include "system/date_time.h"

int main()
{
  using namespace System;

  // 'DateTime' sınıfı örneğini oluştur.
  DateTime dateTime{1990, 10, 30};

  // Örneği birden fazla biçimde yazdır.
  Console::WriteLine(dateTime.ToShortDateString());
  Console::WriteLine(dateTime.ToShortTimeString());
  Console::WriteLine(dateTime.ToString());

  return 0;
}
/*
This code example produces the following output:
30.10.1990
0:00
30.10.1990 0:00:00
*/
```

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
