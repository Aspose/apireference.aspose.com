---
title: "System::Is मेथड"
linktitle: "है"
second_title: "Aspose.Page C++ के लिए"
description: "System::Is मेथड। शीर्ष-स्तर मिलान फ़ंक्शन। C++ में किसी मान पर पैटर्न लागू करता है।"
type: docs
weight: 21900
url: /hi/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


शीर्ष-स्तर मिलान फ़ंक्शन। किसी मान पर पैटर्न लागू करता है।

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| पैरामीटर | विवरण |
| --- | --- |
| A | पैटर्न प्रकार (Details::Pattern से विरासत में लेना आवश्यक है)। |
| E | मिलाने के लिए मान का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| e | const E\& | जिस मान से मिलान करना है। |
| एक | const A\& | लागू करने के लिए पैटर्न। |

### ReturnValue

यदि पैटर्न मान से मेल खाता है तो true।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


'is' स्थिर पैटर्न अनुवाद को लागू करता है।

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| पैरामीटर | विवरण |
| --- | --- |
| ExpressionT | बाएँ अभिव्यक्ति प्रकार। |
| ConstantT | स्थिर अभिव्यक्ति का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाएँ | const ExpressionT\& | अभिव्यक्ति जिसे जाँच किया जाएगा। |
| स्थिर | const ConstantT\& | अभिव्यक्ति जिसे बाएँ वाले से तुलना किया जाएगा। |

### ReturnValue

यदि प्रकार जाँच सफल हो तो true, अन्यथा false।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


'is' घोषणा पैटर्न अनुवाद को लागू करता है।

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| पैरामीटर | विवरण |
| --- | --- |
| PatternT | जाँचने के लिए प्रकार। |
| ExpressionT | बाएँ अभिव्यक्ति प्रकार। |
| ResultT | परिणाम अभिव्यक्ति का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाएँ | const ExpressionT\& | अभिव्यक्ति जिसे जाँच किया जाएगा। |
| परिणाम | ResultT\& | वेरिएबल जिसे जाँचित प्रकार को असाइन किया जाएगा। |

### ReturnValue

यदि प्रकार जाँच सफल हो तो true, अन्यथा false।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
