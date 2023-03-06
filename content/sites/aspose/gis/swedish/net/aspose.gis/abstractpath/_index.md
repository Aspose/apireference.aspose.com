---
title: Class AbstractPath
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.AbstractPath klass. AnAbstractPath är en basklass för klasser som anger en unik plats i en miljö som liknar ett filsystem som ett lokalt filsystem en fjärrfillagring eller ett ZIParkiv bland annat.
type: docs
weight: 10
url: /sv/net/aspose.gis/abstractpath/
---
## AbstractPath class

An`AbstractPath` är en basklass för klasser som anger en unik plats i en miljö som liknar ett filsystem, som ett lokalt filsystem, en fjärrfillagring eller ett ZIP-arkiv, bland annat.

```csharp
public abstract class AbstractPath
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| abstract [Location](../../aspose.gis/abstractpath/location/) { get; } | Får en strängrepresentation av platsen för denna`AbstractPath` . |
| abstract [Separator](../../aspose.gis/abstractpath/separator/) { get; } | Får ett avgränsningstecken som används för att separera katalognivåer i[`Location`](./location/) sträng. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| static [FromLocalPath](../../aspose.gis/abstractpath/fromlocalpath/)(string) | Skapar en`AbstractPath` som representerar en plats på det lokala filsystemet. |
| static [FromStream](../../aspose.gis/abstractpath/fromstream/)(Stream) | Skapar en`AbstractPath` från enStream . |
| virtual [Combine](../../aspose.gis/abstractpath/combine/)(string) | Kombinerar detta`AbstractPath` med specificerade sökvägskomponenter. |
| abstract [Delete](../../aspose.gis/abstractpath/delete/)() | Tar bort en fil som den här sökvägen pekar på. |
| [GetExtension](../../aspose.gis/abstractpath/getextension/)() | Returnerar förlängningen av detta`AbstractPath` . |
| [GetFileName](../../aspose.gis/abstractpath/getfilename/)() | Returnerar filnamnet och filtillägget för detta`AbstractPath` . |
| [GetFileNameWithoutExtension](../../aspose.gis/abstractpath/getfilenamewithoutextension/)() | Returnerar filnamnet för denna`AbstractPath` utan tillägget. |
| abstract [IsFile](../../aspose.gis/abstractpath/isfile/)() | Får ett värde som indikerar om denna sökväg pekar på en befintlig fil som kan öppnas för läsning. |
| abstract [ListDirectory](../../aspose.gis/abstractpath/listdirectory/)() | Returnerar sökvägar som finns inuti denna`AbstractPath` , om det är en katalog. |
| abstract [Open](../../aspose.gis/abstractpath/open/)(FileAccess) | Öppnar detta`AbstractPath`som en fil. |
| virtual [WithExtension](../../aspose.gis/abstractpath/withextension/)(string) | Returnerar en ny`AbstractPath` med filtillägget ändrat till det angivna värdet. |

### Anmärkningar

An`AbstractPath` kan ange en plats på ett lokalt filsystem, en plats på ett fjärrfilsystem eller en extern lagring som Azure Blob-lagring och så vidare. Platsen kan peka på befintliga eller inte existerande filliknande objekt, katalogliknande objekt eller ha någon annan betydelse som är rimlig för miljön den tillhör. Som ett exempel, en`AbstractPath` arvtagare som representerar en plats i det lokala filsystemet kan peka på en existerande fil, katalog eller till en plats i filsystemet som inte har skapats ännu. För att göra en ny filsystemliknande lagring tillgänglig för`Aspose.GIS` bör man ärva denna class och implementera dess abstrakta metoder.

### Se även

* namnutrymme [Aspose.Gis](../../aspose.gis/)
* hopsättning [Aspose.GIS](../../)


