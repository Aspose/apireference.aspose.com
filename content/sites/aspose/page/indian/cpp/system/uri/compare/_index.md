---
title: "System::Uri::Compare मेथड"
linktitle: "Compare"
second_title: "Aspose.Page C++ के लिए"
description: "System::Uri::Compare मेथड। निर्दिष्ट तुलना नियमों का उपयोग करके निर्दिष्ट Uri ऑब्जेक्ट्स की C++ में तुलना करता है।"
type: docs
weight: 3500
url: /hi/cpp/system/uri/compare/
---
## Uri::Compare method


निर्दिष्ट तुलना नियमों का उपयोग करके निर्दिष्ट [Uri](../) ऑब्जेक्ट्स की तुलना करता है।

```cpp
static int32_t System::Uri::Compare(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2, UriComponents partsToCompare, UriFormat compareFormat, StringComparison comparisonType)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | पहला तुलनात्मक मान |
| uri2 | const SharedPtr\<Uri\>\& | दूसरा तुलनात्मक मान |
| partsToCompare | UriComponents | **uri1** और **uri2** के तुलना करने के भागों को निर्दिष्ट करता है |
| compareFormat | UriFormat | जब URIs के घटकों की तुलना की जाती है तो उपयोग किए जाने वाले अक्षर एस्केपिंग को निर्दिष्ट करता है |
| comparisonType | StringComparison | [StringComparison](../../stringcomparison/) मानों में से एक |

### ReturnValue

**uri1** यदि **uri2** से छोटा हो तो नकारात्मक मान; यदि uri1 और uri2 बराबर हों तो 0; यदि **uri1** **uri2** से बड़ा हो तो सकारात्मक मान

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Enum [UriComponents](../../uricomponents/)
* Enum [UriFormat](../../uriformat/)
* Enum [StringComparison](../../stringcomparison/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
