---
title: "System::Decimal::Round मेथड"
linktitle: "राउंड"
second_title: "Aspose.Page C++ के लिए"
description: "System::Decimal::Round मेथड। निर्दिष्ट मान को निर्दिष्ट अंशीय अंकों की संख्या के साथ निकटतम मान तक गोल करता है। एक पैरामीटर function''s व्यवहार को निर्दिष्ट करता है यदि निर्दिष्ट मान दो निकटतम संख्याओं के बराबर दूरी पर हो C++ में।"
type: docs
weight: 4400
url: /hi/cpp/system/decimal/round/
---
## Decimal::Round(const Decimal\&, int, MidpointRounding) method


निर्दिष्ट मान को निर्दिष्ट दशांश अंकों की संख्या के साथ निकटतम मान में गोल करता है। एक पैरामीटर निर्दिष्ट करता है कि यदि निर्दिष्ट मान दो निकटतम संख्याओं के बराबर दूरी पर हो तो फ़ंक्शन का व्यवहार क्या होगा।

```cpp
static Decimal System::Decimal::Round(const Decimal &d, int digits, MidpointRounding mode=MidpointRounding::ToEven)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| d | const Decimal\& | गोल करने के लिए मान |
| अंकों | int | गोल किए गए मान में अंशीय अंकों की संख्या |
| mode | MidpointRounding | यदि **value** दो निकटतम संख्याओं के बराबर दूरी पर हो तो गोलाई कैसे की जाए यह निर्दिष्ट करता है। |

### ReturnValue

निर्दिष्ट अंकों की संख्या के साथ वह संख्या जो **value** के सबसे निकट हो

## संबंधित देखें

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::Round(const Decimal\&, MidpointRounding) method


निर्दिष्ट मान को निकटतम पूर्णांक में गोल करता है। एक पैरामीटर निर्दिष्ट करता है कि यदि निर्दिष्ट मान दो निकटतम संख्याओं के बराबर दूरी पर हो तो फ़ंक्शन का व्यवहार क्या होगा।

```cpp
static Decimal System::Decimal::Round(const Decimal &d, MidpointRounding mode=MidpointRounding::ToEven)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| d | const Decimal\& | गोल करने के लिए मान |
| mode | MidpointRounding | यदि **value** दो निकटतम संख्याओं के बराबर दूरी पर हो तो गोलाई कैसे की जाए यह निर्दिष्ट करता है। |

### ReturnValue

**d** rounded to the nearest integral value

## संबंधित देखें

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
