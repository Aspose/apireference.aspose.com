---
title: "الفئة System::Xml::Schema::ValidationEventArgs"
linktitle: "ValidationEventArgs"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Xml::Schema::ValidationEventArgs. تُرجع معلومات تفصيلية متعلقة بـ ValidationEventHandler في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml.schema/validationeventargs/
---
## ValidationEventArgs class


تُرجع معلومات تفصيلية متعلقة بـ [ValidationEventHandler](../validationeventhandler/).

```cpp
class ValidationEventArgs : public System::EventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Exception](./get_exception/)() | تُرجع [XmlSchemaException](../xmlschemaexception/) المرتبطة بحدث التحقق. |
| [get_Message](./get_message/)() | تُرجع الوصف النصي المقابل لحدث التحقق. |
| [get_Severity](./get_severity/)() | تُرجع شدة حدث التحقق. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل مؤشرًا مشتركًا "فارغ" [EventArgs](../../system/eventargs/) (مؤشر فارغ). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
