---
title: "فئة Aspose::Page::XPS::Features::EventBasedModifications::PageAPI"
linktitle: "PageAPI"
second_title: "Aspose.Page لـ C++"
description: "فئة Aspose::Page::XPS::Features::EventBasedModifications::PageAPI. واجهة برمجة تطبيقات تعديل عنصر Page في C++."
type: docs
weight: 500
url: /ar/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class


واجهة برمجة تطبيقات تعديل عنصر **[Page](../../aspose.page/)**.

```cpp
class PageAPI : public Aspose::Page::XPS::Features::EventBasedModifications::IModificationAPI
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(T) | يضيف عنصر محتوى (Canvas أو Path أو Glyphs). |
| [AddCanvas](./addcanvas/)() | يضيف canvas جديد إلى الصفحة. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | يضيف glyphs جديدة إلى الصفحة. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | يضيف glyphs جديدة إلى الصفحة. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, int32_t) | يضيف مدخل مخطط إلى المستند. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | يضيف path جديد إلى الصفحة. |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | ينشئ مقطع قوس بيضاوي جديد. |
| [CreateCanvas](./createcanvas/)() | ينشئ canvas جديد. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | ينشئ لونًا جديدًا. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | ينشئ لونًا جديدًا في مساحة اللون sRGB. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | ينشئ لونًا جديدًا في مساحة اللون sRGB. |
| [CreateColor](./createcolor/)(float, float, float, float) | ينشئ لونًا جديدًا في مساحة اللون scRGB. |
| [CreateColor](./createcolor/)(float, float, float) | ينشئ لونًا جديدًا في مساحة اللون scRGB. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | ينشئ لونًا جديدًا في مساحة اللون المعتمدة على ICC. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | ينشئ لونًا جديدًا في مساحة اللون المعتمدة على ICC. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | ينشئ glyphs جديدة. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | ينشئ glyphs جديدة. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | ينشئ نقطة تدرج جديدة. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | ينشئ نقطة تدرج جديدة. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | ينشئ فرشاة صورة جديدة. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | ينشئ فرشاة صورة جديدة. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | ينشئ فرشاة تدرج خطية جديدة. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | ينشئ فرشاة تدرج خطية جديدة. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | ينشئ مصفوفة تحويل أفينية جديدة. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | ينشئ مسارًا جديدًا. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | ينشئ شكل مسار جديد. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | ينشئ شكل مسار جديد. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | ينشئ هندسة مسار جديدة محددة بصيغة مختصرة. |
| [CreatePathGeometry](./createpathgeometry/)() | ينشئ هندسة مسار جديدة. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | ينشئ هندسة مسار جديدة مع قائمة محددة من أشكال المسار. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | ينشئ مجموعة جديدة من منحنيات بيزيه المكعبة. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | ينشئ رسمًا متعدد الأضلاع جديدًا يحتوي على عدد عشوائي من الرؤوس الفردية. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | ينشئ مجموعة جديدة من منحنيات بيزيه التربيعية من النقطة السابقة في شكل المسار عبر مجموعة من الرؤوس، باستخدام نقاط التحكم المحددة. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | ينشئ فرشاة تدرج شعاعي جديدة. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | ينشئ فرشاة تدرج شعاعي جديدة. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | ينشئ فرشاة لون صلب جديدة. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | ينشئ فرشاة لون صلب جديدة. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | ينشئ فرشاة بصرية جديدة. |
| [get_Height](./get_height/)() | يرجع/يضبط ارتفاع الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة. |
| [get_PageCount](./get_pagecount/)() | يرجع عدد الصفحات في المستند النشط. |
| [get_TotalPageCount](./get_totalpagecount/)() | يرجع إجمالي عدد الصفحات في جميع المستندات داخل مستند [XPS](../../aspose.page.xps/). |
| [get_Utils](./get_utils/)() | يحصل على الكائن الذي يوفر أدوات تتجاوز واجهة برمجة تطبيقات معالجة [XPS](../../aspose.page.xps/) الرسمية. |
| [get_Width](./get_width/)() | يرجع/يضبط عرض الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة. |
| [Insert](./insert/)(int32_t, T) | يدرج عنصرًا (Canvas، Path أو Glyphs) إلى الصفحة في موضع *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | يدرج Canvas جديد إلى الصفحة في موضع *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | يدرج Glyphs جديدة إلى الصفحة في موضع *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | يدرج Glyphs جديدة إلى الصفحة في موضع *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | يدرج Path جديد إلى الصفحة في موضع *index*. |
| [Remove](./remove/)(T) | يزيل عنصرًا من الصفحة. |
| [RemoveAt](./removeat/)(int32_t) | يزيل عنصرًا في موضع *index* من الصفحة. |
| [set_Height](./set_height/)(float) | يرجع/يضبط ارتفاع الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة. |
| [set_Width](./set_width/)(float) | يرجع/يضبط عرض الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة. |
## انظر أيضًا

* Class [IModificationAPI](../imodificationapi/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
