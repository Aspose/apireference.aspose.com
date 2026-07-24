---
title: "System::CastEnumerableTo मेथड"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Page C++ के लिए"
description: "System::CastEnumerableTo मेथड। C++ में निर्दिष्ट एनेमरेबल ऑब्जेक्ट के तत्वों को विभिन्न प्रकार में स्पष्ट रूप से कास्ट करने का कार्य करता है।"
type: docs
weight: 15500
url: /hi/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


निर्दिष्ट एनेमरेबल ऑब्जेक्ट के तत्वों को विभिन्न प्रकार में स्पष्ट रूप से कास्ट करता है।

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| पैरामीटर | विवरण |
| --- | --- |
| को | एनेमरेबल ऑब्जेक्ट के तत्वों को स्थैतिक रूप से कास्ट करने के लिए प्रकार |
| From | एनेमरेबल ऑब्जेक्ट का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| एनेमरेबल | const From\& | कास्ट करने के लिए तत्वों को शामिल करने वाला Enumerable ऑब्जेक्ट |

### ReturnValue

एक नया संग्रह का पॉइंटर जो **To** प्रकार के तत्वों को शामिल करता है जो **enumerable** के तत्वों के बराबर है

## संबंधित देखें

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::CastEnumerableTo(const From\&) method


निर्दिष्ट एनेमरेबल ऑब्जेक्ट के तत्वों को विभिन्न प्रकार में स्पष्ट रूप से कास्ट करता है।

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| पैरामीटर | विवरण |
| --- | --- |
| को | एनेमरेबल ऑब्जेक्ट के तत्वों को स्थैतिक रूप से कास्ट करने के लिए प्रकार |
| From | एनेमरेबल ऑब्जेक्ट का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| एनेमरेबल | const From\& | एक Enumerable ऑब्जेक्ट का उत्तराधिकारी है जिसमें परिभाषित get_Count मेथड है और जो कास्ट करने के लिए तत्वों को शामिल करता है |

### ReturnValue

एक नया संग्रह का पॉइंटर जो **To** प्रकार के तत्वों को शामिल करता है जो **enumerable** के तत्वों के बराबर है

## संबंधित देखें

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
