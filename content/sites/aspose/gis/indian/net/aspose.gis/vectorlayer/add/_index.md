---
title: VectorLayer.Add
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: VectorLayer तरक. द्वर समर्थत हने पर परत में एक नई सुवध जड़त हैVectorLayer एसDriver .
type: docs
weight: 80
url: /hi/net/aspose.gis/vectorlayer/add/
---
## Add(Feature) {#add}

द्वारा समर्थित होने पर परत में एक नई सुविधा जोड़ता है[`VectorLayer`](../) एस[`Driver`](../driver/) .

```csharp
public void Add(Feature feature)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| feature | Feature | जोड़ने की सुविधा। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| InvalidOperationException | अगर परत केवल पढ़ने के लिए है तो फेंक दिया जाता है। |

### यह सभी देखें

* class [Feature](../../feature/)
* class [VectorLayer](../)
* नाम स्थान [Aspose.Gis](../../vectorlayer/)
* सभा [Aspose.GIS](../../../)

---

## Add(Feature, IFeatureStyle) {#add_1}

निर्दिष्ट शैली के साथ परत में एक नई सुविधा जोड़ता है, यदि द्वारा समर्थित है[`VectorLayer`](../) एस[`Driver`](../driver/) .

```csharp
public virtual void Add(Feature feature, IFeatureStyle style)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| feature | Feature | जोड़ने की सुविधा। |
| style | IFeatureStyle | फीचर स्टाइल। उपयोग`null` लापता शैली को इंगित करने के लिए। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| InvalidOperationException | अगर परत शैलियों का समर्थन नहीं करती है या परत केवल पढ़ने के लिए है तो फेंक दिया जाता है। |
| InvalidOperationException | यदि संपादन योग्य परतें शैलियों का समर्थन नहीं करती हैं तो फेंक दिया जाता है। |
| ArgumentException | यदि शैली ड्राइवर प्रकार से मेल नहीं खाती है तो फेंक दिया जाता है। |

### यह सभी देखें

* class [Feature](../../feature/)
* interface [IFeatureStyle](../../ifeaturestyle/)
* class [VectorLayer](../)
* नाम स्थान [Aspose.Gis](../../vectorlayer/)
* सभा [Aspose.GIS](../../../)


