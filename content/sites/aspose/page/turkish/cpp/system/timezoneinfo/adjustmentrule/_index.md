---
title: "System::TimeZoneInfo::AdjustmentRule sınıfı"
linktitle: "AdjustmentRule"
second_title: "Aspose.Page için C++"
description: "System::TimeZoneInfo::AdjustmentRule sınıfı. Bir saat dilimi ayarlaması hakkında bilgi sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3300
url: /tr/cpp/system/timezoneinfo/adjustmentrule/
---
## AdjustmentRule class


Bir saat dilimi ayarlaması hakkında bilgi sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../smartptr/) işaretçisiyle sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

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
* Library [Aspose.Page for C++](../../../)
