---
title: "System::Xml::Schema::XmlSchema sınıfı"
linktitle: "XmlSchema"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchema sınıfı. Dünya Çapında Ağ Konsorsiyumu (W3C) ve C++'da belirtildiği gibi bir XML Şeması'nın bellek içi temsili."
type: docs
weight: 400
url: /tr/cpp/system.xml.schema/xmlschema/
---
## XmlSchema class


Bellek içi bir XML [Schema](../) temsili, Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) [XML Schema Part 1: Structures](https://www.w3.org/TR/xmlschema-1/) ve [XML Schema Part 2: Datatypes](https://www.w3.org/TR/xmlschema-2/) tarafından belirtildiği gibi.

```cpp
class XmlSchema : public System::Xml::Schema::XmlSchemaObject
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Compile](./compile/)(ValidationEventHandler) | XML [Schema](../)[Object](../../system/object/) Modeli (SOM)'i doğrulama için şema bilgisine derler. Programatik olarak oluşturulan SOM'un sözdizimsel ve anlamsal yapısını kontrol etmek için kullanılır. Anlamsal doğrulama denetimi derleme sırasında gerçekleştirilir. |
| [Compile](./compile/)(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) | XML [Schema](../)[Object](../../system/object/) Modeli (SOM)'i doğrulama için şema bilgisine derler. Programatik olarak oluşturulan SOM'un sözdizimsel ve anlamsal yapısını kontrol etmek için kullanılır. Anlamsal doğrulama denetimi derleme sırasında gerçekleştirilir. |
| [get_AttributeFormDefault](./get_attributeformdefault/)() | Şemanın hedef ad alanında bildirilen öznitelikler için formu döndürür. |
| [get_AttributeGroups](./get_attributegroups/)() | Şemadaki tüm küresel öznitelik gruplarının şema derlemesi sonrası değerini döndürür. |
| [get_Attributes](./get_attributes/)() | Şemadaki tüm özniteliklerin şema derlemesi sonrası değerini döndürür. |
| [get_BlockDefault](./get_blockdefault/)() | Şemanın **targetNamespace** içinde öğe ve karmaşık tiplerde **block** özniteliğinin varsayılan değerini ayarlayan **blockDefault** özniteliğini döndürür. |
| [get_ElementFormDefault](./get_elementformdefault/)() | Şemanın hedef ad alanında bildirilen öğeler için formu döndürür. |
| [get_Elements](./get_elements/)() | Şemadaki tüm öğelerin şema derlemesi sonrası değerini döndürür. |
| [get_FinalDefault](./get_finaldefault/)() | Şemanın hedef ad alanındaki öğe ve karmaşık tiplerde **final** özniteliğinin varsayılan değerini ayarlayan **finalDefault** özniteliğini döndürür. |
| [get_Groups](./get_groups/)() | Şemadaki tüm grupların şema derlemesi sonrası değerini döndürür. |
| [get_Id](./get_id/)() | Dize kimliğini döndürür. |
| [get_Includes](./get_includes/)() | Dahil edilen ve içe aktarılan şemaların koleksiyonunu döndürür. |
| [get_IsCompiled](./get_iscompiled/)() | Şemanın derlenip derlenmediğini gösterir. |
| [get_Items](./get_items/)() | Şemadaki şema öğelerinin koleksiyonunu döndürür ve **schema** öğe seviyesinde yeni öğe tipleri eklemek için kullanılır. |
| [get_LineNumber](../xmlschemaobject/get_linenumber/)() | **schema** öğesinin referans verdiği dosyadaki satır numarasını döndürür. |
| [get_LinePosition](../xmlschemaobject/get_lineposition/)() | **schema** öğesinin referans verdiği dosyadaki satır konumunu döndürür. |
| [get_Namespaces](../xmlschemaobject/get_namespaces/)() | Bu şema nesnesiyle kullanılacak XmlSerializerNamespaces'i döndürür. |
| [get_Notations](./get_notations/)() | Şemadaki tüm notasyonların şema derlemesi sonrası değerini döndürür. |
| [get_Parent](../xmlschemaobject/get_parent/)() | Bu [XmlSchemaObject](../xmlschemaobject/) öğesinin üst öğesini döndürür. |
| [get_SchemaTypes](./get_schematypes/)() | Şemadaki tüm şema türlerinin şema derlemesi sonrası değerini döndürür. |
| [get_SourceUri](../xmlschemaobject/get_sourceuri/)() | Şemayı yükleyen dosyanın kaynak konumunu döndürür. |
| [get_TargetNamespace](./get_targetnamespace/)() | Şema hedef ad alanının Tekdüzen Kaynak Tanımlayıcısını (URI) döndürür. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Şema hedef ad alanına ait olmayan nitelikli öznitelikleri döndürür. |
| [get_Version](./get_version/)() | Şemanın sürümünü döndürür. |
| static [Read](./read/)(const SharedPtr\<IO::TextReader\>\&, ValidationEventHandler) | Sağlanan [IO::TextReader](../../system.io/textreader/) üzerinden bir XML [Schema](../) okur. |
| static [Read](./read/)(const SharedPtr\<IO::Stream\>\&, ValidationEventHandler) | Sağlanan akıştan bir XML [Schema](../) okur. |
| static [Read](./read/)(const SharedPtr\<XmlReader\>\&, ValidationEventHandler) | Sağlanan [XmlReader](../../system.xml/xmlreader/) üzerinden bir XML [Schema](../) okur. |
| [set_AttributeFormDefault](./set_attributeformdefault/)(XmlSchemaForm) | Şemanın hedef ad alanında bildirilen öznitelikler için formu ayarlar. |
| [set_BlockDefault](./set_blockdefault/)(XmlSchemaDerivationMethod) | Şemanın **targetNamespace** içindeki öğe ve karmaşık tiplerdeki **block** özniteliğinin varsayılan değerini ayarlayan **blockDefault** özniteliğini belirler. |
| [set_ElementFormDefault](./set_elementformdefault/)(XmlSchemaForm) | Şemanın hedef ad alanında bildirilen öğeler için formu ayarlar. |
| [set_FinalDefault](./set_finaldefault/)(XmlSchemaDerivationMethod) | Şemanın hedef ad alanındaki öğe ve karmaşık tiplerdeki **final** özniteliğinin varsayılan değerini ayarlayan **finalDefault** özniteliğini belirler. |
| [set_Id](./set_id/)(const String\&) | Dize kimliğini ayarlar. |
| [set_LineNumber](../xmlschemaobject/set_linenumber/)(int32_t) | **schema** öğesinin işaret ettiği dosyadaki satır numarasını ayarlar. |
| [set_LinePosition](../xmlschemaobject/set_lineposition/)(int32_t) | **schema** öğesinin işaret ettiği dosyadaki satır konumunu ayarlar. |
| [set_Namespaces](../xmlschemaobject/set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | Bu şema nesnesiyle kullanılacak XmlSerializerNamespaces'i ayarlar. |
| [set_Parent](../xmlschemaobject/set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | Bu [XmlSchemaObject](../xmlschemaobject/) nesnesinin üst nesnesini ayarlar. |
| [set_SourceUri](../xmlschemaobject/set_sourceuri/)(const String\&) | Şemayı yükleyen dosyanın kaynak konumunu ayarlar. |
| [set_TargetNamespace](./set_targetnamespace/)(const String\&) | Şema hedef ad alanının Tekdüzen Kaynak Tanımlayıcısını (URI) ayarlar. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Şema hedef ad alanına ait olmayan nitelikli öznitelikleri ayarlar. |
| [set_Version](./set_version/)(const String\&) | Şemanın sürümünü ayarlar. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&) | Sağlanan veri akışına XML [Schema](../) yazar. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Belirtilen [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) kullanarak sağlanan Akışa XML [Schema](../) yazar. |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&) | Sağlanan [IO::TextWriter](../../system.io/textwriter/) üzerinden XML [Schema](../) yazar. |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Sağlanan TextWriter'a XML [Schema](../) yazar. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&) | XML [Schema](../) dosyasını sağlanan [XmlWriter](../../system.xml/xmlwriter/) ile yazar. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | XML [Schema](../) dosyasını sağlanan [XmlWriter](../../system.xml/xmlwriter/) ile yazar. |
| [XmlSchema](./xmlschema/)() | Yeni bir [XmlSchema](./) sınıfı örneği başlatır. |
| [XmlSchemaObject](../xmlschemaobject/xmlschemaobject/)() | Yeni bir [XmlSchemaObject](../xmlschemaobject/) sınıfı örneği başlatır. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [InstanceNamespace](./instancenamespace/) | XML şema örnek alan adı. Bu alan sabittir. |
| static [Namespace](./namespace/) | XML şema ad alanı. Bu alan sabittir. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
