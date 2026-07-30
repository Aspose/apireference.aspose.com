---
title: "Classe System::TimeSpan"
linktitle: "TimeSpan"
second_title: "Aspose.Font pour C++"
description: "Classe System::TimeSpan. Représente un intervalle de temps. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N’utilisez jamais la classe System::SmartPtr pour gérer des objets de ce type en C++."
type: docs
weight: 6100
url: /fr/cpp/system/timespan/
---
## TimeSpan class


Représente un intervalle de temps. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N’utilisez jamais la classe [System::SmartPtr](../smartptr/) pour gérer des objets de ce type.

```cpp
class TimeSpan
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Renvoie une nouvelle instance de la classe [TimeSpan](./) qui représente un intervalle de temps égal à la somme des intervalles de temps représentés par l'objet actuel et l'objet spécifié. |
| static [Compare](./compare/)(TimeSpan, TimeSpan) | Compare deux objets [TimeSpan](./). |
| [CompareTo](./compareto/)(TimeSpan) const | Compare l'objet actuel et l'objet spécifié. |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | Compare l'objet actuel et l'objet spécifié. |
| [Duration](./duration/)() const | Renvoie une nouvelle instance de l'objet [TimeSpan](./) dont la valeur est la valeur absolue de l'objet actuel. |
| [Equals](./equals/)(TimeSpan) const | Détermine si l'intervalle de temps représenté par l'objet actuel est égal à l'intervalle de temps représenté par l'objet spécifié. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Détermine si l'intervalle de temps représenté par l'objet actuel est égal à l'intervalle de temps représenté par l'objet spécifié. |
| static [Equals](./equals/)(TimeSpan, TimeSpan) | Renvoie true si les objets spécifiés représentent le même intervalle de temps, sinon false. |
| static [FromDays](./fromdays/)(double) | Renvoie un nouvel objet [TimeSpan](./) qui représente l'intervalle spécifié. |
| static [FromHours](./fromhours/)(double) | Renvoie un nouvel objet [TimeSpan](./) qui représente l'intervalle spécifié. |
| static [FromMilliseconds](./frommilliseconds/)(double) | Renvoie un nouvel objet [TimeSpan](./) qui représente l'intervalle spécifié. |
| static [FromMinutes](./fromminutes/)(double) | Renvoie un nouvel objet [TimeSpan](./) qui représente l'intervalle spécifié. |
| static [FromSeconds](./fromseconds/)(double) | Renvoie un nouvel objet [TimeSpan](./) qui représente l'intervalle spécifié. |
| static [FromTicks](./fromticks/)(int64_t) | Renvoie un nouvel objet [TimeSpan](./) qui représente l'intervalle spécifié. |
| [get_Days](./get_days/)() const | Renvoie la composante jours de l'intervalle de temps représenté par l'objet [TimeSpan](./) actuel. |
| [get_Hours](./get_hours/)() const | Renvoie la composante heures de l'intervalle de temps représenté par l'objet [TimeSpan](./) actuel. |
| [get_Milliseconds](./get_milliseconds/)() const | Renvoie la composante millisecondes de l'intervalle de temps représenté par l'objet [TimeSpan](./) actuel. |
| [get_Minutes](./get_minutes/)() const | Renvoie la composante minutes de l'intervalle de temps représenté par l'objet [TimeSpan](./) actuel. |
| [get_Seconds](./get_seconds/)() const | Renvoie la composante secondes de l'intervalle de temps représenté par l'objet [TimeSpan](./) actuel. |
| [get_Ticks](./get_ticks/)() const | Renvoie le nombre d'intervalles de 100 nanosecondes qui constituent l'intervalle de temps représenté par l'objet [TimeSpan](./) actuel. |
| [get_TotalDays](./get_totaldays/)() const | Renvoie la valeur de l'objet [TimeSpan](./) actuel exprimée en jours entiers et fractionnaires. |
| [get_TotalHours](./get_totalhours/)() const | Renvoie la valeur de l'objet [TimeSpan](./) actuel exprimée en heures entières et fractionnaires. |
| [get_TotalMilliseconds](./get_totalmilliseconds/)() const | Renvoie la valeur de l'objet [TimeSpan](./) actuel exprimée en millisecondes entières et fractionnaires. |
| [get_TotalMinutes](./get_totalminutes/)() const | Renvoie la valeur de l'objet [TimeSpan](./) actuel exprimée en minutes entières et fractionnaires. |
| [get_TotalSeconds](./get_totalseconds/)() const | Renvoie la valeur de l'objet [TimeSpan](./) actuel exprimée en secondes entières et fractionnaires. |
| [GetHashCode](./gethashcode/)() const | Renvoie un code de hachage pour l'objet actuel. |
| [IsNull](./isnull/)() const |  |
| [Negate](./negate/)() const | Renvoie une nouvelle instance de l'objet [TimeSpan](./) qui représente la valeur négative représentée par l'objet [TimeSpan](./) actuel. |
| [operator!=](./operator!=/)(TimeSpan) const | Détermine si l'intervalle de temps représenté par l'objet actuel n'est pas égal à l'intervalle de temps représenté par l'objet spécifié. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Renvoie une nouvelle instance de la classe [TimeSpan](./) qui représente un intervalle de temps égal à la somme des intervalles de temps représentés par l'objet actuel et l'objet spécifié. |
| [operator+](./operator+/)() const | Renvoie lui-même. |
| [operator+=](./operator+=/)(TimeSpan) | Assigne à l'objet actuel l'intervalle de temps qui est la somme de l'intervalle de temps représenté par l'objet actuel et l'objet spécifié. |
| [operator-](./operator-/)(TimeSpan) const | Renvoie une nouvelle instance de la classe [TimeSpan](./) qui représente un intervalle de temps résultant de la soustraction de l'intervalle de temps représenté par l'objet spécifié de l'intervalle de temps représenté par l'objet actuel. |
| [operator-](./operator-/)() const | Renvoie une nouvelle instance de l'objet [TimeSpan](./) qui représente la valeur négative représentée par l'objet [TimeSpan](./) actuel. |
| [operator-=](./operator-=/)(TimeSpan) | Assigne à l'objet actuel l'intervalle de temps qui est le résultat de la soustraction de l'intervalle de temps représenté par l'objet spécifié de l'intervalle de temps représenté par l'objet actuel. |
| [operator/](./operator//)(double) const |  |
| [operator/](./operator//)(TimeSpan) const |  |
| [operator/=](./operator/=/)(double) |  |
| [operator<](./operator_/)(TimeSpan) const | Détermine si l'intervalle de temps représenté par l'objet actuel est plus court que l'intervalle de temps représenté par l'objet spécifié. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(TimeSpan) const | Détermine si l'intervalle de temps représenté par l'objet actuel est plus court ou égal à l'intervalle de temps représenté par l'objet spécifié. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const TimeSpan\&) | Définit l'intervalle de temps représenté par l'objet [TimeSpan](./) spécifié sur l'objet [TimeSpan](./) actuel. |
| [operator==](./operator==/)(TimeSpan) const | Détermine si l'intervalle de temps représenté par l'objet actuel est égal à l'intervalle de temps représenté par l'objet spécifié. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(TimeSpan) const | Détermine si l'intervalle de temps représenté par l'objet actuel est plus long que l'intervalle de temps représenté par l'objet spécifié. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(TimeSpan) const | Détermine si l'intervalle de temps représenté par l'objet actuel est plus long ou égal à l'intervalle de temps représenté par l'objet spécifié. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Convertit une chaîne en un objet [TimeSpan](./) équivalent. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Convertit une chaîne en un objet [TimeSpan](./) équivalent en utilisant le fournisseur de format spécifié. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | Convertit une chaîne en un objet [TimeSpan](./) équivalent en utilisant les formats spécifiés, le fournisseur de format et les styles. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | Convertit une chaîne en un objet [TimeSpan](./) équivalent en utilisant le format spécifié, le fournisseur de format et les styles. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| [Subtract](./subtract/)(TimeSpan) const | Renvoie une nouvelle instance de la classe [TimeSpan](./) qui représente un intervalle de temps résultant de la soustraction de l'intervalle de temps représenté par l'objet spécifié de l'intervalle de temps représenté par l'objet actuel. |
| [TimeSpan](./timespan/)() | Construit un objet [TimeSpan](./) qui représente un intervalle de temps nul. |
| explicit [TimeSpan](./timespan/)(int64_t) | Construit une instance de la classe [TimeSpan](./) qui représente l'intervalle de temps spécifié. |
| [TimeSpan](./timespan/)(int, int, int) | Construit une instance de la classe [TimeSpan](./) qui représente l'intervalle de temps égal à la somme du nombre spécifié d'heures, de minutes et de secondes. |
| [TimeSpan](./timespan/)(int, int, int, int, int) | Construit une instance de la classe [TimeSpan](./) qui représente l'intervalle de temps égal à la somme du nombre spécifié d'heures, de minutes, de secondes et de millisecondes. |
| [TimeSpan](./timespan/)(const TimeSpan\&) | Construit un objet [TimeSpan](./) qui représente l'intervalle de temps égal à l'intervalle de temps représenté par l'objet [TimeSpan](./) spécifié. |
| [ToString](./tostring/)() const | Renvoie la représentation sous forme de chaîne de l'intervalle de temps représenté par l'objet actuel. |
| [ToString](./tostring/)(const String\&) const | Convertit la valeur de l'objet actuel en une représentation sous forme de chaîne équivalente, en utilisant le format spécifié. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Convertit la valeur de l'objet actuel en une représentation sous forme de chaîne équivalente, en utilisant le format spécifié et le fournisseur de format. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| static [TryParse](./tryparse/)(const String\&, TimeSpan\&) | Convertit une chaîne en un objet [TimeSpan](./) équivalent et renvoie le résultat de la conversion. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Convertit une chaîne en un objet [TimeSpan](./) équivalent en utilisant le fournisseur de format spécifié et renvoie le résultat de la conversion. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Convertit une chaîne en un objet [TimeSpan](./) équivalent en utilisant les formats spécifiés et le fournisseur de format, et renvoie le résultat de la conversion. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | Convertit une chaîne en un objet [TimeSpan](./) équivalent en utilisant le format spécifié, le fournisseur de format et les styles, et renvoie le résultat de la conversion. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | Convertit une chaîne en un objet [TimeSpan](./) équivalent en utilisant les formats spécifiés, le fournisseur de format et les styles, et renvoie le résultat de la conversion. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Convertit une chaîne en un objet [TimeSpan](./) équivalent en utilisant le format spécifié et le fournisseur de format, et renvoie le résultat de la conversion. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [Type](./type/)() | Renvoie un objet [TypeInfo](../typeinfo/) qui représente la structure [TimeSpan](./). |
## Champs

| Champ | Description |
| --- | --- |
| static [MaxValue](./maxvalue/) | L'objet [TimeSpan](./) qui représente l'intervalle le plus long possible. |
| static [MinValue](./minvalue/) | /// L'objet [TimeSpan](./) qui représente l'intervalle le plus court possible. |
| static constexpr [TicksPerDay](./ticksperday/) | Le nombre d'intervalles de 100 nanosecondes dans une journée (intervalle de 24 heures). |
| static constexpr [TicksPerHour](./ticksperhour/) | Le nombre d'intervalles de 100 nanosecondes dans une heure. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | Le nombre d'intervalles de 100 nanosecondes dans une milliseconde. |
| static constexpr [TicksPerMinute](./ticksperminute/) | Le nombre d'intervalles de 100 nanosecondes dans une minute. |
| static constexpr [TicksPerSecond](./tickspersecond/) | Le nombre d'intervalles de 100 nanosecondes dans une seconde. |
| static [Zero](./zero/) | L'objet [TimeSpan](./) qui représente un intervalle nul. |
## Remarques



```cpp
#include "system/datetime.h"
#include "system/timespan.h"
#include <iostream>

int main()
{
  const auto date1 = System::DateTime(2021, 01, 01);
  const auto date2 = System::DateTime(2021, 10, 30);

  const auto interval = date2 - date1;

  std::cout << "Number of ticks: " << interval.get_Ticks() << std::endl;
  std::cout << "Number of milliseconds: " << interval.get_Milliseconds() << std::endl;
  std::cout << "Total number of milliseconds: " << interval.get_TotalMilliseconds() << std::endl;
  std::cout << "Number of minutes: " << interval.get_Minutes() << std::endl;
  std::cout << "Total number of minutes: " << interval.get_TotalMinutes() << std::endl;
  std::cout << "Number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Total number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Number of days: " << interval.get_Days() << std::endl;
  std::cout << "Total number of days: " << interval.get_TotalDays() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Number of ticks: 260928000000000
Number of milliseconds: 0
Total number of milliseconds: 2.60928e+10
Number of minutes: 0
Total number of minutes: 434880
Number of hours: 0
Total number of hours: 0
Number of days: 302
Total number of days: 302
*/
```

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
