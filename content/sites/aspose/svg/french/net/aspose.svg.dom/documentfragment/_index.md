---
title: Class DocumentFragment
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.Dom.DocumentFragment classe. DocumentFragment est un objet Document léger ou minimal. Il est très courant de vouloir pouvoir extraire une partie de larborescence dun document ou de créer un nouveau fragment dun document.
type: docs
weight: 820
url: /fr/net/aspose.svg.dom/documentfragment/
---
## DocumentFragment class

DocumentFragment est un objet Document "léger" ou "minimal". Il est très courant de vouloir pouvoir extraire une partie de l'arborescence d'un document ou de créer un nouveau fragment d'un document.

```csharp
public class DocumentFragment : Node, IParentNode
```

## Propriétés

| Nom | La description |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes/) { get; } | Un NamedNodeMap contenant les attributs de ce nœud (si c'est un Element) ou null sinon. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri/) { get; } | L'URI de base absolu de ce nœud ou null si l'implémentation n'a pas pu obtenir d'URI absolu. |
| [ChildElementCount](../../aspose.svg.dom/documentfragment/childelementcount/) { get; } | Renvoie le nombre actuel de nœuds d'élément qui sont des enfants de cet élément. 0 si cet élément n'a pas de nœuds enfants qui sont de nodeType 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | Une NodeList qui contient tous les enfants de ce nœud. S'il n'y a pas d'enfants, il s'agit d'une NodeList ne contenant aucun nœud.. |
| [Children](../../aspose.svg.dom/documentfragment/children/) { get; } | Renvoie les éléments enfants de l'élément actuel. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | Le premier enfant de ce nœud. S'il n'y a pas de tel nœud, cela renvoie null. |
| [FirstElementChild](../../aspose.svg.dom/documentfragment/firstelementchild/) { get; } | Renvoie le premier nœud d'élément enfant de cet élément. null si cet élément n'a pas d'éléments enfants. |
| [InnerHTML](../../aspose.svg.dom/documentfragment/innerhtml/) { get; set; } | Renvoie un fragment de HTML ou XML qui représente le contenu de l'élément. Peut être défini pour remplacer le contenu de l'élément par des nœuds analysés à partir de la chaîne donnée. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | Le dernier enfant de ce nœud. S'il n'y a pas de tel nœud, cela renvoie null. |
| [LastElementChild](../../aspose.svg.dom/documentfragment/lastelementchild/) { get; } | Renvoie le dernier nœud d'élément enfant de cet élément. null si cet élément n'a pas d'éléments enfants. |
| virtual [LocalName](../../aspose.svg.dom/node/localname/) { get; } | Renvoie la partie locale du nom qualifié de ce nœud. Pour les nœuds de tout type autre que ELEMENT_NODE et ATTRIBUTE_NODE et les nœuds créés avec une méthode DOM Niveau 1, comme Document.createElement(), c'est toujours null. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri/) { get; } | L'URI de l'espace de noms de ce nœud, ou null s'il n'est pas spécifié. |
| [NextElementSibling](../../aspose.svg.dom/documentfragment/nextelementsibling/) { get; } | Renvoie le prochain nœud d'élément frère de cet élément. null si cet élément n'a aucun nœud frère d'élément qui vient après celui-ci dans l'arborescence du document. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | Le nœud suivant immédiatement ce nœud. S'il n'y a pas de tel nœud, cela renvoie null. |
| override [NodeName](../../aspose.svg.dom/documentfragment/nodename/) { get; } | Le nom de ce nœud, en fonction de son type. |
| override [NodeType](../../aspose.svg.dom/documentfragment/nodetype/) { get; } | Un code représentant le type de l'objet sous-jacent. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | La valeur de ce nœud, en fonction de son type. |
| [OuterHTML](../../aspose.svg.dom/documentfragment/outerhtml/) { get; set; } | Renvoie un fragment de HTML ou XML qui représente l'élément et son contenu. Peut être défini pour remplacer l'élément par des nœuds analysés à partir de la chaîne donnée. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument/) { get; } | L'objet Document associé à ce nœud. Il s'agit également de l'objet Document utilisé pour créer de nouveaux nœuds. Lorsque ce nœud est un Document ou un DocumentType qui n'est pas encore utilisé avec un Document, c'est null. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Obtient le parent[`Element`](../element/) de ce nœud. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | Le parent de ce nœud. Tous les nœuds, à l'exception de Attr, Document, DocumentFragment, Entity et Notation peuvent avoir un parent. Cependant, si un nœud vient d'être créé et n'a pas encore été ajouté à l'arbre, ou s'il a été supprimé de l'arbre, c'est null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix/) { get; set; } | Le préfixe d'espace de noms de ce nœud, ou null s'il n'est pas spécifié. Lorsqu'il est défini comme étant nul, sa définition n'a aucun effet |
| [PreviousElementSibling](../../aspose.svg.dom/documentfragment/previouselementsibling/) { get; } | Renvoie le nœud d'élément frère précédent de cet élément. null si cet élément n'a aucun nœud frère d'élément qui précède celui-ci dans l'arborescence du document. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | Le nœud précédant immédiatement ce nœud. S'il n'y a pas de tel nœud, cela renvoie null. |
| override [TextContent](../../aspose.svg.dom/documentfragment/textcontent/) { get; set; } | Cet attribut renvoie le contenu textuel de ce nœud et de ses descendants. Lorsqu'il est défini comme étant nul, sa définition n'a aucun effet. Lors de la définition, tous les enfants possibles que ce nœud peut avoir sont supprimés et, si la nouvelle chaîne n'est pas vide ou nulle, remplacés par un seul nœud de texte contenant la chaîne à laquelle cet attribut est défini. |

## Méthodes

