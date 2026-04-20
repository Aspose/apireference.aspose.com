---
title: "System::Xml::XPath::XPathDocument class"
linktitle: "XPathDocument"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XPath::XPathDocument class. يوفر تمثيلًا سريعًا للقراءة فقط وفي الذاكرة لمستند XML باستخدام نموذج بيانات XPath في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml.xpath/xpathdocument/
---
## XPathDocument class


يوفر تمثيلًا سريعًا للقراءة فقط وفي الذاكرة لمستند XML باستخدام نموذج بيانات [XPath](../).

```cpp
class XPathDocument : public System::Xml::XPath::IXPathNavigable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CreateNavigator](./createnavigator/)() override | يُهيئ كائنًا للقراءة فقط من نوع [XPathNavigator](../xpathnavigator/) للتنقل عبر العقد في هذا [XPathDocument](./). |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&) | يُهيئ نسخة جديدة من فئة [XPathDocument](./) من بيانات XML الموجودة في كائن [XmlReader](../../system.xml/xmlreader/) المحدد. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&, XmlSpace) | يقوم بتهيئة نسخة جديدة من الفئة [XPathDocument](./) من بيانات XML الموجودة في كائن [XmlReader](../../system.xml/xmlreader/) المحدد مع معالجة المسافات البيضاء المحددة. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::TextReader\>\&) | يقوم بتهيئة نسخة جديدة من الفئة [XPathDocument](./) من بيانات XML الموجودة في كائن TextReader المحدد. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::Stream\>\&) | يقوم بتهيئة نسخة جديدة من الفئة [XPathDocument](./) من بيانات XML في كائن Stream المحدد. |
| [XPathDocument](./xpathdocument/)(const String\&) | يقوم بتهيئة نسخة جديدة من الفئة [XPathDocument](./) من بيانات XML في الملف المحدد. |
| [XPathDocument](./xpathdocument/)(const String\&, XmlSpace) | يقوم بتهيئة نسخة جديدة من الفئة [XPathDocument](./) من بيانات XML في الملف المحدد مع معالجة المسافات البيضاء المحددة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [IXPathNavigable](../ixpathnavigable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
