---
title: "Aspose::Font::MeteredCountService sınıfı"
linktitle: "MeteredCountService"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::MeteredCountService sınıfı. Bu dahili sınıf, müşterinin tüketim verilerini işlemek için kullanılır, birim MB'dir ve C++'ta uygulanır."
type: docs
weight: 2700
url: /tr/cpp/aspose.font/meteredcountservice/
---
## MeteredCountService class


Bu dahili sınıf, müşterinin tüketim verilerini işlemek için kullanılır, birim MB'dir.

```cpp
class MeteredCountService : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [_IncreaseCount](./_increasecount/)(System::Decimal, bool) |  |
| [_IncreaseCredit](./_increasecredit/)(int64_t, bool) |  |
| [Flush](./flush/)() |  |
| static [get_Instance](./get_instance/)() |  |
| [GetAndResetCount](./getandresetcount/)() | Müşteri tüketim dosya boyutunu alır ve sıfırlar. |
| [GetAndResetCredit](./getandresetcredit/)() | Müşteri tüketim kredisini al ve sıfırla. |
| [IncreaseCount](./increasecount/)(double) | Müşteri tüketim dosya boyutunu artır, ve veriyi yüklemeyi dene. |
| [IncreaseCount](./increasecount/)(System::Decimal, bool) | Müşteri tüketim dosya boyutunu artır. |
| [IncreaseCredit](./increasecredit/)(int64_t) | Müşteri tüketim kredisini artır, ve yüklemeyi dene. |
| [IncreaseCredit](./increasecredit/)(int64_t, bool) | Müşteri tüketim kredisini artır. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [MAX_SERVER_INTERNAL_ERROR_TIME_INTERVAL](./max_server_internal_error_time_interval/) |  |
| static [MAX_UPLOAD_FAIL_RESET_NUMBER](./max_upload_fail_reset_number/) |  |
| static [MAX_UPLOAD_FAIL_RESET_TIME_INTERVAL](./max_upload_fail_reset_time_interval/) |  |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
