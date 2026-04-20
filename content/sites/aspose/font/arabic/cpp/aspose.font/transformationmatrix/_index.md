---
title: "Aspose::Font::TransformationMatrix class"
linktitle: "TransformationMatrix"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::TransformationMatrix class. يمثل مصفوفة تحويل 3x3 | A B 0 | | C D 0 | | TX TY 1 | في C++."
type: docs
weight: 3000
url: /ar/cpp/aspose.font/transformationmatrix/
---
## TransformationMatrix class


يمثل مصفوفة تحويل 3x3 | A B 0 | | C D 0 | | TX TY 1 |.

```cpp
class TransformationMatrix : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_A](./get_a/)() const | يحصل على قيمة A في مصفوفة التحويل. |
| [get_B](./get_b/)() const | يحصل على قيمة B في مصفوفة التحويل. |
| [get_C](./get_c/)() const | يحصل على قيمة C في مصفوفة التحويل. |
| [get_D](./get_d/)() const | يحصل على قيمة D في مصفوفة التحويل. |
| [get_TX](./get_tx/)() const | يحصل على قيمة TX في مصفوفة التحويل. |
| [get_TY](./get_ty/)() const | يحصل على قيمة TY في مصفوفة التحويل. |
| [idx_get](./idx_get/)(int32_t) | يوفر الوصول إلى المصفوفة الأساسية. |
| [Multiply](./multiply/)(const System::SharedPtr\<TransformationMatrix\>\&) | يضرب مع مصفوفة تحويل أخرى. لا يغيّر مصفوفة التحويل الأصلية، ويعيد كائنًا جديدًا من نوع [TransformationMatrix](./). |
| [Scale](./scale/)(double, double, double\&, double\&) | يقوم بتكبير x و y باستخدام مصفوفة التحويل: x1 = A*x + C*y; y1 = B*x + D*y. |
| [set_A](./set_a/)(double) | يضبط قيمة A في مصفوفة التحويل. |
| [set_B](./set_b/)(double) | يضبط قيمة B في مصفوفة التحويل. |
| [set_C](./set_c/)(double) | يضبط قيمة C في مصفوفة التحويل. |
| [set_D](./set_d/)(double) | يضبط قيمة D في مصفوفة التحويل. |
| [set_TX](./set_tx/)(double) | يضبط قيمة TX في مصفوفة التحويل. |
| [set_TY](./set_ty/)(double) | يضبط قيمة TY في مصفوفة التحويل. |
| [ToArray](./toarray/)() | يخصص مصفوفة جديدة، ينسخ مصفوفة التحويل ويعيدها. |
| [Transform](./transform/)(double, double, double\&, double\&) | يحوّل x و y باستخدام مصفوفة التحويل: x1 = A*x + C*y + TX; y1 = B*x + D*y + TY. |
| [TransformationMatrix](./transformationmatrix/)() | ينشئ مصفوفة تحويل قياسية 1 إلى 1: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]. |
| [TransformationMatrix](./transformationmatrix/)(const System::ArrayPtr\<double\>\&) | يقبل مصفوفة تحويل بالتمثيل المصفوفي التالي: [ A B C D TX TY ]. |
| [TransformationMatrix](./transformationmatrix/)(double, double, double, double, double, double) | ينشئ مصفوفة تحويل [ A B C D TX TY ]. |
| [UnScale](./unscale/)(double, double, double\&, double\&) | يقوم بتقليل x1 و y1 ويعيد x و y قبل مصفوفة التحويل. |
| [UnTransform](./untransform/)(double, double, double\&, double\&) | يحول x1 و y1 إلى الخلف ويعيد x و y قبل مصفوفة التحويل. |
## ملاحظات


يحول الإحداثيات بالطريقة التالية: x1 = A*x + C*y + TX; y1 = B*x + D*y + TY.
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
