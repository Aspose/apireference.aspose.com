---
title: Interface ICircularString
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.Geometries.ICircularString इंटरफेस. बंदुओं के बच वृत्तकर प्रक्षेप के सथ एक बहुशर्ष वक्र
type: docs
weight: 960
url: /hi/net/aspose.gis.geometries/icircularstring/
---
## ICircularString interface

बिंदुओं के बीच वृत्ताकार प्रक्षेप के साथ एक बहु-शीर्ष वक्र।

```csharp
public interface ICircularString : ICurve, IEquatable<ICircularString>, IReadOnlyList<IPoint>
```

## तरीकों

| नाम | विवरण |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icircularstring/toeditable/)() | इस ज्यामिति की एक संपादन योग्य प्रति प्राप्त करता है। |

### टिप्पणियों

द`सर्कुलरस्ट्रिंग` अंत से अंत तक जुड़े एक या अधिक वृत्ताकार चाप खंड होते हैं। पहले तीन बिंदु पहले खंड को परिभाषित करते हैं। पहला बिंदु चाप का प्रारंभ बिंदु है। दूसरा बिंदु प्रारंभ या अंत बिंदु के अलावा चाप पर कोई मध्यवर्ती बिंदु है। तीसरा बिंदु चाप का अंत है। बाद के चापों को उनके मध्यवर्ती और अंतिम बिंदुओं द्वारा ही परिभाषित किया जाता है, क्योंकि प्रारंभ बिंदु को पिछले खंड के अंत बिंदु के रूप में स्पष्ट रूप से परिभाषित किया गया है।

### यह सभी देखें

* interface [ICurve](../icurve/)
* interface [IPoint](../ipoint/)
* नाम स्थान [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* सभा [Aspose.GIS](../../)


