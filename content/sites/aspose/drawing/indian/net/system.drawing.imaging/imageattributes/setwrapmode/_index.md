---
title: ImageAttributes.SetWrapMode
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: ImageAttributes तरक. रैप मड सेट करत है जसक उपयग यह तय करने के लए कय जत है क कस बनवट क कस आकृत में य आकर क समओं पर कैसे टइल कय जए एक बनवट क भरने के लए एक आकृत पर टइल लगई जत है जब बनवट उस आकर से छट हत है जसे वह भर रह है
type: docs
weight: 240
url: /hi/net/system.drawing.imaging/imageattributes/setwrapmode/
---
## SetWrapMode(WrapMode) {#setwrapmode}

रैप मोड सेट करता है जिसका उपयोग यह तय करने के लिए किया जाता है कि किसी बनावट को किसी आकृति में या आकार की सीमाओं पर कैसे टाइल किया जाए। एक बनावट को भरने के लिए एक आकृति पर टाइल लगाई जाती है जब बनावट उस आकार से छोटी होती है जिसे वह भर रहा है।

```csharp
public void SetWrapMode(WrapMode mode)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| mode | WrapMode | का एक तत्वWrapMode यह निर्दिष्ट करता है कि किसी क्षेत्र को टाइल करने के लिए किसी image की बार-बार कॉपी का उपयोग कैसे किया जाता है। |

### यह सभी देखें

* enum [WrapMode](../../../system.drawing.drawing2d/wrapmode/)
* class [ImageAttributes](../)
* नाम स्थान [System.Drawing.Imaging](../../imageattributes/)
* सभा [Aspose.Drawing](../../../)

---

## SetWrapMode(WrapMode, Color) {#setwrapmode_1}

रैप मोड और रंग सेट करता है जिसका उपयोग यह तय करने के लिए किया जाता है कि किसी बनावट को किसी आकृति में या आकार की सीमाओं पर कैसे टाइल किया जाए। एक बनावट को भरने के लिए एक आकृति पर टाइल लगाई जाती है जब बनावट उस आकार से छोटी होती है जिसे वह भर रहा है।

```csharp
public void SetWrapMode(WrapMode mode, Color color)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| mode | WrapMode | का एक तत्वWrapMode यह निर्दिष्ट करता है कि किसी क्षेत्र को टाइल करने के लिए किसी image की बार-बार कॉपी का उपयोग कैसे किया जाता है। |
| color | Color | एकColorऑब्जेक्ट जो प्रदान की गई छवि के बाहर पिक्सेल का रंग निर्दिष्ट करता है। यदि मोड पैरामीटर सेट है तो यह रंग दिखाई देता हैClamp और स्रोत आयत को पास किया गया[`DrawImage`](../../../system.drawing/graphics/drawimage/) छवि से ही बड़ा है। |

### यह सभी देखें

* enum [WrapMode](../../../system.drawing.drawing2d/wrapmode/)
* struct [Color](../../../system.drawing/color/)
* class [ImageAttributes](../)
* नाम स्थान [System.Drawing.Imaging](../../imageattributes/)
* सभा [Aspose.Drawing](../../../)

---

## SetWrapMode(WrapMode, Color, bool) {#setwrapmode_2}

रैप मोड और रंग सेट करता है जिसका उपयोग यह तय करने के लिए किया जाता है कि किसी बनावट को किसी आकृति में या आकार की सीमाओं पर कैसे टाइल किया जाए। एक बनावट को भरने के लिए एक आकृति पर टाइल लगाई जाती है जब बनावट उस आकार से छोटी होती है जिसे वह भर रहा है।

```csharp
public void SetWrapMode(WrapMode mode, Color color, bool clamp)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| mode | WrapMode | का एक तत्वWrapMode यह निर्दिष्ट करता है कि किसी क्षेत्र को टाइल करने के लिए किसी image की बार-बार कॉपी का उपयोग कैसे किया जाता है। |
| color | Color | एक रंग वस्तु जो प्रदान की गई छवि के बाहर पिक्सेल के रंग को निर्दिष्ट करती है। यदि मोड पैरामीटर सेट है तो यह रंग दिखाई देता हैClamp और स्रोत आयत पास किया गया[`DrawImage`](../../../system.drawing/graphics/drawimage/) छवि से ही बड़ा है। |
| clamp | Boolean | इस पैरामीटर का कोई प्रभाव नहीं पड़ता है। इसे गलत पर सेट करें। |

### यह सभी देखें

* enum [WrapMode](../../../system.drawing.drawing2d/wrapmode/)
* struct [Color](../../../system.drawing/color/)
* class [ImageAttributes](../)
* नाम स्थान [System.Drawing.Imaging](../../imageattributes/)
* सभा [Aspose.Drawing](../../../)


