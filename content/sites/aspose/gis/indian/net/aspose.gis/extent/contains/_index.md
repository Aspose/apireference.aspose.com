---
title: Extent.Contains
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Extent तरक. नर्धरत करत है क क्य इस सम में तर्कं द्वर परभषत एक समन्वय है
type: docs
weight: 120
url: /hi/net/aspose.gis/extent/contains/
---
## Contains(double, double) {#contains_2}

निर्धारित करता है कि क्या इस सीमा में तर्कों द्वारा परिभाषित एक समन्वय है।

```csharp
public bool Contains(double x, double y)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | Double | निर्देशांक का एक्स। |
| y | Double | समन्वय का वाई। |

### प्रतिलाभ की मात्रा

मान, यह दर्शाता है कि निर्देशांक बाउंडिंग बॉक्स के अंदर है या नहीं।

### टिप्पणियों

निर्देशांक इस की सीमा पर स्थित हैं[`Extent`](../) are को इसमें निहित माना जाता है[`Extent`](../) .

### यह सभी देखें

* class [Extent](../)
* नाम स्थान [Aspose.Gis](../../extent/)
* सभा [Aspose.GIS](../../../)

---

## Contains(Extent) {#contains}

निर्धारित करता है कि क्या इस सीमा में तर्क शामिल है।

```csharp
public bool Contains(Extent extent)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| extent | Extent | एक और हद। |

### प्रतिलाभ की मात्रा

मूल्य, यह दर्शाता है कि क्या इस सीमा में तर्क शामिल है।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) इस हद तक और तर्क दोनों नहीं हैं`null` और एक दूसरे के बराबर नहीं। |

### टिप्पणियों

निर्देशांक इस की सीमा पर स्थित हैं[`Extent`](../) are को इसमें निहित माना जाता है[`Extent`](../) . इस कारण से, एक दूसरे को शामिल करने के लिए समान विस्तार माना जाता है।

### यह सभी देखें

* class [Extent](../)
* नाम स्थान [Aspose.Gis](../../extent/)
* सभा [Aspose.GIS](../../../)

---

## Contains(IGeometry) {#contains_1}

निर्धारित करता है कि क्या इस सीमा में तर्क शामिल है।

```csharp
public bool Contains(IGeometry geometry)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| geometry | IGeometry | रोकथाम के लिए परीक्षण करने के लिए एक ज्यामिति। |

### प्रतिलाभ की मात्रा

मूल्य, यह दर्शाता है कि क्या इस सीमा में तर्क शामिल है।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) इस हद तक और तर्क दोनों नहीं हैं`null` और एक दूसरे के बराबर नहीं। |

### टिप्पणियों

निर्देशांक इस की सीमा पर स्थित हैं[`Extent`](../) are को इसमें निहित माना जाता है[`Extent`](../) .

### यह सभी देखें

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* नाम स्थान [Aspose.Gis](../../extent/)
* सभा [Aspose.GIS](../../../)


