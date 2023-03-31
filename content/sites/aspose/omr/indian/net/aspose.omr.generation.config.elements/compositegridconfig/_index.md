---
title: Class CompositeGridConfig
second_title: .NET API संदर्भ के लिए Aspose.OMR
description: Aspose.OMR.Generation.Config.Elements.CompositeGridConfig कक्ष. ग्रड तत्व बुलबुले क सरण बनएं प्रत्येक भर हुआ बुलबुल समग्र मन में एक प्रतक क प्रतनधत्व करत है सभ चह्नत प्रतकं क एकल मन में जड़ जएग
type: docs
weight: 120
url: /hi/net/aspose.omr.generation.config.elements/compositegridconfig/
---
## CompositeGridConfig class

ग्रिड तत्व। बुलबुले की सरणी बनाएं। प्रत्येक भरा हुआ बुलबुला समग्र मान में एक प्रतीक का प्रतिनिधित्व करता है सभी चिह्नित प्रतीकों को एकल मान में जोड़ा जाएगा

```csharp
public class CompositeGridConfig : BaseConfig
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [CompositeGridConfig](compositegridconfig/)() | डिफ़ॉल्ट कंस्ट्रक्टर। |

## गुण

| नाम | विवरण |
| --- | --- |
| [BubbleType](../../aspose.omr.generation.config.elements/compositegridconfig/bubbletype/) { get; set; } | बबल का प्रकार |
| [Column](../../aspose.omr.generation.config.elements/compositegridconfig/column/) { get; set; } | जब तत्व बहु-स्तंभ माता-पिता में खींचा जाता है - स्थिति का प्रतिनिधित्व करता है। |
| [ColumnsCount](../../aspose.omr.generation.config.elements/compositegridconfig/columnscount/) { get; set; } | ग्रिड के अंदर कॉलम की मात्रा। प्रत्येक कॉलम परिणाम मान राशि में एकल प्रतीक का प्रतिनिधित्व करता है जिसके बराबर होना चाहिए[`ExtraRow`](./extrarow/) कॉलम की मात्रा |
| [DisplayHint](../../aspose.omr.generation.config.elements/compositegridconfig/displayhint/) { get; set; } | क्या इस ग्रिड का नाम प्रदर्शित होना चाहिए |
| [ExtraRow](../../aspose.omr.generation.config.elements/compositegridconfig/extrarow/) { get; set; } | कॉलम-विशिष्ट मान जो डिफ़ॉल्ट मान के शीर्ष पर रखे जाएंगे -[`Values`](./values/) . दो आयामी सरणी के रूप में प्रस्तुत किया गया। पहली - पंक्ति। दूसरा - कॉलम। प्रत्येक स्ट्रिंग बबल के अंदर टेक्स्ट का प्रतिनिधित्व करती है। यदि स्ट्रिंग शून्य है तो कोई बुलबुला नहीं रखा जाएगा। कॉलम की मात्रा बराबर होनी चाहिए[`ColumnsCount`](./columnscount/) |
| [GridAlignment](../../aspose.omr.generation.config.elements/compositegridconfig/gridalignment/) { get; set; } | ग्रिड संरेखण, इंगित करता है कि पृष्ठ पर ग्रिड को कहाँ खींचा जाना चाहिए |
| [GridOrientation](../../aspose.omr.generation.config.elements/compositegridconfig/gridorientation/) { get; set; } | ग्रिड ओरिएंटेशन: हॉरिजॉन्टल या वर्टिकल। इंगित करता है कि बाल तत्वों को कैसे रखा जाना चाहिए |
| [HeaderBorderColor](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordercolor/) { get; set; } | चौकोर बॉर्डर रंग |
| [HeaderBorderSize](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordersize/) { get; set; } | चौकोर बॉर्डर आकार |
| [HeaderType](../../aspose.omr.generation.config.elements/compositegridconfig/headertype/) { get; set; } | इंगित करता है कि ग्रिड की शुरुआत में किस प्रकार के तत्व को आकर्षित करना है |
| override [Name](../../aspose.omr.generation.config.elements/compositegridconfig/name/) { get; set; } | ग्रिड का नाम। पहचान में पहचानकर्ता के रूप में प्रयुक्त |
| [RotationAngle](../../aspose.omr.generation.config.elements/compositegridconfig/rotationangle/) { get; set; } | अपने स्वयं के अक्ष के चारों ओर ग्रिड तत्व के रोटेशन का वर्णन करें। "90" - कम्पोजिटग्रिड 90 डिग्री "-90" घुमाएं - कॉमोपोजिटग्रिड को -90 डिग्री पर घुमाएं |
| override [Type](../../aspose.omr.generation.config.elements/compositegridconfig/type/) { get; set; } | ओएमआर तत्व का प्रकार। JSON क्रमांकन के लिए आवश्यक फ़ील्ड। |
| [Values](../../aspose.omr.generation.config.elements/compositegridconfig/values/) { get; set; } | स्ट्रिंग्स का संग्रह जो प्रत्येक कॉलम में संभावित प्रतीकों का वर्णन करेगा। कॉलम-विशिष्ट मान इसमें रखे गए हैं[`ExtraRow`](./extrarow/) |
| [XPosition](../../aspose.omr.generation.config.elements/compositegridconfig/xposition/) { get; set; } | ग्रिड एक्स पृष्ठ पर स्थिति, संरेखण को ओवरराइड करता है |
| [YPosition](../../aspose.omr.generation.config.elements/compositegridconfig/yposition/) { get; set; } | पृष्ठ पर ग्रिड Y स्थिति, संरेखण को ओवरराइड करता है |

## खेत

| नाम | विवरण |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/compositegridconfig/bubblesize/) | एक बुलबुले का आकार |
| [VerticalMargin](../../aspose.omr.generation.config.elements/compositegridconfig/verticalmargin/) | लाइनों के बीच का मार्जिन |

### यह सभी देखें

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* नाम स्थान [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* सभा [Aspose.OMR](../../)


