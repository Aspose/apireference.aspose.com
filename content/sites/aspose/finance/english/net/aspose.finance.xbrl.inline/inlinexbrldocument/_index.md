---
title: InlineXbrlDocument
second_title: Aspose.Finance for .NET API Reference
description: 
type: docs
weight: 7750
url: /net/aspose.finance.xbrl.inline/inlinexbrldocument/
---
## InlineXbrlDocument class

An inline XBRL document.

```csharp
public class InlineXbrlDocument : Document
```

## Constructors

| Name | Description |
| --- | --- |
| [InlineXbrlDocument](inlinexbrldocument)(string) | Initializes a new instance of [`InlineXbrlDocument`](../inlinexbrldocument) class and open a file. |

## Properties

| Name | Description |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/arcrolereferences) { get; } | Gets the collection of [`ArcroleReference`](../../aspose.finance.xbrl/arcrolereference) in the inline XBRL document. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | Gets the absolute base URI of this node or null if the implementation wasn't able to obtain an absolute URI. |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset) { get; } | Gets the document's encoding. |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements) { get; } | Gets the child elements. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | Gets the child nodes. |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype) { get; } | Gets the document content type. |
| [Contexts](../../aspose.finance.xbrl.inline/inlinexbrldocument/contexts) { get; } | Gets the collection of [`Context`](../../aspose.finance.xbrl/context) in the inline XBRL document. |
| [Continuations](../../aspose.finance.xbrl.inline/inlinexbrldocument/continuations) { get; } | Gets the collection of [`InlineContinuation`](../inlinecontinuation) in the inline XBRL document. |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement) { get; } | This is a convenience attribute that allows direct access to the child node that is the document element of the document. |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi) { get; } | Gets the document URI. |
| [Facts](../../aspose.finance.xbrl.inline/inlinexbrldocument/facts) { get; } | Gets the collection of [`InlineFact`](../inlinefact) in the inline XBRL document. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | Gets the first child of this node. If there is no such node, this returns null. |
| [Footnotes](../../aspose.finance.xbrl.inline/inlinexbrldocument/footnotes) { get; } | Gets the collection of [`InlineFootnote`](../inlinefootnote) in the inline XBRL document. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | Gets whether this node has any children. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | Gets the last child of this node. If there is no such node, this returns null. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname) { get; } | Gets the local part of the qualified name of this node. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri) { get; } | Gets the namespace URI of this node. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | Gets the node immediately following this node. If there is no such node, this returns null. |
| override [NodeName](../../aspose.finance.xbrl.dom/document/nodename) { get; } | Gets the node name of the document. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype) { get; } | Gets the node type. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue) { get; set; } | Gets or sets the value of this node, depending on its type. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument) { get; } | Gets the document object associated with this node. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode) { get; } | Gets the parent node. |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix) { get; set; } | Gets or sets the namespace prefix of this node. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling) { get; } | Gets the node immediately preceding this node. If there is no such node, this returns null. |
| [References](../../aspose.finance.xbrl.inline/inlinexbrldocument/references) { get; } | Gets the [`InlineReferences`](../inlinereferences) in the inline XBRL document. |
| [Relationships](../../aspose.finance.xbrl.inline/inlinexbrldocument/relationships) { get; } | Gets the collection of [`InlineRelationship`](../inlinerelationship) in the inline XBRL document. |
| [RoleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/rolereferences) { get; } | Gets the collection of [`RoleReference`](../../aspose.finance.xbrl/rolereference) in the inline XBRL document. |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent) { get; set; } | Gets or sets the the text content of this node and its descendants. |
| [Units](../../aspose.finance.xbrl.inline/inlinexbrldocument/units) { get; } | Gets the collection of [`Unit`](../../aspose.finance.xbrl/unit) in the inline XBRL document. |
| [ValidationErrors](../../aspose.finance.xbrl.inline/inlinexbrldocument/validationerrors) { get; set; } | Gets the collection of [`ValidationError`](../../aspose.finance.xbrl.validator/validationerror) in the inline XBRL document. |

## Methods

| Name | Description |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild)(Node) | Adds the node newChild to the end of the list of children of this node. |
| [CreateHtmlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createhtmlelement)(string, string) | Creates a Html elment. |
| [CreateInlineXbrlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createinlinexbrlelement)(string, string) | Creates an inline xbrl elment. |
| [CreateXbrlInstanceElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrlinstanceelement)(string, string) | Creates a xbrl instance elment. |
| [CreateXbrlLinkbaseElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrllinkbaseelement)(string, string) | Creates a xbrl linkbase elment. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl)() | Export to XbrlDocument object. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl)(Stream) | Export to xbrl stream. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl)(string) | Export to xbrl file. |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getarcroletypebyuri)(string) | Gets the ArcroleType which has the specified uri. |
| [GetConceptById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyid)(string) | Gets the context which has the specified id. |
| [GetConceptByLoc](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyloc)(Loc) | Gets the concept by the locator. |
| [GetConceptByName](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyname)(string) | Gets the concept which has the specified name. |
| [GetContextById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontextbyid)(string) | Gets the context which has the specified id. |
| [GetContinuationChainByContinuationReference](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontinuationchainbycontinuationreference)(string) | Gets the continuation chain according to the continuation reference. |
| [GetRoleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getroletypebyuri)(string) | Gets the RoleType which has the specified uri. |
| [GetUnitById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getunitbyid)(string) | Gets the unit which has the specified id. |
| [IsValid](../../aspose.finance.xbrl.inline/inlinexbrldocument/isvalid)() | Checks whether this inlince XBRL document is valid. |
| [RefreshInlineXbrlObjects](../../aspose.finance.xbrl.inline/inlinexbrldocument/refreshinlinexbrlobjects)() | If add, update, remove Inline Xbrl elements in the DOM tree, this method should be called to refresh inline xbrl objects. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | Removes the child node indicated by old child from the list of children. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | Replaces the child node old child with new child in the list of children, and returns the old child node. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save)(Stream) | Creates and saves the inline xbrl file to the stream. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save)(string) | Creates and saves the inline xbrl file to the disk. |
| [Validate](../../aspose.finance.xbrl.inline/inlinexbrldocument/validate)() | Validates this inline XBRL document. |

### See Also

* class [Document](../../aspose.finance.xbrl.dom/document)
* namespace [Aspose.Finance.Xbrl.Inline](../../aspose.finance.xbrl.inline)
* assembly [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
