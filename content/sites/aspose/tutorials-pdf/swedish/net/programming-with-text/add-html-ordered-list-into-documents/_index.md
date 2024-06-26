---
title: Lägg till ordnad HTML-lista i dokument
linktitle: Lägg till HTMLOrdered List i dokument
second_title: Aspose.PDF för .NET API Referens
description: Lär dig hur du lägger till en HTML-ordnad lista till ett dokument med Aspose.PDF för .NET.
type: docs
weight: 30
url: /sv/net/programming-with-text/add-html-ordered-list-into-documents/
---

I den här handledningen kommer du att lära dig hur du använder Aspose.PDF för .NET-biblioteket för att lägga till en HTML-ordnad lista i ett dokument. Koden som tillhandahålls visar de nödvändiga stegen för att utföra denna uppgift.

## Krav
Innan du börjar, se till att du har följande:

- Visual Studio eller någon annan C#-kompilator installerad på din maskin.
- Aspose.PDF för .NET-bibliotek. Du kan ladda ner den från den officiella Aspose-webbplatsen eller använda en pakethanterare som NuGet för att installera den.

## Steg 1: Konfigurera projektet
1. Skapa ett nytt C#-projekt i din föredragna utvecklingsmiljö.
2. Lägg till en referens till Aspose.PDF för .NET-biblioteket.

## Steg 2: Importera nödvändiga namnrymder
I kodfilen där du vill lägga till HTML-listan, lägg till följande med hjälp av direktiven högst upp i filen:

```csharp
using Aspose.Pdf;
using Aspose.Pdf.Text;
```

## Steg 3: Ställ in dokumentkatalogen och utdatafilens sökväg
 I koden, lokalisera raden som säger`string dataDir = "YOUR DOCUMENT DIRECTORY";` och byt ut`"YOUR DOCUMENT DIRECTORY"` med sökvägen till katalogen där dina dokument är lagrade.

 Leta sedan upp raden som säger`string outFile = dataDir + "AddHTMLOrderedListIntoDocuments_out.pdf";` och byt ut`"AddHTMLOrderedListIntoDocuments_out.pdf"` med önskat namn för din utdata-PDF-fil.

## Steg 4: Skapa ett nytt dokumentobjekt
 Instantiera en ny`Document` objekt genom att lägga till följande kodrad:

```csharp
Document doc = new Document();
```

## Steg 5: Skapa ett HtmlFragment-objekt med HTML-innehållet
Instantiera en`HtmlFragment` objekt med HTML-innehållet du vill lägga till i dokumentet. I den medföljande koden är HTML-innehållet tilldelat variabeln`t`. Du kan ändra HTML-innehållet efter behov.

```csharp
HtmlFragment t = new HtmlFragment("`<body style='line-height: 100px;'><ul><li>First</li><li>Second</li><li>Third</li><li >Fourth</li><li>Fifth</li></ul>Text after the list.<br/>Next line<br/>Last line</body>`");
```

## Steg 6: Lägg till en sida i dokumentet
 Lägg till en ny sida i dokumentet med hjälp av`Add` metod för`Pages` samling. I den angivna koden är den nya sidan tilldelad variabeln`page`.

```csharp
Page page = doc.Pages.Add();
```

## Steg 7: Lägg till HtmlFragmentet på sidan
 Lägg till`HtmlFragment` invända mot sidan genom att använda`Add` metod för`Paragraphs` samling.

```csharp
page.Paragraphs.Add(t);
```

## Steg 8: Spara PDF-dokumentet
 Spara den resulterande PDF-filen med hjälp av`Save` metod för`Document` objekt. Ange sökvägen till utdatafilen som du ställde in i steg 3.

```csharp
doc.Save(outFile);
```

### Exempel på källkod för Lägg till HTMLOrdered List i dokument med Aspose.PDF för .NET 
```csharp
// Sökvägen till dokumentkatalogen.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// Sökvägen till utdatadokumentet.
string outFile = dataDir + "AddHTMLOrderedListIntoDocuments_out.pdf";
// Instantiera dokumentobjekt
Document doc = new Document();
// Instantiera HtmlFragment-objekt med motsvarande HTML-fragment
HtmlFragment t = new HtmlFragment("`<body style='line-height: 100px;'><ul><li>First</li><li>Second</li><li>Third</li><li>Fourth</li><li>Fifth</li></ul>Text after the list.<br/>Next line<br/>Last line</body>`");
// Lägg till sida i Pages Collection
Page page = doc.Pages.Add();
// Lägg till HtmlFragment på sidan
page.Paragraphs.Add(t);
// Spara den resulterande PDF-filen
doc.Save(outFile);
```

## Slutsats
Du har framgångsrikt lagt till en HTML-ordnad lista i ett dokument med Aspose.PDF för .NET. Den resulterande PDF-filen kan nu hittas på den angivna sökvägen för utdatafilen.

Kom ihåg att anpassa HTML-innehållet och justera koden efter dina specifika krav.