---
title: "Méthode System::DateTime::TryParse"
linktitle: "TryParse"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser la méthode TryParse de la classe System::DateTime en C++."
type: docs
weight: 6900
url: /fr/cpp/system/datetime/tryparse/
---
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## Voir aussi

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## Voir aussi

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Convertit la représentation sous forme de chaîne spécifiée d'une valeur date et heure en l'objet [DateTime](../) équivalent en utilisant les informations de format et le style spécifiques à la culture spécifiée.

```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | const String\& | La représentation sous forme de chaîne d'une valeur de date et d'heure à convertir. |
| provider | const SharedPtr\<IFormatProvider\>\& | L'objet [IFormatProvider](../../iformatprovider/) qui fournit des informations de format spécifiques à la culture. |
| styles | Globalization::DateTimeStyles | Une combinaison binaire des valeurs d'énumération qui fournit des informations supplémentaires sur **s**, sur les éléments de style pouvant être présents dans **s**, ou sur la conversion de **s** en objet [DateTime](../). |
| résultat | DateTime\& | Le paramètre de sortie qui, si la conversion réussit, contient le résultat de la conversion. |

### ReturnValue

Vrai si la conversion réussit, sinon - faux.

## Voir aussi

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, DateTime\&) method


Convertit la représentation sous forme de chaîne spécifiée d'une valeur de date et d'heure en l'objet [DateTime](../) équivalent.

```cpp
static bool System::DateTime::TryParse(const String &s, DateTime &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | const String\& | La représentation sous forme de chaîne d'une valeur de date et d'heure à convertir. |
| résultat | DateTime\& | Le paramètre de sortie qui, si la conversion réussit, contient le résultat de la conversion. |

### ReturnValue

Vrai si la conversion réussit, sinon - faux.

## Voir aussi

* Class [String](../../string/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Voir aussi

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
