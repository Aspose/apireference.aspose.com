---
title: "System::Xml::Serialization::IXmlSerializable فئة"
linktitle: "IXmlSerializable"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Serialization::IXmlSerializable فئة. يوفر تنسيقًا مخصصًا لتسلسل XML وتفكيكه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml.serialization/ixmlserializable/
---
## IXmlSerializable class


يوفر تنسيقًا مخصصًا لتسلسل XML وتفكيكه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IXmlSerializable : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [GetSchema](./getschema/)() | كائن XmlSchema يصف تمثيل XML للكائن الذي تُعيده طريقة [WriteXml()](./writexml/) وتقبله طريقة [ReadXml()](./readxml/). |
| virtual [ReadXml](./readxml/)(System::SharedPtr\<System::Xml::XmlReader\>) | يفكّك الكائن من تمثيله في XML. |
| virtual [WriteXml](./writexml/)(System::SharedPtr\<System::Xml::XmlWriter\>) | يسلسل الكائن الحالي إلى تمثيل XML. |
| virtual [~IXmlSerializable](./~ixmlserializable/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)
