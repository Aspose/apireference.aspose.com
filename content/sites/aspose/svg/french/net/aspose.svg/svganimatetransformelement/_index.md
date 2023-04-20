---
title: Class SVGAnimateTransformElement
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.SVGAnimateTransformElement classe. Linterface SVGAnimateTransformElement correspond à lélément animateTransform. Laccès orienté objet aux attributs de lélément animateTransform via le DOM SVG nest pas disponible.
type: docs
weight: 3110
url: /fr/net/aspose.svg/svganimatetransformelement/
---
## SVGAnimateTransformElement class

L'interface SVGAnimateTransformElement correspond à l'élément 'animateTransform'. L'accès orienté objet aux attributs de l'élément 'animateTransform' via le DOM SVG n'est pas disponible.

```csharp
public class SVGAnimateTransformElement : SVGAnimationElement
```

## Propriétés

| Nom | La description |
| --- | --- |
| override [Attributes](../../aspose.svg.dom/element/attributes/) { get; } | Un NamedNodeMap contenant les attributs de ce nœud (si c'est un Element) ou null sinon. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri/) { get; } | L'URI de base absolu de ce nœud ou null si l'implémentation n'a pas pu obtenir d'URI absolu. |
| [ChildElementCount](../../aspose.svg.dom/element/childelementcount/) { get; } | Renvoie le nombre actuel de nœuds d'élément qui sont des enfants de cet élément. 0 si cet élément n'a pas de nœuds enfants qui sont de nodeType 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | Une NodeList qui contient tous les enfants de ce nœud. S'il n'y a pas d'enfants, il s'agit d'une NodeList ne contenant aucun nœud.. |
| [Children](../../aspose.svg.dom/element/children/) { get; } | Renvoie les éléments enfants de l'élément actuel. |
| [ClassList](../../aspose.svg.dom/element/classlist/) { get; } | Renvoie une DOMTokenList en direct qui contient les jetons reçus de l'analyse de l'attribut "class". |
| [ClassName](../../aspose.svg/svgelement/classname/) { get; } | Correspond à l'attribut 'class' sur l'élément donné. |
| [ClassName](../../aspose.svg.dom/element/classname/) { get; set; } | L'attribut de classe de l'élément. Cet attribut a été renommé due en raison de conflits avec le mot clé "class" exposé par de nombreuses langues. Voir la définition d'attribut de classe dans HTML 4.01. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | Le premier enfant de ce nœud. S'il n'y a pas de tel nœud, cela renvoie null. |
| [FirstElementChild](../../aspose.svg.dom/element/firstelementchild/) { get; } | Renvoie le premier nœud d'élément enfant de cet élément. null si cet élément n'a pas d'éléments enfants. |
| [Id](../../aspose.svg/svgelement/id/) { get; set; } | La valeur de l'attribut 'id' sur l'élément donné, ou la chaîne vide si 'id' n'est pas présent. |
| [InnerHTML](../../aspose.svg.dom/element/innerhtml/) { get; set; } | Renvoie un fragment de HTML ou XML qui représente le contenu de l'élément. Peut être défini pour remplacer le contenu de l'élément par des nœuds analysés à partir de la chaîne donnée. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | Le dernier enfant de ce nœud. S'il n'y a pas de tel nœud, cela renvoie null. |
| [LastElementChild](../../aspose.svg.dom/element/lastelementchild/) { get; } | Renvoie le dernier nœud d'élément enfant de cet élément. null si cet élément n'a pas d'éléments enfants. |
| override [LocalName](../../aspose.svg.dom/element/localname/) { get; } | Renvoie la partie locale du nom qualifié de ce nœud. Pour les nœuds de tout type autre que ELEMENT_NODE et ATTRIBUTE_NODE et les nœuds créés avec une méthode DOM Niveau 1, comme Document.createElement(), c'est toujours null. |
| override [NamespaceURI](../../aspose.svg.dom/element/namespaceuri/) { get; } | L'URI de l'espace de noms de ce nœud, ou null s'il n'est pas spécifié. |
| [NextElementSibling](../../aspose.svg.dom/element/nextelementsibling/) { get; } | Renvoie le prochain nœud d'élément frère de cet élément. null si cet élément n'a aucun nœud frère d'élément qui vient après celui-ci dans l'arborescence du document. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | Le nœud suivant immédiatement ce nœud. S'il n'y a pas de tel nœud, cela renvoie null. |
| override [NodeName](../../aspose.svg.dom/element/nodename/) { get; } | Le nom de ce nœud, en fonction de son type. |
| override [NodeType](../../aspose.svg.dom/element/nodetype/) { get; } | Un code représentant le type de l'objet sous-jacent. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | La valeur de ce nœud, en fonction de son type. |
| [OuterHTML](../../aspose.svg.dom/element/outerhtml/) { get; set; } | Renvoie un fragment de HTML ou XML qui représente l'élément et son contenu. Peut être défini pour remplacer l'élément par des nœuds analysés à partir de la chaîne donnée. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument/) { get; } | L'objet Document associé à ce nœud. Il s'agit également de l'objet Document utilisé pour créer de nouveaux nœuds. Lorsque ce nœud est un Document ou un DocumentType qui n'est pas encore utilisé avec un Document, c'est null. |
| [OwnerSVGElement](../../aspose.svg/svgelement/ownersvgelement/) { get; } | L'élément 'svg' ancêtre le plus proche. Null si l'élément donné est l'élément svg le plus externe. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Obtient le parent[`Element`](../../aspose.svg.dom/element/) de ce nœud. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | Le parent de ce nœud. Tous les nœuds, à l'exception de Attr, Document, DocumentFragment, Entity et Notation peuvent avoir un parent. Cependant, si un nœud vient d'être créé et n'a pas encore été ajouté à l'arbre, ou s'il a été supprimé de l'arbre, c'est null. |
| override [Prefix](../../aspose.svg.dom/element/prefix/) { get; } | Le préfixe d'espace de noms de ce nœud, ou null s'il n'est pas spécifié. Lorsqu'il est défini comme étant nul, sa définition n'a aucun effet |
| [PreviousElementSibling](../../aspose.svg.dom/element/previouselementsibling/) { get; } | Renvoie le nœud d'élément frère précédent de cet élément. null si cet élément n'a aucun nœud frère d'élément qui précède celui-ci dans l'arborescence du document. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | Le nœud précédant immédiatement ce nœud. S'il n'y a pas de tel nœud, cela renvoie null. |
| [RequiredExtensions](../../aspose.svg/svganimationelement/requiredextensions/) { get; } | Correspond à l'attribut 'requiredExtensions' sur l'élément donné. |
| [RequiredFeatures](../../aspose.svg/svganimationelement/requiredfeatures/) { get; } | Correspond à l'attribut 'requiredFeatures' sur l'élément donné. |
| [SchemaTypeInfo](../../aspose.svg.dom/element/schematypeinfo/) { get; } | Les informations de type associées à cet élément. |
| [ShadowRoot](../../aspose.svg.dom/element/shadowroot/) { get; } | Renvoie shadowRoot stocké sur cet élément ou null s'il est fermé. |
| [Style](../../aspose.svg/svgelement/style/) { get; } | Correspond à l'attribut 'style' sur l'élément donné. Si l'agent utilisateur ne prend pas en charge le style avec CSS, cet attribut doit toujours avoir la valeur null. |
| [SystemLanguage](../../aspose.svg/svganimationelement/systemlanguage/) { get; } | Correspond à l'attribut 'systemLanguage' sur l'élément donné. |
| [TagName](../../aspose.svg.dom/element/tagname/) { get; } | Le nom de l'élément. |
| [TargetElement](../../aspose.svg/svganimationelement/targetelement/) { get; } | L'élément qui est animé. |
| override [TextContent](../../aspose.svg.dom/element/textcontent/) { get; set; } | Cet attribut renvoie le contenu textuel de ce nœud et de ses descendants. Lorsqu'il est défini comme étant nul, sa définition n'a aucun effet. Lors de la définition, tous les enfants possibles que ce nœud peut avoir sont supprimés et, si la nouvelle chaîne n'est pas vide ou nulle, remplacés par un seul nœud de texte contenant la chaîne à laquelle cet attribut est défini. |
| [ViewportElement](../../aspose.svg/svgelement/viewportelement/) { get; } | L'élément qui a établi la fenêtre courante. Souvent, l'élément 'svg' ancêtre le plus proche. Null si l'élément donné est l'élément svg le plus externe. |

