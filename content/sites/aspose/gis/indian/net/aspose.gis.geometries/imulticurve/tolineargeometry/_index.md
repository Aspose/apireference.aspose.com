---
title: IMultiCurve.ToLinearGeometry
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: IMultiCurve तरक. डफ़ल्ट क उपयग करके इस ज्यमत क अनुमनत य समतुल्य गैरवक्र संस्करण प्रप्त करत हैसहनशलत .
type: docs
weight: 20
url: /hi/net/aspose.gis.geometries/imulticurve/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

डिफ़ॉल्ट का उपयोग करके इस ज्यामिति का अनुमानित या समतुल्य गैर-वक्र संस्करण प्राप्त करता है`सहनशीलता` .

```csharp
public IMultiLineString ToLinearGeometry()
```

### प्रतिलाभ की मात्रा

ए[`IMultiLineString`](../../imultilinestring/) जो इसके बराबर या इसके बराबर हो[`IMultiCurve`](../). यह इसके बराबर है`ToLinearGeometry` with डिफ़ॉल्ट`सहनशीलता` . गलती करना`सहनशीलता` का मान निर्भर करता है[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) इस ज्यामिति का :  अनुमानित SRS के लिए सहनशीलता 0.001 मीटर (SRS इकाइयों में) है भौगोलिक एसआरएस सहिष्णुता के लिए है`1e-5` डिग्री (एसआरएस इकाइयों में) अज्ञात एसआरएस के लिए सहिष्णुता है`1e-5` किन परिवर्तनों को लागू किया जाता है, इसके बारे में अधिक जानकारी के लिए देखें`ToLinearGeometry` विशिष्टता.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| InvalidOperationException | यह ज्यामिति इस तरह से अमान्य है, कि ऑपरेशन पूरा नहीं किया जा सकता है। |

### यह सभी देखें

* interface [IMultiLineString](../../imultilinestring/)
* interface [IMultiCurve](../)
* नाम स्थान [Aspose.Gis.Geometries](../../imulticurve/)
* सभा [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

निर्दिष्ट का उपयोग करके इस ज्यामिति का अनुमानित या समकक्ष गैर-वक्र संस्करण प्राप्त करता है`सहनशीलता` .

```csharp
public IMultiLineString ToLinearGeometry(double tolerance)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| tolerance | Double | द`सहनशीलता`उपयोग करने के लिए। परिणाम से कम होने की गारंटी है`सहनशीलता` the घुमावदार ज्यामिति से दूर, जब तक कि ज्यामिति को रैखिक बनाने के लिए आवश्यक बिंदुओं की संख्या प्रति-चतुर्थांश अधिकतम से अधिक न हो, वर्तमान में 10000 बिंदुओं के बराबर है। |

### प्रतिलाभ की मात्रा

ए[`IMultiLineString`](../../imultilinestring/) जो इसके बराबर या इसके बराबर हो[`IMultiCurve`](../) :  यदि यह वस्तु है[`IMultiLineString`](../../imultilinestring/) परिणाम स्वयं इस object के समतुल्य है यदि यह वस्तु नहीं है[`IMultiLineString`](../../imultilinestring/) - सभी वक्र रैखिक और नए हैं`IMultiLineString` बनाया गया है

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentOutOfRangeException | `सहनशीलता` से कम या बराबर है`0` . |
| InvalidOperationException | यह ज्यामिति इस तरह से अमान्य है, कि ऑपरेशन पूरा नहीं किया जा सकता है। |

### यह सभी देखें

* interface [IMultiLineString](../../imultilinestring/)
* interface [IMultiCurve](../)
* नाम स्थान [Aspose.Gis.Geometries](../../imulticurve/)
* सभा [Aspose.GIS](../../../)


