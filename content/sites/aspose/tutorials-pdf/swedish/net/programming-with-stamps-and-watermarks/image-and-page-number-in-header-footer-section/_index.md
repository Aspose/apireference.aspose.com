---
title: Bild och sidnummer i sidhuvudsavsnittet
linktitle: Bild och sidnummer i sidhuvudsavsnittet
second_title: Aspose.PDF för .NET API Referens
description: Ta reda på hur du lägger till en bild och ett sidnummer i sidhuvudet och sidfoten i ett PDF-dokument med Aspose.
type: docs
weight: 110
url: /sv/net/programming-with-stamps-and-watermarks/image-and-page-number-in-header-footer-section/
---
den här handledningen guidar vi dig steg för steg om hur du lägger till en bild och sidnummer i sidhuvudet och sidfoten i ett PDF-dokument med Aspose.PDF för .NET. Vi kommer att visa dig hur du använder den medföljande C#-källkoden för att skapa en sida, ställa in sidhuvud och sidfot, lägga till bild i sidhuvud och text med sidnummer för att dokumentera sidfot PDF.

## Steg 1: Sätta upp miljön

Innan du börjar, se till att du har följande:

- En installerad .NET-utvecklingsmiljö.
- Aspose.PDF-biblioteket för .NET laddas ner och refereras till i ditt projekt.

## Steg 2: Skapa PDF-dokumentet och -sidan

Det första steget är att skapa ett nytt dokumentobjekt och en sida i PDF-dokumentet. Här är hur:

```csharp
// Sökvägen till dokumentkatalogen.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// Skapa ett nytt dokumentobjekt
Aspose.Pdf.Document doc = new Aspose.Pdf.Document();

// Skapa en sida i dokumentet
Aspose.Pdf.Page page = doc.Pages.Add();
```

Koden ovan skapar ett nytt dokumentobjekt och en tom sida i PDF-dokumentet.

## Steg 3: Lägga till rubriken med en bild

Nu när sidan är skapad kan vi lägga till en rubriksektion med en bild. Här är hur:

```csharp
// Skapa en rubriksektion
Aspose.Pdf.HeaderFooter header = new Aspose.Pdf.HeaderFooter();

// Ställ in sidhuvudet
page. Header = header;

// Skapa ett bildobjekt
Aspose.Pdf.Image image1 = new Aspose.Pdf.Image();

// Ställ in bildsökväg
image1.File = dataDir + "aspose-logo.jpg";

// Lägg till bilden i sidhuvudet i PDF-dokumentet
header.Paragraphs.Add(image1);
```

Koden ovan skapar ett rubrikavsnitt, ställer in sidhuvudet med det här avsnittet och lägger till en bild i sidhuvudet.

## Steg 4: Lägga till sidfoten med sidnumret

Nu när sidhuvudet har lagts till kan vi lägga till en sidfotssektion med ett sidnummer. Här är hur:

```csharp
// Skapa en sidfotssektion
Aspose.Pdf.HeaderFooter footer = new Aspose.Pdf.HeaderFooter();

// Definiera sidfoten för PDF-dokumentet
page. Footer = footer;

// Skapa ett TextFragment-objekt
Aspose.Pdf.Text.TextFragment txt = new Aspose.Pdf.Text.TextFragment("Page: ($p of $P)");

// Lägg till texten med sidnumret i sidfoten i PDF-dokumentet
footer.Paragraphs.Add(txt);
```

Ovanstående kod skapar en sidfotssektion, ställer in sidfoten på sidan med detta avsnitt och lägger till ett TextFragment som innehåller texten "Page: ($p of $P )"

  som visar sidnumret.

## Steg 5: Spara det ändrade PDF-dokumentet

När sidhuvudet och sidfoten har lagts till kan vi spara det ändrade PDF-dokumentet. Här är hur:

```csharp
// Spara det ändrade PDF-dokumentet
doc.Save(dataDir + "ImageAndPageNumberInHeaderFooter_out.pdf");
```

Ovanstående kod sparar det redigerade PDF-dokumentet i den angivna katalogen.

