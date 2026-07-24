---
title: "System::IO::Directory::GetDirectories method"
linktitle: "GetDirectories"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Directory::GetDirectories method. निर्दिष्ट खोज मानदंडों को पूरा करने वाले डायरेक्टरीज़ को C++ में या तो निर्दिष्ट डायरेक्टरी में या उस डायरेक्टरी से शुरू होने वाले पूरे डायरेक्टरी ट्री में खोजता है।"
type: docs
weight: 1000
url: /hi/cpp/system.io/directory/getdirectories/
---
## Directory::GetDirectories method


निर्दिष्ट डायरेक्टरी या उस डायरेक्टरी में निहित पूरे डायरेक्टरी ट्री में निर्दिष्ट खोज मानदंडों को पूरा करने वाली डायरेक्टरीज़ की खोज करता है।

```cpp
static ArrayPtr<String> System::IO::Directory::GetDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | खोज करने के लिए डायरेक्टरी का पूर्ण या सापेक्ष पथ |
| searchPattern | const String\& | डायरेक्टरीज़ को खोजने के लिए नाम पैटर्न। |
| searchOption | SearchOption | निर्दिष्ट करता है कि खोज केवल निर्दिष्ट डायरेक्टरी में करनी है या उस डायरेक्टरी से शुरू होने वाले पूरे डायरेक्टरी ट्री में |

### ReturnValue

एक एरे जिसमें पाए गए डायरेक्टरीज़ के पूर्ण पथ होते हैं जिनके नाम **searchPattern** से मेल खाते हैं

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
