---
title: "System::Xml::Schema::ValidationEventArgs class"
linktitle: "ValidationEventArgs"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::ValidationEventArgs class. يعيد معلومات تفصيلية متعلقة بـ ValidationEventHandler في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml.schema/validationeventargs/
---
## ValidationEventArgs class


يعيد معلومات تفصيلية متعلقة بـ [ValidationEventHandler](../validationeventhandler/).

```cpp
class ValidationEventArgs : public System::EventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Exception](./get_exception/)() | يعيد [XmlSchemaException](../xmlschemaexception/) المرتبط بحدث التحقق. |
| [get_Message](./get_message/)() | يعيد الوصف النصي المقابل لحدث التحقق. |
| [get_Severity](./get_severity/)() | يعيد شدة حدث التحقق. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل [EventArgs](../../system/eventargs/) مؤشرًا مشتركًا "فارغًا" (null-pointer). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
