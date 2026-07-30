---
title: "System::DateTimeOffset::TryParse méthode"
linktitle: "TryParse"
second_title: "Aspose.Font pour C++"
description: "System::DateTimeOffset::TryParse méthode. Tente de convertir la chaîne spécifiée en objet DateTimeOffset en utilisant le fournisseur de format et le style de formatage spécifiés en C++."
type: docs
weight: 5700
url: /fr/cpp/system/datetimeoffset/tryparse/
---
## DateTimeOffset::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Tente de convertir la chaîne spécifiée en objet [DateTimeOffset](../) en utilisant le fournisseur de format et le style de formatage spécifiés.

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const String\& | [String](../../string/) à convertir. |
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
## DateTimeOffset::TryParse(const String\&, DateTimeOffset\&) method


Tente de convertir la chaîne spécifiée en objet [DateTimeOffset](../).

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, DateTimeOffset &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const String\& | [String](../../string/) à convertir. |
| result | DateTimeOffset\& | [DateTimeOffset](../) qui est équivalent à l'**input**. |

### ReturnValue

true si l'**input** a été converti avec succès, sinon - false.

## Voir aussi

* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
