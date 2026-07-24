---
title: "System::Xml::Schema::XmlSchemaObject class"
linktitle: "XmlSchemaObject"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaObject sınıfı. Xml şema nesne modeli hiyerarşisinin kök sınıfını temsil eder ve C++'ta XmlSchema sınıfı gibi sınıflar için temel sınıf olarak hizmet eder."
type: docs
weight: 5000
url: /tr/cpp/system.xml.schema/xmlschemaobject/
---
## XmlSchemaObject class


[Xml](../../system.xml/) şema nesne modeli hiyerarşisinin kök sınıfını temsil eder ve [XmlSchema](../xmlschema/) sınıfı gibi sınıflar için temel sınıf olarak hizmet eder.

```cpp
class XmlSchemaObject : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_LineNumber](./get_linenumber/)() | Dosyada **schema** öğesinin referans verdiği satır numarasını döndürür. |
| [get_LinePosition](./get_lineposition/)() | Dosyada **schema** öğesinin referans verdiği satır konumunu döndürür. |
| [get_Namespaces](./get_namespaces/)() | Bu şema nesnesiyle kullanılacak XmlSerializerNamespaces'i döndürür. |
| [get_Parent](./get_parent/)() | Bu [XmlSchemaObject](./) nesnesinin üst öğesini döndürür. |
| [get_SourceUri](./get_sourceuri/)() | Şemayı yükleyen dosyanın kaynak konumunu döndürür. |
| [set_LineNumber](./set_linenumber/)(int32_t) | **schema** öğesinin referans verdiği dosyadaki satır numarasını ayarlar. |
| [set_LinePosition](./set_lineposition/)(int32_t) | **schema** öğesinin referans verdiği dosyadaki satır konumunu ayarlar. |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | Bu şema nesnesiyle kullanılacak XmlSerializerNamespaces ayarlarını belirler. |
| [set_Parent](./set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | Bu [XmlSchemaObject](./) nesnesinin üst öğesini ayarlar. |
| [set_SourceUri](./set_sourceuri/)(const String\&) | Şemayı yükleyen dosyanın kaynak konumunu ayarlar. |
| [XmlSchemaObject](./xmlschemaobject/)() | [XmlSchemaObject](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
