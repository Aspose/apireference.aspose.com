---
title: Class ImageAttributes
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Imaging.ImageAttributes कक्ष. इसमें इस बरे में जनकर है क रेंडरंग के दरन बटमैप और मेटफ़इल रंगं क कैसे उपयग कय जत है
type: docs
weight: 740
url: /hi/net/system.drawing.imaging/imageattributes/
---
## ImageAttributes class

इसमें इस बारे में जानकारी है कि रेंडरिंग के दौरान बिटमैप और मेटाफ़ाइल रंगों का कैसे उपयोग किया जाता है।

```csharp
public sealed class ImageAttributes : ICloneable, IDisposable
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [ImageAttributes](imageattributes/)() | का एक नया उदाहरण प्रारंभ करता है`ImageAttributes` वर्ग. |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [ClearBrushRemapTable](../../system.drawing.imaging/imageattributes/clearbrushremaptable/)() | इसकी ब्रश रंग-रीमैप तालिका साफ़ करता हैImageAttributes वस्तु. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey/#clearcolorkey)() | डिफ़ॉल्ट श्रेणी के लिए रंग कुंजी (पारदर्शिता सीमा) साफ़ करता है। |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey/#clearcolorkey_1)(ColorAdjustType) | निर्दिष्ट श्रेणी के लिए रंग कुंजी (पारदर्शिता सीमा) साफ़ करता है। |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix/#clearcolormatrix)() | डिफ़ॉल्ट श्रेणी के लिए रंग-समायोजन मैट्रिक्स को साफ़ करता है। |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix/#clearcolormatrix_1)(ColorAdjustType) | निर्दिष्ट श्रेणी के लिए रंग-समायोजन मैट्रिक्स को साफ़ करता है। |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma/#cleargamma)() | डिफ़ॉल्ट श्रेणी के लिए गामा सुधार अक्षम करता है। |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma/#cleargamma_1)(ColorAdjustType) | निर्दिष्ट श्रेणी के लिए गामा सुधार अक्षम करता है। |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop/#clearnoop)() | डिफ़ॉल्ट श्रेणी के लिए NoOp सेटिंग को साफ़ करता है। |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop/#clearnoop_1)(ColorAdjustType) | निर्दिष्ट श्रेणी के लिए NoOp सेटिंग को साफ़ करता है। |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel/#clearoutputchannel)() | डिफ़ॉल्ट श्रेणी के लिए CMYK (सियान-मैजेंटा-येलो-ब्लैक) आउटपुट चैनल सेटिंग को साफ़ करता है। |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel/#clearoutputchannel_1)(ColorAdjustType) | निर्दिष्ट श्रेणी के लिए (सियान-मैजेंटा-पीला-काला) आउटपुट चैनल सेटिंग साफ़ करता है। |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile/#clearoutputchannelcolorprofile)() | डिफ़ॉल्ट श्रेणी के लिए आउटपुट चैनल रंग प्रोफ़ाइल सेटिंग साफ़ करता है। |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile/#clearoutputchannelcolorprofile_1)(ColorAdjustType) | निर्दिष्ट श्रेणी के लिए आउटपुट चैनल रंग प्रोफ़ाइल सेटिंग साफ़ करता है। |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable/#clearremaptable)() | डिफ़ॉल्ट श्रेणी के लिए रंग-रीमैप तालिका साफ़ करता है. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable/#clearremaptable_1)(ColorAdjustType) | निर्दिष्ट श्रेणी के लिए रंग-रीमैप तालिका साफ़ करता है. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold/#clearthreshold)() | डिफ़ॉल्ट श्रेणी के लिए दहलीज मान साफ़ करता है। |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold/#clearthreshold_1)(ColorAdjustType) | निर्दिष्ट श्रेणी के लिए दहलीज मान साफ़ करता है। |
| [Clone](../../system.drawing.imaging/imageattributes/clone/)() | इसकी सटीक प्रति बनाता हैImageAttributes वस्तु. |
| [Dispose](../../system.drawing.imaging/imageattributes/dispose/)() | इसके द्वारा उपयोग किए गए सभी संसाधनों को जारी करता हैImageAttributes वस्तु. |
| [GetAdjustedPalette](../../system.drawing.imaging/imageattributes/getadjustedpalette/)(ColorPalette, ColorAdjustType) | निर्दिष्ट श्रेणी की समायोजन सेटिंग के अनुसार पैलेट में रंगों को समायोजित करता है। |
| [SetBrushRemapTable](../../system.drawing.imaging/imageattributes/setbrushremaptable/)(ColorMap[]) | ब्रश श्रेणी के लिए रंग-रीमैप तालिका सेट करता है। |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey/#setcolorkey)(Color, Color) | डिफ़ॉल्ट श्रेणी के लिए रंग कुंजी सेट करता है। |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey/#setcolorkey_1)(Color, Color, ColorAdjustType) | निर्दिष्ट श्रेणी के लिए रंग कुंजी (पारदर्शिता सीमा) सेट करता है। |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices)(ColorMatrix, ColorMatrix) | डिफ़ॉल्ट श्रेणी के लिए रंग-समायोजन मैट्रिक्स और ग्रेस्केल-समायोजन मैट्रिक्स सेट करता है। |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices_1)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | डिफ़ॉल्ट श्रेणी के लिए रंग-समायोजन मैट्रिक्स और ग्रेस्केल-समायोजन मैट्रिक्स सेट करता है। |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices_2)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | निर्दिष्ट श्रेणी के लिए रंग-समायोजन मैट्रिक्स और ग्रेस्केल-समायोजन मैट्रिक्स सेट करता है। |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix)(ColorMatrix) | डिफ़ॉल्ट श्रेणी के लिए रंग-समायोजन मैट्रिक्स सेट करता है। |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix_1)(ColorMatrix, ColorMatrixFlag) | डिफ़ॉल्ट श्रेणी के लिए रंग-समायोजन मैट्रिक्स सेट करता है। |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix_2)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | निर्दिष्ट श्रेणी के लिए रंग-समायोजन मैट्रिक्स सेट करता है। |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma/#setgamma)(float) | डिफ़ॉल्ट श्रेणी के लिए गामा मान सेट करता है। |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma/#setgamma_1)(float, ColorAdjustType) | निर्दिष्ट श्रेणी के लिए गामा मान सेट करता है। |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop/#setnoop)() | डिफ़ॉल्ट श्रेणी के लिए रंग समायोजन बंद कर देता है। आप कॉल कर सकते हैं[`ClearNoOp`](./clearnoop/) कॉल से पहले मौजूद रंग-समायोजन सेटिंग्स को पुनर्स्थापित करने की विधि [`SetNoOp`](./setnoop/) विधि. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop/#setnoop_1)(ColorAdjustType) | निर्दिष्ट श्रेणी के लिए रंग समायोजन बंद कर देता है। आप कॉल कर सकते हैं[`ClearNoOp`](./clearnoop/) विधि रंग-समायोजन सेटिंग्स को पुनर्स्थापित करने के लिए जो कॉल से पहले मौजूद थीं[`SetNoOp`](./setnoop/) विधि. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel/#setoutputchannel)(ColorChannelFlag) | डिफ़ॉल्ट श्रेणी के लिए CMYK (सियान-मैजेंटा-येलो-ब्लैक) आउटपुट चैनल सेट करता है। |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel/#setoutputchannel_1)(ColorChannelFlag, ColorAdjustType) | निर्दिष्ट श्रेणी के लिए CMYK (सियान-मैजेंटा-येलो-ब्लैक) आउटपुट चैनल सेट करता है। |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile/#setoutputchannelcolorprofile)(string) | डिफ़ॉल्ट श्रेणी के लिए आउटपुट चैनल कलर-प्रोफाइल फ़ाइल सेट करता है। |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile/#setoutputchannelcolorprofile_1)(string, ColorAdjustType) | निर्दिष्ट श्रेणी के लिए आउटपुट चैनल रंग-प्रोफाइल फ़ाइल सेट करता है। |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable/#setremaptable)(ColorMap[]) | डिफ़ॉल्ट श्रेणी के लिए रंग-रीमैप तालिका सेट करता है। |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable/#setremaptable_1)(ColorMap[], ColorAdjustType) | निर्दिष्ट श्रेणी के लिए रंग-रीमैप तालिका सेट करता है। |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold/#setthreshold)(float) | डिफ़ॉल्ट श्रेणी के लिए दहलीज (पारदर्शिता सीमा) सेट करता है। |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold/#setthreshold_1)(float, ColorAdjustType) | निर्दिष्ट श्रेणी के लिए दहलीज (पारदर्शिता सीमा) सेट करता है। |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode/#setwrapmode)(WrapMode) | रैप मोड सेट करता है जिसका उपयोग यह तय करने के लिए किया जाता है कि किसी बनावट को किसी आकृति में या आकार की सीमाओं पर कैसे टाइल किया जाए। एक बनावट को भरने के लिए एक आकृति पर टाइल लगाई जाती है जब बनावट उस आकार से छोटी होती है जिसे वह भर रहा है। |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode/#setwrapmode_1)(WrapMode, Color) | रैप मोड और रंग सेट करता है जिसका उपयोग यह तय करने के लिए किया जाता है कि किसी बनावट को किसी आकृति में या आकार की सीमाओं पर कैसे टाइल किया जाए। एक बनावट को भरने के लिए एक आकृति पर टाइल लगाई जाती है जब बनावट उस आकार से छोटी होती है जिसे वह भर रहा है। |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode/#setwrapmode_2)(WrapMode, Color, bool) | रैप मोड और रंग सेट करता है जिसका उपयोग यह तय करने के लिए किया जाता है कि किसी बनावट को किसी आकृति में या आकार की सीमाओं पर कैसे टाइल किया जाए। एक बनावट को भरने के लिए एक आकृति पर टाइल लगाई जाती है जब बनावट उस आकार से छोटी होती है जिसे वह भर रहा है। |

### यह सभी देखें

* नाम स्थान [System.Drawing.Imaging](../../system.drawing.imaging/)
* सभा [Aspose.Drawing](../../)


