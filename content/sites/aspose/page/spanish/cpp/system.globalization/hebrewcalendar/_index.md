---
title: "System::Globalization::HebrewCalendar class"
linktitle: "HebrewCalendar"
second_title: "Aspose.Page para C++"
description: "System::Globalization::HebrewCalendar class. Calendario hebreo. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 1100
url: /es/cpp/system.globalization/hebrewcalendar/
---
## HebrewCalendar class


Calendario hebreo. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class HebrewCalendar : public System::Globalization::Calendar
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Clone](./clone/)() override | Información RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Obtiene el tipo de algoritmo. |
| [get_Eras](./get_eras/)() const override | Obtiene la lista de eras existentes en el calendario. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Punto máximo en el tiempo que admite el calendario. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Punto mínimo en el tiempo que admite el calendario. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Obtiene el día de la semana para el punto de tiempo especificado. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Obtiene el número de días en un mes específico. |
| [GetEra](./getera/)(DateTime) const override | Obtiene la era para el punto de tiempo especificado. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Obtiene el mes bisiesto para el año especificado. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Información RTTI. |
| [GetMonth](./getmonth/)(DateTime) const override | Obtiene el mes para el punto de tiempo especificado. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Obtiene el número de meses en el año especificado. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Obtiene el número de meses en el año especificado. |
| [HebrewCalendar](./hebrewcalendar/)() | Constructor. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Comprueba si el día es bisiesto. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Comprueba si el día es bisiesto. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Comprueba si el mes es bisiesto. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Comprueba si el mes es bisiesto. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Comprueba si el año es bisiesto. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Comprueba si el año es bisiesto. |
| [set_TwoDigitYearMax](./set_twodigityearmax/)(int) override | Establece el último año que puede representarse con dos dígitos. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | Construye el objeto [DateTime](../../system/datetime/) a partir de los componentes. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Construye el objeto [DateTime](../../system/datetime/) a partir de los componentes. |
## Campos

| Campo | Descripción |
| --- | --- |
| static constexpr [HebrewEra](./hebrewera/) | Era hebrea actual. |
## Ver también

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
