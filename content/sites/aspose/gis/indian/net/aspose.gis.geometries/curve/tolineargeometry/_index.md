---
title: Curve.ToLinearGeometry
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Curve तरक. डफ़ल्ट क उपयग करके इस ज्यमत क अनुमनत य समतुल्य गैरवक्र संस्करण प्रप्त करत हैसहनशलत .
type: docs
weight: 70
url: /hi/net/aspose.gis.geometries/curve/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

डिफ़ॉल्ट का उपयोग करके इस ज्यामिति का अनुमानित या समतुल्य गैर-वक्र संस्करण प्राप्त करता है`सहनशीलता` .

```csharp
public ILineString ToLinearGeometry()
```

### प्रतिलाभ की मात्रा

ए[`ILineString`](../../ilinestring/) जो इस वक्र के बराबर या उसके बराबर है। यह इसके बराबर है[`ToLinearGeometry`](../../icurve/tolineargeometry/) with डिफ़ॉल्ट`सहनशीलता` . गलती करना`सहनशीलता` का मान निर्भर करता है[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) इस ज्यामिति का :  अनुमानित SRS के लिए सहनशीलता 0.001 मीटर (SRS इकाइयों में) है भौगोलिक एसआरएस सहिष्णुता के लिए है`1e-5` डिग्री (एसआरएस इकाइयों में) अज्ञात एसआरएस के लिए सहिष्णुता है`1e-5` किन परिवर्तनों को लागू किया जाता है, इसके बारे में अधिक जानकारी के लिए देखें[`ToLinearGeometry`](../../icurve/tolineargeometry/) विशिष्टता.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| InvalidOperationException | यह ज्यामिति इस तरह से अमान्य है, कि ऑपरेशन पूरा नहीं किया जा सकता है। |

### यह सभी देखें

* interface [ILineString](../../ilinestring/)
* class [Curve](../)
* नाम स्थान [Aspose.Gis.Geometries](../../curve/)
* सभा [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

निर्दिष्ट का उपयोग करके इस ज्यामिति का अनुमानित या समकक्ष गैर-वक्र संस्करण प्राप्त करता है`सहनशीलता` .

```csharp
public ILineString ToLinearGeometry(double tolerance)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| tolerance | Double | द`सहनशीलता`उपयोग करने के लिए। परिणाम से कम होने की गारंटी है`सहनशीलता` the घुमावदार ज्यामिति से दूर, जब तक कि ज्यामिति को रैखिक बनाने के लिए आवश्यक बिंदुओं की संख्या प्रति-चतुर्थांश अधिकतम से अधिक न हो, वर्तमान में 10000 बिंदुओं के बराबर है। |

### प्रतिलाभ की मात्रा

ए[`ILineString`](../../ilinestring/) जो इस वक्र के बराबर या उसके बराबर है:  यदि यह वस्तु है[`ILineString`](../../ilinestring/) परिणाम स्वयं इस object के समतुल्य है यदि यह वस्तु है[`ICircularString`](../../icircularstring/) परिणाम निर्दिष्ट के साथ रैखिक रूप से गोलाकार स्ट्रिंग है*tolerance* यदि यह वस्तु है[`ICompoundCurve`](../../icompoundcurve/) - इसमें से सभी वक्रों को रेखीयकृत किया जाता है और फिर इसमें शामिल किया जाता है[`ILineString`](../../ilinestring/)

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentOutOfRangeException | `सहनशीलता` से कम या बराबर है`0` . |
| InvalidOperationException | यह ज्यामिति इस तरह से अमान्य है, कि ऑपरेशन पूरा नहीं किया जा सकता है। |

### यह सभी देखें

* interface [ILineString](../../ilinestring/)
* class [Curve](../)
* नाम स्थान [Aspose.Gis.Geometries](../../curve/)
* सभा [Aspose.GIS](../../../)


