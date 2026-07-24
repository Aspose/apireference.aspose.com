---
title: "System::Array::Sort मेथड"
linktitle: "Sort"
second_title: "Aspose.Page C++ के लिए"
description: "System::Array::Sort मेथड। दो एरे को सॉर्ट करता है, एक जिसमें कुंजियाँ होती हैं और दूसरा‑‑संबंधित आइटम्स, कुंजियों वाले एरे के मानों के आधार पर, जिन तत्वों की तुलना C++ में operator< द्वारा की जाती है।"
type: docs
weight: 5800
url: /hi/cpp/system/array/sort/
---
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) method


दो ऐरे को क्रमबद्ध करता है—एक जिसमें कुंजियाँ हैं और दूसरा‑ संबंधित आइटम—कुंजियों वाले ऐरे के मानों के आधार पर, जिनके तत्वों की तुलना operator< से की जाती है।

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items)
```


| पैरामीटर | विवरण |
| --- | --- |
| TKey | **keys** एरे में तत्वों का प्रकार |
| TValue | **items** एरे में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) जिसमें कुंजी मान होते हैं |
| items | const ArrayPtr\<TValue\>\& | [Array](../) जिसमें ऐसे आइटम होते हैं जो **keys** एरे में कुंजी मानों से मैप किए गए हैं |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) method


दो ऐरे को क्रमबद्ध करता है—एक जिसमें कुंजियाँ हैं और दूसरा‑ संबंधित आइटम—कुंजियों वाले ऐरे के मानों के आधार पर, जिनके तत्वों की तुलना डिफ़ॉल्ट तुलना करने वाले से की जाती है।

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items, int index, int length)
```


| पैरामीटर | विवरण |
| --- | --- |
| TKey | **keys** एरे में तत्वों का प्रकार |
| TValue | **items** एरे में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) जिसमें कुंजी मान होते हैं |
| items | const ArrayPtr\<TValue\>\& | [Array](../) जिसमें ऐसे आइटम होते हैं जो **keys** एरे में कुंजी मानों से मैप किए गए हैं |
| सूचकांक | int | सॉर्ट करने के लिए रेंज की शुरुआत को दर्शाने वाला सूचकांक |
| length | int | सॉर्ट करने के लिए रेंज में तत्वों की संख्या |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&) method


डिफ़ॉल्ट तुलना करने वाले का उपयोग करके निर्दिष्ट ऐरे में तत्वों को क्रमबद्ध करता है।

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | लक्षित एरे |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


निर्दिष्ट तुलना करने वाले का उपयोग करके निर्दिष्ट ऐरे में तत्वों को क्रमबद्ध करता है।

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparator)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | लक्षित एरे |
| तुलनाकार | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | एरे के तत्वों की तुलना करने के लिए उपयोग किया जाने वाला IComparer<T> ऑब्जेक्ट |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) method


लागू नहीं किया गया।

```cpp
template<typename Type,typename Y> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<Y>> &comparator)
```


## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, int, int) method


डिफ़ॉल्ट तुलना करने वाले का उपयोग करके निर्दिष्ट ऐरे में तत्वों की एक रेंज को क्रमबद्ध करता है।

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, int startIndex, int count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | लक्षित एरे |
| startIndex | int | सॉर्ट करने के लिए तत्वों की रेंज की शुरुआत को दर्शाने वाला सूचकांक |
| count | int | सॉर्ट करने के लिए तत्वों की रेंज का आकार |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
