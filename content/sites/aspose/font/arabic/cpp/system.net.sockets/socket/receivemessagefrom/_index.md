---
title: "طريقة System::Net::Sockets::Socket::ReceiveMessageFrom"
linktitle: "ReceiveMessageFrom"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Sockets::Socket::ReceiveMessageFrom. تستقبل البيانات من نقطة النهاية المحددة وتكتبها إلى مصفوفة البايتات المحددة في C++."
type: docs
weight: 4500
url: /ar/cpp/system.net.sockets/socket/receivemessagefrom/
---
## Socket::ReceiveMessageFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات التي سيتم استقبالها وتعيينها إلى مصفوفة البايت المحددة بدءًا من الفهرس 'offset'. |
| socketFlags | SocketFlags\& | سلوك الاستقبال. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | النقطة النهائية البعيدة. |
| ipPacketInformation | IPPacketInformation\& | معامل الإخراج حيث سيتم تعيين معلومات الحزمة. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveMessageFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات التي سيتم استقبالها وتعيينها إلى مصفوفة البايت المحددة بدءًا من الفهرس 'offset'. |
| socketFlags | SocketFlags\& | سلوك الاستقبال. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | النقطة النهائية البعيدة. |
| ipPacketInformation | IPPacketInformation\& | معامل الإخراج حيث سيتم تعيين معلومات الحزمة. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveMessageFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات التي سيتم استقبالها وتعيينها إلى مصفوفة البايت المحددة بدءًا من الفهرس 'offset'. |
| socketFlags | SocketFlags\& | سلوك الاستقبال. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | النقطة النهائية البعيدة. |
| ipPacketInformation | IPPacketInformation\& | معامل الإخراج حيث سيتم تعيين معلومات الحزمة. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
