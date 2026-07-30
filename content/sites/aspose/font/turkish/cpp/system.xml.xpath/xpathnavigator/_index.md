---
title: "System::Xml::XPath::XPathNavigator sınıfı"
linktitle: "XPathNavigator"
second_title: "Aspose.Font için C++"
description: "System::Xml::XPath::XPathNavigator sınıfı. C++'ta XML verilerini gezmek ve düzenlemek için bir imleç modeli sağlar."
type: docs
weight: 500
url: /tr/cpp/system.xml.xpath/xpathnavigator/
---
## XPathNavigator class


XML verilerini gezmek ve düzenlemek için bir imleç modeli sağlar.

```cpp
class XPathNavigator : public System::Xml::XPath::XPathItem,
                       public System::Xml::XPath::IXPathNavigable,
                       public System::Xml::IXmlNamespaceResolver
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [AppendChild](./appendchild/)() | Geçerli düğümün alt düğüm listesi sonuna bir veya daha fazla yeni alt düğüm oluşturmak için kullanılan bir [XmlWriter](../../system.xml/xmlwriter/) nesnesi döndürür. |
| virtual [AppendChild](./appendchild/)(String) | Belirtilen XML veri dizesini kullanarak geçerli düğümün alt düğüm listesi sonuna yeni bir alt düğüm oluşturur. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlReader\>) | Belirtilen [XmlReader](../../system.xml/xmlreader/) nesnesinin XML içeriğini kullanarak geçerli düğümün alt düğüm listesi sonuna yeni bir alt düğüm oluşturur. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XPathNavigator\>) | Belirtilen [XPathNavigator](./) içindeki düğümleri kullanarak geçerli düğümün alt düğüm listesi sonuna yeni bir alt düğüm oluşturur. |
| virtual [AppendChildElement](./appendchildelement/)(String, String, String, String) | Belirtilen ad alanı öneki, yerel ad ve ad alanı URI'siyle birlikte verilen değeri kullanarak geçerli düğümün alt düğüm listesi sonuna yeni bir alt öğe düğümü oluşturur. |
| virtual [CheckValidity](./checkvalidity/)(SharedPtr\<System::Xml::Schema::XmlSchemaSet\>, System::Xml::Schema::ValidationEventHandler) | Belirtilen XML [XPathNavigator](./) içindeki XML verisinin sağlanan XML [Schema](../../system.xml.schema/) tanım dili (XSD) şemasına uygun olduğunu doğrular. |
| virtual [Clone](./clone/)() | Türetilmiş bir sınıfta geçersiz kılındığında, bu [XPathNavigator](./) ile aynı düğümde konumlandırılmış yeni bir [XPathNavigator](./) oluşturur. |
| virtual [ComparePosition](./compareposition/)(SharedPtr\<XPathNavigator\>) | Geçerli [XPathNavigator](./) konumunu belirtilen [XPathNavigator](./) konumuyla karşılaştırır. |
| virtual [Compile](./compile/)(String) | Bir [XPath](../) ifadesini temsil eden bir dizeyi derler ve bir [XPathExpression](../xpathexpression/) nesnesi döndürür. |
| virtual [CreateAttribute](./createattribute/)(String, String, String, String) | Geçerli öğe düğümünde, belirtilen ad alanı öneki, yerel ad ve ad alanı URI'si ile belirtilen değeri kullanarak bir öznitelik düğümü oluşturur. |
| virtual [CreateAttributes](./createattributes/)() | Geçerli öğe üzerinde yeni öznitelikler oluşturmak için kullanılan bir [XmlWriter](../../system.xml/xmlwriter/) nesnesi döndürür. |
| [CreateNavigator](./createnavigator/)() override | [XPathNavigator](./) nesnesinin bir kopyasını döndürür. |
| virtual [DeleteRange](./deleterange/)(SharedPtr\<XPathNavigator\>) | Geçerli düğümden belirtilen düğüme kadar olan bir dizi kardeş düğümü siler. |
| virtual [DeleteSelf](./deleteself/)() | Geçerli düğümü ve onun alt düğümlerini siler. |
| virtual [Evaluate](./evaluate/)(String) | Belirtilen [XPath](../) ifadesini değerlendirir ve tiplenmiş sonucu döndürür. |
| virtual [Evaluate](./evaluate/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Belirtilen [XPath](../) ifadesini değerlendirir ve tiplenmiş sonucu döndürür; [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) nesnesini kullanarak [XPath](../) ifadesindeki ad alanı öneklerini çözer. |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>) | [XPathExpression](../xpathexpression/) ifadesini değerlendirir ve tiplenmiş sonucu döndürür. |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) | Sağlanan bağlamı kullanarak [XPathExpression](../xpathexpression/) ifadesini değerlendirir ve tiplenmiş sonucu döndürür. |
| virtual [get_BaseURI](./get_baseuri/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğüm için temel URI'yi alır. |
| virtual [get_CanEdit](./get_canedit/)() | [XPathNavigator](./) nesnesinin temel XML verisini düzenleyip düzenleyemeyeceğini gösteren bir değer döndürür. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Geçerli düğümün herhangi bir özniteliği olup olmadığını gösteren bir değer döndürür. |
| virtual [get_HasChildren](./get_haschildren/)() | Geçerli düğümün herhangi bir alt düğümü olup olmadığını gösteren bir değer döndürür. |
| virtual [get_InnerXml](./get_innerxml/)() | Geçerli düğümün alt düğümlerini temsil eden işaretlemeyi döndürür. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün kapanış etiketi olmayan boş bir öğe olup olmadığını gösteren bir değer alır. |
| [get_IsNode](./get_isnode/)() override | Geçerli düğümün bir [XPath](../) düğümünü temsil edip etmediğini gösteren bir değer döndürür. |
| virtual [get_LocalName](./get_localname/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün ad alanı öneki olmadan [XPathNavigator::get_Name](./get_name/) değerini alır. |
| virtual [get_Name](./get_name/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün nitelikli adını alır. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün ad alanı URI'sini alır. |
| virtual [get_NameTable](./get_nametable/)() | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](./) nesnesinin [XmlNameTable](../../system.xml/xmlnametable/) değerini alır. |
| static [get_NavigatorComparer](./get_navigatorcomparer/)() | [XPathNavigator](./) nesnelerinin eşitlik karşılaştırması için kullanılan bir [Collections::IEqualityComparer](../../system.collections/iequalitycomparer/) döndürür. |
| virtual [get_NodeType](./get_nodetype/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün [XPathNodeType](../xpathnodetype/) değerini alır. |
| virtual [get_OuterXml](./get_outerxml/)() | Geçerli düğümün ve alt düğümlerinin açılış ve kapanış etiketlerini temsil eden işaretlemeyi döndürür. |
| virtual [get_Prefix](./get_prefix/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümle ilişkili ad alanı önekini alır. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Şema doğrulaması sonucunda geçerli düğüme atanmış şema bilgilerini döndürür. |
| [get_TypedValue](./get_typedvalue/)() override | Geçerli düğümü en uygun tipte bir kutulanmış nesne olarak döndürür. |
| virtual [get_UnderlyingObject](./get_underlyingobject/)() | Depo üzerinde "sanallaştırılmış" bir XML görünümü sağlayan [XPathNavigator](./) uygulamaları tarafından, temel nesnelere erişim sağlamak için kullanılır. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | Geçerli düğümün değerini bir [Boolean](../../system/boolean/) olarak döndürür. |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | Geçerli düğümün değerini bir [DateTime](../../system/datetime/) olarak döndürür. |
| [get_ValueAsDouble](./get_valueasdouble/)() override | Geçerli düğümün değerini bir [Double](../../system/double/) olarak döndürür. |
| [get_ValueAsInt](./get_valueasint/)() override | Geçerli düğümün değerini bir [Int32](../../system/int32/) olarak döndürür. |
| [get_ValueAsLong](./get_valueaslong/)() override | Geçerli düğümün değerini bir [Int64](../../system/int64/) olarak döndürür. |
| [get_ValueType](./get_valuetype/)() override | Geçerli düğümün tipini döndürür. |
| virtual [get_XmlLang](./get_xmllang/)() | Geçerli düğüm için **xml:lang** kapsamını döndürür. |
| [get_XmlType](./get_xmltype/)() override | Geçerli düğüm için XmlSchemaType bilgisini döndürür. |
| virtual [GetAttribute](./getattribute/)(String, String) | Belirtilen yerel ada ve ad alanı URI'sine sahip özniteliğin değerini döndürür. |
| virtual [GetNamespace](./getnamespace/)(String) | Belirtilen yerel ada karşılık gelen ad alanı düğümünün değerini döndürür. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Geçerli düğümün kapsam içindeki ad alanlarını döndürür. |
| virtual [InsertAfter](./insertafter/)() | Seçili düğümün ardından yeni bir kardeş düğüm oluşturmak için kullanılan bir [XmlWriter](../../system.xml/xmlwriter/) nesnesini döndürür. |
| virtual [InsertAfter](./insertafter/)(String) | Belirtilen XML dizesini kullanarak seçili düğümün ardından yeni bir kardeş düğüm oluşturur. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlReader\>) | Belirtilen [XmlReader](../../system.xml/xmlreader/) nesnesinin XML içeriğini kullanarak seçili düğümün ardından yeni bir kardeş düğüm oluşturur. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XPathNavigator\>) | Belirtilen [XPathNavigator](./) nesnesindeki düğümleri kullanarak seçili düğümün ardından yeni bir kardeş düğüm oluşturur. |
| virtual [InsertBefore](./insertbefore/)() | Seçili düğümün önüne yeni bir kardeş düğüm oluşturmak için kullanılan bir [XmlWriter](../../system.xml/xmlwriter/) nesnesini döndürür. |
| virtual [InsertBefore](./insertbefore/)(String) | Belirtilen XML dizesini kullanarak seçili düğümün önüne yeni bir kardeş düğüm oluşturur. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlReader\>) | Belirtilen [XmlReader](../../system.xml/xmlreader/) nesnesinin XML içeriğini kullanarak seçili düğümün önüne yeni bir kardeş düğüm oluşturur. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XPathNavigator\>) | Belirtilen [XPathNavigator](./) nesnesindeki düğümleri kullanarak seçili düğümün önüne yeni bir kardeş düğüm oluşturur. |
| virtual [InsertElementAfter](./insertelementafter/)(String, String, String, String) | Belirtilen ad alanı öneki, yerel ad ve ad alanı URI'sini kullanarak, belirtilen değerle mevcut düğümün ardından yeni bir kardeş öğe oluşturur. |
| virtual [InsertElementBefore](./insertelementbefore/)(String, String, String, String) | Belirtilen ad alanı öneki, yerel ad ve ad alanı URI'sini kullanarak, belirtilen değerle mevcut düğümün önüne yeni bir kardeş öğe oluşturur. |
| virtual [IsDescendant](./isdescendant/)(SharedPtr\<XPathNavigator\>) | Belirtilen [XPathNavigator](./) nesnesinin geçerli [XPathNavigator](./) nesnesinin bir alt öğesi olup olmadığını belirler. |
| virtual [IsSamePosition](./issameposition/)(SharedPtr\<XPathNavigator\>) | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli [XPathNavigator](./) nesnesinin belirtilen [XPathNavigator](./) nesnesiyle aynı konumda olup olmadığını belirler. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Belirtilen önek için ad alanı URI'sini döndürür. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Belirtilen ad alanı URI'si için bildirilen önek'i döndürür. |
| virtual [Matches](./matches/)(SharedPtr\<XPathExpression\>) | Geçerli düğümün belirtilen [XPathExpression](../xpathexpression/) ile eşleşip eşleşmediğini belirler. |
| virtual [Matches](./matches/)(String) | Geçerli düğümün belirtilen [XPath](../) ifadesiyle eşleşip eşleşmediğini belirler. |
| virtual [MoveTo](./moveto/)(SharedPtr\<XPathNavigator\>) | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](./) öğesini belirtilen [XPathNavigator](./) ile aynı konuma taşır. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | [XPathNavigator](./) öğesini eşleşen yerel ad ve ad alanı URI'sine sahip niteliğe taşır. |
| virtual [MoveToChild](./movetochild/)(String, String) | [XPathNavigator](./) öğesini belirtilen yerel ad ve ad alanı URI'sine sahip alt düğüme taşır. |
| virtual [MoveToChild](./movetochild/)(XPathNodeType) | [XPathNavigator](./) öğesini belirtilen [XPathNodeType](../xpathnodetype/) alt düğümüne taşır. |
| virtual [MoveToFirst](./movetofirst/)() | [XPathNavigator](./) öğesini geçerli düğümün ilk kardeş düğümüne taşır. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](./) öğesini geçerli düğümün ilk niteliğine taşır. |
| virtual [MoveToFirstChild](./movetofirstchild/)() | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](./) öğesini geçerli düğümün ilk alt düğümüne taşır. |
| virtual [MoveToFirstNamespace](./movetofirstnamespace/)(XPathNamespaceScope) | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](./) öğesini belirtilen [XPathNamespaceScope](../xpathnamespacescope/) ile eşleşen ilk ad alanı düğümüne taşır. |
| [MoveToFirstNamespace](./movetofirstnamespace/)() | [XPathNavigator](./) öğesini geçerli düğümün ilk ad alanı düğümüne taşır. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String) | [XPathNavigator](./) öğesini belge sırasına göre belirtilen yerel ad ve ad alanı URI'sine sahip öğeye taşır. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String, SharedPtr\<XPathNavigator\>) | [XPathNavigator](./) öğesini belge sırasına göre belirtilen yerel ad ve ad alanı URI'sine sahip öğeye, belirtilen sınıra kadar taşır. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType) | [XPathNavigator](./) öğesini belge sırasına göre belirtilen [XPathNodeType](../xpathnodetype/) sonraki öğesine taşır. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType, SharedPtr\<XPathNavigator\>) | [XPathNavigator](./) öğesini belge sırasına göre belirtilen [XPathNodeType](../xpathnodetype/) sonraki öğesine, belirtilen sınıra kadar taşır. |
| virtual [MoveToId](./movetoid/)(String) | Türetilmiş bir sınıfta geçersiz kılındığında, değeri belirtilen [String](../../system/string/) ile eşleşen **ID** tipinde bir niteliğe sahip düğüme taşır. |
| virtual [MoveToNamespace](./movetonamespace/)(String) | [XPathNavigator](./) öğesini belirtilen ad alanı önekiyle ad alanı düğümüne taşır. |
| virtual [MoveToNext](./movetonext/)() | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](./) öğesini geçerli düğümün sonraki kardeş düğümüne taşır. |
| virtual [MoveToNext](./movetonext/)(String, String) | [XPathNavigator](./) öğesini belirtilen yerel ad ve ad alanı URI'sine sahip sonraki kardeş düğüme taşır. |
| virtual [MoveToNext](./movetonext/)(XPathNodeType) | [XPathNavigator](./) öğesini geçerli düğümün belirtilen [XPathNodeType](../xpathnodetype/) ile eşleşen sonraki kardeş düğümüne taşır. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](./) öğesini sonraki niteliğe taşır. |
| virtual [MoveToNextNamespace](./movetonextnamespace/)(XPathNamespaceScope) | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](./) öğesini belirtilen [XPathNamespaceScope](../xpathnamespacescope/) ile eşleşen sonraki ad alanı düğümüne taşır. |
| [MoveToNextNamespace](./movetonextnamespace/)() | [XPathNavigator](./) öğesini sonraki ad alanı düğümüne taşır. |
| virtual [MoveToParent](./movetoparent/)() | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](./) öğesini geçerli düğümün üst düğümüne taşır. |
| virtual [MoveToPrevious](./movetoprevious/)() | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](./) öğesini geçerli düğümün önceki kardeş düğümüne taşır. |
| virtual [MoveToRoot](./movetoroot/)() | [XPathNavigator](./) öğesini geçerli düğümün ait olduğu kök düğüme taşır. |
| virtual [PrependChild](./prependchild/)() | Geçerli düğümün alt düğüm listesine baştan yeni bir alt düğüm oluşturmak için kullanılan bir [XmlWriter](../../system.xml/xmlwriter/) nesnesi döndürür. |
| virtual [PrependChild](./prependchild/)(String) | Belirtilen XML dizesini kullanarak geçerli düğümün alt düğüm listesinin başına yeni bir alt düğüm oluşturur. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlReader\>) | Belirtilen [XmlReader](../../system.xml/xmlreader/) nesnesinin XML içeriğini kullanarak geçerli düğümün alt düğüm listesinin başına yeni bir alt düğüm oluşturur. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XPathNavigator\>) | Belirtilen [XPathNavigator](./) nesnesindeki düğümleri kullanarak geçerli düğümün alt düğüm listesinin başına yeni bir alt düğüm oluşturur. |
| virtual [PrependChildElement](./prependchildelement/)(String, String, String, String) | Belirtilen ad alanı öneki, yerel ad ve ad alanı URI'si ile verilen değeri kullanarak geçerli düğümün alt düğüm listesinin başına yeni bir alt öğe oluşturur. |
| virtual [ReadSubtree](./readsubtree/)() | Geçerli düğüm ve onun alt düğümlerini içeren bir [XmlReader](../../system.xml/xmlreader/) nesnesi döndürür. |
| virtual [ReplaceRange](./replacerange/)(SharedPtr\<XPathNavigator\>) | Geçerli düğümden belirtilen düğüme kadar olan bir dizi kardeş düğümü değiştirir. |
| virtual [ReplaceSelf](./replaceself/)(String) | Geçerli düğümü belirtilen dizedeki içerikle değiştirir. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XmlReader\>) | Geçerli düğümü belirtilen [XmlReader](../../system.xml/xmlreader/) nesnesinin içeriğiyle değiştirir. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XPathNavigator\>) | Geçerli düğümü belirtilen [XPathNavigator](./) nesnesinin içeriğiyle değiştirir. |
| virtual [Select](./select/)(String) | Belirtilen [XPath](../) ifadesini kullanarak bir düğüm kümesi seçer. |
| virtual [Select](./select/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Belirtilen [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) nesnesiyle ad alanı öneklerini çözmek için belirtilen [XPath](../) ifadesini kullanarak bir düğüm kümesi seçer. |
| virtual [Select](./select/)(SharedPtr\<XPathExpression\>) | Belirtilen [XPathExpression](../xpathexpression/) ifadesini kullanarak bir düğüm kümesi seçer. |
| virtual [SelectAncestors](./selectancestors/)(XPathNodeType, bool) | Geçerli düğümün eşleşen bir [XPathNodeType](../xpathnodetype/) türüne sahip tüm üst düğümlerini seçer. |
| virtual [SelectAncestors](./selectancestors/)(String, String, bool) | Geçerli düğümün belirtilen yerel ada ve ad alanı URI'sine sahip tüm üst düğümlerini seçer. |
| virtual [SelectChildren](./selectchildren/)(XPathNodeType) | Geçerli düğümün eşleşen bir [XPathNodeType](../xpathnodetype/) türüne sahip tüm alt düğümlerini seçer. |
| virtual [SelectChildren](./selectchildren/)(String, String) | Geçerli düğümün belirtilen yerel ada ve ad alanı URI'sine sahip tüm alt düğümlerini seçer. |
| virtual [SelectDescendants](./selectdescendants/)(XPathNodeType, bool) | Geçerli düğümün eşleşen bir [XPathNodeType](../xpathnodetype/) türüne sahip tüm alt düğümlerini seçer. |
| virtual [SelectDescendants](./selectdescendants/)(String, String, bool) | Geçerli düğümün belirtilen yerel ada ve ad alanı URI'sine sahip tüm alt düğümlerini seçer. |
| virtual [SelectSingleNode](./selectsinglenode/)(String) | Belirtilen [XPath](../) sorgusunu kullanarak [XPathNavigator](./) içinde tek bir düğüm seçer. |
| virtual [SelectSingleNode](./selectsinglenode/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Belirtilen [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) nesnesiyle ad alanı öneklerini çözmek için belirtilen [XPath](../) sorgusunu kullanarak [XPathNavigator](./) nesnesinde tek bir düğüm seçer. |
| virtual [SelectSingleNode](./selectsinglenode/)(SharedPtr\<XPathExpression\>) | Belirtilen [XPathExpression](../xpathexpression/) nesnesini kullanarak [XPathNavigator](./) içinde tek bir düğüm seçer. |
| virtual [set_InnerXml](./set_innerxml/)(String) | Geçerli düğümün alt düğümlerini temsil eden işaretlemeyi ayarlar. |
| virtual [set_OuterXml](./set_outerxml/)(String) | Geçerli düğümün ve alt düğümlerinin açılış ve kapanış etiketlerini temsil eden işaretlemeyi ayarlar. |
| virtual [SetTypedValue](./settypedvalue/)(SharedPtr\<Object\>) | Geçerli düğümün tiplenmiş değerini ayarlar. |
| virtual [SetValue](./setvalue/)(String) | Geçerli düğümün değerini ayarlar. |
| [ToString](./tostring/)() const override | Geçerli düğümün metin değerini döndürür. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | Belirtilen türde, geçerli düğümün değerini, ad alanı öneklerini çözmek için belirtilen [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) nesnesini kullanarak döndürür. |
| virtual [WriteSubtree](./writesubtree/)(SharedPtr\<XmlWriter\>) | Geçerli düğümü ve onun alt düğümlerini belirtilen [XmlWriter](../../system.xml/xmlwriter/) nesnesine akıtır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Ayrıca Bakınız

* Class [XPathItem](../xpathitem/)
* Class [IXPathNavigable](../ixpathnavigable/)
* Class [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
