---
title: "System::Array::LastIndexOf method"
linktitle: "LastIndexOf"
second_title: "Aspose.Page C++ के लिए"
description: "System::Array::LastIndexOf मेथड। एरे के उन आइटम्स की रेंज में, जो प्रारंभिक इंडेक्स और रेंज में तत्वों की संख्या द्वारा निर्दिष्ट है, निर्दिष्ट आइटम की अंतिम उपस्थिति का इंडेक्स निर्धारित करता है C++ में।"
type: docs
weight: 5500
url: /hi/cpp/system/array/lastindexof/
---
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


शुरूआती सूचकांक और रेंज में तत्वों की संख्या द्वारा निर्दिष्ट रेंज में ऐरे के आइटमों में निर्दिष्ट आइटम की अंतिम उपस्थिति का सूचकांक निर्धारित करता है।

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| पैरामीटर | विवरण |
| --- | --- |
| ArrayType | लक्ष्य ऐरे में तत्वों का प्रकार |
| ValueType | एरे में खोजे जाने वाले आइटम का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) में निर्दिष्ट आइटम को खोजने के लिए |
| मान | const ValueType\& | जिस आइटम का इंडेक्स निर्धारित करना है |
| startIndex | int | सर्च शुरू होने का इंडेक्स |
| count | int | सर्च करने वाली रेंज में तत्वों की संख्या |

### ReturnValue

यदि आइटम मिला तो निर्दिष्ट आइटम की अंतिम उपस्थिति का इंडेक्स, अन्यथा -1

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


ऐरे में निर्दिष्ट आइटम की अंतिम उपस्थिति का सूचकांक निर्धारित करता है।

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| ArrayType | लक्ष्य ऐरे में तत्वों का प्रकार |
| ValueType | एरे में खोजे जाने वाले आइटम का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../) में निर्दिष्ट आइटम को खोजने के लिए |
| मान | const ValueType\& | जिस आइटम का इंडेक्स निर्धारित करना है |

### ReturnValue

यदि आइटम मिला तो निर्दिष्ट आइटम की अंतिम उपस्थिति का इंडेक्स, अन्यथा -1

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


निर्दिष्ट सूचकांक से शुरू करके ऐरे में निर्दिष्ट आइटम की अंतिम उपस्थिति का सूचकांक निर्धारित करता है।

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value, int startIndex)
```


| पैरामीटर | विवरण |
| --- | --- |
| ArrayType | लक्ष्य ऐरे में तत्वों का प्रकार |
| ValueType | एरे में खोजे जाने वाले आइटम का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../) में निर्दिष्ट आइटम को खोजने के लिए |
| मान | const ValueType\& | जिस आइटम का इंडेक्स निर्धारित करना है |
| startIndex | int | सर्च शुरू होने का इंडेक्स |

### ReturnValue

यदि आइटम मिला तो निर्दिष्ट आइटम की अंतिम उपस्थिति का इंडेक्स, अन्यथा -1

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
