---
title: Document.HasMacros
linktitle: HasMacros
articleTitle: HasMacros
second_title: Aspose.Words for .NET
description: Discover if your document contains VBA project macros with the HasMacros property. Enhance automation and efficiency in your workflows today!
type: docs
weight: 200
url: /net/aspose.words/document/hasmacros/
---
## Document.HasMacros property

Returns `true` if the document has a VBA project (macros).

```csharp
public bool HasMacros { get; }
```

## Examples

Shows how to use MACROBUTTON fields to allow us to run a document's macros by clicking.

```csharp
Document doc = new Document(MyDir + "Macro.docm");
DocumentBuilder builder = new DocumentBuilder(doc);

Assert.That(doc.HasMacros, Is.True);

// Insert a MACROBUTTON field, and reference one of the document's macros by name in the MacroName property.
FieldMacroButton field = (FieldMacroButton)builder.InsertField(FieldType.FieldMacroButton, true);
field.MacroName = "MyMacro";
field.DisplayText = "Double click to run macro: " + field.MacroName;

Assert.That(field.GetFieldCode(), Is.EqualTo(" MACROBUTTON  MyMacro Double click to run macro: MyMacro"));

// Use the property to reference "ViewZoom200", a macro that ships with Microsoft Word.
// We can find all other macros via View -> Macros (dropdown) -> View Macros.
// In that menu, select "Word Commands" from the "Macros in:" drop down.
// If our document contains a custom macro with the same name as a stock macro,
// our macro will be the one that the MACROBUTTON field runs.
builder.InsertParagraph();
field = (FieldMacroButton)builder.InsertField(FieldType.FieldMacroButton, true);
field.MacroName = "ViewZoom200";
field.DisplayText = "Run " + field.MacroName;

Assert.That(field.GetFieldCode(), Is.EqualTo(" MACROBUTTON  ViewZoom200 Run ViewZoom200"));

// Save the document as a macro-enabled document type.
doc.Save(ArtifactsDir + "Field.MACROBUTTON.docm");
```

### See Also

* method [RemoveMacros](../removemacros/)
* class [Document](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
