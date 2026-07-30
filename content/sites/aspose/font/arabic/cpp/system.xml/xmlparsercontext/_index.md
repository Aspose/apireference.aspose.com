---
title: "فئة System::Xml::XmlParserContext"
linktitle: "XmlParserContext"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::XmlParserContext. تُوفر جميع معلومات السياق المطلوبة من قبل XmlReader لتحليل مقطع XML في C++."
type: docs
weight: 3000
url: /ar/cpp/system.xml/xmlparsercontext/
---
## XmlParserContext class


توفر جميع معلومات السياق المطلوبة من قبل [XmlReader](../xmlreader/) لتحليل مقطع XML.

```cpp
class XmlParserContext : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_BaseURI](./get_baseuri/)() | يعيد عنوان URI الأساسي. |
| [get_DocTypeName](./get_doctypename/)() | يعيد اسم إعلان نوع المستند. |
| [get_Encoding](./get_encoding/)() | يعيد نوع الترميز. |
| [get_InternalSubset](./get_internalsubset/)() | يعيد مجموعة DTD الداخلية. |
| [get_NamespaceManager](./get_namespacemanager/)() | يعيد [XmlNamespaceManager](../xmlnamespacemanager/). |
| [get_NameTable](./get_nametable/)() | يعيد [XmlNameTable](../xmlnametable/) المستخدم لتجزيء السلاسل. لمزيد من المعلومات حول السلاسل المجزأة، راجع [XmlNameTable](../xmlnametable/). |
| [get_PublicId](./get_publicid/)() | يعيد المعرف العام. |
| [get_SystemId](./get_systemid/)() | يعيد المعرف النظامي. |
| [get_XmlLang](./get_xmllang/)() | يعيد نطاق **xml:lang** الحالي. |
| [get_XmlSpace](./get_xmlspace/)() | يعيد نطاق **xml:space** الحالي. |
| [set_BaseURI](./set_baseuri/)(const String\&) | يضبط عنوان URI الأساسي. |
| [set_DocTypeName](./set_doctypename/)(const String\&) | يضبط اسم إعلان نوع المستند. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | يضبط نوع الترميز. |
| [set_InternalSubset](./set_internalsubset/)(const String\&) | يضبط مجموعة DTD الداخلية. |
| [set_NamespaceManager](./set_namespacemanager/)(const SharedPtr\<XmlNamespaceManager\>\&) | يضبط الـ [XmlNamespaceManager](../xmlnamespacemanager/). |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | يضبط الـ [XmlNameTable](../xmlnametable/) المستخدم لتجزيء السلاسل. لمزيد من المعلومات حول السلاسل المجزأة، راجع [XmlNameTable](../xmlnametable/). |
| [set_PublicId](./set_publicid/)(const String\&) | يضبط المعرف العام. |
| [set_SystemId](./set_systemid/)(const String\&) | يضبط معرف النظام. |
| [set_XmlLang](./set_xmllang/)(const String\&) | يضبط نطاق **xml:lang** الحالي. |
| [set_XmlSpace](./set_xmlspace/)(System::Xml::XmlSpace) | يضبط نطاق **xml:space** الحالي. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) | ينشئ مثيلاً جديداً من الفئة [XmlParserContext](./) مع [XmlNameTable](../xmlnametable/) و[XmlNamespaceManager](../xmlnamespacemanager/) المحددين، وقيم **xml:lang** و**xml:space**. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | ينشئ مثيلاً جديداً من الفئة [XmlParserContext](./) مع [XmlNameTable](../xmlnametable/) و[XmlNamespaceManager](../xmlnamespacemanager/) المحددين، وقيم **xml:lang** و**xml:space**، والترميز. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) | ينشئ مثيلاً جديداً من الفئة [XmlParserContext](./) مع [XmlNameTable](../xmlnametable/) و[XmlNamespaceManager](../xmlnamespacemanager/) المحددين، وعنوان URI الأساسي، وقيم **xml:lang** و**xml:space**، وقيم نوع المستند. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | ينشئ مثيلاً جديداً من الفئة [XmlParserContext](./) مع [XmlNameTable](../xmlnametable/) و[XmlNamespaceManager](../xmlnamespacemanager/) المحددين، وعنوان URI الأساسي، وقيم **xml:lang** و**xml:space**، والترميز، وقيم نوع المستند. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
