---
title: InlineXbrlDocument
second_title: Référence de l'API Aspose.Finance pour .NET
description: Un document XBRL en ligne.
type: docs
weight: 7750
url: /fr/net/aspose.finance.xbrl.inline/inlinexbrldocument/
---
## InlineXbrlDocument class

Un document XBRL en ligne.

```csharp
public class InlineXbrlDocument : Document
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [InlineXbrlDocument](inlinexbrldocument)(string) | Initialise une nouvelle instance de[`InlineXbrlDocument`](../inlinexbrldocument) classe et ouvrez un fichier. |

## Propriétés

| Nom | La description |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/arcrolereferences) { get; } | Obtient la collection de[`ArcroleReference`](../../aspose.finance.xbrl/arcrolereference) dans le document XBRL en ligne. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | Obtient l'URI de base absolu de ce nœud ou null si l'implémentation n'a pas pu obtenir d'URI absolu. |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset) { get; } | Obtient l'encodage du document. |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements) { get; } | Obtient les éléments enfants. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | Obtient les nœuds enfants. |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype) { get; } | Obtient le type de contenu du document. |
| [Contexts](../../aspose.finance.xbrl.inline/inlinexbrldocument/contexts) { get; } | Obtient la collection de[`Context`](../../aspose.finance.xbrl/context) dans le document XBRL en ligne. |
| [Continuations](../../aspose.finance.xbrl.inline/inlinexbrldocument/continuations) { get; } | Obtient la collection de[`InlineContinuation`](../inlinecontinuation) dans le document XBRL en ligne. |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement) { get; } | Il s'agit d'un attribut pratique qui permet un accès direct au nœud enfant qui est l'élément document du document. |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi) { get; } | Obtient l'URI du document. |
| [Facts](../../aspose.finance.xbrl.inline/inlinexbrldocument/facts) { get; } | Obtient la collection de[`InlineFact`](../inlinefact) dans le document XBRL en ligne. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | Obtient le premier enfant de ce nœud. S'il n'y a pas de tel nœud, cela renvoie null. |
| [Footnotes](../../aspose.finance.xbrl.inline/inlinexbrldocument/footnotes) { get; } | Obtient la collection de[`InlineFootnote`](../inlinefootnote) dans le document XBRL en ligne. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | Obtient si ce nœud a des enfants. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | Obtient le dernier enfant de ce nœud. S'il n'y a pas de tel nœud, cela renvoie null. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname) { get; } | Obtient la partie locale du nom qualifié de ce nœud. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri) { get; } | Obtient l'URI de l'espace de noms de ce nœud. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | Obtient le nœud suivant immédiatement ce nœud. S'il n'y a pas de tel nœud, cela renvoie null. |
| override [NodeName](../../aspose.finance.xbrl.dom/document/nodename) { get; } | Obtient le nom du nœud du document. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype) { get; } | Obtient le type de nœud. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue) { get; set; } | Obtient ou définit la valeur de ce nœud, selon son type. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument) { get; } | Obtient l'objet document associé à ce nœud. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode) { get; } | Obtient le nœud parent. |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix) { get; set; } | Obtient ou définit le préfixe d'espace de noms de ce nœud. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling) { get; } | Obtient le nœud précédant immédiatement ce nœud. S'il n'y a pas de tel nœud, cela renvoie null. |
| [References](../../aspose.finance.xbrl.inline/inlinexbrldocument/references) { get; } | Obtient le[`InlineReferences`](../inlinereferences) dans le document XBRL en ligne. |
| [Relationships](../../aspose.finance.xbrl.inline/inlinexbrldocument/relationships) { get; } | Obtient la collection de[`InlineRelationship`](../inlinerelationship) dans le document XBRL en ligne. |
| [RoleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/rolereferences) { get; } | Obtient la collection de[`RoleReference`](../../aspose.finance.xbrl/rolereference) dans le document XBRL en ligne. |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent) { get; set; } | Obtient ou définit le contenu textuel de ce nœud et de ses descendants. |
| [Units](../../aspose.finance.xbrl.inline/inlinexbrldocument/units) { get; } | Obtient la collection de[`Unit`](../../aspose.finance.xbrl/unit) dans le document XBRL en ligne. |
| [ValidationErrors](../../aspose.finance.xbrl.inline/inlinexbrldocument/validationerrors) { get; set; } | Obtient la collection de[`ValidationError`](../../aspose.finance.xbrl.validator/validationerror) dans le document XBRL en ligne. |

## Méthodes

| Nom | La description |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild)(Node) | Ajoute le nœud newChild à la fin de la liste des enfants de ce nœud. |
| [CreateHtmlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createhtmlelement)(string, string) | Crée un élément HTML. |
| [CreateInlineXbrlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createinlinexbrlelement)(string, string) | Crée un élément xbrl en ligne. |
| [CreateXbrlInstanceElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrlinstanceelement)(string, string) | Crée un élément d'instance xbrl. |
| [CreateXbrlLinkbaseElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrllinkbaseelement)(string, string) | Crée un élément de base de liens xbrl. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl)() | Exporter vers l'objet XbrlDocument. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl_1)(Stream) | Exporter vers le flux xbrl. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl_2)(string) | Exporter vers un fichier xbrl. |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getarcroletypebyuri)(string) | Obtient l'ArcroleType qui a l'uri spécifié. |
| [GetConceptById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyid)(string) | Obtient le contexte qui a l'identifiant spécifié. |
| [GetConceptByLoc](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyloc)(Loc) | Obtient le concept par le localisateur. |
| [GetConceptByName](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyname)(string) | Obtient le concept qui porte le nom spécifié. |
| [GetContextById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontextbyid)(string) | Obtient le contexte qui a l'identifiant spécifié. |
| [GetContinuationChainByContinuationReference](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontinuationchainbycontinuationreference)(string) | Obtient la chaîne de continuation selon la référence de continuation. |
| [GetRoleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getroletypebyuri)(string) | Obtient le RoleType qui a l'uri spécifié. |
| [GetUnitById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getunitbyid)(string) | Obtient l'unité qui a l'identifiant spécifié. |
| [IsValid](../../aspose.finance.xbrl.inline/inlinexbrldocument/isvalid)() | Vérifie si ce document XBRL intégré est valide. |
| [RefreshInlineXbrlObjects](../../aspose.finance.xbrl.inline/inlinexbrldocument/refreshinlinexbrlobjects)() | Si vous ajoutez, mettez à jour, supprimez des éléments Inline Xbrl dans l'arborescence DOM, cette méthode doit être appelée pour actualiser les objets xbrl en ligne. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | Supprime le nœud enfant indiqué par ancien enfant de la liste des enfants. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | Remplace l'ancien nœud enfant par le nouvel enfant dans la liste des enfants et renvoie l'ancien nœud enfant. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save#save)(Stream) | Crée et enregistre le fichier xbrl en ligne dans le flux. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save#save_1)(string) | Crée et enregistre le fichier xbrl en ligne sur le disque. |
| [Validate](../../aspose.finance.xbrl.inline/inlinexbrldocument/validate)() | Valide ce document XBRL en ligne. |

### Voir également

* class [Document](../../aspose.finance.xbrl.dom/document)
* espace de noms [Aspose.Finance.Xbrl.Inline](../../aspose.finance.xbrl.inline)
* Assemblée [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
