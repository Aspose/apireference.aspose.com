---
title: "System::Globalization::CultureInfo class"
linktitle: "CultureInfo"
second_title: "Aspose.Font için C++"
description: "System::Globalization::CultureInfo sınıfı. Kültüre özgü değerlerin ve algoritmaların koleksiyonu. Ayarlayıcı işlemler yalnızca okuma-yazma olmayan nesnelerde etkindir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tür bir örnek asla yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın C++'da."
type: docs
weight: 500
url: /tr/cpp/system.globalization/cultureinfo/
---
## CultureInfo class


Kültüre özgü değerlerin ve algoritmaların koleksiyonu. Ayarlayıcı işlemler yalnızca okuma-yazma olmayan nesnelerde etkindir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tür bir örnek asla yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class CultureInfo : public virtual System::Object,
                    public System::IFormatProvider,
                    public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ClearCachedData](./clearcacheddata/)() | Önbelleğe alınmış kültür bilgilerini yeniler. |
| [Clone](./clone/)() override | Kültür bilgisini klonlar. |
| static [CreateSpecificCulture](./createspecificculture/)(const String\&) | İsimle kültür oluşturur. |
| explicit [CultureInfo](./cultureinfo/)(int) | RTTI bilgisi. |
| [CultureInfo](./cultureinfo/)(int, bool) | Yapıcı. |
| explicit [CultureInfo](./cultureinfo/)(const String\&) | Yapıcı. |
| [CultureInfo](./cultureinfo/)(const String\&, bool) | Yapıcı. |
| [CultureInfo](./cultureinfo/)(std::nullptr_t) | Her zaman ArgumentNullException fırlatır. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Nesneleri karşılaştırır. |
| virtual [get_Calendar](./get_calendar/)() const | Kültür tarafından kullanılan takvimi alır. |
| virtual [get_CompareInfo](./get_compareinfo/)() const | Kültür kurallarına uyan dize karşılaştırıcısını alır. |
| [get_CultureTypes](./get_culturetypes/)() const | Geçerli kültürü tanımlayan kültür türlerinin bit düzeyinde birleşimini alır. |
| static [get_CurrentCulture](./get_currentculture/)() | Geçerli iş parçacığı için ayarlanan kültürü alır. |
| static [get_CurrentUICulture](./get_currentuiculture/)() | Geçerli iş parçacığının UI kültürünü alır. |
| virtual [get_DateTimeFormat](./get_datetimeformat/)() const | Tarih biçimi bilgilerini alır. |
| static [get_DefaultThreadCurrentCulture](./get_defaultthreadcurrentculture/)() | Geçerli uygulama alanındaki varsayılan kültürü alır. |
| static [get_DefaultThreadCurrentUICulture](./get_defaultthreadcurrentuiculture/)() | Geçerli uygulama alanındaki varsayılan UI kültürünü alır. |
| virtual [get_DisplayName](./get_displayname/)() const | Kültürün görüntüleme adını alır. |
| virtual [get_EnglishName](./get_englishname/)() const | Kültürün İngilizce adını alır. |
| [get_IetfLanguageTag](./get_ietflanguagetag/)() const | Bir dil için RFC 4646 adını alır. |
| static [get_InstalledUICulture](./get_installeduiculture/)() | İşletim sistemiyle kurulu kültürü alır. |
| static [get_InvariantCulture](./get_invariantculture/)() | Değişmez kültürü alır. |
| virtual [get_IsNeutralCulture](./get_isneutralculture/)() const | Kültürün nötr olup olmadığını denetler. |
| [get_IsReadOnly](./get_isreadonly/)() const | Kültür nesnesinin sadece okunur olup olmadığını denetler. |
| virtual [get_KeyboardLayoutId](./get_keyboardlayoutid/)() const | Etkin giriş yerel ayarı tanımlayıcısını alır. |
| virtual [get_LCID](./get_lcid/)() const | Kültür tanımlayıcısını alır. |
| virtual [get_Name](./get_name/)() const | Kültür adını alır. |
| virtual [get_NativeName](./get_nativename/)() const | Kültürün yerel adını alır. |
| virtual [get_NumberFormat](./get_numberformat/)() const | Sayı biçimi bilgilerini alır. |
| virtual [get_OptionalCalendars](./get_optionalcalendars/)() const | Kültürle birlikte kullanılabilecek takvimlerin listesi. |
| virtual [get_Parent](./get_parent/)() const | Üst kültürü alır. |
| virtual [get_TextInfo](./get_textinfo/)() const | Kültür tarafından kullanılan metin parametrelerini alır. |
| virtual [get_ThreeLetterISOLanguageName](./get_threeletterisolanguagename/)() const | Üç harfli ISO 639-2 dil kodunu alır. |
| virtual [get_ThreeLetterWindowsLanguageName](./get_threeletterwindowslanguagename/)() const | Dil için üç harfli kodu, [Windows](../../system.windows/) API'sinde tanımlandığı gibi alır. |
| virtual [get_TwoLetterISOLanguageName](./get_twoletterisolanguagename/)() const | Kültürle ilişkili iki harfli ISO dil adını alır. |
| [get_UseUserOverride](./get_useuseroverride/)() const | Kullanıcı tarafından seçilen kültür ayarlarını [CultureInfo](./) kullanıp kullanmadığını gösteren bir bayrağı alır. |
| [GetConsoleFallbackUICulture](./getconsolefallbackuiculture/)() const | Konsol uygulamaları için uygun alternatif kültürü alır. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&) | Kültürü adından alır. CreateSpecificCulture ile aynı. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&, const String\&) | Kültürü adından alır. |
| static [GetCultureInfo](./getcultureinfo/)(int32_t) | Kültürü kimliğinden alır. |
| static [GetCultureInfoByIetfLanguageTag](./getcultureinfobyietflanguagetag/)(const String\&) | Kullanımdan kaldırıldı. Belirtilen RFC 4646 dil etiketiyle yalnızca okunabilir bir [CultureInfo](./) nesnesi alır. |
| static [GetCultures](./getcultures/)(CultureTypes) | Belirtilen türlere giren kültürleri alır. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Belirli tür için biçim nesnesini alır. |
| [GetHashCode](./gethashcode/)() const override | Nesnenin karma kodunu döndürür. |
| [IsInherited](./isinherited/)() const | Miras alındı mı bayrağını alır. DAHİLİ KULLANIM İÇİN. |
| [operator=](./operator=/)(const CultureInfo\&) |  |
| [operator==](./operator==/)(const CultureInfo\&) const | Kültür parametrelerini karşılaştırır. |
| static [ReadOnly](./readonly/)(const CultureInfoPtr\&) | Kültürün yalnızca okunabilir bir sürümünü alır. |
| static [set_CurrentCulture](./set_currentculture/)(const CultureInfoPtr\&) | Geçerli iş parçacığı için kültürü ayarlar. |
| static [set_CurrentUICulture](./set_currentuiculture/)(const CultureInfoPtr\&) | Geçerli iş parçacığının UI kültürünü ayarlar. |
| virtual [set_DateTimeFormat](./set_datetimeformat/)(DateTimeFormatInfoPtr) | Tarih biçimi bilgilerini ayarlar. |
| static [set_DefaultThreadCurrentCulture](./set_defaultthreadcurrentculture/)(const CultureInfoPtr\&) | Geçerli uygulama alanında varsayılan kültürü ayarlar. |
| static [set_DefaultThreadCurrentUICulture](./set_defaultthreadcurrentuiculture/)(const CultureInfoPtr\&) | Geçerli uygulama alanında varsayılan UI kültürünü ayarlar. |
| virtual [set_NumberFormat](./set_numberformat/)(NumberFormatInfoPtr) | Sayı biçimi bilgilerini alır. |
| [ToString](./tostring/)() const override | Kültürü dizeye dönüştürür. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
