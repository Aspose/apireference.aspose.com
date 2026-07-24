---
title: "System::operator- method"
linktitle: "operator-"
second_title: "Aspose.Page C++ के लिए"
description: "System::operator- method. C++ में निर्दिष्ट मान से निर्दिष्ट Decimal ऑब्जेक्ट द्वारा दर्शाए गए मान को घटाने के परिणाम को दर्शाने वाला Decimal क्लास का नया इंस्टेंस लौटाता है।"
type: docs
weight: 28100
url: /hi/cpp/system/operator-/
---
## System::operator-(const T\&, const Decimal\&) method


निर्दिष्ट मान से निर्दिष्ट [Decimal](../decimal/) ऑब्जेक्ट द्वारा दर्शाए गए मान को घटाने के परिणाम को दर्शाने वाला [Decimal](../decimal/) क्लास का नया इंस्टेंस लौटाता है।

```cpp
template<typename T,typename _> Decimal System::operator-(const T &x, const Decimal &d)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | const T\& | वह मान जिससे घटाना है |
| d | const Decimal\& | वह [Decimal](../decimal/) वस्तु जो घटाए गए मान का प्रतिनिधित्व करती है |

### ReturnValue

एक नया [Decimal](../decimal/) वर्ग का उदाहरण जो एक मान का प्रतिनिधित्व करता है जो **x** से **d** द्वारा दर्शाए गए मान को घटाने के परिणामस्वरूप प्राप्त होता है।

## संबंधित देखें

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(const T1\&, const Nullable\<T2\>\&) method


नॉन-नल और नल योग्य मानों को घटाता है।

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some - other.get_Value())> System::operator-(const T1 &some, const Nullable<T2> &other)
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | बाएँ ऑपरेण्ड प्रकार। |
| T2 | दाएँ ऑपरेण्ड प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुछ | const T1\& | बाएँ ऑपरेण्ड। |
| अन्य | const Nullable\<T2\>\& | दाएँ ऑपरेण्ड। |

### ReturnValue

सबस्टेशन परिणाम।

## संबंधित देखें

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(DayOfWeek, DayOfWeek) method


सप्ताह के दो दिनों के बीच दिनों की संख्या की गणना करता है।

```cpp
auto System::operator-(DayOfWeek a, DayOfWeek b)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| एक | DayOfWeek | घटावकर्ता |
| b | DayOfWeek | घटाव्य |

### ReturnValue

सप्ताह के कार्यदिवस **a** और **b** के बीच दिनों की संख्या; यदि *goes* के बाद **** हो तो लौटाया गया मान नकारात्मक संख्या होगा।

## संबंधित देखें

* Enum [DayOfWeek](../dayofweek/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


बाएँ हाथ के डेलीगेट कॉलबैक सूची के अंत से दाएँ हाथ के डेलीगेट में सभी कॉलबैक को डिस्कनेक्ट करता है।

```cpp
template<typename T> MulticastDelegate<T> System::operator-(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | वह डेलीगेट जिससे कॉलबैक हटाए जाएंगे। |
| rhv | MulticastDelegate\<T\> | वह डेलीगेट जिसके कॉलबैक हटाए जाएंगे। |

### ReturnValue

एक डेलीगेट लौटाता है जिसमें बाएँ हाथ के मान के कॉलबैक शामिल होते हैं, लेकिन दाएँ हाथ के मान के कॉलबैक नहीं होते।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
