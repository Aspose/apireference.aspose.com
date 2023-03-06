---
title: Class GpxOptions
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.Formats.Gpx.GpxOptions कक्ष. जपएक्स प्ररूप के लए ड्रइवरवशष्ट वकल्प
type: docs
weight: 370
url: /hi/net/aspose.gis.formats.gpx/gpxoptions/
---
## GpxOptions class

जीपीएक्स प्रारूप के लिए ड्राइवर-विशिष्ट विकल्प।

```csharp
public class GpxOptions : DriverOptions
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [GpxOptions](gpxoptions/)() | नया उदाहरण बनाएं। |

## गुण

| नाम | विवरण |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | निर्धारित करता है कि बंद है या नहींLinearRing प्रत्येक ज्यामिति में। करने के लिए चूक`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | निर्धारित करता है कि ज्यामिति के प्रत्येक खंड के बीच में एक नया बिंदु जोड़ें या नहीं। करने के लिए चूक`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | निर्धारित करता है कि प्रत्येक ज्यामिति में निकट बिंदु हटाएं या नहीं। करने के लिए चूक`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | के लिए दूरी निर्धारित करता है[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . करने के लिए चूक`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | वक्र ज्यामिति को रैखिक करने के लिए उपयोग करने के लिए एक सहिष्णुता। |
| [MAttribute](../../aspose.gis.formats.gpx/gpxoptions/mattribute/) { get; set; } | निर्धारित करता है कि किस GPX विशेषता को वेपॉइंट, रूट पॉइंट और ट्रैक पॉइंट के 'M' निर्देशांक के रूप में निर्यात किया जाएगा. व्यवहार इसके साथ समान है[`ZAttribute`](./zattribute/) , डिफॉल्ट करता है`null` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | ए[`PrecisionModel`](../../aspose.gis/precisionmodel/) जो M निर्देशांक पर लागू किया जाएगा जब ज्यामिति को इसमें जोड़ा जाएगा[`VectorLayer`](../../aspose.gis/vectorlayer/) या जब वे से पढ़ा जाता है[`VectorLayer`](../../aspose.gis/vectorlayer/) . डिफ़ॉल्ट मान है[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedAttributeSeparator](../../aspose.gis.formats.gpx/gpxoptions/nestedattributeseparator/) { get; } | नेस्टेड एट्रिब्यूट नाम और उसके इंडेक्स को अलग करने के लिए एक स्ट्रिंग। डिफ़ॉल्ट डबल अंडरस्कोर "__". |
| [ReadNestedAttributes](../../aspose.gis.formats.gpx/gpxoptions/readnestedattributes/) { get; set; } | यह निर्धारित करता है कि क्या GPX अंक, जैसे 'trkpt' और 'rtept' में आंतरिक विशेषताएँ हैं और क्या इसे पढ़ा जाना चाहिए। करने के लिए चूक`false` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | निर्धारित करता है कि प्रत्येक ज्यामिति में एक ही खंड पर स्थित बिंदुओं को हटाएं या नहीं। करने के लिए चूक`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | के लिए दूरी निर्धारित करता है[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . करने के लिए चूक`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | यह निर्धारित करता है कि क्या ज्यामिति को परत में जोड़े जाने पर मान्य किया जाना चाहिए। यदि पर सेट किया गया है`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) प्रत्येक ज्यामिति के लिए कहा जाता है जब इसे परत में जोड़ा जाता है, और यदि सत्यापन विफल हो जाता है ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) है`false` ),[`GisException`](../../aspose.gis/gisexception/) फेंक दिया जाता है। |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | यह निर्धारित करता है कि बहुभुज या बहुबहुभुज को लिनेस्ट्रिंग में बदलने की अनुमति है या नहीं। करने के लिए चूक`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | ए[`PrecisionModel`](../../aspose.gis/precisionmodel/) जो X और Y निर्देशांकों पर लागू होगा, जब ज्यामिति को इसमें जोड़ा जाएगा[`VectorLayer`](../../aspose.gis/vectorlayer/) या जब वे से पढ़ा जाता है[`VectorLayer`](../../aspose.gis/vectorlayer/) . डिफ़ॉल्ट मान है[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZAttribute](../../aspose.gis.formats.gpx/gpxoptions/zattribute/) { get; set; } | निर्धारित करता है कि किस GPX विशेषता को वेपॉइंट, रूट पॉइंट और ट्रैक पॉइंट के 'Z' निर्देशांक के रूप में निर्यात किया जाएगा. यदि`null` कोई विशेषता 'Z' निर्देशांक के रूप में निर्यात नहीं की जाएगी। ) |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | ए[`PrecisionModel`](../../aspose.gis/precisionmodel/) जो Z निर्देशांक पर तब लागू होगा जब ज्यामिति को इसमें जोड़ा जाएगा[`VectorLayer`](../../aspose.gis/vectorlayer/) या जब वे से पढ़ा जाता है[`VectorLayer`](../../aspose.gis/vectorlayer/) . डिफ़ॉल्ट मान है[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### यह सभी देखें

* class [DriverOptions](../../aspose.gis/driveroptions/)
* नाम स्थान [Aspose.Gis.Formats.Gpx](../../aspose.gis.formats.gpx/)
* सभा [Aspose.GIS](../../)


