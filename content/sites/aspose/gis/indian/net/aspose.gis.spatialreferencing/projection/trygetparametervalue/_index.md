---
title: Projection.TryGetParameterValue
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Projection तरक. इस प्रजेक्शन के नर्दष्ट नम के सथ पैरमटर प्रप्त करत है यद ऐस कई पैरमटर नहं है  रटर्नnull .
type: docs
weight: 60
url: /hi/net/aspose.gis.spatialreferencing/projection/trygetparametervalue/
---
## Projection.TryGetParameterValue method

इस प्रोजेक्शन के निर्दिष्ट नाम के साथ पैरामीटर प्राप्त करता है। यदि ऐसा कोई पैरामीटर नहीं है - रिटर्न`null` .

```csharp
public double? TryGetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| name | String | पैरामीटर का नाम। |
| type | ParameterType | पैरामीटर का प्रकार। यूनिट कारक को परिभाषित करता है जिसे लागू किया जाएगा: यदि प्रकार हैLinear तब[`LinearParametersUnit`](../linearparametersunit/) लागू नहीं किया जाएगा और परिणाम मीटर में होगा. यदि प्रकार हैAngular तब[`AngularParametersUnit`](../angularparametersunit/) लागू नहीं किया जाएगा और परिणाम रेडियंस में होगा. यदि प्रकार हैOtherपैरामीटर मान 'जैसा है' दिया जाएगा. |

### प्रतिलाभ की मात्रा

निर्दिष्ट नाम के साथ पैरामीटर या`null` अगर यह मौजूद नहीं है।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क शून्य है। |

### यह सभी देखें

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../projection/)
* सभा [Aspose.GIS](../../../)


