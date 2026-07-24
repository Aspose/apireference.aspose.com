---
title: "System::Drawing::Text::PrivateFontCollection فئة"
linktitle: "PrivateFontCollection"
second_title: "Aspose.Page لـ C++"
description: "System::Drawing::Text::PrivateFontCollection فئة. تمثل مجموعة من عائلات الخطوط التي يوفرها تطبيق العميل. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة System::MakeObject(). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.drawing.text/privatefontcollection/
---
## PrivateFontCollection class


تمثل مجموعة من عائلات الخطوط التي يوفرها تطبيق العميل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class PrivateFontCollection : public System::Drawing::Text::FontCollection
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddFont](./addfont/)(const System::ArrayPtr\<uint8_t\>\&, int) | يضيف الخط المحدد إلى المجموعة. |
| [AddFontFile](./addfontfile/)(const String\&) | يضيف خطًا من الملف المحدد إلى المجموعة. |
| [get_Families](./get_families/)() override | يعيد مصفوفة من كائنات [FontFamily](../../system.drawing/fontfamily/) المرتبطة بمجموعة الخطوط التي تمثلها الكائن الحالي. |
## انظر أيضًا

* Class [FontCollection](../fontcollection/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Page for C++](../../)
