---
title: "System::Net::Sockets::Socket::GetSocketOption मेथड"
linktitle: "GetSocketOption"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::Socket::GetSocketOption मेथड। C++ में निर्दिष्ट विकल्प नाम के अनुरूप मान लौटाता है।"
type: docs
weight: 3900
url: /hi/cpp/system.net.sockets/socket/getsocketoption/
---
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName) method


निर्दिष्ट विकल्प नाम से संबंधित मान लौटाता है।

```cpp
System::SharedPtr<Object> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | सॉकेट विकल्प स्तर। |
| optionName | SocketOptionName | विकल्प का नाम। |

### ReturnValue

निर्दिष्ट विकल्प नाम के अनुरूप मान।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, int32_t) method


निर्दिष्ट विकल्प नाम से संबंधित मान लौटाता है।

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, int32_t optionLength)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | सॉकेट विकल्प स्तर। |
| optionName | SocketOptionName | विकल्प का नाम। |
| optionLength | int32_t | विकल्प की लंबाई। |

### ReturnValue

निर्दिष्ट विकल्प नाम के अनुरूप मान।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) method


निर्दिष्ट विकल्प नाम से संबंधित मान प्राप्त करता है।

```cpp
void System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, System::ArrayPtr<uint8_t> optionValue)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | सॉकेट विकल्प स्तर। |
| optionName | SocketOptionName | विकल्प का नाम। |
| optionValue | System::ArrayPtr\<uint8_t\> | आउटपुट पैरामीटर जहाँ संबंधित मान असाइन किया जाएगा। |

## संबंधित देखें

* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
