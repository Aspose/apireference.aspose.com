---
title: Class SubmitFormAction
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Annotations.SubmitFormAction class. Class which describes submitform action
type: docs
weight: 2740
url: /net/aspose.pdf.annotations/submitformaction/
---
## SubmitFormAction class

Class which describes submit-form action.

```csharp
public sealed class SubmitFormAction : PdfAction
```

## Constructors

| Name | Description |
| --- | --- |
| [SubmitFormAction](submitformaction/)() | Initializes SubmitFormAction object. |

## Properties

| Name | Description |
| --- | --- |
| [Flags](../../aspose.pdf.annotations/submitformaction/flags/) { get; set; } | Gets or sets flagas of submit action |
| [Next](../../aspose.pdf.annotations/pdfaction/next/) { get; } | Next actions in sequence. |
| [Url](../../aspose.pdf.annotations/submitformaction/url/) { get; set; } | Destination URL. |

## Methods

| Name | Description |
| --- | --- |
| [GetECMAScriptString](../../aspose.pdf.annotations/pdfaction/getecmascriptstring/)() | Gets string for ECMAScript Action. |

## Fields

| Name | Description |
| --- | --- |
| const [CanonicalFormat](../../aspose.pdf.annotations/submitformaction/canonicalformat/) | If set, any submitted field values representing dates shall be converted to the standard format. |
| const [EmbedForm](../../aspose.pdf.annotations/submitformaction/embedform/) | If set, the F entry of the submitted FDF shall be a file specification containing an embedded file stream representing the PDF file from which the FDF is being submitted. |
| const [ExclFKey](../../aspose.pdf.annotations/submitformaction/exclfkey/) | If set, the submitted FDF shall exclude the F entry. |
| const [ExclNonUserAnnots](../../aspose.pdf.annotations/submitformaction/exclnonuserannots/) | If set, it shall include only those markup annotations whose T entry matches the name of the current user. |
| const [Exclude](../../aspose.pdf.annotations/submitformaction/exclude/) | If clear, the Fields array specifies which fields to include in the submission. |
| const [ExportFormat](../../aspose.pdf.annotations/submitformaction/exportformat/) | If set, field names and values shall be submitted in HTML Form format. |
| const [GetMethod](../../aspose.pdf.annotations/submitformaction/getmethod/) | If set, field names and values shall be submitted using an HTTP GET request. |
| const [IncludeAnnotations](../../aspose.pdf.annotations/submitformaction/includeannotations/) | If set, the submitted FDF file shall include includes all markup annotations in the underlying PDF document. |
| const [IncludeAppendSaves](../../aspose.pdf.annotations/submitformaction/includeappendsaves/) | If set, the submitted FDF file shall include the contents of all incremental updates. |
| const [IncludeNoValueFields](../../aspose.pdf.annotations/submitformaction/includenovaluefields/) | If set, all fields designated by the Fields array and the Include/Exclude flag shall be submitted. |
| const [SubmitCoordinates](../../aspose.pdf.annotations/submitformaction/submitcoordinates/) | If set, the coordinates of the mouse click that caused the submit-form action shall be transmitted as part of the form data. |
| const [SubmitPdf](../../aspose.pdf.annotations/submitformaction/submitpdf/) | If set, the document shall be submitted as PDF, using the MIME content type application/pdf. |
| const [Xfdf](../../aspose.pdf.annotations/submitformaction/xfdf/) | If set, field names and values shall be submitted as XFDF. |

### See Also

* class [PdfAction](../pdfaction/)
* namespace [Aspose.Pdf.Annotations](../../aspose.pdf.annotations/)
* assembly [Aspose.PDF](../../)


