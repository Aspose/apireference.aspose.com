---
title: IGeometry.AsImage
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: IGeometry तरक. इस ज्यमत क छव प्रतनधत्व में नर्यत करें
type: docs
weight: 110
url: /hi/net/aspose.gis.geometries/igeometry/asimage/
---
## AsImage(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_1}

इस ज्यामिति को छवि प्रतिनिधित्व में निर्यात करें।

```csharp
public void AsImage(AbstractPath outputPath, Measurement width, Measurement height, 
    Renderer renderer, VectorSymbolizer symbolizer = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outputPath | AbstractPath | आउटपुट छवि का पथ। |
| width | Measurement | मानचित्र की चौड़ाई। |
| height | Measurement | मानचित्र की ऊँचाई। |
| renderer | Renderer | उपयोग करने के लिए रेंडरर। |
| symbolizer | VectorSymbolizer | प्रतिपादन के लिए उपयोग करने के लिए एक प्रतीक। अगर`null`, डिफ़ॉल्ट प्रतीक चिह्न का उपयोग किया जाता है। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | कोई तर्क`null`. |
| IOException | एक I/O त्रुटि हुई। |
| [GisException](../../../aspose.gis/gisexception/) | GIS डेटा को संसाधित या पढ़ने के दौरान त्रुटि। |
| ArgumentException | चौड़ाई या ऊंचाई की इकाई है!:SpatialReferencing.Unit.MapUnits . |
| ArgumentOutOfRangeException | चौड़ाई या ऊंचाई ऋणात्मक या शून्य है। |

### यह सभी देखें

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)

---

## AsImage(string, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_2}

इस ज्यामिति को छवि प्रतिनिधित्व में निर्यात करें।

```csharp
public void AsImage(string outputPath, Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outputPath | String | आउटपुट छवि का पथ। |
| width | Measurement | मानचित्र की चौड़ाई। |
| height | Measurement | मानचित्र की ऊँचाई। |
| renderer | Renderer | उपयोग करने के लिए रेंडरर। |
| symbolizer | VectorSymbolizer | प्रतिपादन के लिए उपयोग करने के लिए एक प्रतीक। अगर`null`, डिफ़ॉल्ट प्रतीक चिह्न का उपयोग किया जाता है। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | कोई तर्क`null`. |
| IOException | एक I/O त्रुटि हुई। |
| [GisException](../../../aspose.gis/gisexception/) | GIS डेटा को संसाधित या पढ़ने के दौरान त्रुटि। |
| ArgumentException | चौड़ाई या ऊंचाई की इकाई है!:SpatialReferencing.Unit.MapUnits . |
| ArgumentOutOfRangeException | चौड़ाई या ऊंचाई ऋणात्मक या शून्य है। |

### यह सभी देखें

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)

---

## AsImage(Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage}

इस ज्यामिति को छवि प्रतिनिधित्व में निर्यात करें।

```csharp
public Stream AsImage(Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| width | Measurement | मानचित्र की चौड़ाई। |
| height | Measurement | मानचित्र की ऊँचाई। |
| renderer | Renderer | उपयोग करने के लिए रेंडरर। |
| symbolizer | VectorSymbolizer | प्रतिपादन के लिए उपयोग करने के लिए एक प्रतीक। अगर`null`, डिफ़ॉल्ट प्रतीक चिह्न का उपयोग किया जाता है। |

### प्रतिलाभ की मात्रा

धारा के रूप में छवि

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | कोई तर्क`null`. |
| IOException | एक I/O त्रुटि हुई। |
| [GisException](../../../aspose.gis/gisexception/) | GIS डेटा को संसाधित या पढ़ने के दौरान त्रुटि। |
| ArgumentException | चौड़ाई या ऊंचाई की इकाई है!:SpatialReferencing.Unit.MapUnits . |
| ArgumentOutOfRangeException | चौड़ाई या ऊंचाई ऋणात्मक या शून्य है। |

### यह सभी देखें

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)


