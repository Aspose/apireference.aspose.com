---
title: Story Class
linktitle: Story
articleTitle: Story
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Story class, your essential tool for managing block-level elements like Paragraphs and Tables efficiently.
type: docs
weight: 6960
url: /net/aspose.words/story/
---
## Story class

Base class for elements that contain block-level nodes [`Paragraph`](../paragraph/) and [`Table`](../../aspose.words.tables/table/).

To learn more, visit the [Logical Levels of Nodes in a Document](https://docs.aspose.com/words/net/logical-levels-of-nodes-in-a-document/) documentation article.

```csharp
public abstract class Story : CompositeNode
```

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.words/compositenode/count/) { get; } | Gets the number of immediate children of this node. |
| [CustomNodeId](../../aspose.words/node/customnodeid/) { get; set; } | Specifies custom node identifier. |
| virtual [Document](../../aspose.words/node/document/) { get; } | Gets the document to which this node belongs. |
| [FirstChild](../../aspose.words/compositenode/firstchild/) { get; } | Gets the first child of the node. |
| [FirstParagraph](../../aspose.words/story/firstparagraph/) { get; } | Gets the first paragraph in the story. |
| [HasChildNodes](../../aspose.words/compositenode/haschildnodes/) { get; } | Returns `true` if this node has any child nodes. |
| override [IsComposite](../../aspose.words/compositenode/iscomposite/) { get; } | Returns `true` as this node can have child nodes. |
| [LastChild](../../aspose.words/compositenode/lastchild/) { get; } | Gets the last child of the node. |
| [LastParagraph](../../aspose.words/story/lastparagraph/) { get; } | Gets the last paragraph in the story. |
| [NextSibling](../../aspose.words/node/nextsibling/) { get; } | Gets the node immediately following this node. |
| abstract [NodeType](../../aspose.words/node/nodetype/) { get; } | Gets the type of this node. |
| [Paragraphs](../../aspose.words/story/paragraphs/) { get; } | Gets a collection of paragraphs that are immediate children of the story. |
| [ParentNode](../../aspose.words/node/parentnode/) { get; } | Gets the immediate parent of this node. |
| [PreviousSibling](../../aspose.words/node/previoussibling/) { get; } | Gets the node immediately preceding this node. |
| [Range](../../aspose.words/node/range/) { get; } | Returns a [`Range`](../range/) object that represents the portion of a document that is contained in this node. |
| [StoryType](../../aspose.words/story/storytype/) { get; } | Gets the type of this story. |
| [Tables](../../aspose.words/story/tables/) { get; } | Gets a collection of tables that are immediate children of the story. |

## Methods

