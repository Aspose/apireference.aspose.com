---
title: "System::Uri::MakeRelativeUri méthode"
linktitle: "MakeRelativeUri"
second_title: "Aspose.Page pour C++"
description: "System::Uri::MakeRelativeUri méthode. Détermine la différence entre les URI représentés par l'objet actuel et les objets Uri spécifiés en C++."
type: docs
weight: 3100
url: /fr/cpp/system/uri/makerelativeuri/
---
## Uri::MakeRelativeUri method


Détermine la différence entre les URI représentés par l'objet actuel et les objets [Uri](../) spécifiés.

```cpp
SharedPtr<Uri> System::Uri::MakeRelativeUri(const SharedPtr<Uri> &uri)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | Le comparand |

### ReturnValue

Si le nom d'hôte et le schéma des URI représentés par l'objet actuel et **toUri** sont identiques, alors cette méthode renvoie un [Uri](../) relatif qui, lorsqu'il est ajouté à l'instance URI actuelle, produit **toUri**. Si le nom d'hôte ou le schéma diffèrent, alors cette méthode renvoie un objet [Uri](../) qui représente le paramètre **uri**.

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
