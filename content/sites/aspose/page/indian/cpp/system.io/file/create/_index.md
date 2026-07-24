---
title: "System::IO::File::Create मेथड"
linktitle: "बनाएँ"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::File::Create मेथड। निर्दिष्ट बफ़र आकार और विकल्पों का उपयोग करके एक नई फ़ाइल बनाता है (या मौजूदा को ओवरराइट करता है) और पढ़ने व लिखने के लिए खोलता है C++ में।"
type: docs
weight: 500
url: /hi/cpp/system.io/file/create/
---
## File::Create method


निर्दिष्ट बफ़र आकार और विकल्पों का उपयोग करके एक नई फ़ाइल (या मौजूदा को अधिलेखित) बनाता है और उसे पढ़ने व लिखने के लिए खोलता है।

```cpp
static FileStreamPtr System::IO::File::Create(const String &path, int32_t bufferSize=DefaultBufferSize, FileOptions options=FileOptions::None)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | बनाने या ओवरराइट करने वाली फ़ाइल का पथ |
| bufferSize | int32_t | फ़ाइल से पढ़ते और लिखते समय बफ़र किए गए बाइट्स की संख्या |
| विकल्प | FileOptions | फ़ाइल को कैसे बनाना या ओवरराइट करना है, यह निर्दिष्ट करता है |

### ReturnValue

निर्दिष्ट फ़ाइल से जुड़े [FileStream](../../filestream/) ऑब्जेक्ट का एक साझा पॉइंटर

## संबंधित देखें

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileOptions](../../fileoptions/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
