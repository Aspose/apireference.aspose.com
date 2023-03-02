---
title: GmlOptions.SchemaLocation
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: GmlOptions संपत्त. अंतरक्ष से अलग यूआरआई जड़े क सूच प्रत्येक जड़ में पहल यूआरआई नेमस्पेस क यूआरआई है दूसर यूआरआई नेमस्पेस के एक्सएमएल स्कम क पथ है यद सेट कय गय हैnull GmlDriver दस्तवेज़ के मूल तत्व से स्कम स्थन पढ़ने क प्रयस करेग डफ़ल्ट हैnull .
type: docs
weight: 50
url: /hi/net/aspose.gis.formats.gml/gmloptions/schemalocation/
---
## GmlOptions.SchemaLocation property

अंतरिक्ष से अलग यूआरआई जोड़े की सूची। प्रत्येक जोड़ी में पहला यूआरआई नेमस्पेस का यूआरआई है, दूसरा यूआरआई नेमस्पेस के एक्सएमएल स्कीमा का पथ है। यदि सेट किया गया है`null` ,[`GmlDriver`](../../gmldriver/) दस्तावेज़ के मूल तत्व से स्कीमा स्थान पढ़ने का प्रयास करेगा। डिफ़ॉल्ट है`null` .

```csharp
public string SchemaLocation { get; set; }
```

### टिप्पणियों

Aspose.GIS बनाने के लिए GML फ़ाइल के XML स्कीमा का उपयोग करता है[`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/) डिफ़ॉल्ट रूप से, स्कीमा स्थान विशेषता से निकाला जाता है। यदि ऐसी कोई विशेषता नहीं है या यह अमान्य स्थान की ओर इशारा करता है, Aspose.GIS GML फ़ाइल को पढ़ने में विफल रहेगा। इस स्थिति में - इस विकल्प को सेट करें, ताकि Aspose.GIS स्कीमा को लोड कर सके।

### उदाहरण

"http://site.com/namespace http://site.com/schema.xsd"

### यह सभी देखें

* class [GmlOptions](../)
* नाम स्थान [Aspose.Gis.Formats.Gml](../../gmloptions/)
* सभा [Aspose.GIS](../../../)


