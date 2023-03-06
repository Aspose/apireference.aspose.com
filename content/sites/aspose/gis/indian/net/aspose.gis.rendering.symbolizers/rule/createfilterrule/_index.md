---
title: Rule.CreateFilterRule
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Rule तरक. नय नयम बनत है ज जब भ फ़ल्टर पस करत है त फचर पर प्रतक चह्न लगू करत है
type: docs
weight: 20
url: /hi/net/aspose.gis.rendering.symbolizers/rule/createfilterrule/
---
## Rule.CreateFilterRule method

नया नियम बनाता है जो जब भी फ़िल्टर पास करता है तो फीचर पर प्रतीक चिह्न लागू करता है।

```csharp
public static Rule CreateFilterRule(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| filter | Func`2 | निर्धारित करता है कि कब प्रतीक चिन्ह का उपयोग किया जाना चाहिए। |
| symbolizer | VectorSymbolizer | लागू करने के लिए प्रतीक। |

### प्रतिलाभ की मात्रा

नया नियम वस्तु।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | फिल्टर है`null`. |

### यह सभी देखें

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [Rule](../)
* नाम स्थान [Aspose.Gis.Rendering.Symbolizers](../../rule/)
* सभा [Aspose.GIS](../../../)


