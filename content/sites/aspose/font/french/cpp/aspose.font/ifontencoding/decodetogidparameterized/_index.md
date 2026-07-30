---
title: "Méthode Aspose::Font::IFontEncoding::DecodeToGidParameterized"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::IFontEncoding::DecodeToGidParameterized. Méthode de décodage paramétrée en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.font/ifontencoding/decodetogidparameterized/
---
## IFontEncoding::DecodeToGidParameterized method


Méthode de décodage paramétrée.

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | Implémentation de l'interface [IEncodingParameters](../../iencodingparameters/). |
| charCode | uint32_t | Code de caractère pour obtenir l'identifiant du glyphe. |

### ReturnValue

Identifiant de glyphe lié au code caractère fourni.
## Remarques


Certains types de police peuvent avoir plusieurs algorithmes/cartes d'encodage. Ainsi, l'interface [IEncodingParameters](../../iencodingparameters/) est utilisée pour créer des paramètres d'encodage de police concrets.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../iencodingparameters/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
