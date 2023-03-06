---
title: Class FeaturesSequence
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.FeaturesSequence कक्ष. FeaturesSequence वेक्टर सुवधओं के एक सेट क प्रतनधत्व करत है
type: docs
weight: 170
url: /hi/net/aspose.gis/featuressequence/
---
## FeaturesSequence class

`FeaturesSequence` वेक्टर सुविधाओं के एक सेट का प्रतिनिधित्व करता है।

```csharp
public abstract class FeaturesSequence : IEnumerable<Feature>
```

## गुण

| नाम | विवरण |
| --- | --- |
| abstract [Attributes](../../aspose.gis/featuressequence/attributes/) { get; } | इसमें सुविधाओं के लिए कस्टम विशेषताओं का संग्रह प्राप्त करता है[`VectorLayer`](../vectorlayer/) . |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | इस विशेषता अनुक्रम की स्थानिक संदर्भ प्रणाली प्राप्त करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | एक एन्यूमरेटर लौटाता है जो संग्रह के माध्यम से पुनरावृति करता है। |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | इस परत की स्थानिक सीमा प्राप्त करता है। |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto)(AbstractPath, FileDriver) | सुविधाओं के अनुक्रम को परत दर परत सहेजता है। |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_2)(string, FileDriver) | सुविधाओं के अनुक्रम को परत दर परत सहेजता है। |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_1)(AbstractPath, FileDriver, SavingOptions) | सुविधाओं के अनुक्रम को परत दर परत सहेजता है। |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_3)(string, FileDriver, SavingOptions) | सुविधाओं के अनुक्रम को परत दर परत सहेजता है। |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | सुविधाओं को ज्यामिति प्रकार से विभाजित करें। |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | प्रदान किए गए मान के बराबर विशेषता मान वाली सुविधाओं का चयन करता है। |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | प्रदान किए गए मान से अधिक विशेषता मान वाली सुविधाओं का चयन करता है। |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | प्रदत्त मान से अधिक या उसके बराबर विशेषता मान वाली सुविधाओं का चयन करता है। |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects)(Extent) | सीमा के आधार पर फ़िल्टर सुविधाएँ। |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_1)(FeaturesSequence) | अन्य सुविधाओं के अनुक्रम में सभी ज्यामिति के मिलन के आधार पर सुविधाओं को फ़िल्टर करता है। |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_2)(IGeometry) | प्रदान की गई ज्यामिति के आधार पर फ़िल्टर सुविधाएँ। |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | विशेषता मान के साथ सुविधाओं का चयन करता है जो प्रदान किए गए मान के बराबर नहीं है। |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | विशेषताओं के साथ विशेषता का चयन करता है जो शून्य के बराबर नहीं है। |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | शून्य के बराबर विशेषता वाली सुविधाओं का चयन करता है। |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | विशेषता सेट के साथ सुविधाओं का चयन करता है। |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | प्रदान किए गए मान से कम विशेषता मान वाली सुविधाओं का चयन करता है। |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | दिए गए मान से छोटे या उसके बराबर विशेषता मान वाली सुविधाओं का चयन करता है। |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | उन विशेषताओं का चयन करता है जहाँ निर्दिष्ट विशेषता सेट नहीं है। |

### यह सभी देखें

* class [Feature](../feature/)
* नाम स्थान [Aspose.Gis](../../aspose.gis/)
* सभा [Aspose.GIS](../../)


