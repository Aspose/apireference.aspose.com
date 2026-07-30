---
title: "méthode System::Drawing::Graphics::MeasureCharacterRanges"
linktitle: "MeasureCharacterRanges"
second_title: "Aspose.Font pour C++"
description: "méthode System::Drawing::Graphics::MeasureCharacterRanges. Retourne un tableau de régions, chacune délimitant les positions de caractères dans la chaîne spécifiée en C++."
type: docs
weight: 6400
url: /fr/cpp/system.drawing/graphics/measurecharacterranges/
---
## Graphics::MeasureCharacterRanges method


Renvoie un tableau de régions, chacune délimitant les positions de caractères dans la chaîne spécifiée.

```cpp
ArrayPtr<SharedPtr<Region>> System::Drawing::Graphics::MeasureCharacterRanges(const System::String &text, const SharedPtr<Font> &font, RectangleF layoutRect, const SharedPtr<StringFormat> &stringFormat)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| texte | const System::String\& | La chaîne à mesurer |
| police | const SharedPtr\<Font\>\& | La police utilisée lors de la mesure de la chaîne |
| layoutRect | RectangleF | Le rectangle de mise en page utilisé lors de la mesure de la chaîne |
| stringFormat | const SharedPtr\<StringFormat\>\& | Le format de chaîne, contient les plages de caractères à mesurer |

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../../region/)
* Class [String](../../../system/string/)
* Class [Font](../../font/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
