---
title: "Classe System::Xml::XmlNode"
linktitle: "XmlNode"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlNode. Représente un nœud unique dans le document XML en C++."
type: docs
weight: 2500
url: /fr/cpp/system.xml/xmlnode/
---
## XmlNode class


Représente un nœud unique dans le document XML.

```cpp
class XmlNode : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>,
                public System::Xml::XPath::IXPathNavigable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) | Ajoute le nœud spécifié à la fin de la liste des nœuds enfants de ce nœud. |
| virtual [Clone](./clone/)() | Crée un duplicata de ce nœud. |
| virtual [CloneNode](./clonenode/)(bool) | Crée un duplicata du nœud, lorsqu'il est remplacé dans une classe dérivée. |
| [CreateNavigator](./createnavigator/)() override | Crée un XPathNavigator pour naviguer dans cet objet. |
| virtual [get_Attributes](./get_attributes/)() | Renvoie une [XmlAttributeCollection](../xmlattributecollection/) contenant les attributs de ce nœud. |
| virtual [get_BaseURI](./get_baseuri/)() | Renvoie l'URI de base du nœud actuel. |
| virtual [get_ChildNodes](./get_childnodes/)() | Renvoie tous les nœuds enfants du nœud. |
| virtual [get_FirstChild](./get_firstchild/)() | Renvoie le premier enfant du nœud. |
| virtual [get_HasChildNodes](./get_haschildnodes/)() | Renvoie une valeur indiquant si ce nœud possède des nœuds enfants. |
| virtual [get_InnerText](./get_innertext/)() | Renvoie les valeurs concaténées du nœud et de tous ses nœuds enfants. |
| virtual [get_InnerXml](./get_innerxml/)() | Renvoie le balisage représentant uniquement les nœuds enfants de ce nœud. |
| virtual [get_IsReadOnly](./get_isreadonly/)() | Renvoie une valeur indiquant si le nœud est en lecture seule. |
| virtual [get_LastChild](./get_lastchild/)() | Renvoie le dernier enfant du nœud. |
| virtual [get_LocalName](./get_localname/)() | Renvoie le nom local du nœud, lorsqu'il est remplacé dans une classe dérivée. |
| virtual [get_Name](./get_name/)() | Renvoie le nom qualifié du nœud, lorsqu'il est remplacé dans une classe dérivée. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Renvoie l'URI d'espace de noms de ce nœud. |
| virtual [get_NextSibling](./get_nextsibling/)() | Renvoie le nœud immédiatement suivant ce nœud. |
| virtual [get_NodeType](./get_nodetype/)() | Renvoie le type du nœud actuel, lorsqu'il est remplacé dans une classe dérivée. |
| virtual [get_OuterXml](./get_outerxml/)() | Renvoie le balisage contenant ce nœud et tous ses nœuds enfants. |
| virtual [get_OwnerDocument](./get_ownerdocument/)() | Renvoie le [XmlDocument](../xmldocument/) auquel appartient ce nœud. |
| virtual [get_ParentNode](./get_parentnode/)() | Renvoie le parent de ce nœud (pour les nœuds pouvant avoir des parents). |
| virtual [get_Prefix](./get_prefix/)() | Renvoie le préfixe d'espace de noms de ce nœud. |
| virtual [get_PreviousSibling](./get_previoussibling/)() | Renvoie le nœud immédiatement précédent ce nœud. |
| virtual [get_PreviousText](./get_previoustext/)() | Renvoie le nœud texte qui précède immédiatement ce nœud. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Renvoie l'ensemble d'informations post-validation de schéma qui a été attribué à ce nœud à la suite de la validation de schéma. |
| virtual [get_Value](./get_value/)() | Renvoie la valeur du nœud. |
| [GetEnumerator](./getenumerator/)() override | Renvoie un énumérateur qui parcourt les nœuds enfants du nœud actuel. |
| virtual [GetNamespaceOfPrefix](./getnamespaceofprefix/)(String) | Recherche la déclaration **xmlns** la plus proche pour le préfixe donné qui est en portée du nœud actuel et renvoie l'URI de l'espace de noms dans la déclaration. |
| virtual [GetPrefixOfNamespace](./getprefixofnamespace/)(String) | Recherche la déclaration **xmlns** la plus proche pour l'URI d'espace de noms donné qui est en portée du nœud actuel et renvoie le préfixe défini dans cette déclaration. |
| virtual [idx_get](./idx_get/)(String) | Renvoie le premier élément enfant avec le [XmlNode::get_Name](./get_name/) spécifié. |
| virtual [idx_get](./idx_get/)(String, String) | Renvoie le premier élément enfant avec les valeurs [XmlNode::get_LocalName](./get_localname/) et [XmlNode::get_NamespaceURI](./get_namespaceuri/) spécifiées. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Insère le nœud spécifié immédiatement après le nœud de référence spécifié. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Insère le nœud spécifié immédiatement avant le nœud de référence spécifié. |
| virtual [Normalize](./normalize/)() | Place tous les nœuds [XmlText](../xmltext/) à toutes les profondeurs du sous-arbre sous ce [XmlNode](./) dans une forme \"normale\" où seul le balisage (c’est‑à‑dire les balises, les commentaires, les instructions de traitement, les sections CDATA et les références d’entité) sépare les nœuds [XmlText](../xmltext/), c’est‑à‑dire qu’il n’y a aucun nœud [XmlText](../xmltext/) adjacent. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) | Ajoute le nœud spécifié au début de la liste des nœuds enfants de ce nœud. |
| virtual [RemoveAll](./removeall/)() | Supprime tous les nœuds enfants et/ou les attributs du nœud actuel. |
| virtual [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) | Supprime le nœud enfant spécifié. |
| virtual [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Remplace le nœud enfant **oldChild** par le nœud **newChild**. |
| [SelectNodes](./selectnodes/)(const String\&) | Sélectionne une liste de nœuds correspondant à l’expression [XPath](../../system.xml.xpath/). |
| [SelectNodes](./selectnodes/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | Sélectionne une liste de nœuds correspondant à l’expression [XPath](../../system.xml.xpath/). Tous les préfixes trouvés dans l’expression [XPath](../../system.xml.xpath/) sont résolus à l’aide du [XmlNamespaceManager](../xmlnamespacemanager/) fourni. |
| [SelectSingleNode](./selectsinglenode/)(const String\&) | Sélectionne le premier [XmlNode](./) qui correspond à l’expression [XPath](../../system.xml.xpath/). |
| [SelectSingleNode](./selectsinglenode/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | Sélectionne le premier [XmlNode](./) qui correspond à l’expression [XPath](../../system.xml.xpath/). Tous les préfixes trouvés dans l’expression [XPath](../../system.xml.xpath/) sont résolus à l’aide du [XmlNamespaceManager](../xmlnamespacemanager/) fourni. |
| virtual [set_InnerText](./set_innertext/)(String) | Définit les valeurs concaténées du nœud et de tous ses nœuds enfants. |
| virtual [set_InnerXml](./set_innerxml/)(String) | Définit le balisage représentant uniquement les nœuds enfants de ce nœud. |
| virtual [set_Prefix](./set_prefix/)(String) | Définit le préfixe d'espace de noms de ce nœud. |
| virtual [set_Value](./set_value/)(String) | Définit la valeur du nœud. |
| virtual [Supports](./supports/)(String, String) | Teste si l’implémentation DOM implémente une fonctionnalité spécifique. |
| virtual [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) | Enregistre tous les nœuds enfants du nœud dans le [XmlWriter](../xmlwriter/) spécifié, lorsqu’il est remplacé dans une classe dérivée. |
| virtual [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) | Enregistre le nœud actuel dans le [XmlWriter](../xmlwriter/) spécifié, lorsqu’il est remplacé dans une classe dérivée. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Voir aussi

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Class [IXPathNavigable](../../system.xml.xpath/ixpathnavigable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
