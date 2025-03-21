---
title: Section.ProtectedForForms
linktitle: ProtectedForForms
articleTitle: ProtectedForForms
second_title: Aspose.Words for .NET
description: Discover how the ProtectedForForms property in Microsoft Word enhances document security, allowing users to edit only designated form fields easily.
type: docs
weight: 60
url: /net/aspose.words/section/protectedforforms/
---
## Section.ProtectedForForms property

True if the section is protected for forms. When a section is protected for forms, users can select and modify text only in form fields in Microsoft Word.

```csharp
public bool ProtectedForForms { get; set; }
```

## Examples

Shows how to turn off protection for a section.

```csharp
Document doc = new Document();

DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("Section 1. Hello world!");
builder.InsertBreak(BreakType.SectionBreakNewPage);

builder.Writeln("Section 2. Hello again!");
builder.Write("Please enter text here: ");
builder.InsertTextInput("TextInput1", TextFormFieldType.Regular, "", "Placeholder text", 0);

// Apply write protection to every section in the document.
doc.Protect(ProtectionType.AllowOnlyFormFields);

// Turn off write protection for the first section.
doc.Sections[0].ProtectedForForms = false;

// In this output document, we will be able to edit the first section freely,
// and we will only be able to edit the contents of the form field in the second section.
doc.Save(ArtifactsDir + "Section.Protect.docx");
```

### See Also

* class [Section](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
