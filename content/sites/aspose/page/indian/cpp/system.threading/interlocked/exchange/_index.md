---
title: "System::Threading::Interlocked::Exchange मेथड"
linktitle: "Exchange"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Interlocked::Exchange मेथड। चर पर मान का एक्सचेंज करता है: नया मान संग्रहीत करता है और C++ में संग्रहीत करने से तुरंत पहले चर के पास था वह मान लौटाता है।"
type: docs
weight: 400
url: /hi/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


वेरिएबल पर मान का आदान-प्रदान करता है: नया मान संग्रहीत करता है और संग्रहीत करने से तुरंत पहले वेरिएबल के पास था वह मान लौटाता है।

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | चर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| location1 | T\& | परिवर्तन के लिए चर संदर्भ। |
| मान | T | संग्रहीत करने के लिए मान। |

### ReturnValue

चर का मान, परिवर्तन से ठीक पहले।

## संबंधित देखें

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::Exchange(T\&, T) method


वेरिएबल पर मान का आदान-प्रदान करता है: नया मान संग्रहीत करता है और संग्रहीत करने से तुरंत पहले वेरिएबल के पास था वह मान लौटाता है। लागू नहीं किया गया।

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | चर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| location1 | T\& | परिवर्तन के लिए चर संदर्भ। |
| मान | T | संग्रहीत करने के लिए मान। |

### ReturnValue

चर का मान, परिवर्तन से ठीक पहले।

## संबंधित देखें

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
