---
title: "System::Xml::Serialization::IXmlSerializable class"
linktitle: "IXmlSerializable"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Serialization::IXmlSerializable class. يوفر تنسيقًا مخصصًا لتسلسل XML وإلغاء تسلسله. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml.serialization/ixmlserializable/
---
## IXmlSerializable class


يوفر تنسيقًا مخصصًا لتسلسل XML وإلغاء تسلسله. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IXmlSerializable : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [GetSchema](./getschema/)() | كائن XmlSchema يصف تمثيل XML للكائن الذي تُعيده طريقة [WriteXml()](./writexml/) وتقبله طريقة [ReadXml()](./readxml/). |
| virtual [ReadXml](./readxml/)(System::SharedPtr\<System::Xml::XmlReader\>) | يقوم بإلغاء تسلسل الكائن من تمثيله في XML. |
| virtual [WriteXml](./writexml/)(System::SharedPtr\<System::Xml::XmlWriter\>) | يقوم بتسلسل الكائن الحالي إلى تمثيل XML. |
| virtual [~IXmlSerializable](./~ixmlserializable/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
