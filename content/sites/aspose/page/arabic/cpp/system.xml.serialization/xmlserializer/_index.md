---
title: "فئة System::Xml::Serialization::XmlSerializer"
linktitle: "XmlSerializer"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::Serialization::XmlSerializer. تقوم بعملية التسلسل وإلغاء التسلسل للكائنات إلى ومن مستندات XML. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيسبب ذلك أخطاء تشغيلية و/أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.xml.serialization/xmlserializer/
---
## XmlSerializer class


يقوم بعملية التسلسل وإلغاء التسلسل للكائنات إلى ومن مستندات XML. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيسبب ذلك أخطاء تشغيلية و/أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل.

```cpp
class XmlSerializer : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [CanDeserialize](./candeserialize/)(System::SharedPtr\<XmlReader\>) | يتحقق مما إذا كان القارئ المحدد في حالة قابلة للإلغاء التسلسل. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::Stream\>) | يلغي تسلسل مستند XML إلى كائن. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::TextReader\>) | يلغي تسلسل مستند XML إلى كائن. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>) | يلغي تسلسل مستند XML إلى كائن. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>, String) | يلغي تسلسل مستند XML إلى كائن. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>) | يسلسل المستند إلى XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>) | يسلسل المستند إلى XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>) | يسلسل المستند إلى XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | يسلسل المستند إلى XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | يسلسل المستند إلى XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | يسلسل المستند إلى XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String) | يسلسل المستند إلى XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String, String) | يسلسل المستند إلى XML. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [EncodingNamespace](./encodingnamespace/) | تشفير اسم مساحة الاسم. |
| static [WsdlNamespace](./wsdlnamespace/) | RTTI. |
| static [WsdlTypesNamespace](./wsdltypesnamespace/) | اسم مساحة اسم أنواع WSDL. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
