---
title: "System::TimeZoneInfo::CreateCustomTimeZone metodu"
linktitle: "CreateCustomTimeZone"
second_title: "Aspose.Font için C++"
description: "System::TimeZoneInfo::CreateCustomTimeZone metodu. C++'da özel bir saat dilimi oluşturur."
type: docs
weight: 700
url: /tr/cpp/system/timezoneinfo/createcustomtimezone/
---
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&) method


Özel bir zaman dilimi oluşturur.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| kimlik | const String\& | Saat dilimi tanımlayıcısı. |
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
* Library [Aspose.Font for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) method


Özel bir zaman dilimi oluşturur.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| kimlik | const String\& | Saat dilimi tanımlayıcısı. |
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
* Library [Aspose.Font for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) method


Özel bir zaman dilimi oluşturur.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules, bool disable_daylight_saving_time)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| kimlik | const String\& | Saat dilimi tanımlayıcısı. |
| base_utc_offset | TimeSpan | Geçerli saat diliminin standart zamanı ile UTC zamanı arasındaki zaman aralığı. |
| display_name | const String\& | Görüntüleme adı. |
| standard_display_name | const String\& | Standart zaman adı. |
| daylight_display_name | const String\& | Yaz saati adı. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) ayarlama kuralları. |
| disable_daylight_saving_time | bool | Ayarlama kurallarında mevcut olan herhangi bir yaz saati uygulaması bilgisini atmak için True. |

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
* Library [Aspose.Font for C++](../../../)
