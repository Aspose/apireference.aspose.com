---
title: "Aspose::Page::XPS::XpsModel::XpsMatrix فئة"
linktitle: "XpsMatrix"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsModel::XpsMatrix فئة. فئة تُجَمِّع ميزات عنصر خاصية MatrixTransform. يُعرّف هذا العنصر تحويل مصفوفة إقليدية عشوائي يُستخدم لتعديل أنظمة إحداثيات العناصر في C++."
type: docs
weight: 2600
url: /ar/cpp/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class


فئة تُغلف ميزات عنصر خاصية MatrixTransform. يُعرّف هذا العنصر تحويل مصفوفة إقليدية عشوائية يُستخدم لتعديل أنظمة إحداثيات العناصر.

```cpp
class XpsMatrix : public Aspose::Page::XPS::XpsModel::XpsObject
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() | ينسخ هذه المصفوفة التحويلية. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | يحدد ما إذا كان [System::Object](../../system/object/) المحدد يساوي هذه الحالة. |
| static [Equals](./equals/)(System::SharedPtr\<XpsMatrix\>, System::SharedPtr\<XpsMatrix\>) | التنفيذ الفعلي. |
| [get_IsIdentity](./get_isidentity/)() | يحصل على قيمة تشير إلى ما إذا كانت هذه الحالة مصفوفة هوية. |
| [get_M11](./get_m11/)() | يحصل على العنصر M11. |
| [get_M12](./get_m12/)() | يحصل على العنصر M12. |
| [get_M21](./get_m21/)() | يحصل على العنصر M21. |
| [get_M22](./get_m22/)() | يحصل على العنصر M22. |
| [get_M31](./get_m31/)() | يحصل على العنصر M31. |
| [get_M32](./get_m32/)() | يحصل على العنصر M32. |
| [GetHashCode](./gethashcode/)() const override | يعيد رمز تجزئة لهذه الحالة. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Drawing2D::MatrixOrder) | يضرب هذه المصفوفة بالمصفوفة المحددة بواسطة *matrix* وفقًا للترتيب المحدد بواسطة *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | يضرب هذه المصفوفة بالمصفوفة المحددة بواسطة *matrix*  بترتيب الافتراضي (Prepend). |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>, System::Drawing::Drawing2D::MatrixOrder) | يضرب هذه المصفوفة بالمصفوفة المحددة بواسطة *matrix* وفقًا للترتيب المحدد بواسطة *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>) | يضرب هذه المصفوفة بالمصفوفة المحددة بواسطة *matrix*  بترتيب الافتراضي (Prepend). |
| [Reset](./reset/)() | يعيد تعيين هذه المصفوفة إلى مصفوفة الهوية. |
| [Rotate](./rotate/)(float, System::Drawing::Drawing2D::MatrixOrder) | يطبق دورانًا باتجاه عقارب الساعة بمقدار *angle*  على هذه المصفوفة بالترتيب المحدد بواسطة *matrixOrder* . |
| [Rotate](./rotate/)(float) | يطبق دورانًا باتجاه عقارب الساعة بمقدار *angle*  على هذه المصفوفة بترتيب الافتراضي (Prepend). |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF, System::Drawing::Drawing2D::MatrixOrder) | يطبق دورانًا باتجاه عقارب الساعة بمقدار *angle*  حول *pivot*  على هذه المصفوفة بالترتيب المحدد بواسطة *matrixOrder* . |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF) | يطبق دورانًا باتجاه عقارب الساعة بمقدار *angle*  حول *pivot*  على هذه المصفوفة بترتيب الافتراضي (Prepend). |
| [Scale](./scale/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | يطبق متجه القياس المحدد (scaleX و scaleY) على هذه المصفوفة بالترتيب المحدد بواسطة *matrixOrder* . |
| [Scale](./scale/)(float, float) | يطبق متجه القياس المحدد (scaleX و scaleY) على هذه المصفوفة بترتيب الافتراضي (Prepend). |
| [Skew](./skew/)(double, double) | يطبق التحويل المائل المحدد على هذه المصفوفة. |
| [ToString](./tostring/)() const override | يعيد تمثيل النص لهذه الحالة من [XpsMatrix](./). |
| [Transform](./transform/)(System::Drawing::RectangleF) | يطبق التحويل المتجانس الممثل بهذه المصفوفة على مستطيل محدد. |
| [TransformPoint](./transformpoint/)(System::Drawing::PointF) | يطبق التحويل المتجانس الممثل بهذه المصفوفة على نقطة محددة. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>, int32_t, int32_t) | يطبق التحويل المتجانس الممثل بهذه المصفوفة على جزء محدد من مصفوفة النقاط. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>) | يطبق التحويل المتجانس الممثل بهذه المصفوفة على مصفوفة نقاط محددة. |
| [Translate](./translate/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | يطبق متجه الإزاحة المحدد على هذه المصفوفة بالترتيب المحدد بواسطة *matrixOrder* . |
| [Translate](./translate/)(float, float) | يطبق متجه الإزاحة المحدد على هذه المصفوفة. |
## انظر أيضًا

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
