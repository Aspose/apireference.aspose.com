---
title: "System::IO::Directory::GetFiles मेथड"
linktitle: "GetFiles"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Directory::GetFiles मेथड। निर्दिष्ट डायरेक्टरी या निर्दिष्ट डायरेक्टरी में जड़ित पूरे डायरेक्टरी ट्री में, निर्दिष्ट खोज मानदंड को संतुष्ट करने वाली फाइलों की खोज करता है C++ में।"
type: docs
weight: 1200
url: /hi/cpp/system.io/directory/getfiles/
---
## Directory::GetFiles method


निर्दिष्ट डायरेक्टरी या उस डायरेक्टरी में निहित पूरे डायरेक्टरी ट्री में निर्दिष्ट खोज मानदंडों को पूरा करने वाली फ़ाइलों की खोज करता है।

```cpp
static ArrayPtr<String> System::IO::Directory::GetFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | खोज करने के लिए डायरेक्टरी का पूर्ण या सापेक्ष पथ |
| searchPattern | const String\& | फ़ाइलों को खोजने के लिए नाम पैटर्न। |
| searchOption | SearchOption | निर्दिष्ट करता है कि खोज केवल निर्दिष्ट डायरेक्टरी में करनी है या उस डायरेक्टरी से शुरू होने वाले पूरे डायरेक्टरी ट्री में |

### ReturnValue

**searchPattern** से मेल खाने वाले पाए गए फाइलों के पूर्ण पाथ की एक एरे

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
