---
title: "Aspose::Font::IFontEncoding::DecodeToGidParameterized method"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::IFontEncoding::DecodeToGidParameterized method. Parametrisierte Dekodiermethode in C++."
type: docs
weight: 200
url: /de/cpp/aspose.font/ifontencoding/decodetogidparameterized/
---
## IFontEncoding::DecodeToGidParameterized method


Parametrisierte Dekodiermethode.

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | Implementierung des [IEncodingParameters](../../iencodingparameters/) Interfaces. |
| charCode | uint32_t | Zeichencode, für den der Glyph-Bezeichner ermittelt werden soll. |

### ReturnValue

Glyph‑Bezeichner bezogen auf übergebenen Zeichencode.
## Hinweise


Einige Font‑Typen können mehrere Kodierungsalgorithmen/Karten haben. Daher wird das [IEncodingParameters](../../iencodingparameters/) Interface verwendet, um konkrete Font‑Kodierungsparameter zu erstellen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../iencodingparameters/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
