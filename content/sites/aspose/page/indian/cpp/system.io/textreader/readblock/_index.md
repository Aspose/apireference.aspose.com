---
title: "System::IO::TextReader::ReadBlock method"
linktitle: "ReadBlock"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::TextReader::ReadBlock method. वर्तमान टेक्स्ट रीडर से निर्दिष्ट अधिकतम संख्या में अक्षर पढ़ता है और डेटा को एक बफ़र में लिखता है, C++ में निर्दिष्ट इंडेक्स से शुरू होते हुए।"
type: docs
weight: 500
url: /hi/cpp/system.io/textreader/readblock/
---
## TextReader::ReadBlock method


वर्तमान टेक्स्ट रीडर से निर्दिष्ट अधिकतम संख्या में अक्षर पढ़ता है और डेटा को निर्दिष्ट इंडेक्स से शुरू होते हुए बफ़र में लिखता है।

```cpp
virtual int System::IO::TextReader::ReadBlock(ArrayPtr<char_t> buffer, int index, int count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | ArrayPtr\<char_t\> | पढ़े गए डेटा को लिखने के लिए एक अक्षर बफ़र |
| सूचकांक | int | **buffer** में लिखना शुरू करने के लिए 0-आधारित सूचकांक |
| count | int | पढ़ने के लिए अधिकतम अक्षरों की संख्या |

### ReturnValue

वास्तव में पढ़े गए अक्षरों की संख्या

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
