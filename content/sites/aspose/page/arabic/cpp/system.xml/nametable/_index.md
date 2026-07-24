---
title: "System::Xml::NameTable فئة"
linktitle: "NameTable"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::NameTable فئة. تُنفّذ XmlNameTable أحادي الخيط في C++."
type: docs
weight: 500
url: /ar/cpp/system.xml/nametable/
---
## NameTable class


تنفّذ [XmlNameTable](../xmlnametable/) أحادي الخيط.

```cpp
class NameTable : public System::Xml::XmlNameTable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const String\&) override | يُجزيء السلسلة المحددة ويضيفها إلى [NameTable](./). |
| [Add](./add/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | يُجزيء السلسلة المحددة ويضيفها إلى [NameTable](./). |
| [Get](./get/)(const String\&) override | يُرجع السلسلة المُجزيئة بالقيمة المحددة. |
| [Get](./get/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | يعيد السلسلة المذابة التي تحتوي على نفس الأحرف كما في النطاق المحدد من الأحرف في المصفوفة المعطاة. |
| [NameTable](./nametable/)() | يُهيئ نسخة جديدة من الفئة [NameTable](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlNameTable](../xmlnametable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
