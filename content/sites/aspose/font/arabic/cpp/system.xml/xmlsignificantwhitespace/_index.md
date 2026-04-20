---
title: "فئة System::Xml::XmlSignificantWhitespace"
linktitle: "XmlSignificantWhitespace"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::XmlSignificantWhitespace. تمثل المسافة البيضاء بين العلامات في عقدة محتوى مختلط أو المسافة البيضاء داخل نطاق xml:space=''preserve''. يُشار إلى ذلك أيضًا كمسافة بيضاء ذات دلالة في C++."
type: docs
weight: 3700
url: /ar/cpp/system.xml/xmlsignificantwhitespace/
---
## XmlSignificantWhitespace class


يمثل مسافات بيضاء بين العلامات في عقدة محتوى مختلط أو مسافات بيضاء داخل نطاق **xml:space='preserve'**. يُشار إلى ذلك أيضًا على أنه مسافات بيضاء ذات دلالة.

```cpp
class XmlSignificantWhitespace : public System::Xml::XmlCharacterData
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | ينشئ نسخة مكررة من هذه العقدة. |
| [get_LocalName](./get_localname/)() override | يعيد الاسم المحلي للعقدة. |
| [get_Name](./get_name/)() override | يعيد الاسم المؤهل للعقدة. |
| [get_NodeType](./get_nodetype/)() override | يعيد نوع العقدة الحالية. |
| [get_PreviousText](./get_previoustext/)() override | يعيد عقدة النص التي تسبق هذه العقدة مباشرةً. |
| [get_Value](./get_value/)() override | يعيد قيمة العقدة. |
| [set_Value](./set_value/)(String) override | يضبط قيمة العقدة. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ جميع أبناء العقدة إلى [XmlWriter](../xmlwriter/) المحدد. |
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
