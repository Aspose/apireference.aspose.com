---
title: aspose.svg
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.svg/
is_root: false
---

All classes in **Aspose.Svg.Dom.Svg**  namespace are based on
w3c SVG2 recommendations. Using this namespace, you can load,
navigate or render the SVG file as per your requirements.

### Classes
| Class | Description |
| :- | :- |
| [`Configuration`](/svg/python-net/aspose.svg/configuration) | Represents the configuration context object that is used to set up the environment settings for the application. |
| [`FontsSettings`](/svg/python-net/aspose.svg/fontssettings) | Represents fonts handling settings. |
| [`IConfigurationBuilder`](/svg/python-net/aspose.svg/iconfigurationbuilder) | Represents a Configuration object builder. |
| [`IConfigurationExtension`](/svg/python-net/aspose.svg/iconfigurationextension) | Represents an extension for configuration, allowing the addition and retrieval of key-value pairs. |
| [`ISVGAnimatedPoints`](/svg/python-net/aspose.svg/isvganimatedpoints) | The SVGAnimatedPoints interface supports elements which have a ‘points’ attribute which holds a list of coordinate values and which support the ability to animate that attribute.<br/>Additionally, the ‘points’ attribute on the original element accessed via the XML DOM(e.g., using the getAttribute() method call) will reflect any changes made to points. |
| [`ISVGFitToViewBox`](/svg/python-net/aspose.svg/isvgfittoviewbox) | Interface SVGFitToViewBox defines DOM attributes that apply to elements which have XML attributes ‘viewBox’ and ‘preserveAspectRatio’. |
| [`ISVGRenderingIntent`](/svg/python-net/aspose.svg/isvgrenderingintent) | The SVGRenderingIntent interface defines the enumerated list of possible values for ‘rendering-intent’ attributes or descriptors. |
| [`ISVGTests`](/svg/python-net/aspose.svg/isvgtests) | Interface SVGTests defines an interface which applies to all elements which have attributes ‘requiredFeatures’, ‘requiredExtensions’ and ‘systemLanguage’. |
| [`ISVGURIReference`](/svg/python-net/aspose.svg/isvgurireference) | Interface SVGURIReference defines an interface which applies to all elements which have the collection of XLink attributes, such as ‘xlink:href’, which define a URI reference. |
| [`ISVGUnitTypes`](/svg/python-net/aspose.svg/isvgunittypes) | The SVGUnitTypes interface defines a commonly used set of constants and is a base interface used by SVGGradientElement, SVGPatternElement, SVGClipPathElement, SVGMaskElement and SVGFilterElement. |
| [`ISVGZoomAndPan`](/svg/python-net/aspose.svg/isvgzoomandpan) | The SVGZoomAndPan interface defines attribute zoomAndPan and associated constants. |
| [`IUrlSearchParams`](/svg/python-net/aspose.svg/iurlsearchparams) | Provides methods to work with URLs query string. |
| [`License`](/svg/python-net/aspose.svg/license) | Provides methods to license the component. |
| [`Metered`](/svg/python-net/aspose.svg/metered) | Provides methods to set metered key. |
| [`MimeType`](/svg/python-net/aspose.svg/mimetype) | Represents an Internet Media Types |
| [`PlatformException`](/svg/python-net/aspose.svg/platformexception) | Represents the base class for all exceptions that may occur during the application execution. |
| [`SVGAElement`](/svg/python-net/aspose.svg/svgaelement) | The SVGAElement interface corresponds to the ‘a’ element. |
| [`SVGAnimateElement`](/svg/python-net/aspose.svg/svganimateelement) | The SVGAnimateElement interface corresponds to the ‘animate’ element.<br/>Object-oriented access to the attributes of the ‘animate’ element via the SVG DOM is not available. |
| [`SVGAnimateMotionElement`](/svg/python-net/aspose.svg/svganimatemotionelement) | The SVGAnimateMotionElement interface corresponds to the ‘animateMotion’ element.<br/>Object-oriented access to the attributes of the ‘animateMotion’ element via the SVG DOM is not available. |
| [`SVGAnimateTransformElement`](/svg/python-net/aspose.svg/svganimatetransformelement) | The SVGAnimateTransformElement interface corresponds to the ‘animateTransform’ element.<br/>Object-oriented access to the attributes of the ‘animateTransform’ element via the SVG DOM is not available. |
| [`SVGAnimationElement`](/svg/python-net/aspose.svg/svganimationelement) | The SVGAnimationElement interface is the base interface for all of the animation element interfaces: SVGAnimateElement, SVGSetElement, SVGAnimateColorElement, SVGAnimateMotionElement and SVGAnimateTransformElement. |
| [`SVGCircleElement`](/svg/python-net/aspose.svg/svgcircleelement) | The SVGCircleElement interface corresponds to the ‘circle’ element. |
| [`SVGClipPathElement`](/svg/python-net/aspose.svg/svgclippathelement) | The SVGClipPathElement interface corresponds to the ‘clipPath’ element. |
| [`SVGComponentTransferFunctionElement`](/svg/python-net/aspose.svg/svgcomponenttransferfunctionelement) | This interface defines a base interface used by the component transfer function interfaces. |
| [`SVGCursorElement`](/svg/python-net/aspose.svg/svgcursorelement) | The SVGCursorElement interface corresponds to the ‘cursor’ element. |
| [`SVGDefsElement`](/svg/python-net/aspose.svg/svgdefselement) | The SVGDefsElement interface corresponds to the ‘defs’ element. |
| [`SVGDescElement`](/svg/python-net/aspose.svg/svgdescelement) | The SVGDescElement interface corresponds to the ‘desc’ element. |
| [`SVGDocument`](/svg/python-net/aspose.svg/svgdocument) | An `SVGDocument` is the root of the SVG hierarchy and holds the entire content. Besides providing access to the hierarchy, it also provides some convenience methods for accessing certain sets of information from the document.<br/>In addition to loading standard .svg files, both the constructors and the [`Document.navigate`](/svg/python-net/aspose.svg.dom/document/navigate) method can load gzip-compressed .svgz files.<br/>When an ‘svg’ element is embedded inline as a component of a document from another namespace, such as when an ‘svg’ element is embedded inline within an XHTML document [XHTML], then an SVGDocument object will not exist; instead, the root object in the document object hierarchy will be a Document object of a different type, such as an HTMLDocument object.<br/>However, an SVGDocument object will indeed exist when the root element of the XML document hierarchy is an ‘svg’ element, such as when viewing a stand-alone SVG file(i.e., a file with MIME type "image/svg+xml"). In this case, the SVGDocument object will be the root object of the document object model hierarchy. |
| [`SVGElement`](/svg/python-net/aspose.svg/svgelement) | All of the SVG DOM interfaces that correspond directly to elements in the SVG language (such as the SVGPathElement interface for the ‘path’ element) derive from the SVGElement interface. |
| [`SVGElementInstance`](/svg/python-net/aspose.svg/svgelementinstance) | The root object of each use-element shadow tree implements the SVGUseElementShadowRoot interface. This interface does not currently define any extensions to the properties and methods defined for the ShadowRoot interface and DocumentOrShadowRoot mixin. However, the tree rooted at this node is entirely read-only from the perspective of author scripts. |
| [`SVGEllipseElement`](/svg/python-net/aspose.svg/svgellipseelement) | The SVGEllipseElement interface corresponds to the ‘ellipse’ element. |
| [`SVGException`](/svg/python-net/aspose.svg/svgexception) | This exception is raised when a specific SVG operation is impossible to perform. |
| [`SVGFilterElement`](/svg/python-net/aspose.svg/svgfilterelement) | The SVGFilterElement interface corresponds to the ‘filter’ element. |
| [`SVGForeignObjectElement`](/svg/python-net/aspose.svg/svgforeignobjectelement) | The SVGForeignObjectElement interface corresponds to the ‘foreignObject’ element. |
| [`SVGGElement`](/svg/python-net/aspose.svg/svggelement) | The SVGGElement interface corresponds to the ‘g’ element. |
| [`SVGGeometryElement`](/svg/python-net/aspose.svg/svggeometryelement) | Interface SVGGeometryElement represents SVG elements whose rendering is defined by geometry with an equivalent path, and which can be filled and stroked. This includes paths and the basic shapes. |
| [`SVGGradientElement`](/svg/python-net/aspose.svg/svggradientelement) | The SVGGradientElement interface is a base interface used by SVGLinearGradientElement and SVGRadialGradientElement. |
| [`SVGGraphicsElement`](/svg/python-net/aspose.svg/svggraphicselement) | The SVGGraphicsElement interface represents SVG elements whose primary purpose is to directly render graphics into a group. |
| [`SVGImageElement`](/svg/python-net/aspose.svg/svgimageelement) | The SVGImageElement interface corresponds to the ‘image’ element. |
| [`SVGLineElement`](/svg/python-net/aspose.svg/svglineelement) | The SVGLineElement interface corresponds to the ‘line’ element. |
| [`SVGLinearGradientElement`](/svg/python-net/aspose.svg/svglineargradientelement) | The SVGLinearGradientElement interface corresponds to the ‘linearGradient’ element. |
| [`SVGMPathElement`](/svg/python-net/aspose.svg/svgmpathelement) | The SVGMPathElement interface corresponds to the ‘mpath’ element. |
| [`SVGMarkerElement`](/svg/python-net/aspose.svg/svgmarkerelement) | The SVGMarkerElement interface corresponds to the ‘marker’ element. |
| [`SVGMaskElement`](/svg/python-net/aspose.svg/svgmaskelement) | The SVGMaskElement interface corresponds to the ‘mask’ element. |
| [`SVGMetadataElement`](/svg/python-net/aspose.svg/svgmetadataelement) | The SVGMetadataElement interface corresponds to the ‘metadata’ element. |
| [`SVGPathElement`](/svg/python-net/aspose.svg/svgpathelement) | The SVGPathElement interface corresponds to the ‘path’ element. |
| [`SVGPatternElement`](/svg/python-net/aspose.svg/svgpatternelement) | The SVGPatternElement interface corresponds to the ‘pattern’ element. |
| [`SVGPolygonElement`](/svg/python-net/aspose.svg/svgpolygonelement) | The SVGPolygonElement interface corresponds to the ‘polygon’ element. |
| [`SVGPolylineElement`](/svg/python-net/aspose.svg/svgpolylineelement) | The SVGPolylineElement interface corresponds to the ‘polyline’ element. |
| [`SVGRadialGradientElement`](/svg/python-net/aspose.svg/svgradialgradientelement) | The SVGRadialGradientElement interface corresponds to the ‘radialGradient’ element. |
| [`SVGRectElement`](/svg/python-net/aspose.svg/svgrectelement) | The SVGRectElement interface corresponds to the ‘rect’ element. |
| [`SVGSVGElement`](/svg/python-net/aspose.svg/svgsvgelement) | A key interface definition is the SVGSVGElement interface, which is the interface that corresponds to the ‘svg’ element. This interface contains various miscellaneous commonly-used utility methods, such as matrix operations and the ability to control the time of redraw on visual rendering devices. |
| [`SVGScriptElement`](/svg/python-net/aspose.svg/svgscriptelement) | The SVGScriptElement interface corresponds to the ‘script’ element. |
| [`SVGSetElement`](/svg/python-net/aspose.svg/svgsetelement) | The SVGSetElement interface corresponds to the ‘set’ element.<br/>Object-oriented access to the attributes of the ‘set’ element via the SVG DOM is not available. |
| [`SVGStopElement`](/svg/python-net/aspose.svg/svgstopelement) | The SVGStopElement interface corresponds to the ‘stop’ element. |
| [`SVGStyleElement`](/svg/python-net/aspose.svg/svgstyleelement) | The SVGStyleElement interface corresponds to the ‘style’ element. |
| [`SVGSwitchElement`](/svg/python-net/aspose.svg/svgswitchelement) | The SVGSwitchElement interface corresponds to the ‘switch’ element. |
| [`SVGSymbolElement`](/svg/python-net/aspose.svg/svgsymbolelement) | The SVGSymbolElement interface corresponds to the ‘symbol’ element. |
| [`SVGTSpanElement`](/svg/python-net/aspose.svg/svgtspanelement) | The SVGTSpanElement interface corresponds to the ‘tspan’ element. |
| [`SVGTextContentElement`](/svg/python-net/aspose.svg/svgtextcontentelement) | The SVGTextContentElement is inherited by various text-related interfaces, such as SVGTextElement, SVGTSpanElement, SVGTRefElement, SVGAltGlyphElement and SVGTextPathElement.<br/>For the methods on this interface that refer to an index to a character or a number of characters, these references are to be interpreted as an index to a UTF-16 code unit or a number of UTF-16 code units, respectively. This is for consistency with DOM Level 2 Core, where methods on the CharacterData interface use UTF-16 code units as indexes and counts within the character data.Thus for example, if the text content of a ‘text’ element is a single non-BMP character, such as U+10000, then invoking getNumberOfChars on that element will return 2 since there are two UTF-16 code units(the surrogate pair) used to represent that one character. |
| [`SVGTextElement`](/svg/python-net/aspose.svg/svgtextelement) | The SVGTextElement interface corresponds to the ‘text’ element. |
| [`SVGTextPathElement`](/svg/python-net/aspose.svg/svgtextpathelement) | The SVGTextPathElement interface corresponds to the ‘textPath’ element. |
| [`SVGTextPositioningElement`](/svg/python-net/aspose.svg/svgtextpositioningelement) | The SVGTextPositioningElement interface is inherited by text-related interfaces: SVGTextElement, SVGTSpanElement, SVGTRefElement and SVGAltGlyphElement. |
| [`SVGTitleElement`](/svg/python-net/aspose.svg/svgtitleelement) | The SVGTitleElement interface corresponds to the ‘title’ element. |
| [`SVGUseElement`](/svg/python-net/aspose.svg/svguseelement) | The SVGUseElement interface corresponds to the ‘use’ element. |
| [`SVGViewElement`](/svg/python-net/aspose.svg/svgviewelement) | The SVGViewElement interface corresponds to the ‘view’ element. |
| [`TypedArray`](/svg/python-net/aspose.svg/typedarray) | TypedArray objects present an array-like view of an underlying binary data buffer. |
| [`Uint8ClampedArray`](/svg/python-net/aspose.svg/uint8clampedarray) | Represents an array of 8-bit unsigned integers clamped to 0-255; if you specified a value that is out of the range of [0,255], 0 or 255 will be set instead; |
| [`Url`](/svg/python-net/aspose.svg/url) | Provides an object representation of a universal identifier (URL). |


### Enumerations
| Enumeration | Description |
| :- | :- |
| [`SVGRenderingIntent`](/svg/python-net/aspose.svg/svgrenderingintent) | The SVGRenderingIntent enumeration defines the enumerated list of possible values for ‘rendering-intent’ attributes or descriptors. |
| [`SVGUnitTypes`](/svg/python-net/aspose.svg/svgunittypes) | The SVGUnitTypes enumeration defines a commonly used set of constants and is a base interface used by SVGGradientElement, SVGPatternElement, SVGClipPathElement, SVGMaskElement and SVGFilterElement. |
| [`SVGZoomAndPan`](/svg/python-net/aspose.svg/svgzoomandpan) | The SVGZoomAndPan enumeration defines attribute zoomAndPan and associated constants. |
| [`Sandbox`](/svg/python-net/aspose.svg/sandbox) | A sandboxing flag set is a set of zero or more of the following flags, which are used to restrict the abilities that potentially untrusted resources. |


