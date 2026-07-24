---
title: "System::IO::FileInfo::Replace मेथड"
linktitle: "बदलें"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::FileInfo::Replace मेथड। निर्दिष्ट गंतव्य फ़ाइल की सामग्री को वर्तमान FileInfo ऑब्जेक्ट द्वारा दर्शाए गए फ़ाइल से बदलता है और C++ में बदली गई फ़ाइल का बैकअप बनाता है।"
type: docs
weight: 2000
url: /hi/cpp/system.io/fileinfo/replace/
---
## FileInfo::Replace(const String\&, const String\&) method


निर्दिष्ट गंतव्य फ़ाइल की सामग्री को वर्तमान [FileInfo](../) ऑब्जेक्ट द्वारा दर्शाए गए फ़ाइल से बदलता है और बदली गई फ़ाइल का बैकअप बनाता है।

```cpp
FileInfoPtr System::IO::FileInfo::Replace(const String &destinationFileName, const String &destinationBackupFileName)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| destinationFileName | const String\& | बदलने वाली फ़ाइल का नाम |
| destinationBackupFileName | const String\& | बैकअप फ़ाइल का नाम |

### ReturnValue

एक FileInfor ऑब्जेक्ट जो **destinationFileName** द्वारा इंगित फ़ाइल का प्रतिनिधित्व करता है

## संबंधित देखें

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileInfo::Replace(const String\&, const String\&, bool) method


निर्दिष्ट गंतव्य फ़ाइल की सामग्री को वर्तमान [FileInfo](../) ऑब्जेक्ट द्वारा दर्शाए गए फ़ाइल से बदलता है और बदली गई फ़ाइल का बैकअप बनाता है।

```cpp
FileInfoPtr System::IO::FileInfo::Replace(const String &destinationFileName, const String &destinationBackupFileName, bool ignoreMetadataErrors)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| destinationFileName | const String\& | बदलने वाली फ़ाइल का नाम |
| destinationBackupFileName | const String\& | बैकअप फ़ाइल का नाम |
| ignoreMetadataErrors | bool | निर्दिष्ट करता है कि बदली गई फ़ाइल से प्रतिस्थापन फ़ाइल में मर्ज त्रुटियों को (true) अनदेखा किया जाना चाहिए या (false) नहीं |

### ReturnValue

एक FileInfor ऑब्जेक्ट जो **destinationFileName** द्वारा इंगित फ़ाइल का प्रतिनिधित्व करता है

## संबंधित देखें

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
