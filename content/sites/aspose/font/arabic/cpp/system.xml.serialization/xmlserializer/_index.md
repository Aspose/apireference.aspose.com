---
title: "الفئة System::Xml::Serialization::XmlSerializer"
linktitle: "XmlSerializer"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Xml::Serialization::XmlSerializer. تقوم بعملية تسلسل وفك تسلسل الكائنات إلى ومن مستندات XML. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت تشغيل و/أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.xml.serialization/xmlserializer/
---
## XmlSerializer class


يؤدي تسلسل وتفكيك (serialization و deserialization) للكائنات إلى داخل وخارج مستندات XML. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class XmlSerializer : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [CanDeserialize](./candeserialize/)(System::SharedPtr\<XmlReader\>) | يتحقق مما إذا كان القارئ المحدد في حالة قابلة للتفكيك. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::Stream\>) | يفكّك مستند XML إلى كائن. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::TextReader\>) | يفكّك مستند XML إلى كائن. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>) | يفكّك مستند XML إلى كائن. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>, String) | يفكّك مستند XML إلى كائن. |
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
| static [EncodingNamespace](./encodingnamespace/) | ترميز اسم مساحة الاسم. |
| static [WsdlNamespace](./wsdlnamespace/) | RTTI. |
| static [WsdlTypesNamespace](./wsdltypesnamespace/) | اسم مساحة أسماء أنواع WSDL. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)