## Méthodes

| Nom | La description |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | Cette méthode permet l'enregistrement des écouteurs d'événement sur la cible de l'événement. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | Cette méthode permet l'enregistrement des écouteurs d'événement sur la cible de l'événement. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | Cette méthode permet l'enregistrement des écouteurs d'événement sur la cible de l'événement. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | Ajoute le nœud newChild à la fin de la liste des enfants de ce nœud. Si le newChild est déjà dans l'arborescence, il est d'abord supprimé. |
| [AttachShadow](../../aspose.svg.dom/element/attachshadow/)(ShadowRootMode) | Crée une racine fantôme et l'attache à l'élément actuel. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Renvoie un doublon de ce nœud, c'est-à-dire qu'il sert de constructeur de copie générique pour les nœuds. Le nœud dupliqué n'a pas de parent (parentNode est nul) et pas de données utilisateur. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | Renvoie un doublon de ce nœud, c'est-à-dire qu'il sert de constructeur de copie générique pour les nœuds. Le nœud dupliqué n'a pas de parent (parentNode est nul) et pas de données utilisateur. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Cette méthode permet de répartir les événements dans le modèle d'événement des implémentations. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Effectue des tâches définies par l'application associées à la libération, à la libération ou à la réinitialisation des ressources non gérées. |
| [GetAttribute](../../aspose.svg.dom/element/getattribute/)(string) | Récupère une valeur d'attribut par nom. |
| [GetAttributeNode](../../aspose.svg.dom/element/getattributenode/)(string) | Récupère un nœud d'attribut par nom. |
| [GetAttributeNodeNS](../../aspose.svg.dom/element/getattributenodens/)(string, string) | Récupère un nœud Attr par nom local et URI d'espace de noms. |
| [GetAttributeNS](../../aspose.svg.dom/element/getattributens/)(string, string) | Récupère une valeur d'attribut par nom local et URI d'espace de noms. |
| [GetElementsByClassName](../../aspose.svg.dom/element/getelementsbyclassname/)(string) | Renvoie un objet NodeList actif contenant tous les éléments du document qui ont toutes les classes spécifiées dans l'argument. http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/element/getelementsbytagname/)(string) | Renvoie une NodeList de tous les éléments descendants avec un nom de balise donné, dans l'ordre du document. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/element/getelementsbytagnamens/)(string, string) | Renvoie une NodeList de tous les éléments descendants avec un nom local et un URI d'espace de noms donnés dans l'ordre du document. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Cette méthode est utilisée pour récupérer l'objet ECMAScriptType . |
| [HasAttribute](../../aspose.svg.dom/element/hasattribute/)(string) | Renvoie vrai lorsqu'un attribut avec un nom donné est spécifié sur cet élément ou a une valeur par défaut, faux sinon. |
| [HasAttributeNS](../../aspose.svg.dom/element/hasattributens/)(string, string) | Renvoie vrai lorsqu'un attribut avec un nom local et un URI d'espace de noms donnés est spécifié sur cet élément ou a une valeur par défaut, faux sinon. |
| override [HasAttributes](../../aspose.svg.dom/element/hasattributes/)() | Renvoie si ce nœud (s'il s'agit d'un élément) a des attributs |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Renvoie si ce nœud a des enfants. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | Insère le nœud avant le nœud enfant existant. Si enfant est nul, insère le nœud à la fin de la liste des enfants. Si enfant est un objet DocumentFragment, tous ses enfants sont insérés, dans le même ordre, avant enfant. Si l'enfant est déjà dans l'arborescence, il est d'abord supprimé. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | Cette méthode vérifie si le namespaceURI spécifié est l'espace de noms par défaut ou non. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | Teste si deux nœuds sont égaux. Cette méthode teste l'égalité des nœuds, pas la similitude (c'est-à-dire si les deux nœuds sont des références au même objet) qui peut être testée avec Node.isSameNode(). Tous les nœuds identiques seront également égaux, bien que l'inverse puisse ne pas être vrai. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | Renvoie si ce nœud est le même nœud que celui donné. Cette méthode permet de déterminer si deux références de nœud renvoyées par l'implémentation font référence au même objet. Lorsque deux références de nœud sont des références au même objet, même via un proxy, les références peuvent être utilisées de manière complètement interchangeable, de sorte que tous les attributs ont les mêmes valeurs et que l'appel de la même méthode DOM sur l'une ou l'autre des références a toujours exactement le même effet. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | Recherchez l'URI de l'espace de noms associé au préfixe donné, à partir de ce nœud. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | Recherchez le préfixe associé à l'URI de l'espace de noms donné, à partir de ce nœud. Les déclarations d'espace de noms par défaut sont ignorées par cette méthode. Voir Recherche de préfixe d'espace de noms pour plus de détails sur l'algorithme utilisé par cette méthode. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Met tous les nœuds de texte dans toute la profondeur de la sous-arborescence sous ce nœud, y compris les nœuds d'attribut, dans une forme "normale" où seule la structure (par exemple, les éléments, les commentaires, les instructions de traitement, les sections CDATA et les références d'entité) sépare le texte nœuds, c'est-à-dire qu'il n'y a ni nœuds Text adjacents ni nœuds Text vides. Cela peut être utilisé pour s'assurer que la vue DOM d'un document est la même que s'il avait été enregistré et rechargé, et est utile lorsque des opérations (telles que les recherches XPointer [XPointer]) qui dépendent d'une arborescence de document particulière doivent être utilisé. Si le paramètre "normalize-characters" de l'objet DOMConfiguration attaché au Node.ownerDocument est vrai, cette méthode normalisera également complètement les caractères des nœuds Text. |
| [QuerySelector](../../aspose.svg.dom/element/queryselector/)(string) | Renvoie le premier élément du document, qui correspond à selector |
| [QuerySelectorAll](../../aspose.svg.dom/element/queryselectorall/)(string) | Renvoie une NodeList de tous les éléments du document, qui correspondent à selector |
| [Remove](../../aspose.svg.dom/element/remove/)() | Supprime cette instance. |
| [RemoveAttribute](../../aspose.svg.dom/element/removeattribute/)(string) | Supprime un attribut par nom. |
| [RemoveAttributeNode](../../aspose.svg.dom/element/removeattributenode/)(Attr) | Supprime le nœud d'attribut spécifié. |
| [RemoveAttributeNS](../../aspose.svg.dom/element/removeattributens/)(string, string) | Supprime un attribut par nom local et URI d'espace de noms. |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | Supprime le nœud enfant indiqué par oldChild de la liste des enfants et le renvoie. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | Cette méthode permet de supprimer les écouteurs d'événement de la cible de l'événement. Si un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) est retiré d'un[`EventTarget`](../../aspose.svg.dom/eventtarget/) pendant qu'il traite un événement, il ne sera pas déclenché par les actions en cours. Les écouteurs d'événement ne peuvent jamais être invoqués après avoir été supprimés. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | Cette méthode permet de supprimer les écouteurs d'événement de la cible de l'événement. Si un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) est retiré d'un[`EventTarget`](../../aspose.svg.dom/eventtarget/) pendant qu'il traite un événement, il ne sera pas déclenché par les actions en cours. Les écouteurs d'événement ne peuvent jamais être invoqués après avoir été supprimés. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | Cette méthode permet de supprimer les écouteurs d'événement de la cible de l'événement. Si un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) est retiré d'un[`EventTarget`](../../aspose.svg.dom/eventtarget/) pendant qu'il traite un événement, il ne sera pas déclenché par les actions en cours. Les écouteurs d'événement ne peuvent jamais être invoqués après avoir été supprimés. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | Remplace le nœud enfant oldChild par newChild dans la liste des enfants et renvoie le nœud oldChild. Si newChild est un objet DocumentFragment, oldChild est remplacé par tous les enfants DocumentFragment, qui sont insérés dans le même ordre. Si le newChild est déjà dans l'arborescence, il est d'abord supprimé. |
| [SetAttribute](../../aspose.svg.dom/element/setattribute/)(string, string) | Ajoute un nouvel attribut. Si un attribut portant ce nom est déjà présent dans l'élément, sa valeur est modifiée pour être celle de la valeur parameter |
| [SetAttributeNode](../../aspose.svg.dom/element/setattributenode/)(Attr) | Ajoute un nouveau nœud d'attribut. Si un attribut portant ce nom (nodeName) est déjà présent dans l'élément, il est remplacé par le nouveau. |
| [SetAttributeNodeNS](../../aspose.svg.dom/element/setattributenodens/)(Attr) | Ajoute un nouvel attribut. Si un attribut avec ce nom local et cet URI d'espace de noms est déjà présent dans l'élément, il est remplacé par le nouveau. |
| [SetAttributeNS](../../aspose.svg.dom/element/setattributens/)(string, string, string) | Ajoute un nouvel attribut. Si un attribut avec le même nom local et le même URI d'espace de noms est déjà présent sur l'élément, son préfixe est modifié pour être la partie préfixe du qualifiéName, et sa valeur est modifiée pour être le paramètre de valeur. |
| [SetIdAttribute](../../aspose.svg.dom/element/setidattribute/)(string, bool) | Si le paramètre isId est vrai, cette méthode déclare l'attribut spécifié comme étant un attribut d'ID déterminé par l'utilisateur. |
| [SetIdAttributeNode](../../aspose.svg.dom/element/setidattributenode/)(Attr, bool) | Si le paramètre isId est vrai, cette méthode déclare l'attribut spécifié comme étant un attribut d'ID déterminé par l'utilisateur. |
| [SetIdAttributeNS](../../aspose.svg.dom/element/setidattributens/)(string, string, bool) | Si le paramètre isId est vrai, cette méthode déclare l'attribut spécifié comme étant un attribut d'ID déterminé par l'utilisateur. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | Renvoie unString qui représente cette instance. |

### Voir également

* class [SVGAnimationElement](../svganimationelement/)
* espace de noms [Aspose.Svg](../../aspose.svg/)
* Assemblée [Aspose.SVG](../../)


