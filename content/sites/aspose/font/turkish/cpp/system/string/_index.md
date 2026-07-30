---
title: "System::String sınıfı"
linktitle: "Dize"
second_title: "Aspose.Font için C++"
description: "System::String sınıfı. Kütüphane genelinde kullanılan String sınıfı. Kod çevirirken C# System.String için bir ikame görevi görür. Optimizasyon nedenleriyle Object alt sınıfı olarak kabul edilmez. Bu tip yığıt üzerinde tahsis edilmeli ve fonksiyonlara değer olarak ya da referans olarak geçirilmelidir. C++'ta bu tipin nesnelerini yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 5800
url: /tr/cpp/system/string/
---
## String class


[String](./) class used across the library. Is a substitute for C# [System.String](./) when translating code. For optimization reasons, isn't considered an [Object](../object/) subclass. This type should be allocated on stack and passed to functions by value or by reference. Never use [System::SmartPtr](../smartptr/) class to manage objects of this type.

```cpp
class String
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ASPOSECPP_VALUE_TYPE_IMPLEMENTS_INTERFACES](./asposecpp_value_type_implements_interfaces/)() | [String](./) C++ tarafında değer tipidir ve (kalıtım olmadan) bazı arabirimleri örtük olarak uygular. |
| [begin](./begin/)() const | Gerçek string tamponunun başlangıcına işaretçi döndürür. Hiçbir şeyi yeniden tahsis etmez. Tamponun null ile sonlandırılmasını garanti etmez. |
| [Clone](./clone/)() const | Mevcut string'in bir kopyasını oluşturur. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool) | Less-equal-greater iki alt dizeyi karşılaştırır. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater iki alt dizeyi karşılaştırır. |
| static [Compare](./compare/)(const String\&, const String\&, System::StringComparison) | Less-equal-greater iki dizeyi karşılaştırır. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, System::StringComparison) | Less-equal-greater iki dizeyi karşılaştırır. |
| static [Compare](./compare/)(const String\&, const String\&, bool) | Less-equal-greater iki dizeyi karşılaştırır. |
| static [Compare](./compare/)(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater iki dizeyi karşılaştırır. |
| static [CompareOrdinal](./compareordinal/)(const String\&, const String\&) | Less-equal-greater iki dizeyi ordinal modda karşılaştırır. |
| static [CompareOrdinal](./compareordinal/)(const String\&, int, const String\&, int, int) | Less-equal-greater iki dizeyi ordinal modda karşılaştırır. |
| [CompareTo](./compareto/)(const String\&) const | İki dizeyi 'less-equals-more' stilinde karşılaştırır. Mevcut kültürü kullanır. |
| static [Concat](./concat/)(const ArrayPtr\<String\>\&) | Dizeleri birleştirir. |
| static [Concat](./concat/)(const String\&, const String\&) | Dizeleri birleştirir. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&) | Dizeleri birleştirir. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&, const String\&) | Dizeleri birleştirir. |
| [Contains](./contains/)(const String\&) const | str'nin mevcut string içinde bir alt dize olup olmadığını denetler. |
| [Contains](./contains/)(char16_t) const | string'in verilen karakteri içerip içermediğini denetler. |
| static [Copy](./copy/)(const String\&) | String kopyası oluşturur. |
| [CopyTo](./copyto/)(int, const ArrayPtr\<char_t\>\&, int, int) const | String karakterlerini mevcut dizi elemanlarına kopyalar. Yeniden boyutlandırma yapılmaz. |
| [end](./end/)() const | Gerçek string tamponunun sonuna işaretçi döndürür. Hiçbir zaman yeniden tahsis yapmaz. Tamponun null ile sonlandırılacağını garanti etmez. |
| [EndsWith](./endswith/)(const String\&) const | String'in belirtilen alt dizeyle bitip bitmediğini denetler. |
| [EndsWith](./endswith/)(const String\&, System::StringComparison) const | String'in belirtilen alt dizeyle bitip bitmediğini denetler. |
| [EndsWith](./endswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | String'in belirtilen alt dizeyle bitip bitmediğini denetler. |
| [Equals](./equals/)(const String\&, System::StringComparison) const | [String](./) eşitlik karşılaştırması. [StringComparison](../stringcomparison/) enumarasyonu tarafından sağlanan birkaç mod desteklenir. |
| [Equals](./equals/)(const String\&) const | [String](./) eşitlik karşılaştırması. [System::StringComparison::Ordinal](../stringcomparison/) karşılaştırma modunu kullanır. |
| static [Equals](./equals/)(const String\&, const String\&) | Equal iki dizeyi Ordial karşılaştırma modunu kullanarak karşılaştırır. |
| static [Equals](./equals/)(const String\&, const String\&, System::StringComparison) | Equal iki dizeyi karşılaştırır. |
| [FastToAscii](./fasttoascii/)(char, int) const | [String](./) nesnesini ASCII string'e dönüştürmeye çalışır. |
| static [Format](./format/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const Args\&...) | String'i C# stilinde biçimlendirir. |
| static [Format](./format/)(std::nullptr_t, const String\&, const Args\&...) | String'i C# stilinde biçimlendirir. |
| static [Format](./format/)(std::nullptr_t, const char16_t(&), const Args\&...) | String'i C# stilinde biçimlendirir. |
| static [Format](./format/)(const String\&, const Args\&...) | String'i C# stilinde biçimlendirir. |
| static [Format](./format/)(const String\&, const System::ArrayPtr\<T\>\&) | String'i C# stilinde biçimlendirir. |
| static [FromAscii](./fromascii/)(const char *) | ASCII string'den [String](./) oluşturur. |
| static [FromAscii](./fromascii/)(const char *, int) | ASCII string'den [String](./) oluşturur. |
| static [FromAscii](./fromascii/)(const std::string\&) | ASCII string'den [String](./) oluşturur. |
| static [FromUtf16](./fromutf16/)(const std::u16string\&) | utf16 string'den [String](./) oluşturur. |
| static [FromUtf32](./fromutf32/)(const uint32_t *, int32_t) | utf32 string'den [String](./) oluşturur. |
| static [FromUtf8](./fromutf8/)(const char *) | utf8 string'den [String](./) oluşturur. |
| static [FromUtf8](./fromutf8/)(const char *, int) | utf8 string'den [String](./) oluşturur. |
| static [FromUtf8](./fromutf8/)(const uint8_t *) | utf8 string'den [String](./) oluşturur. |
| static [FromUtf8](./fromutf8/)(const std::string\&) | utf8 string'den [String](./) oluşturur. |
| static [FromWCS](./fromwcs/)(const std::wstring\&) | widestring'den [String](./) oluşturur. |
| [get_Length](./get_length/)() const | String uzunluğunu alır. |
| [GetHashCode](./gethashcode/)() const | İçerilen string'i hash'ler. ICU'da uygulanmıştır, C#'daki hash'lerle eşleşmez. |
| [IndexOf](./indexof/)(const String\&, System::StringComparison) const | Alt dize ileri arama. |
| [IndexOf](./indexof/)(char_t, int) const | Karakter ileri arama. |
| [IndexOf](./indexof/)(char_t, int, int) const | Alt dizede karakter ileri arama. |
| [IndexOf](./indexof/)(const String\&, int) const | Alt dize ileri arama. |
| [IndexOf](./indexof/)(const String\&, int, System::StringComparison) const | Alt dize ileri arama. |
| [IndexOf](./indexof/)(const String\&, int, int, System::StringComparison) const | Alt dize ileri arama. |
| [IndexOf](./indexof/)(const String\&, int, int) const | Alt dize ileri arama. |
| [IndexOfAny](./indexofany/)(char_t, int) const | Karakter ileri arama. |
| [IndexOfAny](./indexofany/)(const String\&, int) const | Sonuç olarak, bu içinde str'nin tüm karakterlerini arar. İlk karakter bulunursa, konumu döndürülür, aksi takdirde ikinci karakteri ve böyle devam eder. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&) const | Geçirilen karakterlerin herhangi birini tüm dizede arar. İlk dize karakterini anyOf içindeki tüm karakterlerle karşılaştırır, ardından ikinci karakteri ve böyle devam eder. Hedef karakterlerden herhangi biriyle eşleşen ilk karakterin indeksini döndürür. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | Geçirilen karakterlerin herhangi birini alt dizede arar. İlk dize karakterini anyOf içindeki tüm karakterlerle karşılaştırır, ardından ikinci karakteri ve böyle devam eder. Hedef karakterlerden herhangi biriyle eşleşen ilk karakterin indeksini döndürür. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | Geçirilen karakterlerin herhangi birini alt dizede arar. İlk dize karakterini anyOf içindeki tüm karakterlerle karşılaştırır, ardından ikinci karakteri ve böyle devam eder. Hedef karakterlerden herhangi biriyle eşleşen ilk karakterin indeksini döndürür. |
| [Insert](./insert/)(int, const String\&) const | Alt diziyi belirtilen konuma ekler. |
| [Is](./is/)(const System::TypeInfo\&) const | Geçirilen [TypeInfo](../typeinfo/) tarafından belirtilen türe ait olup olmadığını kontrol eder. |
| [IsAsciiString](./isasciistring/)() const | Bir [String](./) yalnızca ASCII sembolleri içeriyorsa gösterir. |
| [IsEmpty](./isempty/)() const | Dizenin hem null olmayan hem de boş olup olmadığını kontrol eder. |
| [IsNormalized](./isnormalized/)(System::Text::NormalizationForm) const | Unicode dizenin belirtilen normalizasyon biçimi kullanılarak normalize edilip edilmediğini kontrol eder. |
| [IsNull](./isnull/)() const | Dizenin null olarak kabul edilip edilmediğini kontrol eder. [String](./), yalnızca [String()](./string/) yapıcısı ile oluşturulmuş, taşınmış, kopyalanmış veya null dizeden atanmış ya da [reset()](./reset/) yöntemi çağrılmışsa null olur. |
| [IsNullOrEmpty](./isnullorempty/)() const | Dizenin boş ya da null olarak kabul edilip edilmediğini kontrol eder. |
| static [IsNullOrEmpty](./isnullorempty/)(const String\&) | Geçirilen dizenin null ya da boş olup olmadığını kontrol eder. |
| static [IsNullOrWhiteSpace](./isnullorwhitespace/)(const String\&) | Belirtilen dizenin null, boş veya yalnızca boşluk karakterlerinden oluşup oluşmadığını gösterir. |
| static [Join](./join/)(const String\&, const ArrayPtr\<String\>\&, int, int) | Diziyi ayırıcı olarak dize kullanarak birleştirir. |
| static [Join](./join/)(const String\&, const System::Details::ArrayView\<String\>\&, int, int) | Diziyi ayırıcı olarak dize kullanarak birleştirir. |
| static [Join](./join/)(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) | Diziyi ayırıcı olarak dize kullanarak birleştirir. |
| static [Join](./join/)(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) | Diziyi ayırıcı olarak dize kullanarak birleştirir. |
| [LastIndexOf](./lastindexof/)(const String\&, int) const | Alt dize geri arama. |
| [LastIndexOf](./lastindexof/)(const String\&, System::StringComparison) const | Alt dize geri arama. |
| [LastIndexOf](./lastindexof/)(const String\&, int, System::StringComparison) const | Alt dize geri arama. |
| [LastIndexOf](./lastindexof/)(const String\&, int, int, StringComparison) const | Alt dize geri arama. |
| [LastIndexOf](./lastindexof/)(char_t) const | Karakter geri arama. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t) const | Karakter geri arama. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t, int32_t) const | Karakter geri arama. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&) const | Geçirilen karakterlerin herhangi birini tüm dizede geriye doğru arar. Son dize karakterini anyOf içindeki tüm karakterlerle karşılaştırır, ardından bir önceki karakteri ve böyle devam eder. Bulunan ilk eşleşmenin indeksini döndürür. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | Geçirilen karakterlerin herhangi birini alt dizede geriye doğru arar. Son dize karakterini anyOf içindeki tüm karakterlerle karşılaştırır, ardından bir önceki karakteri ve böyle devam eder. Bulunan ilk eşleşmenin indeksini döndürür. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | Geçirilen karakterlerin herhangi birini alt dizede geriye doğru arar. Son dize karakterini anyOf içindeki tüm karakterlerle karşılaştırır, ardından bir önceki karakteri ve böyle devam eder. Bulunan ilk eşleşmenin indeksini döndürür. |
| [Normalize](./normalize/)(System::Text::NormalizationForm) const | Belirtilen normalizasyon biçimini kullanarak unicode dizeyi normalize eder. |
| [operator!=](./operator!=/)(const String\&) const | Eşitsizlik karşılaştırma operatörü. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Dizenin null olmadığını kontrol eder. [IsNull()](./isnull/) çağrısı ile aynı mantığı uygular. |
| [operator+](./operator+/)(const String\&) const | [String](./) birleştirme operatörü. |
| [operator+](./operator+/)(const T\&) const | [String](./) dize sabiti veya karakter dize işaretçisiyle birleştirme. |
| [operator+](./operator+/)(char_t) const | Dizgenin sonuna karakter ekler. |
| [operator+](./operator+/)(int) const | Dizgenin sonuna tamsayı değerinin dize temsilini ekler. |
| [operator+](./operator+/)(uint32_t) const | Dizgenin sonuna işaretsiz tamsayı değerinin dize temsilini ekler. |
| [operator+](./operator+/)(double) const | Dizgenin sonuna kayan nokta değerinin dize temsilini ekler. |
| [operator+](./operator+/)(int64_t) const | Dizgenin sonuna tamsayı değerinin dize temsilini ekler. |
| [operator+](./operator+/)(const T\&) const | Dizgenin sonuna referans tipindeki nesnenin dize temsilini ekler. |
| [operator+](./operator+/)(const T\&) const | Dizgenin sonuna referans tipindeki nesnenin dize temsilini ekler. |
| [operator+](./operator+/)(T) const | Dizgenin sonuna boolean değerinin dize temsilini ekler. |
| [operator+=](./operator+=/)(char_t) | Birleştirme atama operatörü. |
| [operator+=](./operator+=/)(const String\&) | Birleştirme atama operatörü. |
| [operator+=](./operator+=/)(double) | Birleştirme atama operatörü. |
| [operator+=](./operator+=/)(uint8_t) | Birleştirme atama operatörü. |
| [operator+=](./operator+=/)(int16_t) | Birleştirme atama operatörü. |
| [operator+=](./operator+=/)(uint16_t) | Birleştirme atama operatörü. |
| [operator+=](./operator+=/)(int32_t) | Birleştirme atama operatörü. |
| [operator+=](./operator+=/)(uint32_t) | Birleştirme atama operatörü. |
| [operator+=](./operator+=/)(int64_t) | Birleştirme atama operatörü. |
| [operator+=](./operator+=/)(uint64_t) | Birleştirme atama operatörü. |
| [operator+=](./operator+=/)(T) | Birleştirme atama operatörü. |
| [operator<](./operator_/)(const String\&) const | Dizgileri sıralı karşılaştırır. |
| [operator=](./operator=/)(const String\&) | Atama operatörü. |
| [operator=](./operator=/)(String\&&) | Taşıma atama operatörü. |
| [operator==](./operator==/)(const String\&) const | Eşitlik karşılaştırma operatörü. |
| [operator==](./operator==/)(std::nullptr_t) const | Dizgenin null olup olmadığını kontrol eder. Aynı mantığı [IsNull()](./isnull/) çağrısı gibi uygular. |
| [operator>](./operator_/)(const String\&) const | Dizgileri sıralı karşılaştırır. |
| [operator[]](./operator[]/)(int) const | Belirtilen konumdaki karakteri alır. |
| [PadLeft](./padleft/)(int, char_t) const | Orijinal dizgenin sol tarafına doldurma ekler. |
| [PadRight](./padright/)(int, char_t) const | Orijinal dizgenin sağ tarafına doldurma ekler. |
| [rbegin](./rbegin/)() const | Gerçek dize tamponunun son karakterine (varsa) ters yineleyici döndürür. |
| [Remove](./remove/)(int32_t, int32_t) const | Mevcut dizgeden alt dize dışındaki her şeyi çıkarır. |
| [rend](./rend/)() const | Gerçek dize tamponunun ilk karakterinden önceki (varsa) ters yineleyiciyi döndürür. |
| [Replace](./replace/)(char_t, char_t) const | Dizgedeki karakterin tüm görünümlerini değiştirir. |
| [Replace](./replace/)(const String\&, const String\&) const | Bu dizgedeki arama değerinin tüm görünümlerini değiştirir. |
| [reset](./reset/)() | Dizgeyi null olarak ayarlar. C#'deki 'string_variable_name = null' ifadesine benzer. |
| [SetCharAt](./setcharat/)(int, char_t) | Belirtilen konumdaki karakteri ayarlar. |
| [Split](./split/)(char_t, StringSplitOptions) const | Dizgeyi karaktere göre böler. |
| [Split](./split/)(char_t, int32_t, StringSplitOptions) const | Dizgeyi karaktere göre böler. |
| [Split](./split/)(char_t, char_t, StringSplitOptions) const | Dizgeyi iki karakterden birine göre böler. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, StringSplitOptions) const | Dizgeyi belirtilen karakterlerden birine göre böler. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const | Dizgeyi belirtilen karakterlerden birine göre böler. |
| [Split](./split/)(const String\&, StringSplitOptions) const | Dizeyi alt dizeye göre böler. |
| [Split](./split/)(const String\&, int, StringSplitOptions) const | Dizeyi alt dizeye göre böler. |
| [Split](./split/)(const ArrayPtr\<String\>\&, StringSplitOptions) const | Dizeyi alt dizeye göre böler. |
| [Split](./split/)(const ArrayPtr\<String\>\&, int, StringSplitOptions) const | Dizeyi alt dizeye göre böler. Şu anda yalnızca sıfır veya bir öğeden oluşan ayırıcılar dizisini destekler. |
| [StartsWith](./startswith/)(const String\&) const | Dizenin belirtilen alt dizeyle başlayıp başlamadığını kontrol eder. |
| [StartsWith](./startswith/)(const String\&, System::StringComparison) const | Dizenin belirtilen alt dizeyle başlayıp başlamadığını kontrol eder. |
| [StartsWith](./startswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Dizenin belirtilen alt dizeyle başlayıp başlamadığını kontrol eder. |
| [String](./string/)() | Varsayılan yapıcı. Null olarak kabul edilen bir dize nesnesi oluşturur. |
| [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) | Dizeyi dize sabiti temel alarak oluşturur. Sabiti null sonlu bir dize olarak kabul eder, hedef dize uzunluğunu sabit boyutuna göre hesaplar. |
| [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) | Dizeyi karakter dize işaretçisi temel alarak oluşturur. İşaret edilen dizeyi null sonlu olarak kabul eder, hedef dize uzunluğunu null karakterine göre hesaplar. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) | Dizeyi dize sabiti temel alarak oluşturur. Sabiti UTF8'de null sonlu bir dize olarak kabul eder, hedef dize uzunluğunu sabit boyutuna göre hesaplar. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) | Dizeyi karakter dize işaretçisi temel alarak oluşturur. İşaret edilen dizeyi UTF8'de null sonlu olarak kabul eder, hedef dize uzunluğunu null karakterine göre hesaplar. |
| [String](./string/)(const char16_t *, int) | Dizeyi karakter dize işaretçisi ve açık uzunluktan oluşturur. |
| [String](./string/)(const char *, int) | Dizeyi karakter dize işaretçisi ve açık uzunluktan oluşturur. |
| [String](./string/)(const char16_t *, int, int) | Dizeyi karakter dize işaretçisinden başlangıç konumundan uzunluk kullanarak oluşturur. |
| explicit [String](./string/)(const char16_t, int) | Doldurma yapıcı. |
| [String](./string/)(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) | Nullptr yapıcı. Diğer şablon yapıcılarla öncelikleri çözmek için şablon olarak bildirilir. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) | Dizeyi geniş dize sabiti temel alarak oluşturur. Sabiti null sonlu bir dize olarak kabul eder, hedef dize uzunluğunu sabit boyutuna göre hesaplar. wchar_t dönüşümü bazı platformlarda zaman alıcıdır, bu yüzden örtük dönüşümlere izin verilmez. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) | Dizeyi geniş karakter dize işaretçisi temel alarak oluşturur. İşaret edilen dizeyi null sonlu olarak kabul eder, hedef dize uzunluğunu null karakterine göre hesaplar. wchar_t dönüşümü bazı platformlarda zaman alıcıdır, bu yüzden örtük dönüşümlere izin verilmez. |
| explicit [String](./string/)(const wchar_t *, int) | Dizeyi geniş karakter dize işaretçisi ve açık uzunluktan oluşturur. wchar_t dönüşümü bazı platformlarda zaman alıcıdır, bu yüzden örtük dönüşümlere izin verilmez. |
| explicit [String](./string/)(const wchar_t, int) | Doldurma yapıcı. wchar_t dönüşümü bazı platformlarda zaman alıcıdır, bu yüzden örtük dönüşümlere izin verilmez. |
| [String](./string/)(const String\&) | Kopya yapıcı. |
| [String](./string/)(String\&&) | Taşıma kurucusu. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&) | Tüm karakter dizisini dizeye dönüştürür. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&, int, int) | Karakter dizisinin alt aralığını dizeye dönüştürür. Parametreler dizi sınırları dışındaysa, boş bir dize oluşturulur. |
| explicit [String](./string/)(const codeporting_icu::UnicodeString\&) | UnicodeString'i [String](./) içine sarar. |
| explicit [String](./string/)(codeporting_icu::UnicodeString\&&) | Taşıma kurucusu. |
| explicit [String](./string/)(const std::wstring\&) | widestring'den [String](./) oluşturur. |
| explicit [String](./string/)(const std::u16string\&) | utf16 string'den [String](./) oluşturur. |
| explicit [String](./string/)(const std::string\&) | UTF-8 formatında sunulan std::string dizesinden [String](./) oluşturur. |
| explicit [String](./string/)(const std::u32string\&) | std::u32string dizesinden [String](./) oluşturur. |
| [Substring](./substring/)(int32_t) const | Alt dizeyi çıkarır. |
| [Substring](./substring/)(int32_t, int32_t) const | Alt dizeyi çıkarır. |
| [ToAsciiString](./toasciistring/)() const | Dizeyi std::string'e dönüştürür. ASCII kodlamasını kullanır. |
| [ToByteArray](./tobytearray/)(int32_t, int32_t, bool) const | Dizeyi veya alt diziyi bayt dizisine dönüştürür. |
| [ToCharArray](./tochararray/)(int32_t, int32_t) const | Dizeyi veya alt diziyi karakter dizisine dönüştürür. |
| [ToLower](./tolower/)() const | Tüm dize karakterlerini küçük harfe dönüştürür. |
| [ToLower](./tolower/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Tüm dize karakterlerini belirli bir kültür kullanarak küçük harfe dönüştürür. |
| [ToLowerInvariant](./tolowerinvariant/)() const | Tüm dize karakterlerini değişmez kültür kullanarak küçük harfe dönüştürür. |
| [ToString](./tostring/)() const | Değer türü nesnelerinde [ToString()](./tostring/) çağrıldığında [String](./) sınıfını işlemek için bir sarmalayıcı. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Değer türü nesnelerinde [ToString()](./tostring/) çağrıldığında [String](./) sınıfını işlemek için bir sarmalayıcı. |
| [ToU16Str](./tou16str/)() const | Dizeyi std::u16string'e dönüştürür. |
| [ToU32Str](./tou32str/)() const | Dizeyi std::u32string'e dönüştürür. |
| [ToUpper](./toupper/)() const | Tüm dize karakterlerini büyük harfe dönüştürür. |
| [ToUpper](./toupper/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Tüm dize karakterlerini belirli bir kültür kullanarak büyük harfe dönüştürür. |
| [ToUpperInvariant](./toupperinvariant/)() const | Tüm dize karakterlerini değişmez kültür kullanarak büyük harfe dönüştürür. |
| [ToUtf8String](./toutf8string/)() const | Dizeyi std::string'e dönüştürür. UTF-8 kodlamasını kullanır. |
| [ToWCS](./towcs/)() const | Dizeyi std::wstring'e dönüştürür. |
| [Trim](./trim/)() const | Dizenin başından ve sonundan tüm boşluk karakterlerini kaldırır. |
| [Trim](./trim/)(char_t) const | Dizenin başından ve sonundan verilen karakterin tüm tekrarlarını kaldırır. |
| [Trim](./trim/)(const String\&) const | Dizenin başından ve sonundan verilen karakterlerin tüm tekrarlarını kaldırır. |
| [Trim](./trim/)(const ArrayPtr\<char_t\>\&) const | Dizenin başından ve sonundan verilen karakterlerin tüm tekrarlarını kaldırır. |
| [TrimEnd](./trimend/)() const | Dizenin sonundan tüm boşluk karakterlerini kaldırır. |
| [TrimEnd](./trimend/)(char_t) const | Dizenin sonundan verilen karakterin tüm tekrarlarını kaldırır. |
| [TrimEnd](./trimend/)(const String\&) const | Dizenin sonundan verilen karakterlerin tüm tekrarlarını kaldırır. |
| [TrimEnd](./trimend/)(const ArrayPtr\<char_t\>\&) const | Dizenin sonundan verilen karakterlerin tüm tekrarlarını kaldırır. |
| [TrimStart](./trimstart/)() const | Dizenin başından tüm boşluk karakterlerini kaldırır. |
| [TrimStart](./trimstart/)(char_t) const | Dizenin başından verilen karakterin tüm tekrarlarını kaldırır. |
| [TrimStart](./trimstart/)(const String\&) const | Dizenin başından verilen karakterlerin tüm tekrarlarını kaldırır. |
| [TrimStart](./trimstart/)(const ArrayPtr\<char_t\>\&) const | Dizenin başından verilen karakterlerin tüm tekrarlarını kaldırır. |
| [u_str](./u_str/)() const | ICU tarzı null sonlandırmalı tampon döndürür. Dizeyi yeniden tahsis edebilir. |
| [~String](./~string/)() | Yıkıcı. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](./empty/) | Boş dize. |
| static [Null](./null/) | Null dize. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [reverse_iterator](./reverse_iterator/) | Reverse iterator türü. |
## Açıklamalar



```cpp
#include "system/string.h"
#include <iostream>

int main()
{
  // Karakter dizisinden bir dize oluştur ve yazdır.
  const auto chars = {u'h', u'e', u'l', u'l', u'o'};
  const System::String string1(chars);
  std::cout << string1 << std::endl;

  // Bayt dizisinden bir dize oluştur ve yazdır.
  const uint8_t bytes[] = {0x77, 0x6f, 0x72, 0x6c, 0x64, 0x0};
  const auto string2 = System::String::FromUtf8(bytes);
  std::cout << string2 << std::endl;

  // Aşağıdaki dizeyi kırpın ve yazdırın.
  const System::String string3(u"   This string contains whitespaces in the beginning and at the end.   ");
  std::cout << '"' << string3.Trim() << '"' << std::endl;

  // Metindeki kelime sayısını yazdırın.
  std::cout << "Number of words: " << string3.Trim().Split(' ')->get_Length() << std::endl;

  return 0;
}
/*
This code example produces the following output:
hello
world
"This string contains whitespaces in the beginning and at the end."
Number of words: 11
*/
```

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
