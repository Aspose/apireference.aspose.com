---
title: IGeometry.ToLinearGeometry
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: IGeometry तरक. डफ़ल्ट क उपयग करके इस ज्यमत क अनुमनत य समतुल्य गैरवक्र संस्करण प्रप्त करत हैसहनशलत .
type: docs
weight: 350
url: /hi/net/aspose.gis.geometries/igeometry/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

डिफ़ॉल्ट का उपयोग करके इस ज्यामिति का अनुमानित या समतुल्य गैर-वक्र संस्करण प्राप्त करता है`सहनशीलता` .

```csharp
public IGeometry ToLinearGeometry()
```

### प्रतिलाभ की मात्रा

एक ज्यामिति जिसमें कोई वक्र ज्यामिति नहीं है। यह के बराबर है`ToLinearGeometry` with डिफ़ॉल्ट`सहनशीलता` . गलती करना`सहनशीलता` द्वारा परिभाषित किया गया है[`SpatialReferenceSystem`](../spatialreferencesystem/) इस ज्यामिति का :  अनुमानित SRS के लिए सहनशीलता 0.001 मीटर (SRS इकाइयों में) है भौगोलिक एसआरएस सहिष्णुता के लिए है`1e-5` डिग्री (एसआरएस इकाइयों में) अज्ञात एसआरएस के लिए सहिष्णुता है`1e-5` किन परिवर्तनों को लागू किया जाता है, इसके बारे में अधिक जानकारी के लिए देखें`ToLinearGeometry` विशिष्टता.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| InvalidOperationException | यह ज्यामिति इस तरह से अमान्य है, कि ऑपरेशन पूरा नहीं किया जा सकता है। |

### यह सभी देखें

* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

निर्दिष्ट का उपयोग करके इस ज्यामिति का अनुमानित या समकक्ष गैर-वक्र संस्करण प्राप्त करता है`सहनशीलता` .

```csharp
public IGeometry ToLinearGeometry(double tolerance)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| tolerance | Double | द`सहनशीलता`उपयोग करने के लिए। परिणाम से कम होने की गारंटी है`सहनशीलता` the घुमावदार ज्यामिति से दूर, जब तक कि ज्यामिति को रैखिक बनाने के लिए आवश्यक बिंदुओं की संख्या प्रति-चतुर्थांश अधिकतम से अधिक न हो, जो वर्तमान में 10000 बिंदुओं के बराबर है। |

### प्रतिलाभ की मात्रा

एक ज्यामिति, जिसमें कोई वक्र ज्यामिति नहीं है। निम्नलिखित परिवर्तन लागू होते हैं: CircularString s रेखीयकृत हैं (रूपांतरितLineString निर्दिष्ट के साथ*tolerance* )CompoundCurve स में शामिल हो गए हैं`लाइनस्ट्रिंग` एसCurvePolygon स में परिवर्तित हो जाते हैंPolygon एसMultiCurve स में परिवर्तित हो जाते हैंMultiLineString एसMultiSurface स में परिवर्तित हो जाते हैंMultiPolygon एस परिणामस्वरूप,[`HasCurveGeometry`](../hascurvegeometry/) आउटपुट ज्यामिति का है`false` .

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentOutOfRangeException | `सहनशीलता` से कम या बराबर है`0` . |
| InvalidOperationException | यह ज्यामिति इस तरह से अमान्य है, कि ऑपरेशन पूरा नहीं किया जा सकता है। |

### यह सभी देखें

* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)


