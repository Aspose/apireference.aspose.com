---
title: ShapeGuideCollection.Item
second_title: Aspose.Cells for .NET API Reference
description: ShapeGuideCollection property. Gets a shape guide by index
type: docs
url: /net/aspose.cells.drawing/shapeguidecollection/item/
---
## ShapeGuideCollection indexer

Gets a shape guide by index

```csharp
public ShapeGuide this[int index] { get; }
```

| Parameter | Description |
| --- | --- |
| index |  |

### Examples

```csharp
namespace AsposeCellsExamples
{
    using Aspose.Cells;
    using Aspose.Cells.Drawing;
    using System;

    public class ShapeGuideCollectionPropertyItemDemo
    {
        public static void Run()
        {
            // Create a new workbook
            Workbook workbook = new Workbook();
            Worksheet worksheet = workbook.Worksheets[0];

            // Add a shape that uses adjustment guides
            Shape shape = worksheet.Shapes.AddAutoShape(AutoShapeType.RightArrowCallout, 2, 0, 2, 0, 200, 150);

            // Access the shape's adjustment guides collection via Geometry
            ShapeGuideCollection shapeGuides = shape.Geometry.ShapeAdjustValues;

            // Add new guides to the collection
            shapeGuides.Add("adj1", 25.5);
            shapeGuides.Add("adj2", 30);
            shapeGuides.Add("adj3", 25.5);
            shapeGuides.Add("adj4", 35);

            // Demonstrate reading guide values (Name property not available in provided definition)
            Console.WriteLine("First guide value: " + shapeGuides[0].Value);
            Console.WriteLine("Second guide value: " + shapeGuides[1].Value);
            Console.WriteLine("third guide value: " + shapeGuides[2].Value);
            Console.WriteLine("fourth guide value: " + shapeGuides[3].Value);

            // Save the modified workbook
            workbook.Save("ShapeGuideCollectionPropertyItemDemo.xlsx");
        }
    }
}
```

### See Also

* class [ShapeGuide](../../shapeguide/)
* class [ShapeGuideCollection](../)
* namespace [Aspose.Cells.Drawing](../../../aspose.cells.drawing/)
* assembly [Aspose.Cells](../../../)


