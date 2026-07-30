---
title: "Aspose::Font::MeteredCountService Klasse"
linktitle: "MeteredCountService"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::MeteredCountService Klasse. Diese interne Klasse wird verwendet, um die Verbrauchsdaten des Kunden zu verwalten, die Einheit ist MB in C++."
type: docs
weight: 2700
url: /de/cpp/aspose.font/meteredcountservice/
---
## MeteredCountService class


Diese interne Klasse wird verwendet, um die Verbrauchsdaten des Kunden zu verwalten; die Einheit ist MB.

```cpp
class MeteredCountService : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [_IncreaseCount](./_increasecount/)(System::Decimal, bool) |  |
| [_IncreaseCredit](./_increasecredit/)(int64_t, bool) |  |
| [Flush](./flush/)() |  |
| static [get_Instance](./get_instance/)() |  |
| [GetAndResetCount](./getandresetcount/)() | Ermittelt und setzt die Dateigröße des Kundenverbrauchs zurück. |
| [GetAndResetCredit](./getandresetcredit/)() | Abrufen und Zurücksetzen des Kundenverbrauchsguthabens. |
| [IncreaseCount](./increasecount/)(double) | Erhöhe die Dateigröße des Kundenverbrauchs und versuche, Daten hochzuladen. |
| [IncreaseCount](./increasecount/)(System::Decimal, bool) | Erhöhe die Dateigröße des Kundenverbrauchs. |
| [IncreaseCredit](./increasecredit/)(int64_t) | Erhöhe das Kundenverbrauchsguthaben und versuche, hochzuladen. |
| [IncreaseCredit](./increasecredit/)(int64_t, bool) | Erhöhe das Kundenverbrauchsguthaben. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [MAX_SERVER_INTERNAL_ERROR_TIME_INTERVAL](./max_server_internal_error_time_interval/) |  |
| static [MAX_UPLOAD_FAIL_RESET_NUMBER](./max_upload_fail_reset_number/) |  |
| static [MAX_UPLOAD_FAIL_RESET_TIME_INTERVAL](./max_upload_fail_reset_time_interval/) |  |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
