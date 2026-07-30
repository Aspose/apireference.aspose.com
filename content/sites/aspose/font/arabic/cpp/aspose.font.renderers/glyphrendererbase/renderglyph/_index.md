---
title: "طريقة Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph"
linktitle: "RenderGlyph"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph. تصيّر الحرف في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.font.renderers/glyphrendererbase/renderglyph/
---
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) method


يرسم الرمز.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | الـ[Font](../../../aspose.font/font/) الذي يحتوي على الحرف. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | فهرس الحرف الفعلي داخل [Font](../../../aspose.font/font/). لاحظ أن هذا ليس يونيكود. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) method


يرسم الرمز، وهو هدف هذه النسخة المحملة الزائدة - لاستخدامها مع ذاكرة التخزين المؤقت للرموز.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | الخط الذي يحتوي على الحرف. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | فهرس الحرف الفعلي داخل [Font](../../../aspose.font/font/). لاحظ أن هذا ليس يونيكود. |
| glyph | System::SharedPtr\<Glyphs::Glyph\> | الحرف لتصييره. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | المصفوفة التي تُطبق على إحداثيات الحرف. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) method


يرسم الرمز.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | الـ[Font](../../../aspose.font/font/) الذي يحتوي على الحرف. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | فهرس الحرف الفعلي داخل [Font](../../../aspose.font/font/). لاحظ أن هذا ليس يونيكود. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | المصفوفة التي تُطبق على إحداثيات الحرف. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t) method


يرسم الرمز.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | الـ[Font](../../../aspose.font/font/) الذي يحتوي على الحرف. |
| glyphIndex | uint32_t | فهرس الحرف الفعلي داخل [Font](../../../aspose.font/font/). لاحظ أن هذا ليس يونيكود. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) method


يرسم الرمز.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | الـ[Font](../../../aspose.font/font/) الذي يحتوي على الحرف. |
| glyphIndex | uint32_t | فهرس الحرف الفعلي داخل [Font](../../../aspose.font/font/). لاحظ أن هذا ليس يونيكود. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | المصفوفة التي تُطبق على إحداثيات الحرف. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
