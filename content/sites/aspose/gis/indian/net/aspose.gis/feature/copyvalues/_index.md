---
title: Feature.CopyValues
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Feature तरक. कस अन्य फचर से वशेषतओं के मूल्यं क प्रतलप बनत है
type: docs
weight: 20
url: /hi/net/aspose.gis/feature/copyvalues/
---
## Feature.CopyValues method

किसी अन्य फीचर से विशेषताओं के मूल्यों की प्रतिलिपि बनाता है।

```csharp
public void CopyValues(Feature inputFeature)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| inputFeature | Feature | मूल्यों को कॉपी करने की सुविधा। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | का तर्क है`null`. |
| ArgumentException | इस परत में इस नाम की विशेषता मौजूद नहीं है। |
| InvalidOperationException | विशेषता लॉक नहीं है। |
| InvalidOperationException | इनपुट मान शून्य है इस विशेषता में विशेषता शून्य नहीं हो सकती। |
| [GisException](../../gisexception/) | एक विशेषता का एक ही नाम होता है लेकिन सुविधाओं में विभिन्न डेटा प्रकार होते हैं। |

### टिप्पणियों

यह विधि केवल मेल खाते नामों वाली विशेषताओं को कॉपी करती है।

### यह सभी देखें

* class [Feature](../)
* नाम स्थान [Aspose.Gis](../../feature/)
* सभा [Aspose.GIS](../../../)


