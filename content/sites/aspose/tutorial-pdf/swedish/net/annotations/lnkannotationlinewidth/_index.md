---
title: lnk Anteckningslinjebredd
linktitle: lnk Anteckningslinjebredd
second_title: Aspose.PDF för .NET API-referens
description: Den här artikeln ger en steg-för-steg-guide för att ställa in linjebredden för lnk-anteckningen med Aspose.PDF för .NET.
type: docs
weight: 110
url: /sv/net/annotations/lnkannotationlinewidth/
---
Aspose.PDF är ett kraftfullt och allmänt använt verktyg för att arbeta med PDF-filer i .NET-applikationer. Den tillhandahåller en mängd olika funktioner för att skapa, redigera och manipulera PDF-filer, inklusive möjligheten att lägga till kommentarer till sidor. I den här handledningen kommer vi att förklara hur man ställer in linjebredden för en länkkommentar med Aspose.PDF för .NET.

När du har dessa förutsättningar skapar du ett nytt konsolapplikationsprojekt i Visual Studio. Lägg sedan till en referens till Aspose.PDF för .NET-biblioteket genom att högerklicka på projektet i Solution Explorer, välja "Manage NuGet Packages" och söka efter "Aspose.PDF" i NuGet Package Manager.

För att lägga till en lnk-kommentar till ett PDF-dokument, följ dessa steg:

##  Skapa en ny`Document` object.
```csharp
Document doc = new Document();
```
## Lägg till en ny sida i dokumentet.
```csharp
doc.Pages.Add();
```
##  Skapa en lista över`Point` arrays that represent the ink gesture for the annotation.
```csharp
IList<Point[]> inkList = new List<Point[]>();
```
##  Skapa en ny`LineInfo` object that defines the properties of the ink gesture.
```csharp
LineInfo lineInfo = new LineInfo();
lineInfo.VerticeCoordinate = new float[] { 55, 55, 70, 70, 70, 90, 150, 60 };
lineInfo.Visibility = true;
lineInfo.LineColor = System.Drawing.Color.Red;
lineInfo.LineWidth = 2;
```
##  Skapa en ny`Aspose.Pdf.Point` array that represents the gesture from the `LineInfo` object.
```csharp
int length = lineInfo.VerticeCoordinate.Length / 2;
Aspose.Pdf.Point[] gesture = new Aspose.Pdf.Point[length];
for (int i = 0; i < length; i++)
{
    gesture[i] = new Aspose.Pdf.Point(lineInfo.VerticeCoordinate[2 * i], lineInfo.VerticeCoordinate[2 * i + 1]);
}
```
## Lägg till gesten i listan över bläckgester.
```csharp
inkList.Add(gesture);
```
##  Skapa en ny`InkAnnotation` object that represents the link annotation.
```csharp
InkAnnotation a1 = new InkAnnotation(doc.Pages[1], new Aspose.Pdf.Rectangle(100, 100, 300, 300), inkList);
```
## Ställ in anteckningens ämne och titel.
```csharp
a1.Subject = "Test";
a1.Title = "Title";
```
## Ställ in färgen på anteckningen.
```csharp
a1.Color = Aspose.Pdf.Color.FromRgb(System.Drawing.Color.Green);
```
##  Skapa en ny`Border` object that defines the properties of the annotation's border.
```csharp
Border border = new Border(a1);
border.Width = 3;
border.Effect = BorderEffect.Cloudy;
border.Dash = new Dash(1, 1);
border.Style = BorderStyle.Solid;
```
## Lägg till anteckningen på sidan.
```csharp
doc.Pages[1].Annotations.Add(a1);
```
## Spara dokumentet i en fil.
```c// Save output file
doc.Save(dataDir);


```
### Exemplet visar lnk Annotation Line Width med Aspose.PDF för .NET

```csharp


// Sökvägen till dokumentkatalogen.
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document();
doc.Pages.Add();
IList<Point[]> inkList = new List<Point[]>();
LineInfo lineInfo = new LineInfo();
lineInfo.VerticeCoordinate = new float[] { 55, 55, 70, 70, 70, 90, 150, 60 };
lineInfo.Visibility = true;
lineInfo.LineColor = System.Drawing.Color.Red;
lineInfo.LineWidth = 2;
int length = lineInfo.VerticeCoordinate.Length / 2;
Aspose.Pdf.Point[] gesture = new Aspose.Pdf.Point[length];
for (int i = 0; i < length; i++)
{
gesture[i] = new Aspose.Pdf.Point(lineInfo.VerticeCoordinate[2 * i], lineInfo.VerticeCoordinate[2 * i + 1]);
}

inkList.Add(gesture);
InkAnnotation a1 = new InkAnnotation(doc.Pages[1], new Aspose.Pdf.Rectangle(100, 100, 300, 300), inkList);
a1.Subject = "Test";
a1.Title = "Title";
a1.Color = Aspose.Pdf.Color.FromRgb(System.Drawing.Color.Green);
Border border = new Border(a1);
border.Width = 3;
border.Effect = BorderEffect.Cloudy;
border.Dash = new Dash(1, 1);
border.Style = BorderStyle.Solid;
doc.Pages[1].Annotations.Add(a1);

dataDir = dataDir + "lnkAnnotationLineWidth_out.pdf";
// Spara utdatafil
doc.Save(dataDir);


```
