---
title: Feature.SetValue
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Feature तरक. एक वशेषत क एक नय मन सेट करत है
type: docs
weight: 100
url: /hi/net/aspose.gis/feature/setvalue/
---
## Feature.SetValue&lt;T&gt; method

एक विशेषता का एक नया मान सेट करता है।

```csharp
public void SetValue<T>(string attributeName, T value)
```

| पैरामीटर | विवरण |
| --- | --- |
| T | मान का प्रकार। |
| attributeName | विशेषता का नाम। |
| value | विशेषता का मान। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | विशेषता का नाम है`null`. |
| ArgumentException | इस परत में इस नाम की विशेषता मौजूद नहीं है। |
| InvalidOperationException | विशेषता लॉक नहीं है। |
| InvalidCastException | मूल्य का प्रकार लागू नहीं होता हैIConvertible. |
| FormatException | रूपांतरण विफल हुआ क्योंकि मान गलत प्रारूप में है। |
| OverflowException | अतिप्रवाह के कारण रूपांतरण विफल रहा। |

### टिप्पणियों

यह विधि मान को स्वचालित रूप से विशेषता के प्रकार में परिवर्तित करती है।

### यह सभी देखें

* class [Feature](../)
* नाम स्थान [Aspose.Gis](../../feature/)
* सभा [Aspose.GIS](../../../)


