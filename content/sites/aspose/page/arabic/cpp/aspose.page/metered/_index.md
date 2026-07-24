---
title: "Aspose::Page::Metered فئة"
linktitle: "Metered"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::Metered فئة. توفر طرقًا لتعيين المفتاح المقاس في C++."
type: docs
weight: 1400
url: /ar/cpp/aspose.page/metered/
---
## Metered class


توفر طرقًا لتعيين المفتاح القابل للقياس.

```cpp
class Metered : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [GetConsumptionCredit](./getconsumptioncredit/)() | يحصل على رصيد الاستهلاك. |
| static [GetConsumptionQuantity](./getconsumptionquantity/)() | يحصل على حجم ملف الاستهلاك. |
| [Metered](./metered/)() | يُنشئ نسخة جديدة من هذه الفئة. |
| [SetMeteredKey](./setmeteredkey/)(System::String, System::String) | يحدد المفتاح العام والخاص المقاس. إذا قمت بشراء ترخيص مقاس، عند بدء التطبيق يجب استدعاء هذه API، عادةً يكون ذلك كافيًا. ومع ذلك، إذا فشل دائمًا تحميل بيانات الاستهلاك وتجاوز 24 ساعة، سيتم ضبط الترخيص إلى حالة التقييم؛ لتجنب هذه الحالة، يجب عليك فحص حالة الترخيص بانتظام، إذا كانت حالة التقييم، استدعِ هذه API مرة أخرى. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
