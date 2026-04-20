---
title: "System::Drawing::Imaging::ColorMatrix class"
linktitle: "ColorMatrix"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Imaging::ColorMatrix class. تمثل مصفوفة 5×5 تحتوي على إحداثيات مساحة اللون RGBAW. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.drawing.imaging/colormatrix/
---
## ColorMatrix class


تمثل مصفوفة 5×5 تحتوي على إحداثيات مساحة اللون RGBAW. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل.

```cpp
class ColorMatrix : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ColorMatrix](./colormatrix/)() | ينشئ نسخة جديدة من فئة [ColorMatrix](./) ويُهيئها بقيم مصفوفة الهوية. |
| [ColorMatrix](./colormatrix/)(const System::ArrayPtr\<System::ArrayPtr\<float\>\>\&) | ينشئ نسخة جديدة من فئة [ColorMatrix](./) ويُهيئها بالقيم المحددة. |
| [get_Matrix00](./get_matrix00/)() const | يعيد قيمة في الصف 0 والعمود 0. |
| [get_Matrix01](./get_matrix01/)() const | يعيد قيمة في الصف 0 والعمود 1. |
| [get_Matrix02](./get_matrix02/)() const | يعيد قيمة في الصف 0 والعمود 2. |
| [get_Matrix03](./get_matrix03/)() const | يعيد قيمة في الصف 0 والعمود 3. |
| [get_Matrix04](./get_matrix04/)() const | يعيد قيمة في الصف 0 والعمود 4. |
| [get_Matrix10](./get_matrix10/)() const | يعيد قيمة في الصف 1 والعمود 0. |
| [get_Matrix11](./get_matrix11/)() const | يعيد قيمة في الصف 1 والعمود 1. |
| [get_Matrix12](./get_matrix12/)() const | يعيد قيمة في الصف 1 والعمود 2. |
| [get_Matrix13](./get_matrix13/)() const | إرجاع قيمة في الصف الأول والعمود الثالث. |
| [get_Matrix14](./get_matrix14/)() const | إرجاع قيمة في الصف الأول والعمود الرابع. |
| [get_Matrix20](./get_matrix20/)() const | إرجاع قيمة في الصف الثاني والعمود صفر. |
| [get_Matrix21](./get_matrix21/)() const | إرجاع قيمة في الصف الثاني والعمود الأول. |
| [get_Matrix22](./get_matrix22/)() const | إرجاع قيمة في الصف الثاني والعمود الثاني. |
| [get_Matrix23](./get_matrix23/)() const | إرجاع قيمة في الصف الثاني والعمود الثالث. |
| [get_Matrix24](./get_matrix24/)() const | إرجاع قيمة في الصف الثاني والعمود الرابع. |
| [get_Matrix30](./get_matrix30/)() const | إرجاع قيمة في الصف الثالث والعمود صفر. |
| [get_Matrix31](./get_matrix31/)() const | إرجاع قيمة في الصف الثالث والعمود الأول. |
| [get_Matrix32](./get_matrix32/)() const | إرجاع قيمة في الصف الثالث والعمود الثاني. |
| [get_Matrix33](./get_matrix33/)() const | إرجاع قيمة في الصف الثالث والعمود الثالث. |
| [get_Matrix34](./get_matrix34/)() const | إرجاع قيمة في الصف الثالث والعمود الرابع. |
| [get_Matrix40](./get_matrix40/)() const | إرجاع قيمة في الصف الرابع والعمود صفر. |
| [get_Matrix41](./get_matrix41/)() const | إرجاع قيمة في الصف الرابع والعمود الأول. |
| [get_Matrix42](./get_matrix42/)() const | إرجاع قيمة في الصف الرابع والعمود الثاني. |
| [get_Matrix43](./get_matrix43/)() const | إرجاع قيمة في الصف الرابع والعمود الثالث. |
| [get_Matrix44](./get_matrix44/)() const | إرجاع قيمة في الصف الرابع والعمود الرابع. |
| [idx_get](./idx_get/)(int, int) | إرجاع قيمة في الصف والعمود المحددين. |
| [idx_set](./idx_set/)(int, int, float) | يضبط القيمة المحددة في الموقع المحدد في المصفوفة. |
| [set_Matrix00](./set_matrix00/)(float) | يضبط قيمة في الصف صفر والعمود صفر. |
| [set_Matrix01](./set_matrix01/)(float) | يضبط قيمة في الصف صفر والعمود الأول. |
| [set_Matrix02](./set_matrix02/)(float) | يضبط قيمة في الصف صفر والعمود الثاني. |
| [set_Matrix03](./set_matrix03/)(float) | يضبط قيمة في الصف صفر والعمود الثالث. |
| [set_Matrix04](./set_matrix04/)(float) | يضبط قيمة في الصف صفر والعمود الرابع. |
| [set_Matrix10](./set_matrix10/)(float) | يضبط قيمة في الصف الأول والعمود صفر. |
| [set_Matrix11](./set_matrix11/)(float) | يضبط قيمة في الصف 1-st والعمود 1-st. |
| [set_Matrix12](./set_matrix12/)(float) | يضبط قيمة في الصف 1-st والعمود 2-nd. |
| [set_Matrix13](./set_matrix13/)(float) | يضبط قيمة في الصف 1-st والعمود 3-rd. |
| [set_Matrix14](./set_matrix14/)(float) | يضبط قيمة في الصف 1-st والعمود 4-th. |
| [set_Matrix20](./set_matrix20/)(float) | يضبط قيمة في الصف 2-nd والعمود 0-th. |
| [set_Matrix21](./set_matrix21/)(float) | يضبط قيمة في الصف 2-nd والعمود 1-st. |
| [set_Matrix22](./set_matrix22/)(float) | يضبط قيمة في الصف 2-nd والعمود 2-nd. |
| [set_Matrix23](./set_matrix23/)(float) | يضبط قيمة في الصف 2-nd والعمود 3-rd. |
| [set_Matrix24](./set_matrix24/)(float) | يضبط قيمة في الصف 2-nd والعمود 4-th. |
| [set_Matrix30](./set_matrix30/)(float) | يضبط قيمة في الصف 3-rd والعمود 0-th. |
| [set_Matrix31](./set_matrix31/)(float) | يضبط قيمة في الصف 3-rd والعمود 1-st. |
| [set_Matrix32](./set_matrix32/)(float) | يضبط قيمة في الصف 3-rd والعمود 2-nd. |
| [set_Matrix33](./set_matrix33/)(float) | يضبط قيمة في الصف 3-rd والعمود 3-rd. |
| [set_Matrix34](./set_matrix34/)(float) | يضبط قيمة في الصف 3-rd والعمود 4-th. |
| [set_Matrix40](./set_matrix40/)(float) | يضبط قيمة في الصف 4-th والعمود 0-th. |
| [set_Matrix41](./set_matrix41/)(float) | يضبط قيمة في الصف 4-th والعمود 1-st. |
| [set_Matrix42](./set_matrix42/)(float) | يضبط قيمة في الصف 4-th والعمود 2-nd. |
| [set_Matrix43](./set_matrix43/)(float) | يضبط قيمة في الصف 4-th والعمود 3-rd. |
| [set_Matrix44](./set_matrix44/)(float) | يضبط قيمة في الصف 4-th والعمود 4-th. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
