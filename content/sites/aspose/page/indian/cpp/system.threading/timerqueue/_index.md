---
title: "System::Threading::TimerQueue क्लास"
linktitle: "TimerQueue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::TimerQueue क्लास। वह कतार जो Timer वस्तुओं को संभालती है। यह केवल एक कार्यान्वयन है। Timer वस्तुएँ स्वयं वहाँ पंजीकरण करती हैं, आपको उनका उपयोग करने के लिए ऐसा करने की आवश्यकता नहीं है - इसके बजाय Timer क्लास API का उपयोग करें। यह एक सिंगलटन प्रकार है जिसमें मेमोरी प्रबंधन एक्सेस फ़ंक्शन(ओं) द्वारा किया जाता है। आपको C++ में इसे सीधे इंस्टेंस नहीं बनाना चाहिए।"
type: docs
weight: 1600
url: /hi/cpp/system.threading/timerqueue/
---
## TimerQueue class


[Timer](../timer/) ऑब्जेक्ट्स को संभालने वाली कतार। यह केवल एक कार्यान्वयन है। [Timer](../timer/) ऑब्जेक्ट्स स्वयं वहाँ पंजीकृत होते हैं, आपको उनका उपयोग करने के लिए ऐसा करने की आवश्यकता नहीं है - इसके बजाय [Timer](../timer/) क्लास API का उपयोग करें। यह एक सिंगलटन प्रकार है जिसमें मेमोरी प्रबंधन एक्सेस फ़ंक्शन(ओं) द्वारा किया जाता है। आपको इसे सीधे इंस्टेंस नहीं बनाना चाहिए।

```cpp
class TimerQueue
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(Timer *) | कतार में टाइमर पंजीकृत करता है। |
| [Delete](./delete/)(Timer *) | कतार से टाइमर हटाता है। |
| static [GetInstance](./getinstance/)() | कार्यान्वयन सिंगलटन। |
| static [JoinWorkerThread](./joinworkerthread/)() | वर्कर थ्रेड से जुड़ता है। आवश्यक होने पर अनिश्चितकाल तक प्रतीक्षा करता है। |
| [operator=](./operator=/)(const TimerQueue\&) | कॉपी नहीं किया जा सकता। |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | कॉपी नहीं किया जा सकता। |
## संबंधित देखें

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
