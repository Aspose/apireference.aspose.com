---
title: Class EventTarget
second_title: .NET API संदर्भ के लिए Aspose.SVG
description: Aspose.Svg.Dom.EventTarget कक्ष. दEventTarget इंटरफ़ेस सभ नड्स द्वर एक कर्यन्वयन में कर्यन्वत कय जत है ज DOM इवेंट मडल क समर्थन करत है एकEventTarget और उस पर घटनओं क प्रेषणIEventTarget .
type: docs
weight: 870
url: /hi/net/aspose.svg.dom/eventtarget/
---
## EventTarget class

द`EventTarget` इंटरफ़ेस सभी नोड्स द्वारा एक कार्यान्वयन में कार्यान्वित किया जाता है जो DOM इवेंट मॉडल का समर्थन करता है। एक`EventTarget` और उस पर घटनाओं का प्रेषण[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget/) .

```csharp
public class EventTarget : DOMObject, IDisposable, IEventTarget
```

## तरीकों

| नाम | विवरण |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener_1)(string, IEventListener) | यह विधि ईवेंट लक्ष्य पर ईवेंट श्रोताओं के पंजीकरण की अनुमति देती है। |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener)(string, DOMEventHandler, bool) | यह विधि ईवेंट लक्ष्य पर ईवेंट श्रोताओं के पंजीकरण की अनुमति देती है। |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener_2)(string, IEventListener, bool) | यह विधि ईवेंट लक्ष्य पर ईवेंट श्रोताओं के पंजीकरण की अनुमति देती है। |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | यह विधि इवेंट को कार्यान्वयन इवेंट मॉडल में भेजने की अनुमति देती है. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | अप्रबंधित संसाधनों को मुक्त करने, जारी करने या रीसेट करने से संबंधित एप्लिकेशन-परिभाषित कार्य करता है। |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | इस विधि का उपयोग ECMAScript ऑब्जेक्ट को पुनः प्राप्त करने के लिए किया जाता हैType . |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener_1)(string, IEventListener) | यह विधि ईवेंट श्रोताओं को ईवेंट लक्ष्य से हटाने की अनुमति देती है। यदि कोई[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) एक से हटा दिया जाता है`EventTarget` जबकि यह किसी घटना को संसाधित कर रहा है, यह वर्तमान क्रियाओं द्वारा ट्रिगर नहीं किया जाएगा। इवेंट श्रोताओं को हटाए जाने के बाद कभी नहीं बुलाया जा सकता है। |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener)(string, DOMEventHandler, bool) | यह विधि ईवेंट श्रोताओं को ईवेंट लक्ष्य से हटाने की अनुमति देती है। यदि कोई[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) एक से हटा दिया जाता है`EventTarget` जबकि यह किसी घटना को संसाधित कर रहा है, यह वर्तमान क्रियाओं द्वारा ट्रिगर नहीं किया जाएगा। इवेंट श्रोताओं को हटाए जाने के बाद कभी नहीं बुलाया जा सकता है। |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener_2)(string, IEventListener, bool) | यह विधि ईवेंट श्रोताओं को ईवेंट लक्ष्य से हटाने की अनुमति देती है। यदि कोई[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) एक से हटा दिया जाता है`EventTarget` जबकि यह किसी घटना को संसाधित कर रहा है, यह वर्तमान क्रियाओं द्वारा ट्रिगर नहीं किया जाएगा। इवेंट श्रोताओं को हटाए जाने के बाद कभी नहीं बुलाया जा सकता है। |

### यह सभी देखें

* class [DOMObject](../domobject/)
* interface [IEventTarget](../../aspose.svg.dom.events/ieventtarget/)
* नाम स्थान [Aspose.Svg.Dom](../../aspose.svg.dom/)
* सभा [Aspose.SVG](../../)


