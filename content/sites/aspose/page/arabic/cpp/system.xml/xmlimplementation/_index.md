---
title: "الفئة System::Xml::XmlImplementation"
linktitle: "XmlImplementation"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::XmlImplementation. تعرف السياق لمجموعة من كائنات XmlDocument في C++."
type: docs
weight: 2000
url: /ar/cpp/system.xml/xmlimplementation/
---
## XmlImplementation class


تعرف السياق لمجموعة من كائنات [XmlDocument](../xmldocument/).

```cpp
class XmlImplementation : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [CreateDocument](./createdocument/)() | ينشئ [XmlDocument](../xmldocument/) جديدًا. |
| [HasFeature](./hasfeature/)(const String\&, const String\&) | يفحص ما إذا كان تنفيذ نموذج كائن المستند (DOM) يدعم ميزة معينة. |
| [XmlImplementation](./xmlimplementation/)() | ينشئ مثيلًا جديدًا من الفئة [XmlImplementation](./). |
| [XmlImplementation](./xmlimplementation/)(const SharedPtr\<XmlNameTable\>\&) | ينشئ مثيلًا جديدًا من الفئة [XmlImplementation](./) مع [XmlNameTable](../xmlnametable/) المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
