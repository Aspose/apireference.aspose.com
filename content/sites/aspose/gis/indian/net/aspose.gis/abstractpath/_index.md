---
title: Class AbstractPath
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.AbstractPath कक्ष. एकसरपथ उन वर्गं के लए एक आधर वर्ग है ज एक फ़इल सस्टम के समन वतवरण में एक अद्वतय स्थन नर्दष्ट करते हैं जैसे स्थनय फ़इल सस्टम एक दूरस्थ फ़इल संग्रहण य ज़प संग्रह दूसरं के बच
type: docs
weight: 10
url: /hi/net/aspose.gis/abstractpath/
---
## AbstractPath class

एक`सारपथ` उन वर्गों के लिए एक आधार वर्ग है जो एक फ़ाइल सिस्टम के समान वातावरण में एक अद्वितीय स्थान निर्दिष्ट करते हैं, जैसे स्थानीय फ़ाइल सिस्टम, एक दूरस्थ फ़ाइल संग्रहण या ज़िप संग्रह, दूसरों के बीच।

```csharp
public abstract class AbstractPath
```

## गुण

| नाम | विवरण |
| --- | --- |
| abstract [Location](../../aspose.gis/abstractpath/location/) { get; } | इसके स्थान का एक स्ट्रिंग प्रतिनिधित्व प्राप्त करता है`सारपथ` . |
| abstract [Separator](../../aspose.gis/abstractpath/separator/) { get; } | के निर्देशिका स्तरों को अलग करने के लिए उपयोग किया जाने वाला विभाजक वर्ण प्राप्त करता है[`Location`](./location/) डोरी। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [FromLocalPath](../../aspose.gis/abstractpath/fromlocalpath/)(string) | एक बनाता है`AbstractPath` जो स्थानीय फाइल सिस्टम पर एक स्थान का प्रतिनिधित्व करता है। |
| static [FromStream](../../aspose.gis/abstractpath/fromstream/)(Stream) | एक बनाता है`AbstractPath` एक सेStream . |
| virtual [Combine](../../aspose.gis/abstractpath/combine/)(string) | इसे जोड़ता है`AbstractPath` निर्दिष्ट पथ घटकों के साथ. |
| abstract [Delete](../../aspose.gis/abstractpath/delete/)() | इस पथ द्वारा इंगित फ़ाइल को हटाता है। |
| [GetExtension](../../aspose.gis/abstractpath/getextension/)() | इसका विस्तार लौटाता है`AbstractPath` . |
| [GetFileName](../../aspose.gis/abstractpath/getfilename/)() | इसका फ़ाइल नाम और एक्सटेंशन लौटाता है`AbstractPath` . |
| [GetFileNameWithoutExtension](../../aspose.gis/abstractpath/getfilenamewithoutextension/)() | इसका फ़ाइल नाम लौटाता है`AbstractPath` एक्सटेंशन के बिना. |
| abstract [IsFile](../../aspose.gis/abstractpath/isfile/)() | यह इंगित करने वाला मान प्राप्त करता है कि क्या यह पथ किसी ऐसी मौजूदा फ़ाइल की ओर इशारा करता है जिसे पढ़ने के लिए खोला जा सकता है। |
| abstract [ListDirectory](../../aspose.gis/abstractpath/listdirectory/)() | इसके अंदर स्थित पथ लौटाता है`सारपथ` , अगर यह एक निर्देशिका है. |
| abstract [Open](../../aspose.gis/abstractpath/open/)(FileAccess) | इसे खोलता है`सारपथ`फ़ाइल के रूप में. |
| virtual [WithExtension](../../aspose.gis/abstractpath/withextension/)(string) | एक नया लौटाता है`AbstractPath` फ़ाइल एक्सटेंशन के साथ निर्दिष्ट मान में बदल गया। |

### टिप्पणियों

एक`सारपथ` एक स्थानीय फ़ाइल सिस्टम पर एक स्थान निर्दिष्ट कर सकता है, एक दूरस्थ फ़ाइल सिस्टम पर एक स्थान या एज़्योर ब्लॉब स्टोरेज जैसे बाहरी संग्रहण, और इसी तरह। स्थान किसी मौजूदा या नहीं मौजूदा फ़ाइल-जैसी वस्तुओं, निर्देशिका-जैसी वस्तुओं को इंगित कर सकता है, या पर्यावरण के लिए उचित कोई अन्य अर्थ हो सकता है। एक उदाहरण के रूप में, एक`सारपथ` इनहेरिटर जो स्थानीय फ़ाइल सिस्टम पर किसी स्थान का प्रतिनिधित्व करता है, मौजूदा फ़ाइल, निर्देशिका, या फ़ाइल सिस्टम में किसी ऐसे स्थान को इंगित कर सकता है जो अभी तक नहीं बनाया गया है। एक नया फाइल सिस्टम जैसा स्टोरेज उपलब्ध कराने के लिए`Aspose.GIS` किसी को इस class को इनहेरिट करना चाहिए और इसके अमूर्त तरीकों को लागू करना चाहिए।

### यह सभी देखें

* नाम स्थान [Aspose.Gis](../../aspose.gis/)
* सभा [Aspose.GIS](../../)


