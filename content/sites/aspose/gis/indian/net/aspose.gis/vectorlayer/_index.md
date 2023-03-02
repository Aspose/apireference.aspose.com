---
title: Class VectorLayer
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.VectorLayer कक्ष. एक वेक्टर परत क प्रतनधत्व करत है एक वेक्टर परत भगलक वशेषतओं क एक संग्रह है ज फ़इल में संग्रहत है
type: docs
weight: 2320
url: /hi/net/aspose.gis/vectorlayer/
---
## VectorLayer class

एक वेक्टर परत का प्रतिनिधित्व करता है। एक वेक्टर परत भौगोलिक विशेषताओं का एक संग्रह है, जो फ़ाइल में संग्रहीत है।

```csharp
public abstract class VectorLayer : FeaturesSequence, IDisposable
```

## गुण

| नाम | विवरण |
| --- | --- |
| override [Attributes](../../aspose.gis/vectorlayer/attributes/) { get; } | इसमें सुविधाओं के लिए कस्टम विशेषताओं का संग्रह प्राप्त करता है`VectorLayer` . |
| virtual [Count](../../aspose.gis/vectorlayer/count/) { get; } | इस परत में सुविधाओं की संख्या प्राप्त करता है। |
| abstract [Driver](../../aspose.gis/vectorlayer/driver/) { get; } | हो जाता है[`Driver`](./driver/) जिसने इस परत को तत्काल बनाया। |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype/) { get; } | परत के लिए ज्यामिति का प्रकार प्राप्त करता है। |
| virtual [Item](../../aspose.gis/vectorlayer/item/) { get; } | हो जाता है[`Feature`](../feature/) निर्दिष्ट सूचकांक पर। |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | इस विशेषता अनुक्रम की स्थानिक संदर्भ प्रणाली प्राप्त करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create/#create)(AbstractPath, FileDriver) | परत बनाता है और नई सुविधाओं को जोड़ने के लिए इसे खोलता है। |
| static [Create](../../aspose.gis/vectorlayer/create/#create_4)(string, FileDriver) | परत बनाता है और नई सुविधाओं को जोड़ने के लिए इसे खोलता है। |
| static [Create](../../aspose.gis/vectorlayer/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | परत बनाता है और नई सुविधाओं को जोड़ने के लिए इसे खोलता है। |
| static [Create](../../aspose.gis/vectorlayer/create/#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| static [Create](../../aspose.gis/vectorlayer/create/#create_5)(string, FileDriver, DriverOptions) | परत बनाता है और नई सुविधाओं को जोड़ने के लिए इसे खोलता है। |
| static [Create](../../aspose.gis/vectorlayer/create/#create_7)(string, FileDriver, SpatialReferenceSystem) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| static [Create](../../aspose.gis/vectorlayer/create/#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| static [Create](../../aspose.gis/vectorlayer/create/#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| static [Open](../../aspose.gis/vectorlayer/open/#open)(AbstractPath, FileDriver) | परत को पढ़ने के लिए खोलें. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_2)(string, FileDriver) | परत को पढ़ने के लिए खोलें. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | परत को पढ़ने के लिए खोलें. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_3)(string, FileDriver, DriverOptions) | परत को पढ़ने के लिए खोलें. |
| [Add](../../aspose.gis/vectorlayer/add/#add)(Feature) | द्वारा समर्थित होने पर परत में एक नई सुविधा जोड़ता है`VectorLayer` एस[`Driver`](./driver/) . |
| virtual [Add](../../aspose.gis/vectorlayer/add/#add_1)(Feature, IFeatureStyle) | निर्दिष्ट शैली के साथ परत में एक नई सुविधा जोड़ता है, यदि द्वारा समर्थित है`VectorLayer` एस[`Driver`](./driver/) . |
| [AsInMemory](../../aspose.gis/vectorlayer/asinmemory/)() | इनमेमोरी प्रारूप के रूप में एक परत क्लोन बनाएं। |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature/)() | इस परत की विशेषताओं के संग्रह से मेल खाने वाली विशेषताओं के साथ एक नई सुविधा बनाता है (लेकिन परत में नहीं जोड़ता है)। जब सुविधा के लिए डेटा सेट करने के साथ किया जाता है, तो इसका उपयोग करें[`Add`](./add/) परत में सुविधा जोड़ने के लिए. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes)(FeaturesSequence) | अन्य की विशेषताओं को कॉपी करता है`VectorLayer` इसके लिए. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes_1)(FeaturesSequence, IAttributesConverter) | अन्य की विशेषताओं को कॉपी करता है`VectorLayer` इसके लिए. |
| [Dispose](../../aspose.gis/vectorlayer/dispose/)() | द्वारा उपयोग किए गए संसाधनों को जारी करता है`VectorLayer` . |
| override [Equals](../../aspose.gis/vectorlayer/equals/)(object) | निर्धारित करता है कि निर्दिष्ट वस्तु वर्तमान वस्तु के बराबर है या नहीं। |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | एक एन्यूमरेटर लौटाता है जो संग्रह के माध्यम से पुनरावृति करता है। |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | इस परत की स्थानिक सीमा प्राप्त करता है। |
| [Join](../../aspose.gis/vectorlayer/join/)(VectorLayer, JoinOptions) | एक परत को वर्तमान परत से जोड़ता है। |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto)(IPoint) | प्रदान किए गए बिंदु के निकटतम सुविधा प्राप्त करता है। |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto_1)(double, double) | प्रदान किए गए निर्देशांक के निकटतम विशेषता प्राप्त करें। |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat/)(int) | निकालें[`Feature`](../feature/) निर्दिष्ट सूचकांक पर। |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat/)(int, Feature) | बदलें[`Feature`](../feature/) निर्दिष्ट सूचकांक पर। |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver) | सुविधाओं के अनुक्रम को परत दर परत सहेजता है। |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver) | सुविधाओं के अनुक्रम को परत दर परत सहेजता है। |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver, SavingOptions) | सुविधाओं के अनुक्रम को परत दर परत सहेजता है। |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver, SavingOptions) | सुविधाओं के अनुक्रम को परत दर परत सहेजता है। |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | सुविधाओं को ज्यामिति प्रकार से विभाजित करें। |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex)(AbstractPath, string, bool) | फ़िल्टर विधियों में विशेषता मान द्वारा फ़िल्टरिंग को गति देने के लिए विशेषता अनुक्रमणिका को लोड करता है[`WhereGreater`](../featuressequence/wheregreater/). यदि इंडेक्स मौजूद नहीं है तो इसे पहले बनाता है। उपयोग*forceRebuild* इंडेक्स रिक्रिएशन को मजबूर करने के लिए। |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex_1)(string, string, bool) | फ़िल्टर विधियों में विशेषता मान द्वारा फ़िल्टरिंग को गति देने के लिए विशेषता अनुक्रमणिका को लोड करता है[`WhereGreater`](../featuressequence/wheregreater/). यदि इंडेक्स मौजूद नहीं है तो इसे पहले बनाता है। उपयोग*forceRebuild* इंडेक्स रिक्रिएशन को मजबूर करने के लिए। |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex)(AbstractPath, bool) | फ़िल्टर विधियों में विशेषता मान द्वारा फ़िल्टरिंग को गति देने के लिए स्थानिक सूचकांक लोड करता है[`WhereIntersects`](../featuressequence/whereintersects/) और[`NearestTo`](./nearestto/). यदि इंडेक्स मौजूद नहीं है तो इसे पहले बनाता है। उपयोग*forceRebuild* इंडेक्स रिक्रिएशन को मजबूर करने के लिए। |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex_1)(string, bool) | फ़िल्टर विधियों में विशेषता मान द्वारा फ़िल्टरिंग को गति देने के लिए स्थानिक सूचकांक लोड करता है[`WhereIntersects`](../featuressequence/whereintersects/) और[`NearestTo`](./nearestto/). यदि इंडेक्स मौजूद नहीं है तो इसे पहले बनाता है। उपयोग*forceRebuild* इंडेक्स रिक्रिएशन को मजबूर करने के लिए। |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | प्रदान किए गए मान के बराबर विशेषता मान वाली सुविधाओं का चयन करता है। |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | प्रदान किए गए मान से अधिक विशेषता मान वाली सुविधाओं का चयन करता है। |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | प्रदत्त मान से अधिक या उसके बराबर विशेषता मान वाली सुविधाओं का चयन करता है। |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(Extent) | सीमा के आधार पर फ़िल्टर सुविधाएँ। |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(FeaturesSequence) | अन्य सुविधाओं के अनुक्रम में सभी ज्यामिति के मिलन के आधार पर सुविधाओं को फ़िल्टर करता है। |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(IGeometry) | प्रदान की गई ज्यामिति के आधार पर फ़िल्टर सुविधाएँ। |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | विशेषता मान के साथ सुविधाओं का चयन करता है जो प्रदान किए गए मान के बराबर नहीं है। |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | विशेषताओं के साथ विशेषता का चयन करता है जो शून्य के बराबर नहीं है। |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | शून्य के बराबर विशेषता वाली सुविधाओं का चयन करता है। |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | विशेषता सेट के साथ सुविधाओं का चयन करता है। |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | प्रदान किए गए मान से कम विशेषता मान वाली सुविधाओं का चयन करता है। |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | दिए गए मान से छोटे या उसके बराबर विशेषता मान वाली सुविधाओं का चयन करता है। |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | उन विशेषताओं का चयन करता है जहाँ निर्दिष्ट विशेषता सेट नहीं है। |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | एक परत को एक अलग प्रारूप में बदलें। |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_2)(string, FileDriver, string, FileDriver) | एक परत को एक अलग प्रारूप में बदलें। |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | एक परत को एक अलग प्रारूप में बदलें। |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | एक परत को एक अलग प्रारूप में बदलें। |

### यह सभी देखें

* class [FeaturesSequence](../featuressequence/)
* नाम स्थान [Aspose.Gis](../../aspose.gis/)
* सभा [Aspose.GIS](../../)


