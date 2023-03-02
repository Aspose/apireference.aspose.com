---
title: IGeometry.AsText
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: IGeometry तरक. इस ज्यमेट्र क इसके जनेमने टेक्स्ट रप्रेजेंटेशन में ट्रंसलेट करत है
type: docs
weight: 120
url: /hi/net/aspose.gis.geometries/igeometry/astext/
---
## AsText() {#astext}

इस ज्योमेट्री को इसके जाने-माने टेक्स्ट रिप्रेजेंटेशन में ट्रांसलेट करता है।

```csharp
public string AsText()
```

### प्रतिलाभ की मात्रा

इस ज्यामिति का प्रसिद्ध पाठ प्रतिनिधित्व।

### टिप्पणियों

इस विधि का आउटपुट में हैIso डब्ल्यूकेटी संस्करण।

### यह सभी देखें

* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)

---

## AsText(WktVariant) {#astext_1}

इस ज्योमेट्री को इसके जाने-माने टेक्स्ट रिप्रेजेंटेशन में ट्रांसलेट करता है।

```csharp
public string AsText(WktVariant variant)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| variant | WktVariant | उपयोग करने के लिए प्रसिद्ध पाठ संस्करण। |

### प्रतिलाभ की मात्रा

इस ज्यामिति का प्रसिद्ध पाठ प्रतिनिधित्व।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| NotSupportedException | ज्यामिति अनुरोधित WKT संस्करण द्वारा समर्थित नहीं है। निम्नलिखित ज्यामिति केवल इसके द्वारा समर्थित हैंIsoWKT संस्करण: [`CircularString`](../../circularstring/)[`CompoundCurve`](../../compoundcurve/)[`CurvePolygon`](../../curvepolygon/)[`MultiCurve`](../../multicurve/)[`MultiSurface`](../../multisurface/) अन्य सभी ज्यामिति किसी भी WKT संस्करण द्वारा समर्थित हैं। |
| ArgumentOutOfRangeException | *variant* क्या यह मान्य नहीं है[`WktVariant`](../../wktvariant/). |

### यह सभी देखें

* enum [WktVariant](../../wktvariant/)
* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)

---

## AsText(WktVariant, NumericFormat) {#astext_2}

इस ज्योमेट्री को इसके जाने-माने टेक्स्ट रिप्रेजेंटेशन में ट्रांसलेट करता है।

```csharp
public string AsText(WktVariant variant, NumericFormat format)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| variant | WktVariant | उपयोग करने के लिए प्रसिद्ध पाठ संस्करण। |
| format | NumericFormat | स्ट्रिंग में रूपांतरण के लिए समन्वय प्रारूप। देखें[`NumericFormat`](../../../aspose.gis/numericformat/) उसे पाने के लिए। |

### प्रतिलाभ की मात्रा

इस ज्यामिति का प्रसिद्ध पाठ प्रतिनिधित्व।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| NotSupportedException | अनुरोधित WKT संस्करण में ज्यामिति का प्रतिनिधित्व नहीं किया जा सकता है। वर्तमान में ऐसा तब होता है जब [`HasCurveGeometry`](../hascurvegeometry/) ज्यामिति का है`true` और WKT संस्करण is हैSimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* क्या यह मान्य नहीं है[`WktVariant`](../../wktvariant/). |

### यह सभी देखें

* enum [WktVariant](../../wktvariant/)
* class [NumericFormat](../../../aspose.gis/numericformat/)
* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)


