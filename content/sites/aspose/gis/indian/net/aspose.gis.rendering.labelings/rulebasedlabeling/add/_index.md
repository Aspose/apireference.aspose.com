---
title: RuleBasedLabeling.Add
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: RuleBasedLabeling तरक. नय जड़त हैLabelingRule .
type: docs
weight: 40
url: /hi/net/aspose.gis.rendering.labelings/rulebasedlabeling/add/
---
## Add(Func&lt;Feature, bool&gt;, Labeling) {#add_1}

नया जोड़ता है[`LabelingRule`](../../labelingrule/) .

```csharp
public void Add(Func<Feature, bool> filter, Labeling labeling)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| filter | Func`2 | यह निर्धारित करता है कि किसी सुविधा पर लेबलिंग कब लागू की जानी चाहिए। |
| labeling | Labeling | किसी सुविधा पर लागू करने के लिए लेबलिंग कब*filter* सच हो जाता है। |

### यह सभी देखें

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [RuleBasedLabeling](../)
* नाम स्थान [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* सभा [Aspose.GIS](../../../)

---

## Add(LabelingRule) {#add}

एक नियम जोड़ता है।

```csharp
public void Add(LabelingRule rule)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rule | LabelingRule | जोड़ने का नियम। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |

### यह सभी देखें

* class [LabelingRule](../../labelingrule/)
* class [RuleBasedLabeling](../)
* नाम स्थान [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* सभा [Aspose.GIS](../../../)


