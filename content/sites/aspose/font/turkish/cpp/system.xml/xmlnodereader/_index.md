---
title: "System::Xml::XmlNodeReader sınıfı"
linktitle: "XmlNodeReader"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNodeReader sınıfı. C++'da bir XmlNode içindeki XML verilerine hızlı, önbelleğe alınmamış yalnızca ileriye doğru erişim sağlayan bir okuyucuyu temsil eder."
type: docs
weight: 2800
url: /tr/cpp/system.xml/xmlnodereader/
---
## XmlNodeReader class


Bir [XmlNode](../xmlnode/) içindeki XML verilerine hızlı, önbelleğe alınmamış yalnızca ileriye doğru erişim sağlayan bir okuyucuyu temsil eder.

```cpp
class XmlNodeReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlNamespaceResolver
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() override | [XmlNodeReader::get_ReadState](./get_readstate/) değerini [ReadState::Closed](../readstate/) olarak değiştirir. |
| [get_AttributeCount](./get_attributecount/)() override | Geçerli düğümdeki öznitelik sayısını döndürür. |
| [get_BaseURI](./get_baseuri/)() override | Geçerli düğümün temel URI'sını döndürür. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | [XmlNodeReader](./) öğesinin ikili içerik okuma yöntemlerini uygulayıp uygulamadığını gösteren bir değer döndürür. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Bu okuyucunun varlıkları ayrıştırıp çözümleyip çözemeyeceğini gösteren bir değer döndürür. |
| [get_Depth](./get_depth/)() override | XML belgesindeki geçerli düğümün derinliğini döndürür. |
| [get_EOF](./get_eof/)() override | Okuyucunun akışın sonuna konumlanıp konumlanmadığını gösteren bir değer döndürür. |
| [get_HasAttributes](./get_hasattributes/)() override | Geçerli düğümün herhangi bir özniteliği olup olmadığını gösteren bir değer döndürür. |
| [get_HasValue](./get_hasvalue/)() override | Geçerli düğümün bir [XmlNodeReader::get_Value](./get_value/) değeri alıp alamayacağını gösteren bir değer döndürür. |
| [get_IsDefault](./get_isdefault/)() override | Geçerli düğümün, belge türü tanımında (DTD) veya şemada tanımlanan varsayılan değerden oluşturulan bir öznitelik olup olmadığını gösteren bir değer döndürür. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Geçerli düğümün boş bir öğe olup olmadığını gösteren bir değer döndürür (örneğin, **<MyElement/>**). |
| [get_LocalName](./get_localname/)() override | Geçerli düğümün yerel adını döndürür. |
| [get_Name](./get_name/)() override | Geçerli düğümün nitelikli adını döndürür. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Okuyucunun konumlandığı düğümün (W3C Namespace spesifikasyonunda tanımlandığı gibi) ad alanı URI'sını döndürür. |
| [get_NameTable](./get_nametable/)() override | Bu uygulama ile ilişkili [XmlNameTable](../xmlnametable/) öğesini döndürür. |
| [get_NodeType](./get_nodetype/)() override | Geçerli düğümün tipini döndürür. |
| [get_Prefix](./get_prefix/)() override | Geçerli düğümle ilişkili ad alanı önekini döndürür. |
| [get_ReadState](./get_readstate/)() override | Okuyucunun durumunu döndürür. |
| [get_SchemaInfo](./get_schemainfo/)() override | Geçerli düğüme atanmış şema bilgilerini döndürür. |
| [get_Value](./get_value/)() override | Geçerli düğümün metin değerini döndürür. |
| [get_XmlLang](./get_xmllang/)() override | Mevcut **xml:lang** kapsamını döndürür. |
| [get_XmlSpace](./get_xmlspace/)() override | Geçerli **xml:space** kapsamını döndürür. |
| [GetAttribute](./getattribute/)(String) override | Belirtilen ada sahip özniteliğin değerini döndürür. |
| [GetAttribute](./getattribute/)(String, String) override | Belirtilen yerel ada ve ad alanı URI'sine sahip özniteliğin değerini döndürür. |
| [GetAttribute](./getattribute/)(int32_t) override | Belirtilen indeksdeki özniteliğin değerini döndürür. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Geçerli öğenin kapsamındaki bir ad alanı önekini çözer. |
| [MoveToAttribute](./movetoattribute/)(String) override | Belirtilen ada sahip özniteliğe geçer. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Belirtilen yerel ada ve ad alanı URI'sine sahip özniteliğe geçer. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | Belirtilen indeksdeki özniteliğe geçer. |
| [MoveToElement](./movetoelement/)() override | Geçerli öznitelik düğümünü içeren öğeye geçer. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | İlk özniteliğe geçer. |
| [MoveToNextAttribute](./movetonextattribute/)() override | Sonraki özniteliğe geçer. |
| [Read](./read/)() override | Akıştan bir sonraki düğümü okur. |
| [ReadAttributeValue](./readattributevalue/)() override | Öznitelik değerini bir veya daha fazla **[Text](../../system.text/)**, **EntityReference** veya **EndEntity** düğümüne ayrıştırır. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | İçeriği okur ve Base64 çözümlenmiş ikili baytları döndürür. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | İçeriği okur ve BinHex çözümlenmiş ikili baytları döndürür. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Öğeyi okur ve Base64 içeriğini çözer. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Öğeyi okur ve BinHex içeriğini çözer. |
| [ReadString](./readstring/)() override | Bir öğenin veya metin düğümünün içeriğini dize olarak okur. |
| [ResolveEntity](./resolveentity/)() override | **EntityReference** düğümleri için varlık referansını çözer. |
| [Skip](./skip/)() override | Geçerli düğümün alt öğelerini atlar. |
| [XmlNodeReader](./xmlnodereader/)(const SharedPtr\<XmlNode\>\&) | Belirtilen [XmlNode](../xmlnode/) kullanarak [XmlNodeReader](./) sınıfının bir örneğini oluşturur. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlReader](../xmlreader/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
