---
title: "System::DateTime::DateTime कंस्ट्रक्टर"
linktitle: "DateTime"
second_title: "Aspose.Page C++ के लिए"
description: "System::DateTime::DateTime कंस्ट्रक्टर. C++ में MinValue के बराबर सबसे छोटा संभव तिथि और समय मान दर्शाने वाला एक इंस्टेंस बनाता है।"
type: docs
weight: 100
url: /hi/cpp/system/datetime/datetime/
---
## DateTime::DateTime() constructor


एक इंस्टेंस बनाता है जो MinValue के बराबर सबसे छोटा संभव तिथि और समय मान दर्शाता है।

```cpp
System::DateTime::DateTime()
```

## संबंधित देखें

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(const DateTime\&) constructor


एक उदाहरण की प्रतिलिपि-निर्माण करता है।

```cpp
System::DateTime::DateTime(const DateTime &dt)=default
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| dt | const DateTime\& | [DateTime](../) क्लास का एक इंस्टेंस जिससे प्रतिनिधित्व किए गए तिथि और समय मान को कॉपी किया जाता है |

## संबंधित देखें

* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int) constructor


एक इंस्टेंस बनाता है जो एक विशिष्ट वर्ष, माह और दिन के रूप में निर्दिष्ट तिथि और समय मान दर्शाता है।

```cpp
System::DateTime::DateTime(int year, int month, int day)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| वर्ष | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किया जाने वाला वर्ष। |
| महीना | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **year** का महीना। |
| दिन | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **month** का दिन। |

## संबंधित देखें

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


एक इंस्टेंस बनाता है जो निर्दिष्ट कैलेंडर में एक विशिष्ट वर्ष, माह और दिन के रूप में निर्दिष्ट तिथि और समय मान दर्शाता है।

