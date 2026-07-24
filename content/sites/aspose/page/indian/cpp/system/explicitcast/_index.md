---
title: "System::ExplicitCast विधि।"
linktitle: "स्पष्टकास्ट"
second_title: "Aspose.Page C++ के लिए"
description: "System::ExplicitCast विधि। स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। C++ में तब उपयोग किया जाता है जब स्रोत और परिणाम प्रकार समान हों।"
type: docs
weight: 18500
url: /hi/cpp/system/explicitcast/
---
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। तब उपयोग किया जाता है जब स्रोत और परिणाम प्रकार समान हों।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। जब सरल कंस्ट्रक्टर-सम प्रकार का कास्ट आवश्यक हो, तब उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। अपवाद रैपर के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। वस्तु को अपवाद में कास्ट करने के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। जब स्रोत और परिणाम दोनों स्मार्ट पॉइंटर हों (परिणाम प्रकार में स्पष्ट रूप से [SmartPtr<...>](../smartptr/) न हो) तब उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। जब स्रोत और परिणाम दोनों स्मार्ट पॉइंटर हों (परिणाम प्रकार में स्पष्ट रूप से [SmartPtr<...>](../smartptr/) हो) तब उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। वस्तु को nullable में अनबॉक्स करने के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। nullable को बॉक्स करने के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। nullable वस्तु को अनबॉक्स करने के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableUnboxing, Result> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। enum को बॉक्स करने के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::EnumBoxing, SmartPtr<BoxedValueBase>> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। जब मान प्रकार को हीप पर कॉपी करना हो और मान प्रकार को स्मार्ट पॉइंटर के रूप में संदर्भित किया जाना चाहिए (जेनरिक्स में इंटरफ़ेस प्रकार के साथ प्रतिबंधित लेकिन इस इंटरफ़ेस को लागू करने वाली संरचना के साथ विशेषीकृत) तब उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::HeapifyBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। मान प्रकार से इंटरफ़ेस प्राप्त करने के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। सामान्य बॉक्सिंग के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। [System::String](../string/) की बॉक्सिंग के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::StringBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। इंटरफ़ेस को अनबॉक्स करने के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxing, Result> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। सामान्य अनबॉक्सिंग के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Unboxing, Result> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। nullptr कास्टिंग के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। एरेज़ के बीच कास्टिंग के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(Source) method


स्पष्ट कास्ट का उपयोग करके स्रोत प्रकार को परिणाम प्रकार में बदलता है। जब कच्चे पॉइंटर को स्मार्ट पॉइंटर में कास्ट किया जाता है, तब उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::RawPointer, typename CastResult<std::remove_pointer_t<Result>>::type> System::ExplicitCast(Source value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | Source | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
