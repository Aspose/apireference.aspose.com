---
title: InlineXbrlElement
second_title: Aspose.Finance for .NET API Reference
description: The base class of inline xbrl element.
type: docs
weight: 7330
url: /net/aspose.finance.xbrl.dom.inline/inlinexbrlelement/
---
## InlineXbrlElement class

The base class of inline xbrl element.

```csharp
public class InlineXbrlElement : Element
```

## Properties

| Name | Description |
| --- | --- |
| [Attributes](../../aspose.finance.xbrl.dom/element/attributes) { get; } | Gets the attributes of the element. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | Gets the absolute base URI of this node or null if the implementation wasn't able to obtain an absolute URI. |
| [ChildElements](../../aspose.finance.xbrl.dom/element/childelements) { get; } | Gets the child elements of the element. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | Gets the child nodes. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | Gets the first child of this node. If there is no such node, this returns null. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | Gets whether this node has any children. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | Gets the last child of this node. If there is no such node, this returns null. |
| override [LocalName](../../aspose.finance.xbrl.dom/element/localname) { get; } | Gets the local name of the element. |
| override [NamespaceURI](../../aspose.finance.xbrl.dom/element/namespaceuri) { get; } | Gets the namespace URI of the element. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | Gets the node immediately following this node. If there is no such node, this returns null. |
| override [NodeName](../../aspose.finance.xbrl.dom/element/nodename) { get; } | Gets the node name of the element. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype) { get; } | Gets the node type. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue) { get; set; } | Gets or sets the value of this node, depending on its type. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument) { get; } | Gets the document object associated with this node. |
| [ParentElement](../../aspose.finance.xbrl.dom/element/parentelement) { get; } | Gets the parent element of the element. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode) { get; } | Gets the parent node. |
| override [Prefix](../../aspose.finance.xbrl.dom/element/prefix) { get; } | Gets the prefix of the element. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling) { get; } | Gets the node immediately preceding this node. If there is no such node, this returns null. |
| override [TextContent](../../aspose.finance.xbrl.dom/element/textcontent) { get; set; } | Gets the text content of the element. |

## Methods

| Name | Description |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild)(Node) | Adds the node newChild to the end of the list of children of this node. |
| [GetAttribute](../../aspose.finance.xbrl.dom/element/getattribute)(string) | Gets an attribute value by name. |
| [GetAttributeNS](../../aspose.finance.xbrl.dom/element/getattributens)(string, string) | Gets an attribute value by local name and namespace URI. |
| [HasAttribute](../../aspose.finance.xbrl.dom/element/hasattribute)(string) | Returns true when an attribute with a given name is specified on this element or has a default value, false otherwise. |
| [HasAttributeNS](../../aspose.finance.xbrl.dom/element/hasattributens)(string, string) | Returns true when an attribute with a given local name and namespace URI is specified on this element or has a default value, false otherwise. |
| [RemoveAttribute](../../aspose.finance.xbrl.dom/element/removeattribute)(string) | Removes an attribute by name. |
| [RemoveAttributeNS](../../aspose.finance.xbrl.dom/element/removeattributens)(string, string) | Removes an attribute by local name and namespace URI. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | Removes the child node indicated by old child from the list of children. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | Replaces the child node old child with new child in the list of children, and returns the old child node. |
| [SetAttribute](../../aspose.finance.xbrl.dom/element/setattribute)(string, string) | Adds a new attribute. If an attribute with that name is already present in the element, its value is changed to be that of the value parameter. |
| [SetAttributeNS](../../aspose.finance.xbrl.dom/element/setattributens)(string, string, string) | Adds a new attribute. If an attribute with the same local name and namespace URI is already present on the element, its prefix is changed to be the prefix part of the qualifiedName, and its value is changed to be the value parameter. |

### See Also

* class [Element](../../aspose.finance.xbrl.dom/element)
* namespace [Aspose.Finance.Xbrl.Dom.Inline](../../aspose.finance.xbrl.dom.inline)
* assembly [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
