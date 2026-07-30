---
title: "System::Xml::Schema::XmlSchemaCollection sınıfı"
linktitle: "XmlSchemaCollection"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaCollection sınıfı. C++'da XML Şema tanım dili (XSD) ve XML-Data Reduced (XDR) şemalarının bir önbelleğini içerir."
type: docs
weight: 1500
url: /tr/cpp/system.xml.schema/xmlschemacollection/
---
## XmlSchemaCollection class


XML [Schema](../) tanım dili (XSD) ve XML-Data Reduced (XDR) şemalarının bir önbelleğini içerir.

```cpp
class XmlSchemaCollection : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | Verilen URL tarafından bulunan şemayı şema koleksiyonuna ekler. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&) | [XmlReader](../../system.xml/xmlreader/) içinde bulunan şemayı şema koleksiyonuna ekler. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlReader](../../system.xml/xmlreader/) içinde bulunan şemayı şema koleksiyonuna ekler. Belirtilen [XmlResolver](../../system.xml/xmlresolver/) dış kaynakları çözmek için kullanılır. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | [XmlSchema](../xmlschema/) koleksiyona ekler. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Koleksiyona [XmlSchema](../xmlschema/) ekler. Belirtilen [XmlResolver](../../system.xml/xmlresolver/) dış referansları çözmek için kullanılır. |
| [Add](./add/)(const SharedPtr\<XmlSchemaCollection\>\&) | Verilen koleksiyonda tanımlı tüm ad alanlarını (ilişkili şemaları dahil) bu koleksiyona ekler. |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | Belirtilen [XmlSchema](../xmlschema/) öğesinin **targetNamespace**'inin koleksiyonda olup olmadığını gösteren bir değer döndürür. |
| [Contains](./contains/)(const String\&) | Belirtilen ad alanına sahip bir şemanın koleksiyonda olup olmadığını gösteren bir değer döndürür. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | Bu koleksiyondaki tüm [XmlSchema](../xmlschema/) nesnelerini verilen diziye, verilen indeksten başlayarak kopyalar. |
| [get_Count](./get_count/)() | Bu koleksiyonda tanımlı ad alanlarının sayısını döndürür. |
| [get_NameTable](./get_nametable/)() | Yeni şemalar yüklenirken [XmlSchemaCollection](./) tarafından kullanılan varsayılan [XmlNameTable](../../system.xml/xmlnametable/) döndürür. |
| [GetEnumerator](./getenumerator/)() override | Şema koleksiyonu üzerinde yineleme desteği sağlar. |
| [idx_get](./idx_get/)(const String\&) | Verilen ad alanı URI'siyle ilişkili [XmlSchema](../xmlschema/) döndürür. |
| [XmlSchemaCollection](./xmlschemacollection/)() | [XmlSchemaCollection](./) sınıfının yeni bir örneğini başlatır. |
| [XmlSchemaCollection](./xmlschemacollection/)(const SharedPtr\<XmlNameTable\>\&) | Belirtilen [XmlNameTable](../../system.xml/xmlnametable/) ile [XmlSchemaCollection](./) sınıfının yeni bir örneğini başlatır. [XmlNameTable](../../system.xml/xmlnametable/) şemalar yüklenirken kullanılır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar


## Deprecated
XmlSchemaCollection sınıfı artık kullanılmamaktadır. Bunun yerine XmlSchemaSet kullanın.

Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
