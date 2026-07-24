---
title: "System::IO::Path::CheckPath मेथड"
linktitle: "CheckPath"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Path::CheckPath मेथड। यह निर्धारित करता है कि निर्दिष्ट पथ वैध है या नहीं, यह जांचकर कि उसमें अमान्य अक्षर हैं या नहीं। यदि पथ में अमान्य अक्षर होते हैं तो C++ में एक अपवाद फेंका जाता है।"
type: docs
weight: 200
url: /hi/cpp/system.io/path/checkpath/
---
## Path::CheckPath method


निर्दिष्ट पाथ को अवैध अक्षरों की उपस्थिति की जाँच करके वैधता निर्धारित करता है। यदि पाथ में अवैध अक्षर होते हैं तो एक अपवाद फेंका जाता है।

```cpp
static void System::IO::Path::CheckPath(const String &path, const String &msg=s_msg_path, bool allow_empty=true)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | जाँचने के लिए पथ |
| msg | const String\& | अपवाद ऑब्जेक्ट के कंस्ट्रक्टर को पास करने के लिए संदेश |
| allow_empty | bool | निर्दिष्ट करता है कि क्या खाली या null स्ट्रिंग को सही पथ माना जाना चाहिए (true) या नहीं (false); यदि यह पैरामीटर false है और **path** खाली है तो ArgumentException फेंका जाता है; यदि यह पैरामीटर false है और **path** null है तो ArgumentNullException फेंका जाता है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [Path](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
