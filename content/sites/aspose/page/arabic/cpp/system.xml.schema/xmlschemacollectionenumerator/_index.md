---
title: "الفئة System::Xml::Schema::XmlSchemaCollectionEnumerator"
linktitle: "XmlSchemaCollectionEnumerator"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaCollectionEnumerator. تدعم تكرارًا بسيطًا على مجموعة. لا يمكن وراثة هذه الفئة في C++."
type: docs
weight: 1600
url: /ar/cpp/system.xml.schema/xmlschemacollectionenumerator/
---
## XmlSchemaCollectionEnumerator class


يدعم تكرارًا بسيطًا على مجموعة. لا يمكن توريث هذه الفئة.

```cpp
class XmlSchemaCollectionEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | ينسخ المتكرر الحالي. |
| [Dispose](./dispose/)() override | لا يفعل شيئًا. |
| [get_Current](./get_current/)() const override | يعيد الـ[XmlSchema](../xmlschema/) الحالي في المجموعة. |
| [MoveNext](./movenext/)() override | يتقدّم المُعدِّد إلى المخطط التالي في المجموعة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
