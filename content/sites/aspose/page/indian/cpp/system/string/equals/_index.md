---
title: "System::String::Equals मेथड"
linktitle: "बराबर"
second_title: "Aspose.Page C++ के लिए"
description: "System::String::Equals मेथड। स्ट्रिंग समानता तुलना। C++ में System::StringComparison::Ordinal तुलना मोड का उपयोग करता है।"
type: docs
weight: 1100
url: /hi/cpp/system/string/equals/
---
## String::Equals(const String\&) const method


[String](../) equality comparison. Uses [System::StringComparison::Ordinal](../../stringcomparison/) comparison mode.

```cpp
bool System::String::Equals(const String &str) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | [String](../) वर्तमान के विरुद्ध तुलना करने के लिए। |

### ReturnValue

यदि स्ट्रिंग्स मेल खाती हैं तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, System::StringComparison) const method


[String](../) equality comparison. Several modes provided by [StringComparison](../../stringcomparison/) enumeration are supported.

```cpp
bool System::String::Equals(const String &str, System::StringComparison comparison_type) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | [String](../) वर्तमान के विरुद्ध तुलना करने के लिए। |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) मोड (विवरण के लिए देखें [System::StringComparison](../../stringcomparison/))। |

### ReturnValue

यदि स्ट्रिंग्स चयनित तुलना प्रकार से मेल खाती हैं तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, const String\&) method


इक्वल दो स्ट्रिंग्स की तुलना ऑर्डिनल तुलना मोड का उपयोग करके करता है।

```cpp
static bool System::String::Equals(const String &strA, const String &strB)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| strA | const String\& | तुलना करने के लिए पहली स्ट्रिंग। |
| strB | const String\& | तुलना करने के लिए दूसरी स्ट्रिंग। |

### ReturnValue

यदि स्ट्रिंग्स मेल खाती हैं तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, const String\&, System::StringComparison) method


इक्वल दो स्ट्रिंग्स की तुलना करता है।

```cpp
static bool System::String::Equals(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| strA | const String\& | तुलना करने के लिए पहली स्ट्रिंग। |
| strB | const String\& | तुलना करने के लिए दूसरी स्ट्रिंग। |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) मोड। |

### ReturnValue

यदि स्ट्रिंग्स मेल खाती हैं तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
