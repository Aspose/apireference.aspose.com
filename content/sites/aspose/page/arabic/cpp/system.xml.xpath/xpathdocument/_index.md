---
title: "فئة System::Xml::XPath::XPathDocument"
linktitle: "XPathDocument"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::XPath::XPathDocument. توفر تمثيلًا سريعًا، للقراءة فقط، في الذاكرة لوثيقة XML باستخدام نموذج بيانات XPath في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml.xpath/xpathdocument/
---
## XPathDocument class


توفر تمثيلًا سريعًا، للقراءة فقط، في الذاكرة لوثيقة XML باستخدام نموذج بيانات [XPath](../).

```cpp
class XPathDocument : public System::Xml::XPath::IXPathNavigable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CreateNavigator](./createnavigator/)() override | تُهيئ كائنًا للقراءة فقط من نوع [XPathNavigator](../xpathnavigator/) للتنقل عبر العقد في هذا [XPathDocument](./). |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&) | تُهيئ نسخة جديدة من فئة [XPathDocument](./) باستخدام بيانات XML الموجودة في كائن [XmlReader](../../system.xml/xmlreader/) المحدد. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&, XmlSpace) | تُهيئ نسخة جديدة من فئة [XPathDocument](./) باستخدام بيانات XML الموجودة في كائن [XmlReader](../../system.xml/xmlreader/) المحدد مع معالجة الفراغات المحددة. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::TextReader\>\&) | تُهيئ نسخة جديدة من فئة [XPathDocument](./) باستخدام بيانات XML الموجودة في كائن TextReader المحدد. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::Stream\>\&) | تُهيئ نسخة جديدة من فئة [XPathDocument](./) باستخدام بيانات XML الموجودة في كائن Stream المحدد. |
| [XPathDocument](./xpathdocument/)(const String\&) | تُهيئ نسخة جديدة من فئة [XPathDocument](./) باستخدام بيانات XML الموجودة في الملف المحدد. |
| [XPathDocument](./xpathdocument/)(const String\&, XmlSpace) | تُهيئ نسخة جديدة من فئة [XPathDocument](./) باستخدام بيانات XML الموجودة في الملف المحدد مع معالجة الفراغات المحددة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [IXPathNavigable](../ixpathnavigable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
