---
title: AbstractPath.Combine
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: AbstractPath तरक. इसे जड़त हैAbstractPath नर्दष्ट पथ घटकं के सथ.
type: docs
weight: 50
url: /hi/net/aspose.gis/abstractpath/combine/
---
## AbstractPath.Combine method

इसे जोड़ता है[`AbstractPath`](../) निर्दिष्ट पथ घटकों के साथ.

```csharp
public virtual AbstractPath Combine(string location)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| location | String | इसमें जोड़ने के लिए एक पथ घटक[`AbstractPath`](../). |

### प्रतिलाभ की मात्रा

एक नया[`AbstractPath`](../) ए की ओर इशारा करते हुए[`Location`](../location/) यह इसके स्थानों का एक संयोजन है[`AbstractPath`](../)and तर्क.

### टिप्पणियों

आमतौर पर इस विधि को उत्तराधिकारी द्वारा ओवरराइड नहीं किया जाना चाहिए। डिफ़ॉल्ट कार्यान्वयन इसे जोड़ता है[`Location`](../location/) तर्क के साथ और कॉल करता है[`WithLocation`](../withlocation/) विधि एक तर्क के रूप में समेकित स्ट्रिंग के साथ। संयोजन परिणाम निम्नलिखित तरीके से परिभाषित किया गया है:  यदि तर्क के साथ शुरू होता है[`Separator`](../separator/), संयोजन परिणाम तर्क के बराबर है; नहीं तो अगर[`Location`](../location/) के साथ समाप्त होता है[`Separator`](../separator/) , संयोजन परिणाम के बराबर है` +`; अन्यथा, परिणाम के बराबर है` + +`

### यह सभी देखें

* class [AbstractPath](../)
* नाम स्थान [Aspose.Gis](../../abstractpath/)
* सभा [Aspose.GIS](../../../)


