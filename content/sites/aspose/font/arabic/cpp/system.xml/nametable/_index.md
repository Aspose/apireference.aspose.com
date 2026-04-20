---
title: "فئة System::Xml::NameTable"
linktitle: "NameTable"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::NameTable. تُنفّذ XmlNameTable أحادي الخيط في C++."
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
| [Get](./get/)(const String\&) override | تُرجع السلسلة المجزأة بالقيمة المحددة. |
| [Get](./get/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | تُرجع السلسلة المجزأة التي تحتوي على نفس الأحرف كما في النطاق المحدد من الأحرف في المصفوفة المعطاة. |
| [NameTable](./nametable/)() | يُنشئ مثيلاً جديداً من فئة [NameTable](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlNameTable](../xmlnametable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
