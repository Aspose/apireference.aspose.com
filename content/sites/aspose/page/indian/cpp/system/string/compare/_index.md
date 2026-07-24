---
title: "System::String::Compare मेथड"
linktitle: "Compare"
second_title: "Aspose.Page C++ के लिए"
description: "System::String::Compare मेथड। लेस-इक्वल-ग्रेटर दो स्ट्रिंग्स की तुलना C++ में करता है।"
type: docs
weight: 6200
url: /hi/cpp/system/string/compare/
---
## String::Compare(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


लेस-इक्वल-ग्रेटर दो स्ट्रिंग्स की तुलना करता है।

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| strA | const String\& | तुलना करने के लिए पहली स्ट्रिंग। |
| strB | const String\& | तुलना करने के लिए दूसरी स्ट्रिंग। |
| ignoreCase | bool | निर्दिष्ट करता है कि तुलना केस-इनसेंसिटिव है या नहीं। |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | तुलना के लिए उपयोग करने वाली संस्कृति। |

### ReturnValue

यदि पहला उपस्ट्रिंग दूसरे से छोटा है तो नकारात्मक मान, यदि वे मेल खाते हैं तो शून्य, अन्यथा सकारात्मक मान।

## संबंधित देखें

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, const String\&, bool) method


लेस-इक्वल-ग्रेटर दो स्ट्रिंग्स की तुलना करता है।

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase=false)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| strA | const String\& | तुलना करने के लिए पहली स्ट्रिंग। |
| strB | const String\& | तुलना करने के लिए दूसरी स्ट्रिंग। |
| ignoreCase | bool | निर्दिष्ट करता है कि तुलना केस-इनसेंसिटिव है या नहीं। |

### ReturnValue

यदि पहला उपस्ट्रिंग दूसरे से छोटा है तो नकारात्मक मान, यदि वे मेल खाते हैं तो शून्य, अन्यथा सकारात्मक मान।

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, const String\&, System::StringComparison) method


लेस-इक्वल-ग्रेटर दो स्ट्रिंग्स की तुलना करता है।

```cpp
static int System::String::Compare(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| strA | const String\& | तुलना करने के लिए पहली स्ट्रिंग। |
| strB | const String\& | तुलना करने के लिए दूसरी स्ट्रिंग। |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) मोड। |

### ReturnValue

यदि पहला उपस्ट्रिंग दूसरे से छोटा है तो नकारात्मक मान, यदि वे मेल खाते हैं तो शून्य, अन्यथा सकारात्मक मान।

## संबंधित देखें

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


लेस-इक्वल-ग्रेटर दो उपस्ट्रिंग्स की तुलना करता है।

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| strA | const String\& | तुलना करने के लिए पहली स्ट्रिंग। |
| indexA | int | पहले स्ट्रिंग उपस्ट्रिंग की शुरुआत। |
| strB | const String\& | तुलना करने के लिए दूसरी स्ट्रिंग। |
| indexB | int | दूसरे स्ट्रिंग उपस्ट्रिंग की शुरुआत। |
| length | int | तुलना करने के लिए अक्षरों की संख्या। |
| ignoreCase | bool | निर्दिष्ट करता है कि तुलना केस-इनसेंसिटिव है या नहीं। |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | तुलना के लिए उपयोग करने वाली संस्कृति। |

### ReturnValue

यदि पहला उपस्ट्रिंग दूसरे से छोटा है तो नकारात्मक मान, यदि वे मेल खाते हैं तो शून्य, अन्यथा सकारात्मक मान।

## संबंधित देखें

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool) method


लेस-इक्वल-ग्रेटर दो उपस्ट्रिंग्स की तुलना करता है।

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase=false)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| strA | const String\& | तुलना करने के लिए पहली स्ट्रिंग। |
| indexA | int | पहले स्ट्रिंग उपस्ट्रिंग की शुरुआत। |
| strB | const String\& | तुलना करने के लिए दूसरी स्ट्रिंग। |
| indexB | int | दूसरे स्ट्रिंग उपस्ट्रिंग की शुरुआत। |
| length | int | तुलना करने के लिए अक्षरों की संख्या। |
| ignoreCase | bool | निर्दिष्ट करता है कि तुलना केस-इनसेंसिटिव है या नहीं। |

### ReturnValue

यदि पहला उपस्ट्रिंग दूसरे से छोटा है तो नकारात्मक मान, यदि वे मेल खाते हैं तो शून्य, अन्यथा सकारात्मक मान।

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, System::StringComparison) method


लेस-इक्वल-ग्रेटर दो स्ट्रिंग्स की तुलना करता है।

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, System::StringComparison comparison_type)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| strA | const String\& | तुलना करने के लिए पहली स्ट्रिंग। |
| indexA | int | पहले स्ट्रिंग उपस्ट्रिंग की शुरुआत। |
| strB | const String\& | तुलना करने के लिए दूसरी स्ट्रिंग। |
| indexB | int | दूसरे स्ट्रिंग उपस्ट्रिंग की शुरुआत। |
| length | int | तुलना करने के लिए अक्षरों की संख्या। |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) मोड। |

### ReturnValue

यदि पहला उपस्ट्रिंग दूसरे से छोटा है तो नकारात्मक मान, यदि वे मेल खाते हैं तो शून्य, अन्यथा सकारात्मक मान।

## संबंधित देखें

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
