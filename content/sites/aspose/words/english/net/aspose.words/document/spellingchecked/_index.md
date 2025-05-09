---
title: Document.SpellingChecked
linktitle: SpellingChecked
articleTitle: SpellingChecked
second_title: Aspose.Words for .NET
description: Ensure your document is error-free with the SpellingChecked property. Discover if your content has been thoroughly spell-checked for professionalism.
type: docs
weight: 430
url: /net/aspose.words/document/spellingchecked/
---
## Document.SpellingChecked property

Returns `true` if the document has been checked for spelling.

```csharp
public bool SpellingChecked { get; set; }
```

## Remarks

To recheck the spelling in the document, set this property to `false`.

## Examples

Shows how to set spelling or grammar verifying.

```csharp
Document doc = new Document();

// The string with spelling errors.
doc.FirstSection.Body.FirstParagraph.Runs.Add(new Run(doc, "The speeling in this documentz is all broked."));

// Spelling/Grammar check start if we set properties to false.
// We can see all errors in Microsoft Word via Review -> Spelling & Grammar.
// Note that Microsoft Word does not start grammar/spell check automatically for DOC and RTF document format.
doc.SpellingChecked = checkSpellingGrammar;
doc.GrammarChecked = checkSpellingGrammar;

doc.Save(ArtifactsDir + "Document.SpellingOrGrammar.docx");
```

### See Also

* class [Document](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
