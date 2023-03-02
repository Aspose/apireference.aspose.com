---
title: Class RasterLayer
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.Raster.RasterLayer कक्ष. रेखपुंज परत क प्रतनधत्व करत है
type: docs
weight: 1390
url: /hi/net/aspose.gis.raster/rasterlayer/
---
## RasterLayer class

रेखापुंज परत का प्रतिनिधित्व करता है।

```csharp
public abstract class RasterLayer : IDisposable
```

## गुण

| नाम | विवरण |
| --- | --- |
| abstract [BandCount](../../aspose.gis.raster/rasterlayer/bandcount/) { get; } | रास्टर परत में बैंड की संख्या प्राप्त करता है। |
| [Bounds](../../aspose.gis.raster/rasterlayer/bounds/) { get; } | रेखापुंज सीमा प्राप्त करता है। |
| abstract [CellSize](../../aspose.gis.raster/rasterlayer/cellsize/) { get; } | रास्टर का सेल या पिक्सेल आकार प्राप्त करता है। |
| abstract [Driver](../../aspose.gis.raster/rasterlayer/driver/) { get; } | हो जाता है[`Driver`](./driver/) जिसने इस परत को तत्काल बनाया। |
| abstract [Height](../../aspose.gis.raster/rasterlayer/height/) { get; } | रास्टर की ऊंचाई पिक्सेल में प्राप्त करता है। इसे पंक्तियों की गिनती के रूप में भी जाना जाता है। |
| abstract [NoDataValues](../../aspose.gis.raster/rasterlayer/nodatavalues/) { get; } | उन मानों को प्राप्त करता है जो रेखापुंज की पृष्ठभूमि या 'कोई डेटा नहीं' का प्रतिनिधित्व करते हैं। |
| abstract [SpatialReferenceSystem](../../aspose.gis.raster/rasterlayer/spatialreferencesystem/) { get; } | रेखापुंज का एक स्थानिक संदर्भ प्रणाली प्राप्त करता है। हो सकता है`null` अगर यह अज्ञात है. |
| abstract [UpperLeftX](../../aspose.gis.raster/rasterlayer/upperleftx/) { get; } | रेखापुंज के ऊपरी बाएँ कोने का x-निर्देशांक प्राप्त करता है। |
| abstract [UpperLeftY](../../aspose.gis.raster/rasterlayer/upperlefty/) { get; } | रेखापुंज के ऊपरी बाएँ कोने का y-निर्देशांक प्राप्त करता है। |
| abstract [Width](../../aspose.gis.raster/rasterlayer/width/) { get; } | रास्टर की चौड़ाई पिक्सेल में प्राप्त करता है। इसे कॉलम काउंट के रूप में भी जाना जाता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop_1)(double[]) | बैंड मास्क का उपयोग करके रेखापुंज परत को काटता है). |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop)(IGeometry, double[]) | रेखापुंज परत को आकार रूप (और बैंड मास्क) का उपयोग करके काटता है। |
| [Dispose](../../aspose.gis.raster/rasterlayer/dispose/)() | द्वारा उपयोग किए गए संसाधनों को जारी करता है`RasterLayer` . |
| abstract [GetBand](../../aspose.gis.raster/rasterlayer/getband/)(int) | निर्दिष्ट इंडेक्स द्वारा एक बैंड प्राप्त करता है। |
| virtual [GetExtent](../../aspose.gis.raster/rasterlayer/getextent/)() | इस परत की स्थानिक सीमा की गणना करता है। |
| [GetSpatialPoint](../../aspose.gis.raster/rasterlayer/getspatialpoint/)(int, int) | निर्दिष्ट स्तंभ और पंक्ति को स्थानिक निर्देशांक में परिवर्तित करता है। |
| [GetStatistics](../../aspose.gis.raster/rasterlayer/getstatistics/)(int, bool) | गिनती, योग, माध्य, न्यूनतम, अधिकतम. से मिलकर सारांश आँकड़ों की गणना करें |
| [GetValues](../../aspose.gis.raster/rasterlayer/getvalues/)(int, int) | निर्दिष्ट सेल में मान पढ़ता है। |
| [GetValuesDump](../../aspose.gis.raster/rasterlayer/getvaluesdump/)(RasterRect) | निर्दिष्ट ब्लॉक में मानों को 1-आयाम सरणी के रूप में पढ़ता है। |
| [GetValuesOnExpression](../../aspose.gis.raster/rasterlayer/getvaluesonexpression/)(RasterRect, RasterReadExpression) | एक एक्सप्रेशन में बैंड वैल्यू को पढ़ता है और प्रोसेस करता है। |
| override [ToString](../../aspose.gis.raster/rasterlayer/tostring/)() | एक स्ट्रिंग रिटर्न जो मौजूदा वस्तु का प्रतिनिधित्व करता है। |
| [Warp](../../aspose.gis.raster/rasterlayer/warp/)(WarpOptions) | रेखापुंज परत को दूसरी परत में बदल देता है। |

### यह सभी देखें

* नाम स्थान [Aspose.Gis.Raster](../../aspose.gis.raster/)
* सभा [Aspose.GIS](../../)