| Nom | La description |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | Cette méthode permet l'enregistrement des écouteurs d'événement sur la cible de l'événement. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | Cette méthode permet l'enregistrement des écouteurs d'événement sur la cible de l'événement. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | Cette méthode permet l'enregistrement des écouteurs d'événement sur la cible de l'événement. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | Ajoute le nœud newChild à la fin de la liste des enfants de ce nœud. Si le newChild est déjà dans l'arborescence, il est d'abord supprimé. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Renvoie un doublon de ce nœud, c'est-à-dire qu'il sert de constructeur de copie générique pour les nœuds. Le nœud dupliqué n'a pas de parent (parentNode est nul) et pas de données utilisateur. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | Renvoie un doublon de ce nœud, c'est-à-dire qu'il sert de constructeur de copie générique pour les nœuds. Le nœud dupliqué n'a pas de parent (parentNode est nul) et pas de données utilisateur. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Cette méthode permet de répartir les événements dans le modèle d'événement des implémentations. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Effectue des tâches définies par l'application associées à la libération, à la libération ou à la réinitialisation des ressources non gérées. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Cette méthode est utilisée pour récupérer l'objet ECMAScriptType . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes/)() | Renvoie si ce nœud (s'il s'agit d'un élément) a des attributs |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Renvoie si ce nœud a des enfants. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | Insère le nœud avant le nœud enfant existant. Si enfant est nul, insère le nœud à la fin de la liste des enfants. Si enfant est un objet DocumentFragment, tous ses enfants sont insérés, dans le même ordre, avant enfant. Si l'enfant est déjà dans l'arborescence, il est d'abord supprimé. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | Cette méthode vérifie si le namespaceURI spécifié est l'espace de noms par défaut ou non. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | Teste si deux nœuds sont égaux. Cette méthode teste l'égalité des nœuds, pas la similitude (c'est-à-dire si les deux nœuds sont des références au même objet) qui peut être testée avec Node.isSameNode(). Tous les nœuds identiques seront également égaux, bien que l'inverse puisse ne pas être vrai. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | Renvoie si ce nœud est le même nœud que celui donné. Cette méthode permet de déterminer si deux références de nœud renvoyées par l'implémentation font référence au même objet. Lorsque deux références de nœud sont des références au même objet, même via un proxy, les références peuvent être utilisées de manière complètement interchangeable, de sorte que tous les attributs ont les mêmes valeurs et que l'appel de la même méthode DOM sur l'une ou l'autre des références a toujours exactement le même effet. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | Recherchez l'URI de l'espace de noms associé au préfixe donné, à partir de ce nœud. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | Recherchez le préfixe associé à l'URI de l'espace de noms donné, à partir de ce nœud. Les déclarations d'espace de noms par défaut sont ignorées par cette méthode. Voir Recherche de préfixe d'espace de noms pour plus de détails sur l'algorithme utilisé par cette méthode. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Met tous les nœuds de texte dans toute la profondeur de la sous-arborescence sous ce nœud, y compris les nœuds d'attribut, dans une forme "normale" où seule la structure (par exemple, les éléments, les commentaires, les instructions de traitement, les sections CDATA et les références d'entité) sépare le texte nœuds, c'est-à-dire qu'il n'y a ni nœuds Text adjacents ni nœuds Text vides. Cela peut être utilisé pour s'assurer que la vue DOM d'un document est la même que s'il avait été enregistré et rechargé, et est utile lorsque des opérations (telles que les recherches XPointer [XPointer]) qui dépendent d'une arborescence de document particulière doivent être utilisé. Si le paramètre "normalize-characters" de l'objet DOMConfiguration attaché au Node.ownerDocument est vrai, cette méthode normalisera également complètement les caractères des nœuds Text. |
| [QuerySelector](../../aspose.svg.dom/documentfragment/queryselector/)(string) | Renvoie le premier élément du document, qui correspond à selector |
| [QuerySelectorAll](../../aspose.svg.dom/documentfragment/queryselectorall/)(string) | Renvoie une NodeList de tous les éléments du document, qui correspondent à selector |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | Supprime le nœud enfant indiqué par oldChild de la liste des enfants et le renvoie. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | Cette méthode permet de supprimer les écouteurs d'événement de la cible de l'événement. Si un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) est retiré d'un[`EventTarget`](../eventtarget/) pendant qu'il traite un événement, il ne sera pas déclenché par les actions en cours. Les écouteurs d'événement ne peuvent jamais être invoqués après avoir été supprimés. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | Cette méthode permet de supprimer les écouteurs d'événement de la cible de l'événement. Si un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) est retiré d'un[`EventTarget`](../eventtarget/) pendant qu'il traite un événement, il ne sera pas déclenché par les actions en cours. Les écouteurs d'événement ne peuvent jamais être invoqués après avoir été supprimés. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | Cette méthode permet de supprimer les écouteurs d'événement de la cible de l'événement. Si un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) est retiré d'un[`EventTarget`](../eventtarget/) pendant qu'il traite un événement, il ne sera pas déclenché par les actions en cours. Les écouteurs d'événement ne peuvent jamais être invoqués après avoir été supprimés. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | Remplace le nœud enfant oldChild par newChild dans la liste des enfants et renvoie le nœud oldChild. Si newChild est un objet DocumentFragment, oldChild est remplacé par tous les enfants DocumentFragment, qui sont insérés dans le même ordre. Si le newChild est déjà dans l'arborescence, il est d'abord supprimé. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | Renvoie unString qui représente cette instance. |

### Voir également

* class [Node](../node/)
* interface [IParentNode](../iparentnode/)
* espace de noms [Aspose.Svg.Dom](../../aspose.svg.dom/)
* Assemblée [Aspose.SVG](../../)


