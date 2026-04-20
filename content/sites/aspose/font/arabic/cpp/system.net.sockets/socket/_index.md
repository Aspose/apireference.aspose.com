---
title: "فئة System::Net::Sockets::Socket"
linktitle: "Socket"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Sockets::Socket فئة. فئة Socket تنفّذ واجهة Berkeley sockets في C++."
type: docs
weight: 400
url: /ar/cpp/system.net.sockets/socket/
---
## Socket class


فئة [Socket](./) تنفّذ واجهة Berkeley sockets.

```cpp
class Socket : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Accept](./accept/)() | ينشئ مقبسًا جديدًا للاتصال الذي تم إنشاؤه حديثًا. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<EndPoint\>, AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية اتصال غير متزامنة. |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية اتصال غير متزامنة. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية اتصال غير متزامنة. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية اتصال غير متزامنة. |
| [BeginReceive](./beginreceive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية كتابة غير متزامنة. |
| [BeginSend](./beginsend/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية إرسال غير متزامنة. |
| [Bind](./bind/)(System::SharedPtr\<EndPoint\>) | يربط المقبس بنقطة النهاية المحلية المحددة. |
| [Close](./close/)() | يغلق اتصال المقبس. |
| [Close](./close/)(int) | يغلق اتصال المقبس مع المهلة المحددة للسماح بإرسال البيانات المصفوفة. |
| [Connect](./connect/)(System::SharedPtr\<EndPoint\>) | يؤسس اتصالًا بنقطة النهاية البعيدة المحددة. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | يؤسس اتصالًا بنقطة النهاية البعيدة المحددة. |
| [Connect](./connect/)(String, int32_t) | يؤسس اتصالًا بنقطة النهاية البعيدة المحددة. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | يؤسس اتصالًا بنقطة النهاية البعيدة المحددة. |
| [Dispose](./dispose/)() override | لا يفعل شيئًا. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | ينتظر حتى تكتمل عملية الاتصال غير المتزامنة المحددة. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>) | ينتظر حتى تكتمل عملية الاستقبال غير المتزامنة المحددة. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | ينتظر حتى تكتمل عملية الاستقبال غير المتزامنة المحددة. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>) | ينتظر حتى تكتمل عملية الإرسال غير المتزامنة المحددة. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | ينتظر حتى تكتمل عملية الإرسال غير المتزامنة المحددة. |
| [get_AddressFamily](./get_addressfamily/)() | يرجع عائلة العناوين. |
| [get_Available](./get_available/)() | يحصل على عدد البايتات المستلمة من الشبكة والمتاحة للقراءة. |
| [get_Blocking](./get_blocking/)() | يحصل على قيمة تشير إلى ما إذا كان المقبس في وضع الحجب. |
| [get_Connected](./get_connected/)() | يرجع قيمة تشير إلى ما إذا كان المقبس متصلًا بالمضيف البعيد. |
| [get_DontFragment](./get_dontfragment/)() | يحصل على قيمة تشير إلى ما إذا كان المقبس يسمح بتجزئة حزم IP. |
| [get_DualMode](./get_dualmode/)() | يحصل على قيمة تشير إلى ما إذا كان المقبس في الوضع المزدوج. |
| [get_EnableBroadcast](./get_enablebroadcast/)() | يحصل على قيمة تشير إلى ما إذا كان المقبس يسمح بحزم البث. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | يحصل على قيمة تشير إلى ما إذا كانت عملية واحدة فقط يمكنها ربط المقبس بمنفذ. |
| [get_IsBound](./get_isbound/)() | يرجع قيمة تشير إلى ما إذا كان المقبس مرتبطًا بمنفذ محلي محدد. |
| [get_LingerState](./get_lingerstate/)() | يحصل على قيمة تشير إلى ما إذا كان المقبس سيؤخر الإغلاق في محاولة لإرسال جميع البيانات المعلقة. |
| [get_LocalEndPoint](./get_localendpoint/)() | يرجع نقطة النهاية المحلية. |
| [get_MulticastLoopback](./get_multicastloopback/)() | يحصل على قيمة تشير إلى ما إذا كان المقبس يتلقى حزم البث المتعدد الصادرة. |
| [get_NoDelay](./get_nodelay/)() | يحصل على قيمة تشير إلى ما إذا كان socket يستخدم خوارزمية Nagle. |
| static [get_OSSupportsIPv4](./get_ossupportsipv4/)() | يرجع قيمة تشير إلى ما إذا كان نظام التشغيل ومحولات الشبكة يدعمان IPv4. |
| static [get_OSSupportsIPv6](./get_ossupportsipv6/)() | يرجع قيمة تشير إلى ما إذا كان نظام التشغيل ومحولات الشبكة يدعمان IPv6. |
| [get_ProtocolType](./get_protocoltype/)() | يرجع نوع البروتوكول. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | يحصل على حجم مخزن الاستقبال. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | يحصل على فترة زمنية بعد انتهائها ستنتهي مهلة استدعاء 'Receive'. |
| [get_RemoteEndPoint](./get_remoteendpoint/)() | يرجع نقطة النهاية البعيدة. |
| [get_SendBufferSize](./get_sendbuffersize/)() | يحصل على حجم مخزن الإرسال. |
| [get_SendTimeout](./get_sendtimeout/)() | يحصل على فترة زمنية بعد انتهائها ستنتهي مهلة استدعاء 'Send'. |
| [get_SocketType](./get_sockettype/)() | يرجع نوع socket. |
| static [get_SupportsIPv4](./get_supportsipv4/)() | معلومات RTTI. |
| [get_Ttl](./get_ttl/)() | يحصل على قيمة TTL. |
| [GetImpl](./getimpl/)() const | يرجع مؤشرًا إلى التنفيذ. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName) | يرجع القيمة التي تتطابق مع اسم الخيار المحدد. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | يحصل على القيمة التي تتطابق مع اسم الخيار المحدد. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | يرجع القيمة التي تتطابق مع اسم الخيار المحدد. |
| [IOControl](./iocontrol/)(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | يضبط أوضاع التشغيل منخفضة المستوى لـ socket. |
| [IOControl](./iocontrol/)(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | يضبط أوضاع التشغيل منخفضة المستوى لـ socket. |
| [Listen](./listen/)(int32_t) | يغيّر حالة socket إلى 'listen'. |
| [Poll](./poll/)(int32_t, SelectMode) | يرجع حالة socket بناءً على وضع الاستطلاع المحدد. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | يتلقى البيانات من socket ويكتبها إلى مصفوفة البايت المحددة. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | يتلقى البيانات من socket ويكتبها إلى مصفوفة البايت المحددة. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | يتلقى البيانات من socket ويكتبها إلى مصفوفة البايت المحددة. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | يتلقى البيانات من socket ويكتبها إلى مصفوفة البايت المحددة. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | يتلقى البيانات من socket ويكتبها إلى مصفوفة البايت المحددة. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | يتلقى البيانات من socket ويكتبها إلى مصفوفة البايت المحددة. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>) | يتلقى البيانات من socket ويكتبها إلى مصفوفة البايت المحددة. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>) | يتلقى البيانات من socket ويكتبها إلى مصفوفة البايت المحددة. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&) | يتلقى البيانات من socket ويكتبها إلى مصفوفة البايت المحددة. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | يتلقى البيانات من socket ويكتبها إلى مصفوفة البايت المحددة. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | يتلقى البيانات من socket ويكتبها إلى مصفوفة البايت المحددة. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | يتلقى البيانات من socket ويكتبها إلى مصفوفة البايت المحددة. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | يتلقى البيانات من socket ويكتبها إلى مصفوفة البايت المحددة. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | يتلقى البيانات من socket ويكتبها إلى مصفوفة البايت المحددة. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | يتلقى البيانات من socket ويكتبها إلى مصفوفة البايت المحددة. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | يتلقى البيانات من socket ويكتبها إلى مصفوفات البايت المحددة. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | يتلقى البيانات من socket ويكتبها إلى مصفوفات البايت المحددة. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | يتلقى البيانات من socket ويكتبها إلى مصفوفات البايت المحددة. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) | يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | يرسل البيانات المحددة إلى socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | يرسل البيانات المحددة إلى socket. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | يرسل البيانات المحددة إلى نقطة النهاية المحددة. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | يرسل البيانات المحددة إلى نقطة النهاية المحددة. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | يرسل البيانات المحددة إلى نقطة النهاية المحددة. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | يرسل البيانات المحددة إلى نقطة النهاية المحددة. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | يرسل البيانات المحددة إلى نقطة النهاية المحددة. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | يرسل البيانات المحددة إلى نقطة النهاية المحددة. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | يرسل البيانات المحددة إلى نقطة النهاية المحددة. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | يرسل البيانات المحددة إلى نقطة النهاية المحددة. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) | يرسل البيانات المحددة إلى نقطة النهاية المحددة. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) | يرسل البيانات المحددة إلى نقطة النهاية المحددة. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) | يرسل البيانات المحددة إلى نقطة النهاية المحددة. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) | يرسل البيانات المحددة إلى نقطة النهاية المحددة. |
| [set_Blocking](./set_blocking/)(bool) | يضبط قيمة تشير إلى ما إذا كان socket في وضع الحجب. |
| [set_ConnectionTimeout](./set_connectiontimeout/)(int32_t) | يضبط مهلة الاتصال. |
| [set_DontFragment](./set_dontfragment/)(bool) | يضبط قيمة تشير إلى ما إذا كان socket يسمح بتجزئة حزم IP. |
| [set_DualMode](./set_dualmode/)(bool) | يضبط قيمة تشير إلى ما إذا كان المقبس في وضع dual-mode. |
| [set_EnableBroadcast](./set_enablebroadcast/)(bool) | يضبط قيمة تشير إلى ما إذا كان المقبس يسمح بحزم البث. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | يضبط قيمة تشير إلى ما إذا كان يمكن لعملية واحدة فقط ربط المقبس بمنفذ. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | يضبط قيمة تشير إلى ما إذا كان المقبس سيؤخر الإغلاق في محاولة لإرسال جميع البيانات المعلقة. |
| [set_MulticastLoopback](./set_multicastloopback/)(bool) | يضبط قيمة تشير إلى ما إذا كان المقبس يتلقى حزم البث المتعدد الصادرة. |
| [set_NoDelay](./set_nodelay/)(bool) | يضبط قيمة تشير إلى ما إذا كان المقبس يستخدم خوارزمية Nagle. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | يضبط حجم مخزن الاستلام. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | يضبط فترة يتجاوزها استدعاء 'Receive' وينتهي مهله. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | يضبط حجم مخزن الإرسال. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | يضبط فترة يتجاوزها استدعاء 'Send' وينتهي مهله. |
| [set_Ttl](./set_ttl/)(int16_t) | يضبط قيمة TTL. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | يضبط خيار المقبس المحدد إلى القيمة المحددة. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | يضبط خيار المقبس المحدد إلى القيمة المحددة. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, bool) | يضبط خيار المقبس المحدد إلى القيمة المحددة. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::SharedPtr\<Object\>) | يضبط خيار المقبس المحدد إلى القيمة المحددة. |
| [Shutdown](./shutdown/)(SocketShutdown) | يعطل عمليات الإرسال والاستقبال للمقبس. |
| [Socket](./socket/)(System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | ينشئ نسخة جديدة. |
| [Socket](./socket/)(System::Net::Sockets::AddressFamily, System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | ينشئ نسخة جديدة. |
| virtual [~Socket](./~socket/)() | يدمر النسخة الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ImplPtr](./implptr/) | تنفيذ المقبس. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
