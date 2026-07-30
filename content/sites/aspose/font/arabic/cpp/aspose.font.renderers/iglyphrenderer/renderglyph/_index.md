---
title: "طريقة Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph"
linktitle: "RenderGlyph"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph. تقوم برسم الحرف في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.font.renderers/iglyphrenderer/renderglyph/
---
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) method


يرسم الرمز.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | الخط الذي يحتوي على الحرف. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | فهرس الحرف الفعلي داخل الخط. لاحظ أن هذا ليس يونيكود. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) method


يرسم الرمز، وهو هدف هذه النسخة المحملة الزائدة - لاستخدامها مع ذاكرة التخزين المؤقت للرموز.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | الخط الذي يحتوي على الحرف. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | فهرس الحرف الفعلي داخل الخط. لاحظ أن هذا ليس يونيكود. |
| glyph | System::SharedPtr\<Glyphs::Glyph\> | الحرف لتصييره. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | المصفوفة التي تُطبق على إحداثيات الحرف. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) method


يرسم الرمز.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | الخط الذي يحتوي على الحرف. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | فهرس الحرف الفعلي داخل الخط. لاحظ أن هذا ليس يونيكود. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | المصفوفة التي تُطبق على إحداثيات الحرف. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t) method


يرسم الرمز.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | الخط الذي يحتوي على الحرف. |
| glyphIndex | uint32_t | فهرس الحرف الفعلي داخل الخط. لاحظ أن هذا ليس يونيكود. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) method


يرسم الرمز.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | الخط الذي يحتوي على الحرف. |
| glyphIndex | uint32_t | فهرس الحرف الفعلي داخل الخط. لاحظ أن هذا ليس يونيكود. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | المصفوفة التي تُطبق على إحداثيات الحرف. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
