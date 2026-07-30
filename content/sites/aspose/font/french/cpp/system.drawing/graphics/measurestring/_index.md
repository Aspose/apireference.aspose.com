---
title: "Méthode System::Drawing::Graphics::MeasureString"
linktitle: "MeasureString"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Drawing::Graphics::MeasureString. Retourne la taille de la chaîne spécifiée lorsqu'elle est dessinée avec la police spécifiée dans le format spécifié en C++."
type: docs
weight: 6500
url: /fr/cpp/system.drawing/graphics/measurestring/
---
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const method


Renvoie la taille de la chaîne spécifiée lorsqu'elle est dessinée avec la police spécifiée dans le format spécifié.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, int width, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | String const\& | La chaîne dont la taille doit être calculée |
| police | System::SharedPtr\<Font\> const\& | La police utilisée pour dessiner la chaîne |
| width | int | La largeur maximale de la chaîne |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Spécifie le format de la chaîne |

### ReturnValue

Un objet [SizeF](../../sizef/) qui représente la taille de la chaîne dans les unités de mesure spécifiées par la propriété PageUnit de l'objet Graphics actuel.

## Voir aussi

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const method


Renvoie la taille de la chaîne spécifiée lorsqu'elle est dessinée avec la police spécifiée dans le format spécifié.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, PointF const &origin=PointF(0, 0), System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | String const\& | La chaîne dont la taille doit être calculée |
| police | System::SharedPtr\<Font\> const\& | La police utilisée pour dessiner la chaîne |
| origine | PointF const\& | Spécifie l'emplacement du coin supérieur gauche de la chaîne |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Spécifie le format de la chaîne |

### ReturnValue

Un objet [SizeF](../../sizef/) qui représente la taille de la chaîne dans les unités de mesure spécifiées par la propriété PageUnit de l'objet Graphics actuel.

## Voir aussi

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const method


NON IMPLEMENTÉ.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat, int &charactersFitted, int &linesFilled) const
```


## Voir aussi

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const method


Renvoie la taille de la chaîne spécifiée lorsqu'elle est dessinée avec la police spécifiée dans le format spécifié.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | String const\& | La chaîne dont la taille doit être calculée |
| police | System::SharedPtr\<Font\> const\& | La police utilisée pour dessiner la chaîne |
| layoutArea | SizeF const\& | La zone maximale de mise en page de la chaîne |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | Spécifie le format de la chaîne |

### ReturnValue

Un objet [SizeF](../../sizef/) qui représente la taille de la chaîne dans les unités de mesure spécifiées par la propriété PageUnit de l'objet Graphics actuel.

## Voir aussi

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
