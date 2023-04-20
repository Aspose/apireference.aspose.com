---
title: Class SplinePathBuilder
second_title: .NET API संदर्भ के लिए Aspose.SVG
description: Aspose.Svg.ImageVectorization.SplinePathBuilder कक्ष. दSplinePathBuilder पथ खंड बनने के लए वर्ग जम्मेदर हैSVGPathSeg ट्रेस पइंट्स क सूच से. यह पथ बल्डर कैटमुलरम स्पलइन क स्मूथ और कम पथ बंदुओं के सेट पर लगू करने पर आधरत है..
type: docs
weight: 2160
url: /hi/net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

द`SplinePathBuilder` पथ खंड बनाने के लिए वर्ग जिम्मेदार है[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) ट्रेस पॉइंट्स की सूची से. यह पाथ बिल्डर कैटमुल-रोमा स्पलाइन को स्मूथ और कम पथ बिंदुओं के सेट पर लागू करने पर आधारित है..

```csharp
public class SplinePathBuilder : IPathBuilder
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | का एक नया उदाहरण प्रारंभ करता है`SplinePathBuilder` वर्ग. |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(float) | का एक नया उदाहरण प्रारंभ करता है`SplinePathBuilder` वर्ग. |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(IImageTraceSmoother, IImageTraceSimplifier, float) | का एक नया उदाहरण प्रारंभ करता है`SplinePathBuilder` वर्ग. |

## गुण

| नाम | विवरण |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | तनाव का मान इस बात को प्रभावित करता है कि वक्र (प्रक्षेपित) नियंत्रण बिंदुओं पर कितनी तेजी से झुकता है। यह 0 से 1 की सीमा में होना चाहिए। किसी भी उच्च या निम्न मान को इस सीमा के न्यूनतम और अधिकतम मूल्यों के साथ संरेखित किया जाएगा, तदनुसार. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | ट्रेस सरलीकरण प्राप्त या सेट करता है। |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | ट्रेस को आसान बनाता है या सेट करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | ट्रेस बिंदुओं की सूची से पथ खंड बनाता है। |

### यह सभी देखें

* interface [IPathBuilder](../ipathbuilder/)
* नाम स्थान [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* सभा [Aspose.SVG](../../)


