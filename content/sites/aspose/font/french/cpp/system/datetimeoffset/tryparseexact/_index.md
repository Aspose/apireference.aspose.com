---
title: "System::DateTimeOffset::TryParseExact méthode"
linktitle: "TryParseExact"
second_title: "Aspose.Font pour C++"
description: "System::DateTimeOffset::TryParseExact méthode. Tente de convertir la chaîne spécifiée en objet DateTimeOffset en utilisant les formats spécifiés, le fournisseur de format et le style de formatage en C++."
type: docs
weight: 5800
url: /fr/cpp/system/datetimeoffset/tryparseexact/
---
## DateTimeOffset::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Tente de convertir la chaîne spécifiée en objet [DateTimeOffset](../) en utilisant les formats spécifiés, le fournisseur de format et le style de formatage.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const String\& | [String](../../string/) à convertir. |
| formats | const ArrayPtr\<String\>\& | Tableaux de chaînes de format. |
| fournisseur | const SharedPtr\<IFormatProvider\>\& | Fournisseur de format. |
| styles | Globalization::DateTimeStyles | Styles de formatage de date et d'heure. |
| result | DateTimeOffset\& | [DateTimeOffset](../) qui est équivalent à l'**input**. |

### ReturnValue

true si l'**input** a été converti avec succès, sinon - false.

## Voir aussi

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTimeOffset::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Tente de convertir la chaîne spécifiée en objet [DateTimeOffset](../) en utilisant le format spécifié, le fournisseur de format et le style de formatage.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const String\& | [String](../../string/) à convertir. |
| format | const String\& | Chaîne de format. |
| fournisseur | const SharedPtr\<IFormatProvider\>\& | Fournisseur de format. |
| styles | Globalization::DateTimeStyles | Styles de formatage de date et d'heure. |
| result | DateTimeOffset\& | [DateTimeOffset](../) qui est équivalent à l'**input**. |

### ReturnValue

true si l'**input** a été converti avec succès, sinon - false.

## Voir aussi

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
