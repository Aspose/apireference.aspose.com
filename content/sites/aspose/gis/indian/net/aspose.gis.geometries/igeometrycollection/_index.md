---
title: Interface IGeometryCollection
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.Geometries.IGeometryCollection इंटरफेस. एIGeometryCollection एक हैIGeometry ज क एक य अधक ज्यमतयं क संग्रह है.
type: docs
weight: 1010
url: /hi/net/aspose.gis.geometries/igeometrycollection/
---
## IGeometryCollection interface

ए`IGeometryCollection` एक है[`IGeometry`](../igeometry/) जो कि एक या अधिक ज्यामितियों का संग्रह है.

```csharp
public interface IGeometryCollection : IEnumerable<IGeometry>, IEquatable<IGeometryCollection>, 
    IGeometry
```

## गुण

| नाम | विवरण |
| --- | --- |
| [Count](../../aspose.gis.geometries/igeometrycollection/count/) { get; } | इस संग्रह में ज्यामिति की संख्या प्राप्त करता है। |
| [Item](../../aspose.gis.geometries/igeometrycollection/item/) { get; } | हो जाता है[`IGeometry`](../igeometry/) निर्दिष्ट सूचकांक पर। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [GetPointOnSurface](../../aspose.gis.geometries/igeometrycollection/getpointonsurface/)() | एक बिंदु ढूँढता है जो इस संग्रह में किसी एक सतह पर होने की गारंटी है। |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometrycollection/replacepolygonsbylines/)() | बहुभुज को इस ज्यामिति की रेखाओं के रूप में प्रदर्शित करता है। |
| [ToEditable](../../aspose.gis.geometries/igeometrycollection/toeditable/)() | इस ज्यामिति की एक संपादन योग्य प्रति प्राप्त करता है। |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry)() | डिफ़ॉल्ट का उपयोग करके इस ज्यामिति का अनुमानित या समतुल्य गैर-वक्र संस्करण प्राप्त करता है`सहनशीलता` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry_1)(double) | निर्दिष्ट का उपयोग करके इस ज्यामिति का अनुमानित या समकक्ष गैर-वक्र संस्करण प्राप्त करता है`सहनशीलता` . |

### यह सभी देखें

* interface [IGeometry](../igeometry/)
* नाम स्थान [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* सभा [Aspose.GIS](../../)


