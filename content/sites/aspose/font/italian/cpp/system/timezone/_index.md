---
title: "System::TimeZone class"
linktitle: "TimeZone"
second_title: "Aspose.Font per C++"
description: "System::TimeZone class. Rappresenta un fuso orario. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 6200
url: /it/cpp/system/timezone/
---
## TimeZone class


Rappresenta un fuso orario. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e utilizza questo puntatore per passarla alle funzioni come argomento.

```cpp
class TimeZone : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [get_CurrentTimeZone](./get_currenttimezone/)() | Restituisce una nuova istanza della classe [TimeZone](./) che rappresenta il fuso orario corrente. |
| virtual [get_DaylightName](./get_daylightname/)() const | Restituisce un nome per l'ora legale del fuso orario rappresentato dall'oggetto corrente. |
| virtual [get_StandardName](./get_standardname/)() const | Restituisce un nome per l'ora standard del fuso orario rappresentato dall'oggetto corrente. |
| virtual [GetDaylightChanges](./getdaylightchanges/)(int32_t) | Restituisce il periodo dell'ora legale per un anno particolare. |
| virtual [GetUtcOffset](./getutcoffset/)(DateTime) | Restituisce l'offset UTC per l'ora locale specificata. |
| virtual [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) | Determina se il valore di data e ora rappresentato dall'oggetto [DateTime](../datetime/) specificato rientra nell'intervallo dell'ora legale per il fuso orario rappresentato dall'oggetto [TimeZone](./) corrente. |
## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
