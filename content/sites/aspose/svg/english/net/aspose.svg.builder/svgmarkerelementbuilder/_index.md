---
title: SVGMarkerElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGMarkerElementBuilder class. Builder class for constructing an SVG marker element which is used to define graphical markers such as arrowheads or bullets that can be attached to the path line polyline and polygon elements. This class enables the building of content within the marker element and provides methods to set various attributes specific to the marker element in SVG
type: docs
weight: 1780
url: /net/aspose.svg.builder/svgmarkerelementbuilder/
---
## SVGMarkerElementBuilder class

Builder class for constructing an SVG 'marker' element, which is used to define graphical markers, such as arrowheads or bullets, that can be attached to the 'path', 'line', 'polyline', and 'polygon' elements. This class enables the building of content within the 'marker' element and provides methods to set various attributes specific to the 'marker' element in SVG.

```csharp
public class SVGMarkerElementBuilder : SVGElementBuilder<SVGMarkerElement>, 
    ICompositeElementBuilder, ICoreAttributeSetter, IDocumentElementEventAttributeSetter, 
    IGlobalEventAttributeSetter, IPresentationAttributeSetter, IPreserveAspectRatioAttributeSetter, 
    IRefCoordinatesAttributeSetter, IViewBoxAttributeSetter
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGMarkerElementBuilder](svgmarkerelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(string, string) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(Document) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(SVGMarkerElement) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(Document) |  |
| [MarkerHeight](../../aspose.svg.builder/svgmarkerelementbuilder/markerheight/)(double, LengthType) | Sets the 'markerHeight' attribute of the SVG 'marker' element, specifying the height of the marker's viewport. |
| [MarkerUnits](../../aspose.svg.builder/svgmarkerelementbuilder/markerunits/)(MarkerUnits) | Sets the 'markerUnits' attribute of the SVG 'marker' element, specifying the coordinate system for the marker's attributes. |
| [MarkerWidth](../../aspose.svg.builder/svgmarkerelementbuilder/markerwidth/)(double, LengthType) | Sets the 'markerWidth' attribute of the SVG 'marker' element, specifying the width of the marker's viewport. |
| [Orient](../../aspose.svg.builder/svgmarkerelementbuilder/orient/#orient)(Orient) | Sets the 'orient' attribute of the SVG 'marker' element, specifying the orientation of the marker. |
| [Orient](../../aspose.svg.builder/svgmarkerelementbuilder/orient/#orient_1)(double, AngleUnits) | Sets the 'orient' attribute of the SVG 'marker' element, specifying the orientation angle of the marker. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* class [SVGMarkerElement](../../aspose.svg/svgmarkerelement/)
* interface [ICompositeElementBuilder](../icompositeelementbuilder/)
* interface [ICoreAttributeSetter](../icoreattributesetter/)
* interface [IDocumentElementEventAttributeSetter](../idocumentelementeventattributesetter/)
* interface [IGlobalEventAttributeSetter](../iglobaleventattributesetter/)
* interface [IPresentationAttributeSetter](../ipresentationattributesetter/)
* interface [IPreserveAspectRatioAttributeSetter](../ipreserveaspectratioattributesetter/)
* interface [IRefCoordinatesAttributeSetter](../irefcoordinatesattributesetter/)
* interface [IViewBoxAttributeSetter](../iviewboxattributesetter/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
