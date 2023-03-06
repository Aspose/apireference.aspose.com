---
title: Projection.GetParameterValue
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Projection तरक. इस प्रक्षेपण के नर्दष्ट नम के सथ पैरमटर प्रप्त करत है
type: docs
weight: 40
url: /hi/net/aspose.gis.spatialreferencing/projection/getparametervalue/
---
## Projection.GetParameterValue method

इस प्रक्षेपण के निर्दिष्ट नाम के साथ पैरामीटर प्राप्त करता है।

```csharp
public double GetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| name | String | पैरामीटर का नाम। |
| type | ParameterType | पैरामीटर का प्रकार। यूनिट कारक को परिभाषित करता है जिसे लागू किया जाएगा: यदि प्रकार हैLinear तब[`LinearParametersUnit`](../linearparametersunit/) लागू नहीं किया जाएगा और परिणाम मीटर में होगा. यदि प्रकार हैAngular तब[`AngularParametersUnit`](../angularparametersunit/) लागू नहीं किया जाएगा और परिणाम रेडियंस में होगा. यदि प्रकार हैOtherपैरामीटर मान 'जैसा है' दिया जाएगा. |

### प्रतिलाभ की मात्रा

निर्दिष्ट नाम के साथ पैरामीटर।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क शून्य है। |
| InvalidOperationException | इस नाम का कोई पैरामीटर नहीं है। |

### यह सभी देखें

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../projection/)
* सभा [Aspose.GIS](../../../)


