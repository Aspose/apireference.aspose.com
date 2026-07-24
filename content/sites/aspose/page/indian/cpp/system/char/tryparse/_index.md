---
title: "System::Char::TryParse मेथड"
linktitle: "TryParse"
second_title: "Aspose.Page C++ के लिए"
description: "System::Char::TryParse मेथड। एकल अक्षर वाली स्ट्रिंग को UTF-16 अक्षर में बदलने का प्रयास करता है। यह फ़ंक्शन केवल तब सफल होता है जब इनपुट स्ट्रिंग null न हो और C++ में ठीक एक अक्षर लंबी हो।"
type: docs
weight: 2600
url: /hi/cpp/system/char/tryparse/
---
## Char::TryParse method


एकल कैरेक्टर वाली स्ट्रिंग को UTF-16 कैरेक्टर में परिवर्तित करने का प्रयास करता है। यह फ़ंक्शन केवल तब सफल होता है जब इनपुट स्ट्रिंग null न हो और उसकी लंबाई ठीक एक कैरेक्टर हो।

```cpp
static bool System::Char::TryParse(const System::String &s, char_t &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | const System::String\& | [String](../../string/) को परिवर्तित करने के लिए |
| परिणाम | char_t\& | आउटपुट वेरिएबल जो परिवर्तन सफल होने पर परिणाम रखेगा |

### ReturnValue

यदि परिवर्तन सफल हुआ तो true, अन्यथा - false

## संबंधित देखें

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
