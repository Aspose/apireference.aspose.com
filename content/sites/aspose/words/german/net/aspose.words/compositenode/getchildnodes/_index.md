---
title: CompositeNode.GetChildNodes
linktitle: GetChildNodes
articleTitle: GetChildNodes
second_title: Aspose.Words für .NET
description: CompositeNode GetChildNodes methode. Gibt eine LiveSammlung untergeordneter Knoten zurück die dem angegebenen Typ entsprechen in C#.
type: docs
weight: 90
url: /de/net/aspose.words/compositenode/getchildnodes/
---
## CompositeNode.GetChildNodes method

Gibt eine Live-Sammlung untergeordneter Knoten zurück, die dem angegebenen Typ entsprechen.

```csharp
public NodeCollection GetChildNodes(NodeType nodeType, bool isDeep)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nodeType | NodeType | Gibt den Typ der auszuwählenden Knoten an. |
| isDeep | Boolean | `WAHR` um rekursiv aus allen untergeordneten Knoten auszuwählen; `FALSCH`nur unter unmittelbaren Kindern auszuwählen. |

### Rückgabewert

Eine Live-Sammlung untergeordneter Knoten des angegebenen Typs.

## Bemerkungen

Die von dieser Methode zurückgegebene Sammlung von Knoten ist immer aktiv.

Eine Live-Sammlung ist immer mit dem Dokument synchronisiert. Wenn Sie beispielsweise alle Abschnitte in einem Dokument ausgewählt haben und die Sammlung aufzählen, indem Sie die Abschnitte löschen, wird der Abschnitt sofort aus der Sammlung entfernt, wenn er aus dem Dokument entfernt wird.

## Beispiele

Zeigt, wie alle Kommentare und Antworten eines Dokuments gedruckt werden.

```csharp
Document doc = new Document(MyDir + "Comments.docx");

NodeCollection comments = doc.GetChildNodes(NodeType.Comment, true);
// Wenn ein Kommentar keinen Vorfahren hat, handelt es sich um einen „Top-Level“-Kommentar und nicht um einen Antworttyp-Kommentar.
// Alle Kommentare der obersten Ebene zusammen mit etwaigen Antworten drucken.
foreach (Comment comment in comments.OfType<Comment>().Where(c => c.Ancestor == null))
{
    Console.WriteLine("Top-level comment:");
    Console.WriteLine($"\t\"{comment.GetText().Trim()}\", by {comment.Author}");
    Console.WriteLine($"Has {comment.Replies.Count} replies");
    foreach (Comment commentReply in comment.Replies)
    {
        Console.WriteLine($"\t\"{commentReply.GetText().Trim()}\", by {commentReply.Author}");
    }
    Console.WriteLine();
}
```

Zeigt, wie man Bilder aus einem Dokument extrahiert und sie als einzelne Dateien im lokalen Dateisystem speichert.

```csharp
Document doc = new Document(MyDir + "Images.docx");

// Holen Sie sich die Formensammlung aus dem Dokument,
// und die Bilddaten jeder Form mit einem Bild als Datei im lokalen Dateisystem speichern.
NodeCollection shapes = doc.GetChildNodes(NodeType.Shape, true);

Assert.AreEqual(9, shapes.Count(s => ((Shape)s).HasImage));

int imageIndex = 0;
foreach (Shape shape in shapes.OfType<Shape>())
{
    if (shape.HasImage)
    {
         // Die Bilddaten von Formen können Bilder in vielen möglichen Bildformaten enthalten.
        // Wir können für jedes Bild automatisch eine Dateierweiterung anhand seines Formats ermitteln.
        string imageFileName =
            $"File.ExtractImages.{imageIndex}{FileFormatUtil.ImageTypeToExtension(shape.ImageData.ImageType)}";
        shape.ImageData.Save(ArtifactsDir + imageFileName);
        imageIndex++;
    }
}
```

Zeigt, wie die Sammlung untergeordneter Knoten eines zusammengesetzten Knotens durchlaufen wird.

```csharp
Document doc = new Document();

// Fügen Sie dem ersten Absatz dieses Dokuments zwei Läufe und eine Form als untergeordnete Knoten hinzu.
Paragraph paragraph = (Paragraph)doc.GetChild(NodeType.Paragraph, 0, true);
paragraph.AppendChild(new Run(doc, "Hello world! "));

