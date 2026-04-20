---
title: "Aspose::Font::MeteredCountService class"
linktitle: "MeteredCountService"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::MeteredCountService class. تُستخدم هذه الفئة الداخلية لمعالجة بيانات استهلاك العميل، الوحدة هي ميغابايت في C++."
type: docs
weight: 2700
url: /ar/cpp/aspose.font/meteredcountservice/
---
## MeteredCountService class


هذا الصنف الداخلي يُستخدم لمعالجة بيانات استهلاك العميل، الوحدة هي ميغابايت.

```cpp
class MeteredCountService : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [_IncreaseCount](./_increasecount/)(System::Decimal, bool) |  |
| [_IncreaseCredit](./_increasecredit/)(int64_t, bool) |  |
| [Flush](./flush/)() |  |
| static [get_Instance](./get_instance/)() |  |
| [GetAndResetCount](./getandresetcount/)() | يحصل على حجم ملف استهلاك العميل ويعيد تعيينه. |
| [GetAndResetCredit](./getandresetcredit/)() | احصل على رصيد استهلاك العميل وأعد تعيينه. |
| [IncreaseCount](./increasecount/)(double) | زيادة حجم ملف استهلاك العميل، ومحاولة رفع البيانات. |
| [IncreaseCount](./increasecount/)(System::Decimal, bool) | زيادة حجم ملف استهلاك العميل. |
| [IncreaseCredit](./increasecredit/)(int64_t) | زيادة رصيد استهلاك العميل، ومحاولة رفع. |
| [IncreaseCredit](./increasecredit/)(int64_t, bool) | زيادة رصيد استهلاك العميل. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [MAX_SERVER_INTERNAL_ERROR_TIME_INTERVAL](./max_server_internal_error_time_interval/) |  |
| static [MAX_UPLOAD_FAIL_RESET_NUMBER](./max_upload_fail_reset_number/) |  |
| static [MAX_UPLOAD_FAIL_RESET_TIME_INTERVAL](./max_upload_fail_reset_time_interval/) |  |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
