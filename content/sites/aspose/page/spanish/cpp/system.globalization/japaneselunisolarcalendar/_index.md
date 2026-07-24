---
title: "System::Globalization::JapaneseLunisolarCalendar class"
linktitle: "JapaneseLunisolarCalendar"
second_title: "Aspose.Page para C++"
description: "System::Globalization::JapaneseLunisolarCalendar class. Calendario lunisolar japonés. No implementado. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 1500
url: /es/cpp/system.globalization/japaneselunisolarcalendar/
---
## JapaneseLunisolarCalendar class


Calendario lunisolar japonés. No implementado. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/) . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class JapaneseLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Clone](./clone/)() override | Información RTTI. |
| [get_Eras](./get_eras/)() const override | Obtiene la lista de eras existentes en el calendario. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Punto máximo en el tiempo que admite el calendario. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Punto mínimo en el tiempo que admite el calendario. |
| [GetEra](./getera/)(DateTime) const override | Obtiene la era para el punto de tiempo especificado. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Obtiene el mes bisiesto para el año especificado. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Información RTTI. |
| [GetYear](./getyear/)(DateTime) const override | Obtiene el año para el punto de tiempo especificado. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Comprueba si el día es bisiesto. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Comprueba si el día es bisiesto. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Comprueba si el año es bisiesto. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Comprueba si el año es bisiesto. |
| [JapaneseLunisolarCalendar](./japaneselunisolarcalendar/)() | Constructor. |
## Campos

| Campo | Descripción |
| --- | --- |
| static constexpr [JapaneseEra](./japaneseera/) | Era japonesa actual. |
## Ver también

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
