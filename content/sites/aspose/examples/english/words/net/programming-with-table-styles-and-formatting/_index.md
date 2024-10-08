---
title: Programming With Table Styles And Formatting
linktitle: Programming With Table Styles And Formatting
second_title: Aspose.Words for .NET API Reference
description: Examples contain get distance between table surrounding text, apply outline border, build table with borders, modify row formatting, apply row formatting, set c
type: docs
weight: 1580
url: /words/net/programming-with-table-styles-and-formatting/
---
Examples contain get distance between table surrounding text, apply outline border, build table with borders, modify row formatting, apply row formatting, set cell padding, modify cell formatting, format table and cell with different borders, set table title and description, allow cell spacing, build table with style, expand formatting on cells and row from style, create table style, define conditional formatting, set table cell formatting and set table row formatting

## Get Distance Between Table Surrounding Text

```csharp

            
            Document doc = new Document(MyDir + "Tables.docx");

            Console.WriteLine("\nGet distance between table left, right, bottom, top and the surrounding text.");
            Table table = (Table) doc.GetChild(NodeType.Table, 0, true);

            Console.WriteLine(table.DistanceTop);
            Console.WriteLine(table.DistanceBottom);
            Console.WriteLine(table.DistanceRight);
            Console.WriteLine(table.DistanceLeft);
            
        
```

## Apply Outline Border

```csharp

            
            Document doc = new Document(MyDir + "Tables.docx");

            Table table = (Table) doc.GetChild(NodeType.Table, 0, true);
            // Align the table to the center of the page.
            table.Alignment = TableAlignment.Center;
            // Clear any existing borders from the table.
            table.ClearBorders();

            // Set a green border around the table but not inside.
            table.SetBorder(BorderType.Left, LineStyle.Single, 1.5, Color.Green, true);
            table.SetBorder(BorderType.Right, LineStyle.Single, 1.5, Color.Green, true);
            table.SetBorder(BorderType.Top, LineStyle.Single, 1.5, Color.Green, true);
            table.SetBorder(BorderType.Bottom, LineStyle.Single, 1.5, Color.Green, true);

            // Fill the cells with a light green solid color.
            table.SetShading(TextureIndex.TextureSolid, Color.LightGreen, Color.Empty);

            doc.Save(ArtifactsDir + "WorkingWithTableStylesAndFormatting.ApplyOutlineBorder.docx");
            
        
```

## Build Table With Borders

```csharp

            
            Document doc = new Document(MyDir + "Tables.docx");

            Table table = (Table) doc.GetChild(NodeType.Table, 0, true);
            
            // Clear any existing borders from the table.
            table.ClearBorders();
            
            // Set a green border around and inside the table.
            table.SetBorders(LineStyle.Single, 1.5, Color.Green);

            doc.Save(ArtifactsDir + "WorkingWithTableStylesAndFormatting.BuildTableWithBorders.docx");
            
        
```

## Modify Row Formatting

```csharp

            
            Document doc = new Document(MyDir + "Tables.docx");

            Table table = (Table) doc.GetChild(NodeType.Table, 0, true);
            
            // Retrieve the first row in the table.
            Row firstRow = table.FirstRow;
            firstRow.RowFormat.Borders.LineStyle = LineStyle.None;
            firstRow.RowFormat.HeightRule = HeightRule.Auto;
            firstRow.RowFormat.AllowBreakAcrossPages = true;
            
        
```

## Apply Row Formatting

```csharp

            
            Document doc = new Document();
            DocumentBuilder builder = new DocumentBuilder(doc);

            Table table = builder.StartTable();
            builder.InsertCell();

            RowFormat rowFormat = builder.RowFormat;
            rowFormat.Height = 100;
            rowFormat.HeightRule = HeightRule.Exactly;
            
            // These formatting properties are set on the table and are applied to all rows in the table.
            table.LeftPadding = 30;
            table.RightPadding = 30;
            table.TopPadding = 30;
            table.BottomPadding = 30;

            builder.Writeln("I'm a wonderful formatted row.");

            builder.EndRow();
            builder.EndTable();

            doc.Save(ArtifactsDir + "WorkingWithTableStylesAndFormatting.ApplyRowFormatting.docx");
            
        
```

## Set Cell Padding

```csharp

            
            Document doc = new Document();
            DocumentBuilder builder = new DocumentBuilder(doc);

            builder.StartTable();
            builder.InsertCell();

            // Sets the amount of space (in points) to add to the left/top/right/bottom of the cell's contents.
            builder.CellFormat.SetPaddings(30, 50, 30, 50);
            builder.Writeln("I'm a wonderful formatted cell.");

            builder.EndRow();
            builder.EndTable();

            doc.Save(ArtifactsDir + "WorkingWithTableStylesAndFormatting.SetCellPadding.docx");
            
        
```

