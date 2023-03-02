---
title: Feature.GetValuesList
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Feature तरक. एक सूच के रूप में एक वशेषत अनुक्रम के मन प्रप्त करत है
type: docs
weight: 70
url: /hi/net/aspose.gis/feature/getvalueslist/
---
## Feature.GetValuesList&lt;T&gt; method

एक सूची के रूप में एक विशेषता अनुक्रम के मान प्राप्त करता है।

```csharp
public List<T> GetValuesList<T>(string attributeName, string separator)
```

| पैरामीटर | विवरण |
| --- | --- |
| T | मूल्यों के लिए वांछित प्रकार। |
| attributeName | विशेषता का नाम। |
| separator | एक स्ट्रिंग जिसका उपयोग विशेषता नाम और अनुक्रम के सूचकांक मान को अलग करने के लिए किया जाता है। |

### प्रतिलाभ की मात्रा

अनुक्रम सूचकांक मूल्य द्वारा अलग-अलग नामों वाले गुणों के मूल्यों की सूची।

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

इसका उपयोग करता है[`GetValue`](../getvalue/) एकल मान प्राप्त करने के लिए। इसलिए, यह विधि मूल्य को सामान्य प्रकार के पैरामीटर में अनुरोधित प्रकार में स्वचालित रूप से परिवर्तित करती है।  यदि अनुक्रमणिका 0 वाली विशेषता नहीं मिलेगी तो यह उत्पन्न होगीArgumentException .

### यह सभी देखें

* class [Feature](../)
* नाम स्थान [Aspose.Gis](../../feature/)
* सभा [Aspose.GIS](../../../)


