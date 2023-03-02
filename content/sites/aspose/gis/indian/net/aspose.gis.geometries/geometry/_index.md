---
title: Class Geometry
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.Geometries.Geometry कक्ष. ज्यमतय पदनुक्रम क सर मूल वर्ग
type: docs
weight: 920
url: /hi/net/aspose.gis.geometries/geometry/
---
## Geometry class

ज्यामितीय पदानुक्रम का सार मूल वर्ग।

```csharp
public abstract class Geometry : IGeometry
```

## गुण

| नाम | विवरण |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | इसके लिए निर्देशांक आयामों की संख्या प्राप्त करता है`Geometry` . |
| abstract [Dimension](../../aspose.gis.geometries/geometry/dimension/) { get; } | इसका सामयिक आयाम प्राप्त करता है`Geometry` . यदि आयाम अज्ञात है (उदाहरण के लिए एक खाली GEOMETRYCOLLECTION के लिए)Point वापस आ गया है। |
| abstract [GeometryType](../../aspose.gis.geometries/geometry/geometrytype/) { get; } | ज्यामिति का प्रकार प्राप्त करता है। |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | एक मान प्राप्त करता है जो इंगित करता है कि यह ज्यामिति वक्र है या इसमें वक्र (रैखिक नहीं) ज्यामिति है। |
| virtual [HasM](../../aspose.gis.geometries/geometry/hasm/) { get; set; } | एक मान प्राप्त करता है जो इंगित करता है कि इस उदाहरण में एम समन्वय है या नहीं। |
| virtual [HasZ](../../aspose.gis.geometries/geometry/hasz/) { get; set; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या इस उदाहरण में Z निर्देशांक है। |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि यह उदाहरण खाली है या नहीं। |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या यह उदाहरण SFA के दृष्टिकोण से सरल है। |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि यह उदाहरण मान्य है या नहीं। |
| abstract [SpatialReferenceSystem](../../aspose.gis.geometries/geometry/spatialreferencesystem/) { get; set; } | इस उदाहरण का SpatialReferenceSystem प्राप्त करता है। यह गुण हो सकता है`null` , SpatialReferenceSystem अज्ञात है। नया SpatialReferenceSystem असाइन करने से कोई समन्वय परिवर्तन नहीं होगा, केवल संदर्भ बदल जाएगा। |
| static [Null](../../aspose.gis.geometries/geometry/null/) { get; } | अशक्त ज्यामिति का एक उदाहरण प्राप्त करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/#asbinary)() | इस ज्यामिति को इसके प्रसिद्ध बाइनरी प्रतिनिधित्व में अनुवादित करता है। |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/#asbinary_1)(WkbVariant) | इस ज्यामिति को इसके प्रसिद्ध बाइनरी प्रतिनिधित्व में अनुवादित करता है। |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | इस ज्यामिति को छवि प्रतिनिधित्व में निर्यात करें। |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | इस ज्यामिति को छवि प्रतिनिधित्व में निर्यात करें। |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | इस ज्यामिति को छवि प्रतिनिधित्व में निर्यात करें। |
| [AsText](../../aspose.gis.geometries/geometry/astext/#astext)() | इस ज्योमेट्री को इसके जाने-माने टेक्स्ट रिप्रेजेंटेशन में ट्रांसलेट करता है। |
| [AsText](../../aspose.gis.geometries/geometry/astext/#astext_1)(WktVariant) | इस ज्योमेट्री को इसके जाने-माने टेक्स्ट रिप्रेजेंटेशन में ट्रांसलेट करता है। |
| [AsText](../../aspose.gis.geometries/geometry/astext/#astext_2)(WktVariant, NumericFormat) | इस ज्योमेट्री को इसके जाने-माने टेक्स्ट रिप्रेजेंटेशन में ट्रांसलेट करता है। |
| abstract [Clone](../../aspose.gis.geometries/geometry/clone/)() | इस उदाहरण को क्लोन करता है। |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | निर्धारित करता है कि क्या यह ज्यामिति निर्दिष्ट ज्यामिति द्वारा कवर की गई है। |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | निर्धारित करता है कि यह ज्यामिति निर्दिष्ट ज्यामिति को कवर करती है या नहीं। |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | निर्धारित करता है कि क्या यह ज्यामिति और एक निर्दिष्ट ज्यामिति क्रॉस. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | निर्दिष्ट ज्यामिति को इस ज्यामिति से घटाता है। |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | निर्धारित करता है कि क्या यह ज्यामिति निर्दिष्ट ज्यामिति से अलग है। |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | इस ज्यामिति के क्षेत्रफल की गणना करता है। |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | इस ज्यामिति के आसपास एक बफर क्षेत्र की गणना करता है। |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | इस ज्यामिति के केन्द्रक की गणना करता है। |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | इस ज्यामिति के उत्तल पतवार की गणना करता है। |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | इस ज्यामिति और निर्दिष्ट ज्यामिति के बीच न्यूनतम दूरी की गणना करता है। |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | गणना करता है और इस ज्यामिति की सीमा सीमा देता है। |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | इस ज्यामिति की लंबाई की गणना करता है। |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | इस ज्यामिति और निर्दिष्ट ज्यामिति के बीच एक इंटरसेक्शन बनाता है. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/#intersects)(Extent) | निर्धारित करता है कि क्या यह ज्यामिति निर्दिष्ट सीमा को काटती है। |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/#intersects_1)(IGeometry) | निर्धारित करता है कि क्या यह ज्यामिति और एक निर्दिष्ट ज्यामिति प्रतिच्छेद करती है। |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | निर्धारित करता है कि क्या यह ज्यामिति निर्दिष्ट ज्यामिति के साथ ओवरलैप होती है। |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | निर्धारित करता है कि क्या इस ज्यामिति का DE-9IM प्रतिच्छेदन मैट्रिक्स और निर्दिष्ट ज्यामिति प्रदान किए गए पैटर्न से मेल खाता है। |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | बहुभुज को इस ज्यामिति की रेखाओं के रूप में प्रदर्शित करता है। |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | राउंड एम भिन्नात्मक अंकों की एक निर्दिष्ट संख्या के लिए समन्वय करता है। |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | राउंड X और Y भिन्नात्मक अंकों की एक निर्दिष्ट संख्या के लिए समन्वय करता है। |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | राउंड Z आंशिक अंकों की एक निर्दिष्ट संख्या के लिए समन्वय करता है। |
| virtual [SetEmpty](../../aspose.gis.geometries/geometry/setempty/)() | इसे बनाता है`Geometry` खाली. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | निर्धारित करता है कि क्या इस ज्यामिति में स्थानिक रूप से निर्दिष्ट ज्यामिति है। |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | निर्धारित करता है कि क्या यह ज्यामिति स्थानिक रूप से निर्दिष्ट ज्यामिति के बराबर है। |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | इस ज्यामिति और निर्दिष्ट ज्यामिति के बीच एक सममित अंतर बनाता है। |
| [ToEditable](../../aspose.gis.geometries/geometry/toeditable/#toeditable)() | इस ज्यामिति की एक संपादन योग्य प्रति प्राप्त करता है। |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/#toeditable_1)() | इस ज्यामिति की एक संपादन योग्य प्रति प्राप्त करता है। |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/#tolineargeometry)() | डिफ़ॉल्ट का उपयोग करके इस ज्यामिति का अनुमानित या समतुल्य गैर-वक्र संस्करण प्राप्त करता है`सहनशीलता` . |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/#tolineargeometry_1)(double) | निर्दिष्ट का उपयोग करके इस ज्यामिति का अनुमानित या समकक्ष गैर-वक्र संस्करण प्राप्त करता है`सहनशीलता` . |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | एक स्ट्रिंग रिटर्न जो मौजूदा वस्तु का प्रतिनिधित्व करता है। |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | निर्धारित करता है कि क्या यह ज्यामिति और निर्दिष्ट ज्यामिति स्पर्श करते हैं. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | इस ज्यामिति और निर्दिष्ट ज्यामिति को जोड़ता है। |
| [Within](../../aspose.gis.geometries/geometry/within/#within)(Extent) | निर्धारित करता है कि यह ज्यामिति निर्दिष्ट सीमा के भीतर है या नहीं। |
| [Within](../../aspose.gis.geometries/geometry/within/#within_1)(IGeometry) | निर्धारित करता है कि क्या यह ज्यामिति निर्दिष्ट ज्यामिति के भीतर है। |
| static [FromBinary](../../aspose.gis.geometries/geometry/frombinary/#frombinary)(byte[]) | अपने प्रसिद्ध बाइनरी प्रतिनिधित्व से एक ज्यामिति बनाता है। |
| static [FromBinary](../../aspose.gis.geometries/geometry/frombinary/#frombinary_1)(byte[], SpatialReferenceSystem) | अपने प्रसिद्ध बाइनरी प्रतिनिधित्व से एक ज्यामिति बनाता है। |
| static [FromText](../../aspose.gis.geometries/geometry/fromtext/#fromtext)(string) | अपने जाने-माने पाठ प्रतिनिधित्व से एक ज्यामिति बनाता है। |
| static [FromText](../../aspose.gis.geometries/geometry/fromtext/#fromtext_1)(string, SpatialReferenceSystem) | अपने जाने-माने पाठ प्रतिनिधित्व से एक ज्यामिति बनाता है। |

### यह सभी देखें

* interface [IGeometry](../igeometry/)
* नाम स्थान [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* सभा [Aspose.GIS](../../)


