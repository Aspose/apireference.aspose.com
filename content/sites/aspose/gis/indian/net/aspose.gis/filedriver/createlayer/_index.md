---
title: FileDriver.CreateLayer
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: FileDriver तरक. परत बनत है और इसे जड़ने के लए खलत है
type: docs
weight: 60
url: /hi/net/aspose.gis/filedriver/createlayer/
---
## CreateLayer(string) {#createlayer_4}

परत बनाता है और इसे जोड़ने के लिए खोलता है।

```csharp
public VectorLayer CreateLayer(string path)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | String | फ़ाइल का पथ। |

### प्रतिलाभ की मात्रा

का एक उदाहरण[`VectorLayer`](../../vectorlayer/).

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | पथ है`null`. |
| [GisException](../../gisexception/) | फ़ाइल में सुविधा लिखने में त्रुटि। |
| IOException | एक I/O त्रुटि हुई। |
| NotSupportedException | चालक सदिश परतें नहीं बना सकता (देखें[`CanCreateLayers`](../cancreatelayers/)). |

### यह सभी देखें

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* नाम स्थान [Aspose.Gis](../../filedriver/)
* सभा [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath) {#createlayer}

परत बनाता है और इसे जोड़ने के लिए खोलता है।

```csharp
public VectorLayer CreateLayer(AbstractPath path)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | AbstractPath | फ़ाइल का पथ। |

### प्रतिलाभ की मात्रा

का एक उदाहरण[`VectorLayer`](../../vectorlayer/).

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | पथ है`null`. |
| [GisException](../../gisexception/) | फ़ाइल में सुविधा लिखने में त्रुटि। |
| IOException | एक I/O त्रुटि हुई। |
| NotSupportedException | चालक सदिश परतें नहीं बना सकता (देखें[`CanCreateLayers`](../cancreatelayers/)). |

