---
title: "System::Xml::XmlTextReader sınıfı"
linktitle: "XmlTextReader"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlTextReader sınıfı. C++'ta XML verilerine hızlı, önbelleğe alınmamış, yalnızca ileriye doğru erişim sağlayan bir okuyucuyu temsil eder."
type: docs
weight: 3900
url: /tr/cpp/system.xml/xmltextreader/
---
## XmlTextReader class


XML verilerine hızlı, önbelleğe alınmamış, yalnızca ileri erişim sağlayan bir okuyucuyu temsil eder.

```cpp
class XmlTextReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlLineInfo,
                      public System::Xml::IXmlNamespaceResolver
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() override | [XmlReader::get_ReadState](../xmlreader/get_readstate/) değerini **Closed**'a değiştirir. |
| [get_AttributeCount](./get_attributecount/)() override | Geçerli düğümdeki öznitelik sayısını döndürür. |
| [get_BaseURI](./get_baseuri/)() override | Geçerli düğümün temel URI'sını döndürür. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | [XmlTextReader](./) nesnesinin ikili içerik okuma yöntemlerini uygulayıp uygulamadığını gösteren bir değer döndürür. |
| [get_CanReadValueChunk](./get_canreadvaluechunk/)() override | [XmlTextReader](./) nesnesinin [XmlReader::ReadValueChunk](../xmlreader/readvaluechunk/) yöntemini uygulayıp uygulamadığını gösteren bir değer döndürür. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Bu okuyucunun varlıkları ayrıştırıp çözümleyip çözemeyeceğini gösteren bir değer döndürür. |
| [get_Depth](./get_depth/)() override | XML belgesindeki geçerli düğümün derinliğini döndürür. |
| [get_DtdProcessing](./get_dtdprocessing/)() | [DtdProcessing](../dtdprocessing/) enum değerini döndürür. |
| [get_Encoding](./get_encoding/)() | Belgenin kodlamasını döndürür. |
| [get_EntityHandling](./get_entityhandling/)() | Okuyucunun varlıkları nasıl işlediğini belirten bir değer döndürür. |
| [get_EOF](./get_eof/)() override | Okuyucunun akışın sonuna konumlanıp konumlanmadığını gösteren bir değer döndürür. |
| [get_HasValue](./get_hasvalue/)() override | Geçerli düğümün [XmlTextReader::get_Value](./get_value/) değerinin [String::Empty](../../system/string/empty/) dışında bir değer alıp alamayacağını gösteren bir değer döndürür. |
| [get_IsDefault](./get_isdefault/)() override | Geçerli düğümün, DTD veya şemada tanımlanan varsayılan değerden oluşturulmuş bir öznitelik olup olmadığını gösteren bir değer döndürür. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Geçerli düğümün boş bir öğe olup olmadığını gösteren bir değer döndürür (örneğin, **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | Geçerli satır numarasını döndürür. |
| [get_LinePosition](./get_lineposition/)() override | Geçerli satır konumunu döndürür. |
| [get_LocalName](./get_localname/)() override | Geçerli düğümün yerel adını döndürür. |
| [get_Name](./get_name/)() override | Geçerli düğümün nitelikli adını döndürür. |
| [get_Namespaces](./get_namespaces/)() | Namespace desteğinin yapılacağını gösteren bir değer döndürür. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Okuyucunun konumlandığı düğümün (W3C Namespace spesifikasyonunda tanımlandığı gibi) ad alanı URI'sını döndürür. |
| [get_NameTable](./get_nametable/)() override | Bu uygulama ile ilişkili [XmlNameTable](../xmlnametable/) öğesini döndürür. |
| [get_NodeType](./get_nodetype/)() override | Geçerli düğümün tipini döndürür. |
| [get_Normalization](./get_normalization/)() | Boşluk ve öznitelik değerlerini normalleştirip normalleştirilmeyeceğini gösteren bir değer döndürür. |
| [get_Prefix](./get_prefix/)() override | Geçerli düğümle ilişkili ad alanı önekini döndürür. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | DTD işleme izin verilip verilmeyeceğini gösteren bir değer döndürür. |
| [get_QuoteChar](./get_quotechar/)() override | Öznitelik düğümünün değerini çevrelemek için kullanılan tırnak işareti karakterini döndürür. |
| [get_ReadState](./get_readstate/)() override | Okuyucunun durumunu döndürür. |
| [get_Value](./get_value/)() override | Geçerli düğümün metin değerini döndürür. |
| [get_WhitespaceHandling](./get_whitespacehandling/)() | Boşlukların nasıl işlendiğini belirten bir değer döndürür. |
| [get_XmlLang](./get_xmllang/)() override | Mevcut **xml:lang** kapsamını döndürür. |
| [get_XmlSpace](./get_xmlspace/)() override | Geçerli **xml:space** kapsamını döndürür. |
| [GetAttribute](./getattribute/)(String) override | Belirtilen ada sahip özniteliğin değerini döndürür. |
| [GetAttribute](./getattribute/)(String, String) override | Belirtilen yerel ada ve ad alanı URI'sine sahip özniteliğin değerini döndürür. |
| [GetAttribute](./getattribute/)(int32_t) override | Belirtilen indeksdeki özniteliğin değerini döndürür. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Geçerli kapsamda bulunan tüm ad alanlarını içeren bir koleksiyon döndürür. |
| [GetRemainder](./getremainder/)() | Arabelleklenmiş XML'in kalan kısmını döndürür. |
| [HasLineInfo](./haslineinfo/)() override | Sınıfın satır bilgisi döndürüp döndüremeyeceğini gösteren bir değer döndürür. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Geçerli öğenin kapsamındaki bir ad alanı önekini çözer. |
| [MoveToAttribute](./movetoattribute/)(String) override | Belirtilen ada sahip özniteliğe geçer. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Belirtilen yerel ada ve ad alanı URI'sine sahip özniteliğe geçer. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | Belirtilen indeksdeki özniteliğe geçer. |
| [MoveToElement](./movetoelement/)() override | Geçerli öznitelik düğümünü içeren öğeye geçer. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | İlk özniteliğe geçer. |
| [MoveToNextAttribute](./movetonextattribute/)() override | Sonraki özniteliğe geçer. |
| [Read](./read/)() override | Akıştan bir sonraki düğümü okur. |
| [ReadAttributeValue](./readattributevalue/)() override | Öznitelik değerini bir veya daha fazla **[Text](../../system.text/)**, **EntityReference** veya **EndEntity** düğümüne ayrıştırır. |
| [ReadBase64](./readbase64/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Base64'i çözer ve çözülen ikili baytları döndürür. |
| [ReadBinHex](./readbinhex/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | **BinHex**'i çözer ve çözülen ikili baytları döndürür. |
| [ReadChars](./readchars/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) | Bir öğenin metin içeriğini karakter tamponuna okur. Bu yöntem, gömülü metnin büyük akışlarını ardışık olarak çağırarak okumak için tasarlanmıştır. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | İçeriği okur ve **Base64** çözülen ikili baytları döndürür. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | İçeriği okur ve **BinHex** çözülen ikili baytları döndürür. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Öğeyi okur ve Base64 içeriğini çözer. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Öğeyi okur ve **BinHex** içeriğini çözer. |
| [ReadString](./readstring/)() override | Bir öğenin veya metin düğümünün içeriğini dize olarak okur. |
| [ResetState](./resetstate/)() | Okuyucunun durumunu [ReadState::Initial](../readstate/) olarak sıfırlar. |
| [ResolveEntity](./resolveentity/)() override | **EntityReference** düğümleri için varlık referansını çözer. |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | [DtdProcessing](../dtdprocessing/) enumarasyonunu ayarlar. |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | Okuyucunun varlıkları nasıl işlediğini belirten bir değeri ayarlar. |
| [set_Namespaces](./set_namespaces/)(bool) | Namespace desteğinin yapılacağını gösteren bir değeri ayarlar. |
| [set_Normalization](./set_normalization/)(bool) | Boşluk ve öznitelik değerlerini normalleştirip normalleştirilmeyeceğini gösteren bir değeri ayarlar. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | DTD işleme izin verilip verilmeyeceğini gösteren bir değeri ayarlar. |
| [set_WhitespaceHandling](./set_whitespacehandling/)(System::Xml::WhitespaceHandling) | Boşluk karakterlerinin nasıl işlendiğini belirten bir değeri ayarlar. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | DTD referanslarını çözmek için kullanılan [XmlResolver](../xmlresolver/) ayarlar. |
| [Skip](./skip/)() override | Geçerli düğümün alt öğelerini atlar. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&) | Belirtilen akış ile [XmlTextReader](./) sınıfının yeni bir örneğini başlatır. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&) | Belirtilen URL ve akış ile [XmlTextReader](./) sınıfının yeni bir örneğini başlatır. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | Belirtilen akış ve [XmlNameTable](../xmlnametable/) ile [XmlTextReader](./) sınıfının yeni bir örneğini başlatır. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | Belirtilen URL, akış ve [XmlNameTable](../xmlnametable/) ile [XmlTextReader](./) sınıfının yeni bir örneğini başlatır. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&) | Belirtilen TextReader ile [XmlTextReader](./) sınıfının yeni bir örneğini başlatır. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&) | Belirtilen URL ve TextReader ile [XmlTextReader](./) sınıfının yeni bir örneğini başlatır. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | Belirtilen TextReader ve [XmlNameTable](../xmlnametable/) ile [XmlTextReader](./) sınıfının yeni bir örneğini başlatır. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | Belirtilen URL, TextReader ve [XmlNameTable](../xmlnametable/) ile [XmlTextReader](./) sınıfının yeni bir örneğini başlatır. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Belirtilen akış, [XmlNodeType](../xmlnodetype/) ve [XmlParserContext](../xmlparsercontext/) ile [XmlTextReader](./) sınıfının yeni bir örneğini başlatır. |
| [XmlTextReader](./xmltextreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Belirtilen dize, [XmlNodeType](../xmlnodetype/) ve [XmlParserContext](../xmlparsercontext/) ile [XmlTextReader](./) sınıfının yeni bir örneğini başlatır. |
| [XmlTextReader](./xmltextreader/)(const String\&) | Belirtilen dosya ile [XmlTextReader](./) sınıfının yeni bir örneğini başlatır. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<XmlNameTable\>\&) | Belirtilen dosya ve [XmlNameTable](../xmlnametable/) ile [XmlTextReader](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bunun yerine [XmlReader](../xmlreader/) sınıfını kullanmanız önerilir.

Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
