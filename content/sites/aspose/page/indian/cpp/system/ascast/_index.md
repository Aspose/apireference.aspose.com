---
title: "System::AsCast मेथड"
linktitle: "AsCast"
second_title: "Aspose.Page C++ के लिए"
description: "System::AsCast मेथड। स्रोत प्रकार को परिणाम प्रकार में ''as'' ऑपरेटर कास्ट का उपयोग करके कास्ट करता है। C++ में जब सरल कंस्ट्रक्टर-सम प्रकार का कास्ट आवश्यक हो तब उपयोग किया जाता है।"
type: docs
weight: 13500
url: /hi/cpp/system/ascast/
---
## System::AsCast(const Source\&) method


स्रोत प्रकार को परिणाम प्रकार में 'as' ऑपरेटर कास्ट का उपयोग करके कास्ट करता है। जब सरल कंस्ट्रक्टर-सम प्रकार का कास्ट आवश्यक हो तब उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


स्रोत प्रकार को 'as' ऑपरेटर कास्ट का उपयोग करके परिणाम प्रकार में कास्ट करता है। जब स्रोत और परिणाम प्रकार समान हों तब उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


स्रोत प्रकार को 'as' ऑपरेटर कास्ट का उपयोग करके परिणाम प्रकार में कास्ट करता है। एक्सेप्शन रैपर के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::AsCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम। यदि कोई रूपांतरण उपलब्ध नहीं है तो nullptr लौटाता है।

## संबंधित देखें

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


स्रोत प्रकार को 'as' ऑपरेटर कास्ट का उपयोग करके परिणाम प्रकार में कास्ट करता है। ऑब्जेक्ट को एक्सेप्शन में कास्ट करने के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::AsCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम। यदि कोई रूपांतरण उपलब्ध नहीं है तो nullptr लौटाता है।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


स्रोत प्रकार को 'as' ऑपरेटर कास्ट का उपयोग करके परिणाम प्रकार में कास्ट करता है। जब स्रोत और परिणाम दोनों स्मार्ट पॉइंटर हों तब उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम। यदि कोई रूपांतरण उपलब्ध नहीं है तो nullptr लौटाता है।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


स्रोत प्रकार को 'as' ऑपरेटर कास्ट का उपयोग करके परिणाम प्रकार में कास्ट करता है। जब स्रोत और परिणाम दोनों स्मार्ट पॉइंटर हों (परिणाम प्रकार में स्पष्ट रूप से [SmartPtr<...>](../smartptr/) के साथ) तब उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::AsCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम। यदि कोई रूपांतरण उपलब्ध नहीं है तो nullptr लौटाता है।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


स्रोत प्रकार को 'as' ऑपरेटर कास्ट का उपयोग करके परिणाम प्रकार में कास्ट करता है। ऑब्जेक्ट को nullable में अनबॉक्स करने के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::AsCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम। यदि कोई रूपांतरण उपलब्ध नहीं है तो खाली nullable लौटाता है।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


स्रोत प्रकार को 'as' ऑपरेटर कास्ट का उपयोग करके परिणाम प्रकार में कास्ट करता है। गैर-ऑब्जेक्ट प्रकार में अवैध अनबॉक्सिंग।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxingToNullable, Result> System::AsCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

हमेशा null लौटाता है।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


गैर-ऑब्जेक्ट प्रकार में अवैध अनबॉक्सिंग।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InvalidUnboxing, Result> System::AsCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

हमेशा null लौटाता है।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


स्रोत प्रकार को 'as' ऑपरेटर कास्ट का उपयोग करके परिणाम प्रकार में कास्ट करता है। nullable ऑब्जेक्ट को बॉक्स करने के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


स्रोत प्रकार को 'as' ऑपरेटर कास्ट का उपयोग करके परिणाम प्रकार में कास्ट करता है। सामान्य ऑब्जेक्ट को बॉक्स करने के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


स्रोत प्रकार को 'as' ऑपरेटर कास्ट का उपयोग करके परिणाम प्रकार में कास्ट करता है। सामान्य ऑब्जेक्ट को बॉक्स करने के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


स्रोत प्रकार को 'as' ऑपरेटर कास्ट का उपयोग करके परिणाम प्रकार में कास्ट करता है। स्ट्रिंग अनबॉक्सिंग के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToString, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


स्रोत प्रकार को 'as' ऑपरेटर कास्ट का उपयोग करके परिणाम प्रकार में कास्ट करता है। nullptr केसिंग के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


स्रोत प्रकार को 'as' ऑपरेटर कास्ट का उपयोग करके परिणाम प्रकार में कास्ट करता है। एरेज़ के बीच कास्ट करने के लिए उपयोग किया जाता है।

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| स्रोत | स्रोत प्रकार। |
| Result | परिणाम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) को कास्ट करने के लिए। |

### ReturnValue

कास्ट परिणाम। यदि किसी भी एरे सदस्य के लिए कोई रूपांतरण उपलब्ध नहीं है तो nullptr लौटाता है।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
