---
title: Lägg till verktygstips till text
linktitle: Lägg till verktygstips till text
second_title: Aspose.PDF för .NET API Referens
description: Lär dig hur du lägger till verktygstips till text i ett PDF-dokument med Aspose.PDF för .NET.
type: docs
weight: 90
url: /sv/net/programming-with-text/add-tooltip-to-text/
---

Denna handledning guidar dig genom processen att lägga till verktygstips till text i ett PDF-dokument med Aspose.PDF för .NET. Den medföljande C#-källkoden visar de nödvändiga stegen.

## Krav
Innan du börjar, se till att du har följande:

- Visual Studio eller någon annan C#-kompilator installerad på din maskin.
- Aspose.PDF för .NET-bibliotek. Du kan ladda ner den från den officiella Aspose-webbplatsen eller använda en pakethanterare som NuGet för att installera den.

## Steg 1: Konfigurera projektet
1. Skapa ett nytt C#-projekt i din föredragna utvecklingsmiljö.
2. Lägg till en referens till Aspose.PDF för .NET-biblioteket.

## Steg 2: Importera nödvändiga namnrymder
kodfilen där du vill lägga till verktygstips till text, lägg till följande med hjälp av direktiv överst i filen:

```csharp
using Aspose.Pdf;
using Aspose.Pdf.Forms;
using Aspose.Pdf.Text;
```

## Steg 3: Ställ in dokumentkatalogen
 I koden, lokalisera raden som säger`string dataDir = "YOUR DOCUMENT DIRECTORY";` och byt ut`"YOUR DOCUMENT DIRECTORY"` med sökvägen till katalogen där dina dokument är lagrade.

## Steg 4: Skapa ett exempeldokument med text
 Skapa en ny`Document` objekt och lägg till sidor med textfragment. I den medföljande koden läggs två textfragment till dokumentet med respektive verktygstipstext.

```csharp
Document doc = new Document();
doc.Pages.Add().Paragraphs.Add(new TextFragment("Move the mouse cursor here to display a tooltip"));
doc.Pages[1].Paragraphs.Add(new TextFragment("Move the mouse cursor here to display a very long tooltip"));
doc.Save(outputFile);
```

## Steg 5: Öppna dokumentet och hitta textfragmenten
 Ladda det skapade dokumentet med hjälp av`Document` konstruktorn och hitta de textfragment som behöver verktygstips med hjälp av`TextFragmentAbsorber`.

```csharp
Document document = new Document(outputFile);
TextFragmentAbsorber absorber = new TextFragmentAbsorber("Move the mouse cursor here to display a tooltip");
document.Pages.Accept(absorb);
TextFragmentCollection textFragments = absorb.TextFragments;
```

## Steg 6: Lägg till verktygstips till textfragmenten
 Gå igenom de extraherade textfragmenten och skapa osynliga knappar vid deras positioner. Tilldela önskad verktygstipstext till`AlternateName` egendom av`ButtonField`. Lägg till knappfälten i dokumentets formulär.

```csharp
foreach(TextFragment fragment in textFragments)
{
     ButtonField field = new ButtonField(fragment.Page, fragment.Rectangle);
     field. AlternateName = "Tooltip for text.";
     document.Form.Add(field);
}
```

## Steg 7: Upprepa för ytterligare textfragment med långa verktygstips
Upprepa steg 5 och 6 för textfragment med långa verktygstips. Ändra sökkriterierna och verktygstipstexten i enlighet med detta.

```csharp
absorb = new TextFragmentAbsorber("Move the mouse cursor here to display a very long tooltip");
document.Pages.Accept(absorb);
textFragments = absorb.TextFragments;

foreach(TextFragment fragment in textFragments)
{
     ButtonField field = new ButtonField(fragment.Page, fragment.Rectangle);
     field. AlternateName = "Long tooltip text goes here...";
     document.Form.Add(field);
}
```

## Steg 8: Spara det ändrade dokumentet
 Spara det ändrade PDF-dokumentet med hjälp av`Save` metod för`Document` objekt.

```csharp
document. Save(outputFile);
```

### Exempel på källkod för Lägg till verktygstips till text med Aspose.PDF för .NET 
```csharp
// Sökvägen till dokumentkatalogen.
string dataDir = "YOUR DOCUMENT DIRECTORY";
string outputFile = dataDir + "Tooltip_out.pdf";
// Skapa exempeldokument med text
Document doc = new Document();
doc.Pages.Add().Paragraphs.Add(new TextFragment("Move the mouse cursor here to display a tooltip"));
doc.Pages[1].Paragraphs.Add(new TextFragment("Move the mouse cursor here to display a very long tooltip"));
doc.Save(outputFile);
// Öppna dokument med text
Document document = new Document(outputFile);
// Skapa TextAbsorber-objekt för att hitta alla fraser som matchar det reguljära uttrycket
TextFragmentAbsorber absorber = new TextFragmentAbsorber("Move the mouse cursor here to display a tooltip");
// Acceptera absorbenten för dokumentsidorna
document.Pages.Accept(absorber);
// Hämta de extraherade textfragmenten
TextFragmentCollection textFragments = absorber.TextFragments;
// Gå igenom fragmenten
foreach (TextFragment fragment in textFragments)
{
	// Skapa osynlig knapp på textfragmentposition
	ButtonField field = new ButtonField(fragment.Page, fragment.Rectangle);
	// AlternateName-värdet kommer att visas som verktygstips av en visningsprogram
	field.AlternateName = "Tooltip for text.";
	// Lägg till knappfält i dokumentet
	document.Form.Add(field);
}
// Nästa kommer att vara en samling av mycket långa verktygstips
absorber = new TextFragmentAbsorber("Move the mouse cursor here to display a very long tooltip");
document.Pages.Accept(absorber);
textFragments = absorber.TextFragments;
foreach (TextFragment fragment in textFragments)
{
	ButtonField field = new ButtonField(fragment.Page, fragment.Rectangle);
	// Ställ in mycket lång text
	field.AlternateName = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
							" sed do eiusmod tempor incididunt ut labore et dolore magna" +
							" aliqua. Ut enim ad minim veniam, quis nostrud exercitation" +
							" ullamco laboris nisi ut aliquip ex ea commodo consequat." +
							" Duis aute irure dolor in reprehenderit in voluptate velit" +
							" esse cillum dolore eu fugiat nulla pariatur. Excepteur sint" +
							" occaecat cupidatat non proident, sunt in culpa qui officia" +
							" deserunt mollit anim id est laborum.";
	document.Form.Add(field);
}
// Spara dokument
document.Save(outputFile);
```

## Slutsats
Du har framgångsrikt lagt till verktygstips till text i ett PDF-dokument med Aspose.PDF för .NET. Den resulterande PDF-filen kan nu hittas på den angivna sökvägen för utdatafilen.