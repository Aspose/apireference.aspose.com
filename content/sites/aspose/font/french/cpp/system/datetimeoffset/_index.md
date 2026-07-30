---
title: "Classe System::DateTimeOffset"
linktitle: "DécalageDateHeure"
second_title: "Aspose.Font pour C++"
description: "Classe System::DateTimeOffset. Contient la date et l'heure du jour relatives au Temps Universel Coordonné. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1700
url: /fr/cpp/system/datetimeoffset/
---
## DateTimeOffset class


Contient la date et l'heure du jour relatives au Temps Universel Coordonné. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class DateTimeOffset
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Ajoute un intervalle de temps spécifié à l'objet [DateTimeOffset](./). |
| [AddDays](./adddays/)(double) const | Ajoute un nombre spécifié de jours à l'objet [DateTimeOffset](./). |
| [AddHours](./addhours/)(double) const | Ajoute un nombre spécifié d'heures à l'objet [DateTimeOffset](./). |
| [AddMilliseconds](./addmilliseconds/)(double) const | Ajoute un nombre spécifié de millisecondes à l'objet [DateTimeOffset](./). |
| [AddMinutes](./addminutes/)(double) const | Ajoute un nombre spécifié de minutes à l'objet [DateTimeOffset](./). |
| [AddMonths](./addmonths/)(int) const | Ajoute un nombre spécifié de mois à l'objet [DateTimeOffset](./). |
| [AddSeconds](./addseconds/)(double) const | Ajoute un nombre spécifié de secondes à l'objet [DateTimeOffset](./). |
| [AddTicks](./addticks/)(int64_t) const | Ajoute un nombre spécifié de ticks à l'objet [DateTimeOffset](./). |
| [AddYears](./addyears/)(int) const | Ajoute un nombre spécifié d'années à l'objet [DateTimeOffset](./). |
| static [Compare](./compare/)(const DateTimeOffset\&, const DateTimeOffset\&) | Compare deux objets [DateTimeOffset](./). |
| [CompareTo](./compareto/)(const DateTimeOffset\&) const | Compare deux objets [DateTimeOffset](./). |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | Compare deux objets [DateTimeOffset](./). |
| [DateTimeOffset](./datetimeoffset/)() | Constructeur par défaut. |
| [DateTimeOffset](./datetimeoffset/)(DateTime) | Constructeur. |
| [DateTimeOffset](./datetimeoffset/)(int64_t, TimeSpan) | Constructeur. |
| [DateTimeOffset](./datetimeoffset/)(DateTime, TimeSpan) | Constructeur. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, TimeSpan) | Constructeur. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, TimeSpan) | Constructeur. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, TimeSpan) | Constructeur. |
| static [Equals](./equals/)(const DateTimeOffset\&, const DateTimeOffset\&) | Vérifie si deux objets [DateTimeOffset](./) représentent le même point dans le temps. |
| [Equals](./equals/)(const DateTimeOffset\&) const | Vérifie si deux objets [DateTimeOffset](./) représentent le même point dans le temps. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Vérifie si deux objets [DateTimeOffset](./) représentent le même point dans le temps. |
| [EqualsExact](./equalsexact/)(const DateTimeOffset\&) const | Vérifie si deux objets [DateTimeOffset](./) représentent le même point dans le temps et ont le même décalage. |
| [EqualsExact](./equalsexact/)(const SharedPtr\<Object\>\&) const | Vérifie si deux objets [DateTimeOffset](./) représentent le même point dans le temps et ont le même décalage. |
| static [FromFileTime](./fromfiletime/)(int64_t) | [Convert](../convert/)[Windows](../../system.windows/) temps de fichier en date et heure avec le décalage horaire local. |
| static [FromUnixTimeMilliseconds](./fromunixtimemilliseconds/)(int64_t) | [Convert](../convert/) temps Unix en objet [DateTimeOffset](./). |
| static [FromUnixTimeSeconds](./fromunixtimeseconds/)(int64_t) | [Convert](../convert/) temps Unix en objet [DateTimeOffset](./). |
| [get_Date](./get_date/)() const | Obtient la composante date de l'objet actuel. |
| [get_DateTime](./get_datetime/)() const | Obtient la valeur [DateTime](../datetime/). |
| [get_Day](./get_day/)() const | Obtient le jour du mois de l'objet actuel. |
| [get_DayOfWeek](./get_dayofweek/)() const | Obtient le jour de la semaine de l'objet actuel. |
| [get_DayOfYear](./get_dayofyear/)() const | Obtient le jour de l'année de l'objet actuel. |
| [get_Hour](./get_hour/)() const | Obtient la composante d'heure de l'objet actuel. |
| [get_LocalDateTime](./get_localdatetime/)() const | Obtient la valeur [DateTime](../datetime/) qui représente la date et l'heure locales. |
| [get_Millisecond](./get_millisecond/)() const | Obtient la composante milliseconde de l'objet actuel. |
| [get_Minute](./get_minute/)() const | Obtient la composante minute de l'objet actuel. |
| [get_Month](./get_month/)() const | Obtient la composante mois de l'objet actuel. |
| static [get_Now](./get_now/)() | Obtient le [DateTimeOffset](./) dont la date et l'heure sont définies à l'heure locale actuelle et dont le décalage est défini au décalage de l'heure locale. |
| [get_Offset](./get_offset/)() const | Obtient le décalage par rapport à UTC. |
| [get_Second](./get_second/)() const | Obtient la composante seconde de l'objet actuel. |
| [get_Ticks](./get_ticks/)() const | Obtient le nombre de ticks de l'objet actuel. |
| [get_TimeOfDay](./get_timeofday/)() const | Obtient l'heure du jour de l'objet actuel. |
| [get_UtcDateTime](./get_utcdatetime/)() const | Obtient la valeur [DateTime](../datetime/) qui représente la date et l'heure UTC. |
| static [get_UtcNow](./get_utcnow/)() | Obtient le [DateTimeOffset](./) dont la date et l'heure sont définies à l'heure UTC actuelle et dont le décalage est [TimeSpan::Zero](../timespan/zero/). |
| [get_UtcTicks](./get_utcticks/)() const | Obtient le nombre de ticks de l'objet actuel en temps UTC. |
| [get_Year](./get_year/)() const | Obtient la composante année de l'objet actuel. |
| [GetHashCode](./gethashcode/)() const | Obtient le code de hachage de l'objet [DateTimeOffset](./) actuel. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(const DateTimeOffset\&) const | Détermine si l'objet actuel et l'objet [DateTimeOffset](./) spécifié représentent des valeurs de date et d'heure distinctes. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Renvoie une nouvelle instance de la classe [DateTimeOffset](./) qui représente la valeur de date et d'heure qui est la somme de la valeur représentée par l'objet actuel et de l'intervalle de temps spécifié. |
| [operator-](./operator-/)(TimeSpan) const | Renvoie une nouvelle instance de la classe [DateTimeOffset](./) représentant la valeur de date et d'heure qui résulte de la soustraction de l'intervalle de temps spécifié de la valeur représentée par l'objet actuel. |
| [operator-](./operator-/)(const DateTimeOffset\&) const | Renvoie une instance de la classe [TimeSpan](../timespan/) qui représente l'intervalle de temps entre les valeurs de date et d'heure représentées par les objets actuel et spécifié. |
| [operator<](./operator_/)(const DateTimeOffset\&) const | Détermine si l'objet actuel représente la valeur de date et d'heure qui est antérieure à la valeur représentée par l'objet [DateTimeOffset](./) spécifié. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(const DateTimeOffset\&) const | Détermine si l'objet actuel représente la valeur de date et d'heure qui est antérieure ou égale à la valeur représentée par l'objet [DateTimeOffset](./) spécifié. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator==](./operator==/)(const DateTimeOffset\&) const | Détermine si l'objet actuel et l'objet [DateTimeOffset](./) spécifié représentent la même valeur de date et d'heure. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(const DateTimeOffset\&) const | Détermine si l'objet actuel représente la valeur de date et d'heure qui est postérieure à la valeur représentée par l'objet [DateTimeOffset](./) spécifié. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(const DateTimeOffset\&) const | Détermine si l'objet actuel représente la valeur de date et d'heure qui est postérieure ou égale à la valeur représentée par l'objet [DateTimeOffset](./) spécifié. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Convertit la chaîne spécifiée en équivalent [DateTimeOffset](./). |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Convertit la chaîne spécifiée en objet [DateTimeOffset](./) en utilisant le fournisseur de format spécifié et le style de formatage. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Convertit la chaîne spécifiée en objet [DateTimeOffset](./) en utilisant le format spécifié, le fournisseur de format et le style de formatage. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Convertit la chaîne spécifiée en objet [DateTimeOffset](./) en utilisant les formats spécifiés, le fournisseur de format et le style de formatage. |
| [Subtract](./subtract/)(TimeSpan) const | Soustrait un intervalle de temps spécifié de l'objet actuel. |
| [Subtract](./subtract/)(const DateTimeOffset\&) const | Soustrait une valeur [DateTimeOffset](./) spécifiée de l'objet actuel. |
| [ToFileTime](./tofiletime/)() const | Convertit l'objet actuel en temps de fichier [Windows](../../system.windows/). |
| [ToLocalTime](./tolocaltime/)() const | Convertit l'objet actuel en un objet qui représente l'heure locale. |
| [ToOffset](./tooffset/)(TimeSpan) const | Remplace le décalage de l'objet actuel par le décalage spécifié. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Convertit l'objet actuel en chaîne en utilisant le format spécifié et le fournisseur de format. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Convertit l'objet actuel en chaîne en utilisant le fournisseur de format spécifié. |
| [ToString](./tostring/)(const String\&) const | Convertit l'objet actuel en chaîne en utilisant le format spécifié. |
| [ToString](./tostring/)() const | Convertit l'objet actuel en chaîne. |
| [ToUniversalTime](./touniversaltime/)() const | Convertit l'objet actuel en un objet qui représente l'heure UTC. |
| [ToUnixTimeMilliseconds](./tounixtimemilliseconds/)() const | Obtient les millisecondes écoulées depuis le début de l'époque Unix. |
| [ToUnixTimeSeconds](./tounixtimeseconds/)() const | Obtient les secondes écoulées depuis le début de l'époque Unix. |
| static [TryParse](./tryparse/)(const String\&, DateTimeOffset\&) | Essaie de convertir la chaîne spécifiée en objet [DateTimeOffset](./). |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Essaie de convertir la chaîne spécifiée en objet [DateTimeOffset](./) en utilisant le fournisseur de format spécifié et le style de formatage. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Essaie de convertir la chaîne spécifiée en objet [DateTimeOffset](./) en utilisant les formats spécifiés, le fournisseur de format et le style de formatage. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Essaie de convertir la chaîne spécifiée en objet [DateTimeOffset](./) en utilisant le format spécifié, le fournisseur de format et le style de formatage. |
| static [Type](./type/)() | Renvoie un objet [TypeInfo](../typeinfo/) qui représente la structure [TimeSpan](../timespan/). |
## Champs

| Champ | Description |
| --- | --- |
| static constexpr [MaxOffset](./maxoffset/) | Obtient le décalage maximal en ticks. |
| static [MaxValue](./maxvalue/) | Obtient la plus grande valeur [DateTimeOffset](./). |
| static constexpr [MinOffset](./minoffset/) | Obtient le décalage minimal en ticks. |
| static [MinValue](./minvalue/) | Obtient la valeur [DateTimeOffset](./) la plus ancienne. |
| static [UnixEpoch](./unixepoch/) | Obtient le début de l'époque Unix. |
## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
