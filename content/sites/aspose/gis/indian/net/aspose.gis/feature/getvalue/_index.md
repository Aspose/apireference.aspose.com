---
title: Feature.GetValue
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Feature तरक. एक वशेषत क मन प्रप्त करत है
type: docs
weight: 30
url: /hi/net/aspose.gis/feature/getvalue/
---
## GetValue&lt;T&gt;(string) {#getvalue_1}

एक विशेषता का मान प्राप्त करता है।

```csharp
public T GetValue<T>(string attributeName)
```

| पैरामीटर | विवरण |
| --- | --- |
| T | मूल्य के लिए वांछित प्रकार। |
| attributeName | विशेषता का नाम। |

### प्रतिलाभ की मात्रा

विशेषता का मूल्य।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | विशेषता का नाम है`null`. |
| ArgumentException | इस परत में इस नाम की विशेषता मौजूद नहीं है। |
| InvalidOperationException | विशेषता लॉक नहीं है। |
| InvalidOperationException | इस विशेषता के लिए इस विशेषता का मान निर्धारित नहीं है। |
| InvalidCastException | अनुरोधित प्रकार लागू नहीं होता हैIConvertible. |
| InvalidCastException | गुण का मान है`null`, लेकिन अनुरोधित प्रकार एक मान प्रकार है। |
| FormatException | रूपांतरण विफल हुआ क्योंकि मान गलत प्रारूप में है। |
| OverflowException | अतिप्रवाह के कारण रूपांतरण विफल रहा। |

### टिप्पणियों

यह विधि मूल्य को सामान्य प्रकार के पैरामीटर में अनुरोधित प्रकार में स्वचालित रूप से परिवर्तित करती है।  यदि परत के लिए परिभाषित सभी विशेषताओं के लिए मान रखने के लिए परत को इसकी विशेषताओं की आवश्यकता नहीं है, यह विधि विफल हो सकती हैInvalidOperationException जब एक लापता मूल्य का अनुरोध किया जाता है। ऐसी परतों के साथ काम करते समय, उपयोग करने पर विचार करें[`GetValueOrDefault`](../getvalueordefault/) .

### यह सभी देखें

* class [Feature](../)
* नाम स्थान [Aspose.Gis](../../feature/)
* सभा [Aspose.GIS](../../../)

---

## GetValue(string) {#getvalue}

एक विशेषता का मान प्राप्त करता है।

```csharp
public object GetValue(string attributeName)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| attributeName | String | विशेषता का नाम। |

### प्रतिलाभ की मात्रा

विशेषता का मूल्य।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | विशेषता का नाम है`null`. |
| ArgumentException | इस परत में इस नाम की विशेषता मौजूद नहीं है। |
| InvalidOperationException | विशेषता लॉक नहीं है। |
| InvalidOperationException | इस विशेषता के लिए इस विशेषता का मान निर्धारित नहीं है। |

### टिप्पणियों

यदि परत के लिए परिभाषित सभी विशेषताओं के लिए मान रखने के लिए परत को इसकी विशेषताओं की आवश्यकता नहीं है, यह विधि विफल हो सकती हैInvalidOperationException जब एक लापता मूल्य का अनुरोध किया जाता है। ऐसी परतों के साथ काम करते समय, उपयोग करने पर विचार करें[`GetValueOrDefault`](../getvalueordefault/) .

### यह सभी देखें

* class [Feature](../)
* नाम स्थान [Aspose.Gis](../../feature/)
* सभा [Aspose.GIS](../../../)


