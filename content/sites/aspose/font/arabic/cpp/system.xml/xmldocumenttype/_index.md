---
title: "فئة System::Xml::XmlDocumentType"
linktitle: "XmlDocumentType"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::XmlDocumentType. تمثل إعلان نوع المستند في C++."
type: docs
weight: 1600
url: /ar/cpp/system.xml/xmldocumenttype/
---
## XmlDocumentType class


يمثل إعلان نوع المستند.

```cpp
class XmlDocumentType : public System::Xml::XmlLinkedNode
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | ينشئ نسخة مكررة من هذه العقدة. |
| [get_Entities](./get_entities/)() | يعيد مجموعة من عقد [XmlEntity](../xmlentity/) المعلنة في تعريف نوع المستند. |
| [get_InternalSubset](./get_internalsubset/)() | يعيد قيمة الجزء الداخلي لتعريف نوع المستند (DTD) في بيان DOCTYPE. |
| [get_IsReadOnly](./get_isreadonly/)() override | يعيد قيمة تشير إلى ما إذا كانت العقدة للقراءة فقط. |
| [get_LocalName](./get_localname/)() override | يعيد الاسم المحلي للعقدة. |
| [get_Name](./get_name/)() override | يعيد الاسم المؤهل للعقدة. |
| [get_NodeType](./get_nodetype/)() override | يعيد نوع العقدة الحالية. |
| [get_Notations](./get_notations/)() | يعيد مجموعة من عقد [XmlNotation](../xmlnotation/) الموجودة في تعريف نوع المستند. |
| [get_PublicId](./get_publicid/)() | يعيد قيمة المعرف العام في بيان DOCTYPE. |
| [get_SystemId](./get_systemid/)() | يعيد قيمة المعرف النظامي في بيان DOCTYPE. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ جميع أبناء العقدة إلى الـ [XmlWriter](../xmlwriter/) المحدد. بالنسبة لعقد [XmlDocumentType](./)، لا يؤثر هذا الأسلوب. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ العقدة إلى [XmlWriter](../xmlwriter/) المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
