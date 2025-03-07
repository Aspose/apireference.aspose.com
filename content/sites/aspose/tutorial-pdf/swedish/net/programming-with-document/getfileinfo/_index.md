---
title: Få filinformation
linktitle: Få filinformation
second_title: Aspose.PDF för .NET API-referens
description: Lär dig hur du använder GetFileInfo-funktionen i Aspose.PDF för .NET för att hämta metadatainformation om ett PDF-dokument.
type: docs
weight: 180
url: /sv/net/programming-with-document/getfileinfo/
---

 Aspose.PDF för .NET är ett populärt PDF-manipuleringsbibliotek som gör det möjligt för utvecklare att skapa, redigera och konvertera PDF-filer i sina .NET-applikationer. En av funktionerna som erbjuds av detta bibliotek är möjligheten att hämta information om ett PDF-dokuments metadata. Denna handledning guidar dig genom stegen för att använda`GetFileInfo`funktion i Aspose.PDF för .NET för att hämta information om ett PDF-dokuments metadata.

## Steg 1: Installera Aspose.PDF för .NET

 För att använda Aspose.PDF för .NET i dina .NET-applikationer måste du först installera biblioteket. Du kan ladda ner den senaste versionen av biblioteket från[Aspose.PDF för .NET nedladdningssida](https://releases.aspose.com/pdf/net).

När du har laddat ner biblioteket, extrahera innehållet i ZIP-filen till en mapp på din dator. Du måste sedan lägga till en referens till Aspose.PDF för .NET DLL i ditt .NET-projekt.

## Steg 2: Ladda PDF-dokumentet

 När du har installerat Aspose.PDF för .NET och lagt till en referens till DLL-filen i ditt .NET-projekt kan du börja använda`GetFileInfo` funktion för att hämta information om ett PDF-dokuments metadata.

Det första steget i att använda den här funktionen är att ladda PDF-dokumentet som du vill hämta information om. För att göra detta kan du använda följande kod:

```csharp
// Sökvägen till PDF-dokumentet
string dataDir = "YOUR DOCUMENT DIRECTORY";

//Öppna PDF-dokumentet
Document pdfDocument = new Document(dataDir + "GetFileInfo.pdf");
```

 I koden ovan, ersätt`"YOUR DOCUMENT DIRECTORY"` med sökvägen till katalogen där ditt PDF-dokument finns. Denna kod kommer att ladda PDF-dokumentet i en`Document` objekt, som du sedan kan använda för att hämta information om dokumentets metadata.

## Steg 3: Hämta dokumentets metadata

För att hämta information om ett PDF-dokuments metadata kan du använda följande kod:

```csharp
// Få dokumentinformation
DocumentInfo docInfo = pdfDocument.Info;

// Visa dokumentinformation
Console.WriteLine("Author: {0}", docInfo.Author);
Console.WriteLine("Creation Date: {0}", docInfo.CreationDate);
Console.WriteLine("Keywords: {0}", docInfo.Keywords);
Console.WriteLine("Modify Date: {0}", docInfo.ModDate);
Console.WriteLine("Subject: {0}", docInfo.Subject);
Console.WriteLine("Title: {0}", docInfo.Title);
```

I koden ovan hämtar varje rad en annan metadataegenskap för PDF-dokumentet och matar ut den till konsolen. Du kan anpassa den här koden för att bara hämta de egenskaper som du är intresserad av.

### Exempel på källkod få PDF-filinformation med Aspose.PDF för .NET

 Här är den fullständiga källkoden för att hämta ett PDF-dokuments metadata med hjälp av`GetFileInfo` funktion i Aspose.PDF för .NET:

```csharp
// Sökvägen till PDF-dokumentet
string dataDir = "YOUR DOCUMENT DIRECTORY";

//Öppna PDF-dokumentet
Document pdfDocument = new Document(dataDir + "GetFileInfo.pdf");

// Få dokumentinformation
DocumentInfo docInfo = pdfDocument.Info;

// Visa dokumentinformation
Console.WriteLine("Author: {0}", docInfo.Author);
Console.WriteLine("Creation Date: {0}", docInfo.CreationDate);
Console.WriteLine("Keywords: {0}", docInfo.Keywords);
Console.WriteLine("Modify Date: {0}", docInfo.ModDate);
Console.WriteLine("Subject: {0}", docInfo.Subject);
Console.WriteLine("Title: {0}", docInfo.Title);
```