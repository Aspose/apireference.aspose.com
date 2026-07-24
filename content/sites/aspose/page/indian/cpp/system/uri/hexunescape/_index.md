---
title: "System::Uri::HexUnescape मेथड"
linktitle: "HexUnescape"
second_title: "Aspose.Page C++ के लिए"
description: "System::Uri::HexUnescape मेथड। निर्दिष्ट अक्षर के हेक्साडेसिमल प्रतिनिधित्व को C++ में एक अक्षर में परिवर्तित करता है।"
type: docs
weight: 4000
url: /hi/cpp/system/uri/hexunescape/
---
## Uri::HexUnescape method


एक अक्षर के निर्दिष्ट हेक्साडेसिमल प्रतिनिधित्व को अक्षर में परिवर्तित करता है।

```cpp
static char16_t System::Uri::HexUnescape(const String &pattern, int32_t &index)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पैटर्न | const String\& | एक स्ट्रिंग जिसमें किसी अक्षर का हेक्साडेसिमल प्रतिनिधित्व होता है |
| सूचकांक | int32_t\& | वह स्थिति **pattern** में जहाँ किसी अक्षर का हेक्साडेसिमल प्रतिनिधित्व शुरू होता है |

### ReturnValue

स्थिति **index** पर हेक्साडेसिमल एन्कोडिंग द्वारा प्रतिनिधित्व किया गया अक्षर। यदि **index** पर का अक्षर हेक्साडेसिमल एन्कोडेड नहीं है, तो **index** पर का अक्षर ही लौटाया जाता है। **index** का मान बढ़ाकर लौटाए गए अक्षर के बाद वाले अक्षर की ओर संकेत किया जाता है।

## संबंधित देखें

* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
