---
title: "الفئة System::Xml::Schema::XmlSchemaDatatype"
linktitle: "XmlSchemaDatatype"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaDatatype. الفئة XmlSchemaDatatype هي فئة مجردة لتخطيط أنواع لغة تعريف مخطط XML (XSD) إلى أنواع وقت التشغيل في C++."
type: docs
weight: 2400
url: /ar/cpp/system.xml.schema/xmlschemadatatype/
---
## XmlSchemaDatatype class


الفئة [XmlSchemaDatatype](./) هي فئة مجردة لتخطيط أنواع XML [Schema](../) لغة تعريف المخطط (XSD) إلى أنواع وقت التشغيل.

```cpp
class XmlSchemaDatatype : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&) | يحوّل القيمة المحددة، التي يكون نوعها أحد التمثيلات الصالحة لنوع مخطط XML الممثّل بواسطة [XmlSchemaDatatype](./)، إلى نوع وقت التشغيل المحدد. |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | يحوّل القيمة المحددة، التي يكون نوعها أحد التمثيلات الصالحة لنوع مخطط XML الممثّل بواسطة [XmlSchemaDatatype](./)، إلى نوع وقت التشغيل المحدد باستخدام [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) إذا كان [XmlSchemaDatatype](./) يمثل النوع **xs:QName** أو نوعًا مشتقًا منه. |
| virtual [get_TokenizedType](./get_tokenizedtype/)() | عند تجاوزها في فئة مشتقة، تحصل على النوع للـ **string** كما هو محدد في مواصفة World Wide [Web](../../system.web/) Consortium (W3C) XML 1.0. |
| virtual [get_TypeCode](./get_typecode/)() | يعيد قيمة [XmlTypeCode](../xmltypecode/) للنوع البسيط. |
| virtual [get_ValueType](./get_valuetype/)() | عند تجاوزها في فئة مشتقة، تحصل على نوع العنصر. |
| virtual [get_Variety](./get_variety/)() | يعيد قيمة [XmlSchemaDatatypeVariety](../xmlschemadatatypevariety/) للنوع البسيط. |
| virtual [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaDatatype\>) | هذه الطريقة دائمًا تُعيد **false**. |
| virtual [ParseValue](./parsevalue/)(String, SharedPtr\<XmlNameTable\>, SharedPtr\<IXmlNamespaceResolver\>) | عند تجاوزها في فئة مشتقة، تتحقق من صحة الـ **string** المحدد مقابل نوع بسيط مدمج أو معرف من قبل المستخدم. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
