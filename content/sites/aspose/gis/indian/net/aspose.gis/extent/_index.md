---
title: Class Extent
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.Extent कक्ष. एक द्वआयम स्थनक बउंडंग बक्स
type: docs
weight: 120
url: /hi/net/aspose.gis/extent/
---
## Extent class

एक द्वि-आयामी स्थानिक बाउंडिंग बॉक्स।

```csharp
public class Extent : IEquatable<Extent>
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Extent](extent/#constructor)() | नया उदाहरण बनाता है। |
| [Extent](extent/#constructor_1)(SpatialReferenceSystem) | नया उदाहरण बनाता है। |
| [Extent](extent/#constructor_2)(double, double, double, double, SpatialReferenceSystem) | नया उदाहरण बनाता है। |

## गुण

| नाम | विवरण |
| --- | --- |
| [Center](../../aspose.gis/extent/center/) { get; } | हद का केंद्र। |
| [Height](../../aspose.gis/extent/height/) { get; } | हद की ऊंचाई। |
| [IsValid](../../aspose.gis/extent/isvalid/) { get; } | यह निर्धारित करता है कि क्या यह`Extent` मान्य है. |
| [SpatialReferenceSystem](../../aspose.gis/extent/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) इस सीमा से संबद्ध. हो सकता है`null` अगर[`SpatialReferenceSystem`](./spatialreferencesystem/) अज्ञात है। उपयोग करें[`GetTransformed`](./gettransformed/) अंतर स्थानिक संदर्भ प्रणालियों के बीच सीमा को बदलने के लिए। |
| [Width](../../aspose.gis/extent/width/) { get; } | हद की चौड़ाई। |
| [XMax](../../aspose.gis/extent/xmax/) { get; set; } | एक्स समन्वय का अधिकतम मूल्य। |
| [XMin](../../aspose.gis/extent/xmin/) { get; set; } | एक्स समन्वय का न्यूनतम मूल्य। |
| [YMax](../../aspose.gis/extent/ymax/) { get; set; } | वाई समन्वय का अधिकतम मूल्य। |
| [YMin](../../aspose.gis/extent/ymin/) { get; set; } | Y निर्देशांक का न्यूनतम मूल्य। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Clone](../../aspose.gis/extent/clone/)() | इस उदाहरण को क्लोन करता है। |
| [Contains](../../aspose.gis/extent/contains/#contains)(Extent) | निर्धारित करता है कि क्या इस सीमा में तर्क शामिल है। |
| [Contains](../../aspose.gis/extent/contains/#contains_1)(IGeometry) | निर्धारित करता है कि क्या इस सीमा में तर्क शामिल है। |
| [Contains](../../aspose.gis/extent/contains/#contains_2)(double, double) | निर्धारित करता है कि क्या इस सीमा में तर्कों द्वारा परिभाषित एक समन्वय है। |
| [Equals](../../aspose.gis/extent/equals/#equals)(Extent) | इंगित करता है कि क्या वर्तमान वस्तु उसी प्रकार की दूसरी वस्तु के बराबर है। |
| override [Equals](../../aspose.gis/extent/equals/#equals_1)(object) | निर्धारित करता है कि निर्दिष्ट वस्तु वर्तमान वस्तु के बराबर है या नहीं। |
| override [GetHashCode](../../aspose.gis/extent/gethashcode/)() | डिफ़ॉल्ट हैश फ़ंक्शन के रूप में कार्य करता है। |
| [GetTransformed](../../aspose.gis/extent/gettransformed/)(SpatialReferenceSystem) | निर्दिष्ट में नई सीमा देता है[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) जिसमें यह सीमा शामिल है। |
| [Grow](../../aspose.gis/extent/grow/#grow)(Extent) | इस हद तक बढ़ता है इसलिए इसमें तर्क शामिल है। |
| [Grow](../../aspose.gis/extent/grow/#grow_1)(double, double) | इस हद तक बढ़ता है इसलिए इसमें निर्दिष्ट बिंदु शामिल होता है। |
| [GrowX](../../aspose.gis/extent/growx/)(double) | इस सीमा को एक्स अक्ष के साथ बढ़ाता है ताकि इसमें निर्दिष्ट मान शामिल हो। |
| [GrowY](../../aspose.gis/extent/growy/)(double) | इस सीमा को Y अक्ष के साथ बढ़ाता है ताकि इसमें निर्दिष्ट मान शामिल हो। |
| [Intersects](../../aspose.gis/extent/intersects/#intersects)(Extent) | निर्धारित करता है कि क्या यह सीमा तर्क के साथ प्रतिच्छेद करती है। |
| [Intersects](../../aspose.gis/extent/intersects/#intersects_1)(IGeometry) | निर्धारित करता है कि क्या यह सीमा तर्क के साथ प्रतिच्छेद करती है। |
| [Normalize](../../aspose.gis/extent/normalize/)() | स्वैप[`XMin`](./xmin/) साथ[`XMax`](./xmax/) अगर[`Width`](./width/) नकारात्मक है और [`YMin`](./ymin/) साथ[`YMax`](./ymax/) अगर[`Height`](./height/) नकारात्मक है। |
| [ToPolygon](../../aspose.gis/extent/topolygon/)() | इस सीमा को एक आयताकार बहुभुज में परिवर्तित करता है जो इसका प्रतिनिधित्व करता है। |
| override [ToString](../../aspose.gis/extent/tostring/)() | एक स्ट्रिंग रिटर्न जो मौजूदा वस्तु का प्रतिनिधित्व करता है। |
| [operator ==](../../aspose.gis/extent/op_equality/) | '==' ऑपरेटर लागू करता है। |
| [operator !=](../../aspose.gis/extent/op_inequality/) | '!=' ऑपरेटर लागू करता है। |

### यह सभी देखें

* नाम स्थान [Aspose.Gis](../../aspose.gis/)
* सभा [Aspose.GIS](../../)


