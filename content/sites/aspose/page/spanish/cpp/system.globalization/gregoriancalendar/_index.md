---
title: "System::Globalization::GregorianCalendar clase"
linktitle: "GregorianCalendar"
second_title: "Aspose.Page para C++"
description: "System::Globalization::GregorianCalendar class. Calendario gregoriano. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 1000
url: /es/cpp/system.globalization/gregoriancalendar/
---
## GregorianCalendar class


Calendario gregoriano. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class GregorianCalendar : public System::Globalization::Calendar
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Clone](./clone/)() override | Información RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Obtiene el tipo de algoritmo. |
| virtual [get_CalendarType](./get_calendartype/)() const | Obtiene el tipo de calendario gregoriano. |
| [get_Eras](./get_eras/)() const override | Obtiene la lista de eras existentes en el calendario. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Punto máximo en el tiempo que admite el calendario. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Punto mínimo en el tiempo que admite el calendario. |
| [GetDayOfMonth](./getdayofmonth/)(DateTime) const override | Obtiene el día del mes para el punto de tiempo especificado. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Obtiene el día de la semana para el punto de tiempo especificado. |
| [GetDayOfYear](./getdayofyear/)(DateTime) const override | Obtiene el día del año para el punto de tiempo especificado. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Obtiene el número de días en un mes específico. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Obtiene el número de días en un mes específico. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | Obtiene el número de días en un año específico. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Obtiene el número de días en un año específico. |
| static [GetDefaultInstance](./getdefaultinstance/)() | Obtiene la instancia predeterminada del calendario gregoriano. |
| [GetEra](./getera/)(DateTime) const override | Obtiene la era para el punto de tiempo especificado. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Obtiene el mes bisiesto para el año especificado. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Obtiene el mes bisiesto para el año especificado. |
| [GetMonth](./getmonth/)(DateTime) const override | Obtiene el mes para el punto de tiempo especificado. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Obtiene el número de meses en el año especificado. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Información RTTI. |
| [GetYear](./getyear/)(DateTime) const override | Obtiene el año para el punto de tiempo especificado. |
| [GregorianCalendar](./gregoriancalendar/)(GregorianCalendarTypes) | Construye un calendario gregoriano específico. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Comprueba si el día es bisiesto. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Comprueba si el día es bisiesto. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Comprueba si el mes es bisiesto. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Comprueba si el mes es bisiesto. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Comprueba si el año es bisiesto. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Comprueba si el año es bisiesto. |
| virtual [set_CalendarType](./set_calendartype/)(GregorianCalendarTypes) | Establece el tipo de calendario gregoriano. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | Construye el objeto [DateTime](../../system/datetime/) a partir de los componentes. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Construye el objeto [DateTime](../../system/datetime/) a partir de los componentes. |
## Campos

| Campo | Descripción |
| --- | --- |
| static constexpr [ADEra](./adera/) | Era actual. |
## Ver también

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
