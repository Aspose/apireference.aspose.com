---
title: "Класс System::TimeZoneInfo"
linktitle: "TimeZoneInfo"
second_title: "Aspose.Font для C++"
description: "Класс System::TimeZoneInfo. Представляет информацию, описывающую определённый часовой пояс. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 6300
url: /ru/cpp/system/timezoneinfo/
---
## TimeZoneInfo class


Представляет информацию, описывающую определённый часовой пояс. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class TimeZoneInfo : public System::IEquatable<TimeZoneInfoPtr>
```

## Nested classes

* Class [AdjustmentRule](./adjustmentrule/)
* Class [TransitionTime](./transitiontime/)
## Методы

| Метод | Описание |
| --- | --- |
| static [ClearCachedData](./clearcacheddata/)() | Очистить кэшированные данные о часовых поясах. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) время из одного часового пояса в другой. |
| static [ConvertTime](./converttime/)(const DateTimeOffset\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) время в указанный часовой пояс. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&) | [Convert](../convert/) время в указанный часовой пояс. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&) | [Convert](../convert/) время в указанный часовой пояс. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(const DateTimeOffset\&, const String\&) | [Convert](../convert/) время в указанный часовой пояс. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&, const String\&) | [Convert](../convert/) время в указанный часовой пояс. |
| static [ConvertTimeFromUtc](./converttimefromutc/)(DateTime, const TimeZoneInfoPtr\&) | Преобразует UTC‑время в время указанного часового пояса. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime, const TimeZoneInfoPtr\&) | Преобразует время в UTC‑время. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime) | Преобразует время в UTC‑время. |
| static [ConvertTimeToUtcNoThrow](./converttimetoutcnothrow/)(DateTime) | Преобразует время в UTC‑время. ДЛЯ ВНУТРЕННЕГО ИСПОЛЬЗОВАНИЯ. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) | Создаёт пользовательский часовой пояс. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) | Создаёт пользовательский часовой пояс. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&) | Создаёт пользовательский часовой пояс. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(TimeZoneInfoPtr) override | Определяет, равны ли текущий и указанный объекты. |
| static [FindSystemTimeZoneById](./findsystemtimezonebyid/)(const String\&) | Получает часовой пояс с указанным идентификатором. |
| [get_BaseUtcOffset](./get_baseutcoffset/)() const | Возвращает экземпляр [TimeSpan](../timespan/), представляющий интервал времени между стандартным временем текущего часового пояса и UTC‑временем. |
| [get_DaylightName](./get_daylightname/)() const | Получает название летнего времени текущего часового пояса. |
| [get_DisplayName](./get_displayname/)() const | Получает название текущего часового пояса. |
| [get_Id](./get_id/)() const | Возвращает идентификатор часового пояса, представленного текущим объектом. |
| static [get_Local](./get_local/)() | Возвращает экземпляр [TimeZoneInfo](./), представляющий локальный часовой пояс. |
| [get_StandardName](./get_standardname/)() const | Получает название стандартного времени текущего часового пояса. |
| [get_SupportsDaylightSavingTime](./get_supportsdaylightsavingtime/)() const | Получает флаг, указывающий, имеет ли часовой пояс правила летнего времени. |
| static [get_Utc](./get_utc/)() | Возвращает экземпляр [TimeZoneInfo](./), представляющий часовой пояс UTC. |
| [GetAdjustmentRules](./getadjustmentrules/)() const | Возвращает массив, состоящий из объектов [AdjustmentRule](./adjustmentrule/), представляющих правила корректировки, применяемые к текущему объекту [TimeZoneInfo](./). |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(DateTime) const | Получает даты и времена UTC, к которым может быть сопоставлена указанная дата и время. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(const DateTimeOffset\&) const | Получает даты и времена UTC, к которым может быть сопоставлена указанная дата и время. |
| [GetHashCode](./gethashcode/)() const override | Аналог метода C# [Object.GetHashCode()](../object/gethashcode/). Позволяет хешировать пользовательские объекты. |
| static [GetSystemTimeZones](./getsystemtimezones/)() | Получает отсортированную коллекцию всех часовых поясов, доступных в локальной системе. |
| [GetUtcOffset](./getutcoffset/)(DateTime) const | Вычисляет разницу между временем в этом часовом поясе и временем UTC для указанной даты и времени. |
| [GetUtcOffset](./getutcoffset/)(const DateTimeOffset\&) const | Вычисляет разницу между временем в этом часовом поясе и временем UTC для указанной даты и времени. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&) | Внутренняя вспомогательная функция, возвращающая смещение UTC для даты‑времени UTC в указанном часовом поясе. ДЛЯ ВНУТРЕННЕГО ИСПОЛЬЗОВАНИЯ. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&, bool\&, bool\&) | Внутренняя вспомогательная функция, возвращающая смещение UTC для даты‑времени UTC в указанном часовом поясе. ДЛЯ ВНУТРЕННЕГО ИСПОЛЬЗОВАНИЯ. |
| [GetUtcOffsetNoThrow](./getutcoffsetnothrow/)(DateTime) const | Вычисляет разницу между временем в этом часовом поясе и временем UTC для указанной даты и времени. ДЛЯ ВНУТРЕННЕГО ИСПОЛЬЗОВАНИЯ. |
| [HasSameRules](./hassamerules/)(const TimeZoneInfoPtr\&) const | Проверяет, имеют ли текущий и другой часовые пояса одинаковые правила корректировки. |
| [IsAmbiguousTime](./isambiguoustime/)(DateTime) const | Проверяет, является ли указанная дата и время неоднозначными и могут ли они соответствовать множеству UTC‑времен. |
| [IsAmbiguousTime](./isambiguoustime/)(const DateTimeOffset\&) const | Проверяет, является ли указанная дата и время неоднозначными и могут ли они соответствовать множеству UTC‑времен. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) const | Проверяет, попадает ли указанная дата и время в диапазон действия летнего времени. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(const DateTimeOffset\&) const | Проверяет, попадает ли указанная дата и время в диапазон действия летнего времени. |
| [IsDaylightSavingTimeNoThrow](./isdaylightsavingtimenothrow/)(DateTime) const | Проверяет, попадает ли указанная дата и время в диапазон действия летнего времени. |
| [IsInvalidTime](./isinvalidtime/)(DateTime) const | Проверяет, является ли указанная дата и время недействительными. |
| [ToString](./tostring/)() const override | Аналог метода C# [Object.ToString()](../object/tostring/). Позволяет преобразовывать пользовательские объекты в строку. |
| static [TransitionTimeToDateTime](./transitiontimetodatetime/)(int32_t, const TransitionTime\&) | Вспомогательная функция, преобразующая год и [TransitionTime](./transitiontime/) в [DateTime](../datetime/). |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [AdjustmentRulePtr](./adjustmentruleptr/) | Псевдоним для shared‑указателя на экземпляр класса [AdjustmentRule](./adjustmentrule/). |
## См. также

* Class [IEquatable](../iequatable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
