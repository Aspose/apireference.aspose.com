---
title: "فئة System::Xml::XmlSignificantWhitespace"
linktitle: "XmlSignificantWhitespace"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::XmlSignificantWhitespace. تمثل المسافة البيضاء بين العلامات في عقدة محتوى مختلط أو المسافة البيضاء داخل نطاق xml:space=''preserve''. يُشار إلى ذلك أيضًا كمسافة بيضاء ذات أهمية في C++."
type: docs
weight: 3700
url: /ar/cpp/system.xml/xmlsignificantwhitespace/
---
## XmlSignificantWhitespace class


يمثل مساحة بيضاء بين العلامات في عقدة محتوى مختلط أو مساحة بيضاء داخل نطاق **xml:space='preserve'**. يُشار إلى ذلك أيضًا على أنه مساحة بيضاء ذات دلالة.

```cpp
class XmlSignificantWhitespace : public System::Xml::XmlCharacterData
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | ينشئ نسخة مكررة من هذه العقدة. |
| [get_LocalName](./get_localname/)() override | يرجع الاسم المحلي للعقدة. |
| [get_Name](./get_name/)() override | يرجع الاسم المؤهل للعقدة. |
| [get_NodeType](./get_nodetype/)() override | يرجع نوع العقدة الحالية. |
| [get_PreviousText](./get_previoustext/)() override | يرجع عقدة النص التي تسبق هذه العقدة مباشرةً. |
| [get_Value](./get_value/)() override | يرجع قيمة العقدة. |
| [set_Value](./set_value/)(String) override | يضبط قيمة العقدة. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ جميع أبناء العقدة إلى [XmlWriter](../xmlwriter/) المحدد. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ العقدة إلى [XmlWriter](../xmlwriter/) المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
