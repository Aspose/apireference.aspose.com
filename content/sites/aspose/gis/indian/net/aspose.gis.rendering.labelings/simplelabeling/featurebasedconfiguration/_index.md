---
title: SimpleLabeling.FeatureBasedConfiguration
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: SimpleLabeling संपत्त. एक कलबैक जसक उपयग फचर क संभलने से पहले इस लेबलंग क कन्फ़गर करने के लए कय जत है
type: docs
weight: 20
url: /hi/net/aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/
---
## SimpleLabeling.FeatureBasedConfiguration property

एक कॉलबैक जिसका उपयोग फीचर को संभालने से पहले इस लेबलिंग को कॉन्फ़िगर करने के लिए किया जाता है।

```csharp
public Action<Feature, SimpleLabeling> FeatureBasedConfiguration { get; set; }
```

### टिप्पणियों

प्रत्येक सुविधा को लेबल करने से पहले यह कॉलबैक लागू किया जाता है। यह एक ऐसी सुविधा को स्वीकार करता है जो लेबल होने वाली है और इस लेबलिंग का एक क्लोन है। क्लोन के गुणों को बदलकर, फीचर की विशेषताओं के आधार पर लेबलिंग के व्यवहार को अपडेट करना संभव है।

### यह सभी देखें

* class [Feature](../../../aspose.gis/feature/)
* class [SimpleLabeling](../)
* नाम स्थान [Aspose.Gis.Rendering.Labelings](../../simplelabeling/)
* सभा [Aspose.GIS](../../../)


