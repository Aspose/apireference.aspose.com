---
title: "System::Xml::Xsl::XslTransform class"
linktitle: "XslTransform"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Xsl::XslTransform class. يحول بيانات XML باستخدام ورقة نمط لغة الأنماط القابلة للتوسيع للتحويلات (XSLT) في C++."
type: docs
weight: 700
url: /ar/cpp/system.xml.xsl/xsltransform/
---
## XslTransform class


يحوّل بيانات XML باستخدام ورقة أنماط لغة الأنماط القابلة للتمدد للتحويل (XSLT).

```cpp
class XslTransform : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | يقوم بتحميل ورقة نمط XSLT الموجودة في [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يقوم بتحميل ورقة نمط XSLT الموجودة في [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | يقوم بتحميل ورقة نمط XSLT الموجودة في IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يقوم بتحميل ورقة نمط XSLT الموجودة في IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) | يقوم بتحميل ورقة نمط XSLT الموجودة في XPathNavigator. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يقوم بتحميل ورقة نمط XSLT الموجودة في XPathNavigator. |
| [Load](./load/)(const String\&) | يقوم بتحميل ورقة نمط XSLT المحددة بواسطة عنوان URL. |
| [Load](./load/)(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يقوم بتحميل ورقة نمط XSLT المحددة بواسطة عنوان URL. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | يضبط [XmlResolver](../../system.xml/xmlresolver/) المستخدم لحل الموارد الخارجية عندما يتم استدعاء طريقة [XslTransform::Transform](./transform/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحول بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) | يحول بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحول بيانات XML في XPathNavigator باستخدام args المحددة ويخرج النتيجة إلى [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | يحول بيانات XML في XPathNavigator باستخدام args المحددة ويخرج النتيجة إلى [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحول بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | يحول بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحول بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | يحول بيانات XML في XPathNavigator باستخدام **args** المحددة ويخرج النتيجة إلى TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحول بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) | يحول بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحول بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | يحول بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحول بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | يحول بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحول بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | يحول بيانات XML في IXPathNavigable باستخدام **args** المحددة ويخرج النتيجة إلى [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | يحول بيانات XML في ملف الإدخال ويخرج النتيجة إلى ملف الإخراج. |
| [Transform](./transform/)(const String\&, const String\&) | يحول بيانات XML في ملف الإدخال ويخرج النتيجة إلى ملف الإخراج. |
| [XslTransform](./xsltransform/)() | ينشئ مثيلاً جديداً من الفئة [XslTransform](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
