---
title: "Aspose::Page::XPS::XpsModel::XpsPath فئة"
linktitle: "XpsPath"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsModel::XpsPath فئة. فئة تُجَمِّع ميزات عنصر المسار. هذا العنصر هو الوسيلة الوحيدة لإضافة الرسومات المتجهية والصور إلى صفحة ثابتة. يعرّف رسمًا متجهًا واحدًا ليتم عرضه على صفحة في C++."
type: docs
weight: 3000
url: /ar/cpp/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class


فئة تُغلف ميزات عنصر Path. هذا العنصر هو الوسيلة الوحيدة لإضافة رسومات متجهية وصور إلى صفحة ثابتة. يحدد رسماً متجهياً واحداً لتصييره على صفحة.

```cpp
class XpsPath : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() | ينسخ هذا المسار. |
| [get_Data](./get_data/)() | إرجاع/تعيين هندسة المسار. |
| [get_Fill](./get_fill/)() | إرجاع/تعيين الفرشاة المستخدمة لطلاء الهندسة المحددة بخصيصة Data للمسار. |
| [get_Stroke](./get_stroke/)() | إرجاع/تعيين الفرشاة المستخدمة لرسم الحد. |
| [get_StrokeDashArray](./get_strokedasharray/)() const | إرجاع/تعيين المصفوفة التي تحدد طول الشرطات والفواصل للحد الخارجي. |
| [get_StrokeDashCap](./get_strokedashcap/)() const | إرجاع/تعيين القيمة التي تحدد كيفية رسم نهايات كل شرطة. |
| [get_StrokeDashOffset](./get_strokedashoffset/)() const | إرجاع/تعيين نقطة البدء لتكرار نمط مصفوفة الشرطات. إذا تم حذف هذه القيمة، فإن مصفوفة الشرطات تُحاذى مع أصل الحد. |
| [get_StrokeEndLineCap](./get_strokeendlinecap/)() const | إرجاع/تعيين القيمة التي تحدد شكل نهاية آخر شرطة في الحد. |
| [get_StrokeLineJoin](./get_strokelinejoin/)() const | إرجاع/تعيين القيمة التي تحدد شكل بداية أول شرطة في الحد. |
| [get_StrokeMiterLimit](./get_strokemiterlimit/)() const | إرجاع/تعيين النسبة بين الحد الأقصى لطول الميتر والنصف من سمك الحد. هذه القيمة ذات أهمية فقط إذا كانت خاصية **StrokeLineJoin** تحدد **Miter**. |
| [get_StrokeStartLineCap](./get_strokestartlinecap/)() const | إرجاع/تعيين القيمة التي تحدد شكل بداية أول شرطة في الحد. |
| [get_StrokeThickness](./get_strokethickness/)() const | إرجاع/تعيين سمك الحد، بوحدات مساحة الإحداثيات الفعّالة (تشمل تحويل العرض للمسار). يتم رسم الحد فوق حدود الهندسة المحددة بخصيصة Data لعنصر Path. نصف قيمة StrokeThickness يمتد خارج الهندسة المحددة بخصيصة Data والنصف الآخر يمتد داخل الهندسة. |
| [set_Data](./set_data/)(System::SharedPtr\<XpsPathGeometry\>) | إرجاع/تعيين هندسة المسار. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | إرجاع/تعيين الفرشاة المستخدمة لطلاء الهندسة المحددة بخصيصة Data للمسار. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<XpsBrush\>) | إرجاع/تعيين الفرشاة المستخدمة لرسم الحد. |
| [set_StrokeDashArray](./set_strokedasharray/)(System::ArrayPtr\<float\>) | إرجاع/تعيين المصفوفة التي تحدد طول الشرطات والفواصل للحد الخارجي. |
| [set_StrokeDashCap](./set_strokedashcap/)(XpsDashCap) | إرجاع/تعيين القيمة التي تحدد كيفية رسم نهايات كل شرطة. |
| [set_StrokeDashOffset](./set_strokedashoffset/)(float) | إرجاع/تعيين نقطة البدء لتكرار نمط مصفوفة الشرطات. إذا تم حذف هذه القيمة، فإن مصفوفة الشرطات تُحاذى مع أصل الحد. |
| [set_StrokeEndLineCap](./set_strokeendlinecap/)(XpsLineCap) | إرجاع/تعيين القيمة التي تحدد شكل نهاية آخر شرطة في الحد. |
| [set_StrokeLineJoin](./set_strokelinejoin/)(XpsLineJoin) | إرجاع/تعيين القيمة التي تحدد شكل بداية أول شرطة في الحد. |
| [set_StrokeMiterLimit](./set_strokemiterlimit/)(float) | إرجاع/تعيين النسبة بين الحد الأقصى لطول الميتر والنصف من سمك الحد. هذه القيمة ذات أهمية فقط إذا كانت خاصية **StrokeLineJoin** تحدد **Miter**. |
| [set_StrokeStartLineCap](./set_strokestartlinecap/)(XpsLineCap) | إرجاع/تعيين القيمة التي تحدد شكل بداية أول شرطة في الحد. |
| [set_StrokeThickness](./set_strokethickness/)(float) | إرجاع/تعيين سمك الحد، بوحدات مساحة الإحداثيات الفعّالة (تشمل تحويل العرض للمسار). يتم رسم الحد فوق حدود الهندسة المحددة بخصيصة Data لعنصر Path. نصف قيمة StrokeThickness يمتد خارج الهندسة المحددة بخصيصة Data والنصف الآخر يمتد داخل الهندسة. |
## انظر أيضًا

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
