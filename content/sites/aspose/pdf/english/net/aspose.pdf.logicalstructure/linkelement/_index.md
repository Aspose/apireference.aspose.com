---
title: Class LinkElement
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.LogicalStructure.LinkElement class. Represents Link structure element in logical structure
type: docs
weight: 6580
url: /net/aspose.pdf.logicalstructure/linkelement/
---
## LinkElement class

Represents Link structure element in logical structure.

```csharp
public sealed class LinkElement : AnnotationElement, IAdjustPosition, ITextElement
```

## Properties

| Name | Description |
| --- | --- |
| [ActualText](../../aspose.pdf.logicalstructure/structureelement/actualtext/) { get; set; } | Gets or sets the actual text for structure element. |
| [AlternateDescriptions](../../aspose.pdf.logicalstructure/annotationelement/alternatedescriptions/) { get; set; } | Gets or Sets the Alternate Descriptions for annotation. Text that shall be displayed for the annotation or, if this type of annotation does not display text, an alternate description of the annotation's contents in human-readable form. |
| [AlternativeText](../../aspose.pdf.logicalstructure/structureelement/alternativetext/) { get; set; } | Gets or sets the alternative text for structure element. |
| [Attributes](../../aspose.pdf.logicalstructure/structureelement/attributes/) { get; } | Gets StructureAttributeCollection object. |
| [ChildElements](../../aspose.pdf.logicalstructure/element/childelements/) { get; } | Gets children collection of Element objects. |
| [DefaultAttributeOwner](../../aspose.pdf.logicalstructure/structureelement/defaultattributeowner/) { get; } | Gets AttributeOwnerStandard object. |
| [ExpansionText](../../aspose.pdf.logicalstructure/structureelement/expansiontext/) { get; set; } | Gets or sets the expansion text for structure element. |
| [Hyperlink](../../aspose.pdf.logicalstructure/linkelement/hyperlink/) { get; set; } | Gets or Sets Hyperlink for Link Element. |
| [ID](../../aspose.pdf.logicalstructure/structureelement/id/) { get; } | Gets the ID for structure element. |
| [Language](../../aspose.pdf.logicalstructure/structureelement/language/) { get; set; } | Gets or sets the language for structure element. |
| [Page](../../aspose.pdf.logicalstructure/structureelement/page/) { get; } | Gets the page on which some or all child elements will be rendered. |
| [ParentElement](../../aspose.pdf.logicalstructure/element/parentelement/) { get; } | Get parent element. |
| [StructureTextState](../../aspose.pdf.logicalstructure/linkelement/structuretextstate/) { get; } | Gets StructureTextState object for current element. |
| [StructureType](../../aspose.pdf.logicalstructure/structureelement/structuretype/) { get; } | Gets type of structure element. |
| [Title](../../aspose.pdf.logicalstructure/structureelement/title/) { get; set; } | Gets or sets the title for structure element. |

## Methods

| Name | Description |
| --- | --- |
| [AdjustPosition](../../aspose.pdf.logicalstructure/linkelement/adjustposition/)(PositionSettings) |  |
| [AppendChild](../../aspose.pdf.logicalstructure/element/appendchild/)(Element, bool) | Append Element to collection of children. |
| [ChangeParentElement](../../aspose.pdf.logicalstructure/structureelement/changeparentelement/)(StructureElement, bool) | Change parent element for current structure element |
| [ClearChilds](../../aspose.pdf.logicalstructure/element/clearchilds/)() | Clear all childs. |
| [ClearId](../../aspose.pdf.logicalstructure/structureelement/clearid/)() | Clear ID for structure element. |
| [FindElements&lt;T&gt;](../../aspose.pdf.logicalstructure/element/findelements/)(bool) | Find Elements of a given type |
| [GenerateId](../../aspose.pdf.logicalstructure/structureelement/generateid/)() | Generate ID for structure element. |
| [InsertChild](../../aspose.pdf.logicalstructure/element/insertchild/)(Element, int, bool) | Insert Element to collection of children at specified index. |
| [Remove](../../aspose.pdf.logicalstructure/structureelement/remove/)() | Removes: an element from the structure, a reference to it from the parent object, references to it from child objects, the corresponding object from the document. |
| [RemoveAndMoveItsChildObjectsToItsParent](../../aspose.pdf.logicalstructure/structureelement/removeandmoveitschildobjectstoitsparent/)(bool) | Removes an element from the structure, a reference to it from the parent object, references to it from child objects, and the corresponding object from the document. Inserts child objects of the removed object into its former parent child objects collection starting at the index of the removed object. |
| [RemoveChild](../../aspose.pdf.logicalstructure/element/removechild/)(int) | Remove child at. |
| [SetId](../../aspose.pdf.logicalstructure/structureelement/setid/)(string) | Sets ID for structure element. |
| [SetTag](../../aspose.pdf.logicalstructure/structureelement/settag/)(string) | Sets custom tag for structure element. |
| [SetText](../../aspose.pdf.logicalstructure/linkelement/settext/)(string) |  |
| override [Tag](../../aspose.pdf.logicalstructure/structureelement/tag/)(Annotation) | Bind a structure element to the Annotation. |
| override [Tag](../../aspose.pdf.logicalstructure/structureelement/tag/)(Artifact) | Bind a structure element to the Artifact. |
| override [Tag](../../aspose.pdf.logicalstructure/structureelement/tag/)(BDC) | Bind a structure element to the content stream BDC operator. |
| override [Tag](../../aspose.pdf.logicalstructure/structureelement/tag/)(XForm) | Bind a structure element to the content stream XForm. |
| override [Tag](../../aspose.pdf.logicalstructure/structureelement/tag/)(XImage) | Bind a structure element to the XImage. |
| override [ToString](../../aspose.pdf.logicalstructure/structureelement/tostring/)() | Returns a string that represents the current object. |

### See Also

* class [AnnotationElement](../annotationelement/)
* interface [IAdjustPosition](../../aspose.pdf.tagged/iadjustposition/)
* interface [ITextElement](../itextelement/)
* namespace [Aspose.Pdf.LogicalStructure](../../aspose.pdf.logicalstructure/)
* assembly [Aspose.PDF](../../)


