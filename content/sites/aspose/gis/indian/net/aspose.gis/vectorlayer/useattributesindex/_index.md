---
title: VectorLayer.UseAttributesIndex
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: VectorLayer तरक. फ़ल्टर वधयं में वशेषत मन द्वर फ़ल्टरंग क गत देने के लए वशेषत अनुक्रमणक क लड करत हैWhereGreater. यद इंडेक्स मजूद नहं है त इसे पहले बनत है उपयगforceRebuild इंडेक्स रक्रएशन क मजबूर करने के लए
type: docs
weight: 180
url: /hi/net/aspose.gis/vectorlayer/useattributesindex/
---
## UseAttributesIndex(string, string, bool) {#useattributesindex_1}

फ़िल्टर विधियों में विशेषता मान द्वारा फ़िल्टरिंग को गति देने के लिए विशेषता अनुक्रमणिका को लोड करता है[`WhereGreater`](../../featuressequence/wheregreater/). यदि इंडेक्स मौजूद नहीं है तो इसे पहले बनाता है। उपयोग*forceRebuild* इंडेक्स रिक्रिएशन को मजबूर करने के लिए।

```csharp
public void UseAttributesIndex(string indexPath, string attributeName, bool forceRebuild = false)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| indexPath | String | इंडेक्स फ़ाइल का पथ। |
| attributeName | String | इंडेक्स बनाने के लिए विशेषता का नाम। |
| forceRebuild | Boolean | क्या अनुक्रमणिका को फिर से बनाना है भले ही वह पहले से मौजूद हो. |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |
| ArgumentException | ऐसे नाम वाली विशेषता परत में मौजूद नहीं है। |
| IOException | एक I/O त्रुटि हुई। |
| InvalidOperationException | इस परत के लिए पहले से ही लोड की गई निर्दिष्ट विशेषता के लिए अनुक्रमणिका। |
| [GisException](../../gisexception/) | फ़ाइल मौजूद है और यह Aspose.GIS द्वारा बनाई गई एक विशेषता अनुक्रमणिका फ़ाइल नहीं है। |

### यह सभी देखें

* class [VectorLayer](../)
* नाम स्थान [Aspose.Gis](../../vectorlayer/)
* सभा [Aspose.GIS](../../../)

---

## UseAttributesIndex(AbstractPath, string, bool) {#useattributesindex}

फ़िल्टर विधियों में विशेषता मान द्वारा फ़िल्टरिंग को गति देने के लिए विशेषता अनुक्रमणिका को लोड करता है[`WhereGreater`](../../featuressequence/wheregreater/). यदि इंडेक्स मौजूद नहीं है तो इसे पहले बनाता है। उपयोग*forceRebuild* इंडेक्स रिक्रिएशन को मजबूर करने के लिए।

```csharp
public virtual void UseAttributesIndex(AbstractPath indexPath, string attributeName, 
    bool forceRebuild = false)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| indexPath | AbstractPath | इंडेक्स फ़ाइल का पथ। |
| attributeName | String | इंडेक्स बनाने के लिए विशेषता का नाम। |
| forceRebuild | Boolean | क्या अनुक्रमणिका को फिर से बनाना है भले ही वह पहले से मौजूद हो. |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |
| ArgumentException | ऐसे नाम वाली विशेषता परत में मौजूद नहीं है। |
| IOException | एक I/O त्रुटि हुई। |
| InvalidOperationException | इस परत के लिए पहले से ही लोड की गई निर्दिष्ट विशेषता के लिए अनुक्रमणिका। |
| [GisException](../../gisexception/) | फ़ाइल मौजूद है और यह Aspose.GIS द्वारा बनाई गई एक विशेषता अनुक्रमणिका फ़ाइल नहीं है। |

### यह सभी देखें

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* नाम स्थान [Aspose.Gis](../../vectorlayer/)
* सभा [Aspose.GIS](../../../)


