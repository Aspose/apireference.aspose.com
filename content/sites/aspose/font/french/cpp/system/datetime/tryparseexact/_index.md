---
title: "Méthode System::DateTime::TryParseExact"
linktitle: "TryParseExact"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser la méthode TryParseExact de la classe System::DateTime en C++."
type: docs
weight: 7000
url: /fr/cpp/system/datetime/tryparseexact/
---
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## Voir aussi

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## Voir aussi

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Convertit la représentation sous forme de chaîne spécifiée d'une valeur de date et d'heure en l'objet [DateTime](../) équivalent en utilisant les formats spécifiés, les informations de format spécifiques à la culture et le style. Le format de la représentation sous forme de chaîne doit correspondre exactement à un ou plusieurs des formats spécifiés.

```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | const String\& | La représentation sous forme de chaîne d'une valeur de date et d'heure à convertir. |
| formats | const ArrayPtr\<String\>\& | Le tableau des formats de chaîne. |
| provider | const SharedPtr\<IFormatProvider\>\& | L'objet [IFormatProvider](../../iformatprovider/) qui fournit des informations de format spécifiques à la culture. |
| styles | Globalization::DateTimeStyles | Une combinaison binaire des valeurs d'énumération qui fournit des informations supplémentaires sur **s**, sur les éléments de style pouvant être présents dans **s**, ou sur la conversion de **s** en objet [DateTime](../). |
| résultat | DateTime\& | Le paramètre de sortie qui, si la conversion réussit, contient le résultat de la conversion. |

### ReturnValue

Vrai si la conversion réussit, sinon - faux.

## Voir aussi

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Voir aussi

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
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
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
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
## DateTime::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Convertit la représentation sous forme de chaîne spécifiée d'une valeur de date et d'heure en l'objet [DateTime](../) équivalent en utilisant le format spécifié, les informations de format spécifiques à la culture et le style. Le format de la représentation sous forme de chaîne doit correspondre exactement au format spécifié.

```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | const String\& | La représentation sous forme de chaîne d'une valeur de date et d'heure à convertir. |
| format | const String\& | Le format de chaîne. |
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
## DateTime::TryParseExact(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParseExact(const String &s, const String &format, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Voir aussi

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
