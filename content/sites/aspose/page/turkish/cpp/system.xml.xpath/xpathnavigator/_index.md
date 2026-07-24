---
title: "System::Xml::XPath::XPathNavigator class"
linktitle: "XPathNavigator"
second_title: "Aspose.Page için C++"
description: "System::Xml::XPath::XPathNavigator sınıfı. C++'de XML verilerini gezmek ve düzenlemek için bir imleç modeli sağlar."
type: docs
weight: 500
url: /tr/cpp/system.xml.xpath/xpathnavigator/
---
## XPathNavigator class


XML verilerini gezinmek ve düzenlemek için bir imleç modeli sağlar.

```cpp
class XPathNavigator : public System::Xml::XPath::XPathItem,
                       public System::Xml::XPath::IXPathNavigable,
                       public System::Xml::IXmlNamespaceResolver
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [AppendChild](./appendchild/)() | Mevcut düğümün alt düğüm listesinin sonuna bir veya daha fazla yeni alt düğüm oluşturmak için kullanılan bir [XmlWriter](../../system.xml/xmlwriter/) nesnesi döndürür. |
| virtual [AppendChild](./appendchild/)(String) | Belirtilen XML veri dizesini kullanarak geçerli düğümün alt düğüm listesinin sonuna yeni bir alt düğüm oluşturur. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlReader\>) | Belirtilen [XmlReader](../../system.xml/xmlreader/) nesnesinin XML içeriğini kullanarak geçerli düğümün alt düğüm listesinin sonuna yeni bir alt düğüm oluşturur. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XPathNavigator\>) | Belirtilen [XPathNavigator](./) içindeki düğümleri kullanarak geçerli düğümün alt düğüm listesinin sonuna yeni bir alt düğüm oluşturur. |
| virtual [AppendChildElement](./appendchildelement/)(String, String, String, String) | Belirtilen değerle birlikte ad alanı öneki, yerel ad ve ad alanı URI'sını kullanarak geçerli düğümün alt düğüm listesinin sonuna yeni bir alt öğe düğümü oluşturur. |
| virtual [CheckValidity](./checkvalidity/)(SharedPtr\<System::Xml::Schema::XmlSchemaSet\>, System::Xml::Schema::ValidationEventHandler) | [XPathNavigator](./) içindeki XML verisinin sağlanan XML [Schema](../../system.xml.schema/) tanım dili (XSD) şemasına uygun olduğunu doğrular. |
| virtual [Clone](./clone/)() | Türetilmiş bir sınıfta geçersiz kılındığında, bu [XPathNavigator](./) ile aynı düğümde konumlandırılmış yeni bir [XPathNavigator](./) oluşturur. |
| virtual [ComparePosition](./compareposition/)(SharedPtr\<XPathNavigator\>) | Geçerli [XPathNavigator](./) konumunu belirtilen [XPathNavigator](./) konumuyla karşılaştırır. |
| virtual [Compile](./compile/)(String) | Bir [XPath](../) ifadesini temsil eden bir dizeyi derler ve bir [XPathExpression](../xpathexpression/) nesnesi döndürür. |
| virtual [CreateAttribute](./createattribute/)(String, String, String, String) | Belirtilen değerle birlikte ad alanı öneki, yerel ad ve ad alanı URI'sını kullanarak geçerli öğe düğümünde bir öznitelik düğümü oluşturur. |
| virtual [CreateAttributes](./createattributes/)() | Geçerli öğe üzerinde yeni öznitelikler oluşturmak için kullanılan bir [XmlWriter](../../system.xml/xmlwriter/) nesnesi döndürür. |
| [CreateNavigator](./createnavigator/)() override | [XPathNavigator](./) nesnesinin bir kopyasını döndürür. |
| virtual [DeleteRange](./deleterange/)(SharedPtr\<XPathNavigator\>) | Geçerli düğümden belirtilen düğüme kadar olan kardeş düğüm aralığını siler. |
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
| virtual [get_UnderlyingObject](./get_underlyingobject/)() | [XPathNavigator](./) uygulamaları tarafından, bir depolama üzerinde \"virtualized\" XML görünümü sağlayarak temel nesnelere erişim sağlamak için kullanılır. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | Geçerli düğümün değerini bir [Boolean](../../system/boolean/) olarak döndürür. |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | Geçerli düğümün değerini bir [DateTime](../../system/datetime/) olarak döndürür. |
| [get_ValueAsDouble](./get_valueasdouble/)() override | Geçerli düğümün değerini bir [Double](../../system/double/) olarak döndürür. |
| [get_ValueAsInt](./get_valueasint/)() override | Geçerli düğümün değerini bir [Int32](../../system/int32/) olarak döndürür. |
| [get_ValueAsLong](./get_valueaslong/)() override | Geçerli düğümün değerini bir [Int64](../../system/int64/) olarak döndürür. |
| [get_ValueType](./get_valuetype/)() override | Geçerli düğümün tipini döndürür. |
| virtual [get_XmlLang](./get_xmllang/)() | Geçerli düğüm için **xml:lang** kapsamını döndürür. |
| [get_XmlType](./get_xmltype/)() override | Geçerli düğüm için XmlSchemaType bilgisini döndürür. |
| virtual [GetAttribute](./getattribute/)(String, String) | Belirtilen yerel ad ve ad alanı URI'sine sahip özniteliğin değerini döndürür. |
| virtual [GetNamespace](./getnamespace/)(String) | Belirtilen yerel ada karşılık gelen ad alanı düğümünün değerini döndürür. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Geçerli düğümün kapsam içindeki ad alanlarını döndürür. |
| virtual [InsertAfter](./insertafter/)() | Şu anda seçili düğümün sonrasına yeni bir kardeş düğüm oluşturmak için kullanılan bir [XmlWriter](../../system.xml/xmlwriter/) nesnesi döndürür. |
| virtual [InsertAfter](./insertafter/)(String) | Belirtilen XML dizesini kullanarak şu anda seçili düğümün sonrasına yeni bir kardeş düğüm oluşturur. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlReader\>) | Belirtilen [XmlReader](../../system.xml/xmlreader/) nesnesinin XML içeriğini kullanarak şu anda seçili düğümün sonrasına yeni bir kardeş düğüm oluşturur. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XPathNavigator\>) | Belirtilen [XPathNavigator](./) nesnesindeki düğümleri kullanarak şu anda seçili düğümün sonrasına yeni bir kardeş düğüm oluşturur. |
| virtual [InsertBefore](./insertbefore/)() | Şu anda seçili düğümün öncesine yeni bir kardeş düğüm oluşturmak için kullanılan bir [XmlWriter](../../system.xml/xmlwriter/) nesnesi döndürür. |
| virtual [InsertBefore](./insertbefore/)(String) | Belirtilen XML dizesini kullanarak şu anda seçili düğümün öncesine yeni bir kardeş düğüm oluşturur. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlReader\>) | Belirtilen [XmlReader](../../system.xml/xmlreader/) nesnesinin XML içeriğini kullanarak şu anda seçili düğümün öncesine yeni bir kardeş düğüm oluşturur. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XPathNavigator\>) | Belirtilen [XPathNavigator](./) nesnesindeki düğümleri kullanarak şu anda seçili düğümün öncesine yeni bir kardeş düğüm oluşturur. |
| virtual [InsertElementAfter](./insertelementafter/)(String, String, String, String) | Belirtilen ad alanı öneki, yerel ad ve ad alanı URI'sini kullanarak, belirtilen değerle birlikte geçerli düğümün sonrasına yeni bir kardeş öğe oluşturur. |
| virtual [InsertElementBefore](./insertelementbefore/)(String, String, String, String) | Belirtilen ad alanı öneki, yerel ad ve ad alanı URI'si kullanılarak, belirtilen değerle, mevcut düğümün önünde yeni bir kardeş öğe oluşturur. |
| virtual [IsDescendant](./isdescendant/)(SharedPtr\<XPathNavigator\>) | Belirtilen [XPathNavigator](./) öğesinin mevcut [XPathNavigator](./) öğesinin bir alt öğesi olup olmadığını belirler. |
| virtual [IsSamePosition](./issameposition/)(SharedPtr\<XPathNavigator\>) | Türetilmiş bir sınıfta geçersiz kılındığında, mevcut [XPathNavigator](./) öğesinin belirtilen [XPathNavigator](./) öğesiyle aynı konumda olup olmadığını belirler. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Belirtilen önek için ad alanı URI'sini döndürür. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Belirtilen ad alanı URI'si için bildirilen önek'i döndürür. |
| virtual [Matches](./matches/)(SharedPtr\<XPathExpression\>) | Mevcut düğümün belirtilen [XPathExpression](../xpathexpression/) ile eşleşip eşleşmediğini belirler. |
| virtual [Matches](./matches/)(String) | Mevcut düğümün belirtilen [XPath](../) ifadesiyle eşleşip eşleşmediğini belirler. |
| virtual [MoveTo](./moveto/)(SharedPtr\<XPathNavigator\>) | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](./) öğesini belirtilen [XPathNavigator](./) öğesiyle aynı konuma taşır. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | [XPathNavigator](./) öğesini eşleşen yerel ad ve ad alanı URI'sine sahip niteliğe taşır. |
| virtual [MoveToChild](./movetochild/)(String, String) | [XPathNavigator](./) öğesini belirtilen yerel ad ve ad alanı URI'sine sahip çocuk düğüme taşır. |
| virtual [MoveToChild](./movetochild/)(XPathNodeType) | [XPathNavigator](./) öğesini belirtilen [XPathNodeType](../xpathnodetype/) türünün çocuk düğümüne taşır. |
| virtual [MoveToFirst](./movetofirst/)() | [XPathNavigator](./) öğesini mevcut düğümün ilk kardeş düğümüne taşır. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](./) öğesini mevcut düğümün ilk niteliğine taşır. |
| virtual [MoveToFirstChild](./movetofirstchild/)() | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](./) öğesini mevcut düğümün ilk çocuk düğümüne taşır. |
| virtual [MoveToFirstNamespace](./movetofirstnamespace/)(XPathNamespaceScope) | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](./) öğesini belirtilen [XPathNamespaceScope](../xpathnamespacescope/) ile eşleşen ilk ad alanı düğümüne taşır. |
| [MoveToFirstNamespace](./movetofirstnamespace/)() | [XPathNavigator](./) öğesini mevcut düğümün ilk ad alanı düğümüne taşır. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String) | [XPathNavigator](./) öğesini belge sırasına göre belirtilen yerel ad ve ad alanı URI'sine sahip öğeye taşır. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String, SharedPtr\<XPathNavigator\>) | [XPathNavigator](./) öğesini belge sırasına göre belirtilen yerel ad ve ad alanı URI'sine sahip öğeye, belirtilen sınıra kadar taşır. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType) | [XPathNavigator](./) öğesini belge sırasına göre belirtilen [XPathNodeType](../xpathnodetype/) öğesinin sonraki öğesine taşır. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType, SharedPtr\<XPathNavigator\>) | [XPathNavigator](./) öğesini belge sırasına göre belirtilen [XPathNodeType](../xpathnodetype/) öğesinin sonraki öğesine, belirtilen sınıra kadar taşır. |
| virtual [MoveToId](./movetoid/)(String) | Türetilmiş bir sınıfta geçersiz kılındığında, değeri belirtilen [String](../../system/string/) ile eşleşen **ID** türünde bir niteliğe sahip düğüme taşır. |
| virtual [MoveToNamespace](./movetonamespace/)(String) | [XPathNavigator](./) öğesini belirtilen ad alanı önekiyle ad alanı düğümüne taşır. |
| virtual [MoveToNext](./movetonext/)() | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](./) öğesini mevcut düğümün sonraki kardeş düğümüne taşır. |
| virtual [MoveToNext](./movetonext/)(String, String) | [XPathNavigator](./) öğesini belirtilen yerel ad ve ad alanı URI'sine sahip sonraki kardeş düğüme taşır. |
| virtual [MoveToNext](./movetonext/)(XPathNodeType) | [XPathNavigator](./) öğesini mevcut düğümün belirtilen [XPathNodeType](../xpathnodetype/) ile eşleşen sonraki kardeş düğümüne taşır. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](./) öğesini sonraki niteliğe taşır. |
| virtual [MoveToNextNamespace](./movetonextnamespace/)(XPathNamespaceScope) | When overridden in a derived class, moves the [XPathNavigator](./) to the next namespace node matching the [XPathNamespaceScope](../xpathnamespacescope/) specified. |
| [MoveToNextNamespace](./movetonextnamespace/)() | Moves the [XPathNavigator](./) to the next namespace node. |
| virtual [MoveToParent](./movetoparent/)() | When overridden in a derived class, moves the [XPathNavigator](./) to the parent node of the current node. |
| virtual [MoveToPrevious](./movetoprevious/)() | When overridden in a derived class, moves the [XPathNavigator](./) to the previous sibling node of the current node. |
| virtual [MoveToRoot](./movetoroot/)() | Moves the [XPathNavigator](./) to the root node that the current node belongs to. |
| virtual [PrependChild](./prependchild/)() | Returns an [XmlWriter](../../system.xml/xmlwriter/) object used to create a new child node at the beginning of the list of child nodes of the current node. |
| virtual [PrependChild](./prependchild/)(String) | Creates a new child node at the beginning of the list of child nodes of the current node using the XML string specified. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlReader\>) | Creates a new child node at the beginning of the list of child nodes of the current node using the XML contents of the [XmlReader](../../system.xml/xmlreader/) object specified. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XPathNavigator\>) | Creates a new child node at the beginning of the list of child nodes of the current node using the nodes in the [XPathNavigator](./) object specified. |
| virtual [PrependChildElement](./prependchildelement/)(String, String, String, String) | Creates a new child element at the beginning of the list of child nodes of the current node using the namespace prefix, local name, and namespace URI specified with the value specified. |
| virtual [ReadSubtree](./readsubtree/)() | Returns an [XmlReader](../../system.xml/xmlreader/) object that contains the current node and its child nodes. |
| virtual [ReplaceRange](./replacerange/)(SharedPtr\<XPathNavigator\>) | Replaces a range of sibling nodes from the current node to the node specified. |
| virtual [ReplaceSelf](./replaceself/)(String) | Replaces the current node with the content of the string specified. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XmlReader\>) | Replaces the current node with the contents of the [XmlReader](../../system.xml/xmlreader/) object specified. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XPathNavigator\>) | Replaces the current node with the contents of the [XPathNavigator](./) object specified. |
| virtual [Select](./select/)(String) | Selects a node set, using the specified [XPath](../) expression. |
| virtual [Select](./select/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Selects a node set using the specified [XPath](../) expression with the [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) object specified to resolve namespace prefixes. |
| virtual [Select](./select/)(SharedPtr\<XPathExpression\>) | Selects a node set using the specified [XPathExpression](../xpathexpression/). |
| virtual [SelectAncestors](./selectancestors/)(XPathNodeType, bool) | Selects all the ancestor nodes of the current node that have a matching [XPathNodeType](../xpathnodetype/). |
| virtual [SelectAncestors](./selectancestors/)(String, String, bool) | Selects all the ancestor nodes of the current node that have the specified local name and namespace URI. |
| virtual [SelectChildren](./selectchildren/)(XPathNodeType) | Selects all the child nodes of the current node that have the matching [XPathNodeType](../xpathnodetype/). |
| virtual [SelectChildren](./selectchildren/)(String, String) | Selects all the child nodes of the current node that have the local name and namespace URI specified. |
| virtual [SelectDescendants](./selectdescendants/)(XPathNodeType, bool) | Selects all the descendant nodes of the current node that have a matching [XPathNodeType](../xpathnodetype/). |
| virtual [SelectDescendants](./selectdescendants/)(String, String, bool) | Selects all the descendant nodes of the current node with the local name and namespace URI specified. |
| virtual [SelectSingleNode](./selectsinglenode/)(String) | Selects a single node in the [XPathNavigator](./) using the specified [XPath](../) query. |
| virtual [SelectSingleNode](./selectsinglenode/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Belirtilen [XPath](../) sorgusunu ve ad alanı öneklerini çözmek için belirtilen [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) nesnesini kullanarak [XPathNavigator](./) nesnesinde tek bir düğüm seçer. |
| virtual [SelectSingleNode](./selectsinglenode/)(SharedPtr\<XPathExpression\>) | Belirtilen [XPathExpression](../xpathexpression/) nesnesini kullanarak [XPathNavigator](./) içinde tek bir düğüm seçer. |
| virtual [set_InnerXml](./set_innerxml/)(String) | Geçerli düğümün alt düğümlerini temsil eden işaretlemeyi ayarlar. |
| virtual [set_OuterXml](./set_outerxml/)(String) | Geçerli düğümün ve alt düğümlerinin açılış ve kapanış etiketlerini temsil eden işaretlemeyi ayarlar. |
| virtual [SetTypedValue](./settypedvalue/)(SharedPtr\<Object\>) | Geçerli düğümün tiplenmiş değerini ayarlar. |
| virtual [SetValue](./setvalue/)(String) | Geçerli düğümün değerini ayarlar. |
| [ToString](./tostring/)() const override | Geçerli düğümün metin değerini döndürür. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | Ad alanı öneklerini çözmek için belirtilen [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) nesnesini kullanarak, belirtilen Tip olarak geçerli düğümün değerini döndürür. |
| virtual [WriteSubtree](./writesubtree/)(SharedPtr\<XmlWriter\>) | Geçerli düğümü ve alt düğümlerini belirtilen [XmlWriter](../../system.xml/xmlwriter/) nesnesine akıtır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Ayrıca Bakınız

* Class [XPathItem](../xpathitem/)
* Class [IXPathNavigable](../ixpathnavigable/)
* Class [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
