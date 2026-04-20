---
title: "فئة System::Xml::Schema::XmlSchemaObjectEnumerator"
linktitle: "XmlSchemaObjectEnumerator"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::Schema::XmlSchemaObjectEnumerator. تمثل المُعدِّد لمجموعة XmlSchemaObjectCollection في C++."
type: docs
weight: 5200
url: /ar/cpp/system.xml.schema/xmlschemaobjectenumerator/
---
## XmlSchemaObjectEnumerator class


تمثل المُعدِّد لمجموعة [XmlSchemaObjectCollection](../xmlschemaobjectcollection/).

```cpp
class XmlSchemaObjectEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | ينسخ المكرِّر الحالي. |
| [Dispose](./dispose/)() override | لا يفعل شيئًا. |
| [get_Current](./get_current/)() const override | يعيد كائن [XmlSchemaObject](../xmlschemaobject/) الحالي في المجموعة. |
| [MoveNext](./movenext/)() override | ينتقل إلى العنصر التالي في المجموعة. |
| [Reset](./reset/)() override | يعيد ضبط المُعدِّد إلى بداية المجموعة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
