---
title: "System::Xml::XmlNode sınıfı"
linktitle: "XmlNode"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNode sınıfı. C++'ta XML belgesindeki tek bir düğümü temsil eder."
type: docs
weight: 2500
url: /tr/cpp/system.xml/xmlnode/
---
## XmlNode class


XML belgesindeki tek bir düğümü temsil eder.

```cpp
class XmlNode : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>,
                public System::Xml::XPath::IXPathNavigable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) | Belirtilen düğümü bu düğümün alt düğüm listesine sonuna ekler. |
| virtual [Clone](./clone/)() | Bu düğümün bir kopyasını oluşturur. |
| virtual [CloneNode](./clonenode/)(bool) | Türetilmiş bir sınıfta geçersiz kılındığında düğümün bir kopyasını oluşturur. |
| [CreateNavigator](./createnavigator/)() override | Bu nesneyi gezinmek için bir XPathNavigator oluşturur. |
| virtual [get_Attributes](./get_attributes/)() | Bu düğümün özniteliklerini içeren bir [XmlAttributeCollection](../xmlattributecollection/) döndürür. |
| virtual [get_BaseURI](./get_baseuri/)() | Geçerli düğümün temel URI'sını döndürür. |
| virtual [get_ChildNodes](./get_childnodes/)() | Düğümün tüm alt düğümlerini döndürür. |
| virtual [get_FirstChild](./get_firstchild/)() | Düğümün ilk alt düğümünü döndürür. |
| virtual [get_HasChildNodes](./get_haschildnodes/)() | Bu düğümün herhangi bir alt düğümü olup olmadığını gösteren bir değer döndürür. |
| virtual [get_InnerText](./get_innertext/)() | Düğümün ve tüm alt düğümlerinin birleştirilmiş değerlerini döndürür. |
| virtual [get_InnerXml](./get_innerxml/)() | Bu düğümün yalnızca alt düğümlerini temsil eden işaretlemeyi döndürür. |
| virtual [get_IsReadOnly](./get_isreadonly/)() | Düğümün yalnızca okunur olup olmadığını gösteren bir değer döndürür. |
| virtual [get_LastChild](./get_lastchild/)() | Düğümün son alt düğümünü döndürür. |
| virtual [get_LocalName](./get_localname/)() | Türetilmiş bir sınıfta geçersiz kılındığında düğümün yerel adını döndürür. |
| virtual [get_Name](./get_name/)() | Türetilmiş bir sınıfta geçersiz kılındığında düğümün nitelikli adını döndürür. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Bu düğümün ad alanı URI'sını döndürür. |
| virtual [get_NextSibling](./get_nextsibling/)() | Bu düğümün hemen ardından gelen düğümü döndürür. |
| virtual [get_NodeType](./get_nodetype/)() | Türetilmiş bir sınıfta geçersiz kılındığında geçerli düğümün tipini döndürür. |
| virtual [get_OuterXml](./get_outerxml/)() | Bu düğümü ve tüm alt düğümlerini içeren işaretlemeyi döndürür. |
| virtual [get_OwnerDocument](./get_ownerdocument/)() | Bu düğümün ait olduğu [XmlDocument](../xmldocument/) öğesini döndürür. |
| virtual [get_ParentNode](./get_parentnode/)() | Bu düğümün ebeveynini döndürür (ebeveyni olabilen düğümler için). |
| virtual [get_Prefix](./get_prefix/)() | Bu düğümün ad alanı önekini döndürür. |
| virtual [get_PreviousSibling](./get_previoussibling/)() | Bu düğümün hemen öncesindeki düğümü döndürür. |
| virtual [get_PreviousText](./get_previoustext/)() | Bu düğümden hemen önce gelen metin düğümünü döndürür. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Şema doğrulaması sonucunda bu düğüme atanan post-şema doğrulama bilgi kümesini döndürür. |
| virtual [get_Value](./get_value/)() | Düğümün değerini döndürür. |
| [GetEnumerator](./getenumerator/)() override | Geçerli düğümdeki alt düğümler arasında yineleme yapan bir enumeratör döndürür. |
| virtual [GetNamespaceOfPrefix](./getnamespaceofprefix/)(String) | Geçerli düğüm için kapsam içinde olan verilen önek için en yakın **xmlns** bildirimini bulur ve bildirimin içindeki ad alanı URI'sını döndürür. |
| virtual [GetPrefixOfNamespace](./getprefixofnamespace/)(String) | Geçerli düğüm için kapsam içinde olan verilen ad alanı URI'si için en yakın **xmlns** bildirimini bulur ve bu bildirimin tanımladığı öneki döndürür. |
| virtual [idx_get](./idx_get/)(String) | Belirtilen [XmlNode::get_Name](./get_name/) ile ilk alt öğeyi döndürür. |
| virtual [idx_get](./idx_get/)(String, String) | Belirtilen [XmlNode::get_LocalName](./get_localname/) ve [XmlNode::get_NamespaceURI](./get_namespaceuri/) değerlerine sahip ilk alt öğeyi döndürür. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Belirtilen düğümü, belirtilen referans düğümünden hemen sonra ekler. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Belirtilen düğümü, belirtilen referans düğümünden hemen önce ekler. |
| virtual [Normalize](./normalize/)() | Bu [XmlNode](./) altındaki alt ağacın tam derinliğindeki tüm [XmlText](../xmltext/) düğümlerini, yalnızca işaretleme (yani etiketler, yorumlar, işlem talimatları, CDATA bölümleri ve varlık referansları) [XmlText](../xmltext/) düğümlerini ayırdığı bir \"normal\" forma koyar; yani yan yana [XmlText](../xmltext/) düğümü bulunmaz. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) | Belirtilen düğümü, bu düğümün alt düğüm listesine başa ekler. |
| virtual [RemoveAll](./removeall/)() | Geçerli düğümün tüm alt düğümlerini ve/veya özniteliklerini kaldırır. |
| virtual [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) | Belirtilen alt düğümü kaldırır. |
| virtual [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Alt düğüm **oldChild**'ı **newChild** düğümüyle değiştirir. |
| [SelectNodes](./selectnodes/)(const String\&) | İfade edilen [XPath](../../system.xml.xpath/) ifadesiyle eşleşen düğüm listesini seçer. |
| [SelectNodes](./selectnodes/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | İfade edilen [XPath](../../system.xml.xpath/) ifadesiyle eşleşen düğüm listesini seçer. [XPath](../../system.xml.xpath/) ifadesinde bulunan tüm önekler, sağlanan [XmlNamespaceManager](../xmlnamespacemanager/) kullanılarak çözülür. |
| [SelectSingleNode](./selectsinglenode/)(const String\&) | İfade edilen [XPath](../../system.xml.xpath/) ifadesiyle eşleşen ilk [XmlNode](./) öğesini seçer. |
| [SelectSingleNode](./selectsinglenode/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | İfade edilen [XPath](../../system.xml.xpath/) ifadesiyle eşleşen ilk [XmlNode](./) öğesini seçer. [XPath](../../system.xml.xpath/) ifadesinde bulunan tüm önekler, sağlanan [XmlNamespaceManager](../xmlnamespacemanager/) kullanılarak çözülür. |
| virtual [set_InnerText](./set_innertext/)(String) | Düğümün ve tüm alt düğümlerinin birleştirilmiş değerlerini ayarlar. |
| virtual [set_InnerXml](./set_innerxml/)(String) | Bu düğümün yalnızca alt düğümlerini temsil eden işaretlemeyi ayarlar. |
| virtual [set_Prefix](./set_prefix/)(String) | Bu düğümün ad alanı önekini ayarlar. |
| virtual [set_Value](./set_value/)(String) | Düğümün değerini ayarlar. |
| virtual [Supports](./supports/)(String, String) | DOM uygulamasının belirli bir özelliği uygulayıp uygulamadığını test eder. |
| virtual [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) | Türetilmiş bir sınıfta geçersiz kılındığında, düğümün tüm alt düğümlerini belirtilen [XmlWriter](../xmlwriter/) ile kaydeder. |
| virtual [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümü belirtilen [XmlWriter](../xmlwriter/) ile kaydeder. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Ayrıca Bakınız

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Class [IXPathNavigable](../../system.xml.xpath/ixpathnavigable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
