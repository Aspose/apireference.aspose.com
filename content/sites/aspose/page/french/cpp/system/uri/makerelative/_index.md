---
title: "Méthode System::Uri::MakeRelative"
linktitle: "MakeRelative"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Uri::MakeRelative. Détermine la différence entre deux instances Uri en C++."
type: docs
weight: 3000
url: /fr/cpp/system/uri/makerelative/
---
## Uri::MakeRelative method


Détermine la différence entre deux instances [Uri](../).

```cpp
String System::Uri::MakeRelative(const SharedPtr<Uri> &toUri)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| toUri | const SharedPtr\<Uri\>\& | L'URI à comparer à l'URI actuel |

### ReturnValue

Si le nom d'hôte et le schéma des URI représentés par l'objet actuel et **toUri** sont identiques, alors cette méthode renvoie une [String](../../string/) qui représente un [Uri](../) relatif, qui, ajouté à l'instance URI actuelle, produit **toUri**. Si le nom d'hôte ou le schéma diffèrent, alors cette méthode renvoie une [String](../../string/) qui représente le paramètre **uri**.

## Voir aussi

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
