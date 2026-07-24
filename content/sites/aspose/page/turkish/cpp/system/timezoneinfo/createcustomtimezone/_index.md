---
title: "System::TimeZoneInfo::CreateCustomTimeZone metodu"
linktitle: "CreateCustomTimeZone"
second_title: "Aspose.Page için C++"
description: "System::TimeZoneInfo::CreateCustomTimeZone metodu. C++'ta özel bir saat dilimi oluşturur."
type: docs
weight: 700
url: /tr/cpp/system/timezoneinfo/createcustomtimezone/
---
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&) method


Özel bir zaman dilimi oluşturur.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| id | const String\& | Saat dilimi tanımlayıcısı. |
| base_utc_offset | TimeSpan | Geçerli saat diliminin standart zamanı ile UTC zamanı arasındaki zaman aralığı. |
| display_name | const String\& | Görüntüleme adı. |
| standard_display_name | const String\& | Standart zaman adı. |

### ReturnValue

Yeni saat dilimi.

## Ayrıca Bakınız

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) method


Özel bir zaman dilimi oluşturur.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| id | const String\& | Saat dilimi tanımlayıcısı. |
| base_utc_offset | TimeSpan | Geçerli saat diliminin standart zamanı ile UTC zamanı arasındaki zaman aralığı. |
| display_name | const String\& | Görüntüleme adı. |
| standard_display_name | const String\& | Standart zaman adı. |
| daylight_display_name | const String\& | Yaz saati adı. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) ayarlama kuralları. |

### ReturnValue

Yeni saat dilimi.

## Ayrıca Bakınız

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) method


Özel bir zaman dilimi oluşturur.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules, bool disable_daylight_saving_time)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| id | const String\& | Saat dilimi tanımlayıcısı. |
| base_utc_offset | TimeSpan | Geçerli saat diliminin standart zamanı ile UTC zamanı arasındaki zaman aralığı. |
| display_name | const String\& | Görüntüleme adı. |
| standard_display_name | const String\& | Standart zaman adı. |
| daylight_display_name | const String\& | Yaz saati adı. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) ayarlama kuralları. |
| disable_daylight_saving_time | bool | True, adjustment_rules içinde bulunan tüm yaz saati uygulaması bilgilerini göz ardı etmek için. |

### ReturnValue

Yeni saat dilimi.

## Ayrıca Bakınız

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
