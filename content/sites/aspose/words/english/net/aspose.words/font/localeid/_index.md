---
title: Font.LocaleId
linktitle: LocaleId
articleTitle: LocaleId
second_title: Aspose.Words for .NET
description: Discover how the Font LocaleId property enhances your text formatting by managing locale identifiers for diverse character languages. Improve your coding today!
type: docs
weight: 200
url: /net/aspose.words/font/localeid/
---
## Font.LocaleId property

Gets or sets the locale identifier (language) of the formatted characters.

```csharp
public int LocaleId { get; set; }
```

## Remarks

For the list of locale identifiers see https://msdn.microsoft.com/en-us/library/cc233965.aspx

## Examples

Shows how to set the locale of the text that we are adding with a document builder.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// If we set the font's locale to English and insert some Russian text,
// the English locale spell checker will not recognize the text and detect it as a spelling error.
builder.Font.LocaleId = new CultureInfo("en-US", false).LCID;
builder.Writeln("Привет!");

// Set a matching locale for the text that we are about to add to apply the appropriate spell checker.
builder.Font.LocaleId = new CultureInfo("ru-RU", false).LCID;
builder.Writeln("Привет!");

doc.Save(ArtifactsDir + "Font.LocaleId.docx");
```

### See Also

* class [Font](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
