---
title: Räkna upp barnnoder
linktitle: Räkna upp barnnoder
second_title: Aspose.Words för .NET API Referens
description: Lär dig hur du räknar upp underordnade noder i ett stycke med Aspose.Words för .NET.
type: docs
weight: 10
url: /sv/net/working-with-node/enumerate-child-nodes/
---

Här är en steg-för-steg-guide för att förklara C#-källkoden nedan som illustrerar hur man räknar upp barnnoder med Aspose.Words för .NET.

## Steg 1: Importera nödvändiga referenser
Innan du börjar, se till att du har importerat de nödvändiga referenserna för att använda Aspose.Words för .NET i ditt projekt. Detta inkluderar att importera Aspose.Words-biblioteket och lägga till de nödvändiga namnområdena till din källfil.

```csharp
using Aspose.Words;
using Aspose.Words.Nodes;
using Aspose.Words.NodeTypes;
```

## Steg 2: Skapa ett nytt dokument
 I det här steget kommer vi att skapa ett nytt dokument med hjälp av`Document` klass.

```csharp
Document doc = new Document();
```

## Steg 3: Öppna stycket och dess underordnade noder
 För att räkna upp barnnoderna i ett stycke måste vi först komma åt själva stycket. Använd`GetChild` metod med`Paragraph` nodtyp för att få det första stycket i dokumentet.

```csharp
Paragraph paragraph = (Paragraph)doc.GetChild(NodeType.Paragraph, 0, true);
```

Därefter hämtar vi samlingen av styckets underordnade noder med hjälp av`ChildNodes` fast egendom.

```csharp
NodeCollection children = paragraph. ChildNodes;
```

## Steg 4: Bläddra under barnnoder
 Nu när vi har samlingen av underordnade noder kan vi gå igenom dem med hjälp av en`foreach` slinga. Vi kontrollerar typen av varje barnnod och utför specifika operationer baserat på typen.

```csharp
foreach (Node child in children)
{
     // Ett stycke kan innehålla underordnade typer av olika typer, till exempel löpningar, former och andra.
     if (child. NodeType == NodeType.Run)
     {
         Run run = (Run)child;
         Console.WriteLine(run.Text);
     }
}
```

 I det här exemplet kontrollerar vi om den underordnade noden är av typen`Run` (t.ex. ett textfragment). Om så är fallet konverterar vi noden till`Run` och visa texten med`run.Text`.

## Exempel på källkod för att räkna upp underordnade noder med Aspose.Words för .NET


```csharp
	Document doc = new Document();
	Paragraph paragraph = (Paragraph) doc.GetChild(NodeType.Paragraph, 0, true);

	NodeCollection children = paragraph.ChildNodes;
	foreach (Node child in children)
	{
		// Ett stycke kan innehålla underordnade typer av olika typer, till exempel löpningar, former och andra.
		if (child.NodeType == NodeType.Run)
		{
			Run run = (Run) child;
			Console.WriteLine(run.Text);
		}
	}
            
```

Detta är ett komplett kodexempel för att räkna upp barnnoderna i ett stycke med Aspose.Words för .NET. Se till att importera referenserna

