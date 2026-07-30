---
title: "طريقة System::Net::Sockets::Socket::IOControl"
linktitle: "IOControl"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Sockets::Socket::IOControl. تُعيّن أوضاع تشغيل منخفضة المستوى للمقبس في C++."
type: docs
weight: 4000
url: /ar/cpp/system.net.sockets/socket/iocontrol/
---
## Socket::IOControl(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


يضبط أوضاع التشغيل منخفضة المستوى لـ socket.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(int32_t ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ioControlCode | int32_t | رمز التحكم للعملية التي سيتم تنفيذها. |
| optionInValue | System::ArrayPtr\<uint8_t\> | مصفوفة البايت التي تحتوي على بيانات الإدخال. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | مصفوفة البايت التي تحتوي على بيانات الإخراج. |

### ReturnValue

عدد البايتات في المعامل **optionOutValue**.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::IOControl(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


يضبط أوضاع التشغيل منخفضة المستوى لـ socket.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(IOControlCode ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ioControlCode | IOControlCode | رمز التحكم للعملية التي سيتم تنفيذها. |
| optionInValue | System::ArrayPtr\<uint8_t\> | مصفوفة البايت التي تحتوي على بيانات الإدخال. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | مصفوفة البايت التي تحتوي على بيانات الإخراج. |

### ReturnValue

عدد البايتات في المعامل **optionOutValue**.

## انظر أيضًا

* Enum [IOControlCode](../../iocontrolcode/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
