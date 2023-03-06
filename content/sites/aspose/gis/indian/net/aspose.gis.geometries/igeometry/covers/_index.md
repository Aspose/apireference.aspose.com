---
title: IGeometry.Covers
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: IGeometry तरक. नर्धरत करत है क यह ज्यमत नर्दष्ट ज्यमत क कवर करत है य नहं
type: docs
weight: 150
url: /hi/net/aspose.gis.geometries/igeometry/covers/
---
## IGeometry.Covers method

निर्धारित करता है कि यह ज्यामिति निर्दिष्ट ज्यामिति को कवर करती है या नहीं।

```csharp
public bool Covers(IGeometry other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | IGeometry | एक ज्यामिति। |

### प्रतिलाभ की मात्रा

`true` यदि यह ज्यामिति किसी अन्य ज्यामिति को "स्थानिक रूप से आच्छादित" करती है।`false` अन्यथा.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |
| ArgumentException | एक ज्यामिति इस तरह से अमान्य है कि संचालन समाप्त नहीं किया जा सकता है। |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of ज्यामिति समतुल्य नहीं हैं। आप उपयोग कर सकते हैं[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) ज्यामिति को समान स्थानिक संदर्भ प्रणाली में बदलने के लिए। |

### टिप्पणियों

यह विधि परीक्षण करती है कि क्या एक ज्यामिति DE-9IM चौराहे मैट्रिक्स के संदर्भ में दूसरे को कवर करती है।[`SpatiallyContains`](../spatiallycontains/) , लेकिन लौटता है`true` अधिक बार, क्योंकि यह आंतरिक और सीमा बिंदुओं के बीच अंतर नहीं करता है। इसलिए, यदि ज्यामिति A ज्यामिति B की सीमा पर स्थित है,[`SpatiallyContains`](../spatiallycontains/) रिटर्न`false` , जबकि यह विधि वापस आती है`true`. यह विधि इसके बराबर है:

```csharp
this.Relate(other, "T*****FF*") || this.Relate(other, "*T****FF*") || this.Relate(other, "***T**FF*) || this.Relate(other, "***T*FF*");
```

### यह सभी देखें

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)


