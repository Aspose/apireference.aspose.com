---
title: "Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized Methode"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized Methode. Parametrisierte Dekodiermethode. Nicht unterstützt für CFF Font‑Typ in C++."
type: docs
weight: 200
url: /de/cpp/aspose.font.cff/cffencoding/decodetogidparameterized/
---
## CffEncoding::DecodeToGidParameterized method


Parametrisierte Dekodiermethode. Nicht unterstützt für CFF [Font](../../../aspose.font/font/) Typ.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | Implementierung des [IEncodingParameters](../../../aspose.font/iencodingparameters/) Interface. |
| charCode | uint32_t | Zeichencode, für den der Glyph-Bezeichner ermittelt werden soll. |

### ReturnValue

Glyph‑Bezeichner, der dem übergebenen charCode zugeordnet ist.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../../aspose.font/iencodingparameters/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
