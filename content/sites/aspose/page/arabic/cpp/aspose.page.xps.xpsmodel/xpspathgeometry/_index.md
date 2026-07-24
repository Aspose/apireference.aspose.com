---
title: "فئة Aspose::Page::XPS::XpsModel::XpsPathGeometry"
linktitle: "XpsPathGeometry"
second_title: "Aspose.Page لـ C++"
description: "فئة Aspose::Page::XPS::XpsModel::XpsPathGeometry. فئة تُغَلِّف ميزات عنصر خاصية PathGeometry. يحتوي هذا العنصر على مجموعة من أشكال المسار المحددة إما بصفة Figures أو بعنصر PathFigure فرعي في C++."
type: docs
weight: 3200
url: /ar/cpp/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class


فئة تُغلف ميزات عنصر خاصية PathGeometry. يحتوي هذا العنصر على مجموعة من أشكال المسار المحددة إما بصفة Figures أو بعنصر PathFigure فرعي.

```cpp
class XpsPathGeometry : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathFigure>>,
                        public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddSegment](./addsegment/)(System::SharedPtr\<XpsPathSegment\>) | يضيف مقطع مسار إلى قائمة المقاطع الفرعية للشكل الأخير. |
| [Clone](./clone/)() | ينسخ هذه هندسة المسار. |
| [get_FillRule](./get_fillrule/)() const | إرجاع/تعيين القيمة التي تحدد كيفية دمج المناطق المتقاطعّة للأشكال الهندسية لتشكيل منطقة. |
| [get_PathFigures](./get_pathfigures/)() | إرجاع قائمة بأشكال المسار الفرعية. |
| [get_Transform](./get_transform/)() override | إرجاع/تعيين مصفوفة التحويل الأفيني التي تُنشئ التحويل المصفوفي المحلي المطبق على جميع العناصر الفرعية والتابعة لهندسة المسار قبل استخدامها للتعبئة أو القص أو التحديد. |
| [InsertSegment](./insertsegment/)(int32_t, System::SharedPtr\<XpsPathSegment\>) | يدرج مقطع مسار إلى قائمة المقاطع الفرعية للشكل الأخير في موضع *index*. |
| [RemoveSegment](./removesegment/)(System::SharedPtr\<XpsPathSegment\>) | يزيل مقطع مسار من قائمة المقاطع الفرعية للشكل الأخير. |
| [RemoveSegmentAt](./removesegmentat/)(int32_t) | يزيل مقطع مسار من قائمة المقاطع الفرعية للشكل الأخير في موضع *index*. |
| [set_FillRule](./set_fillrule/)(XpsFillRule) | إرجاع/تعيين القيمة التي تحدد كيفية دمج المناطق المتقاطعّة للأشكال الهندسية لتشكيل منطقة. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | إرجاع/تعيين مصفوفة التحويل الأفيني التي تُنشئ التحويل المصفوفي المحلي المطبق على جميع العناصر الفرعية والتابعة لهندسة المسار قبل استخدامها للتعبئة أو القص أو التحديد. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | عيّن الوسيط القالب رقم n كإشارة ضعيفة (بدلاً من المشتركة). يسمح بتبديل المؤشرات في الحاويات إلى وضع الضعيفة. |
## انظر أيضًا

* Class [XpsArray](../xpsarray/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
