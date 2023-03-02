---
title: Class GeoJsonOptions
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.Formats.GeoJson.GeoJsonOptions कक्ष. जयजन प्ररूप के लए ड्रइवरवशष्ट वकल्प
type: docs
weight: 310
url: /hi/net/aspose.gis.formats.geojson/geojsonoptions/
---
## GeoJsonOptions class

जियोजॉन प्रारूप के लिए ड्राइवर-विशिष्ट विकल्प।

```csharp
public class GeoJsonOptions : DriverOptions
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [GeoJsonOptions](geojsonoptions/)() | नया उदाहरण बनाएं। |

## गुण

| नाम | विवरण |
| --- | --- |
| [ArrayAsString](../../aspose.gis.formats.geojson/geojsonoptions/arrayasstring/) { get; set; } | स्ट्रिंग्स, पूर्णांकों या वास्तविकों के JSON सरणियों को स्ट्रिंग के रूप में प्रदर्शित करना है या नहीं। |
| [AttributesSkip](../../aspose.gis.formats.geojson/geojsonoptions/attributesskip/) { get; set; } | विशेषताओं के अनुवाद को नियंत्रित करता है: हाँ - सभी विशेषताओं को छोड़ दें |
| [AutoId](../../aspose.gis.formats.geojson/geojsonoptions/autoid/) { get; set; } | आईडी स्वतः जनरेट करें |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | निर्धारित करता है कि बंद है या नहींLinearRing प्रत्येक ज्यामिति में। करने के लिए चूक`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | निर्धारित करता है कि ज्यामिति के प्रत्येक खंड के बीच में एक नया बिंदु जोड़ें या नहीं। करने के लिए चूक`false` . |
| [DateAsString](../../aspose.gis.formats.geojson/geojsonoptions/dateasstring/) { get; set; } | क्या JSON दिनांक/समय/दिनांक-समय को स्ट्रिंग के रूप में प्रकट करना है. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | निर्धारित करता है कि प्रत्येक ज्यामिति में निकट बिंदु हटाएं या नहीं। करने के लिए चूक`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | के लिए दूरी निर्धारित करता है[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . करने के लिए चूक`0` . |
| [Description](../../aspose.gis.formats.geojson/geojsonoptions/description/) { get; set; } | सुविधा संग्रह स्तर पर विवरण (परत निर्माण के लिए) |
| [GeometryAsCollection](../../aspose.gis.formats.geojson/geojsonoptions/geometryascollection/) { get; set; } | ज्यामिति का अनुवाद नियंत्रित करें: हाँ - ज्यामिति संग्रह प्रकार के साथ ज्यामिति लपेटें |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | वक्र ज्यामिति को रैखिक करने के लिए उपयोग करने के लिए एक सहिष्णुता। |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | ए[`PrecisionModel`](../../aspose.gis/precisionmodel/) जो M निर्देशांक पर लागू किया जाएगा जब ज्यामिति को इसमें जोड़ा जाएगा[`VectorLayer`](../../aspose.gis/vectorlayer/) या जब वे से पढ़ा जाता है[`VectorLayer`](../../aspose.gis/vectorlayer/) . डिफ़ॉल्ट मान है[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [Name](../../aspose.gis.formats.geojson/geojsonoptions/name/) { get; set; } | सुविधा संग्रह स्तर पर नाम (परत निर्माण के लिए) |
| [NestedPropertiesSeparator](../../aspose.gis.formats.geojson/geojsonoptions/nestedpropertiesseparator/) { get; set; } | एक स्ट्रिंग प्राप्त या सेट करता है जिसका उपयोग नेस्टेड विशेषताओं के घटकों को अलग करने के लिए किया जाता है। डिफ़ॉल्ट "_" है। |
| [ReadBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/readboundingboxes/) { get; set; } | निर्धारित करता है कि क्या बाउंडिंग बॉक्स ('बीबॉक्स') को 'bbox_0', 'bbox_1', आदि के साथ विशेषताओं के रूप में पढ़ा जाना चाहिए। डिफ़ॉल्ट मान है`false` . द[`NestedPropertiesSeparator`](./nestedpropertiesseparator/) स्ट्रिंग का उपयोग bbox_0, bbox_1,.. नाम. में किया जाता है |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | निर्धारित करता है कि प्रत्येक ज्यामिति में एक ही खंड पर स्थित बिंदुओं को हटाएं या नहीं। करने के लिए चूक`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | के लिए दूरी निर्धारित करता है[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . करने के लिए चूक`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | यह निर्धारित करता है कि क्या ज्यामिति को परत में जोड़े जाने पर मान्य किया जाना चाहिए। यदि पर सेट किया गया है`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) प्रत्येक ज्यामिति के लिए कहा जाता है जब इसे परत में जोड़ा जाता है, और यदि सत्यापन विफल हो जाता है ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) है`false` ),[`GisException`](../../aspose.gis/gisexception/) फेंक दिया जाता है। |
| [WriteBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/writeboundingboxes/) { get; set; } | निर्धारित करता है कि क्या GeoJSON ऑब्जेक्ट को इसकी ज्यामिति के लिए समन्वय श्रेणी पर जानकारी शामिल की जानी चाहिए। यदि पर सेट है`true` , एक सदस्य "bbox" प्रत्येक ज्यामिति के लिए उत्पन्न होता है (शून्य नहीं) जब इसे परत में जोड़ा जाता है। डिफ़ॉल्ट मान है`false` . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | यह निर्धारित करता है कि बहुभुज या बहुबहुभुज को लिनेस्ट्रिंग में बदलने की अनुमति है या नहीं। करने के लिए चूक`false` . |
| [WriteUnsetAttribute](../../aspose.gis.formats.geojson/geojsonoptions/writeunsetattribute/) { get; set; } | क्या 'शून्य' मान जोड़कर अनसेट विशेषताएँ लिखनी हैं |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | ए[`PrecisionModel`](../../aspose.gis/precisionmodel/) जो X और Y निर्देशांकों पर लागू होगा, जब ज्यामिति को इसमें जोड़ा जाएगा[`VectorLayer`](../../aspose.gis/vectorlayer/) या जब वे से पढ़ा जाता है[`VectorLayer`](../../aspose.gis/vectorlayer/) . डिफ़ॉल्ट मान है[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | ए[`PrecisionModel`](../../aspose.gis/precisionmodel/) जो Z निर्देशांक पर तब लागू होगा जब ज्यामिति को इसमें जोड़ा जाएगा[`VectorLayer`](../../aspose.gis/vectorlayer/) या जब वे से पढ़ा जाता है[`VectorLayer`](../../aspose.gis/vectorlayer/) . डिफ़ॉल्ट मान है[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### यह सभी देखें

* class [DriverOptions](../../aspose.gis/driveroptions/)
* नाम स्थान [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson/)
* सभा [Aspose.GIS](../../)


