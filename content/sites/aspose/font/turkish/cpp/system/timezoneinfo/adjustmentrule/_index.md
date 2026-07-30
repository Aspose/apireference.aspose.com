---
title: "System::TimeZoneInfo::AdjustmentRule sınıfı"
linktitle: "AdjustmentRule"
second_title: "Aspose.Font için C++"
description: "System::TimeZoneInfo::AdjustmentRule sınıfı. Saat dilimi ayarlaması hakkında bilgi sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmaktan kaçının; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Her zaman bu sınıfı System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3300
url: /tr/cpp/system/timezoneinfo/adjustmentrule/
---
## AdjustmentRule class


Saat dilimi ayarlaması hakkında bilgi sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmaktan kaçının; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Her zaman bu sınıfı [System::SmartPtr](../../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class AdjustmentRule : public System::IEquatable<AdjustmentRulePtr>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) | Belirtilen parametrelerle tanımlanan bir zaman ayarlama kuralını temsil eden [AdjustmentRule](./) sınıfının bir örneğini oluşturur. |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) | Belirtilen parametrelerle tanımlanan bir zaman ayarlama kuralını temsil eden [AdjustmentRule](./) sınıfının bir örneğini oluşturur. |
| [Equals](./equals/)(AdjustmentRulePtr) override |  |
| [get_BaseUtcOffsetDelta](./get_baseutcoffsetdelta/)() const | Varsayılan UTC ofsetinden bir delta döndürür. |
| [get_DateEnd](./get_dateend/)() const | Ayarlama kuralının etkisini kaybettiği tarih ve zamanı temsil eden bir [DateTime](../../datetime/) nesnesi döndürür. |
| [get_DateStart](./get_datestart/)() const | Ayarlama kuralının yürürlüğe girdiği tarih ve zamanı temsil eden bir [DateTime](../../datetime/) nesnesi döndürür. |
| [get_DaylightDelta](./get_daylightdelta/)() const | Saat diliminin yaz saati uygulamasını oluşturmak için gereken süreyi temsil eden bir [TimeSpan](../../timespan/) nesnesi döndürür. |
| [get_DaylightTransitionEnd](./get_daylighttransitionend/)() const | Standart zamandan yaz saatine geçiş hakkında bilgiyi döndürür. |
| [get_DaylightTransitionStart](./get_daylighttransitionstart/)() const | Yaz saatinden standart zamana geçiş hakkında bilgiyi döndürür. |
| [get_HasDaylightSaving](./get_hasdaylightsaving/)() const | İÇ KULLANIM İÇİN. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../object/gethashcode/) yönteminin bir benzeri. Özel nesnelerin hashlenmesini sağlar. |
## Ayrıca Bakınız

* Class [IEquatable](../../iequatable/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
