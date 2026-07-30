---
title: "Aspose::Font::MeteredCountService класс"
linktitle: "MeteredCountService"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::MeteredCountService класс. Этот внутренний класс используется для обработки данных о потреблении клиента, единица измерения — МБ в C++."
type: docs
weight: 2700
url: /ru/cpp/aspose.font/meteredcountservice/
---
## MeteredCountService class


Этот внутренний класс используется для обработки данных о потреблении клиента, единица измерения — МБ.

```cpp
class MeteredCountService : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [_IncreaseCount](./_increasecount/)(System::Decimal, bool) |  |
| [_IncreaseCredit](./_increasecredit/)(int64_t, bool) |  |
| [Flush](./flush/)() |  |
| static [get_Instance](./get_instance/)() |  |
| [GetAndResetCount](./getandresetcount/)() | Получает и сбрасывает размер файла потребления клиента. |
| [GetAndResetCredit](./getandresetcredit/)() | Получить и сбросить кредит потребления клиента. |
| [IncreaseCount](./increasecount/)(double) | Увеличить размер файла потребления клиента и попытаться загрузить данные. |
| [IncreaseCount](./increasecount/)(System::Decimal, bool) | Увеличить размер файла потребления клиента. |
| [IncreaseCredit](./increasecredit/)(int64_t) | Увеличить кредит потребления клиента и попытаться загрузить. |
| [IncreaseCredit](./increasecredit/)(int64_t, bool) | Увеличить кредит потребления клиента. |
## Поля

| Поле | Описание |
| --- | --- |
| static [MAX_SERVER_INTERNAL_ERROR_TIME_INTERVAL](./max_server_internal_error_time_interval/) |  |
| static [MAX_UPLOAD_FAIL_RESET_NUMBER](./max_upload_fail_reset_number/) |  |
| static [MAX_UPLOAD_FAIL_RESET_TIME_INTERVAL](./max_upload_fail_reset_time_interval/) |  |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