## Modify Cell Formatting

```csharp

            
            Document doc = new Document(MyDir + "Tables.docx");
            Table table = (Table) doc.GetChild(NodeType.Table, 0, true);

            Cell firstCell = table.FirstRow.FirstCell;
            firstCell.CellFormat.Width = 30;
            firstCell.CellFormat.Orientation = TextOrientation.Downward;
            firstCell.CellFormat.Shading.ForegroundPatternColor = Color.LightGreen;
            
        
```

## Format Table And Cell With Different Borders

```csharp

            
            Document doc = new Document();
            DocumentBuilder builder = new DocumentBuilder(doc);

            Table table = builder.StartTable();
            builder.InsertCell();

            // Set the borders for the entire table.
            table.SetBorders(LineStyle.Single, 2.0, Color.Black);
            
            // Set the cell shading for this cell.
            builder.CellFormat.Shading.BackgroundPatternColor = Color.Red;
            builder.Writeln("Cell #1");

            builder.InsertCell();
            
            // Specify a different cell shading for the second cell.
            builder.CellFormat.Shading.BackgroundPatternColor = Color.Green;
            builder.Writeln("Cell #2");

            builder.EndRow();

            // Clear the cell formatting from previous operations.
            builder.CellFormat.ClearFormatting();

            builder.InsertCell();

            // Create larger borders for the first cell of this row. This will be different
            // compared to the borders set for the table.
            builder.CellFormat.Borders.Left.LineWidth = 4.0;
            builder.CellFormat.Borders.Right.LineWidth = 4.0;
            builder.CellFormat.Borders.Top.LineWidth = 4.0;
            builder.CellFormat.Borders.Bottom.LineWidth = 4.0;
            builder.Writeln("Cell #3");

            builder.InsertCell();
            builder.CellFormat.ClearFormatting();
            builder.Writeln("Cell #4");
            
            doc.Save(ArtifactsDir + "WorkingWithTableStylesAndFormatting.FormatTableAndCellWithDifferentBorders.docx");
            
        
```

## Set Table Title And Description

```csharp

            
            Document doc = new Document(MyDir + "Tables.docx");

            Table table = (Table) doc.GetChild(NodeType.Table, 0, true);
            table.Title = "Test title";
            table.Description = "Test description";

            OoxmlSaveOptions options = new OoxmlSaveOptions { Compliance = OoxmlCompliance.Iso29500_2008_Strict };

            doc.CompatibilityOptions.OptimizeFor(Aspose.Words.Settings.MsWordVersion.Word2016);

            doc.Save(ArtifactsDir + "WorkingWithTableStylesAndFormatting.SetTableTitleAndDescription.docx", options);
            
        
```

## Allow Cell Spacing

```csharp

            
            Document doc = new Document(MyDir + "Tables.docx");

            Table table = (Table) doc.GetChild(NodeType.Table, 0, true);
            table.AllowCellSpacing = true;
            table.CellSpacing = 2;
            
            doc.Save(ArtifactsDir + "WorkingWithTableStylesAndFormatting.AllowCellSpacing.docx");
            
        
```

## Build Table With Style

```csharp

            
            Document doc = new Document();
            DocumentBuilder builder = new DocumentBuilder(doc);

            Table table = builder.StartTable();
            
            // We must insert at least one row first before setting any table formatting.
            builder.InsertCell();

            // Set the table style used based on the unique style identifier.
            table.StyleIdentifier = StyleIdentifier.MediumShading1Accent1;
            
            // Apply which features should be formatted by the style.
            table.StyleOptions =
                TableStyleOptions.FirstColumn | TableStyleOptions.RowBands | TableStyleOptions.FirstRow;
            table.AutoFit(AutoFitBehavior.AutoFitToContents);

            builder.Writeln("Item");
            builder.CellFormat.RightPadding = 40;
            builder.InsertCell();
            builder.Writeln("Quantity (kg)");
            builder.EndRow();

            builder.InsertCell();
            builder.Writeln("Apples");
            builder.InsertCell();
            builder.Writeln("20");
            builder.EndRow();

            builder.InsertCell();
            builder.Writeln("Bananas");
            builder.InsertCell();
            builder.Writeln("40");
            builder.EndRow();

            builder.InsertCell();
            builder.Writeln("Carrots");
            builder.InsertCell();
            builder.Writeln("50");
            builder.EndRow();

            doc.Save(ArtifactsDir + "WorkingWithTableStylesAndFormatting.BuildTableWithStyle.docx");
            
        
```

