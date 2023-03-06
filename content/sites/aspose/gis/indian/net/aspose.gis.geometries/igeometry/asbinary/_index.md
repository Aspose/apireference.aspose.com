---
title: IGeometry.AsBinary
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: IGeometry तरक. इस ज्यमत क इसके प्रसद्ध बइनर प्रतनधत्व में अनुवदत करत है
type: docs
weight: 100
url: /hi/net/aspose.gis.geometries/igeometry/asbinary/
---
## AsBinary() {#asbinary}

इस ज्यामिति को इसके प्रसिद्ध बाइनरी प्रतिनिधित्व में अनुवादित करता है।

```csharp
public byte[] AsBinary()
```

### प्रतिलाभ की मात्रा

इस ज्यामिति का प्रसिद्ध बाइनरी प्रतिनिधित्व।

### टिप्पणियों

इस विधि का आउटपुट में हैIso WKB संस्करण।

### यह सभी देखें

* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)

---

## AsBinary(WkbVariant) {#asbinary_1}

इस ज्यामिति को इसके प्रसिद्ध बाइनरी प्रतिनिधित्व में अनुवादित करता है।

```csharp
public byte[] AsBinary(WkbVariant variant)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| variant | WkbVariant | उपयोग करने के लिए प्रसिद्ध बाइनरी संस्करण। |

### प्रतिलाभ की मात्रा

इस ज्यामिति का प्रसिद्ध बाइनरी प्रतिनिधित्व।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| NotSupportedException | अनुरोधित WKB संस्करण में ज्यामिति का प्रतिनिधित्व नहीं किया जा सकता है। वर्तमान में ऐसा तब होता है जब [`HasCurveGeometry`](../hascurvegeometry/) ज्यामिति का है`true` और WKB वैरिएंट is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* क्या यह मान्य नहीं है[`WkbVariant`](../../wkbvariant/). |

### यह सभी देखें

* enum [WkbVariant](../../wkbvariant/)
* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)


