---
title: Document.UpdateWordCount
linktitle: UpdateWordCount
articleTitle: UpdateWordCount
second_title: Aspose.Words for .NET
description: Enhance your document's efficiency with the UpdateWordCount method, ensuring accurate word count properties for better editing and review.
type: docs
weight: 850
url: /net/aspose.words/document/updatewordcount/
---
## UpdateWordCount() {#updatewordcount}

Updates word count properties of the document.

```csharp
public void UpdateWordCount()
```

## Remarks

`UpdateWordCount` recalculates and updates Characters, Words and Paragraphs properties in the [`BuiltInDocumentProperties`](../builtindocumentproperties/) collection of the [`Document`](../).

Note that `UpdateWordCount` does not update number of lines and pages properties. Use the `UpdateWordCount` overload and pass `true` value as a parameter to do that.

When you use an evaluation version, the evaluation watermark will also be included in the word count.

## Examples

Shows how to update all list labels in a document.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
builder.Write("Ut enim ad minim veniam, " +
                "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");

// Aspose.Words does not track document metrics like these in real time.
Assert.AreEqual(0, doc.BuiltInDocumentProperties.Characters);
Assert.AreEqual(0, doc.BuiltInDocumentProperties.Words);
Assert.AreEqual(1, doc.BuiltInDocumentProperties.Paragraphs);
Assert.AreEqual(1, doc.BuiltInDocumentProperties.Lines);

// To get accurate values for three of these properties, we will need to update them manually.
doc.UpdateWordCount();

Assert.AreEqual(196, doc.BuiltInDocumentProperties.Characters);
Assert.AreEqual(36, doc.BuiltInDocumentProperties.Words);
Assert.AreEqual(2, doc.BuiltInDocumentProperties.Paragraphs);

// For the line count, we will need to call a specific overload of the updating method.
Assert.AreEqual(1, doc.BuiltInDocumentProperties.Lines);

doc.UpdateWordCount(true);

Assert.AreEqual(4, doc.BuiltInDocumentProperties.Lines);
```

### See Also

* class [Document](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

---

## UpdateWordCount(*bool*) {#updatewordcount_1}

Updates word count properties of the document, optionally updates [`Lines`](../../../aspose.words.properties/builtindocumentproperties/lines/) property.

```csharp
public void UpdateWordCount(bool updateLinesCount)
```

| Parameter | Type | Description |
| --- | --- | --- |
| updateLinesCount | Boolean | `true` if number of lines in the document shall be calculated. |

## Remarks

This method will rebuild page layout of the document.

## Examples

Shows how to update all list labels in a document.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
builder.Write("Ut enim ad minim veniam, " +
                "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");

// Aspose.Words does not track document metrics like these in real time.
Assert.AreEqual(0, doc.BuiltInDocumentProperties.Characters);
Assert.AreEqual(0, doc.BuiltInDocumentProperties.Words);
Assert.AreEqual(1, doc.BuiltInDocumentProperties.Paragraphs);
Assert.AreEqual(1, doc.BuiltInDocumentProperties.Lines);

// To get accurate values for three of these properties, we will need to update them manually.
doc.UpdateWordCount();

Assert.AreEqual(196, doc.BuiltInDocumentProperties.Characters);
Assert.AreEqual(36, doc.BuiltInDocumentProperties.Words);
Assert.AreEqual(2, doc.BuiltInDocumentProperties.Paragraphs);

// For the line count, we will need to call a specific overload of the updating method.
Assert.AreEqual(1, doc.BuiltInDocumentProperties.Lines);

doc.UpdateWordCount(true);

Assert.AreEqual(4, doc.BuiltInDocumentProperties.Lines);
```

### See Also

* class [Document](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
