---
title: "System::IO::FileStream::FileStream कंस्ट्रक्टर"
linktitle: "FileStream"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::IO::FileStream क्लास के FileStream कंस्ट्रक्टर का उपयोग कैसे करें।"
type: docs
weight: 100
url: /hi/cpp/system.io/filestream/filestream/
---
## FileStream::FileStream(const FileStream\&) constructor




```cpp
System::IO::FileStream::FileStream(const FileStream &)=delete
```

## संबंधित देखें

* Class [FileStream](../)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode) constructor


निर्दिष्ट पैरामीटरों के साथ नई [FileStream](../) क्लास की एक नई इंस्टेंस बनाता है और उसे प्रारंभ करता है।

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | फ़ाइल को खोलने का पथ। |
| mode | FileMode | फ़ाइल को खोलने के मोड को निर्दिष्ट करता है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) constructor


निर्दिष्ट पैरामीटरों के साथ नई [FileStream](../) क्लास की एक नई इंस्टेंस बनाता है और उसे प्रारंभ करता है।

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share, int32_t buffer_size, bool useAsync)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | फ़ाइल को खोलने का पथ। |
| mode | FileMode | फ़ाइल को खोलने के मोड को निर्दिष्ट करता है। |
| पहुँच | FileAccess | अनुरोधित अभिगम प्रकार। |
| share | FileShare | अन्य [FileStream](../) वस्तुओं के पास खुले फ़ाइल तक पहुँच का प्रकार। |
| buffer_size | int32_t | पढ़ने और लिखने के संचालन के दौरान बफ़र किए गए बाइट्स की संख्या। |
| useAsync | bool | निर्दिष्ट करता है कि असिंक्रोनस I/O या सिंक्रोनस I/O का उपयोग करना है या नहीं। |
## टिप्पणियाँ



अधोस्तर ऑपरेटिंग सिस्टम असिंक्रोनस I/O का समर्थन नहीं कर सकता है।

## संबंधित देखें

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) constructor


निर्दिष्ट पैरामीटरों के साथ नई [FileStream](../) क्लास की एक नई इंस्टेंस बनाता है और उसे प्रारंभ करता है।

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::Read, int32_t buffer_size=DefaultBufferSize, FileOptions options=FileOptions::SequentialScan)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | फ़ाइल को खोलने का पथ। |
| mode | FileMode | फ़ाइल को खोलने के मोड को निर्दिष्ट करता है। |
| पहुँच | FileAccess | अनुरोधित अभिगम प्रकार। |
| share | FileShare | अन्य [FileStream](../) वस्तुओं के पास खुले फ़ाइल तक पहुँच का प्रकार। |
| buffer_size | int32_t | पढ़ने और लिखने के संचालन के दौरान बफ़र किए गए बाइट्स की संख्या। |
| विकल्प | FileOptions | अतिरिक्त विकल्प। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Enum [FileOptions](../../fileoptions/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
