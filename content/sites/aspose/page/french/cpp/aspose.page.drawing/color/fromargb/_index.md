---
title: "Aspose::Page::Drawing::Color::FromArgb méthode"
linktitle: "FromArgb"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::Drawing::Color::FromArgb méthode. Crée une structure T:Aspose::Page::Drawing::Color à partir de la structure T:Aspose::Page::Drawing::Color spécifiée, mais avec la nouvelle valeur alpha spécifiée. Bien que cette méthode permette de passer une valeur de 32 bits pour la valeur alpha, la valeur est limitée à 8 bits en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.page.drawing/color/fromargb/
---
## Color::FromArgb(int32_t, Aspose::Page::Drawing::Color) method


Crée une structure [T:Aspose::Page::Drawing::Color](../) à partir de la structure [T:Aspose::Page::Drawing::Color](../) spécifiée, mais avec la nouvelle valeur alpha spécifiée. Bien que cette méthode permette de passer une valeur 32 bits pour la valeur alpha, celle-ci est limitée à 8 bits.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t alpha, Aspose::Page::Drawing::Color baseColor)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| alpha | int32_t | La valeur alpha pour le nouveau [T:Aspose::Page::Drawing::Color](../). Les valeurs valides sont de 0 à 255. |
| baseColor | Aspose::Page::Drawing::Color | Le [T:Aspose::Page::Drawing::Color](../) à partir duquel créer le nouveau [T:Aspose::Page::Drawing::Color](../). |

### ReturnValue

Le [T:Aspose::Page::Drawing::Color](../) que cette méthode crée.

## Voir aussi

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t, int32_t, int32_t, int32_t) method


Crée une structure [T:Aspose::Page::Drawing::Color](../) à partir des quatre valeurs de composantes ARGB (alpha, rouge, vert et bleu). Bien que cette méthode permette de passer une valeur 32 bits pour chaque composante, la valeur de chaque composante est limitée à 8 bits.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t alpha, int32_t red, int32_t green, int32_t blue)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| alpha | int32_t | Le composant alpha. Les valeurs valides sont de 0 à 255. |
| rouge | int32_t | Le composant rouge. Les valeurs valides sont de 0 à 255. |
| vert | int32_t | Le composant vert. Les valeurs valides sont de 0 à 255. |
| bleu | int32_t | Le composant bleu. Les valeurs valides sont de 0 à 255. |

### ReturnValue

Le [T:Aspose::Page::Drawing::Color](../) que cette méthode crée.

## Voir aussi

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t) method


Crée une structure [T:Aspose::Page::Drawing::Color](../) à partir d'une valeur ARGB 32 bits.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t argb)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| argb | int32_t | Une valeur spécifiant la valeur ARGB de 32 bits. |

### ReturnValue

La structure [T:Aspose::Page::Drawing::Color](../) que cette méthode crée.

## Voir aussi

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t, int32_t, int32_t) method


Crée une structure [T:Aspose::Page::Drawing::Color](../) à partir des valeurs de couleur 8 bits spécifiées (rouge, vert et bleu). La valeur alpha est implicitement 255 (complètement opaque). Bien que cette méthode permette de passer une valeur 32 bits pour chaque composante de couleur, la valeur de chaque composante est limitée à 8 bits.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t red, int32_t green, int32_t blue)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| red | int32_t | La valeur du composant rouge pour le nouveau [T:Aspose::Page::Drawing::Color](../). Les valeurs valides sont de 0 à 255. |
| green | int32_t | La valeur du composant vert pour le nouveau [T:Aspose::Page::Drawing::Color](../). Les valeurs valides sont de 0 à 255. |
| blue | int32_t | La valeur du composant bleu pour le nouveau [T:Aspose::Page::Drawing::Color](../). Les valeurs valides sont de 0 à 255. |

### ReturnValue

Le [T:Aspose::Page::Drawing::Color](../) que cette méthode crée.

## Voir aussi

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
