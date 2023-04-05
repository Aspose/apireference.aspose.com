---
title: XpsDocument.CreatePathFigure
second_title: .NET API संदर्भ के लिए Aspose.Page
description: XpsDocument तरक. एक नय पथ आंकड़ बनत है
type: docs
weight: 280
url: /hi/net/aspose.page.xps/xpsdocument/createpathfigure/
---
## CreatePathFigure(PointF, bool) {#createpathfigure}

एक नया पथ आंकड़ा बनाता है।

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, bool isClosed = false)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| startPoint | PointF | पथ आकृति के पहले खंड के लिए प्रारंभिक बिंदु। |
| isClosed | Boolean | निर्दिष्ट करता है कि पथ बंद है या नहीं। यदि सही पर सेट किया जाता है, तो स्ट्रोक ड्रॉ "बंद" होता है, अर्थात, पथ आकृति के अंतिम खंड में अंतिम बिंदु के साथ जुड़ा होता है, जो स्टार्टपॉइंट विशेषता में निर्दिष्ट बिंदु होता है, अन्यथा स्ट्रोक "ओपन" और अंतिम होता है बिंदु प्रारंभ बिंदु से जुड़ा नहीं है। केवल तभी लागू होता है जब पथ संख्या का उपयोग {पथ} तत्व में किया जाता है जो स्ट्रोक निर्दिष्ट करता है। |

### प्रतिलाभ की मात्रा

नया पथ आंकड़ा।

### यह सभी देखें

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsDocument](../)
* नाम स्थान [Aspose.Page.XPS](../../xpsdocument/)
* सभा [Aspose.Page](../../../)

---

## CreatePathFigure(PointF, List&lt;XpsPathSegment&gt;, bool) {#createpathfigure_1}

एक नया पथ आंकड़ा बनाता है।

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, List<XpsPathSegment> segments, 
    bool isClosed = false)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| startPoint | PointF | पथ आकृति के पहले खंड के लिए प्रारंभिक बिंदु। |
| segments | List`1 | पथ खंडों की सूची। |
| isClosed | Boolean | निर्दिष्ट करता है कि पथ बंद है या नहीं। यदि सही पर सेट किया जाता है, तो स्ट्रोक ड्रॉ "बंद" होता है, अर्थात, पथ आकृति के अंतिम खंड में अंतिम बिंदु के साथ जुड़ा होता है, जो स्टार्टपॉइंट विशेषता में निर्दिष्ट बिंदु होता है, अन्यथा स्ट्रोक "ओपन" और अंतिम होता है बिंदु प्रारंभ बिंदु से जुड़ा नहीं है। केवल तभी लागू होता है जब पथ संख्या का उपयोग {पथ} तत्व में किया जाता है जो स्ट्रोक निर्दिष्ट करता है। |

### प्रतिलाभ की मात्रा

नया पथ आंकड़ा।

### यह सभी देखें

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* class [XpsDocument](../)
* नाम स्थान [Aspose.Page.XPS](../../xpsdocument/)
* सभा [Aspose.Page](../../../)


