---
title: "System::Xml::XmlParserContext sınıfı"
linktitle: "XmlParserContext"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlParserContext sınıfı. C++'ta bir XML parçacığını ayrıştırmak için XmlReader'ın ihtiyaç duyduğu tüm bağlam bilgilerini sağlar."
type: docs
weight: 3000
url: /tr/cpp/system.xml/xmlparsercontext/
---
## XmlParserContext class


XmlReader'ın bir XML parçacığını ayrıştırmak için ihtiyaç duyduğu tüm bağlam bilgilerini sağlar.

```cpp
class XmlParserContext : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_BaseURI](./get_baseuri/)() | Temel URI'yi döndürür. |
| [get_DocTypeName](./get_doctypename/)() | Belge türü bildiriminin adını döndürür. |
| [get_Encoding](./get_encoding/)() | Kodlama türünü döndürür. |
| [get_InternalSubset](./get_internalsubset/)() | Dahili DTD alt kümesini döndürür. |
| [get_NamespaceManager](./get_namespacemanager/)() | [XmlNamespaceManager](../xmlnamespacemanager/) nesnesini döndürür. |
| [get_NameTable](./get_nametable/)() | [XmlNameTable](../xmlnametable/) nesnesini döndürür; bu nesne dizeleri atomize etmek için kullanılır. Atomize edilmiş dizeler hakkında daha fazla bilgi için [XmlNameTable](../xmlnametable/) sayfasına bakın. |
| [get_PublicId](./get_publicid/)() | Genel tanımlayıcıyı döndürür. |
| [get_SystemId](./get_systemid/)() | Sistem tanımlayıcısını döndürür. |
| [get_XmlLang](./get_xmllang/)() | Mevcut **xml:lang** kapsamını döndürür. |
| [get_XmlSpace](./get_xmlspace/)() | Geçerli **xml:space** kapsamını döndürür. |
| [set_BaseURI](./set_baseuri/)(const String\&) | Temel URI'yi ayarlar. |
| [set_DocTypeName](./set_doctypename/)(const String\&) | Belge türü bildiriminin adını ayarlar. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | Kodlama türünü ayarlar. |
| [set_InternalSubset](./set_internalsubset/)(const String\&) | Dahili DTD alt kümesini ayarlar. |
| [set_NamespaceManager](./set_namespacemanager/)(const SharedPtr\<XmlNamespaceManager\>\&) | [XmlNamespaceManager](../xmlnamespacemanager/) nesnesini ayarlar. |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | [XmlNameTable](../xmlnametable/) nesnesini ayarlar; bu nesne dizeleri atomize etmek için kullanılır. Atomize edilmiş dizeler hakkında daha fazla bilgi için [XmlNameTable](../xmlnametable/) sayfasına bakın. |
| [set_PublicId](./set_publicid/)(const String\&) | Genel tanımlayıcıyı ayarlar. |
| [set_SystemId](./set_systemid/)(const String\&) | Sistem tanımlayıcısını ayarlar. |
| [set_XmlLang](./set_xmllang/)(const String\&) | Mevcut **xml:lang** kapsamını ayarlar. |
| [set_XmlSpace](./set_xmlspace/)(System::Xml::XmlSpace) | Mevcut **xml:space** kapsamını ayarlar. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) | [XmlParserContext](./) sınıfının yeni bir örneğini, belirtilen [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), **xml:lang** ve **xml:space** değerleriyle başlatır. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | [XmlParserContext](./) sınıfının yeni bir örneğini, belirtilen [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), **xml:lang**, **xml:space** ve kodlama ile başlatır. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) | [XmlParserContext](./) sınıfının yeni bir örneğini, belirtilen [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), temel URI, **xml:lang**, **xml:space** ve belge türü değerleriyle başlatır. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | Belirtilen [XmlParserContext](./) sınıfının yeni bir örneğini, belirtilen [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), temel URI, **xml:lang**, **xml:space**, kodlama ve belge türü değerleriyle başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
