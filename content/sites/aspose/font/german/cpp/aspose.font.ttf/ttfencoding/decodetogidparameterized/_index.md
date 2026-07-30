---
title: "Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized-Methode"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized-Methode. Die parametrisierte Version ermöglicht die Verwendung einer spezifischen CMap-Tabelle (nicht Unicode) in C++."
type: docs
weight: 200
url: /de/cpp/aspose.font.ttf/ttfencoding/decodetogidparameterized/
---
## TtfEncoding::DecodeToGidParameterized method


Die parametrische Version ermöglicht die Verwendung einer spezifischen CMap‑Tabelle (nicht Unicode).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | Implementierung des [IEncodingParameters](../../../aspose.font/iencodingparameters/) Interface. |
| charCode | uint32_t | Zeichencode, für den der Glyph-Bezeichner ermittelt werden soll. |

### ReturnValue

Glyph-Bezeichner, der zum übergebenen Zeichencode gehört.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../../aspose.font/iencodingparameters/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
