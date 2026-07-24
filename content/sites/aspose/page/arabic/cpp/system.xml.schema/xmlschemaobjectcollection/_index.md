---
title: "الفئة System::Xml::Schema::XmlSchemaObjectCollection"
linktitle: "XmlSchemaObjectCollection"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaObjectCollection. مجموعة من XmlSchemaObjects في C++."
type: docs
weight: 5100
url: /ar/cpp/system.xml.schema/xmlschemaobjectcollection/
---
## XmlSchemaObjectCollection class


مجموعة من XmlSchemaObjects.

```cpp
class XmlSchemaObjectCollection : public System::Collections::CollectionBase<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const SharedPtr\<XmlSchemaObject\>\&) | يضيف [XmlSchemaObject](../xmlschemaobject/) إلى [XmlSchemaObjectCollection](./). |
| [Contains](./contains/)(const SharedPtr\<XmlSchemaObject\>\&) | يشير إلى ما إذا كان [XmlSchemaObject](../xmlschemaobject/) المحدد موجوداً في [XmlSchemaObjectCollection](./). |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchemaObject\>\>\&, int32_t) | ينسخ جميع XmlSchemaObjects من المجموعة إلى المصفوفة المعطاة، بدءاً من الفهرس المحدد. |
| [GetEnumerator](./getenumerator/)() override | يعيد عدّاداً للتنقل عبر XmlSchemaObjects الموجودة في [XmlSchemaObjectCollection](./). |
| virtual [idx_get](./idx_get/)(int32_t) | يعيد [XmlSchemaObject](../xmlschemaobject/) عند الفهرس المحدد. |
| virtual [idx_set](./idx_set/)(int32_t, SharedPtr\<XmlSchemaObject\>) | يضبط [XmlSchemaObject](../xmlschemaobject/) عند الفهرس المحدد. |
| [IndexOf](./indexof/)(const SharedPtr\<XmlSchemaObject\>\&) | يعيد فهرس المجموعة المقابل لـ [XmlSchemaObject](../xmlschemaobject/) المحدد. |
| [Insert](./insert/)(int32_t, const SharedPtr\<XmlSchemaObject\>\&) | يدرج [XmlSchemaObject](../xmlschemaobject/) إلى [XmlSchemaObjectCollection](./). |
| [Remove](./remove/)(const SharedPtr\<XmlSchemaObject\>\&) | يزيل [XmlSchemaObject](../xmlschemaobject/) من [XmlSchemaObjectCollection](./). |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | عيّن الوسيط القالب رقم n كإشارة ضعيفة (بدلاً من المشتركة). يسمح بتبديل المؤشرات في الحاويات إلى وضع الضعيفة. |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)() | ينشئ مثيلاً جديداً من الفئة [XmlSchemaObjectCollection](./). |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)(const SharedPtr\<XmlSchemaObject\>\&) | ينشئ مثيلاً جديداً من الفئة [XmlSchemaObjectCollection](./) التي تستقبل [XmlSchemaObject](../xmlschemaobject/). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [CollectionBase](../../system.collections/collectionbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
