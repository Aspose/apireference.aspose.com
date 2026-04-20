---
title: "System::Xml::XmlText فئة"
linktitle: "XmlText"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlText فئة. تمثل محتوى النص لعنصر أو سمة في C++."
type: docs
weight: 3800
url: /ar/cpp/system.xml/xmltext/
---
## XmlText class


يمثل محتوى النص لعنصر أو سمة.

```cpp
class XmlText : public System::Xml::XmlCharacterData
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
| virtual [SplitText](./splittext/)(int32_t) | يقسم العقدة إلى عقدتين عند الإزاحة المحددة، مع الحفاظ على كلتاهما في الشجرة كعقد شقيقة. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ جميع أبناء العقدة إلى [XmlWriter](../xmlwriter/) المحدد. عقد [XmlText](./) لا تحتوي على أبناء، لذا لا تأثير لهذه الطريقة. |
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
