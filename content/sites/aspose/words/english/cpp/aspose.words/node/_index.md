---
title: Aspose::Words::Node class
linktitle: Node
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Node class. Base class for all nodes of a Word document. To learn more, visit the  documentation article in C++.'
type: docs
weight: 41000
url: /cpp/aspose.words/node/
---
## Node class


Base class for all nodes of a Word document. To learn more, visit the [Aspose.Words Document Object Model (DOM)](https://docs.aspose.com/words/cpp/aspose-words-document-object-model/) documentation article.

```cpp
class Node : public virtual System::Object
```

## Methods

| Method | Description |
| --- | --- |
| virtual [Accept](./accept/)(System::SharedPtr\<Aspose::Words::DocumentVisitor\>) | Accepts a visitor. |
| [Clone](./clone/)(bool) | Creates a duplicate of the node. |
| [get_CustomNodeId](./get_customnodeid/)() const | Specifies custom node identifier. |
| virtual [get_Document](./get_document/)() const | Gets the document to which this node belongs. |
| virtual [get_IsComposite](./get_iscomposite/)() | Returns **true** if this node can contain other nodes. |
| [get_NextNode](./get_nextnode/)() const |  |
| [get_NextSibling](./get_nextsibling/)() | Gets the node immediately following this node. |
| virtual [get_NodeType](./get_nodetype/)() const | Gets the type of this node. |
| [get_ParentNode](./get_parentnode/)() | Gets the immediate parent of this node. |
| [get_PreviousSibling](./get_previoussibling/)() | Gets the node immediately preceding this node. |
| [get_PrevNode](./get_prevnode/)() const |  |
| [get_Range](./get_range/)() | Returns a [Range](../range/) object that represents the portion of a document that is contained in this node. |
| [GetAncestor](./getancestor/)(Aspose::Words::NodeType) | Gets the first ancestor of the specified [NodeType](../nodetype/). |
| [GetAncestorOf](./getancestorof/)() |  |
| virtual [GetText](./gettext/)() | Gets the text of this node and of all its children. |
| [GetType](./gettype/)() const override |  |
| [Is](./is/)(const System::TypeInfo\&) const override |  |
| [IsAncestorNode](./isancestornode/)(const System::SharedPtr\<Aspose::Words::Node\>\&) |  |
| [NextPreOrder](./nextpreorder/)(const System::SharedPtr\<Aspose::Words::Node\>\&) | Gets next node according to the pre-order tree traversal algorithm. |
| static [NodeTypeToString](./nodetypetostring/)(Aspose::Words::NodeType) | A utility method that converts a node type enum value into a user friendly string. |
| [PreviousPreOrder](./previouspreorder/)(const System::SharedPtr\<Aspose::Words::Node\>\&) | Gets the previous node according to the pre-order tree traversal algorithm. |
| [Remove](./remove/)() | Removes itself from the parent. |
| [set_CustomNodeId](./set_customnodeid/)(int32_t) | Setter for [Aspose::Words::Node::get_CustomNodeId](./get_customnodeid/). |
| [set_NextNode](./set_nextnode/)(const System::SharedPtr\<Aspose::Words::Node\>\&) |  |
| [set_PrevNode](./set_prevnode/)(const System::SharedPtr\<Aspose::Words::Node\>\&) |  |
| [SetParent](./setparent/)(const System::SharedPtr\<Aspose::Words::Node\>\&) |  |
| [ToString](./tostring/)(Aspose::Words::SaveFormat) | Exports the content of the node into a string in the specified format. |
| [ToString](./tostring/)(const System::SharedPtr\<Aspose::Words::Saving::SaveOptions\>\&) | Exports the content of the node into a string using the specified save options. |
| static [Type](./type/)() |  |
## Remarks


A document is represented as a tree of nodes, similar to DOM or XmlDocument.

For more info see the Composite design pattern.

The [Node](./) class:

* Defines the child node interface.
* Defines the interface for visiting nodes.
* Provides default cloning capability.
* Implements parent node and owner document mechanisms.
* Implements access to sibling nodes.



## Examples



Shows how to clone a composite node. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
System::SharedPtr<Aspose::Words::Paragraph> para = doc->get_FirstSection()->get_Body()->get_FirstParagraph();
para->AppendChild<System::SharedPtr<Aspose::Words::Run>>(System::MakeObject<Aspose::Words::Run>(doc, u"Hello world!"));

// Below are two ways of cloning a composite node.
// 1 -  Create a clone of a node, and create a clone of each of its child nodes as well.
System::SharedPtr<Aspose::Words::Node> cloneWithChildren = System::ExplicitCast<Aspose::Words::Node>(para)->Clone(true);

ASSERT_TRUE((System::ExplicitCast<Aspose::Words::CompositeNode>(cloneWithChildren))->get_HasChildNodes());
ASSERT_EQ(u"Hello world!", cloneWithChildren->GetText().Trim());

// 2 -  Create a clone of a node just by itself without any children.
System::SharedPtr<Aspose::Words::Node> cloneWithoutChildren = System::ExplicitCast<Aspose::Words::Node>(para)->Clone(false);

ASSERT_FALSE((System::ExplicitCast<Aspose::Words::CompositeNode>(cloneWithoutChildren))->get_HasChildNodes());
ASSERT_EQ(System::String::Empty, cloneWithoutChildren->GetText().Trim());
```


Shows how to traverse through a composite node's collection of child nodes. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();

// Add two runs and one shape as child nodes to the first paragraph of this document.
auto paragraph = System::ExplicitCast<Aspose::Words::Paragraph>(doc->GetChild(Aspose::Words::NodeType::Paragraph, 0, true));
paragraph->AppendChild<System::SharedPtr<Aspose::Words::Run>>(System::MakeObject<Aspose::Words::Run>(doc, u"Hello world! "));

auto shape = System::MakeObject<Aspose::Words::Drawing::Shape>(doc, Aspose::Words::Drawing::ShapeType::Rectangle);
shape->set_Width(200);
shape->set_Height(200);
// Note that the 'CustomNodeId' is not saved to an output file and exists only during the node lifetime.
shape->set_CustomNodeId(100);
shape->set_WrapType(Aspose::Words::Drawing::WrapType::Inline);
paragraph->AppendChild<System::SharedPtr<Aspose::Words::Drawing::Shape>>(shape);

paragraph->AppendChild<System::SharedPtr<Aspose::Words::Run>>(System::MakeObject<Aspose::Words::Run>(doc, u"Hello again!"));

// Iterate through the paragraph's collection of immediate children,
// and print any runs or shapes that we find within.
System::SharedPtr<Aspose::Words::NodeCollection> children = paragraph->GetChildNodes(Aspose::Words::NodeType::Any, false);

ASSERT_EQ(3, paragraph->GetChildNodes(Aspose::Words::NodeType::Any, false)->get_Count());

for (auto&& child : System::IterateOver(children))
{
    switch (child->get_NodeType())
    {
        case Aspose::Words::NodeType::Run:
            std::cout << "Run contents:" << std::endl;
            std::cout << System::String::Format(u"\t\"{0}\"", child->GetText().Trim()) << std::endl;
            break;

        case Aspose::Words::NodeType::Shape:
        {
            auto childShape = System::ExplicitCast<Aspose::Words::Drawing::Shape>(child);
            std::cout << "Shape:" << std::endl;
            std::cout << System::String::Format(u"\t{0}, {1}x{2}", childShape->get_ShapeType(), childShape->get_Width(), childShape->get_Height()) << std::endl;
            ASSERT_EQ(100, shape->get_CustomNodeId());
            break;
        }

        default:
            break;
    }
}
```


Shows how to remove all child nodes of a specific type from a composite node. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Tables.docx");

ASSERT_EQ(2, doc->GetChildNodes(Aspose::Words::NodeType::Table, true)->get_Count());

System::SharedPtr<Aspose::Words::Node> curNode = doc->get_FirstSection()->get_Body()->get_FirstChild();

while (curNode != nullptr)
{
    // Save the next sibling node as a variable in case we want to move to it after deleting this node.
    System::SharedPtr<Aspose::Words::Node> nextNode = curNode->get_NextSibling();

    // A section body can contain Paragraph and Table nodes.
    // If the node is a Table, remove it from the parent.
    if (curNode->get_NodeType() == Aspose::Words::NodeType::Table)
    {
        curNode->Remove();
    }

    curNode = nextNode;
}

ASSERT_EQ(0, doc->GetChildNodes(Aspose::Words::NodeType::Table, true)->get_Count());
```

## See Also

* Namespace [Aspose::Words](../)
* Library [Aspose.Words for C++](../../)