```cpp
System::DateTime::DateTime(int year, int month, int day, const SharedPtr<Globalization::Calendar> &calendar)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| वर्ष | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किया जाने वाला वर्ष। |
| महीना | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **year** का महीना। |
| दिन | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **month** का दिन। |
| कैलेंडर | const SharedPtr\<Globalization::Calendar\>\& | निर्दिष्ट **year**, **month** और **day** को व्याख्या करने के लिए उपयोग किया गया कैलेंडर। |

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int) constructor


एक उदाहरण बनाता है जो एक विशिष्ट वर्ष, माह, दिन, घंटा, मिनट और सेकंड के रूप में निर्दिष्ट तिथि और समय मान का प्रतिनिधित्व करता है।

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| वर्ष | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किया जाने वाला वर्ष। |
| महीना | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **year** का महीना। |
| दिन | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **month** का दिन। |
| घंटा | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **day** का घंटा। |
| मिनट | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **hour** का मिनट। |
| सेकंड | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **minute** का सेकंड। |

## संबंधित देखें

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


एक उदाहरण बनाता है जो निर्दिष्ट कैलेंडर में एक विशिष्ट वर्ष, माह, दिन, घंटा, मिनट और सेकंड के रूप में निर्दिष्ट तिथि और समय मान का प्रतिनिधित्व करता है।

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, const SharedPtr<Globalization::Calendar> &calendar)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| वर्ष | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किया जाने वाला वर्ष। |
| महीना | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **year** का महीना। |
| दिन | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **month** का दिन। |
| घंटा | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **day** का घंटा। |
| मिनट | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **hour** का मिनट। |
| सेकंड | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **minute** का सेकंड। |
| कैलेंडर | const SharedPtr\<Globalization::Calendar\>\& | निर्दिष्ट **year**, **month** और **day** को व्याख्या करने के लिए उपयोग किया गया कैलेंडर। |

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, DateTimeKind) constructor


एक उदाहरण बनाता है जो एक विशिष्ट वर्ष, माह, दिन, घंटा, मिनट और सेकंड के रूप में निर्दिष्ट तिथि और समय मान का प्रतिनिधित्व करता है।

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, DateTimeKind kind)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| वर्ष | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किया जाने वाला वर्ष। |
| महीना | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **year** का महीना। |
| दिन | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **month** का दिन। |
| घंटा | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **day** का घंटा। |
| मिनट | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **hour** का मिनट। |
| सेकंड | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **minute** का सेकंड। |
| प्रकार | DateTimeKind | वह मान जो दर्शाता है कि प्रदान किए गए तिथि और समय पैरामीटर स्थानीय समय, UTC समय या कोई नहीं निर्दिष्ट करते हैं। |

## संबंधित देखें

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) constructor


एक उदाहरण बनाता है जो निर्दिष्ट कैलेंडर में एक विशिष्ट वर्ष, माह, दिन, घंटा, मिनट, सेकंड और मिलीसेकंड के रूप में निर्दिष्ट तिथि और समय मान का प्रतिनिधित्व करता है।

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, const SharedPtr<Globalization::Calendar> &calendar, DateTimeKind kind=DateTimeKind::Unspecified)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| वर्ष | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किया जाने वाला वर्ष। |
| महीना | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **year** का महीना। |
| दिन | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **month** का दिन। |
| घंटा | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **day** का घंटा। |
| मिनट | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **hour** का मिनट। |
| सेकंड | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **minute** का सेकंड। |
| मिलीसेकंड | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **second** का मिलीसेकंड। |
| प्रकार | const SharedPtr\<Globalization::Calendar\>\& | वह मान जो दर्शाता है कि प्रदान किए गए तिथि और समय पैरामीटर स्थानीय समय, UTC समय या कोई नहीं निर्दिष्ट करते हैं। |
| कैलेंडर | DateTimeKind | निर्दिष्ट **year**, **month** और **day** को व्याख्या करने के लिए उपयोग किया गया कैलेंडर। |

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, DateTimeKind) constructor


एक उदाहरण बनाता है जो एक विशिष्ट वर्ष, माह, दिन, घंटा, मिनट, सेकंड और मिलीसेकंड के रूप में निर्दिष्ट तिथि और समय मान का प्रतिनिधित्व करता है।

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, DateTimeKind kind=DateTimeKind::Unspecified)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| वर्ष | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किया जाने वाला वर्ष। |
| महीना | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **year** का महीना। |
| दिन | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **month** का दिन। |
| घंटा | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **day** का घंटा। |
| मिनट | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **hour** का मिनट। |
| सेकंड | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **minute** का सेकंड। |
| मिलीसेकंड | int | निर्मित हो रहे इंस्टेंस द्वारा प्रतिनिधित्व किए जाने वाले **second** का मिलीसेकंड। |
| प्रकार | DateTimeKind | वह मान जो दर्शाता है कि प्रदान किए गए तिथि और समय पैरामीटर स्थानीय समय, UTC समय या कोई नहीं निर्दिष्ट करते हैं। |

## संबंधित देखें

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind, bool) constructor


एक उदाहरण बनाता है जो टिक की संख्या के रूप में निर्दिष्ट तिथि और समय मान का प्रतिनिधित्व करता है। आंतरिक उपयोग के लिए।

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind, bool is_ambiguous_local_dst)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ticks | int64_t | जॉर्जियन कैलेंडर में 1 जनवरी, 0001 00:00:00.000 से अब तक बीते 100-नैनोसेकंड अंतरालों की संख्या। |
| प्रकार | DateTimeKind | वह मान जो दर्शाता है कि **ticks** पैरामीटर स्थानीय समय, UTC समय या कोई नहीं निर्दिष्ट करता है। |
| is_ambiguous_local_dst | bool | सही यदि निर्दिष्ट तिथि और समय अस्पष्ट है और कई UTC समयों में मैप किया जा सकता है। |

## संबंधित देखें

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind) constructor


एक उदाहरण बनाता है जो टिक की संख्या के रूप में निर्दिष्ट तिथि और समय मान का प्रतिनिधित्व करता है।

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind=DateTimeKind::Unspecified)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ticks | int64_t | जॉर्जियन कैलेंडर में 1 जनवरी, 0001 00:00:00.000 से अब तक बीते 100-नैनोसेकंड अंतरालों की संख्या। |
| प्रकार | DateTimeKind | वह मान जो दर्शाता है कि **ticks** पैरामीटर स्थानीय समय, UTC समय या कोई नहीं निर्दिष्ट करता है। |

## संबंधित देखें

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
