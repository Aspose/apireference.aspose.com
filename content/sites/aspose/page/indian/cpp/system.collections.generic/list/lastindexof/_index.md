---
title: "System::Collections::Generic::List::LastIndexOf मेथड"
linktitle: "LastIndexOf"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::List::LastIndexOf मेथड. निर्दिष्ट ऑब्जेक्ट को खोजता है और C++ में पूरी सूची में अंतिम घटना का शून्य-आधारित इंडेक्स लौटाता है।"
type: docs
weight: 3400
url: /hi/cpp/system.collections.generic/list/lastindexof/
---
## List::LastIndexOf(const T\&) const method


निर्दिष्ट ऑब्जेक्ट की खोज करता है और पूरी सूची में अंतिम आवृत्ति का शून्य-आधारित इंडेक्स लौटाता है।

```cpp
int32_t System::Collections::Generic::List<T>::LastIndexOf(const T &item) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| आइटम | const T\& | सूची में खोजने के लिए ऑब्जेक्ट |

### ReturnValue

यदि पाया जाए तो पूरी [List](../) में आइटम की अंतिम घटना का शून्य-आधारित इंडेक्स; अन्यथा, -1।

## संबंधित देखें

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::LastIndexOf(const T\&, int32_t) const method


निर्दिष्ट ऑब्जेक्ट को खोजता है और [List](../) में तत्वों की रेंज के भीतर, जो पहले तत्व से लेकर निर्दिष्ट इंडेक्स तक विस्तारित है, अंतिम घटना का शून्य-आधारित इंडेक्स लौटाता है।

```cpp
int32_t System::Collections::Generic::List<T>::LastIndexOf(const T &item, int32_t index) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| आइटम | const T\& | सूची में खोजने के लिए ऑब्जेक्ट |
| सूचकांक | int32_t | पीछे की खोज का शून्य-आधारित प्रारंभिक इंडेक्स। |

### ReturnValue

यदि पाया जाए तो [List](../) में तत्वों की रेंज के भीतर, जो पहले तत्व से इंडेक्स तक विस्तारित है, आइटम की अंतिम घटना का शून्य-आधारित इंडेक्स; अन्यथा, -1।

## संबंधित देखें

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::LastIndexOf(const T\&, int32_t, int32_t) const method


निर्दिष्ट ऑब्जेक्ट को खोजता है और [List](../) में तत्वों की रेंज के भीतर, जिसमें निर्दिष्ट संख्या में तत्व हैं और जो निर्दिष्ट इंडेक्स पर समाप्त होती है, अंतिम घटना का शून्य-आधारित इंडेक्स लौटाता है।

```cpp
int32_t System::Collections::Generic::List<T>::LastIndexOf(const T &item, int32_t index, int32_t count) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| item | const T\& | [List](../) में खोजने के लिए ऑब्जेक्ट |
| सूचकांक | int32_t | पीछे की खोज का शून्य-आधारित प्रारंभिक इंडेक्स। |
| count | int32_t | खोजे जाने वाले भाग में तत्वों की संख्या। |

### ReturnValue

यदि पाया जाए तो [List](../) में तत्वों की रेंज के भीतर, जिसमें count संख्या में तत्व हैं और जो इंडेक्स पर समाप्त होती है, आइटम की अंतिम घटना का शून्य-आधारित इंडेक्स; अन्यथा, -1।

## संबंधित देखें

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
