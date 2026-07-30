---
title: "System::Globalization::JapaneseLunisolarCalendar class"
linktitle: "JapaneseLunisolarCalendar"
second_title: "Aspose.Font per C++"
description: "System::Globalization::JapaneseLunisolarCalendar class. Calendario lunisolare giapponese. Non implementato. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1500
url: /it/cpp/system.globalization/japaneselunisolarcalendar/
---
## JapaneseLunisolarCalendar class


Calendario lunisolare giapponese. Non implementato. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché proverà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class JapaneseLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Informazioni RTTI. |
| [get_Eras](./get_eras/)() const override | Restituisce l'elenco delle ere presenti nel calendario. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Punto temporale massimo supportato dal calendario. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Punto temporale minimo supportato dal calendario. |
| [GetEra](./getera/)(DateTime) const override | Restituisce l'era per il punto temporale specificato. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Restituisce il mese intercalare per l'anno specificato. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Informazioni RTTI. |
| [GetYear](./getyear/)(DateTime) const override | Restituisce l'anno per il punto temporale specificato. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Verifica se il giorno è bisestile. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Verifica se il giorno è bisestile. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Verifica se l'anno è bisestile. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Verifica se l'anno è bisestile. |
| [JapaneseLunisolarCalendar](./japaneselunisolarcalendar/)() | Costruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [JapaneseEra](./japaneseera/) | Era giapponese corrente. |
## Vedi anche

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
