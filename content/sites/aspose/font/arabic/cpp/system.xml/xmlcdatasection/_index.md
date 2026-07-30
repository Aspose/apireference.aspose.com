---
title: "System::Xml::XmlCDataSection فئة"
linktitle: "XmlCDataSection"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::XmlCDataSection. تمثل قسم CDATA في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml/xmlcdatasection/
---
## XmlCDataSection class


يمثل قسم CDATA.

```cpp
class XmlCDataSection : public System::Xml::XmlCharacterData
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | ينشئ نسخة مكررة من هذه العقدة. |
| [get_LocalName](./get_localname/)() override | يعيد الاسم المحلي للعقدة. |
| [get_Name](./get_name/)() override | يعيد الاسم المؤهل للعقدة. |
| [get_NodeType](./get_nodetype/)() override | يعيد نوع العقدة الحالية. |
| [get_PreviousText](./get_previoustext/)() override | يعيد عقدة النص التي تسبق هذه العقدة مباشرةً. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ أبناء العقدة إلى [XmlWriter](../xmlwriter/) المحدد. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ العقدة إلى [XmlWriter](../xmlwriter/) المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
