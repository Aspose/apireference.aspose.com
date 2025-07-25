---
title: Class PaginationArtifact
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.PaginationArtifact class. Represents an abstract base class for pagination artifacts in a document
type: docs
weight: 8400
url: /net/aspose.pdf/paginationartifact/
---
## PaginationArtifact class

Represents an abstract base class for pagination artifacts in a document.

```csharp
public abstract class PaginationArtifact : Artifact
```

## Properties

| Name | Description |
| --- | --- |
| [ArtifactHorizontalAlignment](../../aspose.pdf/artifact/artifacthorizontalalignment/) { get; set; } | Horizontal alignment of artifact. If position is specified explicitly (in Position property) this value is ignored. |
| [ArtifactVerticalAlignment](../../aspose.pdf/artifact/artifactverticalalignment/) { get; set; } | Vertical alignment of artifact. If position is specified explicitly (in Position property) this value is ignored. |
| [BottomMargin](../../aspose.pdf/artifact/bottommargin/) { get; set; } | Bottom margin of artifact. If position is specified explicitly (in Position property) this value is ignored. |
| [Contents](../../aspose.pdf/artifact/contents/) { get; } | Gets collection of artifact internal operators. |
| [CustomSubtype](../../aspose.pdf/artifact/customsubtype/) { get; set; } | Gets name of artifact subtype. May be used if artifact subtype is not standard subtype. |
| [CustomType](../../aspose.pdf/artifact/customtype/) { get; set; } | Gets name of artifact type. May be used if artifact type is non standard. |
| [EndPage](../../aspose.pdf/paginationartifact/endpage/) { get; set; } | Gets or sets the ending page number for the artifact. The value must be greater than or equal to 0. If a value less than 0 is set, it will be adjusted to 0. The default value of 0 means there are no end page boundaries. |
| [Form](../../aspose.pdf/artifact/form/) { get; } | Gets XForm of the artifact (if XForm is used). |
| [Image](../../aspose.pdf/artifact/image/) { get; } | Gets image of the artifact (if presents). |
| [IsBackground](../../aspose.pdf/artifact/isbackground/) { get; set; } | If true Artifact is placed behind page contents. |
| [LeftMargin](../../aspose.pdf/artifact/leftmargin/) { get; set; } | Left margin of artifact. If position is specified explicitly (in Position property) this value is ignored. |
| [Lines](../../aspose.pdf/artifact/lines/) { get; } | Lines of multiline text artifact. |
| [Opacity](../../aspose.pdf/artifact/opacity/) { get; set; } | Gets or sets opacity of the artifact. Possible values are in range 0..1. |
| [Position](../../aspose.pdf/artifact/position/) { get; set; } | Gets or sets artifact position. If this property is specified, then margins and alignments are ignored. |
| [Rectangle](../../aspose.pdf/artifact/rectangle/) { get; } | Gets rectangle of the artifact. |
| [RightMargin](../../aspose.pdf/artifact/rightmargin/) { get; set; } | Right margin of artifact. If position is specified explicitly (in Position property) this value is ignored. |
| [Rotation](../../aspose.pdf/artifact/rotation/) { get; set; } | Gets or sets artifact rotation angle. |
| [StartPage](../../aspose.pdf/paginationartifact/startpage/) { get; set; } | Gets or sets the starting page number for the artifact. The value must be greater than or equal to 1. If a value less than 1 is set, it will be adjusted to 1. |
| [Subset](../../aspose.pdf/paginationartifact/subset/) { get; set; } | Gets or sets the subset of pages to which the artifact applies (e.g., all pages, even pages, odd pages). |
| [Subtype](../../aspose.pdf/artifact/subtype/) { get; set; } | Gets artifact subtype. If artifact has non-standard subtype, name of the subtype may be read via CustomSubtype. |
| [Text](../../aspose.pdf/artifact/text/) { get; set; } | Gets text of the artifact. |
| [TextState](../../aspose.pdf/artifact/textstate/) { get; set; } | Text state for artifact text. |
| [TopMargin](../../aspose.pdf/artifact/topmargin/) { get; set; } | Top margin of artifact. If position is specified explicitly (in Position property) this value is ignored. |
| [Type](../../aspose.pdf/artifact/type/) { get; set; } | Gets artifact type. |

## Methods

| Name | Description |
| --- | --- |
| [BeginUpdates](../../aspose.pdf/artifact/beginupdates/)() | Start delated updates. Use this feature if you need make several changes to the same artifact to improve performance. Usually artifact operators are changed anytime when artifact property was changed. This causes changing of page contents everytime when artifact was changed. To avoid this effect put all artifact updates between StartUpdates/SaveUpdates calls. This allows to change page contents only once. |
| [Dispose](../../aspose.pdf/artifact/dispose/)() | Dispose the artifact. |
| [GetValue](../../aspose.pdf/artifact/getvalue/)(string) | Gets custom value of artifact. |
| [RemoveValue](../../aspose.pdf/artifact/removevalue/)(string) | Remove custom value from the artifact. |
| [SaveUpdates](../../aspose.pdf/artifact/saveupdates/)() | Saves all updates in artifact which were made after BeginUpdates() call. |
| [SetImage](../../aspose.pdf/artifact/setimage/)(Stream) | Sets image of the artifact. |
| [SetImage](../../aspose.pdf/artifact/setimage/)(string) | Sets image of the artifact. |
| [SetLinesAndState](../../aspose.pdf/artifact/setlinesandstate/)(string[], TextState) | Set text and text properties of the artifact. Allows to specify multiple lines. |
| [SetPageNumberReplacementString](../../aspose.pdf/artifact/setpagenumberreplacementstring/)(string) | Sets what string will be replaced with the page number. The default value is #. |
| [SetPdfPage](../../aspose.pdf/artifact/setpdfpage/)(Page) | Sets PDF page which is placed on the document page as artifact. |
| [SetText](../../aspose.pdf/artifact/settext/)(FormattedText) | Sets text of the artifact. |
| [SetTextAndState](../../aspose.pdf/artifact/settextandstate/)(string, TextState) | Set text and text properties of the artifact. |
| [SetValue](../../aspose.pdf/artifact/setvalue/)(string, string) | Sets custom value of artifact. |

### See Also

* class [Artifact](../artifact/)
* namespace [Aspose.Pdf](../../aspose.pdf/)
* assembly [Aspose.PDF](../../)


