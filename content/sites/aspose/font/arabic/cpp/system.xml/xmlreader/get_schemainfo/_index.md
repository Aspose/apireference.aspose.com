---
title: "طريقة System::Xml::XmlReader::get_SchemaInfo"
linktitle: "get_SchemaInfo"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlReader::get_SchemaInfo. تُرجع معلومات المخطط التي تم تعيينها للعقدة الحالية نتيجة للتحقق من صحة المخطط في C++."
type: docs
weight: 2200
url: /ar/cpp/system.xml/xmlreader/get_schemainfo/
---
## XmlReader::get_SchemaInfo method


يرجع معلومات المخطط التي تم تعيينها للعقدة الحالية نتيجة للتحقق من صحة المخطط.

```cpp
virtual SharedPtr<Schema::IXmlSchemaInfo> System::Xml::XmlReader::get_SchemaInfo()
```


### ReturnValue

كائن IXmlSchemaInfo يحتوي على معلومات المخطط للعقدة الحالية. يمكن تعيين معلومات [Schema](../../../system.xml.schema/) على العناصر أو السمات أو على عقد النص ذات قيمة غير فارغة في [XmlReader::get_ValueType](../get_valuetype/). إذا لم تكن العقدة الحالية أحد أنواع العقد المذكورة أعلاه، أو إذا لم تقم نسخة [XmlReader](../) بالإبلاغ عن معلومات المخطط، فإن هذه الطريقة تُرجع **nullptr**. إذا تم استدعاء هذه الطريقة من كائن [XmlTextReader](../../xmltextreader/) أو [XmlValidatingReader](../../xmlvalidatingreader/)، فإنها دائمًا تُرجع **nullptr**. لا تُظهر تطبيقات [XmlReader](../) هذه معلومات المخطط عبر طريقة get_SchemaInfo.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXmlSchemaInfo](../../../system.xml.schema/ixmlschemainfo/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
