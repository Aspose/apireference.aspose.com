---
title: "Méthode System::Uri::TryCreate"
linktitle: "TryCreate"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Uri::TryCreate. Construit un objet Uri à partir des URI de base et relatifs spécifiés en C++."
type: docs
weight: 4400
url: /fr/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


Construit un [Uri](../) objet à partir de la base et des URI relatifs spécifiés.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | L'URI de base |
| relativeUri | const SharedPtr\<Uri\>\& | L'URI relatif qui est ajouté à l'URI de base |
| result | SharedPtr\<Uri\>\& | L'argument de sortie qui, si la construction réussit, pointe vers le nouvel objet [Uri](../) construit lors du retour de la méthode |

### ReturnValue

Vrai si la construction a réussi, sinon - false

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


Construit un objet [Uri](../) à partir de l'objet [Uri](../) spécifié représentant l'URI de base et de la représentation sous forme de chaîne de l'URI relative.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | L'URI de base |
| relativeUri | const String\& | L'URI relatif qui est ajouté à l'URI de base |
| result | SharedPtr\<Uri\>\& | L'argument de sortie qui, si la construction réussit, pointe vers le nouvel objet [Uri](../) construit lors du retour de la méthode |

### ReturnValue

Vrai si la construction a réussi, sinon - false

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


Construit un objet [Uri](../) qui représente l'URI spécifié ; un argument indique le type d'URI.

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| uriString | const String\& | La chaîne URI à représenter par l'objet en cours de construction |
| uriKind | UriKind | Spécifie le type d'URI |
| result | SharedPtr\<Uri\>\& | L'argument de sortie qui, si la construction réussit, pointe vers le nouvel objet [Uri](../) construit lors du retour de la méthode |

### ReturnValue

Vrai si la construction a réussi, sinon - false

## Voir aussi

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
