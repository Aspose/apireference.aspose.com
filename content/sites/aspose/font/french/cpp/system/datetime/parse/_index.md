---
title: "System::DateTime::Parse méthode"
linktitle: "Analyser"
second_title: "Aspose.Font pour C++"
description: "System::DateTime::Parse méthode. Convertit la représentation sous forme de chaîne spécifiée d'une valeur de date et d'heure en l'objet DateTime équivalent en C++."
type: docs
weight: 6600
url: /fr/cpp/system/datetime/parse/
---
## DateTime::Parse(const String\&) method


Convertit la représentation sous forme de chaîne spécifiée d'une valeur de date et d'heure en l'objet [DateTime](../) équivalent.

```cpp
static DateTime System::DateTime::Parse(const String &s)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | const String\& | La représentation sous forme de chaîne d'une valeur de date et d'heure à convertir. |

### ReturnValue

Une nouvelle instance de la classe [DateTime](../) qui représente la valeur de date et d'heure équivalente à celle représentée par la chaîne spécifiée.

## Voir aussi

* Class [DateTime](../)
* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Voir aussi

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Voir aussi

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Convertit la représentation sous forme de chaîne spécifiée d'une valeur de date et d'heure en l'objet [DateTime](../) équivalent en utilisant des informations de format spécifiques à la culture.

```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | const String\& | La représentation sous forme de chaîne d'une valeur de date et d'heure à convertir. |
| provider | const SharedPtr\<IFormatProvider\>\& | L'objet [IFormatProvider](../../iformatprovider/) qui fournit des informations de format spécifiques à la culture. |
| styles | Globalization::DateTimeStyles | Une combinaison binaire des valeurs d'énumération qui fournit des informations supplémentaires sur **s**, sur les éléments de style pouvant être présents dans **s**, ou sur la conversion de **s** en objet [DateTime](../). |

### ReturnValue

Une nouvelle instance de la classe [DateTime](../) qui représente la valeur de date et d'heure équivalente à celle représentée par la chaîne spécifiée.

## Voir aussi

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::Parse(const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Voir aussi

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
