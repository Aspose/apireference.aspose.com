---
title: RuleBasedSymbolizer.Add
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: RuleBasedSymbolizer तरक. नय जड़त हैRule .
type: docs
weight: 40
url: /hi/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/
---
## Add(Func&lt;Feature, bool&gt;, VectorSymbolizer) {#add_1}

नया जोड़ता है[`Rule`](../../rule/) .

```csharp
public void Add(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| filter | Func`2 | निर्धारित करता है कि प्रतीक को किसी सुविधा पर कब लागू किया जाना चाहिए। |
| symbolizer | VectorSymbolizer | जब किसी सुविधा पर लागू करने के लिए सिंबलाइज़र*filter* सच हो जाता है। |

### यह सभी देखें

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [RuleBasedSymbolizer](../)
* नाम स्थान [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* सभा [Aspose.GIS](../../../)

---

## Add(Rule) {#add}

एक नियम जोड़ता है।

```csharp
public void Add(Rule rule)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rule | Rule | जोड़ने का नियम। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |

### यह सभी देखें

* class [Rule](../../rule/)
* class [RuleBasedSymbolizer](../)
* नाम स्थान [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* सभा [Aspose.GIS](../../../)


