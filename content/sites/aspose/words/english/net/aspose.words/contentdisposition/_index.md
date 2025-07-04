---
title: ContentDisposition Enum
linktitle: ContentDisposition
articleTitle: ContentDisposition
second_title: Aspose.Words for .NET
description: Explore the Aspose.Words.ContentDisposition enum to discover various document presentation options for enhanced client browser experiences.
type: docs
weight: 530
url: /net/aspose.words/contentdisposition/
---
## ContentDisposition enumeration

Enumerates different ways of presenting the document at the client browser.

```csharp
public enum ContentDisposition
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Attachment | `0` | Send the document to the browser and present an option to save the document to disk or open in the application associated with the document's extension. |
| Inline | `1` | Send the document to the browser and presents an option to save the document to disk or open inside the browser. |

## Remarks

Note that the actual behavior on the client browser might be affected by security configuration of the browser.

## Examples

Shows how to perform a mail merge, and then save the document to the client browser.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.InsertField(" MERGEFIELD FullName ");
builder.InsertParagraph();
builder.InsertField(" MERGEFIELD Company ");
builder.InsertParagraph();
builder.InsertField(" MERGEFIELD Address ");
builder.InsertParagraph();
builder.InsertField(" MERGEFIELD City ");

doc.MailMerge.Execute(new string[] { "FullName", "Company", "Address", "City" },
    new object[] { "James Bond", "MI5 Headquarters", "Milbank", "London" });

// Send the document to the client browser.
//Thrown because HttpResponse is null in the test.
Assert.Throws<ArgumentNullException>(() => doc.Save(response, "Artifacts/MailMerge.ExecuteArray.docx", ContentDisposition.Inline, null));

// We will need to close this response manually to ensure that we do not add any superfluous content to the document after saving.
Assert.Throws<NullReferenceException>(() => response.End());
```

### See Also

* namespace [Aspose.Words](../../aspose.words/)
* assembly [Aspose.Words](../../)
