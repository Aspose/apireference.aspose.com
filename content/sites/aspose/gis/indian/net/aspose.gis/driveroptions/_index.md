---
title: Class DriverOptions
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.DriverOptions कक्ष. के लए वकल्प aDriver .
type: docs
weight: 100
url: /hi/net/aspose.gis/driveroptions/
---
## DriverOptions class

के लिए विकल्प a[`Driver`](../driver/) .

```csharp
public abstract class DriverOptions
```

## गुण

| नाम | विवरण |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | निर्धारित करता है कि बंद है या नहींLinearRing प्रत्येक ज्यामिति में। करने के लिए चूक`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | निर्धारित करता है कि ज्यामिति के प्रत्येक खंड के बीच में एक नया बिंदु जोड़ें या नहीं। करने के लिए चूक`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | निर्धारित करता है कि प्रत्येक ज्यामिति में निकट बिंदु हटाएं या नहीं। करने के लिए चूक`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | के लिए दूरी निर्धारित करता है[`DeleteNearPoints`](./deletenearpoints/) . करने के लिए चूक`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | वक्र ज्यामिति को रैखिक करने के लिए उपयोग करने के लिए एक सहिष्णुता। |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | ए[`PrecisionModel`](../precisionmodel/) जो M निर्देशांक पर लागू किया जाएगा जब ज्यामिति को इसमें जोड़ा जाएगा[`VectorLayer`](../vectorlayer/) या जब वे से पढ़ा जाता है[`VectorLayer`](../vectorlayer/) . डिफ़ॉल्ट मान है[`Exact`](../precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | निर्धारित करता है कि प्रत्येक ज्यामिति में एक ही खंड पर स्थित बिंदुओं को हटाएं या नहीं। करने के लिए चूक`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | के लिए दूरी निर्धारित करता है[`SimplifySegments`](./simplifysegments/) . करने के लिए चूक`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | यह निर्धारित करता है कि क्या ज्यामिति को परत में जोड़े जाने पर मान्य किया जाना चाहिए। यदि पर सेट किया गया है`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) प्रत्येक ज्यामिति के लिए कहा जाता है जब इसे परत में जोड़ा जाता है, और यदि सत्यापन विफल हो जाता है ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) है`false` ),[`GisException`](../gisexception/) फेंक दिया जाता है। |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | यह निर्धारित करता है कि बहुभुज या बहुबहुभुज को लिनेस्ट्रिंग में बदलने की अनुमति है या नहीं। करने के लिए चूक`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | ए[`PrecisionModel`](../precisionmodel/) जो X और Y निर्देशांकों पर लागू होगा, जब ज्यामिति को इसमें जोड़ा जाएगा[`VectorLayer`](../vectorlayer/) या जब वे से पढ़ा जाता है[`VectorLayer`](../vectorlayer/) . डिफ़ॉल्ट मान है[`Exact`](../precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | ए[`PrecisionModel`](../precisionmodel/) जो Z निर्देशांक पर तब लागू होगा जब ज्यामिति को इसमें जोड़ा जाएगा[`VectorLayer`](../vectorlayer/) या जब वे से पढ़ा जाता है[`VectorLayer`](../vectorlayer/) . डिफ़ॉल्ट मान है[`Exact`](../precisionmodel/exact/) . |

### यह सभी देखें

* नाम स्थान [Aspose.Gis](../../aspose.gis/)
* सभा [Aspose.GIS](../../)


