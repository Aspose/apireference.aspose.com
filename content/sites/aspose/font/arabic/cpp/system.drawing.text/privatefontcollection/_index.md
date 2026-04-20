---
title: "System::Drawing::Text::PrivateFontCollection class"
linktitle: "PrivateFontCollection"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Text::PrivateFontCollection class. يمثل مجموعة من عائلات الخطوط التي يوفرها تطبيق العميل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.drawing.text/privatefontcollection/
---
## PrivateFontCollection class


يمثل مجموعة من عائلات الخطوط التي يوفرها تطبيق العميل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class PrivateFontCollection : public System::Drawing::Text::FontCollection
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddFont](./addfont/)(const System::ArrayPtr\<uint8_t\>\&, int) | يضيف الخط المحدد إلى المجموعة. |
| [AddFontFile](./addfontfile/)(const String\&) | يضيف خطاً من الملف المحدد إلى المجموعة. |
| [get_Families](./get_families/)() override | يرجع مصفوفة من كائنات [FontFamily](../../system.drawing/fontfamily/) المرتبطة بمجموعة الخطوط التي يمثلها الكائن الحالي. |
## انظر أيضًا

* Class [FontCollection](../fontcollection/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Font for C++](../../)
