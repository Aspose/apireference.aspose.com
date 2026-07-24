---
title: "System::Xml::XmlDocument sınıfı"
linktitle: "XmlDocument"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlDocument sınıfı. Bir XML belgesini temsil eder. Bu sınıfı C++'ta bir belgede XML'i yüklemek, doğrulamak, düzenlemek, eklemek ve konumlandırmak için kullanabilirsiniz."
type: docs
weight: 1400
url: /tr/cpp/system.xml/xmldocument/
---
## XmlDocument class


Bir XML belgesini temsil eder. Bu sınıfı bir belgede XML'yi yüklemek, doğrulamak, düzenlemek, eklemek ve konumlandırmak için kullanabilirsiniz.

```cpp
class XmlDocument : public System::Xml::XmlNode
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Bu düğümün bir kopyasını oluşturur. |
| [CreateAttribute](./createattribute/)(const String\&) | Belirtilen adla bir [XmlAttribute](../xmlattribute/) oluşturur. |
| [CreateAttribute](./createattribute/)(const String\&, const String\&) | Belirtilen nitelikli ad ve [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) ile bir [XmlAttribute](../xmlattribute/) oluşturur. |
| virtual [CreateAttribute](./createattribute/)(const String\&, const String\&, const String\&) | Belirtilen [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_LocalName](./get_localname/) ve [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) ile bir [XmlAttribute](../xmlattribute/) oluşturur. |
| virtual [CreateCDataSection](./createcdatasection/)(const String\&) | Belirtilen veriyi içeren bir [XmlCDataSection](../xmlcdatasection/) oluşturur. |
| virtual [CreateComment](./createcomment/)(const String\&) | Belirtilen veriyi içeren bir [XmlComment](../xmlcomment/) oluşturur. |
| virtual [CreateDocumentFragment](./createdocumentfragment/)() | Bir [XmlDocumentFragment](../xmldocumentfragment/) oluşturur. |
| virtual [CreateDocumentType](./createdocumenttype/)(const String\&, const String\&, const String\&, const String\&) | Yeni bir [XmlDocumentType](../xmldocumenttype/) nesnesi döndürür. |
| [CreateElement](./createelement/)(const String\&) | Belirtilen adla bir öğe oluşturur. |
| [CreateElement](./createelement/)(const String\&, const String\&) | Nitelikli ad ve [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) ile bir [XmlElement](../xmlelement/) oluşturur. |
| virtual [CreateElement](./createelement/)(const String\&, const String\&, const String\&) | Belirtilen [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_LocalName](./get_localname/) ve [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) ile bir öğe oluşturur. |
| virtual [CreateEntityReference](./createentityreference/)(const String\&) | Belirtilen adla bir [XmlEntityReference](../xmlentityreference/) oluşturur. |
| [CreateNavigator](./createnavigator/)() override | Bu belgeyi gezmek için yeni bir XPathNavigator nesnesi oluşturur. |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&, const String\&) | Belirtilen [XmlNodeType](../xmlnodetype/), [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_Name](./get_name/) ve [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) ile bir [XmlNode](../xmlnode/) oluşturur. |
| virtual [CreateNode](./createnode/)(const String\&, const String\&, const String\&) | Belirtilen düğüm türü, [XmlDocument::get_Name](./get_name/) ve [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) ile bir [XmlNode](../xmlnode/) oluşturur. |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&) | Belirtilen [XmlNodeType](../xmlnodetype/), [XmlDocument::get_Name](./get_name/) ve [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) ile bir [XmlNode](../xmlnode/) oluşturur. |
| virtual [CreateProcessingInstruction](./createprocessinginstruction/)(const String\&, const String\&) | Belirtilen ad ve veriyle bir [XmlProcessingInstruction](../xmlprocessinginstruction/) oluşturur. |
| virtual [CreateSignificantWhitespace](./createsignificantwhitespace/)(const String\&) | Bir [XmlSignificantWhitespace](../xmlsignificantwhitespace/) düğümü oluşturur. |
| virtual [CreateTextNode](./createtextnode/)(const String\&) | Belirtilen metinle bir [XmlText](../xmltext/) oluşturur. |
| virtual [CreateWhitespace](./createwhitespace/)(const String\&) | [XmlWhitespace](../xmlwhitespace/) düğümü oluşturur. |
| virtual [CreateXmlDeclaration](./createxmldeclaration/)(const String\&, const String\&, const String\&) | Belirtilen değerlerle bir [XmlDeclaration](../xmldeclaration/) düğümü oluşturur. |
| [get_BaseURI](./get_baseuri/)() override | Geçerli düğümün temel URI'sını döndürür. |
| [get_DocumentElement](./get_documentelement/)() | Belge için kök [XmlElement](../xmlelement/) döndürür. |
| virtual [get_DocumentType](./get_documenttype/)() | DOCTYPE bildirimi içeren düğümü döndürür. |
| [get_Implementation](./get_implementation/)() | Geçerli belge için [XmlImplementation](../xmlimplementation/) nesnesini döndürür. |
| [get_InnerXml](./get_innerxml/)() override | Geçerli düğümün çocuklarını temsil eden işaretlemeyi döndürür. |
| [get_IsReadOnly](./get_isreadonly/)() override | Geçerli düğümün yalnızca okunur olup olmadığını gösteren bir değer döndürür. |
| [get_LocalName](./get_localname/)() override | Düğümün yerel adını döndürür. |
| [get_Name](./get_name/)() override | Düğümün nitelikli adını döndürür. |
| [get_NameTable](./get_nametable/)() | Bu uygulama ile ilişkili [XmlNameTable](../xmlnametable/) nesnesini döndürür. |
| [get_NodeType](./get_nodetype/)() override | Geçerli düğümün tipini döndürür. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Geçerli düğümün ait olduğu [XmlDocument](./) döndürür. |
| [get_PreserveWhitespace](./get_preservewhitespace/)() | Eleman içeriğinde boşlukların korunup korunmayacağını gösteren bir değer döndürür. |
| [get_SchemaInfo](./get_schemainfo/)() override | Düğümün Post-Schema-Validation-Infoset (PSVI) değerini döndürür. |
| [get_Schemas](./get_schemas/)() | Bu [XmlDocument](./) ile ilişkili XmlSchemaSet nesnesini döndürür. |
| virtual [GetElementById](./getelementbyid/)(String) | Belirtilen ID'ye sahip [XmlElement](../xmlelement/) döndürür. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | Belirtilen ada uyan tüm alt öğelerin bir listesini içeren bir [XmlNodeList](../xmlnodelist/) döndürür. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | Belirtilen [XmlDocument::get_LocalName](./get_localname/) ve [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) ile eşleşen tüm alt öğelerin bir listesini içeren bir [XmlNodeList](../xmlnodelist/) döndürür. |
| virtual [ImportNode](./importnode/)(SharedPtr\<XmlNode\>, bool) | Başka bir belgeden bir düğümü geçerli belgeye aktarır. |
| virtual [Load](./load/)(String) | XML belgesini belirtilen URL'den yükler. |
| virtual [Load](./load/)(SharedPtr\<IO::Stream\>) | XML belgesini belirtilen akıştan yükler. |
| virtual [Load](./load/)(SharedPtr\<IO::TextReader\>) | XML belgesini belirtilen TextReader'dan yükler. |
| virtual [Load](./load/)(SharedPtr\<XmlReader\>) | XML belgesini belirtilen [XmlReader](../xmlreader/) üzerinden yükler. |
| virtual [LoadXml](./loadxml/)(String) | XML belgesini belirtilen dizeden yükler. |
| virtual [ReadNode](./readnode/)(SharedPtr\<XmlReader\>) | [XmlReader](../xmlreader/) içindeki bilgilere dayanarak bir [XmlNode](../xmlnode/) nesnesi oluşturur. Okuyucu bir düğüm veya öznitelik üzerinde konumlandırılmış olmalıdır. |
| virtual [Save](./save/)(String) | XML belgesini belirtilen dosyaya kaydeder. Belirtilen dosya zaten varsa, bu yöntem onu üzerine yazar. |
| virtual [Save](./save/)(SharedPtr\<IO::Stream\>) | XML belgesini belirtilen akışa kaydeder. |
| virtual [Save](./save/)(SharedPtr\<IO::TextWriter\>) | XML belgesini belirtilen TextWriter'a kaydeder. |
| virtual [Save](./save/)(SharedPtr\<XmlWriter\>) | Belirtilen [XmlWriter](../xmlwriter/) ile XML belgesini kaydeder. |
| [set_InnerText](./set_innertext/)(String) override | Her durumda bir InvalidOperationException fırlatır. |
| [set_InnerXml](./set_innerxml/)(String) override | Geçerli düğümün çocuklarını temsil eden işaretlemeyi ayarlar. |
| [set_PreserveWhitespace](./set_preservewhitespace/)(bool) | Eleman içeriğinde boşlukların korunup korunmayacağını gösteren bir değeri ayarlar. |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | Bu [XmlDocument](./) ile ilişkili XmlSchemaSet nesnesini ayarlar. |
| virtual [set_XmlResolver](./set_xmlresolver/)(SharedPtr\<System::Xml::XmlResolver\>) | Harici kaynakları çözümlemek için kullanılacak [XmlResolver](../xmlresolver/) ayarlar. |
| [Validate](./validate/)(Schema::ValidationEventHandler) | [XmlDocument](./) belgesini, [XmlDocument::get_Schemas](./get_schemas/) listesinde bulunan XML [Schema](../../system.xml.schema/) Tanım Dili (XSD) şemalarına karşı doğrular. |
| [Validate](./validate/)(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) | Belirtilen [XmlNode](../xmlnode/) nesnesini, [XmlDocument::get_Schemas](./get_schemas/) listesindeki XML [Schema](../../system.xml.schema/) Tanım Dili (XSD) şemalarına karşı doğrular. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | [XmlDocument](./) düğümünün tüm çocuklarını belirtilen [XmlWriter](../xmlwriter/) ile kaydeder. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | [XmlDocument](./) düğümünü belirtilen [XmlWriter](../xmlwriter/) ile kaydeder. |
| [XmlDocument](./xmldocument/)() | Yeni bir [XmlDocument](./) sınıfı örneğini başlatır. |
| [XmlDocument](./xmldocument/)(const SharedPtr\<XmlNameTable\>\&) | Belirtilen [XmlNameTable](../xmlnametable/) ile yeni bir [XmlDocument](./) sınıfı örneği başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
