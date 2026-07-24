---
title: "System::Uri::TryCreate मेथड"
linktitle: "TryCreate"
second_title: "Aspose.Page C++ के लिए"
description: "System::Uri::TryCreate मेथड। निर्दिष्ट बेस और रिलेटिव URI से C++ में एक Uri ऑब्जेक्ट बनाता है।"
type: docs
weight: 4400
url: /hi/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


निर्दिष्ट बेस और रिलेटिव URI से एक [Uri](../) ऑब्जेक्ट बनाता है।

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | बेस URI |
| relativeUri | const SharedPtr\<Uri\>\& | रिलेटिव URI जो बेस URI में जोड़ा जाता है |
| result | SharedPtr\<Uri\>\& | आउटपुट आर्ग्युमेंट जो, यदि निर्माण सफल होता है, मेथड रिटर्न पर नए निर्मित [Uri](../) ऑब्जेक्ट की ओर संकेत करता है |

### ReturnValue

यदि निर्माण सफल हुआ तो true, अन्यथा false

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


निर्दिष्ट बेस URI का प्रतिनिधित्व करने वाले [Uri](../) ऑब्जेक्ट और रिलेटिव URI की स्ट्रिंग प्रतिनिधित्व से एक [Uri](../) ऑब्जेक्ट बनाता है।

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | बेस URI |
| relativeUri | const String\& | रिलेटिव URI जो बेस URI में जोड़ा जाता है |
| result | SharedPtr\<Uri\>\& | आउटपुट आर्ग्युमेंट जो, यदि निर्माण सफल होता है, मेथड रिटर्न पर नए निर्मित [Uri](../) ऑब्जेक्ट की ओर संकेत करता है |

### ReturnValue

यदि निर्माण सफल हुआ तो true, अन्यथा false

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


निर्दिष्ट URI का प्रतिनिधित्व करने वाला एक [Uri](../) ऑब्जेक्ट बनाता है; एक आर्ग्युमेंट URI प्रकार को निर्दिष्ट करता है।

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| uriString | const String\& | वह स्ट्रिंग URI जिसे निर्मित हो रहे ऑब्जेक्ट द्वारा प्रतिनिधित्व किया जाएगा |
| uriKind | UriKind | URI प्रकार को निर्दिष्ट करता है |
| result | SharedPtr\<Uri\>\& | आउटपुट आर्ग्युमेंट जो, यदि निर्माण सफल होता है, मेथड रिटर्न पर नए निर्मित [Uri](../) ऑब्जेक्ट की ओर संकेत करता है |

### ReturnValue

यदि निर्माण सफल हुआ तो true, अन्यथा false

## संबंधित देखें

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
