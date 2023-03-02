---
title: PrecisionModel.Rounding
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: PrecisionModel तरक. रउंडंग सटक मडल देत है रउंडंग सटक मडल के अनुसर केवल समत संख्य में अंक महत्वपूर्ण हते हैं
type: docs
weight: 20
url: /hi/net/aspose.gis/precisionmodel/rounding/
---
## PrecisionModel.Rounding method

राउंडिंग सटीक मॉडल देता है। राउंडिंग सटीक मॉडल के अनुसार केवल सीमित संख्या में अंक महत्वपूर्ण होते हैं।

```csharp
public static PrecisionModel Rounding(int significantDigits)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| significantDigits | Int32 | महत्वपूर्ण अंकों की संख्या। |

### प्रतिलाभ की मात्रा

गोलाई सटीक मॉडल।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentOutOfRangeException | महत्वपूर्ण अंकों की संख्या 0 से कम या 15. से अधिक है |

### टिप्पणियों

जब एक निर्देशांक पर लागू किया जाता है, तो सटीकता कम करने के लिए निम्न कोड का उपयोग किया जाता है:

```csharp
double rounded = Math.Round(value, significantDigits);
```

### यह सभी देखें

* class [PrecisionModel](../)
* नाम स्थान [Aspose.Gis](../../precisionmodel/)
* सभा [Aspose.GIS](../../../)


