---
title: Class GmlOptions
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.Formats.Gml.GmlOptions कक्ष. जएमएल प्ररूप के लए ड्रइवरवशष्ट वकल्प
type: docs
weight: 350
url: /hi/net/aspose.gis.formats.gml/gmloptions/
---
## GmlOptions class

जीएमएल प्रारूप के लिए ड्राइवर-विशिष्ट विकल्प।

```csharp
public class GmlOptions : DriverOptions
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [GmlOptions](gmloptions/)() | नया उदाहरण बनाएं। |

## गुण

| नाम | विवरण |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | निर्धारित करता है कि बंद है या नहींLinearRing प्रत्येक ज्यामिति में। करने के लिए चूक`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | निर्धारित करता है कि ज्यामिति के प्रत्येक खंड के बीच में एक नया बिंदु जोड़ें या नहीं। करने के लिए चूक`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | निर्धारित करता है कि प्रत्येक ज्यामिति में निकट बिंदु हटाएं या नहीं। करने के लिए चूक`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | के लिए दूरी निर्धारित करता है[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . करने के लिए चूक`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | वक्र ज्यामिति को रैखिक करने के लिए उपयोग करने के लिए एक सहिष्णुता। |
| [LoadSchemasFromInternet](../../aspose.gis.formats.gml/gmloptions/loadschemasfrominternet/) { get; set; } | निर्धारित करता है कि Aspose.GIS को इंटरनेट से XML स्कीमा लोड करने की अनुमति है या नहीं। यदि पर सेट है`false` निरपेक्ष URI वाले स्कीमा जो 'फ़ाइल: //' से शुरू नहीं होते हैं, लोड नहीं होंगे। डिफ़ॉल्ट है`false` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | ए[`PrecisionModel`](../../aspose.gis/precisionmodel/) जो M निर्देशांक पर लागू किया जाएगा जब ज्यामिति को इसमें जोड़ा जाएगा[`VectorLayer`](../../aspose.gis/vectorlayer/) या जब वे से पढ़ा जाता है[`VectorLayer`](../../aspose.gis/vectorlayer/) . डिफ़ॉल्ट मान है[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.gml/gmloptions/nestedpropertiesseparator/) { get; set; } | एक स्ट्रिंग प्राप्त या सेट करता है जिसका उपयोग नेस्टेड विशेषताओं के घटकों को अलग करने के लिए किया जाता है। डिफ़ॉल्ट "_" है। |
| [RestoreSchema](../../aspose.gis.formats.gml/gmloptions/restoreschema/) { get; set; } | निर्धारित करता है कि क्या Aspose.GIS को Gml फ़ाइल में विशेषताओं को पार्स करने की अनुमति है जिसमें एक XML स्कीमा गायब है या लोड नहीं किया जा सकता है। यदि पर सेट है`true` , Aspose.GIS रीडर को XML स्कीमा की उपस्थिति की आवश्यकता नहीं है। डिफ़ॉल्ट है`false` . |
| [SchemaLocation](../../aspose.gis.formats.gml/gmloptions/schemalocation/) { get; set; } | अंतरिक्ष से अलग यूआरआई जोड़े की सूची। प्रत्येक जोड़ी में पहला यूआरआई नेमस्पेस का यूआरआई है, दूसरा यूआरआई नेमस्पेस के एक्सएमएल स्कीमा का पथ है। यदि सेट किया गया है`null` ,[`GmlDriver`](../gmldriver/) दस्तावेज़ के मूल तत्व से स्कीमा स्थान पढ़ने का प्रयास करेगा। डिफ़ॉल्ट है`null` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | निर्धारित करता है कि प्रत्येक ज्यामिति में एक ही खंड पर स्थित बिंदुओं को हटाएं या नहीं। करने के लिए चूक`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | के लिए दूरी निर्धारित करता है[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . करने के लिए चूक`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | यह निर्धारित करता है कि क्या ज्यामिति को परत में जोड़े जाने पर मान्य किया जाना चाहिए। यदि पर सेट किया गया है`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) प्रत्येक ज्यामिति के लिए कहा जाता है जब इसे परत में जोड़ा जाता है, और यदि सत्यापन विफल हो जाता है ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) है`false` ),[`GisException`](../../aspose.gis/gisexception/) फेंक दिया जाता है। |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | यह निर्धारित करता है कि बहुभुज या बहुबहुभुज को लिनेस्ट्रिंग में बदलने की अनुमति है या नहीं। करने के लिए चूक`false` . |
| [XmlResolver](../../aspose.gis.formats.gml/gmloptions/xmlresolver/) { get; set; } | ए[`XmlResolver`](./xmlresolver/) बाहरी संसाधनों को हल करने के लिए उपयोग किया जाता है। डिफ़ॉल्ट हैXmlUrlResolver . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | ए[`PrecisionModel`](../../aspose.gis/precisionmodel/) जो X और Y निर्देशांकों पर लागू होगा, जब ज्यामिति को इसमें जोड़ा जाएगा[`VectorLayer`](../../aspose.gis/vectorlayer/) या जब वे से पढ़ा जाता है[`VectorLayer`](../../aspose.gis/vectorlayer/) . डिफ़ॉल्ट मान है[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | ए[`PrecisionModel`](../../aspose.gis/precisionmodel/) जो Z निर्देशांक पर तब लागू होगा जब ज्यामिति को इसमें जोड़ा जाएगा[`VectorLayer`](../../aspose.gis/vectorlayer/) या जब वे से पढ़ा जाता है[`VectorLayer`](../../aspose.gis/vectorlayer/) . डिफ़ॉल्ट मान है[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### यह सभी देखें

* class [DriverOptions](../../aspose.gis/driveroptions/)
* नाम स्थान [Aspose.Gis.Formats.Gml](../../aspose.gis.formats.gml/)
* सभा [Aspose.GIS](../../)


