---
title: "الفئة System::Xml::Xsl::XslTransform"
linktitle: "XslTransform"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Xml::Xsl::XslTransform. تحول بيانات XML باستخدام ورقة أنماط لغة الأنماط القابلة للتوسيع للتحويلات (XSLT) في C++."
type: docs
weight: 700
url: /ar/cpp/system.xml.xsl/xsltransform/
---
## XslTransform class


يحوّل بيانات XML باستخدام ورقة أنماط لغة الأنماط القابلة للامتداد للتحويلات (XSLT).

```cpp
class XslTransform : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | يقوم بتحميل ورقة الأنماط XSLT الموجودة في [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يقوم بتحميل ورقة الأنماط XSLT الموجودة في [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | يقوم بتحميل ورقة الأنماط XSLT الموجودة في IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يقوم بتحميل ورقة الأنماط XSLT الموجودة في IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) | يقوم بتحميل ورقة الأنماط XSLT الموجودة في XPathNavigator. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يقوم بتحميل ورقة الأنماط XSLT الموجودة في XPathNavigator. |
| [Load](./load/)(const String\&) | يقوم بتحميل ورقة الأنماط XSLT المحددة بواسطة عنوان URL. |
| [Load](./load/)(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يقوم بتحميل ورقة الأنماط XSLT المحددة بواسطة عنوان URL. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | يضبط [XmlResolver](../../system.xml/xmlresolver/) المستخدم لحل الموارد الخارجية عند استدعاء طريقة [XslTransform::Transform](./transform/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحوّل بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) | يحوّل بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحوّل بيانات XML في XPathNavigator باستخدام الوسائط المحددة ويخرج النتيجة إلى [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | يحوّل بيانات XML في XPathNavigator باستخدام الوسائط المحددة ويخرج النتيجة إلى [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحوّل بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | يحوّل بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحوّل بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | يحوّل بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحوّل بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) | يحوّل بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحوّل بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | يحوّل بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحوّل بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | يحوّل بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحوّل بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | يحوّل بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحوّل بيانات XML في ملف الإدخال ويخرج النتيجة إلى ملف الإخراج. |
| [Transform](./transform/)(const String\&, const String\&) | يحوّل بيانات XML في ملف الإدخال ويخرج النتيجة إلى ملف الإخراج. |
| [XslTransform](./xsltransform/)() | ينشئ نسخة جديدة من الفئة [XslTransform](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
