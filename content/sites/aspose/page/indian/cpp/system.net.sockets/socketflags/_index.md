---
title: "System::Net::Sockets::SocketFlags enum"
linktitle: "SocketFlags"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::SocketFlags enum. C++ में सॉकेट संदेशों के लिए स्थिर मान प्रदान करता है।"
type: docs
weight: 1400
url: /hi/cpp/system.net.sockets/socketflags/
---
## SocketFlags enum


सॉकेट संदेशों के लिए स्थिर मान प्रदान करता है।

```cpp
enum class SocketFlags
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| None | 0 | इस कॉल के लिए कोई फ़्लैग उपयोग नहीं किए गए हैं। |
| OutOfBand | 1 | आउट‑ऑफ़‑बैंड डेटा को प्रोसेस किया जा रहा है। |
| Peek | 2 | आगामी संदेश को देखें। |
| रूट न करें | 4 | रूटिंग टेबल का उपयोग किए बिना संदेश भेजें। |
| Truncated | 256 | एक संदेश बहुत बड़ा है ताकि निर्दिष्ट बफ़र में फिट हो सके। इसे ट्रंकेट कर दिया गया है। |
| ControlDataTruncated | 512 | कंट्रोल डेटा 64 KB से बड़ा है और आंतरिक बफ़र में फिट नहीं होता। इसे ट्रंकेट कर दिया गया है। |
| ब्रॉडकास्ट | 1024 | एक ब्रॉडकास्ट पैकेट। |
| Multicast | 2048 | एक मल्टीकास्ट पैकेट। |
| Partial | 32768 | एक संदेश आंशिक रूप से भेजा या प्राप्त किया गया। |

## संबंधित देखें

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
