---
title: "System::Xml::XmlValidatingReader class"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlValidatingReader class. C++'da belge türü tanımı (DTD), XML-Data Reduced (XDR) şeması ve XML Şema tanım dili (XSD) doğrulaması sağlayan bir okuyucuyu temsil eder."
type: docs
weight: 4200
url: /tr/cpp/system.xml/xmlvalidatingreader/
---
## XmlValidatingReader class


Belge türü tanımı (DTD), XML-Data Reduced (XDR) şeması ve XML [Schema](../../system.xml.schema/) tanım dili (XSD) doğrulaması sağlayan bir okuyucuyu temsil eder.

```cpp
class XmlValidatingReader : public System::Xml::XmlReader,
                            public System::Xml::IXmlLineInfo,
                            public System::Xml::IXmlNamespaceResolver
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() override | Değiştirir [XmlReader::get_ReadState](../xmlreader/get_readstate/) değerini Closed. |
| [get_AttributeCount](./get_attributecount/)() override | Geçerli düğümdeki öznitelik sayısını döndürür. |
| [get_BaseURI](./get_baseuri/)() override | Geçerli düğümün temel URI'sını döndürür. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | [XmlValidatingReader](./) ikili içerik okuma yöntemlerini uygulayıp uygulamadığını gösteren bir değer döndürür. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Bu okuyucunun varlıkları ayrıştırıp çözümleyip çözemeyeceğini gösteren bir değer döndürür. |
| [get_Depth](./get_depth/)() override | XML belgesindeki geçerli düğümün derinliğini döndürür. |
| [get_Encoding](./get_encoding/)() | Belge için kodlama özniteliğini döndürür. |
| [get_EntityHandling](./get_entityhandling/)() | Okuyucunun varlıkları nasıl işlediğini belirten bir değer döndürür. |
| [get_EOF](./get_eof/)() override | Okuyucunun akışın sonuna konumlanıp konumlanmadığını gösteren bir değer döndürür. |
| [get_HasValue](./get_hasvalue/)() override | Geçerli düğümün [XmlValidatingReader::get_Value](./get_value/) değerinin [String::Empty](../../system/string/empty/) dışında bir değer alıp alamayacağını gösteren bir değer döndürür. |
| [get_IsDefault](./get_isdefault/)() override | Geçerli düğümün, belge türü tanımında (DTD) veya şemada tanımlanan varsayılan değerden oluşturulan bir öznitelik olup olmadığını gösteren bir değer döndürür. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Geçerli düğümün boş bir öğe olup olmadığını gösteren bir değer döndürür (örneğin, **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | Geçerli satır numarasını döndürür. |
| [get_LinePosition](./get_lineposition/)() override | Geçerli satır konumunu döndürür. |
| [get_LocalName](./get_localname/)() override | Geçerli düğümün yerel adını döndürür. |
| [get_Name](./get_name/)() override | Geçerli düğümün nitelikli adını döndürür. |
| [get_Namespaces](./get_namespaces/)() | Namespace desteğinin yapılacağını gösteren bir değer döndürür. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Okuyucunun konumlandığı düğümün ad alanı Evrensel Kaynak Tanımlayıcısı (URI) (World Wide [Web](../../system.web/) Consortium (W3C) Namespace spesifikasyonunda tanımlandığı gibi) döndürür. |
| [get_NameTable](./get_nametable/)() override | Bu uygulama ile ilişkili [XmlNameTable](../xmlnametable/) öğesini döndürür. |
| [get_NodeType](./get_nodetype/)() override | Geçerli düğümün tipini döndürür. |
| [get_Prefix](./get_prefix/)() override | Geçerli düğümle ilişkili ad alanı önekini döndürür. |
| [get_QuoteChar](./get_quotechar/)() override | Öznitelik düğümünün değerini çevrelemek için kullanılan tırnak işareti karakterini döndürür. |
| [get_Reader](./get_reader/)() | Bu [XmlValidatingReader](./) nesnesini oluşturmak için kullanılan [XmlReader](../xmlreader/) döndürür. |
| [get_ReadState](./get_readstate/)() override | Okuyucunun durumunu döndürür. |
| [get_Schemas](./get_schemas/)() | Doğrulama için kullanılacak bir XmlSchemaCollection döndürür. |
| [get_SchemaType](./get_schematype/)() | Bir şema türü nesnesi döndürür. |
| [get_ValidationType](./get_validationtype/)() | Yapılacak doğrulama türünü gösteren bir değer döndürür. |
| [get_Value](./get_value/)() override | Geçerli düğümün metin değerini döndürür. |
| [get_XmlLang](./get_xmllang/)() override | Mevcut **xml:lang** kapsamını döndürür. |
| [get_XmlSpace](./get_xmlspace/)() override | Geçerli **xml:space** kapsamını döndürür. |
| [GetAttribute](./getattribute/)(String) override | Belirtilen ada sahip özniteliğin değerini döndürür. |
| [GetAttribute](./getattribute/)(String, String) override | Belirtilen yerel ad ve ad alanı Evrensel Kaynak Tanımlayıcısı (URI) olan öznitelğin değerini döndürür. |
| [GetAttribute](./getattribute/)(int32_t) override | Belirtilen indeksdeki özniteliğin değerini döndürür. |
| [HasLineInfo](./haslineinfo/)() override | Sınıfın satır bilgisi döndürüp döndüremeyeceğini gösteren bir değer döndürür. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Geçerli öğenin kapsamındaki bir ad alanı önekini çözer. |
| [MoveToAttribute](./movetoattribute/)(String) override | Belirtilen ada sahip özniteliğe geçer. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Belirtilen yerel ad ve ad alanı Evrensel Kaynak Tanımlayıcısı (URI) olan özniteliğe geçer. |
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
| [ReadTypedValue](./readtypedvalue/)() | Belirtilen XML [Schema](../../system.xml.schema/) tanım dili (XSD) türü için çalışma zamanı tipini döndürür. |
| [ResolveEntity](./resolveentity/)() override | **EntityReference** düğümleri için varlık referansını çözer. |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | Okuyucunun varlıkları nasıl işlediğini belirten bir değeri ayarlar. |
| [set_Namespaces](./set_namespaces/)(bool) | Namespace desteğinin yapılacağını gösteren bir değeri ayarlar. |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | Yapılacak doğrulama türünü gösteren bir değeri ayarlar. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlResolver](../xmlresolver/) dış belge türü tanımı (DTD) ve şema konumu referanslarını çözmek için kullanılan ayarlar. [XmlResolver](../xmlresolver/) ayrıca XML [Schema](../../system.xml.schema/) tanım dili (XSD) şemalarında bulunan import veya include öğelerini işlemek için de kullanılır. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Belge türü tanımı (DTD), XML-Data Reduced (XDR) şeması ve XML [Schema](../../system.xml.schema/) tanım dili (XSD) şema doğrulama hataları hakkında bilgi almak için bir olay işleyicisi ekler. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Belge türü tanımı (DTD), XML-Data Reduced (XDR) şeması ve XML [Schema](../../system.xml.schema/) tanım dili (XSD) şema doğrulama hataları hakkında bilgi almak için bir olay işleyicisini kaldırır. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<XmlReader\>\&) | Verilen [XmlReader](../xmlreader/) tarafından döndürülen içeriği doğrulayan [XmlValidatingReader](./) sınıfının yeni bir örneğini başlatır. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Belirtilen değerlerle [XmlValidatingReader](./) sınıfının yeni bir örneğini başlatır. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Belirtilen değerlerle [XmlValidatingReader](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar


## Deprecated
Bu sınıf artık kullanılmamaktadır. Doğrulamalı bir XML okuyucu oluşturmak için XmlReaderSettings sınıfı ve XmlReader::Create yöntemi kullanılması önerilir.

Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
