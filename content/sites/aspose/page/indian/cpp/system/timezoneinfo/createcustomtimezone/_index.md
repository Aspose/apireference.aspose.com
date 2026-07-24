---
title: "System::TimeZoneInfo::CreateCustomTimeZone मेथड"
linktitle: "CreateCustomTimeZone"
second_title: "Aspose.Page C++ के लिए"
description: "System::TimeZoneInfo::CreateCustomTimeZone मेथड. C++ में एक कस्टम समय क्षेत्र बनाता है।"
type: docs
weight: 700
url: /hi/cpp/system/timezoneinfo/createcustomtimezone/
---
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&) method


एक कस्टम टाइम ज़ोन बनाता है।

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| id | const String\& | समय क्षेत्र पहचानकर्ता। |
| base_utc_offset | TimeSpan | वर्तमान समय क्षेत्र के मानक समय और UTC समय के बीच का समय अंतराल। |
| display_name | const String\& | प्रदर्शित नाम। |
| standard_display_name | const String\& | मानक समय नाम। |

### ReturnValue

नया समय क्षेत्र।

## संबंधित देखें

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) method


एक कस्टम टाइम ज़ोन बनाता है।

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| id | const String\& | समय क्षेत्र पहचानकर्ता। |
| base_utc_offset | TimeSpan | वर्तमान समय क्षेत्र के मानक समय और UTC समय के बीच का समय अंतराल। |
| display_name | const String\& | प्रदर्शित नाम। |
| standard_display_name | const String\& | मानक समय नाम। |
| daylight_display_name | const String\& | डेलाइट सेविंग टाइम नाम। |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) समायोजन नियमों की। |

### ReturnValue

नया समय क्षेत्र।

## संबंधित देखें

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) method


एक कस्टम टाइम ज़ोन बनाता है।

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules, bool disable_daylight_saving_time)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| id | const String\& | समय क्षेत्र पहचानकर्ता। |
| base_utc_offset | TimeSpan | वर्तमान समय क्षेत्र के मानक समय और UTC समय के बीच का समय अंतराल। |
| display_name | const String\& | प्रदर्शित नाम। |
| standard_display_name | const String\& | मानक समय नाम। |
| daylight_display_name | const String\& | डेलाइट सेविंग टाइम नाम। |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) समायोजन नियमों की। |
| disable_daylight_saving_time | bool | True का उपयोग करके adjustment_rules में मौजूद किसी भी daylight saving time जानकारी को हटाएँ। |

### ReturnValue

नया समय क्षेत्र।

## संबंधित देखें

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
