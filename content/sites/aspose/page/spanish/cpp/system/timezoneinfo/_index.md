---
title: "Clase System::TimeZoneInfo"
linktitle: "TimeZoneInfo"
second_title: "Aspose.Page para C++"
description: "Clase System::TimeZoneInfo. Representa información que describe una zona horaria particular. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarla a funciones como argumento en C++."
type: docs
weight: 6300
url: /es/cpp/system/timezoneinfo/
---
## TimeZoneInfo class


Representa información que describe una zona horaria particular. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../smartptr/) y use ese puntero para pasarla a funciones como argumento.

```cpp
class TimeZoneInfo : public System::IEquatable<TimeZoneInfoPtr>
```

## Nested classes

* Class [AdjustmentRule](./adjustmentrule/)
* Class [TransitionTime](./transitiontime/)
## Métodos

| Método | Descripción |
| --- | --- |
| static [ClearCachedData](./clearcacheddata/)() | Borrar los datos de zona horaria en caché. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) el tiempo de una zona horaria a otra. |
| static [ConvertTime](./converttime/)(const DateTimeOffset\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) el tiempo a la hora en una zona horaria especificada. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&) | [Convert](../convert/) el tiempo a la hora en una zona horaria especificada. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&) | [Convert](../convert/) el tiempo a la hora en una zona horaria especificada. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(const DateTimeOffset\&, const String\&) | [Convert](../convert/) el tiempo a la hora en una zona horaria especificada. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&, const String\&) | [Convert](../convert/) el tiempo a la hora en una zona horaria especificada. |
| static [ConvertTimeFromUtc](./converttimefromutc/)(DateTime, const TimeZoneInfoPtr\&) | Convierte la hora UTC a la hora en una zona horaria especificada. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime, const TimeZoneInfoPtr\&) | Convierte la hora a hora UTC. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime) | Convierte la hora a hora UTC. |
| static [ConvertTimeToUtcNoThrow](./converttimetoutcnothrow/)(DateTime) | Convierte la hora a hora UTC. SOLO USO INTERNO. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) | Crea una zona horaria personalizada. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) | Crea una zona horaria personalizada. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&) | Crea una zona horaria personalizada. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(TimeZoneInfoPtr) override | Determina si el objeto actual y el especificado son iguales. |
| static [FindSystemTimeZoneById](./findsystemtimezonebyid/)(const String\&) | Obtiene la zona horaria con el identificador especificado. |
| [get_BaseUtcOffset](./get_baseutcoffset/)() const | Devuelve una instancia de [TimeSpan](../timespan/) que representa un intervalo de tiempo entre la hora estándar de la zona horaria actual y la hora UTC. |
| [get_DaylightName](./get_daylightname/)() const | Obtiene el nombre del horario de verano de la zona horaria actual. |
| [get_DisplayName](./get_displayname/)() const | Obtiene el nombre de la zona horaria actual. |
| [get_Id](./get_id/)() const | Devuelve el identificador de la zona horaria representada por el objeto actual. |
| static [get_Local](./get_local/)() | Devuelve una instancia de [TimeZoneInfo](./) que representa una zona horaria local. |
| [get_StandardName](./get_standardname/)() const | Obtiene el nombre de la hora estándar de la zona horaria actual. |
| [get_SupportsDaylightSavingTime](./get_supportsdaylightsavingtime/)() const | Obtiene una bandera que indica si la zona horaria tiene reglas de horario de verano. |
| static [get_Utc](./get_utc/)() | Devuelve una instancia de [TimeZoneInfo](./) que representa una zona horaria UTC. |
| [GetAdjustmentRules](./getadjustmentrules/)() const | Devuelve una matriz compuesta por objetos [AdjustmentRule](./adjustmentrule/) que representan reglas de ajuste que se aplican al objeto [TimeZoneInfo](./) actual. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(DateTime) const | Obtiene fechas y horas UTC a las que se puede asignar una fecha y hora especificadas. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(const DateTimeOffset\&) const | Obtiene fechas y horas UTC a las que se puede asignar una fecha y hora especificadas. |
| [GetHashCode](./gethashcode/)() const override | Análogo del método C# [Object.GetHashCode()](../object/gethashcode/). Permite el hash de objetos personalizados. |
| static [GetSystemTimeZones](./getsystemtimezones/)() | Obtiene una colección ordenada de todas las zonas horarias disponibles en el sistema local. |
| [GetUtcOffset](./getutcoffset/)(DateTime) const | Calcula la diferencia entre la hora en esta zona horaria y la zona horaria UTC para una fecha y hora especificadas. |
| [GetUtcOffset](./getutcoffset/)(const DateTimeOffset\&) const | Calcula la diferencia entre la hora en esta zona horaria y la zona horaria UTC para una fecha y hora especificadas. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&) | Función auxiliar interna que devuelve el desplazamiento UTC para una fecha‑hora UTC en una zona horaria especificada. SOLO USO INTERNO. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&, bool\&, bool\&) | Función auxiliar interna que devuelve el desplazamiento UTC para una fecha‑hora UTC en una zona horaria especificada. SOLO USO INTERNO. |
| [GetUtcOffsetNoThrow](./getutcoffsetnothrow/)(DateTime) const | Calcula la diferencia entre la hora en esta zona horaria y la zona horaria UTC para una fecha y hora especificadas. SOLO USO INTERNO. |
| [HasSameRules](./hassamerules/)(const TimeZoneInfoPtr\&) const | Comprueba si la zona horaria actual y otra zona horaria tienen las mismas reglas de ajuste. |
| [IsAmbiguousTime](./isambiguoustime/)(DateTime) const | Comprueba si la fecha y hora especificadas son ambiguas y pueden asignarse a múltiples horas UTC. |
| [IsAmbiguousTime](./isambiguoustime/)(const DateTimeOffset\&) const | Comprueba si la fecha y hora especificadas son ambiguas y pueden asignarse a múltiples horas UTC. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) const | Comprueba si la fecha y hora especificadas están dentro del rango del horario de verano. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(const DateTimeOffset\&) const | Comprueba si la fecha y hora especificadas están dentro del rango del horario de verano. |
| [IsDaylightSavingTimeNoThrow](./isdaylightsavingtimenothrow/)(DateTime) const | Comprueba si la fecha y hora especificadas están dentro del rango del horario de verano. |
| [IsInvalidTime](./isinvalidtime/)(DateTime) const | Comprueba si la fecha y hora especificadas son inválidas. |
| [ToString](./tostring/)() const override | Análogo del método C# [Object.ToString()](../object/tostring/). Permite convertir objetos personalizados a cadena. |
| static [TransitionTimeToDateTime](./transitiontimetodatetime/)(int32_t, const TransitionTime\&) | Función auxiliar que convierte un año y un [TransitionTime](./transitiontime/) en un [DateTime](../datetime/). |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [AdjustmentRulePtr](./adjustmentruleptr/) | Un alias para un puntero compartido a una instancia de la clase [AdjustmentRule](./adjustmentrule/). |
## Ver también

* Class [IEquatable](../iequatable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
