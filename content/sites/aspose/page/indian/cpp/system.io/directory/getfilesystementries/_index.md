---
title: "System::IO::Directory::GetFileSystemEntries विधि"
linktitle: "GetFileSystemEntries"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Directory::GetFileSystemEntries विधि. C++ में निर्दिष्ट निर्देशिका या उस निर्देशिका में स्थित संपूर्ण निर्देशिका वृक्ष में निर्दिष्ट खोज मानदंडों को पूरा करने वाली फ़ाइलों और निर्देशिकाओं को खोजता है।"
type: docs
weight: 1300
url: /hi/cpp/system.io/directory/getfilesystementries/
---
## Directory::GetFileSystemEntries method


निर्दिष्ट डायरेक्टरी या उस डायरेक्टरी में निहित पूरे डायरेक्टरी ट्री में निर्दिष्ट खोज मानदंडों को पूरा करने वाली फ़ाइलों और डायरेक्टरीज़ की खोज करता है।

```cpp
static ArrayPtr<String> System::IO::Directory::GetFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | खोज करने के लिए डायरेक्टरी का पूर्ण या सापेक्ष पथ |
| searchPattern | const String\& | खोज के लिए फ़ाइलों और निर्देशिकाओं का नाम पैटर्न |
| searchOption | SearchOption | निर्दिष्ट करता है कि खोज केवल निर्दिष्ट डायरेक्टरी में करनी है या उस डायरेक्टरी से शुरू होने वाले पूरे डायरेक्टरी ट्री में |

### ReturnValue

एक सरणी जिसमें उन खोजी गई फ़ाइलों और निर्देशिकाओं के पूर्ण पथ होते हैं जिनके नाम **searchPattern** से मेल खाते हैं।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
