---
title: "System::IO::File::Copy मेथड"
linktitle: "कॉपी"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::File::Copy मेथड। निर्दिष्ट फ़ाइल को निर्दिष्ट स्थान पर कॉपी करता है। यदि गंतव्य फ़ाइल पहले से मौजूद है, तो एक पैरामीटर निर्धारित करता है कि क्या इसे C++ में ओवरराइट किया जाना चाहिए।"
type: docs
weight: 400
url: /hi/cpp/system.io/file/copy/
---
## File::Copy method


निर्दिष्ट फ़ाइल को निर्दिष्ट स्थान पर कॉपी करता है। यदि गंतव्य फ़ाइल पहले से मौजूद है, तो एक पैरामीटर यह निर्धारित करता है कि इसे अधिलेखित किया जाए या नहीं।

```cpp
static void System::IO::File::Copy(const String &sourceFileName, const String &destFileName, bool overwrite=false)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| sourceFileName | const String\& | कॉपी करने वाली फ़ाइल का पथ |
| destFileName | const String\& | फ़ाइल को कॉपी करने के नए स्थान का पथ |
| ओवरराइट | bool | सही यदि मौजूदा गंतव्य फ़ाइल को अधिलेखित किया जाना चाहिए, गलत यदि गंतव्य फ़ाइल पहले से मौजूद होने पर कॉपी विफल होनी चाहिए |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
