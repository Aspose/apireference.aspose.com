---
title: "System::Threading::Interlocked::CompareExchange मेथड"
linktitle: "CompareExchange"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Interlocked::CompareExchange मेथड। चर पर मान का तुलना-एक्सचेंज करता है: जांचता है कि चर विशिष्ट मान के बराबर है या नहीं और केवल तभी नया मान संग्रहीत करता है जब संग्रहीत मान अपेक्षित मान से मेल खाता हो, C++ में।"
type: docs
weight: 200
url: /hi/cpp/system.threading/interlocked/compareexchange/
---
## Interlocked::CompareExchange(int32_t\&, int32_t, int32_t, bool\&) method


वेरिएबल पर मान की तुलना-आदान-प्रदान करता है: जांचता है कि वेरिएबल विशिष्ट मान के बराबर है या नहीं और केवल तब नया मान संग्रहीत करता है जब संग्रहीत मान अपेक्षित से मेल खाता हो।

```cpp
static int32_t System::Threading::Interlocked::CompareExchange(int32_t &location1, int32_t value, int32_t comparand, bool &succeeded)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| location1 | int32_t\& | परिवर्तन के लिए चर संदर्भ। |
| मान | int32_t | संग्रहीत करने के लिए मान। |
| तुलनात्मक मान | int32_t | एक्सचेंज से पहले चर के मान की तुलना करने के लिए मान। |
| सफल हुआ | bool\& | चर का संदर्भ जो एक्सचेंज होने पर true सेट होता है और अन्यथा false। |

### ReturnValue

ऑपरेशन शुरू होने पर वैरिएबल का मान, चाहे वह बदला गया हो या नहीं।

## संबंधित देखें

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


वेरिएबल पर मान की तुलना-आदान-प्रदान करता है: जांचता है कि वेरिएबल विशिष्ट मान के बराबर है या नहीं और केवल तब नया मान संग्रहीत करता है जब संग्रहीत मान अपेक्षित से मेल खाता हो।

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | चर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| location1 | T\& | परिवर्तन के लिए चर संदर्भ। |
| मान | T | संग्रहीत करने के लिए मान। |
| तुलनात्मक मान | T | एक्सचेंज से पहले चर के मान की तुलना करने के लिए मान। |

### ReturnValue

ऑपरेशन शुरू होने पर वैरिएबल का मान, चाहे वह बदला गया हो या नहीं।

## संबंधित देखें

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


वेरिएबल पर मान की तुलना-आदान-प्रदान करता है: जांचता है कि वेरिएबल विशिष्ट मान के बराबर है या नहीं और केवल तब नया मान संग्रहीत करता है जब संग्रहीत मान अपेक्षित से मेल खाता हो। लागू नहीं किया गया।

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | चर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| location1 | T\& | परिवर्तन के लिए चर संदर्भ। |
| मान | T | संग्रहीत करने के लिए मान। |
| तुलनात्मक मान | T | एक्सचेंज से पहले चर के मान की तुलना करने के लिए मान। |

### ReturnValue

ऑपरेशन शुरू होने पर वैरिएबल का मान, चाहे वह बदला गया हो या नहीं।

## संबंधित देखें

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
