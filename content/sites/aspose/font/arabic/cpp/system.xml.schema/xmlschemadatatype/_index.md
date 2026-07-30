---
title: "System::Xml::Schema::XmlSchemaDatatype فئة"
linktitle: "XmlSchemaDatatype"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaDatatype فئة. فئة XmlSchemaDatatype هي فئة مجردة لتخطيط أنواع لغة تعريف مخطط XML (XSD) إلى أنواع وقت التشغيل في C++."
type: docs
weight: 2400
url: /ar/cpp/system.xml.schema/xmlschemadatatype/
---
## XmlSchemaDatatype class


فئة [XmlSchemaDatatype](./) هي فئة مجردة لتخطيط لغة تعريف XML [Schema](../) (XSD) إلى أنواع وقت التشغيل.

```cpp
class XmlSchemaDatatype : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&) | يقوم بتحويل القيمة المحددة، التي يكون نوعها أحد التمثيلات الصالحة لنوع مخطط XML الممثَّل بواسطة [XmlSchemaDatatype](./)، إلى نوع وقت التشغيل المحدد. |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | يقوم بتحويل القيمة المحددة، التي يكون نوعها أحد التمثيلات الصالحة لنوع مخطط XML الممثَّل بواسطة [XmlSchemaDatatype](./)، إلى نوع وقت التشغيل المحدد باستخدام [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) إذا كان [XmlSchemaDatatype](./) يمثل النوع **xs:QName** أو نوعًا مشتقًا منه. |
| virtual [get_TokenizedType](./get_tokenizedtype/)() | عند تجاوزها في فئة مشتقة، تحصل على النوع للـ **string** كما هو محدد في مواصفات XML 1.0 للاتحاد العالمي للويب [Web](../../system.web/) (W3C). |
| virtual [get_TypeCode](./get_typecode/)() | يعيد قيمة [XmlTypeCode](../xmltypecode/) للنوع البسيط. |
| virtual [get_ValueType](./get_valuetype/)() | عند تجاوزها في فئة مشتقة، تحصل على نوع العنصر. |
| virtual [get_Variety](./get_variety/)() | يعيد قيمة [XmlSchemaDatatypeVariety](../xmlschemadatatypevariety/) للنوع البسيط. |
| virtual [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaDatatype\>) | هذه الطريقة دائمًا تُعيد **false**. |
| virtual [ParseValue](./parsevalue/)(String, SharedPtr\<XmlNameTable\>, SharedPtr\<IXmlNamespaceResolver\>) | عند تجاوزها في فئة مشتقة، تتحقق من صحة الـ **string** المحدد مقابل نوع بسيط مدمج أو معرف من قبل المستخدم. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
