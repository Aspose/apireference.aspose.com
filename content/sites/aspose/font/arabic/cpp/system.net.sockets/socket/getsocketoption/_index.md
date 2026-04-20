---
title: "طريقة System::Net::Sockets::Socket::GetSocketOption"
linktitle: "GetSocketOption"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Sockets::Socket::GetSocketOption. تُعيد القيمة التي تتطابق مع اسم الخيار المحدد في C++."
type: docs
weight: 3900
url: /ar/cpp/system.net.sockets/socket/getsocketoption/
---
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName) method


يرجع القيمة التي تتطابق مع اسم الخيار المحدد.

```cpp
System::SharedPtr<Object> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | مستوى خيار المقبس. |
| optionName | SocketOptionName | اسم الخيار. |

### ReturnValue

القيمة التي تتطابق مع اسم الخيار المحدد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, int32_t) method


يرجع القيمة التي تتطابق مع اسم الخيار المحدد.

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, int32_t optionLength)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | مستوى خيار المقبس. |
| optionName | SocketOptionName | اسم الخيار. |
| optionLength | int32_t | طول الخيار. |

### ReturnValue

القيمة التي تتطابق مع اسم الخيار المحدد.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) method


يحصل على القيمة التي تتطابق مع اسم الخيار المحدد.

```cpp
void System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, System::ArrayPtr<uint8_t> optionValue)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | مستوى خيار المقبس. |
| optionName | SocketOptionName | اسم الخيار. |
| optionValue | System::ArrayPtr\<uint8_t\> | معامل الإخراج حيث سيتم تعيين القيمة المقابلة. |

## انظر أيضًا

* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
