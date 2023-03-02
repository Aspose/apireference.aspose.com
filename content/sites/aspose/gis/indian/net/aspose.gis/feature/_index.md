---
title: Class Feature
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.Feature कक्ष. ज्यमत और उपयगकर्तपरभषत वशेषतओं से बन एक भगलक वशेषत
type: docs
weight: 130
url: /hi/net/aspose.gis/feature/
---
## Feature class

ज्यामिति और उपयोगकर्ता-परिभाषित विशेषताओं से बना एक भौगोलिक विशेषता।

```csharp
public class Feature
```

## गुण

| नाम | विवरण |
| --- | --- |
| [Geometry](../../aspose.gis/feature/geometry/) { get; set; } | सुविधा की ज्यामिति प्राप्त या सेट करता है। नहीं हो सकता`null` , उपयोग[`Null`](../../aspose.gis.geometries/geometry/null/) लापता ज्यामिति को इंगित करने के लिए. |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [CopyValues](../../aspose.gis/feature/copyvalues/)(Feature) | किसी अन्य फीचर से विशेषताओं के मूल्यों की प्रतिलिपि बनाता है। |
| [GetValue](../../aspose.gis/feature/getvalue/#getvalue)(string) | एक विशेषता का मान प्राप्त करता है। |
| [GetValue&lt;T&gt;](../../aspose.gis/feature/getvalue/#getvalue_1)(string) | एक विशेषता का मान प्राप्त करता है। |
| [GetValueOrDefault](../../aspose.gis/feature/getvalueordefault/#getvalueordefault)(string, object) | किसी विशेषता का मान प्राप्त करता है, या[`DefaultValue`](../featureattribute/defaultvalue/) यदि मान सेट नहीं है या`व्यर्थ` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_1)(string) | किसी विशेषता का मान प्राप्त करता है, या[`DefaultValue`](../featureattribute/defaultvalue/) यदि मान सेट नहीं है या`व्यर्थ` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_2)(string, object) | किसी विशेषता का मान प्राप्त करता है, या[`DefaultValue`](../featureattribute/defaultvalue/) यदि मान सेट नहीं है या`व्यर्थ` . |
| [GetValues](../../aspose.gis/feature/getvalues/)(object[], object) | सरणी में सभी विशेषताओं के लिए मान लौटाता है। |
| [GetValuesDump](../../aspose.gis/feature/getvaluesdump/)(object) | सरणी में सभी विशेषताओं के लिए मान लौटाता है। उपयोग करने पर विचार करें[`GetValues`](./getvalues/) विधि अतिरिक्त स्मृति आवंटन से बचने के लिए. |
| [GetValuesList&lt;T&gt;](../../aspose.gis/feature/getvalueslist/)(string, string) | एक सूची के रूप में एक विशेषता अनुक्रम के मान प्राप्त करता है। |
| [IsValueNull](../../aspose.gis/feature/isvaluenull/)(string) | निर्धारित करता है कि निर्दिष्ट विशेषता को स्पष्ट रूप से सेट किया गया है या नहीं`व्यर्थ` मान. |
| [IsValueSet](../../aspose.gis/feature/isvalueset/)(string) | जांचता है कि क्या विशेषता मान इस सुविधा में सेट है। |
| [SetValue&lt;T&gt;](../../aspose.gis/feature/setvalue/)(string, T) | एक विशेषता का एक नया मान सेट करता है। |
| [SetValueNull](../../aspose.gis/feature/setvaluenull/)(string) | विशेषता का मान सेट करता है`व्यर्थ` . |
| [SetValues](../../aspose.gis/feature/setvalues/)(object[]) | सभी विशेषताओं के लिए नए मान सेट करता है। उपयोग करने पर भी विचार करें[`CopyValues`](./copyvalues/) एक कॉल में सेटिंग मानों को व्यवस्थित करने की विधि. |
| [UnsetValue](../../aspose.gis/feature/unsetvalue/)(string) | इस सुविधा से विशेषता मान निकालता है. |

### यह सभी देखें

* नाम स्थान [Aspose.Gis](../../aspose.gis/)
* सभा [Aspose.GIS](../../)


