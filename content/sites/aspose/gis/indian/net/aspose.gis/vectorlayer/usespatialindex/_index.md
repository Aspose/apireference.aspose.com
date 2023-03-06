---
title: VectorLayer.UseSpatialIndex
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: VectorLayer तरक. फ़ल्टर वधयं में वशेषत मन द्वर फ़ल्टरंग क गत देने के लए स्थनक सूचकंक लड करत हैWhereIntersects औरNearestTo. यद इंडेक्स मजूद नहं है त इसे पहले बनत है उपयगforceRebuild इंडेक्स रक्रएशन क मजबूर करने के लए
type: docs
weight: 190
url: /hi/net/aspose.gis/vectorlayer/usespatialindex/
---
## UseSpatialIndex(string, bool) {#usespatialindex_1}

फ़िल्टर विधियों में विशेषता मान द्वारा फ़िल्टरिंग को गति देने के लिए स्थानिक सूचकांक लोड करता है[`WhereIntersects`](../../featuressequence/whereintersects/) और[`NearestTo`](../nearestto/). यदि इंडेक्स मौजूद नहीं है तो इसे पहले बनाता है। उपयोग*forceRebuild* इंडेक्स रिक्रिएशन को मजबूर करने के लिए।

```csharp
public void UseSpatialIndex(string indexPath, bool forceRebuild = false)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| indexPath | String | इंडेक्स फ़ाइल का पथ। |
| forceRebuild | Boolean | क्या अनुक्रमणिका को फिर से बनाना है भले ही वह पहले से मौजूद हो. |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | पथ है`null`. |
| IOException | एक I/O त्रुटि हुई। |
| InvalidOperationException | इस परत के लिए स्थानिक अनुक्रमणिका पहले ही लोड की जा चुकी है। |
| [GisException](../../gisexception/) | फ़ाइल मौजूद है और यह Aspose.GIS द्वारा बनाई गई स्थानिक अनुक्रमणिका फ़ाइल नहीं है। |

### यह सभी देखें

* class [VectorLayer](../)
* नाम स्थान [Aspose.Gis](../../vectorlayer/)
* सभा [Aspose.GIS](../../../)

---

## UseSpatialIndex(AbstractPath, bool) {#usespatialindex}

फ़िल्टर विधियों में विशेषता मान द्वारा फ़िल्टरिंग को गति देने के लिए स्थानिक सूचकांक लोड करता है[`WhereIntersects`](../../featuressequence/whereintersects/) और[`NearestTo`](../nearestto/). यदि इंडेक्स मौजूद नहीं है तो इसे पहले बनाता है। उपयोग*forceRebuild* इंडेक्स रिक्रिएशन को मजबूर करने के लिए।

```csharp
public virtual void UseSpatialIndex(AbstractPath indexPath, bool forceRebuild = false)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| indexPath | AbstractPath | इंडेक्स फ़ाइल का पथ। |
| forceRebuild | Boolean | क्या अनुक्रमणिका को फिर से बनाना है भले ही वह पहले से मौजूद हो. |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | पथ है`null`. |
| IOException | एक I/O त्रुटि हुई। |
| InvalidOperationException | इस परत के लिए स्थानिक अनुक्रमणिका पहले ही लोड की जा चुकी है। |
| [GisException](../../gisexception/) | फ़ाइल मौजूद है और यह Aspose.GIS द्वारा बनाई गई स्थानिक अनुक्रमणिका फ़ाइल नहीं है। |

### यह सभी देखें

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* नाम स्थान [Aspose.Gis](../../vectorlayer/)
* सभा [Aspose.GIS](../../../)


