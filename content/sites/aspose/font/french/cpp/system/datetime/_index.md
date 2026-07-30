---
title: "Classe System::DateTime"
linktitle: "DateTime"
second_title: "Aspose.Font pour C++"
description: "Classe System::DateTime. Représente une valeur de date et d'heure spécifique sur le continuum temporel. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe System::SmartPtr pour gérer des objets de ce type en C++."
type: docs
weight: 1600
url: /fr/cpp/system/datetime/
---
## DateTime class


Représente une valeur de date et d'heure spécifique sur le continuum temporel. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe [System::SmartPtr](../smartptr/) pour gérer les objets de ce type.

```cpp
class DateTime
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Renvoie une nouvelle instance de la classe [DateTime](./) qui représente une valeur de date et d'heure résultant de l'ajout de l'intervalle de temps spécifié à la valeur de date et d'heure représentée par l'objet actuel. |
| [AddDays](./adddays/)(double) const | Renvoie une nouvelle instance de la classe [DateTime](./) représentant la valeur de date et d'heure qui est la somme de la valeur représentée par l'objet actuel et du nombre de jours spécifié. |
| [AddHours](./addhours/)(double) const | Renvoie une nouvelle instance de la classe [DateTime](./) représentant la valeur de date et d'heure qui est la somme de la valeur représentée par l'objet actuel et du nombre d'heures spécifié. |
| [AddMilliseconds](./addmilliseconds/)(double) const | Renvoie une nouvelle instance de la classe [DateTime](./) représentant la valeur de date et d'heure qui est la somme de la valeur représentée par l'objet actuel et du nombre de millisecondes spécifié. |
| [AddMinutes](./addminutes/)(double) const | Renvoie une nouvelle instance de la classe [DateTime](./) représentant la valeur de date et d'heure qui est la somme de la valeur représentée par l'objet actuel et du nombre de minutes spécifié. |
| [AddMonths](./addmonths/)(int) const | Renvoie une nouvelle instance de la classe [DateTime](./) représentant la valeur de date et d'heure qui est la somme de la valeur représentée par l'objet actuel et du nombre de mois spécifié. |
| [AddSeconds](./addseconds/)(double) const | Renvoie une nouvelle instance de la classe [DateTime](./) représentant la valeur de date et d'heure qui est la somme de la valeur représentée par l'objet actuel et du nombre de secondes spécifié. |
| [AddTicks](./addticks/)(int64_t) const | Renvoie une nouvelle instance de la classe [DateTime](./) représentant la valeur de date et d'heure qui est la somme de la valeur représentée par l'objet actuel et du nombre d'intervalles de 100 nanosecondes spécifié. |
| [AddYears](./addyears/)(int) const | Renvoie une nouvelle instance de la classe [DateTime](./) représentant la valeur de date et d'heure égale à celle représentée par l'objet actuel avec le composant année augmenté du nombre spécifié. |
| static [Compare](./compare/)(DateTime, DateTime) | Compare deux valeurs représentées par les instances spécifiées de la classe [DateTime](./) et renvoie la valeur indiquant la position relative des valeurs sur la ligne du temps. |
| [CompareTo](./compareto/)(DateTime) const | Compare deux valeurs de date et d'heure représentées par l'objet actuel et l'instance spécifiée de la classe [DateTime](./) et renvoie la valeur indiquant la position relative des valeurs sur la ligne du temps. |
| [DateTime](./datetime/)() | Construit une instance qui représente la plus petite valeur possible de date et d'heure, égale à MinValue. |
| [DateTime](./datetime/)(int, int, int) | Construit une instance qui représente une valeur de date et d'heure spécifiée par une année, un mois et un jour particuliers. |
| [DateTime](./datetime/)(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | Construit une instance qui représente une valeur de date et d'heure spécifiée par une année, un mois et un jour particuliers dans le calendrier spécifié. |
| [DateTime](./datetime/)(int, int, int, int, int, int) | Construit une instance qui représente une valeur de date et d'heure spécifiée par une année, un mois, un jour, une heure, une minute et une seconde particuliers. |
| [DateTime](./datetime/)(int, int, int, int, int, int, DateTimeKind) | Construit une instance qui représente une valeur de date et d'heure spécifiée par une année, un mois, un jour, une heure, une minute et une seconde particuliers. |
| [DateTime](./datetime/)(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | Construit une instance qui représente une valeur de date et d'heure spécifiée par une année, un mois, un jour, une heure, une minute et une seconde particuliers dans le calendrier spécifié. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, DateTimeKind) | Construit une instance qui représente une valeur de date et d'heure spécifiée par une année, un mois, un jour, une heure, une minute, une seconde et une milliseconde particuliers. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) | Construit une instance qui représente une valeur de date et d'heure spécifiée par une année, un mois, un jour, une heure, une minute, une seconde et une milliseconde particuliers dans le calendrier spécifié. |
| [DateTime](./datetime/)(int64_t, DateTimeKind) | Construit une instance qui représente une valeur de date et d'heure spécifiée par un nombre de ticks. |
| [DateTime](./datetime/)(int64_t, DateTimeKind, bool) | Construit une instance qui représente une valeur de date et d'heure spécifiée par un nombre de ticks. POUR USAGE INTERNE. |
| [DateTime](./datetime/)(const DateTime\&) | Copie-constructeur d'une instance. |
| static [DaysInMonth](./daysinmonth/)(int, int) | Renvoie le nombre de jours dans le mois spécifié de l'année spécifiée. |
| static [Equals](./equals/)(DateTime, DateTime) | Détermine si les instances spécifiées de la classe [DateTime](./) représentent la même valeur de date et d'heure. |
| [Equals](./equals/)(DateTime) const | Détermine si l'instance spécifiée de la classe [DateTime](./) représente la même valeur de date et d'heure que l'objet actuel. |
| static [FromBinary](./frombinary/)(int64_t) | Désérialise la valeur de date et heure à partir de l'entier non signé 64 bits spécifié et définit la nouvelle instance de la classe [DateTime](./) sur cette valeur. |
| static [FromFileTime](./fromfiletime/)(int64_t) | Convertit le temps de fichier spécifié en une instance de la classe [DateTime](./) représentant la même valeur de date et d'heure que l'heure locale. |
| static [FromFileTimeUtc](./fromfiletimeutc/)(int64_t) | Convertit le temps de fichier spécifié en une instance de la classe [DateTime](./) représentant la même valeur de date et d'heure que l'heure UTC. |
| static [FromOADate](./fromoadate/)(double) | Renvoie une instance de la classe [DateTime](./) représentant la valeur de date et d'heure équivalente à la date d'automatisation OLE spécifiée. |
| static [FromUnixTime](./fromunixtime/)(time_t) | Convertit la valeur de temps Unix spécifiée en une instance de la classe [DateTime](./). POUR USAGE INTERNE. |
| [get_Date](./get_date/)() const | Renvoie une nouvelle instance de la classe [DateTime](./) qui représente la partie date de la date et de l'heure représentées par l'objet actuel, chaque composant de la partie temps étant mis à 0. |
| [get_Day](./get_day/)() const | Renvoie le numéro ordinal du jour dans le mois représenté par l'objet actuel. |
| [get_DayOfWeek](./get_dayofweek/)() const | Renvoie une valeur représentant le jour de la semaine représenté par l'objet actuel. |
| [get_DayOfYear](./get_dayofyear/)() const | Renvoie le numéro ordinal du jour dans l'année représentée par l'objet actuel. |
| [get_Hour](./get_hour/)() const | Renvoie le composant heure de la valeur de date et d'heure représentée par l'objet actuel. |
| [get_Kind](./get_kind/)() const | Renvoie la valeur indiquant si la date et l'heure représentées par l'objet actuel sont une date et heure locales, UTC ou aucune des deux. |
| [get_Millisecond](./get_millisecond/)() const | Renvoie le composant milliseconde de la valeur de date et d'heure représentée par l'objet actuel. |
| [get_Minute](./get_minute/)() const | Renvoie le composant minute de la valeur de date et d'heure représentée par l'objet actuel. |
| [get_Month](./get_month/)() const | Renvoie le numéro ordinal du mois dans l'année représentée par l'objet actuel. |
| static [get_Now](./get_now/)() | Renvoie une instance de la classe [DateTime](./) qui représente l'heure actuelle en heure locale. |
| [get_Second](./get_second/)() const | Renvoie le composant seconde de la valeur de date et d'heure représentée par l'objet actuel. |
| [get_Ticks](./get_ticks/)() const | Renvoie un nombre d'intervalles de 100 nanosecondes écoulés depuis le 0 h 00 min 00 s UTC, 1 janvier 0001, dans le calendrier grégorien jusqu'à la date et l'heure représentées par l'objet actuel. |
| [get_TimeOfDay](./get_timeofday/)() const | Renvoie la valeur qui représente l'intervalle de temps depuis le début du jour représenté par l'objet actuel jusqu'à la valeur de date et d'heure représentée par l'objet actuel. |
| static [get_Today](./get_today/)() | Renvoie une instance de la classe [DateTime](./) qui représente la date actuelle avec chaque composant de la partie temps de la valeur représentée par l'objet mis à 0. |
| static [get_UtcNow](./get_utcnow/)() | Renvoie une instance de la classe [DateTime](./) qui représente l'heure actuelle en UTC. |
| [get_Year](./get_year/)() const | Renvoie l'année représentée par l'objet actuel. |
| [GetDateComponents](./getdatecomponents/)(int\&, int\&, int\&) const | Obtient les parties de la date. POUR USAGE INTERNE. |
| [GetDateTimeFormats](./getdatetimeformats/)() const | Renvoie un tableau de chaînes où chaque élément est la représentation sous forme de chaîne de l'objet actuel formatée avec l'un des spécificateurs de format de date et d'heure standard. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t) const | Renvoie un tableau de chaînes où chaque élément est la représentation sous forme de chaîne de l'objet actuel formatée avec le spécificateur de format de date et d'heure standard spécifié. |
| [GetDateTimeFormats](./getdatetimeformats/)(const SharedPtr\<IFormatProvider\>\&) const | Renvoie un tableau de chaînes où chaque élément est la représentation sous forme de chaîne de l'objet actuel formatée avec l'un des spécificateurs de format de date et d'heure standard et le fournisseur de format spécifié. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t, const SharedPtr\<IFormatProvider\>\&) const | Renvoie un tableau de chaînes où chaque élément est la représentation sous forme de chaîne de l'objet actuel formaté avec le spécificateur de format de date et d'heure standard spécifié et le fournisseur de format. |
| [GetHashCode](./gethashcode/)() const | Renvoie un code de hachage pour l'objet actuel. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)() const | Détermine si la valeur de date et d'heure représentée par l'objet actuel se situe dans la plage de l'heure d'été pour le fuseau horaire actuel. |
| static [IsLeapYear](./isleapyear/)(int) | Détermine si l'année spécifiée est une année bissextile. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(DateTime) const | Détermine si l'objet actuel et l'objet [DateTime](./) spécifié représentent des valeurs de date et d'heure distinctes. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Renvoie une nouvelle instance de la classe [DateTime](./) qui représente la valeur de date et d'heure résultant de la somme de la valeur représentée par l'objet actuel et de l'intervalle de temps spécifié. |
| [operator+=](./operator+=/)(TimeSpan) | Définit l'objet actuel sur la valeur de date et d'heure qui est la somme de la valeur représentée par l'objet actuel et de l'intervalle de temps spécifié. |
| [operator-](./operator-/)(TimeSpan) const | Renvoie une nouvelle instance de la classe [DateTime](./) représentant la valeur de date et d'heure qui résulte de la soustraction de l'intervalle de temps spécifié de la valeur représentée par l'objet actuel. |
| [operator-](./operator-/)(DateTime) const | Renvoie une instance de la classe [TimeSpan](../timespan/) qui représente l'intervalle de temps entre les valeurs de date et d'heure représentées par les objets actuel et spécifié. |
| [operator-=](./operator-=/)(TimeSpan) | Définit l'objet actuel sur la valeur de date et d'heure qui résulte de la soustraction de l'intervalle de temps spécifié de la valeur de date et d'heure représentée par l'objet actuel. |
| [operator<](./operator_/)(DateTime) const | Détermine si l'objet actuel représente la valeur de date et d'heure qui est antérieure à la valeur représentée par l'objet [DateTime](./) spécifié. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(DateTime) const | Détermine si l'objet actuel représente la valeur de date et d'heure qui est antérieure ou égale à la valeur représentée par l'objet [DateTime](./) spécifié. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const DateTime\&) | Attribue la valeur représentée par l'instance [DateTime](./) spécifiée à l'objet actuel. |
| [operator==](./operator==/)(DateTime) const | Détermine si l'objet actuel et l'objet [DateTime](./) spécifié représentent la même valeur de date et d'heure. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(DateTime) const | Détermine si l'objet actuel représente la valeur de date et d'heure qui est postérieure à la valeur représentée par l'objet [DateTime](./) spécifié. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(DateTime) const | Détermine si l'objet actuel représente la valeur de date et d'heure qui est postérieure ou égale à la valeur représentée par l'objet [DateTime](./) spécifié. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Convertit la représentation sous forme de chaîne spécifiée d'une valeur de date et d'heure en l'objet [DateTime](./) équivalent. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Convertit la représentation sous forme de chaîne spécifiée d'une valeur de date et d'heure en l'objet [DateTime](./) équivalent en utilisant des informations de format spécifiques à la culture. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Convertit la représentation sous forme de chaîne spécifiée d'une valeur de date et d'heure en l'objet [DateTime](./) équivalent en utilisant le format spécifié et des informations de format spécifiques à la culture. Le format de la représentation sous forme de chaîne doit correspondre exactement au format spécifié. Lève une exception si la conversion échoue. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Convertit la représentation sous forme de chaîne spécifiée d'une valeur de date et d'heure en l'objet [DateTime](./) équivalent en utilisant les formats spécifiés, des informations de format spécifiques à la culture et le style. Le format de la représentation sous forme de chaîne doit correspondre exactement à un ou plusieurs des formats spécifiés. Lève une exception si la conversion échoue. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [SpecifyKind](./specifykind/)(DateTime, DateTimeKind) | Construit un nouvel objet [DateTime](./) qui représente le même nombre de ticks que l'objet [DateTime](./) spécifié et représente l'heure locale, l'heure UTC ou aucune des deux selon l'argument **kind**. |
| [Subtract](./subtract/)(TimeSpan) const | Renvoie une nouvelle instance de la classe [DateTime](./) représentant la valeur de date et d'heure qui résulte de la soustraction de l'intervalle de temps spécifié de la valeur représentée par l'objet actuel. |
| [Subtract](./subtract/)(DateTime) const | Renvoie une instance de la classe [TimeSpan](../timespan/) représentant l'intervalle de temps entre les valeurs de date et d'heure représentées par les objets actuel et spécifié. |
| [ToBinary](./tobinary/)() const | Sérialise l'objet actuel. |
| [ToFileTime](./tofiletime/)() const | Renvoie une valeur qui représente la valeur de date et d'heure représentée par l'objet actuel sous forme de temps de fichier. |
| [ToFileTimeUtc](./tofiletimeutc/)() const | Convertit la valeur de date et d'heure représentée par l'objet actuel en temps de fichier UTC. |
| [ToLocalTime](./tolocaltime/)() const | Renvoie une nouvelle instance de la classe [DateTime](./) qui représente la valeur de date et d'heure représentée par l'objet actuel en heure locale. |
| [ToLongDateString](./tolongdatestring/)() const | Renvoie une chaîne qui contient la représentation sous forme de chaîne de date longue de l'objet actuel. |
| [ToLongTimeString](./tolongtimestring/)() const | Renvoie une chaîne qui contient la représentation sous forme de chaîne de l'heure longue de l'objet actuel. |
| [ToOADate](./tooadate/)() const | Renvoie la valeur de date et d'heure représentée par l'objet actuel sous forme de OLE Automation Date. |
| [ToShortDateString](./toshortdatestring/)() const | Renvoie une chaîne qui contient la représentation sous forme de chaîne de la date courte de l'objet actuel. |
| [ToShortTimeString](./toshorttimestring/)() const | Renvoie une chaîne qui contient la représentation sous forme de chaîne de l'heure courte de l'objet actuel. |
| [ToString](./tostring/)() const | Renvoie la représentation sous forme de chaîne de la valeur de date et d'heure représentée par l'objet actuel en utilisant les conventions de formatage définies par la culture actuelle. |
| [ToString](./tostring/)(const String\&) const | Renvoie une représentation sous forme de chaîne de la valeur de date et d'heure représentée par l'objet actuel en utilisant le format spécifié et les conventions de formatage définies par la culture actuelle. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Renvoie une représentation sous forme de chaîne de la valeur de date et d'heure représentée par l'objet actuel en utilisant les informations de format spécifiées. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Renvoie une représentation sous forme de chaîne de la valeur de date et d'heure représentée par l'objet actuel en utilisant les informations de format spécifiées. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToUniversalTime](./touniversaltime/)() const | Renvoie une nouvelle instance de la classe [DateTime](./) qui représente la valeur de date et d'heure représentée par l'objet actuel en UTC. |
| [ToUnixTime](./tounixtime/)() const | Renvoie une valeur qui représente la valeur de date et d'heure représentée par l'objet actuel sous forme de temps Unix. POUR USAGE INTERNE. |
| static [TryParse](./tryparse/)(const String\&, DateTime\&) | Convertit la représentation sous forme de chaîne spécifiée d'une valeur de date et d'heure en l'objet [DateTime](./) équivalent. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Convertit la représentation sous forme de chaîne spécifiée d'une valeur de date et d'heure en l'objet [DateTime](./) équivalent en utilisant les informations de format spécifiques à la culture et le style spécifiés. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Convertit la représentation sous forme de chaîne spécifiée d'une valeur de date et d'heure en l'objet [DateTime](./) équivalent en utilisant le format spécifié, les informations de format spécifiques à la culture et le style. Le format de la représentation sous forme de chaîne doit correspondre exactement au format spécifié. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Convertit la représentation sous forme de chaîne spécifiée d'une valeur de date et d'heure en l'objet [DateTime](./) équivalent en utilisant les formats spécifiés, les informations de format spécifiques à la culture et le style. Le format de la représentation sous forme de chaîne doit correspondre exactement à un ou plusieurs des formats spécifiés. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [Type](./type/)() | Renvoie un objet [TypeInfo](../typeinfo/) qui contient des informations sur cette classe. |
## Champs

| Champ | Description |
| --- | --- |
| static constexpr [MaxTicks](./maxticks/) | Le nombre de 100 nanosecondes dans l'intervalle de temps entre la valeur [DateTime](./) minimale possible et maximale possible. |
| static [MaxValue](./maxvalue/) | Une instance de la classe [DateTime](./) qui représente la valeur de date et d'heure maximale possible. |
| static constexpr [MinTicks](./minticks/) | Le nombre minimal de ticks qu'une instance de la classe [DateTime](./) peut représenter. |
| static [MinValue](./minvalue/) | Une instance de la classe [DateTime](./) qui représente la valeur de date et d'heure minimale possible. |
| static constexpr [TicksPerDay](./ticksperday/) | Le nombre de ticks dans une journée. |
| static constexpr [TicksPerHour](./ticksperhour/) | Le nombre de ticks dans une heure. |
| static constexpr [TicksPerMicrosecond](./tickspermicrosecond/) | Le nombre de ticks dans une microseconde. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | Le nombre de ticks dans une milliseconde. |
| static constexpr [TicksPerMinute](./ticksperminute/) | Le nombre de ticks dans une minute. |
| static constexpr [TicksPerSecond](./tickspersecond/) | Le nombre de ticks dans une seconde. |
| static [UnixEpoch](./unixepoch/) | Une instance de la classe [DateTime](./) qui représente le début de l'époque Unix (1970.01.01 00:00:00). |
## Remarques



```cpp
#include "system/console.h"
#include "system/date_time.h"

int main()
{
  using namespace System;

  // Créez l'instance de la classe 'DateTime'.
  DateTime dateTime{1990, 10, 30};

  // Imprimez l'instance dans plusieurs formats.
  Console::WriteLine(dateTime.ToShortDateString());
  Console::WriteLine(dateTime.ToShortTimeString());
  Console::WriteLine(dateTime.ToString());

  return 0;
}
/*
This code example produces the following output:
30.10.1990
0:00
30.10.1990 0:00:00
*/
```

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
