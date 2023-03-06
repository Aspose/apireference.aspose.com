---
title: Class LinearRing
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.Geometries.LinearRing कक्ष. एLinearRing एक हैLineString वह बंद और सरल दनं है
type: docs
weight: 1130
url: /hi/net/aspose.gis.geometries/linearring/
---
## LinearRing class

ए`LinearRing` एक है[`LineString`](../linestring/) वह बंद और सरल दोनों है।

```csharp
public class LinearRing : LineString, ILinearRing
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [LinearRing](linearring/#constructor)() | का एक नया उदाहरण प्रारंभ करता है`LinearRing` वर्ग. |
| [LinearRing](linearring/#constructor_2)(IEnumerable&lt;IPoint&gt;) | का एक नया उदाहरण प्रारंभ करता है`LinearRing` वर्ग. |
| [LinearRing](linearring/#constructor_1)(ILineString) | का एक नया उदाहरण प्रारंभ करता है`LinearRing` वर्ग. |

## गुण

| नाम | विवरण |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | इसके लिए निर्देशांक आयामों की संख्या प्राप्त करता है[`Geometry`](../geometry/) . |
| [Count](../../aspose.gis.geometries/linestring/count/) { get; } | में अंकों की संख्या प्राप्त करता है[`LineString`](../linestring/) . |
| [Dimension](../../aspose.gis.geometries/curve/dimension/) { get; } | इसका सामयिक आयाम प्राप्त करता है[`Geometry`](../geometry/) . |
| override [EndPoint](../../aspose.gis.geometries/linestring/endpoint/) { get; } | वक्र के अंत बिंदु की एक प्रति लौटाता है। |
| override [GeometryType](../../aspose.gis.geometries/linearring/geometrytype/) { get; } | ज्यामिति का प्रकार प्राप्त करता है। |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | एक मान प्राप्त करता है जो इंगित करता है कि यह ज्यामिति वक्र है या इसमें वक्र (रैखिक नहीं) ज्यामिति है। |
| [HasM](../../aspose.gis.geometries/linestring/hasm/) { get; set; } | एक मान प्राप्त करता है जो इंगित करता है कि इस उदाहरण में एम समन्वय है या नहीं। |
| [HasZ](../../aspose.gis.geometries/linestring/hasz/) { get; set; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या इस उदाहरण में Z निर्देशांक है। |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed/) { get; } | एक वक्र बंद है या नहीं यह इंगित करने वाला मान प्राप्त करता है। एक वक्र बंद हो जाता है यदि इसका प्रारंभ बिंदु इसके अंत बिंदु के बराबर है। |
| override [IsEmpty](../../aspose.gis.geometries/linestring/isempty/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि यह उदाहरण खाली है या नहीं। |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या यह उदाहरण SFA के दृष्टिकोण से सरल है। |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि यह उदाहरण मान्य है या नहीं। |
| [Item](../../aspose.gis.geometries/linestring/item/) { get; set; } | हो जाता है या सेट करता है[`IPoint`](../ipoint/) निर्दिष्ट सूचकांक पर। |
| [SpatialReferenceSystem](../../aspose.gis.geometries/linestring/spatialreferencesystem/) { get; set; } | इस उदाहरण का SpatialReferenceSystem प्राप्त करता है। यह गुण हो सकता है`null` , यदि SpatialReferenceSystem अनसेट है। नया SpatialReferenceSystem असाइन करने से कोई समन्वय परिवर्तन नहीं होगा, केवल संदर्भ बदल जाएगा। |
| override [StartPoint](../../aspose.gis.geometries/linestring/startpoint/) { get; } | वक्र के शुरुआती बिंदु की एक प्रति लौटाता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/)(IPoint) | पंक्ति के अंत में एक बिंदु जोड़ता है। |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/)(double, double) | पंक्ति के अंत में एक बिंदु जोड़ता है। |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/)(double, double, double) | पंक्ति के अंत में एक बिंदु जोड़ता है। |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/)(double, double, double, double) | पंक्ति के अंत में एक बिंदु जोड़ता है। |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | इस ज्यामिति को इसके प्रसिद्ध बाइनरी प्रतिनिधित्व में अनुवादित करता है। |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | इस ज्यामिति को इसके प्रसिद्ध बाइनरी प्रतिनिधित्व में अनुवादित करता है। |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | इस ज्यामिति को छवि प्रतिनिधित्व में निर्यात करें। |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | इस ज्यामिति को छवि प्रतिनिधित्व में निर्यात करें। |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | इस ज्यामिति को छवि प्रतिनिधित्व में निर्यात करें। |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | इस ज्योमेट्री को इसके जाने-माने टेक्स्ट रिप्रेजेंटेशन में ट्रांसलेट करता है। |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | इस ज्योमेट्री को इसके जाने-माने टेक्स्ट रिप्रेजेंटेशन में ट्रांसलेट करता है। |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | इस ज्योमेट्री को इसके जाने-माने टेक्स्ट रिप्रेजेंटेशन में ट्रांसलेट करता है। |
| override [Clone](../../aspose.gis.geometries/linearring/clone/)() | इस उदाहरण को क्लोन करता है। |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | निर्धारित करता है कि क्या यह ज्यामिति निर्दिष्ट ज्यामिति द्वारा कवर की गई है। |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | निर्धारित करता है कि यह ज्यामिति निर्दिष्ट ज्यामिति को कवर करती है या नहीं। |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | निर्धारित करता है कि क्या यह ज्यामिति और एक निर्दिष्ट ज्यामिति क्रॉस. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | निर्दिष्ट ज्यामिति को इस ज्यामिति से घटाता है। |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | निर्धारित करता है कि क्या यह ज्यामिति निर्दिष्ट ज्यामिति से अलग है। |
| [Equals](../../aspose.gis.geometries/linestring/equals/)(ILineString) | इंगित करता है कि क्या वर्तमान वस्तु उसी प्रकार की दूसरी वस्तु के बराबर है। |
| override [Equals](../../aspose.gis.geometries/linestring/equals/)(object) | निर्धारित करता है कि निर्दिष्ट वस्तु वर्तमान वस्तु के बराबर है या नहीं। |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | इस ज्यामिति के क्षेत्रफल की गणना करता है। |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | इस ज्यामिति के आसपास एक बफर क्षेत्र की गणना करता है। |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | इस ज्यामिति के केन्द्रक की गणना करता है। |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | इस ज्यामिति के उत्तल पतवार की गणना करता है। |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | इस ज्यामिति और निर्दिष्ट ज्यामिति के बीच न्यूनतम दूरी की गणना करता है। |
| [GetEnumerator](../../aspose.gis.geometries/linestring/getenumerator/)() | एक एन्यूमरेटर लौटाता है जो संग्रह के माध्यम से पुनरावृति करता है। |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | गणना करता है और इस ज्यामिति की सीमा सीमा देता है। |
| override [GetHashCode](../../aspose.gis.geometries/linestring/gethashcode/)() | डिफ़ॉल्ट हैश फ़ंक्शन के रूप में कार्य करता है। |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | इस ज्यामिति की लंबाई की गणना करता है। |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | इस ज्यामिति और निर्दिष्ट ज्यामिति के बीच एक इंटरसेक्शन बनाता है. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | निर्धारित करता है कि क्या यह ज्यामिति निर्दिष्ट सीमा को काटती है। |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | निर्धारित करता है कि क्या यह ज्यामिति और एक निर्दिष्ट ज्यामिति प्रतिच्छेद करती है। |
| [IsClockwise](../../aspose.gis.geometries/linearring/isclockwise/)() | निर्धारित करता है कि क्या रिंग में क्लॉकवाइज वाइंडिंग है। |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | निर्धारित करता है कि क्या यह ज्यामिति निर्दिष्ट ज्यामिति के साथ ओवरलैप होती है। |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | निर्धारित करता है कि क्या इस ज्यामिति का DE-9IM प्रतिच्छेदन मैट्रिक्स और निर्दिष्ट ज्यामिति प्रदान किए गए पैटर्न से मेल खाता है। |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | बहुभुज को इस ज्यामिति की रेखाओं के रूप में प्रदर्शित करता है। |
| override [Reverse](../../aspose.gis.geometries/linestring/reverse/)() | इसमें अंकों के क्रम को उलट देता है[`LineString`](../linestring/) . |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | राउंड एम भिन्नात्मक अंकों की एक निर्दिष्ट संख्या के लिए समन्वय करता है। |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | राउंड X और Y भिन्नात्मक अंकों की एक निर्दिष्ट संख्या के लिए समन्वय करता है। |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | राउंड Z आंशिक अंकों की एक निर्दिष्ट संख्या के लिए समन्वय करता है। |
| override [SetEmpty](../../aspose.gis.geometries/linestring/setempty/)() | इसे बनाता है[`Geometry`](../geometry/) खाली. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | निर्धारित करता है कि क्या इस ज्यामिति में स्थानिक रूप से निर्दिष्ट ज्यामिति है। |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | निर्धारित करता है कि क्या यह ज्यामिति स्थानिक रूप से निर्दिष्ट ज्यामिति के बराबर है। |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | इस ज्यामिति और निर्दिष्ट ज्यामिति के बीच एक सममित अंतर बनाता है। |
| [ToEditable](../../aspose.gis.geometries/linearring/toeditable/#toeditable_2)() | इस ज्यामिति की एक संपादन योग्य प्रति प्राप्त करता है। (4 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | इस ज्यामिति की एक संपादन योग्य प्रति प्राप्त करता है। |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)() | डिफ़ॉल्ट का उपयोग करके इस ज्यामिति का अनुमानित या समतुल्य गैर-वक्र संस्करण प्राप्त करता है`सहनशीलता` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)(double) | निर्दिष्ट का उपयोग करके इस ज्यामिति का अनुमानित या समकक्ष गैर-वक्र संस्करण प्राप्त करता है`सहनशीलता` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | एक स्ट्रिंग रिटर्न जो मौजूदा वस्तु का प्रतिनिधित्व करता है। |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | निर्धारित करता है कि क्या यह ज्यामिति और निर्दिष्ट ज्यामिति स्पर्श करते हैं. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | इस ज्यामिति और निर्दिष्ट ज्यामिति को जोड़ता है। |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | निर्धारित करता है कि यह ज्यामिति निर्दिष्ट सीमा के भीतर है या नहीं। |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | निर्धारित करता है कि क्या यह ज्यामिति निर्दिष्ट ज्यामिति के भीतर है। |

### यह सभी देखें

* class [LineString](../linestring/)
* interface [ILinearRing](../ilinearring/)
* नाम स्थान [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* सभा [Aspose.GIS](../../)