Shape shape = new Shape(doc, ShapeType.Rectangle);
shape.Width = 200;
shape.Height = 200;
// Beachten Sie, dass die „CustomNodeId“ nicht in einer Ausgabedatei gespeichert wird und nur während der Knotenlebensdauer vorhanden ist.
shape.CustomNodeId = 100;
shape.WrapType = WrapType.Inline;
paragraph.AppendChild(shape);

paragraph.AppendChild(new Run(doc, "Hello again!"));

// Durch die Sammlung der unmittelbar untergeordneten Elemente des Absatzes iterieren,
// und alle Läufe oder Formen drucken, die wir darin finden.
NodeCollection children = paragraph.GetChildNodes(NodeType.Any, false);

Assert.AreEqual(3, paragraph.GetChildNodes(NodeType.Any, false).Count);

foreach (Node child in children)
    switch (child.NodeType)
    {
        case NodeType.Run:
            Console.WriteLine("Run contents:");
            Console.WriteLine($"\t\"{child.GetText().Trim()}\"");
            break;
        case NodeType.Shape:
            Shape childShape = (Shape)child;
            Console.WriteLine("Shape:");
            Console.WriteLine($"\t{childShape.ShapeType}, {childShape.Width}x{childShape.Height}");
            break;
    }
```

Zeigt, wie untergeordnete Knoten in der untergeordneten Sammlung eines CompositeNode hinzugefügt, aktualisiert und gelöscht werden.

```csharp
Document doc = new Document();

// Ein leeres Dokument hat standardmäßig einen Absatz.
Assert.AreEqual(1, doc.FirstSection.Body.Paragraphs.Count);

// Zusammengesetzte Knoten wie unser Absatz können andere zusammengesetzte und Inline-Knoten als untergeordnete Knoten enthalten.
Paragraph paragraph = doc.FirstSection.Body.FirstParagraph;
Run paragraphText = new Run(doc, "Initial text. ");
paragraph.AppendChild(paragraphText);

// Drei weitere Ausführungsknoten erstellen.
Run run1 = new Run(doc, "Run 1. ");
Run run2 = new Run(doc, "Run 2. ");
Run run3 = new Run(doc, "Run 3. ");

// Der Dokumentkörper zeigt diese Läufe erst an, wenn wir sie in einen zusammengesetzten Knoten einfügen
// das selbst ist Teil des Knotenbaums des Dokuments, wie wir es beim ersten Durchlauf getan haben.
// Wir können bestimmen, wo sich die Textinhalte der Knoten befinden, die wir einfügen
// wird im Dokument angezeigt, indem eine Einfügeposition relativ zu einem anderen Knoten im Absatz angegeben wird.
Assert.AreEqual("Initial text.", paragraph.GetText().Trim());

// Den zweiten Lauf in den Absatz vor dem ersten Lauf einfügen.
paragraph.InsertBefore(run2, paragraphText);

Assert.AreEqual("Run 2. Initial text.", paragraph.GetText().Trim());

// Den dritten Lauf nach dem ersten Lauf einfügen.
paragraph.InsertAfter(run3, paragraphText);

Assert.AreEqual("Run 2. Initial text. Run 3.", paragraph.GetText().Trim());

// Den ersten Lauf am Anfang der Sammlung der untergeordneten Knoten des Absatzes einfügen.
paragraph.PrependChild(run1);

Assert.AreEqual("Run 1. Run 2. Initial text. Run 3.", paragraph.GetText().Trim());
Assert.AreEqual(4, paragraph.GetChildNodes(NodeType.Any, true).Count);

// Wir können den Inhalt des Laufs ändern, indem wir vorhandene untergeordnete Knoten bearbeiten und löschen.
((Run)paragraph.GetChildNodes(NodeType.Run, true)[1]).Text = "Updated run 2. ";
paragraph.GetChildNodes(NodeType.Run, true).Remove(paragraphText);

Assert.AreEqual("Run 1. Updated run 2. Run 3.", paragraph.GetText().Trim());
Assert.AreEqual(3, paragraph.GetChildNodes(NodeType.Any, true).Count);
```

### Siehe auch

* class [NodeCollection](../../nodecollection/)
* enum [NodeType](../../nodetype/)
* class [CompositeNode](../)
* namensraum [Aspose.Words](../../../aspose.words/)
* Montage [Aspose.Words](../../../)
