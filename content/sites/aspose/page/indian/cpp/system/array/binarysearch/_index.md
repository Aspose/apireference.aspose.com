---
title: "System::Array::BinarySearch method"
linktitle: "BinarySearch"
second_title: "Aspose.Page C++ के लिए"
description: "System::Array::BinarySearch मेथड। सॉर्टेड एरे में बाइनरी सर्च करता है C++ में।"
type: docs
weight: 4600
url: /hi/cpp/system/array/binarysearch/
---
## Array::BinarySearch(System::ArrayPtr\<T\>, const T\&) method


सॉर्टेड एरे में बाइनरी सर्च करता है।

```cpp
static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const T &item)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | सर्च करने के लिए सॉर्टेड एरे |
| आइटम | const T\& | खोजने के लिए एक आइटम |

### ReturnValue

यदि खोजा गया आइटम मिला तो उसका इंडेक्स, अन्यथा एक नकारात्मक पूर्णांक जो खोजे गए आइटम से बड़ा अगला आइटम का इंडेक्स का बिटवाइज़ कॉम्प्लीमेंट है या यदि बड़ा आइटम नहीं है तो एरे में तत्वों की संख्या का बिटवाइज़ कॉम्प्लीमेंट है।

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::BinarySearch(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) method


लागू नहीं किया गया।

```cpp
template<typename Y,typename Z> static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const Y &item, const SharedPtr<Collections::Generic::IComparer<Z>> &comparer)
```


## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