## Expand Formatting On Cells And Row From Style

```csharp

            
            Document doc = new Document(MyDir + "Tables.docx");

            // Get the first cell of the first table in the document.
            Table table = (Table) doc.GetChild(NodeType.Table, 0, true);
            Cell firstCell = table.FirstRow.FirstCell;

            // First print the color of the cell shading.
            // This should be empty as the current shading is stored in the table style.
            Color cellShadingBefore = firstCell.CellFormat.Shading.BackgroundPatternColor;
            Console.WriteLine("Cell shading before style expansion: " + cellShadingBefore);

            doc.ExpandTableStylesToDirectFormatting();

            // Now print the cell shading after expanding table styles.
            // A blue background pattern color should have been applied from the table style.
            Color cellShadingAfter = firstCell.CellFormat.Shading.BackgroundPatternColor;
            Console.WriteLine("Cell shading after style expansion: " + cellShadingAfter);
            
        
```

## Create Table Style

```csharp

            
            Document doc = new Document();
            DocumentBuilder builder = new DocumentBuilder(doc);

            Table table = builder.StartTable();
            builder.InsertCell();
            builder.Write("Name");
            builder.InsertCell();
            builder.Write("Value");
            builder.EndRow();
            builder.InsertCell();
            builder.InsertCell();
            builder.EndTable();

            TableStyle tableStyle = (TableStyle) doc.Styles.Add(StyleType.Table, "MyTableStyle1");
            tableStyle.Borders.LineStyle = LineStyle.Double;
            tableStyle.Borders.LineWidth = 1;
            tableStyle.LeftPadding = 18;
            tableStyle.RightPadding = 18;
            tableStyle.TopPadding = 12;
            tableStyle.BottomPadding = 12;

            table.Style = tableStyle;

            doc.Save(ArtifactsDir + "WorkingWithTableStylesAndFormatting.CreateTableStyle.docx");
            
        
```

## Define Conditional Formatting

```csharp

            
            Document doc = new Document();
            DocumentBuilder builder = new DocumentBuilder(doc);

            Table table = builder.StartTable();
            builder.InsertCell();
            builder.Write("Name");
            builder.InsertCell();
            builder.Write("Value");
            builder.EndRow();
            builder.InsertCell();
            builder.InsertCell();
            builder.EndTable();

            TableStyle tableStyle = (TableStyle) doc.Styles.Add(StyleType.Table, "MyTableStyle1");
            tableStyle.ConditionalStyles.FirstRow.Shading.BackgroundPatternColor = Color.GreenYellow;
            tableStyle.ConditionalStyles.FirstRow.Shading.Texture = TextureIndex.TextureNone;

            table.Style = tableStyle;

            doc.Save(ArtifactsDir + "WorkingWithTableStylesAndFormatting.DefineConditionalFormatting.docx");
            
        
```

## Set Table Cell Formatting

```csharp

            
            Document doc = new Document();
            DocumentBuilder builder = new DocumentBuilder(doc);

            builder.StartTable();
            builder.InsertCell();

            CellFormat cellFormat = builder.CellFormat;
            cellFormat.Width = 250;
            cellFormat.LeftPadding = 30;
            cellFormat.RightPadding = 30;
            cellFormat.TopPadding = 30;
            cellFormat.BottomPadding = 30;

            builder.Writeln("I'm a wonderful formatted cell.");

            builder.EndRow();
            builder.EndTable();

            doc.Save(ArtifactsDir + "WorkingWithTableStylesAndFormatting.DocumentBuilderSetTableCellFormatting.docx");
            
        
```

## Set Table Row Formatting

```csharp

            
            Document doc = new Document();
            DocumentBuilder builder = new DocumentBuilder(doc);

            Table table = builder.StartTable();
            builder.InsertCell();

            RowFormat rowFormat = builder.RowFormat;
            rowFormat.Height = 100;
            rowFormat.HeightRule = HeightRule.Exactly;
            
            // These formatting properties are set on the table and are applied to all rows in the table.
            table.LeftPadding = 30;
            table.RightPadding = 30;
            table.TopPadding = 30;
            table.BottomPadding = 30;

            builder.Writeln("I'm a wonderful formatted row.");

            builder.EndRow();
            builder.EndTable();

            doc.Save(ArtifactsDir + "WorkingWithTableStylesAndFormatting.DocumentBuilderSetTableRowFormatting.docx");
            
        
```