### यह सभी देखें

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* नाम स्थान [Aspose.Gis](../../filedriver/)
* सभा [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions) {#createlayer_5}

परत बनाता है और इसे जोड़ने के लिए खोलता है।

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | String | फ़ाइल का पथ। |
| options | DriverOptions | चालक-विशिष्ट विकल्प। |

### प्रतिलाभ की मात्रा

का एक उदाहरण[`VectorLayer`](../../vectorlayer/).

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | पथ है`null`. |
| ArgumentException | विकल्प ऑब्जेक्ट में इस ड्राइवर के लिए गलत प्रकार है। |
| [GisException](../../gisexception/) | फ़ाइल में सुविधा लिखने में त्रुटि। |
| IOException | एक I/O त्रुटि हुई। |
| NotSupportedException | चालक सदिश परतें नहीं बना सकता (देखें[`CanCreateLayers`](../cancreatelayers/)). |

### यह सभी देखें

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* नाम स्थान [Aspose.Gis](../../filedriver/)
* सभा [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions) {#createlayer_1}

परत बनाता है और इसे जोड़ने के लिए खोलता है।

```csharp
public VectorLayer CreateLayer(AbstractPath path, DriverOptions options)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | AbstractPath | फ़ाइल का पथ। |
| options | DriverOptions | चालक-विशिष्ट विकल्प। |

### प्रतिलाभ की मात्रा

का एक उदाहरण[`VectorLayer`](../../vectorlayer/).

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | पथ है`null`. |
| ArgumentException | विकल्प ऑब्जेक्ट में इस ड्राइवर के लिए गलत प्रकार है। |
| [GisException](../../gisexception/) | फ़ाइल में सुविधा लिखने में त्रुटि। |
| IOException | एक I/O त्रुटि हुई। |
| NotSupportedException | चालक सदिश परतें नहीं बना सकता (देखें[`CanCreateLayers`](../cancreatelayers/)). |

### यह सभी देखें

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* नाम स्थान [Aspose.Gis](../../filedriver/)
* सभा [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_7}

परत बनाता है और इसे जोड़ने के लिए खोलता है।

```csharp
public VectorLayer CreateLayer(string path, SpatialReferenceSystem spatialReferenceSystem)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | String | फ़ाइल का पथ। |
| spatialReferenceSystem | SpatialReferenceSystem | स्थानिक संदर्भ प्रणाली। |

### प्रतिलाभ की मात्रा

का एक उदाहरण[`VectorLayer`](../../vectorlayer/).

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | पथ है`null`. |
| [GisException](../../gisexception/) | फ़ाइल में सुविधा लिखने में त्रुटि। |
| IOException | एक I/O त्रुटि हुई। |
| NotSupportedException | स्थानिक संदर्भ प्रणाली ड्राइवर द्वारा समर्थित नहीं है। उपयोग करें[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) यह जाँचने के लिए कि स्थानिक संदर्भ प्रणाली समर्थित है या नहीं। |

### यह सभी देखें

* class [VectorLayer](../../vectorlayer/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* नाम स्थान [Aspose.Gis](../../filedriver/)
* सभा [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, SpatialReferenceSystem) {#createlayer_3}

परत बनाता है और इसे जोड़ने के लिए खोलता है।

```csharp
public VectorLayer CreateLayer(AbstractPath path, SpatialReferenceSystem spatialReferenceSystem)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | AbstractPath | फ़ाइल का पथ। |
| spatialReferenceSystem | SpatialReferenceSystem | स्थानिक संदर्भ प्रणाली। |

### प्रतिलाभ की मात्रा

का एक उदाहरण[`VectorLayer`](../../vectorlayer/).

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | पथ है`null`. |
| [GisException](../../gisexception/) | फ़ाइल में सुविधा लिखने में त्रुटि। |
| IOException | एक I/O त्रुटि हुई। |
| NotSupportedException | स्थानिक संदर्भ प्रणाली ड्राइवर द्वारा समर्थित नहीं है। उपयोग करें[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) यह जाँचने के लिए कि स्थानिक संदर्भ प्रणाली समर्थित है या नहीं। |

### यह सभी देखें

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* नाम स्थान [Aspose.Gis](../../filedriver/)
* सभा [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_6}

परत बनाता है और इसे जोड़ने के लिए खोलता है।

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | String | फ़ाइल का पथ। |
| options | DriverOptions | चालक-विशिष्ट विकल्प। |
| spatialReferenceSystem | SpatialReferenceSystem | स्थानिक संदर्भ प्रणाली। |

### प्रतिलाभ की मात्रा

का एक उदाहरण[`VectorLayer`](../../vectorlayer/).

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | पथ है`null`. |
| ArgumentException | विकल्प ऑब्जेक्ट में इस ड्राइवर के लिए गलत प्रकार है। |
| [GisException](../../gisexception/) | फ़ाइल में सुविधा लिखने में त्रुटि। |
| IOException | एक I/O त्रुटि हुई। |
| NotSupportedException | स्थानिक संदर्भ प्रणाली ड्राइवर द्वारा समर्थित नहीं है। उपयोग करें[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) यह जाँचने के लिए कि स्थानिक संदर्भ प्रणाली समर्थित है या नहीं। |
| NotSupportedException | चालक सदिश परतें नहीं बना सकता (देखें[`CanCreateLayers`](../cancreatelayers/)). |

### यह सभी देखें

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* नाम स्थान [Aspose.Gis](../../filedriver/)
* सभा [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

परत बनाता है और इसे जोड़ने के लिए खोलता है।

```csharp
public abstract VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | AbstractPath | फ़ाइल का पथ। |
| options | DriverOptions | चालक-विशिष्ट विकल्प। |
| spatialReferenceSystem | SpatialReferenceSystem | स्थानिक संदर्भ प्रणाली। |

### प्रतिलाभ की मात्रा

का एक उदाहरण[`VectorLayer`](../../vectorlayer/).

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | पथ है`null`. |
| ArgumentException | विकल्प ऑब्जेक्ट में इस ड्राइवर के लिए गलत प्रकार है। |
| [GisException](../../gisexception/) | फ़ाइल में सुविधा लिखने में त्रुटि। |
| IOException | एक I/O त्रुटि हुई। |
| NotSupportedException | स्थानिक संदर्भ प्रणाली ड्राइवर द्वारा समर्थित नहीं है। उपयोग करें[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) यह जाँचने के लिए कि स्थानिक संदर्भ प्रणाली समर्थित है या नहीं। |
| NotSupportedException | चालक सदिश परतें नहीं बना सकता (देखें[`CanCreateLayers`](../cancreatelayers/)). |

### यह सभी देखें

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* नाम स्थान [Aspose.Gis](../../filedriver/)
* सभा [Aspose.GIS](../../../)


