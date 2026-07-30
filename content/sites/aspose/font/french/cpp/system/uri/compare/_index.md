---
title: "Méthode System::Uri::Compare"
linktitle: "Compare"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Uri::Compare. Compare les objets Uri spécifiés en utilisant les règles de comparaison spécifiées en C++."
type: docs
weight: 3500
url: /fr/cpp/system/uri/compare/
---
## Uri::Compare method


Compare les objets [Uri](../) spécifiés en utilisant les règles de comparaison spécifiées.

```cpp
static int32_t System::Uri::Compare(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2, UriComponents partsToCompare, UriFormat compareFormat, StringComparison comparisonType)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | Le premier comparande |
| uri2 | const SharedPtr\<Uri\>\& | Le deuxième comparande |
| partsToCompare | UriComponents | Spécifie les parties de **uri1** et **uri2** à comparer |
| compareFormat | UriFormat | Spécifie l'échappement de caractères utilisé lorsque les composants des URI sont comparés |
| comparisonType | StringComparison | Une des valeurs de [StringComparison](../../stringcomparison/) |

### ReturnValue

Une valeur négative si **uri1** est inférieur à **uri2**; 0 si uri1 et uri2 sont égaux; une valeur positive si **uri1** est supérieur à **uri2**

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Enum [UriComponents](../../uricomponents/)
* Enum [UriFormat](../../uriformat/)
* Enum [StringComparison](../../stringcomparison/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
