---
title: Feature.GetValuesDump
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Feature तरक. सरण में सभ वशेषतओं के लए मन लटत है उपयग करने पर वचर करेंGetValues वध अतरक्त स्मृत आवंटन से बचने के लए.
type: docs
weight: 60
url: /hi/net/aspose.gis/feature/getvaluesdump/
---
## Feature.GetValuesDump method

सरणी में सभी विशेषताओं के लिए मान लौटाता है। उपयोग करने पर विचार करें[`GetValues`](../getvalues/) विधि अतिरिक्त स्मृति आवंटन से बचने के लिए.

```csharp
public object[] GetValuesDump(object defaultValue = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| defaultValue | Object | यदि विशेषता मान अनुपलब्ध है (सेट नहीं किया गया है) तो लौटाया जाने वाला मान। डिफ़ॉल्ट मान है`null`. उपयोग करने पर विचार करें 'DBNull.Value' 'unset' और 'को अलग करने के लिए`null` मान. |

### प्रतिलाभ की मात्रा

विशेषता मानों की प्रतिलिपि बनाने के लिए एक नई सरणी।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | का तर्क है`null`. |
| InvalidOperationException | विशेषता लॉक नहीं है। |

### टिप्पणियों

फीचर के वैल्यू एट्रिब्यूट्स को वैल्यू एरे में कॉपी किया जाता है जिसे एक पैरामीटर के रूप में पास किया जाता है।

### यह सभी देखें

* class [Feature](../)
* नाम स्थान [Aspose.Gis](../../feature/)
* सभा [Aspose.GIS](../../../)


