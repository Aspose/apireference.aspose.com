---
title: "Aspose::Font::MeteredCountService class"
linktitle: "MeteredCountService"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::MeteredCountService classe. Cette classe interne est utilisée pour gérer les données de consommation du client, l'unité est Mo en C++."
type: docs
weight: 2700
url: /fr/cpp/aspose.font/meteredcountservice/
---
## MeteredCountService class


Cette classe interne est utilisée pour gérer les données de consommation du client, l'unité étant le Mo.

```cpp
class MeteredCountService : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [_IncreaseCount](./_increasecount/)(System::Decimal, bool) |  |
| [_IncreaseCredit](./_increasecredit/)(int64_t, bool) |  |
| [Flush](./flush/)() |  |
| static [get_Instance](./get_instance/)() |  |
| [GetAndResetCount](./getandresetcount/)() | Obtient et réinitialise la taille du fichier de consommation du client. |
| [GetAndResetCredit](./getandresetcredit/)() | Obtient et réinitialise le crédit de consommation du client. |
| [IncreaseCount](./increasecount/)(double) | Augmente la taille du fichier de consommation du client, et tente de télécharger les données. |
| [IncreaseCount](./increasecount/)(System::Decimal, bool) | Augmente la taille du fichier de consommation du client. |
| [IncreaseCredit](./increasecredit/)(int64_t) | Augmente le crédit de consommation du client, et tente de télécharger. |
| [IncreaseCredit](./increasecredit/)(int64_t, bool) | Augmente le crédit de consommation du client. |
## Champs

| Champ | Description |
| --- | --- |
| static [MAX_SERVER_INTERNAL_ERROR_TIME_INTERVAL](./max_server_internal_error_time_interval/) |  |
| static [MAX_UPLOAD_FAIL_RESET_NUMBER](./max_upload_fail_reset_number/) |  |
| static [MAX_UPLOAD_FAIL_RESET_TIME_INTERVAL](./max_upload_fail_reset_time_interval/) |  |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
