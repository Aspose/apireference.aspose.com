---
title: GroupShape.Accept
linktitle: Accept
articleTitle: Accept
second_title: Aspose.Words for .NET
description: Discover the GroupShape Accept method to seamlessly engage visitors and enhance user experience on your website. Boost interaction today!
type: docs
weight: 30
url: /net/aspose.words.drawing/groupshape/accept/
---
## GroupShape.Accept method

Accepts a visitor.

```csharp
public override bool Accept(DocumentVisitor visitor)
```

| Parameter | Type | Description |
| --- | --- | --- |
| visitor | DocumentVisitor | The visitor that will visit the nodes. |

### Return Value

True if all nodes were visited; false if [`DocumentVisitor`](../../../aspose.words/documentvisitor/) stopped the operation before visiting all nodes.

## Remarks

Enumerates over this node and all of its children. Each node calls a corresponding method on [`DocumentVisitor`](../../../aspose.words/documentvisitor/).

For more info see the Visitor design pattern.

Calls [`VisitGroupShapeStart`](../../../aspose.words/documentvisitor/visitgroupshapestart/), then calls [`Accept`](../../../aspose.words/node/accept/) for all child shapes of this group shape and calls [`VisitGroupShapeEnd`](../../../aspose.words/documentvisitor/visitgroupshapeend/) at the end.

## Examples

Shows how to create a group of shapes, and print its contents using a document visitor.

```csharp
public void GroupOfShapes()
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);

    // If you need to create "NonPrimitive" shapes, such as SingleCornerSnipped, TopCornersSnipped, DiagonalCornersSnipped,
    // TopCornersOneRoundedOneSnipped, SingleCornerRounded, TopCornersRounded, DiagonalCornersRounded
    // please use DocumentBuilder.InsertShape methods.
    Shape balloon = new Shape(doc, ShapeType.Balloon)
    {
        Width = 200,
        Height = 200,
        Stroke = { Color = Color.Red }
    };

    Shape cube = new Shape(doc, ShapeType.Cube)
    {
        Width = 100,
        Height = 100,
        Stroke = { Color = Color.Blue }
    };

    GroupShape group = new GroupShape(doc);
    group.AppendChild(balloon);
    group.AppendChild(cube);

    Assert.That(group.IsGroup, Is.True);

    builder.InsertNode(group);

    ShapeGroupPrinter printer = new ShapeGroupPrinter();
    group.Accept(printer);

    Console.WriteLine(printer.GetText());
}

/// <summary>
/// Prints the contents of a visited shape group to the console.
/// </summary>
public class ShapeGroupPrinter : DocumentVisitor
{
    public ShapeGroupPrinter()
    {
        mBuilder = new StringBuilder();
    }

    public string GetText()
    {
        return mBuilder.ToString();
    }

    public override VisitorAction VisitGroupShapeStart(GroupShape groupShape)
    {
        mBuilder.AppendLine("Shape group started:");
        return VisitorAction.Continue;
    }

    public override VisitorAction VisitGroupShapeEnd(GroupShape groupShape)
    {
        mBuilder.AppendLine("End of shape group");
        return VisitorAction.Continue;
    }

    public override VisitorAction VisitShapeStart(Shape shape)
    {
        mBuilder.AppendLine("\tShape - " + shape.ShapeType + ":");
        mBuilder.AppendLine("\t\tWidth: " + shape.Width);
        mBuilder.AppendLine("\t\tHeight: " + shape.Height);
        mBuilder.AppendLine("\t\tStroke color: " + shape.Stroke.Color);
        mBuilder.AppendLine("\t\tFill color: " + shape.Fill.ForeColor);
        return VisitorAction.Continue;
    }

    public override VisitorAction VisitShapeEnd(Shape shape)
    {
        mBuilder.AppendLine("\tEnd of shape");
        return VisitorAction.Continue;
    }

    private readonly StringBuilder mBuilder;
}
```

### See Also

* class [DocumentVisitor](../../../aspose.words/documentvisitor/)
* class [GroupShape](../)
* namespace [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assembly [Aspose.Words](../../../)
