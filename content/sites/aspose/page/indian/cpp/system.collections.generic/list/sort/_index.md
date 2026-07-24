---
title: "System::Collections::Generic::List::Sort method"
linktitle: "Sort"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::List::Sort method. C++ में डिफ़ॉल्ट कंपेरेटर का उपयोग करके सूची में तत्वों को क्रमबद्ध करता है।"
type: docs
weight: 4400
url: /hi/cpp/system.collections.generic/list/sort/
---
## List::Sort() method


डिफ़ॉल्ट तुलना करने वाले का उपयोग करके सूची में तत्वों को क्रमबद्ध करता है.

```cpp
void System::Collections::Generic::List<T>::Sort()
```

## संबंधित देखें

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::Sort(Comparison\<T\>, bool) method


सूची में तत्वों को क्रमबद्ध करता है.

```cpp
void System::Collections::Generic::List<T>::Sort(Comparison<T> comparison, bool)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| comparison | Comparison\<T\> | [Comparison](../../../system/comparison/) उपयोग करने के लिए। |

## संबंधित देखें

* Class [Comparison](../../../system/comparison/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::Sort(const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


सूची में तत्वों को क्रमबद्ध करता है.

```cpp
void System::Collections::Generic::List<T>::Sort(const SharedPtr<System::Collections::Generic::IComparer<T>> &comparator)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| तुलनाकार | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | उपयोग करने के लिए तुलनाकार। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IComparer](../../icomparer/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::Sort(int, int, SharedPtr\<System::Collections::Generic::IComparer\<T\>\>) method


सूची स्लाइस में तत्वों को क्रमबद्ध करता है.

```cpp
void System::Collections::Generic::List<T>::Sort(int index, int count, SharedPtr<System::Collections::Generic::IComparer<T>> comparator)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | स्लाइस की प्रारम्भिक इंडेक्स। |
| count | int | स्लाइस का आकार। |
| तुलनाकार | SharedPtr\<System::Collections::Generic::IComparer\<T\>\> | उपयोग करने के लिए तुलनाकार। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IComparer](../../icomparer/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
