---
title: Map.Add
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Map तरक. एक बनत हैVectorMapLayer डफ़ल्ट प्रतक के सथ और इसे मनचत्र में जड़त है परतें अतरक्त क्रम में प्रदन क जत हैं
type: docs
weight: 110
url: /hi/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

एक बनाता है[`VectorMapLayer`](../../vectormaplayer/) डिफ़ॉल्ट प्रतीक के साथ और इसे मानचित्र में जोड़ता है। परतें अतिरिक्त क्रम में प्रदान की जाती हैं।

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| layer | VectorLayer | प्रतिनिधित्व करने के लिए एक सदिश परत[`VectorMapLayer`](../../vectormaplayer/). |
| keepOpen | Boolean | `true` के बाद सदिश परत को खुला छोड़ने के लिए[`Map`](../) वस्तु का निपटान किया जाता है; `false` परत निपटाने के लिए. |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | परत है`null`. |

### यह सभी देखें

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [Map](../)
* नाम स्थान [Aspose.Gis.Rendering](../../map/)
* सभा [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

बनाता है और जोड़ता है[`VectorMapLayer`](../../vectormaplayer/) नक्शे के लिए। परतें अतिरिक्त क्रम में प्रदान की जाती हैं।

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| layer | VectorLayer | प्रतिनिधित्व करने के लिए एक सदिश परत[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | प्रतिपादन के लिए उपयोग करने के लिए एक प्रतीक। अगर`null`, डिफ़ॉल्ट प्रतीक चिह्न का उपयोग किया जाता है। |
| keepOpen | Boolean | `true` के बाद सदिश परत को खुला छोड़ने के लिए[`Map`](../) वस्तु का निपटान किया जाता है; `false` परत निपटाने के लिए. |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | परत है`null`. |

### यह सभी देखें

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* नाम स्थान [Aspose.Gis.Rendering](../../map/)
* सभा [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

बनाता है और जोड़ता है[`VectorMapLayer`](../../vectormaplayer/) नक्शे के लिए। परतें अतिरिक्त क्रम में प्रदान की जाती हैं।

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| layer | VectorLayer | प्रतिनिधित्व करने के लिए एक सदिश परत[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | प्रतिपादन के लिए उपयोग करने के लिए एक प्रतीक। अगर`null`, डिफ़ॉल्ट प्रतीक चिह्न का उपयोग किया जाता है। |
| labeling | Labeling | परत में सुविधाओं को लेबल करने के लिए उपयोग करने के लिए लेबलिंग। अगर`null` , गलती करना[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) इस्तेमाल किया जाएगा. |
| keepOpen | Boolean | `true` के बाद परत को खुला छोड़ने के लिए[`Map`](../) वस्तु का निपटान किया जाता है; अन्यथा,`false` . |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | परत है`null`. |

### यह सभी देखें

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* नाम स्थान [Aspose.Gis.Rendering](../../map/)
* सभा [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

बनाता है और जोड़ता है[`VectorMapLayer`](../../vectormaplayer/) नक्शे के लिए। परतें अतिरिक्त क्रम में प्रदान की जाती हैं।

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | प्रतिनिधित्व करने के लिए एक सुविधा अनुक्रम[`VectorMapLayer`](../../vectormaplayer/). |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | विशेषता क्रम है`null`. |

### यह सभी देखें

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [Map](../)
* नाम स्थान [Aspose.Gis.Rendering](../../map/)
* सभा [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

बनाता है और जोड़ता है[`VectorMapLayer`](../../vectormaplayer/) नक्शे के लिए। परतें अतिरिक्त क्रम में प्रदान की जाती हैं।

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | प्रतिनिधित्व करने के लिए एक सुविधा अनुक्रम[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | प्रतिपादन के लिए उपयोग करने के लिए एक प्रतीक। अगर`null`, डिफ़ॉल्ट प्रतीक चिह्न का उपयोग किया जाता है। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | विशेषता क्रम है`null`. |

### यह सभी देखें

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* नाम स्थान [Aspose.Gis.Rendering](../../map/)
* सभा [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

बनाता है और जोड़ता है[`VectorMapLayer`](../../vectormaplayer/) नक्शे के लिए। परतें अतिरिक्त क्रम में प्रदान की जाती हैं।

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | प्रतिनिधित्व करने के लिए एक सुविधा अनुक्रम[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | प्रतिपादन के लिए उपयोग करने के लिए एक प्रतीक। |
| labeling | Labeling | परत में सुविधाओं को लेबल करने के लिए उपयोग करने के लिए लेबलिंग। अगर`null` ,[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) इस्तेमाल किया जाएगा. |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | विशेषता क्रम है`null`. |

### यह सभी देखें

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* नाम स्थान [Aspose.Gis.Rendering](../../map/)
* सभा [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

मानचित्र में एक परत जोड़ता है। परतें अतिरिक्त क्रम में प्रदान की जाती हैं।

```csharp
public void Add(MapLayer mapLayer)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| mapLayer | MapLayer | जोड़ी जाने वाली परत। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |

### यह सभी देखें

* class [MapLayer](../../maplayer/)
* class [Map](../)
* नाम स्थान [Aspose.Gis.Rendering](../../map/)
* सभा [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

एक बनाता है[`RasterMapLayer`](../../rastermaplayer/) डिफ़ॉल्ट कलराइज़र के साथ और इसे मानचित्र में जोड़ता है।

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| layer | RasterLayer | प्रतिनिधित्व करने के लिए एक सदिश परत[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/). |
| colorizer | RasterColorizer | रेंडरिंग के लिए उपयोग करने के लिए कलराइज़र। अगर`null`, डिफ़ॉल्ट कलराइज़र का उपयोग किया जाता है। |
| keepOpen | Boolean | `true` के बाद रास्टर लेयर को खुला छोड़ने के लिए[`Map`](../) वस्तु का निपटान किया जाता है; `false` परत निपटाने के लिए. |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | परत है`null`. |

### यह सभी देखें

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer/)
* class [Map](../)
* नाम स्थान [Aspose.Gis.Rendering](../../map/)
* सभा [Aspose.GIS](../../../)


