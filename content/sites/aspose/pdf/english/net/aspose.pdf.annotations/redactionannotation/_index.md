---
title: Class RedactionAnnotation
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Annotations.RedactionAnnotation class. Represents Redact annotation
type: docs
weight: 2490
url: /net/aspose.pdf.annotations/redactionannotation/
---
## RedactionAnnotation class

Represents Redact annotation.

```csharp
public sealed class RedactionAnnotation : MarkupAnnotation
```

## Constructors

| Name | Description |
| --- | --- |
| [RedactionAnnotation](redactionannotation/#constructor)(Document) | Constructor for RedactionAnnotation. For using in Generator. |
| [RedactionAnnotation](redactionannotation/#constructor_1)(Page, Rectangle) | Constructor for RedactAnnotation. |

## Properties

| Name | Description |
| --- | --- |
| [Actions](../../aspose.pdf.annotations/annotation/actions/) { get; } | Gets list of annotatation actions. |
| virtual [ActiveState](../../aspose.pdf.annotations/annotation/activestate/) { get; set; } | Gets or sets current annotation appearance state. |
| override [AnnotationType](../../aspose.pdf.annotations/redactionannotation/annotationtype/) { get; } | Gets type of annotation. |
| [Appearance](../../aspose.pdf.annotations/annotation/appearance/) { get; } | Gets appearance dictionary of the annotation. |
| [Border](../../aspose.pdf.annotations/annotation/border/) { get; set; } | Gets or sets annotation border characteristics. [`Border`](../annotation/border/) |
| [BorderColor](../../aspose.pdf.annotations/redactionannotation/bordercolor/) { get; set; } | Gets or sets color of border which is drawn when redaction is not active. |
| [Characteristics](../../aspose.pdf.annotations/annotation/characteristics/) { get; } | Gets annotation characteristics. |
| [Color](../../aspose.pdf.annotations/annotation/color/) { get; set; } | Gets or sets annotation color. |
| [Contents](../../aspose.pdf.annotations/annotation/contents/) { get; set; } | Gets or sets annotation text. |
| [CreationDate](../../aspose.pdf.annotations/markupannotation/creationdate/) { get; set; } | Gets date and time when annotation was created. |
| [DefaultAppearance](../../aspose.pdf.annotations/redactionannotation/defaultappearance/) { get; set; } | Gets or sets the default appearance string to be used in formatting the text. |
| [FillColor](../../aspose.pdf.annotations/redactionannotation/fillcolor/) { get; set; } | Gets or sets color to fill annotation. |
| [Flags](../../aspose.pdf.annotations/annotation/flags/) { get; set; } | Flags of the annotation. |
| [FontSize](../../aspose.pdf.annotations/redactionannotation/fontsize/) { get; set; } | Gets or sets font size for OverlayText. |
| [FullName](../../aspose.pdf.annotations/annotation/fullname/) { get; } | Gets full qualified name of the annotation. |
| virtual [Height](../../aspose.pdf.annotations/annotation/height/) { get; set; } | Gets or sets height of the annotation. |
| virtual [Hyperlink](../../aspose.pdf/baseparagraph/hyperlink/) { get; set; } | Gets or sets the fragment hyperlink(for pdf generator). |
| [InReplyTo](../../aspose.pdf.annotations/markupannotation/inreplyto/) { get; set; } | A reference to the annotation that this annotation is "in reply to". Both annotations must be on the same page of the document. |
| [IsFirstParagraphInColumn](../../aspose.pdf/baseparagraph/isfirstparagraphincolumn/) { get; set; } | Gets or sets a bool value that indicates whether this paragraph will be at next column. Default is false.(for pdf generation) |
| [IsInLineParagraph](../../aspose.pdf/baseparagraph/isinlineparagraph/) { get; set; } | Gets or sets a paragraph is inline. Default is false.(for pdf generation) |
| [IsInNewPage](../../aspose.pdf/baseparagraph/isinnewpage/) { get; set; } | Gets or sets a bool value that force this paragraph generates at new page. Default is false.(for pdf generation) |
| [IsKeptWithNext](../../aspose.pdf/baseparagraph/iskeptwithnext/) { get; set; } | Gets or sets a bool value that indicates whether current paragraph remains in the same page along with next paragraph. Default is false.(for pdf generation) |
| [Margin](../../aspose.pdf/baseparagraph/margin/) { get; set; } | Gets or sets a outer margin for paragraph (for pdf generation) |
| [Modified](../../aspose.pdf.annotations/annotation/modified/) { get; set; } | Gets or sets date and time when annotation was recently modified. |
| [Name](../../aspose.pdf.annotations/annotation/name/) { get; set; } | Gets or sets annotation name on the page. |
| [Opacity](../../aspose.pdf.annotations/markupannotation/opacity/) { get; set; } | Gets or sets the constant opacity value to be used in painting the annotation. |
| [OverlayText](../../aspose.pdf.annotations/redactionannotation/overlaytext/) { get; set; } | Gets or sets text to print on redact annotation. |
| virtual [PageIndex](../../aspose.pdf.annotations/annotation/pageindex/) { get; } | Gets index of page which contains annotation. |
| [Popup](../../aspose.pdf.annotations/markupannotation/popup/) { get; set; } | Pop-up annotation for entering or editing the text associated with this annotation. |
| [QuadPoint](../../aspose.pdf.annotations/redactionannotation/quadpoint/) { get; set; } | An array of 8xN numbers specifying the coordinates of content region that is intended to be removed. |
| virtual [Rect](../../aspose.pdf.annotations/annotation/rect/) { get; set; } | Gets or sets annotation rectangle. |
| [Repeat](../../aspose.pdf.annotations/redactionannotation/repeat/) { get; set; } | If true overlay text will be repated on the annotation. |
| [ReplyType](../../aspose.pdf.annotations/markupannotation/replytype/) { get; set; } | A string specifying the relationship (the "reply type") between this annotation and one specified by InReplyTo. |
| [RichText](../../aspose.pdf.annotations/markupannotation/richtext/) { get; set; } | Gets or sets a rich text string to be displayed in the pop-up window when the annotation is opened. |
| [States](../../aspose.pdf.annotations/annotation/states/) { get; } | Gets appearance dictionary of annotation. |
| [Subject](../../aspose.pdf.annotations/markupannotation/subject/) { get; set; } | Gets text representing desciption of the object. |
| [TextAlignment](../../aspose.pdf.annotations/redactionannotation/textalignment/) { get; set; } | Gets or sets. Alignment of Overlay Text. |
| [TextHorizontalAlignment](../../aspose.pdf.annotations/annotation/texthorizontalalignment/) { get; set; } | Gets or sets text alignment for annotation. |
| [Title](../../aspose.pdf.annotations/markupannotation/title/) { get; set; } | Gets or sets a text label that shall be displayed in the title bar of the annotation’s popup window when open and active. This entry shall identify the user who added the annotation. |
| virtual [VerticalAlignment](../../aspose.pdf/baseparagraph/verticalalignment/) { get; set; } | Gets or sets a vertical alignment of paragraph |
| virtual [Width](../../aspose.pdf.annotations/annotation/width/) { get; set; } | Gets or sets width of the annotation. |
| [ZIndex](../../aspose.pdf/baseparagraph/zindex/) { get; set; } | Gets or sets a int value that indicates the Z-order of the graph. A graph with larger ZIndex will be placed over the graph with smaller ZIndex. ZIndex can be negative. Graph with negative ZIndex will be placed behind the text in the page. |

## Methods

| Name | Description |
| --- | --- |
| override [Accept](../../aspose.pdf.annotations/redactionannotation/accept/)(AnnotationSelector) | Accepts visitor object to process the annotation. |
| virtual [ChangeAfterResize](../../aspose.pdf.annotations/annotation/changeafterresize/)(Matrix) | Update parameters and appearance, according to the matrix transform. |
| [ClearState](../../aspose.pdf.annotations/markupannotation/clearstate/)() | Clears state and state model for the annotation. For example, clears the review status for an annotation. Note, the state stored in other text annotation which has state and statemodel keys. |
| virtual [Clone](../../aspose.pdf/baseparagraph/clone/)() | Clones this instance. Virtual method. Always return null. |
| override [Flatten](../../aspose.pdf.annotations/redactionannotation/flatten/)() | Flattens annotation i.e. removes annotation and adds its |
| [GetRectangle](../../aspose.pdf.annotations/annotation/getrectangle/)(bool) | Returns rectangle of annotation taking into consideration page rotation. |
| [GetState](../../aspose.pdf.annotations/markupannotation/getstate/)() | Gets the state of the annotation. Note, the state stored in other text annotation which has state and statemodel keys. |
| [GetStateModel](../../aspose.pdf.annotations/markupannotation/getstatemodel/)() | Gets the state model of the annotation. Note, the state stored in other text annotation which has state and statemodel keys. |
| [Redact](../../aspose.pdf.annotations/redactionannotation/redact/)() | Flattens annotation and redacts page contents (i.e. removes text and image under redacted annotation) |
| [SetMarkedState](../../aspose.pdf.annotations/markupannotation/setmarkedstate/)(bool) | Sets Marked and Unmarked state for the annotation. Note, the state stored in other text annotation which has state and statemodel keys. |
| [SetReviewState](../../aspose.pdf.annotations/markupannotation/setreviewstate/)(AnnotationState) | Sets the review state for an annotation. Marked and Unmarked states are ignored as they do not belong to the Review StateModel. The state is set by the user who created the target annotation. The value is taken from the Title property of the target annotation. Note, the state stored in other text annotation which has state and statemodel keys. |
| [SetReviewState](../../aspose.pdf.annotations/markupannotation/setreviewstate/)(AnnotationState, string) | Sets the review state for an annotation. Marked and Unmarked states are ignored as they do not belong to the Review StateModel. Note, the state stored in other text annotation which has state and statemodel keys. |

### See Also

* class [MarkupAnnotation](../markupannotation/)
* namespace [Aspose.Pdf.Annotations](../../aspose.pdf.annotations/)
* assembly [Aspose.PDF](../../)