| Name | Description |
| --- | --- |
| abstract [Accept](../../aspose.words/node/accept/)(*[DocumentVisitor](../documentvisitor/)*) | Accepts a visitor. |
| abstract [AcceptEnd](../../aspose.words/compositenode/acceptend/)(*[DocumentVisitor](../documentvisitor/)*) | When implemented in a derived class, calls the VisitXXXEnd method of the specified document visitor. |
| abstract [AcceptStart](../../aspose.words/compositenode/acceptstart/)(*[DocumentVisitor](../documentvisitor/)*) | When implemented in a derived class, calls the VisitXXXStart method of the specified document visitor. |
| [AppendChild&lt;T&gt;](../../aspose.words/compositenode/appendchild/)(*T*) | Adds the specified node to the end of the list of child nodes for this node. |
| [AppendParagraph](../../aspose.words/story/appendparagraph/)(*string*) | A shortcut method that creates a [`Paragraph`](../paragraph/) object with optional text and appends it to the end of this object. |
| [Clone](../../aspose.words/node/clone/)(*bool*) | Creates a duplicate of the node. |
| [CreateNavigator](../../aspose.words/compositenode/createnavigator/)() | Creates navigator which can be used to traverse and read nodes. |
| [DeleteShapes](../../aspose.words/story/deleteshapes/)() | Deletes all shapes from the text of this story. |
| [GetAncestor](../../aspose.words/node/getancestor/)(*[NodeType](../nodetype/)*) | Gets the first ancestor of the specified [`NodeType`](../nodetype/). |
| [GetAncestor](../../aspose.words/node/getancestor/)(*Type*) | Gets the first ancestor of the specified object type. |
| [GetChild](../../aspose.words/compositenode/getchild/)(*[NodeType](../nodetype/), int, bool*) | Returns an Nth child node that matches the specified type. |
| [GetChildNodes](../../aspose.words/compositenode/getchildnodes/)(*[NodeType](../nodetype/), bool*) | Returns a live collection of child nodes that match the specified type. |
| [GetEnumerator](../../aspose.words/compositenode/getenumerator/)() | Provides support for the for each style iteration over the child nodes of this node. |
| override [GetText](../../aspose.words/compositenode/gettext/)() | Gets the text of this node and of all its children. |
| [IndexOf](../../aspose.words/compositenode/indexof/)(*[Node](../node/)*) | Returns the index of the specified child node in the child node array. |
| [InsertAfter&lt;T&gt;](../../aspose.words/compositenode/insertafter/)(*T, [Node](../node/)*) | Inserts the specified node immediately after the specified reference node. |
| [InsertBefore&lt;T&gt;](../../aspose.words/compositenode/insertbefore/)(*T, [Node](../node/)*) | Inserts the specified node immediately before the specified reference node. |
| [NextPreOrder](../../aspose.words/node/nextpreorder/)(*[Node](../node/)*) | Gets next node according to the pre-order tree traversal algorithm. |
| [PrependChild&lt;T&gt;](../../aspose.words/compositenode/prependchild/)(*T*) | Adds the specified node to the beginning of the list of child nodes for this node. |
| [PreviousPreOrder](../../aspose.words/node/previouspreorder/)(*[Node](../node/)*) | Gets the previous node according to the pre-order tree traversal algorithm. |
| [Remove](../../aspose.words/node/remove/)() | Removes itself from the parent. |
| [RemoveAllChildren](../../aspose.words/compositenode/removeallchildren/)() | Removes all the child nodes of the current node. |
| [RemoveChild&lt;T&gt;](../../aspose.words/compositenode/removechild/)(*T*) | Removes the specified child node. |
| [RemoveSmartTags](../../aspose.words/compositenode/removesmarttags/)() | Removes all [`SmartTag`](../../aspose.words.markup/smarttag/) descendant nodes of the current node. |
| [SelectNodes](../../aspose.words/compositenode/selectnodes/)(*string*) | Selects a list of nodes matching the XPath expression. |
| [SelectSingleNode](../../aspose.words/compositenode/selectsinglenode/)(*string*) | Selects the first [`Node`](../node/) that matches the XPath expression. |
| [ToString](../../aspose.words/node/tostring/)(*[SaveFormat](../saveformat/)*) | Exports the content of the node into a string in the specified format. |
| [ToString](../../aspose.words/node/tostring/)(*[SaveOptions](../../aspose.words.saving/saveoptions/)*) | Exports the content of the node into a string using the specified save options. |

## Remarks

Text of a Word document is said to consist of several stories. The main text is stored in the main text story represented by [`Body`](../body/), each header and footer is stored in a separate story represented by [`HeaderFooter`](../headerfooter/).

## Examples

Shows how to remove all shapes from a node.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Use a DocumentBuilder to insert a shape. This is an inline shape,
// which has a parent Paragraph, which is a child node of the first section's Body.
builder.InsertShape(ShapeType.Cube, 100.0, 100.0);

Assert.That(doc.GetChildNodes(NodeType.Shape, true).Count, Is.EqualTo(1));

// We can delete all shapes from the child paragraphs of this Body.
Assert.That(doc.FirstSection.Body.StoryType, Is.EqualTo(StoryType.MainText));
doc.FirstSection.Body.DeleteShapes();

Assert.That(doc.GetChildNodes(NodeType.Shape, true).Count, Is.EqualTo(0));
```

### See Also

* class [CompositeNode](../compositenode/)
* namespace [Aspose.Words](../../aspose.words/)
* assembly [Aspose.Words](../../)
