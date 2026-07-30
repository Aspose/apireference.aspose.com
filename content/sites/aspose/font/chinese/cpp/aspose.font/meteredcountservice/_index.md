---
title: "Aspose::Font::MeteredCountService 类"
linktitle: "MeteredCountService"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::MeteredCountService 类。此内部类用于处理客户的消耗数据，单位为 MB，适用于 C++。"
type: docs
weight: 2700
url: /zh/cpp/aspose.font/meteredcountservice/
---
## MeteredCountService class


此内部类用于处理客户的消耗数据，单位为 MB。

```cpp
class MeteredCountService : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [_IncreaseCount](./_increasecount/)(System::Decimal, bool) |  |
| [_IncreaseCredit](./_increasecredit/)(int64_t, bool) |  |
| [Flush](./flush/)() |  |
| static [get_Instance](./get_instance/)() |  |
| [GetAndResetCount](./getandresetcount/)() | 获取并重置客户消耗的文件大小。 |
| [GetAndResetCredit](./getandresetcredit/)() | 获取并重置客户消耗的额度。 |
| [IncreaseCount](./increasecount/)(double) | 增加客户消耗的文件大小，并尝试上传数据。 |
| [IncreaseCount](./increasecount/)(System::Decimal, bool) | 增加客户消耗的文件大小。 |
| [IncreaseCredit](./increasecredit/)(int64_t) | 增加客户消耗的额度，并尝试上传。 |
| [IncreaseCredit](./increasecredit/)(int64_t, bool) | 增加客户消耗的额度。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [MAX_SERVER_INTERNAL_ERROR_TIME_INTERVAL](./max_server_internal_error_time_interval/) |  |
| static [MAX_UPLOAD_FAIL_RESET_NUMBER](./max_upload_fail_reset_number/) |  |
| static [MAX_UPLOAD_FAIL_RESET_TIME_INTERVAL](./max_upload_fail_reset_time_interval/) |  |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
