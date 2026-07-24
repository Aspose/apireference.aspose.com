---
title: "System::IO::File::Open मेथड"
linktitle: "Open"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::File::Open मेथड. निर्दिष्ट फ़ाइल को निर्दिष्ट मोड में पढ़ने और लिखने के लिए खोलता है और C++ में कोई शेयरिंग नहीं करता।"
type: docs
weight: 1900
url: /hi/cpp/system.io/file/open/
---
## File::Open(const String\&, FileMode) method


निर्दिष्ट फ़ाइल को निर्दिष्ट मोड में पढ़ने और लिखने के लिए खोलता है और बिना साझा किए।

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | खोलने के लिए फ़ाइल का पथ |
| mode | FileMode | फ़ाइल को खोलने के मोड को निर्दिष्ट करता है |

### ReturnValue

खुले हुए फ़ाइल से जुड़े एक [FileStream](../../filestream/) ऑब्जेक्ट

## संबंधित देखें

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## File::Open(const String\&, FileMode, FileAccess, FileShare) method


निर्दिष्ट फ़ाइल को निर्दिष्ट मोड में, निर्दिष्ट पहुँच प्रकार और साझा विकल्प के साथ खोलता है।

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::None)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | खोलने के लिए फ़ाइल का पथ |
| mode | FileMode | फ़ाइल को खोलने के मोड को निर्दिष्ट करता है |
| पहुँच | FileAccess | अनुरोधित अभिगम प्रकार |
| share | FileShare | अन्य [FileStream](../../filestream/) ऑब्जेक्ट्स द्वारा खुले फ़ाइल तक पहुंच का प्रकार |

### ReturnValue

खुले हुए फ़ाइल से जुड़े एक [FileStream](../../filestream/) ऑब्जेक्ट

## संबंधित देखें

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
