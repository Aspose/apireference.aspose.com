---
title: SpatialReferenceSystem.Validate
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: SpatialReferenceSystem तरक. नर्धरत करें क क्य यह एसआरएस वैध है
type: docs
weight: 240
url: /hi/net/aspose.gis.spatialreferencing/spatialreferencesystem/validate/
---
## SpatialReferenceSystem.Validate method

निर्धारित करें कि क्या यह एसआरएस वैध है।

```csharp
public abstract bool Validate(out string errorMessage)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| errorMessage | String& | यदि विधि वापस आती है`false` तो यह अमान्यता का विवरण है। |

### प्रतिलाभ की मात्रा

`true` अगर एसआरएस वैध है,`false` अन्यथा।

### टिप्पणियों

वैध SRS में वैध दीर्घवृत्त होना चाहिए। - भौगोलिक SRS में ठीक एक पूर्व/पश्चिम अक्ष, ठीक एक उत्तर/दक्षिण अक्ष, और वैकल्पिक अप/डाउन अक्ष होना चाहिए (वैकल्पिक अक्ष मौजूद है जब भौगोलिक SRS 2D भौगोलिक SRS का एक यौगिक है और लंबवत SRS). - प्रक्षेपित SRS में ठीक एक पूर्व/पश्चिम अक्ष, ठीक एक उत्तर/दक्षिण अक्ष, और वैकल्पिक अप/डाउन अक्ष होना चाहिए (वैकल्पिक अक्ष तब मौजूद होता है जब अनुमानित SRS 2D भौगोलिक SRS और लंबवत SRS का एक संयोजन होता है)। - भूकेंद्रित SRS में ठीक एक पूर्व/पश्चिम अक्ष, ठीक एक उत्तर/दक्षिण अक्ष और ठीक एक अन्य अक्ष होना चाहिए। - लंबवत SRS में बिल्कुल एक अप/डाउन अक्ष होना चाहिए। - स्थानीय SRS में कम से कम एक अक्ष होना चाहिए। अक्ष दिशाएं मीटर नहीं होतीं. - यौगिक SRS एक मान्य भौगोलिक/प्रक्षेपित और एक मान्य लंबवत SRS. का संयोजन होना चाहिए

### यह सभी देखें

* class [SpatialReferenceSystem](../)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* सभा [Aspose.GIS](../../../)


