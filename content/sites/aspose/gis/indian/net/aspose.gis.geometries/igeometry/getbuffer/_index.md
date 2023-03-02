---
title: IGeometry.GetBuffer
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: IGeometry तरक. इस ज्यमत के आसपस एक बफर क्षेत्र क गणन करत है
type: docs
weight: 200
url: /hi/net/aspose.gis.geometries/igeometry/getbuffer/
---
## IGeometry.GetBuffer method

इस ज्यामिति के आसपास एक बफर क्षेत्र की गणना करता है।

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| distance | Double | बफर क्षेत्र की चौड़ाई (स्थानिक संदर्भ इकाइयों में)। |
| quadrantSegments | Int32 | वक्रता के 90 डिग्री का अनुमान लगाने के लिए उपयोग किए जाने वाले खंडों की संख्या। यह संख्या जितनी बड़ी होगी, घटता का बेहतर अनुमान लगाया जाएगा। डिफ़ॉल्ट 30. है |

### प्रतिलाभ की मात्रा

एक ज्यामिति जो सभी बिंदुओं का प्रतिनिधित्व करती है जो इस ज्यामिति से निर्दिष्ट दूरी के भीतर हैं। परिणाम का प्रकार या तो है[`Null`](../../geometry/null/) ,[`IPolygon`](../../ipolygon/) या[`IMultiPolygon`](../../imultipolygon/) .

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| InvalidOperationException | यह ज्यामिति इस तरह से अमान्य है कि ऑपरेशन पूरा नहीं किया जा सकता है। |
| ArgumentOutOfRangeException | चतुर्थांश खंड 0. से कम या बराबर है |

### यह सभी देखें

* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)


