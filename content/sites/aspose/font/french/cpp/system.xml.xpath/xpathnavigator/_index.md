---
title: "Classe System::Xml::XPath::XPathNavigator"
linktitle: "XPathNavigator"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XPath::XPathNavigator. Fournit un modèle de curseur pour parcourir et modifier les données XML en C++."
type: docs
weight: 500
url: /fr/cpp/system.xml.xpath/xpathnavigator/
---
## XPathNavigator class


Fournit un modèle de curseur pour naviguer et modifier les données XML.

```cpp
class XPathNavigator : public System::Xml::XPath::XPathItem,
                       public System::Xml::XPath::IXPathNavigable,
                       public System::Xml::IXmlNamespaceResolver
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [AppendChild](./appendchild/)() | Renvoie un objet [XmlWriter](../../system.xml/xmlwriter/) utilisé pour créer un ou plusieurs nouveaux nœuds enfants à la fin de la liste des nœuds enfants du nœud actuel. |
| virtual [AppendChild](./appendchild/)(String) | Crée un nouveau nœud enfant à la fin de la liste des nœuds enfants du nœud actuel en utilisant la chaîne de données XML spécifiée. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlReader\>) | Crée un nouveau nœud enfant à la fin de la liste des nœuds enfants du nœud actuel en utilisant le contenu XML de l'objet [XmlReader](../../system.xml/xmlreader/) spécifié. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XPathNavigator\>) | Crée un nouveau nœud enfant à la fin de la liste des nœuds enfants du nœud actuel en utilisant les nœuds du [XPathNavigator](./) spécifié. |
| virtual [AppendChildElement](./appendchildelement/)(String, String, String, String) | Crée un nouveau nœud d'élément enfant à la fin de la liste des nœuds enfants du nœud actuel en utilisant le préfixe d'espace de noms, le nom local et l'URI d'espace de noms spécifiés avec la valeur indiquée. |
| virtual [CheckValidity](./checkvalidity/)(SharedPtr\<System::Xml::Schema::XmlSchemaSet\>, System::Xml::Schema::ValidationEventHandler) | Vérifie que les données XML dans le [XPathNavigator](./) sont conformes au schéma [Schema](../../system.xml.schema/) du langage de définition XML (XSD) fourni. |
| virtual [Clone](./clone/)() | Lorsqu'il est remplacé dans une classe dérivée, crée un nouveau [XPathNavigator](./) positionné sur le même nœud que ce [XPathNavigator](./). |
| virtual [ComparePosition](./compareposition/)(SharedPtr\<XPathNavigator\>) | Compare la position du [XPathNavigator](./) actuel avec la position du [XPathNavigator](./) spécifié. |
| virtual [Compile](./compile/)(String) | Compile une chaîne représentant une expression [XPath](../) et renvoie un objet [XPathExpression](../xpathexpression/). |
| virtual [CreateAttribute](./createattribute/)(String, String, String, String) | Crée un nœud d'attribut sur le nœud d'élément actuel en utilisant le préfixe d'espace de noms, le nom local et l'URI d'espace de noms spécifiés avec la valeur indiquée. |
| virtual [CreateAttributes](./createattributes/)() | Renvoie un objet [XmlWriter](../../system.xml/xmlwriter/) utilisé pour créer de nouveaux attributs sur l'élément actuel. |
| [CreateNavigator](./createnavigator/)() override | Renvoie une copie du [XPathNavigator](./). |
| virtual [DeleteRange](./deleterange/)(SharedPtr\<XPathNavigator\>) | Supprime une plage de nœuds frères du nœud actuel jusqu'au nœud spécifié. |
| virtual [DeleteSelf](./deleteself/)() | Supprime le nœud actuel ainsi que ses nœuds enfants. |
| virtual [Evaluate](./evaluate/)(String) | Évalue l'expression [XPath](../) spécifiée et renvoie le résultat typé. |
| virtual [Evaluate](./evaluate/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Évalue l'expression [XPath](../) spécifiée et renvoie le résultat typé, en utilisant l'objet [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) spécifié pour résoudre les préfixes d'espace de noms dans l'expression [XPath](../). |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>) | Évalue le [XPathExpression](../xpathexpression/) et renvoie le résultat typé. |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) | Utilise le contexte fourni pour évaluer le [XPathExpression](../xpathexpression/), et renvoie le résultat typé. |
| virtual [get_BaseURI](./get_baseuri/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient l'URI de base du nœud actuel. |
| virtual [get_CanEdit](./get_canedit/)() | Renvoie une valeur indiquant si le [XPathNavigator](./) peut modifier les données XML sous-jacentes. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Renvoie une valeur indiquant si le nœud actuel possède des attributs. |
| virtual [get_HasChildren](./get_haschildren/)() | Renvoie une valeur indiquant si le nœud actuel possède des nœuds enfants. |
| virtual [get_InnerXml](./get_innerxml/)() | Renvoie le balisage représentant les nœuds enfants du nœud actuel. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient une valeur indiquant si le nœud actuel est un élément vide sans balise de fin. |
| [get_IsNode](./get_isnode/)() override | Renvoie une valeur indiquant si le nœud actuel représente un nœud [XPath](../). |
| virtual [get_LocalName](./get_localname/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient le [XPathNavigator::get_Name](./get_name/) du nœud actuel sans aucun préfixe d'espace de noms. |
| virtual [get_Name](./get_name/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient le nom qualifié du nœud actuel. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient l'URI d'espace de noms du nœud actuel. |
| virtual [get_NameTable](./get_nametable/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient le [XmlNameTable](../../system.xml/xmlnametable/) du [XPathNavigator](./). |
| static [get_NavigatorComparer](./get_navigatorcomparer/)() | Renvoie un [Collections::IEqualityComparer](../../system.collections/iequalitycomparer/) utilisé pour la comparaison d'égalité des objets [XPathNavigator](./). |
| virtual [get_NodeType](./get_nodetype/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient le [XPathNodeType](../xpathnodetype/) du nœud actuel. |
| virtual [get_OuterXml](./get_outerxml/)() | Renvoie le balisage représentant les balises d'ouverture et de fermeture du nœud actuel et de ses nœuds enfants. |
| virtual [get_Prefix](./get_prefix/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient le préfixe d'espace de noms associé au nœud actuel. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Renvoie les informations de schéma qui ont été assignées au nœud actuel à la suite de la validation du schéma. |
| [get_TypedValue](./get_typedvalue/)() override | Renvoie le nœud actuel sous forme d'objet encapsulé du type le plus approprié. |
| virtual [get_UnderlyingObject](./get_underlyingobject/)() | Utilisé par les implémentations de [XPathNavigator](./) qui offrent une vue XML « virtualisée » sur un magasin, afin de fournir l'accès aux objets sous-jacents. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | Renvoie la valeur du nœud actuel en tant que [Boolean](../../system/boolean/). |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | Renvoie la valeur du nœud actuel en tant que [DateTime](../../system/datetime/). |
| [get_ValueAsDouble](./get_valueasdouble/)() override | Renvoie la valeur du nœud actuel en tant que [Double](../../system/double/). |
| [get_ValueAsInt](./get_valueasint/)() override | Renvoie la valeur du nœud actuel en tant que [Int32](../../system/int32/). |
| [get_ValueAsLong](./get_valueaslong/)() override | Renvoie la valeur du nœud actuel en tant que [Int64](../../system/int64/). |
| [get_ValueType](./get_valuetype/)() override | Renvoie le type du nœud actuel. |
| virtual [get_XmlLang](./get_xmllang/)() | Renvoie la portée **xml:lang** du nœud actuel. |
| [get_XmlType](./get_xmltype/)() override | Renvoie les informations XmlSchemaType du nœud actuel. |
| virtual [GetAttribute](./getattribute/)(String, String) | Renvoie la valeur de l'attribut avec le nom local et l'URI d'espace de noms spécifiés. |
| virtual [GetNamespace](./getnamespace/)(String) | Renvoie la valeur du nœud d'espace de noms correspondant au nom local spécifié. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Renvoie les espaces de noms en portée du nœud actuel. |
| virtual [InsertAfter](./insertafter/)() | Renvoie un objet [XmlWriter](../../system.xml/xmlwriter/) utilisé pour créer un nouveau nœud frère après le nœud actuellement sélectionné. |
| virtual [InsertAfter](./insertafter/)(String) | Crée un nouveau nœud frère après le nœud actuellement sélectionné en utilisant la chaîne XML spécifiée. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlReader\>) | Crée un nouveau nœud frère après le nœud actuellement sélectionné en utilisant le contenu XML de l'objet [XmlReader](../../system.xml/xmlreader/) spécifié. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XPathNavigator\>) | Crée un nouveau nœud frère après le nœud actuellement sélectionné en utilisant les nœuds de l'objet [XPathNavigator](./) spécifié. |
| virtual [InsertBefore](./insertbefore/)() | Renvoie un objet [XmlWriter](../../system.xml/xmlwriter/) utilisé pour créer un nouveau nœud frère avant le nœud actuellement sélectionné. |
| virtual [InsertBefore](./insertbefore/)(String) | Crée un nouveau nœud frère avant le nœud actuellement sélectionné en utilisant la chaîne XML spécifiée. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlReader\>) | Crée un nouveau nœud frère avant le nœud actuellement sélectionné en utilisant le contenu XML de l'objet [XmlReader](../../system.xml/xmlreader/) spécifié. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XPathNavigator\>) | Crée un nouveau nœud frère avant le nœud actuellement sélectionné en utilisant les nœuds du [XPathNavigator](./) spécifié. |
| virtual [InsertElementAfter](./insertelementafter/)(String, String, String, String) | Crée un nouvel élément frère après le nœud actuel en utilisant le préfixe d'espace de noms, le nom local et l'URI d'espace de noms spécifiés, avec la valeur spécifiée. |
| virtual [InsertElementBefore](./insertelementbefore/)(String, String, String, String) | Crée un nouvel élément frère avant le nœud actuel en utilisant le préfixe d'espace de noms, le nom local et l'URI d'espace de noms spécifiés, avec la valeur spécifiée. |
| virtual [IsDescendant](./isdescendant/)(SharedPtr\<XPathNavigator\>) | Détermine si le [XPathNavigator](./) spécifié est un descendant du [XPathNavigator](./) actuel. |
| virtual [IsSamePosition](./issameposition/)(SharedPtr\<XPathNavigator\>) | Lorsqu'il est remplacé dans une classe dérivée, détermine si le [XPathNavigator](./) actuel se trouve à la même position que le [XPathNavigator](./) spécifié. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Renvoie l'URI de l'espace de noms pour le préfixe spécifié. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Renvoie le préfixe déclaré pour l'URI d'espace de noms spécifié. |
| virtual [Matches](./matches/)(SharedPtr\<XPathExpression\>) | Détermine si le nœud actuel correspond à l'[XPathExpression](../xpathexpression/) spécifiée. |
| virtual [Matches](./matches/)(String) | Détermine si le nœud actuel correspond à l'expression [XPath](../) spécifiée. |
| virtual [MoveTo](./moveto/)(SharedPtr\<XPathNavigator\>) | Lorsqu'il est remplacé dans une classe dérivée, déplace le [XPathNavigator](./) à la même position que le [XPathNavigator](./) spécifié. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | Déplace le [XPathNavigator](./) vers l'attribut dont le nom local et l'URI d'espace de noms correspondent. |
| virtual [MoveToChild](./movetochild/)(String, String) | Déplace le [XPathNavigator](./) vers le nœud enfant dont le nom local et l'URI d'espace de noms sont spécifiés. |
| virtual [MoveToChild](./movetochild/)(XPathNodeType) | Déplace le [XPathNavigator](./) vers le nœud enfant du [XPathNodeType](../xpathnodetype/) spécifié. |
| virtual [MoveToFirst](./movetofirst/)() | Déplace le [XPathNavigator](./) vers le premier nœud frère du nœud actuel. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | Lorsqu'il est remplacé dans une classe dérivée, déplace le [XPathNavigator](./) vers le premier attribut du nœud actuel. |
| virtual [MoveToFirstChild](./movetofirstchild/)() | Lorsqu'il est remplacé dans une classe dérivée, déplace le [XPathNavigator](./) vers le premier nœud enfant du nœud actuel. |
| virtual [MoveToFirstNamespace](./movetofirstnamespace/)(XPathNamespaceScope) | Lorsqu'il est remplacé dans une classe dérivée, déplace le [XPathNavigator](./) vers le premier nœud d'espace de noms qui correspond à la [XPathNamespaceScope](../xpathnamespacescope/) spécifiée. |
| [MoveToFirstNamespace](./movetofirstnamespace/)() | Déplace le [XPathNavigator](./) vers le premier nœud d'espace de noms du nœud actuel. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String) | Déplace le [XPathNavigator](./) vers l'élément dont le nom local et l'URI d'espace de noms sont spécifiés dans l'ordre du document. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String, SharedPtr\<XPathNavigator\>) | Déplace le [XPathNavigator](./) vers l'élément dont le nom local et l'URI d'espace de noms sont spécifiés, jusqu'à la limite spécifiée, dans l'ordre du document. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType) | Déplace le [XPathNavigator](./) vers l'élément suivant du [XPathNodeType](../xpathnodetype/) spécifié dans l'ordre du document. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType, SharedPtr\<XPathNavigator\>) | Déplace le [XPathNavigator](./) vers l'élément suivant du [XPathNodeType](../xpathnodetype/) spécifié, jusqu'à la limite spécifiée, dans l'ordre du document. |
| virtual [MoveToId](./movetoid/)(String) | Lorsqu'il est remplacé dans une classe dérivée, se déplace vers le nœud qui possède un attribut de type **ID** dont la valeur correspond à la [String](../../system/string/) spécifiée. |
| virtual [MoveToNamespace](./movetonamespace/)(String) | Déplace le [XPathNavigator](./) vers le nœud d'espace de noms avec le préfixe d'espace de noms spécifié. |
| virtual [MoveToNext](./movetonext/)() | Lorsqu'il est remplacé dans une classe dérivée, déplace le [XPathNavigator](./) vers le nœud frère suivant du nœud actuel. |
| virtual [MoveToNext](./movetonext/)(String, String) | Déplace le [XPathNavigator](./) vers le nœud frère suivant avec le nom local et l'URI d'espace de noms spécifiés. |
| virtual [MoveToNext](./movetonext/)(XPathNodeType) | Déplace le [XPathNavigator](./) vers le nœud frère suivant du nœud actuel qui correspond au [XPathNodeType](../xpathnodetype/) spécifié. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | Lorsqu'il est remplacé dans une classe dérivée, déplace le [XPathNavigator](./) vers l'attribut suivant. |
| virtual [MoveToNextNamespace](./movetonextnamespace/)(XPathNamespaceScope) | Lorsqu'il est remplacé dans une classe dérivée, déplace le [XPathNavigator](./) vers le nœud d'espace de noms suivant correspondant au [XPathNamespaceScope](../xpathnamespacescope/) spécifié. |
| [MoveToNextNamespace](./movetonextnamespace/)() | Déplace le [XPathNavigator](./) vers le nœud d'espace de noms suivant. |
| virtual [MoveToParent](./movetoparent/)() | Lorsqu'il est remplacé dans une classe dérivée, déplace le [XPathNavigator](./) vers le nœud parent du nœud actuel. |
| virtual [MoveToPrevious](./movetoprevious/)() | Lorsqu'il est remplacé dans une classe dérivée, déplace le [XPathNavigator](./) vers le nœud frère précédent du nœud actuel. |
| virtual [MoveToRoot](./movetoroot/)() | Déplace le [XPathNavigator](./) vers le nœud racine auquel appartient le nœud actuel. |
| virtual [PrependChild](./prependchild/)() | Renvoie un objet [XmlWriter](../../system.xml/xmlwriter/) utilisé pour créer un nouveau nœud enfant au début de la liste des nœuds enfants du nœud actuel. |
| virtual [PrependChild](./prependchild/)(String) | Crée un nouveau nœud enfant au début de la liste des nœuds enfants du nœud actuel en utilisant la chaîne XML spécifiée. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlReader\>) | Crée un nouveau nœud enfant au début de la liste des nœuds enfants du nœud actuel en utilisant le contenu XML de l'objet [XmlReader](../../system.xml/xmlreader/) spécifié. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XPathNavigator\>) | Crée un nouveau nœud enfant au début de la liste des nœuds enfants du nœud actuel en utilisant les nœuds de l'objet [XPathNavigator](./) spécifié. |
| virtual [PrependChildElement](./prependchildelement/)(String, String, String, String) | Crée un nouvel élément enfant au début de la liste des nœuds enfants du nœud actuel en utilisant le préfixe d'espace de noms, le nom local et l'URI d'espace de noms spécifiés avec la valeur spécifiée. |
| virtual [ReadSubtree](./readsubtree/)() | Renvoie un objet [XmlReader](../../system.xml/xmlreader/) qui contient le nœud actuel et ses nœuds enfants. |
| virtual [ReplaceRange](./replacerange/)(SharedPtr\<XPathNavigator\>) | Remplace une plage de nœuds frères du nœud actuel jusqu'au nœud spécifié. |
| virtual [ReplaceSelf](./replaceself/)(String) | Remplace le nœud actuel par le contenu de la chaîne spécifiée. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XmlReader\>) | Remplace le nœud actuel par le contenu de l'objet [XmlReader](../../system.xml/xmlreader/) spécifié. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XPathNavigator\>) | Remplace le nœud actuel par le contenu de l'objet [XPathNavigator](./) spécifié. |
| virtual [Select](./select/)(String) | Sélectionne un ensemble de nœuds, en utilisant l'expression [XPath](../) spécifiée. |
| virtual [Select](./select/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Sélectionne un ensemble de nœuds en utilisant l'expression [XPath](../) spécifiée avec l'objet [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) spécifié pour résoudre les préfixes d'espace de noms. |
| virtual [Select](./select/)(SharedPtr\<XPathExpression\>) | Sélectionne un ensemble de nœuds en utilisant le [XPathExpression](../xpathexpression/) spécifié. |
| virtual [SelectAncestors](./selectancestors/)(XPathNodeType, bool) | Sélectionne tous les nœuds ancêtres du nœud actuel qui ont un [XPathNodeType](../xpathnodetype/) correspondant. |
| virtual [SelectAncestors](./selectancestors/)(String, String, bool) | Sélectionne tous les nœuds ancêtres du nœud actuel qui ont le nom local et l'URI d'espace de noms spécifiés. |
| virtual [SelectChildren](./selectchildren/)(XPathNodeType) | Sélectionne tous les nœuds enfants du nœud actuel qui correspondent au [XPathNodeType](../xpathnodetype/). |
| virtual [SelectChildren](./selectchildren/)(String, String) | Sélectionne tous les nœuds enfants du nœud actuel qui ont le nom local et l'URI d'espace de noms spécifiés. |
| virtual [SelectDescendants](./selectdescendants/)(XPathNodeType, bool) | Sélectionne tous les nœuds descendants du nœud actuel qui ont un [XPathNodeType](../xpathnodetype/) correspondant. |
| virtual [SelectDescendants](./selectdescendants/)(String, String, bool) | Sélectionne tous les nœuds descendants du nœud actuel avec le nom local et l'URI d'espace de noms spécifiés. |
| virtual [SelectSingleNode](./selectsinglenode/)(String) | Sélectionne un seul nœud dans le [XPathNavigator](./) en utilisant la requête [XPath](../) spécifiée. |
| virtual [SelectSingleNode](./selectsinglenode/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Sélectionne un seul nœud dans l'objet [XPathNavigator](./) en utilisant la requête [XPath](../) spécifiée avec l'objet [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) indiqué pour résoudre les préfixes d'espace de noms. |
| virtual [SelectSingleNode](./selectsinglenode/)(SharedPtr\<XPathExpression\>) | Sélectionne un seul nœud dans le [XPathNavigator](./) en utilisant l'objet [XPathExpression](../xpathexpression/) spécifié. |
| virtual [set_InnerXml](./set_innerxml/)(String) | Définit le balisage représentant les nœuds enfants du nœud actuel. |
| virtual [set_OuterXml](./set_outerxml/)(String) | Définit le balisage représentant les balises d'ouverture et de fermeture du nœud actuel et de ses nœuds enfants. |
| virtual [SetTypedValue](./settypedvalue/)(SharedPtr\<Object\>) | Définit la valeur typée du nœud actuel. |
| virtual [SetValue](./setvalue/)(String) | Définit la valeur du nœud actuel. |
| [ToString](./tostring/)() const override | Renvoie la valeur texte du nœud actuel. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | Renvoie la valeur du nœud actuel en tant que Type spécifié, en utilisant l'objet [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) indiqué pour résoudre les préfixes d'espace de noms. |
| virtual [WriteSubtree](./writesubtree/)(SharedPtr\<XmlWriter\>) | Diffuse le nœud actuel et ses nœuds enfants vers l'objet [XmlWriter](../../system.xml/xmlwriter/) spécifié. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Voir aussi

* Class [XPathItem](../xpathitem/)
* Class [IXPathNavigable](../ixpathnavigable/)
* Class [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
