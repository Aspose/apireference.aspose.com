---
title: Aspose::Pub::MeteredCountService class
linktitle: MeteredCountService
second_title: Aspose.PUB for C++
description: 'Aspose::Pub::MeteredCountService class. This internal class is used to handle customer''s consumption data, the unit is MB in C++.'
type: docs
weight: 2000
url: /cpp/aspose.pub/meteredcountservice/
---
## MeteredCountService class


This internal class is used to handle customer's consumption data, the unit is MB.

```cpp
class MeteredCountService : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [_IncreaseCount](./_increasecount/)(System::Decimal, bool) |  |
| [_IncreaseCredit](./_increasecredit/)(int64_t, bool) |  |
| [Flush](./flush/)() |  |
| static [get_Instance](./get_instance/)() |  |
| [GetAndResetCount](./getandresetcount/)() | Gets and Resets customer consumption file size. |
| [GetAndResetCredit](./getandresetcredit/)() | Get and Reset customer consumption credit. |
| [IncreaseCount](./increasecount/)(double) | Increase customer consumption file size, and try to upload data. |
| [IncreaseCount](./increasecount/)(System::Decimal, bool) | Increase customer consumption file size. |
| [IncreaseCredit](./increasecredit/)(int64_t) | Increase customer consumption credit, and try to upload. |
| [IncreaseCredit](./increasecredit/)(int64_t, bool) | Increase customer consumption credit. |
## Fields

| Field | Description |
| --- | --- |
| static [MAX_SERVER_INTERNAL_ERROR_TIME_INTERVAL](./max_server_internal_error_time_interval/) |  |
| static [MAX_UPLOAD_FAIL_RESET_NUMBER](./max_upload_fail_reset_number/) |  |
| static [MAX_UPLOAD_FAIL_RESET_TIME_INTERVAL](./max_upload_fail_reset_time_interval/) |  |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Pub](../)
* Library [Aspose.PUB for C++](../../)
