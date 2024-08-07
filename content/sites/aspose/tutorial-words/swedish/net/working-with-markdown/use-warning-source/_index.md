---
title: Använd varningskälla
linktitle: Använd varningskälla
second_title: Aspose.Words för .NET API Referens
description: Lär dig hur du använder varningskälla med Aspose.Words för .NET Steg-för-steg-guide.
type: docs
weight: 10
url: /sv/net/working-with-markdown/use-warning-source/
---

I det här exemplet kommer vi att visa dig hur du använder varningskälla med Aspose.Words för .NET. Varningskällan anger varningens ursprung när du använder återuppringningsfunktionen.

## Steg 1: Ladda dokumentet

 Vi kommer att ladda ett befintligt dokument som innehåller varningar med hjälp av`Load` metod för`Document` klass.

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document(MyDir + "Emphases markdown warning.docx");
```

## Steg 3: Använda varningskällan

 Vi använder varningskällan genom att ställa in dokumentets`WarningCallback` egendom till en samling av`WarningInfo` föremål.

```csharp
WarningInfoCollection warnings = new WarningInfoCollection();
doc.WarningCallback = warnings;
```

## Steg 4: Spara dokumentet

Slutligen kan vi spara dokumentet i önskat format.

```csharp
doc.Save(dataDir + "WorkingWithMarkdown.UseWarningSource.md");
foreach (WarningInfo warningInfo in warnings)
{
if (warningInfo.Source == WarningSource.Markdown)
	Console.WriteLine(warningInfo.Description);
}
```

### Exempel på källkod för användning av varningskälla med Aspose.Words för .NET

```csharp
	// Sökvägen till dokumentkatalogen.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document(MyDir + "Emphases markdown warning.docx");

	WarningInfoCollection warnings = new WarningInfoCollection();
	doc.WarningCallback = warnings;

	doc.Save(dataDir + "WorkingWithMarkdown.UseWarningSource.md");

	foreach (WarningInfo warningInfo in warnings)
	{
		if (warningInfo.Source == WarningSource.Markdown)
			Console.WriteLine(warningInfo.Description);
	}
            
```

Grattis! Du har nu lärt dig hur du använder varningskällan med Aspose.Words för .NET.