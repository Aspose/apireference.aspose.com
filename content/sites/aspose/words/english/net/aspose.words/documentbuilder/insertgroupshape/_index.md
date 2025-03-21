---
title: DocumentBuilder.InsertGroupShape
linktitle: InsertGroupShape
articleTitle: InsertGroupShape
second_title: Aspose.Words for .NET
description: Effortlessly group shapes with DocumentBuilder's InsertGroupShape method. Create organized designs by inserting new GroupShape nodes seamlessly.
type: docs
weight: 360
url: /net/aspose.words/documentbuilder/insertgroupshape/
---
## InsertGroupShape(*params ShapeBase[]*) {#insertgroupshape}

Groups the shapes passed as a parameter into a new GroupShape node which is inserted into the current position.

```csharp
public GroupShape InsertGroupShape(params ShapeBase[] shapes)
```

| Parameter | Type | Description |
| --- | --- | --- |
| shapes | ShapeBase[] | The list of shapes to be grouped. |

## Remarks

The position and dimension of the new GroupShape will be calculated automatically.

VML and DML shapes cannot be grouped together.

## Examples

Shows how to combine group shape with the shape.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Shape shape1 = builder.InsertShape(ShapeType.Rectangle, 200, 250);
shape1.Left = 20;
shape1.Top = 20;
shape1.Stroke.Color = Color.Red;

Shape shape2 = builder.InsertShape(ShapeType.Ellipse, 150, 200);
shape2.Left = 40;
shape2.Top = 50;
shape2.Stroke.Color = Color.Green;

// Combine shapes into a GroupShape node which is inserted into the specified position.
GroupShape groupShape1 = builder.InsertGroupShape(shape1, shape2);

// Combine Shape and GroupShape nodes.
Shape shape3 = (Shape)shape1.Clone(true);
GroupShape groupShape2 = builder.InsertGroupShape(groupShape1, shape3);

doc.Save(ArtifactsDir + "Shape.CombineGroupShape.docx");
```

Shows how to insert DML group shape.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Shape shape1 = builder.InsertShape(ShapeType.Rectangle, 200, 250);
shape1.Left = 20;
shape1.Top = 20;
shape1.Stroke.Color = Color.Red;

Shape shape2 = builder.InsertShape(ShapeType.Ellipse, 150, 200);
shape2.Left = 40;
shape2.Top = 50;
shape2.Stroke.Color = Color.Green;

// Dimensions for the new GroupShape node.
double left = 10;
double top = 10;
double width = 200;
double height = 300;
// Insert GroupShape node for the specified size which is inserted into the specified position.
GroupShape groupShape1 = builder.InsertGroupShape(left, top, width, height, new Shape[] { shape1, shape2 });

// Insert GroupShape node which position and dimension will be calculated automatically.
Shape shape3 = (Shape)shape1.Clone(true);
GroupShape groupShape2 = builder.InsertGroupShape(shape3);

doc.Save(ArtifactsDir + "Shape.InsertGroupShape.docx");
```

### See Also

* class [GroupShape](../../../aspose.words.drawing/groupshape/)
* class [ShapeBase](../../../aspose.words.drawing/shapebase/)
* class [DocumentBuilder](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

---

## InsertGroupShape(*double, double, double, double, params ShapeBase[]*) {#insertgroupshape_1}

Groups the shapes passed as a parameter into a new GroupShape node of the specified size which is inserted into the specified position.

```csharp
public GroupShape InsertGroupShape(double left, double top, double width, double height, 
    params ShapeBase[] shapes)
```

| Parameter | Type | Description |
| --- | --- | --- |
| left | Double | Distance in points from the origin to the left side of the group shape. |
| top | Double | Distance in points from the origin to the top side of the group shape. |
| width | Double | The width of the group shape in points. A negative value is not allowed. |
| height | Double | The height of the group shape in points. A negative value is not allowed. |
| shapes | ShapeBase[] | The list of shapes to be grouped. |

## Remarks

VML and DML shapes cannot be grouped together.

## Examples

Shows how to insert DML group shape.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Shape shape1 = builder.InsertShape(ShapeType.Rectangle, 200, 250);
shape1.Left = 20;
shape1.Top = 20;
shape1.Stroke.Color = Color.Red;

Shape shape2 = builder.InsertShape(ShapeType.Ellipse, 150, 200);
shape2.Left = 40;
shape2.Top = 50;
shape2.Stroke.Color = Color.Green;

// Dimensions for the new GroupShape node.
double left = 10;
double top = 10;
double width = 200;
double height = 300;
// Insert GroupShape node for the specified size which is inserted into the specified position.
GroupShape groupShape1 = builder.InsertGroupShape(left, top, width, height, new Shape[] { shape1, shape2 });

// Insert GroupShape node which position and dimension will be calculated automatically.
Shape shape3 = (Shape)shape1.Clone(true);
GroupShape groupShape2 = builder.InsertGroupShape(shape3);

doc.Save(ArtifactsDir + "Shape.InsertGroupShape.docx");
```

### See Also

* class [GroupShape](../../../aspose.words.drawing/groupshape/)
* class [ShapeBase](../../../aspose.words.drawing/shapebase/)
* class [DocumentBuilder](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
