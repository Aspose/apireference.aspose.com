---
title: "Aspose::Page::XPS::XpsModel::XpsPathFigure فئة"
linktitle: "XpsPathFigure"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathFigure فئة. فئة تُغلف ميزات عنصر PathFigure. هذا العنصر مكوّن من مجموعة من مقطع واحد أو أكثر من الخطوط أو المنحنيات في C++."
type: docs
weight: 3100
url: /ar/cpp/aspose.page.xps.xpsmodel/xpspathfigure/
---
## XpsPathFigure class


فئة تُغلف ميزات عنصر PathFigure. يتكون هذا العنصر من مجموعة من مقطع خطي أو منحني واحد أو أكثر.

```cpp
class XpsPathFigure : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathSegment>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() | ينسخ هذا شكل المسار. |
| [get_IsClosed](./get_isclosed/)() const | إرجاع/تعيين القيمة التي تشير إلى ما إذا كان شكل المسار مغلقًا. |
| [get_IsFilled](./get_isfilled/)() const | إرجاع/تعيين القيمة التي تشير إلى ما إذا كان شكل المسار يُستخدم في حساب مساحة الهندسة المسارية المحتوية. |
| [get_Segments](./get_segments/)() | إرجاع قائمة مقاطع المسار الفرعية. |
| [get_StartPoint](./get_startpoint/)() const | إرجاع/تعيين نقطة البداية للمقطع الأول من شكل المسار. |
| [set_IsClosed](./set_isclosed/)(bool) | إرجاع/تعيين القيمة التي تشير إلى ما إذا كان شكل المسار مغلقًا. |
| [set_IsFilled](./set_isfilled/)(bool) | إرجاع/تعيين القيمة التي تشير إلى ما إذا كان شكل المسار يُستخدم في حساب مساحة الهندسة المسارية المحتوية. |
| [set_StartPoint](./set_startpoint/)(System::Drawing::PointF) | إرجاع/تعيين نقطة البداية للمقطع الأول من شكل المسار. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | عيّن الوسيط القالب رقم n كإشارة ضعيفة (بدلاً من المشتركة). يسمح بتبديل المؤشرات في الحاويات إلى وضع الضعيفة. |
## انظر أيضًا

* Class [XpsArray](../xpsarray/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
