---
title: "Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath Methode"
linktitle: "RenderIndependentGlyphPath"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath Methode. Rendert Glyph mit einem unabhängigen Glyph-Pfad. Die RenderGlyph()-Funktionsfamilie ändert den Glyph-Pfad beim Rendern. Das führt dazu, dass das Glyph erneut geladen werden muss. Diese Funktion verwendet eine Kopie des Glyph-Pfads und ändert den ursprünglichen Glyph-Pfad nicht, sodass dasselbe Glyph mehrfach wiederverwendet werden kann. Diese Funktionsversion ist für die Verwendung mit einem Glyph-Cache in C++ vorgesehen."
type: docs
weight: 200
url: /de/cpp/aspose.font.renderers/glyphrendererbase/renderindependentglyphpath/
---
## GlyphRendererBase::RenderIndependentGlyphPath method


Rendert Glyph mit einem unabhängigen Glyph-Pfad. Die [RenderGlyph()](../renderglyph/) Funktionsfamilie ändert den Glyph-Pfad beim Rendern. Das führt dazu, dass das Glyph erneut geladen werden muss. Diese Funktion verwendet eine Kopie des Glyph-Pfads und ändert den ursprünglichen Glyph-Pfad nicht, sodass dasselbe Glyph mehrfach wiederverwendet werden kann. Diese Funktionsversion ist für die Verwendung mit einem Glyph-Cache vorgesehen.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Der Font, der das Glyph enthält. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Physikalischer Glyph-Index innerhalb des [Font](../../../aspose.font/font/). Hinweis: Dies ist kein Unicode. |
| glyph | System::SharedPtr\<Glyphs::Glyph\> | Glyph zum Rendern. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrix, die auf Glyph-Koordinaten angewendet wird. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
