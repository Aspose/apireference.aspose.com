---
title: Visa Dölj bokmärkt innehåll
linktitle: Visa Dölj bokmärkt innehåll
second_title: Aspose.Words för .NET API Referens
description: Lär dig hur du visar eller döljer bokmärkesinnehåll med Aspose.Words för .NET.
type: docs
weight: 10
url: /sv/net/programming-with-bookmarks/show-hide-bookmarked-content/
---

den här artikeln kommer vi att utforska ovanstående C#-källkod för att förstå hur man använder funktionen Visa Dölj bokmärkt innehåll i Aspose.Words för .NET-biblioteket. Den här funktionen låter dig visa eller dölja innehållet i ett bokmärke baserat på ett specifikt tillstånd när du slår samman data.

## Förutsättningar

- Grundläggande kunskaper i C#-språket.
- .NET-utvecklingsmiljö med Aspose.Words-biblioteket installerat.

## Steg 1: Skaffa bokmärket

 Vi använder`Bookmarks` egenskapen för dokumentintervallet för att få det specifika bokmärke som vi vill visa eller dölja innehållet på:

```csharp
Bookmark bm = doc.Range.Bookmarks[bookmarkName];
```

## Steg 2: Infoga sammanslagningsfälten

 Vi använder en dokumentbyggare`DocumentBuilder` för att infoga de nödvändiga sammanslagningsfälten. Dessa sammanslagningsfält kommer att ställa in ett villkor för att visa eller dölja bokmärkesinnehållet beroende på värdet på`showHide` variabel:

```csharp
DocumentBuilder builder = new DocumentBuilder(doc);
builder. MoveToDocumentEnd();

Field field = builder. InsertField("IF \"", null);
builder. MoveTo(field. Start. NextSibling);
builder. InsertField("MERGEFIELD " + bookmarkName + "", null);
builder. Write("\" = \"true\" ");
builder. Write("\"");
builder. Write("\"");
builder. Write(" \"\"");
```

## Steg 3: Flytta bokmärkesinnehåll

Vi går igenom innehållet i bokmärket och flyttar det så att det visas

isse före bokmärket. Detta kommer att styra att visa eller dölja innehåll baserat på det angivna villkoret:

```csharp
Node currentNode = field. Start;
bool flag = true;
while (currentNode != null && flag)
{
     if (currentNode.NodeType == NodeType.Run)
         if (currentNode.ToString(SaveFormat.Text).Trim() == "\"")
             flag = false;

     Node nextNode = currentNode.NextSibling;

     bm.BookmarkStart.ParentNode.InsertBefore(currentNode, bm.BookmarkStart);
     currentNode = nextNode;
}
```

## Steg 4: Flytta resten av bokmärkesinnehållet

Vi flyttar resten av bokmärkesinnehållet efter bokmärket och använder bokmärkets slutnod som insättningspunkt:

```csharp
Node endNode = bm.BookmarkEnd;
flag = true;
while (currentNode != null && flag)
{
     if (currentNode.NodeType == NodeType.FieldEnd)
         flag = false;

     Node nextNode = currentNode.NextSibling;

     bm.BookmarkEnd.ParentNode.InsertAfter(currentNode, endNode);
     endNode = currentNode;
     currentNode = nextNode;
}
```

## Steg 5: Utför sammanslagning

 Vi använder`Execute` dokumentets metod`s `MailMerge` object to execute the merge using the bookmark name and the value of the `showHide` variabel:

```csharp
doc. MailMerge. Execute(new[] { bookmarkName }, new object[] { showHide });
```

### Exempel på källkod för Visa Dölj bokmärkt innehåll med Aspose.Words för .NET

Här är det fullständiga exemplet på källkod för att visa eller dölja bokmärkesinnehåll med Aspose.Words för .NET:

```csharp

	Bookmark bm = doc.Range.Bookmarks[bookmarkName];

	DocumentBuilder builder = new DocumentBuilder(doc);
	builder.MoveToDocumentEnd();

	// {IF "{MERGEFIELD bookmark}" = "sant" "" ""}
	Field field = builder.InsertField("IF \"", null);
	builder.MoveTo(field.Start.NextSibling);
	builder.InsertField("MERGEFIELD " + bookmarkName + "", null);
	builder.Write("\" = \"true\" ");
	builder.Write("\"");
	builder.Write("\"");
	builder.Write(" \"\"");

	Node currentNode = field.Start;
	bool flag = true;
	while (currentNode != null && flag)
	{
		if (currentNode.NodeType == NodeType.Run)
			if (currentNode.ToString(SaveFormat.Text).Trim() == "\"")
				flag = false;

		Node nextNode = currentNode.NextSibling;

		bm.BookmarkStart.ParentNode.InsertBefore(currentNode, bm.BookmarkStart);
		currentNode = nextNode;
	}

	Node endNode = bm.BookmarkEnd;
	flag = true;
	while (currentNode != null && flag)
	{
		if (currentNode.NodeType == NodeType.FieldEnd)
			flag = false;

		Node nextNode = currentNode.NextSibling;

		bm.BookmarkEnd.ParentNode.InsertAfter(currentNode, endNode);
		endNode = currentNode;
		currentNode = nextNode;
	}

	doc.MailMerge.Execute(new[] { bookmarkName }, new object[] { showHide });

```

## Slutsats

I den här artikeln utforskade vi C#-källkoden för att förstå hur man använder funktionen Visa göm bokmärkt innehåll i Aspose.Words för .NET. Vi har följt en steg-för-steg-guide för att visa eller dölja innehållet i ett bokmärke baserat på ett specifikt villkor vid sammanslagning av data.