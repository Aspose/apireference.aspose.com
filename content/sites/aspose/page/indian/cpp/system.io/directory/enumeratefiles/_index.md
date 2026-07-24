---
title: "System::IO::Directory::EnumerateFiles method"
linktitle: "EnumerateFiles"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Directory::EnumerateFiles method. निर्दिष्ट खोज मानदंडों को पूरा करने वाली फ़ाइलों को C++ में या तो निर्दिष्ट डायरेक्टरी में या उस डायरेक्टरी से शुरू होने वाले पूरे डायरेक्टरी ट्री में खोजता है।"
type: docs
weight: 400
url: /hi/cpp/system.io/directory/enumeratefiles/
---
## Directory::EnumerateFiles method


निर्दिष्ट डायरेक्टरी या उस डायरेक्टरी में निहित पूरे डायरेक्टरी ट्री में निर्दिष्ट खोज मानदंडों को पूरा करने वाली फ़ाइलों की खोज करता है।

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | खोज करने के लिए डायरेक्टरी का पूर्ण या सापेक्ष पथ |
| searchPattern | const String\& | फ़ाइलों को खोजने के लिए नाम पैटर्न। |
| searchOption | SearchOption | निर्दिष्ट करता है कि खोज केवल निर्दिष्ट डायरेक्टरी में करनी है या उस डायरेक्टरी से शुरू होने वाले पूरे डायरेक्टरी ट्री में |

### ReturnValue

पाए गए फ़ाइलों के पूर्ण पथों का एनेमरेबल संग्रह जिनके नाम **searchPattern** से मेल खाते हैं

## संबंधित देखें

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
