---
title: "فئة System::Xml::XmlImplementation"
linktitle: "XmlImplementation"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::XmlImplementation. تُعرّف السياق لمجموعة من كائنات XmlDocument في C++."
type: docs
weight: 2000
url: /ar/cpp/system.xml/xmlimplementation/
---
## XmlImplementation class


تُعرّف السياق لمجموعة من كائنات [XmlDocument](../xmldocument/).

```cpp
class XmlImplementation : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [CreateDocument](./createdocument/)() | ينشئ [XmlDocument](../xmldocument/) جديدًا. |
| [HasFeature](./hasfeature/)(const String\&, const String\&) | يختبر ما إذا كان تنفيذ نموذج كائن الوثيقة [Object](../../system/object/) (DOM) يدعم ميزة محددة. |
| [XmlImplementation](./xmlimplementation/)() | ينشئ مثيلاً جديدًا من الفئة [XmlImplementation](./). |
| [XmlImplementation](./xmlimplementation/)(const SharedPtr\<XmlNameTable\>\&) | ينشئ مثيلاً جديدًا من الفئة [XmlImplementation](./) مع تحديد [XmlNameTable](../xmlnametable/). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
