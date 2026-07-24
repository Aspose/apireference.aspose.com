---
title: "System::DateTimeOffset::ParseExact méthode"
linktitle: "ParseExact"
second_title: "Aspose.Page pour C++"
description: "System::DateTimeOffset::ParseExact méthode. Convertit la chaîne spécifiée en objet DateTimeOffset en utilisant les formats spécifiés, le fournisseur de format et le style de formatage en C++."
type: docs
weight: 5600
url: /fr/cpp/system/datetimeoffset/parseexact/
---
## DateTimeOffset::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Convertit la chaîne spécifiée en objet [DateTimeOffset](../) en utilisant les formats spécifiés, le fournisseur de format et le style de formatage.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const String\& | [String](../../string/) à convertir. |
| formats | const ArrayPtr\<String\>\& | [Array](../../array/) de chaînes de format. |
| fournisseur | const SharedPtr\<IFormatProvider\>\& | Fournisseur de format. |
| styles | Globalization::DateTimeStyles | Styles de formatage de date et d'heure. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## Voir aussi

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Convertit la chaîne spécifiée en objet [DateTimeOffset](../) en utilisant le format spécifié, le fournisseur de format et le style de formatage.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const String\& | [String](../../string/) à convertir. |
| format | const String\& | Chaîne de format. |
| fournisseur | const SharedPtr\<IFormatProvider\>\& | Fournisseur de format. |
| styles | Globalization::DateTimeStyles | Styles de formatage de date et d'heure. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## Voir aussi

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
