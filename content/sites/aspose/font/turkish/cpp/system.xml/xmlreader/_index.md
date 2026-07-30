---
title: "System::Xml::XmlReader sınıfı"
linktitle: "XmlReader"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader sınıfı. C++'da XML verilerine hızlı, önbelleğe alınmamış, yalnızca ileri yönde erişim sağlayan bir okuyucuyu temsil eder."
type: docs
weight: 3300
url: /tr/cpp/system.xml/xmlreader/
---
## XmlReader class


XML verilerine hızlı, önbelleğe alınmamış, yalnızca ileri erişim sağlayan bir okuyucuyu temsil eder.

```cpp
class XmlReader : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Close](./close/)() | Türetilmiş bir sınıfta geçersiz kılındığında, [XmlReader::get_ReadState](./get_readstate/) değerini [ReadState::Closed](../readstate/) olarak değiştirir. |
| static [Create](./create/)(const String\&) | Belirtilen URI ile yeni bir [XmlReader](./) örneği oluşturur. |
| static [Create](./create/)(const String\&, const SharedPtr\<XmlReaderSettings\>\&) | Belirtilen URI ve ayarları kullanarak yeni bir [XmlReader](./) örneği oluşturur. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Belirtilen URI, ayarlar ve ayrıştırma için bağlam bilgilerini kullanarak yeni bir [XmlReader](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Belirtilen akışı varsayılan ayarlarla kullanarak yeni bir [XmlReader](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Belirtilen akış ve ayarlarla yeni bir [XmlReader](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Belirtilen akış, temel URI ve ayarları kullanarak yeni bir [XmlReader](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Belirtilen akış, ayarlar ve ayrıştırma için bağlam bilgilerini kullanarak yeni bir [XmlReader](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&) | Belirtilen metin okuyucusunu kullanarak yeni bir [XmlReader](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Belirtilen metin okuyucusu ve ayarları kullanarak yeni bir [XmlReader](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Belirtilen metin okuyucusu, ayarlar ve temel URI'yi kullanarak yeni bir [XmlReader](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Belirtilen metin okuyucusu, ayarlar ve ayrıştırma için bağlam bilgilerini kullanarak yeni bir [XmlReader](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) | Belirtilen XML okuyucusu ve ayarları kullanarak yeni bir [XmlReader](./) örneği oluşturur. |
| [Dispose](./dispose/)() override | Mevcut [XmlReader](./) sınıfı örneği tarafından kullanılan tüm kaynakları serbest bırakır. |
| virtual [get_AttributeCount](./get_attributecount/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümdeki öznitelik sayısını alır. |
| virtual [get_BaseURI](./get_baseuri/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün temel URI'sını alır. |
| virtual [get_CanReadBinaryContent](./get_canreadbinarycontent/)() | [XmlReader](./) ikili içerik okuma yöntemlerini uygulayıp uygulamadığını gösteren bir değer döndürür. |
| virtual [get_CanReadValueChunk](./get_canreadvaluechunk/)() | [XmlReader](./) [XmlReader::ReadValueChunk](./readvaluechunk/) yöntemini uygulayıp uygulamadığını gösteren bir değer döndürür. |
| virtual [get_CanResolveEntity](./get_canresolveentity/)() | Bu okuyucunun varlıkları ayrıştırıp çözümleyip çözemeyeceğini gösteren bir değer döndürür. |
| virtual [get_Depth](./get_depth/)() | Türetilmiş bir sınıfta geçersiz kılındığında, XML belgesindeki geçerli düğümün derinliğini alır. |
| virtual [get_EOF](./get_eof/)() | Türetilmiş bir sınıfta geçersiz kılındığında, okuyucunun akışın sonuna konumlandırılıp konumlandırılmadığını gösteren bir değer alır. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Geçerli düğümün herhangi bir özniteliği olup olmadığını gösteren bir değer döndürür. |
| virtual [get_HasValue](./get_hasvalue/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün bir [XmlReader::get_Value](./get_value/) değeri alıp alamayacağını gösteren bir değer alır. |
| virtual [get_IsDefault](./get_isdefault/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün DTD veya şemada tanımlanan varsayılan değerden oluşturulan bir öznitelik olup olmadığını gösteren bir değer alır. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün boş bir öğe olup olmadığını gösteren bir değer alır (örneğin, **<MyElement/>**). |
| virtual [get_LocalName](./get_localname/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün yerel adını alır. |
| virtual [get_Name](./get_name/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün nitelikli adını alır. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Türetilmiş bir sınıfta geçersiz kılındığında, okuyucunun konumlandığı düğümün ad alanı URI'sını (W3C Ad Alanı spesifikasyonunda tanımlandığı gibi) alır. |
| virtual [get_NameTable](./get_nametable/)() | Türetilmiş bir sınıfta geçersiz kılındığında, bu uygulamayla ilişkili [XmlNameTable](../xmlnametable/) öğesini alır. |
| virtual [get_NodeType](./get_nodetype/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün tipini alır. |
| virtual [get_Prefix](./get_prefix/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümle ilişkili ad alanı önekini alır. |
| virtual [get_QuoteChar](./get_quotechar/)() | Türetilmiş bir sınıfta geçersiz kılındığında, bir öznitelik düğümünün değerini çevrelemek için kullanılan tırnak işareti karakterini alır. |
| virtual [get_ReadState](./get_readstate/)() | Türetilmiş bir sınıfta geçersiz kılındığında, okuyucunun durumunu alır. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Şema doğrulaması sonucunda geçerli düğüme atanmış şema bilgilerini döndürür. |
| virtual [get_Settings](./get_settings/)() | Bu [XmlReader](./) örneğini oluşturmak için kullanılan [XmlReaderSettings](../xmlreadersettings/) nesnesini döndürür. |
| virtual [get_Value](./get_value/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün metin değerini alır. |
| virtual [get_ValueType](./get_valuetype/)() | Geçerli düğümün tipini döndürür. |
| virtual [get_XmlLang](./get_xmllang/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli **xml:lang** kapsamını alır. |
| virtual [get_XmlSpace](./get_xmlspace/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli **xml:space** kapsamını alır. |
| virtual [GetAttribute](./getattribute/)(String) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen [XmlReader::get_Name](./get_name/) değerine sahip öznitelik değerini alır. |
| virtual [GetAttribute](./getattribute/)(String, String) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen [XmlReader::get_LocalName](./get_localname/) ve [XmlReader::get_NamespaceURI](./get_namespaceuri/) değerlerine sahip öznitelik değerini alır. |
| virtual [GetAttribute](./getattribute/)(int32_t) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen dizinle öznitelik değerini alır. |
| virtual [idx_get](./idx_get/)(int32_t) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen dizinle öznitelik değerini alır. |
| virtual [idx_get](./idx_get/)(String) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen [XmlReader::get_Name](./get_name/) değerine sahip öznitelik değerini alır. |
| virtual [idx_get](./idx_get/)(String, String) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen [XmlReader::get_LocalName](./get_localname/) ve [XmlReader::get_NamespaceURI](./get_namespaceuri/) değerlerine sahip öznitelik değerini alır. |
| static [IsName](./isname/)(const String\&) | Dize argümanının geçerli bir XML adı olup olmadığını gösteren bir değer döndürür. |
| static [IsNameToken](./isnametoken/)(const String\&) | Dize argümanının geçerli bir XML adı belirteci olup olmadığını gösteren bir değer döndürür. |
| virtual [IsStartElement](./isstartelement/)() | [XmlReader::MoveToContent](./movetocontent/) metodunu çağırır ve geçerli içerik düğümünün bir başlangıç etiketi veya boş öğe etiketi olup olmadığını test eder. |
| virtual [IsStartElement](./isstartelement/)(String) | [XmlReader::MoveToContent](./movetocontent/) metodunu çağırır ve geçerli içerik düğümünün bir başlangıç etiketi veya boş öğe etiketi olup olmadığını ve bulunan öğenin [XmlReader::get_Name](./get_name/) değerinin verilen argümanla eşleşip eşleşmediğini test eder. |
| virtual [IsStartElement](./isstartelement/)(String, String) | [XmlReader::MoveToContent](./movetocontent/) metodunu çağırır ve geçerli içerik düğümünün bir başlangıç etiketi veya boş öğe etiketi olup olmadığını ve bulunan öğenin [XmlReader::get_LocalName](./get_localname/) ve [XmlReader::get_NamespaceURI](./get_namespaceuri/) değerlerinin verilen dizelerle eşleşip eşleşmediğini test eder. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli öğenin kapsamındaki bir ad alanı önekini çözer. |
| virtual [MoveToAttribute](./movetoattribute/)(String) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen [XmlReader::get_Name](./get_name/) değerine sahip özelliğe geçer. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen [XmlReader::get_LocalName](./get_localname/) ve [XmlReader::get_NamespaceURI](./get_namespaceuri/) değerlerine sahip özelliğe geçer. |
| virtual [MoveToAttribute](./movetoattribute/)(int32_t) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen indeksdeki özelliğe geçer. |
| virtual [MoveToContent](./movetocontent/)() | Geçerli düğümün bir içerik (boşluk olmayan metin, **CDATA**, **Element**, **EndElement**, **EntityReference** veya **EndEntity**) düğümü olup olmadığını denetler. Düğüm bir içerik düğümü değilse, okuyucu bir sonraki içerik düğümüne ya da dosyanın sonuna atlar. Aşağıdaki türdeki düğümleri atlar: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace** veya **SignificantWhitespace**. |
| virtual [MoveToElement](./movetoelement/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli özellik düğümünü içeren öğeye geçer. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | Türetilmiş bir sınıfta geçersiz kılındığında, ilk özelliğe geçer. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | Türetilmiş bir sınıfta geçersiz kılındığında, sonraki özelliğe geçer. |
| virtual [Read](./read/)() | Türetilmiş bir sınıfta geçersiz kılındığında, akıştan bir sonraki düğümü okur. |
| virtual [ReadAttributeValue](./readattributevalue/)() | Türetilmiş bir sınıfta geçersiz kılındığında, özellik değerini bir veya daha fazla **[Text](../../system.text/)**, **EntityReference** veya **EndEntity** düğümüne ayrıştırır. |
| virtual [ReadContentAs](./readcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | İçeriği belirtilen türde bir nesne olarak okur. |
| virtual [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | İçeriği okur ve Base64 çözümlenmiş ikili baytları döndürür. |
| virtual [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | İçeriği okur ve **BinHex** çözülen ikili baytları döndürür. |
| virtual [ReadContentAsBoolean](./readcontentasboolean/)() | Geçerli konumdaki metin içeriğini bir [Boolean](../../system/boolean/) olarak okur. |
| virtual [ReadContentAsDateTime](./readcontentasdatetime/)() | Geçerli konumdaki metin içeriğini bir [DateTime](../../system/datetime/) nesnesi olarak okur. |
| virtual [ReadContentAsDateTimeOffset](./readcontentasdatetimeoffset/)() | Geçerli konumdaki metin içeriğini bir [DateTimeOffset](../../system/datetimeoffset/) nesnesi olarak okur. |
| virtual [ReadContentAsDecimal](./readcontentasdecimal/)() | Geçerli konumdaki metin içeriğini bir [Decimal](../../system/decimal/) nesnesi olarak okur. |
| virtual [ReadContentAsDouble](./readcontentasdouble/)() | Geçerli konumdaki metin içeriğini çift duyarlıklı kayan nokta sayısı olarak okur. |
| virtual [ReadContentAsFloat](./readcontentasfloat/)() | Geçerli konumdaki metin içeriğini tek duyarlıklı kayan nokta sayısı olarak okur. |
| virtual [ReadContentAsInt](./readcontentasint/)() | Geçerli konumdaki metin içeriğini 32 bit işaretli tamsayı olarak okur. |
| virtual [ReadContentAsLong](./readcontentaslong/)() | Geçerli konumdaki metin içeriğini 64 bit işaretli tamsayı olarak okur. |
| virtual [ReadContentAsObject](./readcontentasobject/)() | Geçerli konumdaki metin içeriğini bir [Object](../../system/object/) olarak okur. |
| virtual [ReadContentAsString](./readcontentasstring/)() | Geçerli konumdaki metin içeriğini bir [String](../../system/string/) nesnesi olarak okur. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Elemanın içeriğini istenen türde okur. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) | Belirtilen yerel ad ve ad alanı URI'sinin geçerli öğeyle eşleştiğini kontrol eder, ardından öğenin içeriğini istenen türde okur. |
| virtual [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Öğeyi okur ve **Base64** içeriğini çözer. |
| virtual [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Öğeyi okur ve **BinHex** içeriğini çözer. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)() | Geçerli öğeyi okur ve içeriği bir [Boolean](../../system/boolean/) nesnesi olarak döndürür. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)(String, String) | Belirtilen yerel ad ve ad alanı URI'sinin geçerli öğeyle eşleştiğini kontrol eder, ardından geçerli öğeyi okur ve içeriği bir [Boolean](../../system/boolean/) nesnesi olarak döndürür. |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)() | Geçerli öğeyi okur ve içeriği bir [DateTime](../../system/datetime/) nesnesi olarak döndürür. |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)(String, String) | Belirtilen yerel ad ve ad alanı URI'sinin geçerli öğeyle eşleştiğini kontrol eder, ardından geçerli öğeyi okur ve içeriği bir [DateTime](../../system/datetime/) nesnesi olarak döndürür. |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)() | Geçerli öğeyi okur ve içeriği bir [Decimal](../../system/decimal/) nesnesi olarak döndürür. |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)(String, String) | Belirtilen yerel ad ve ad alanı URI'sinin geçerli öğeyle eşleştiğini kontrol eder, ardından geçerli öğeyi okur ve içeriği bir [Decimal](../../system/decimal/) nesnesi olarak döndürür. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)() | Geçerli öğeyi okur ve içeriği çift duyarlıklı kayan nokta sayısı olarak döndürür. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)(String, String) | Belirtilen yerel ad ve ad alanı URI'sinin geçerli öğeyle eşleştiğini kontrol eder, ardından geçerli öğeyi okur ve içeriği çift duyarlıklı kayan nokta sayısı olarak döndürür. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)() | Geçerli öğeyi okur ve içeriği tek duyarlıklı kayan nokta sayısı olarak döndürür. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)(String, String) | Belirtilen yerel ad ve ad alanı URI'sinin geçerli öğeyle eşleştiğini kontrol eder, ardından geçerli öğeyi okur ve içeriği tek duyarlıklı kayan nokta sayısı olarak döndürür. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)() | Geçerli öğeyi okur ve içeriği 32 bit işaretli tam sayı olarak döndürür. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)(String, String) | Belirtilen yerel ad ve ad alanı URI'sinin geçerli öğeyle eşleştiğini kontrol eder, ardından geçerli öğeyi okur ve içeriği 32 bit işaretli tam sayı olarak döndürür. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)() | Geçerli öğeyi okur ve içeriği 64 bit işaretli tam sayı olarak döndürür. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)(String, String) | Belirtilen yerel ad ve ad alanı URI'sinin geçerli öğeyle eşleştiğini kontrol eder, ardından geçerli öğeyi okur ve içeriği 64 bit işaretli tam sayı olarak döndürür. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)() | Geçerli öğeyi okur ve içeriği bir [Object](../../system/object/) olarak döndürür. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)(String, String) | Belirtilen yerel ad ve ad alanı URI'sinin geçerli öğeyle eşleştiğini kontrol eder, ardından geçerli öğeyi okur ve içeriği bir [Object](../../system/object/) olarak döndürür. |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)() | Geçerli öğeyi okur ve içeriği bir [String](../../system/string/) nesnesi olarak döndürür. |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)(String, String) | Belirtilen yerel ad ve ad alanı URI'sinin geçerli öğeyle eşleştiğini kontrol eder, ardından geçerli öğeyi okur ve içeriği bir [String](../../system/string/) nesnesi olarak döndürür. |
| virtual [ReadElementString](./readelementstring/)() | Yalnızca metin içeren bir öğeyi okur. Ancak, bu işlemi daha basit bir şekilde ele almasını sağladığı için [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) yöntemini kullanmanız önerilir. |
| virtual [ReadElementString](./readelementstring/)(String) | Bulunan öğenin [XmlReader::get_Name](./get_name/) değerinin verilen dizeyle eşleştiğini kontrol eder, ardından yalnızca metin içeren bir öğeyi okur. Ancak, bu işlemi daha basit bir şekilde ele almasını sağladığı için [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) yöntemini kullanmanız önerilir. |
| virtual [ReadElementString](./readelementstring/)(String, String) | Bulunan öğenin [XmlReader::get_LocalName](./get_localname/) ve [XmlReader::get_NamespaceURI](./get_namespaceuri/) değerlerinin verilen dizelerle eşleştiğini kontrol eder, ardından yalnızca metin içeren bir öğeyi okur. Ancak, bu işlemi daha basit bir şekilde ele almasını sağladığı için [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) yöntemini kullanmanız önerilir. |
| virtual [ReadEndElement](./readendelement/)() | Geçerli içerik düğümünün bir kapanış etiketi olduğunu kontrol eder ve okuyucuyu bir sonraki düğüme ilerletir. |
| virtual [ReadInnerXml](./readinnerxml/)() | Türetilmiş bir sınıfta geçersiz kılındığında, işaretlemeyi de içeren tüm içeriği bir dize olarak okur. |
| virtual [ReadOuterXml](./readouterxml/)() | Türetilmiş bir sınıfta geçersiz kılındığında, bu düğümü ve tüm alt düğümlerini temsil eden içeriği, işaretlemeyi de içerecek şekilde okur. |
| virtual [ReadStartElement](./readstartelement/)() | Geçerli düğümün bir öğe olduğunu kontrol eder ve okuyucuyu bir sonraki düğüme ilerletir. |
| virtual [ReadStartElement](./readstartelement/)(String) | Geçerli içerik düğümünün verilen [XmlReader::get_Name](./get_name/) değerine sahip bir öğe olduğunu kontrol eder ve okuyucuyu bir sonraki düğüme ilerletir. |
| virtual [ReadStartElement](./readstartelement/)(String, String) | Geçerli içerik düğümünün verilen [XmlReader::get_LocalName](./get_localname/) ve [XmlReader::get_NamespaceURI](./get_namespaceuri/) değerlerine sahip bir öğe olduğunu kontrol eder ve okuyucuyu bir sonraki düğüme ilerletir. |
| virtual [ReadString](./readstring/)() | Türetilmiş bir sınıfta geçersiz kılındığında, bir öğe veya metin düğümünün içeriğini bir dize olarak okur. Ancak, bu işlemi daha basit bir şekilde ele almasını sağladığı için [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) yönteminin kullanılması önerilir. |
| virtual [ReadSubtree](./readsubtree/)() | Geçerli düğümü ve tüm alt düğümlerini okumak için kullanılabilecek yeni bir [XmlReader](./) örneği döndürür. |
| virtual [ReadToDescendant](./readtodescendant/)(String) | [XmlReader](./) öğesini belirtilen nitelikli ada sahip bir sonraki alt öğeye ilerletir. |
| virtual [ReadToDescendant](./readtodescendant/)(String, String) | [XmlReader](./) öğesini belirtilen yerel ada ve ad alanı URI'sine sahip bir sonraki alt öğeye ilerletir. |
| virtual [ReadToFollowing](./readtofollowing/)(String) | Belirtilen nitelikli ada sahip bir öğe bulunana kadar okur. |
| virtual [ReadToFollowing](./readtofollowing/)(String, String) | Belirtilen yerel ada ve ad alanı URI'sine sahip bir öğe bulunana kadar okur. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String) | [XmlReader](./) öğesini belirtilen nitelikli ada sahip bir sonraki kardeş öğeye ilerletir. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String, String) | [XmlReader](./) öğesini belirtilen yerel ada ve ad alanı URI'sine sahip bir sonraki kardeş öğeye ilerletir. |
| virtual [ReadValueChunk](./readvaluechunk/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Bir XML belgesine gömülü büyük metin akışlarını okur. |
| virtual [ResolveEntity](./resolveentity/)() | Türetilmiş bir sınıfta geçersiz kılındığında, **EntityReference** düğümleri için varlık referansını çözer. |
| virtual [Skip](./skip/)() | Geçerli düğümün alt öğelerini atlar. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
