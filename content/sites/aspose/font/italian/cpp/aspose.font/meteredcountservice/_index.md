---
title: "Aspose::Font::MeteredCountService class"
linktitle: "MeteredCountService"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::MeteredCountService class. Questa classe interna è utilizzata per gestire i dati di consumo del cliente, l'unità è MB in C++."
type: docs
weight: 2700
url: /it/cpp/aspose.font/meteredcountservice/
---
## MeteredCountService class


Questa classe interna è usata per gestire i dati di consumo del cliente, l'unità è MB.

```cpp
class MeteredCountService : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [_IncreaseCount](./_increasecount/)(System::Decimal, bool) |  |
| [_IncreaseCredit](./_increasecredit/)(int64_t, bool) |  |
| [Flush](./flush/)() |  |
| static [get_Instance](./get_instance/)() |  |
| [GetAndResetCount](./getandresetcount/)() | Ottiene e reimposta la dimensione del file di consumo del cliente. |
| [GetAndResetCredit](./getandresetcredit/)() | Ottieni e reimposta il credito di consumo del cliente. |
| [IncreaseCount](./increasecount/)(double) | Aumenta la dimensione del file di consumo del cliente e prova a caricare i dati. |
| [IncreaseCount](./increasecount/)(System::Decimal, bool) | Aumenta la dimensione del file di consumo del cliente. |
| [IncreaseCredit](./increasecredit/)(int64_t) | Aumenta il credito di consumo del cliente e prova a caricare. |
| [IncreaseCredit](./increasecredit/)(int64_t, bool) | Aumenta il credito di consumo del cliente. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [MAX_SERVER_INTERNAL_ERROR_TIME_INTERVAL](./max_server_internal_error_time_interval/) |  |
| static [MAX_UPLOAD_FAIL_RESET_NUMBER](./max_upload_fail_reset_number/) |  |
| static [MAX_UPLOAD_FAIL_RESET_TIME_INTERVAL](./max_upload_fail_reset_time_interval/) |  |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
