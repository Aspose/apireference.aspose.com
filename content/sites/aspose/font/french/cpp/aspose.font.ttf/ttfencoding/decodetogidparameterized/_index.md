---
title: "Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized méthode"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized méthode. La version paramétrée permet d'utiliser une table CMap spécifique (pas Unicode) en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.font.ttf/ttfencoding/decodetogidparameterized/
---
## TtfEncoding::DecodeToGidParameterized method


La version paramétrée permet d'utiliser une table CMap spécifique (pas Unicode).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | Implémentation de l'interface [IEncodingParameters](../../../aspose.font/iencodingparameters/). |
| charCode | uint32_t | Code de caractère pour obtenir l'identifiant du glyphe. |

### ReturnValue

Identifiant du glyphe lié au code de caractère fourni.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../../aspose.font/iencodingparameters/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
