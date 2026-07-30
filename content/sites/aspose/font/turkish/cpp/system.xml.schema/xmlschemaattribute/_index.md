---
title: "System::Xml::Schema::XmlSchemaAttribute sınıfı"
linktitle: "XmlSchemaAttribute"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaAttribute sınıfı. XML Şeması'ndan, Dünya Çapında Ağ Konsorsiyumu (W3C) tarafından belirtilen öznitelik öğesini temsil eder. Öznitelikler, diğer belge öğeleri için ek bilgi sağlar. Öznitelik etiketi, şema için bir belgenin öğesinin etiketleri arasında iç içe yer alır. XML belgesi, öznitelikleri bir öğenin açılış etiketinde adlandırılmış öğeler olarak gösterir C++ içinde."
type: docs
weight: 1100
url: /tr/cpp/system.xml.schema/xmlschemaattribute/
---
## XmlSchemaAttribute class


XML [Schema](../) öğesinden **attribute** öğesini Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirtilen şekilde temsil eder. Öznitelikler, diğer belge öğeleri için ek bilgi sağlar. Öznitelik etiketi, şema için bir belgenin öğesinin etiketleri arasında iç içe yer alır. XML belgesi, öznitelikleri bir öğenin açılış etiketinde adlandırılmış öğeler olarak gösterir.

```cpp
class XmlSchemaAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_AttributeSchemaType](./get_attributeschematype/)() | Öznitelik değerinin [XmlSchemaAttribute::get_SchemaType](./get_schematype/) veya [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) değerine dayanarak öznitelik tipini temsil eden bir [XmlSchemaSimpleType](../xmlschemasimpletype/) nesnesi döndürür. |
| [get_AttributeType](./get_attributetype/)() | Öznitelik değerinin [XmlSchemaAttribute::get_SchemaType](./get_schematype/) veya [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) değerine dayalı nesneyi döndürür; bu nesne **AttributeType** değerinin derleme sonrası yorumlamasını tutar. |
| [get_DefaultValue](./get_defaultvalue/)() | Öznitelik için varsayılan değeri döndürür. |
| [get_FixedValue](./get_fixedvalue/)() | Öznitelik için sabit değeri döndürür. |
| [get_Form](./get_form/)() | Öznitelik için formu döndürür. |
| [get_Name](./get_name/)() | Öznitelik adını döndürür. |
| [get_QualifiedName](./get_qualifiedname/)() | Öznitelik için nitelikli adı döndürür. |
| [get_RefName](./get_refname/)() | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) bildirilen bir öznitelik adını döndürür. |
| [get_SchemaType](./get_schematype/)() | Öznitelik tipini basit bir tipe döndürür. |
| [get_SchemaTypeName](./get_schematypename/)() | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) tanımlanan basit tipin adını döndürür. |
| [get_Use](./get_use/)() | Öznitelik nasıl kullanıldığına dair bilgiyi döndürür. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Öznitelik için varsayılan değeri ayarlar. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Öznitelik için sabit değeri ayarlar. |
| [set_Form](./set_form/)(XmlSchemaForm) | Öznitelik için formu ayarlar. |
| [set_Name](./set_name/)(const String\&) | Öznitelik adını ayarlar. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) bildirilen bir öznitelik adını ayarlar. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Öznitelik tipini basit bir tipe ayarlar. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu şemada tanımlanan basit tipin adını ayarlar (veya belirtilen ad alanı tarafından gösterilen başka bir şemada). |
| [set_Use](./set_use/)(XmlSchemaUse) | Özelliğin nasıl kullanıldığını gösteren bilgileri ayarlar. |
| [XmlSchemaAttribute](./xmlschemaattribute/)() | Yeni bir [XmlSchemaAttribute](./) sınıfı örneği başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
