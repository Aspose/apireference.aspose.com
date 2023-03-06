---
title: Geometry.FromBinary
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Geometry तरक. अपने प्रसद्ध बइनर प्रतनधत्व से एक ज्यमत बनत है
type: docs
weight: 460
url: /hi/net/aspose.gis.geometries/geometry/frombinary/
---
## FromBinary(byte[]) {#frombinary}

अपने प्रसिद्ध बाइनरी प्रतिनिधित्व से एक ज्यामिति बनाता है।

```csharp
public static IGeometry FromBinary(byte[] wkb)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| wkb | Byte[] | एक ज्यामिति का प्रसिद्ध बाइनरी प्रतिनिधित्व। |

### प्रतिलाभ की मात्रा

तर्क द्वारा प्रस्तुत एक ज्यामिति।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क शून्य है। |
| NotSupportedException | तर्क समर्थित नहीं प्रकार की ज्यामिति का प्रतिनिधित्व करता है। |
| FormatException | तर्क मान्य प्रसिद्ध बाइनरी नहीं है। |

### यह सभी देखें

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../geometry/)
* सभा [Aspose.GIS](../../../)

---

## FromBinary(byte[], SpatialReferenceSystem) {#frombinary_1}

अपने प्रसिद्ध बाइनरी प्रतिनिधित्व से एक ज्यामिति बनाता है।

```csharp
public static IGeometry FromBinary(byte[] wkb, SpatialReferenceSystem spatialReferenceSystem)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| wkb | Byte[] | एक ज्यामिति का प्रसिद्ध बाइनरी प्रतिनिधित्व। |
| spatialReferenceSystem | SpatialReferenceSystem | स्थानिक संदर्भ प्रणाली को ज्यामिति को सौंपा जाना है। |

### प्रतिलाभ की मात्रा

तर्क द्वारा प्रस्तुत एक ज्यामिति।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क शून्य है। |
| NotSupportedException | तर्क समर्थित नहीं प्रकार की ज्यामिति का प्रतिनिधित्व करता है। |
| FormatException | तर्क मान्य प्रसिद्ध बाइनरी नहीं है। |

### टिप्पणियों

यदि ज्यामिति के बाद अतिरिक्त बाइट हैं aFormatException अपवाद फेंक दिया गया है।

### यह सभी देखें

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../geometry/)
* सभा [Aspose.GIS](../../../)


