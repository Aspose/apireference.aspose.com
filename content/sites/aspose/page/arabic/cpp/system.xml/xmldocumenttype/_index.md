---
title: "فئة System::Xml::XmlDocumentType"
linktitle: "XmlDocumentType"
second_title: "Aspose.Page لـ C++"
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
| [get_Entities](./get_entities/)() | يرجع مجموعة من عقد [XmlEntity](../xmlentity/) المعلنة في إعلان نوع المستند. |
| [get_InternalSubset](./get_internalsubset/)() | يرجع قيمة الجزء الداخلي لتعريف نوع المستند (DTD) في إعلان DOCTYPE. |
| [get_IsReadOnly](./get_isreadonly/)() override | يرجع قيمة تشير إلى ما إذا كانت العقدة للقراءة فقط. |
| [get_LocalName](./get_localname/)() override | يرجع الاسم المحلي للعقدة. |
| [get_Name](./get_name/)() override | يرجع الاسم المؤهل للعقدة. |
| [get_NodeType](./get_nodetype/)() override | يرجع نوع العقدة الحالية. |
| [get_Notations](./get_notations/)() | يرجع مجموعة من عقد [XmlNotation](../xmlnotation/) الموجودة في إعلان نوع المستند. |
| [get_PublicId](./get_publicid/)() | يرجع قيمة المعرف العام في إعلان DOCTYPE. |
| [get_SystemId](./get_systemid/)() | يرجع قيمة المعرف النظامي في إعلان DOCTYPE. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ جميع أبناء العقدة إلى [XmlWriter](../xmlwriter/) المحدد. بالنسبة لعقد [XmlDocumentType](./)، لا يؤثر هذا الأسلوب. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ العقدة إلى [XmlWriter](../xmlwriter/) المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