### Exempel på källkod för bild och sidnummer i sidhuvudsfotsektionen med Aspose.PDF för .NET 
```csharp

// Sökvägen till dokumentkatalogen.
string dataDir = "YOUR DOCUMENT DIRECTORY";
Aspose.Pdf.Document doc = new Aspose.Pdf.Document();

// Skapa en sida i dokumentobjektet
Aspose.Pdf.Page page = doc.Pages.Add();

// Skapa rubriksektion för dokumentet
Aspose.Pdf.HeaderFooter header = new Aspose.Pdf.HeaderFooter();

// Ställ in rubriken för PDF-filen
page.Header = header;

// Skapa ett bildobjekt på sidan
Aspose.Pdf.Image image1 = new Aspose.Pdf.Image();

//Ställ in sökvägen till bildfilen
image1.File = dataDir + "aspose-logo.jpg";

// Lägg till bild på sidhuvudet i pdf-filen
header.Paragraphs.Add(image1);

// Skapa en sidfotssektion av dokumentet
Aspose.Pdf.HeaderFooter footer = new Aspose.Pdf.HeaderFooter();

// Ställ in sidfoten för PDF-filen
page.Footer = footer;

// Skapa ett textobjekt
Aspose.Pdf.Text.TextFragment txt = new Aspose.Pdf.Text.TextFragment("Page: ($p of $P ) ");

// Lägg till text i rubriksektionen i pdf-filen
footer.Paragraphs.Add(txt);

// Spara pdf-filen
doc.Save(dataDir + "ImageAndPageNumberInHeaderFooter_out.pdf");

```

## Slutsats

Grattis! Du har lärt dig hur du lägger till en bild och sidnummer i sidhuvudet och sidfoten i ett PDF-dokument med Aspose.PDF för .NET. Nu kan du använda den här metoden för att anpassa sidhuvud och sidfot i dina PDF-dokument.

### FAQ's

#### F: Vad är syftet med att lägga till en bild och sidnummer i sidhuvudet och sidfoten i ett PDF-dokument?

S: Att lägga till en bild och sidnummer i sidhuvuds- och sidfotsavsnittet i ett PDF-dokument kan förbättra dess visuella dragningskraft, varumärke och navigeringselement. En bild kan representera en logotyp, vattenstämpel eller vilket grafiskt element som helst, medan ett sidnummer hjälper användare att spåra deras framsteg och hitta specifika sidor.

#### F: Hur hjälper den medföljande C#-källkoden till att lägga till en bild och sidnummer i sidhuvudet och sidfoten i ett PDF-dokument?

S: Den medföljande koden visar hur man skapar ett PDF-dokument, lägger till en sida och sedan anpassar sidhuvuds- och sidfotsavsnitten. Den visar hur man lägger till en bild i sidhuvudet och ett textfragment med sidnumrering i sidfoten.

#### F: Kan jag använda vilket bildformat som helst för rubriken, och hur anger jag dess sökväg?

 S: Ja, du kan använda olika bildformat (som JPEG, PNG, GIF, etc.) för huvudbilden. Bildens sökväg anges med hjälp av`File` egendom av`Aspose.Pdf.Image` objekt.

#### F: Hur anpassar jag utseendet och placeringen av bilden i rubriken?

 S: Du kan anpassa bildens utseende och placering genom att justera egenskaperna för bilden`Aspose.Pdf.Image` objekt innan du lägger till det i rubriken. Du kan till exempel ställa in bildens mått, justering, rotation, opacitet osv.

####  F: Vad är syftet med`TextFragment` object used for the footer?

 A: Den`TextFragment`objekt används för att skapa och formatera text som kommer att visas i sidfotssektionen. I den medföljande koden används den för att visa sidnummer och totalt antal sidor.

#### F: Kan jag ändra sidfoten så att den innehåller ytterligare information eller formatering?

 S: Ja, du kan ändra sidfoten genom att ändra innehållet i`TextFragment` objekt. Du kan lägga till ytterligare text, ändra teckensnitt, färger och formatering enligt dina krav.

#### F: Kan jag använda olika sidhuvud och sidfotsinnehåll på olika sidor i PDF-dokumentet?

 S: Ja, du kan använda olika sidhuvud och sidfotsinnehåll på olika sidor genom att skapa separata`HeaderFooter` objekt och tilldela dem till specifika sidor med hjälp av`Header` och`Footer` egenskaper hos`Aspose.Pdf.Page` objekt.

#### F: Hur kan jag anpassa sidhuvudet och sidfoten ytterligare, som att ändra teckensnittsstil eller lägga till ytterligare element?

S: Du kan anpassa sidhuvudet och sidfoten genom att använda olika klasser och egenskaper som tillhandahålls av Aspose.PDF för .NET. Du kan till exempel använda olika textformateringsalternativ, lägga till fler stycken, bilder eller till och med tabeller i sidhuvuds- och sidfotsavsnitten.

#### F: Kan jag ta bort eller rensa sidhuvuds- och sidfotsavsnitten om det behövs?

 S: Ja, du kan ta bort eller rensa sidhuvuds- och sidfotssektionerna genom att ställa in`Header` och`Footer` egenskaper hos`Aspose.Pdf.Page` invända mot`null`.

#### F: Hur kan jag säkerställa att den tillagda bilden och sidnumret förblir konsekventa på olika enheter och tittare?

S: Aspose.PDF för .NET tillhandahåller funktionalitet för att skapa standardiserade och konsekventa PDF-dokument, vilket säkerställer att den tillagda bilden och sidnumret visas konsekvent på olika enheter och PDF-visare.