---
title: Geometry.AsText
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Geometry तरक. इस ज्यमेट्र क इसके जनेमने टेक्स्ट रप्रेजेंटेशन में ट्रंसलेट करत है
type: docs
weight: 130
url: /hi/net/aspose.gis.geometries/geometry/astext/
---
## AsText() {#astext}

इस ज्योमेट्री को इसके जाने-माने टेक्स्ट रिप्रेजेंटेशन में ट्रांसलेट करता है।

```csharp
public string AsText()
```

### प्रतिलाभ की मात्रा

इस ज्यामिति का प्रसिद्ध पाठ प्रतिनिधित्व।

### टिप्पणियों

इस विधि का आउटपुट हैIso WKT संस्करण. डिफ़ॉल्ट संख्यात्मक प्रारूप है[`General`](../../../aspose.gis/numericformat/general/) ("0" शुद्धता के साथ).

### यह सभी देखें

* class [Geometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../geometry/)
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
| NotSupportedException | अनुरोधित WKT संस्करण में ज्यामिति का प्रतिनिधित्व नहीं किया जा सकता है। वर्तमान में ऐसा तब होता है जब [`HasCurveGeometry`](../hascurvegeometry/) ज्यामिति का है`true` और WKT संस्करण is हैSimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* क्या यह मान्य नहीं है[`WktVariant`](../../wktvariant/). |

### टिप्पणियों

डिफ़ॉल्ट सांख्यिक प्रारूप है[`General`](../../../aspose.gis/numericformat/general/) ("0" शुद्धता के साथ).

### यह सभी देखें

* enum [WktVariant](../../wktvariant/)
* class [Geometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../geometry/)
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
* class [Geometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../geometry/)
* सभा [Aspose.GIS](../../../)


