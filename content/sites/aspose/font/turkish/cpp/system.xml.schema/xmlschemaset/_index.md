---
title: "System::Xml::Schema::XmlSchemaSet sınıfı"
linktitle: "XmlSchemaSet"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaSet sınıfı. C++'da XML Şema tanım dili (XSD) şemalarının bir önbelleğini içerir."
type: docs
weight: 5800
url: /tr/cpp/system.xml.schema/xmlschemaset/
---
## XmlSchemaSet class


XML [Schema](../) tanım dili (XSD) şemalarının bir önbelleğini içerir.

```cpp
class XmlSchemaSet : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(String, const String\&) | Belirtilen URL'deki XML [Schema](../) tanım dili (XSD) şemasını [XmlSchemaSet](./) içine ekler. |
| [Add](./add/)(String, const SharedPtr\<XmlReader\>\&) | [XmlReader](../../system.xml/xmlreader/) içinde bulunan XML [Schema](../) tanım dili (XSD) şemasını [XmlSchemaSet](./) içine ekler. |
| [Add](./add/)(const SharedPtr\<XmlSchemaSet\>\&) | Verilen [XmlSchemaSet](./) içindeki tüm XML [Schema](../) tanım dili (XSD) şemalarını [XmlSchemaSet](./) içine ekler. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | Verilen [XmlSchema](../xmlschema/) öğesini [XmlSchemaSet](./) içine ekler. |
| [Compile](./compile/)() | [XmlSchemaSet](./) içine eklenen XML [Schema](../) tanım dili (XSD) şemalarını tek bir mantıksal şemaya derler. |
| [Contains](./contains/)(String) | Belirtilen hedef ad alanı URI'sine sahip bir XML [Schema](../) tanım dili (XSD) şemasının [XmlSchemaSet](./) içinde olup olmadığını gösterir. |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | Belirtilen XML [Schema](../) tanım dili (XSD) [XmlSchema](../xmlschema/) nesnesinin [XmlSchemaSet](./) içinde olup olmadığını gösterir. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | Verilen dizideki belirtilen indeksten başlayarak, [XmlSchemaSet](./) içindeki tüm [XmlSchema](../xmlschema/) nesnelerini verilen diziye kopyalar. |
| [get_CompilationSettings](./get_compilationsettings/)() | [XmlSchemaSet](./) için [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) döndürür. |
| [get_Count](./get_count/)() | [XmlSchemaSet](./) içindeki mantıksal XML [Schema](../) tanım dili (XSD) şemalarının sayısını döndürür. |
| [get_GlobalAttributes](./get_globalattributes/)() | [XmlSchemaSet](./) içindeki tüm XML [Schema](../) tanım dili (XSD) şemalarındaki tüm global öznitelikleri döndürür. |
| [get_GlobalElements](./get_globalelements/)() | [XmlSchemaSet](./) içindeki tüm XML [Schema](../) tanım dili (XSD) şemalarındaki tüm global öğeleri döndürür. |
| [get_GlobalTypes](./get_globaltypes/)() | [XmlSchemaSet](./) içindeki tüm XML [Schema](../) tanım dili (XSD) şemalarındaki tüm global basit ve karmaşık türleri döndürür. |
| [get_IsCompiled](./get_iscompiled/)() | [XmlSchemaSet](./) içindeki XML [Schema](../) tanım dili (XSD) şemalarının derlenip derlenmediğini gösteren bir değer döndürür. |
| [get_NameTable](./get_nametable/)() | Yeni XML [Schema](../) tanım dili (XSD) şemaları yüklenirken [XmlSchemaSet](./) tarafından kullanılan varsayılan [XmlNameTable](../../system.xml/xmlnametable/) döndürür. |
| [Remove](./remove/)(const SharedPtr\<XmlSchema\>\&) | Belirtilen XML [Schema](../) tanım dili (XSD) şemasını [XmlSchemaSet](./) içinden kaldırır. |
| [RemoveRecursive](./removerecursive/)(const SharedPtr\<XmlSchema\>\&) | Belirtilen XML [Schema](../) tanım dili (XSD) şemasını ve içe aktardığı tüm şemaları [XmlSchemaSet](./) içinden kaldırır. |
| [Reprocess](./reprocess/)(SharedPtr\<XmlSchema\>) | Zaten [XmlSchemaSet](./) içinde bulunan bir XML [Schema](../) tanım dili (XSD) şemasını yeniden işler. |
| [Schemas](./schemas/)() | XML [Schema](../) tanım dili (XSD) şemalarının tümünü içeren bir koleksiyon döndürür [XmlSchemaSet](./). |
| [Schemas](./schemas/)(String) | Verilen ad alanına ait olan XML [Schema](../) tanım dili (XSD) şemalarının tümünü [XmlSchemaSet](./) içinde bir koleksiyon döndürür. |
| [set_CompilationSettings](./set_compilationsettings/)(const SharedPtr\<XmlSchemaCompilationSettings\>\&) | [XmlSchemaSet](./) için [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) ayarlar. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Şemanın include ve import öğelerinde başvurulan ad alanlarını veya konumları çözmek için kullanılan [XmlResolver](../../system.xml/xmlresolver/) ayarlar. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | XML [Schema](../) tanım dili (XSD) şema doğrulama hataları hakkında bilgi almak için bir olay işleyicisi ekler. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | XML [Schema](../) tanım dili (XSD) şema doğrulama hataları hakkında bilgi almak için bir olay işleyicisini kaldırır. |
| [XmlSchemaSet](./xmlschemaset/)() | [XmlSchemaSet](./) sınıfının yeni bir örneğini başlatır. |
| [XmlSchemaSet](./xmlschemaset/)(const SharedPtr\<XmlNameTable\>\&) | Belirtilen [XmlNameTable](../../system.xml/xmlnametable/) ile [XmlSchemaSet](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
