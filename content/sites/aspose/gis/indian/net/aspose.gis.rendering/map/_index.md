---
title: Class Map
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.Rendering.Map कक्ष. मनचत्र परतं क एक संग्रह है जसे एक दूसरे के ऊपर प्रस्तुत कय ज सकत हैRenderer .
type: docs
weight: 1720
url: /hi/net/aspose.gis.rendering/map/
---
## Map class

मानचित्र परतों का एक संग्रह है जिसे एक दूसरे के ऊपर प्रस्तुत किया जा सकता है[`Renderer`](../renderer/) .

```csharp
public class Map : IDisposable, IReadOnlyList<MapLayer>
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Map](map/)(Measurement, Measurement) | का नया उदाहरण बनाता है`नक्शा` वर्ग. |

## गुण

| नाम | विवरण |
| --- | --- |
| [BackgroundColor](../../aspose.gis.rendering/map/backgroundcolor/) { get; set; } | मानचित्र की पृष्ठभूमि का रंग। करने के लिए चूकTransparent . |
| [Count](../../aspose.gis.rendering/map/count/) { get; } | मानचित्र में परतों की संख्या प्राप्त करता है। |
| [Extent](../../aspose.gis.rendering/map/extent/) { get; set; } | प्रस्तुत करने के लिए मानचित्र की सीमा निर्दिष्ट करता है। यदि सेट किया गया है`null` , सभी परतों में सभी ज्यामिति को शामिल करने के लिए रेंडरिंग के दौरान सीमा की गणना की जाती है। |
| [Height](../../aspose.gis.rendering/map/height/) { get; set; } | मानचित्र की दृश्य ऊंचाई। |
| [Item](../../aspose.gis.rendering/map/item/) { get; } | निर्दिष्ट सूचकांक पर परत प्राप्त करता है। |
| [Padding](../../aspose.gis.rendering/map/padding/) { get; set; } | हद तक जोड़ने के लिए पैडिंग निर्दिष्ट करता है। |
| [Resolution](../../aspose.gis.rendering/map/resolution/) { get; set; } | इस मानचित्र को प्रस्तुत करने और बीच में परिवर्तित करने के लिए उपयोग किया जाने वाला संकल्प[`Measurement`](../measurement/) . डिफ़ॉल्ट 96 है। |
| [SpatialReferenceSystem](../../aspose.gis.rendering/map/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](./spatialreferencesystem/) मानचित्र का। |
| [Width](../../aspose.gis.rendering/map/width/) { get; set; } | मानचित्र की दृश्य चौड़ाई। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Add](../../aspose.gis.rendering/map/add/#add)(FeaturesSequence) | बनाता है और जोड़ता है[`VectorMapLayer`](../vectormaplayer/) नक्शे के लिए। परतें अतिरिक्त क्रम में प्रदान की जाती हैं। |
| [Add](../../aspose.gis.rendering/map/add/#add_4)(MapLayer) | मानचित्र में एक परत जोड़ता है। परतें अतिरिक्त क्रम में प्रदान की जाती हैं। |
| [Add](../../aspose.gis.rendering/map/add/#add_1)(FeaturesSequence, VectorSymbolizer) | बनाता है और जोड़ता है[`VectorMapLayer`](../vectormaplayer/) नक्शे के लिए। परतें अतिरिक्त क्रम में प्रदान की जाती हैं। |
| [Add](../../aspose.gis.rendering/map/add/#add_7)(VectorLayer, bool) | एक बनाता है[`VectorMapLayer`](../vectormaplayer/) डिफ़ॉल्ट प्रतीक के साथ और इसे मानचित्र में जोड़ता है। परतें अतिरिक्त क्रम में प्रदान की जाती हैं। |
| [Add](../../aspose.gis.rendering/map/add/#add_2)(FeaturesSequence, VectorSymbolizer, Labeling) | बनाता है और जोड़ता है[`VectorMapLayer`](../vectormaplayer/) नक्शे के लिए। परतें अतिरिक्त क्रम में प्रदान की जाती हैं। |
| [Add](../../aspose.gis.rendering/map/add/#add_3)(RasterLayer, RasterColorizer, bool) | एक बनाता है[`RasterMapLayer`](../rastermaplayer/) डिफ़ॉल्ट कलराइज़र के साथ और इसे मानचित्र में जोड़ता है। |
| [Add](../../aspose.gis.rendering/map/add/#add_6)(VectorLayer, VectorSymbolizer, bool) | बनाता है और जोड़ता है[`VectorMapLayer`](../vectormaplayer/) नक्शे के लिए। परतें अतिरिक्त क्रम में प्रदान की जाती हैं। |
| [Add](../../aspose.gis.rendering/map/add/#add_5)(VectorLayer, VectorSymbolizer, Labeling, bool) | बनाता है और जोड़ता है[`VectorMapLayer`](../vectormaplayer/) नक्शे के लिए। परतें अतिरिक्त क्रम में प्रदान की जाती हैं। |
| [Dispose](../../aspose.gis.rendering/map/dispose/)() | संसाधनों का निपटान करता है। |
| [GetEnumerator](../../aspose.gis.rendering/map/getenumerator/)() | एक प्रगणक लौटाता है जो नक्शे में परतों के माध्यम से पुनरावृति करता है। |
| [Render](../../aspose.gis.rendering/map/render/#render)(AbstractPath, Renderer) | मानचित्र को एक फ़ाइल में प्रस्तुत करता है। |
| [Render](../../aspose.gis.rendering/map/render/#render_1)(string, Renderer) | मानचित्र को एक फ़ाइल में प्रस्तुत करता है। |

### यह सभी देखें

* class [MapLayer](../maplayer/)
* नाम स्थान [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* सभा [Aspose.GIS](../../)


