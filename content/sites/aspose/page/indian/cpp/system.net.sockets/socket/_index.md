---
title: "System::Net::Sockets::Socket class"
linktitle: "Socket"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::Socket class. Socket class C++ में Berkeley sockets इंटरफ़ेस को लागू करती है।"
type: docs
weight: 400
url: /hi/cpp/system.net.sockets/socket/
---
## Socket class


यह [Socket](./) class Berkeley sockets इंटरफ़ेस को लागू करती है।

```cpp
class Socket : public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Accept](./accept/)() | नए बनाए गए कनेक्शन के लिए एक नया सॉकेट बनाता है। |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<EndPoint\>, AsyncCallback, System::SharedPtr\<Object\>) | एक असिंक्रोनस कनेक्ट ऑपरेशन शुरू करता है। |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | एक असिंक्रोनस कनेक्ट ऑपरेशन शुरू करता है। |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | एक असिंक्रोनस कनेक्ट ऑपरेशन शुरू करता है। |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | एक असिंक्रोनस कनेक्ट ऑपरेशन शुरू करता है। |
| [BeginReceive](./beginreceive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | एक असिंक्रोनस राइट ऑपरेशन शुरू करता है। |
| [BeginSend](./beginsend/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | एक असिंक्रोनस सेंड ऑपरेशन शुरू करता है। |
| [Bind](./bind/)(System::SharedPtr\<EndPoint\>) | सॉकेट को निर्दिष्ट स्थानीय एंडपॉइंट से बाइंड करता है। |
| [Close](./close/)() | सॉकेट कनेक्शन को बंद करता है। |
| [Close](./close/)(int) | निर्दिष्ट टाइमआउट के साथ सॉकेट कनेक्शन को बंद करता है ताकि कतारबद्ध डेटा भेजा जा सके। |
| [Connect](./connect/)(System::SharedPtr\<EndPoint\>) | निर्दिष्ट रिमोट एंडपॉइंट से कनेक्शन स्थापित करता है। |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | निर्दिष्ट रिमोट एंडपॉइंट से कनेक्शन स्थापित करता है। |
| [Connect](./connect/)(String, int32_t) | निर्दिष्ट रिमोट एंडपॉइंट से कनेक्शन स्थापित करता है। |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | निर्दिष्ट रिमोट एंडपॉइंट से कनेक्शन स्थापित करता है। |
| [Dispose](./dispose/)() override | कुछ नहीं करता। |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | निर्दिष्ट असिंक्रोनस कनेक्ट ऑपरेशन के पूरा होने तक प्रतीक्षा करता है। |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>) | निर्दिष्ट असिंक्रोनस रिसीव ऑपरेशन के पूरा होने तक प्रतीक्षा करता है। |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | निर्दिष्ट असिंक्रोनस रिसीव ऑपरेशन के पूरा होने तक प्रतीक्षा करता है। |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>) | निर्दिष्ट असिंक्रोनस सेंड ऑपरेशन के पूरा होने तक प्रतीक्षा करता है। |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | निर्दिष्ट असिंक्रोनस सेंड ऑपरेशन के पूरा होने तक प्रतीक्षा करता है। |
| [get_AddressFamily](./get_addressfamily/)() | पता परिवार लौटाता है। |
| [get_Available](./get_available/)() | नेटवर्क से प्राप्त बाइट्स की संख्या प्राप्त करता है और पढ़ने के लिए उपलब्ध है। |
| [get_Blocking](./get_blocking/)() | एक मान प्राप्त करता है जो दर्शाता है कि सॉकेट ब्लॉकिंग मोड में है या नहीं। |
| [get_Connected](./get_connected/)() | एक मान लौटाता है जो दर्शाता है कि सॉकेट रिमोट होस्ट से जुड़ा है या नहीं। |
| [get_DontFragment](./get_dontfragment/)() | एक मान प्राप्त करता है जो दर्शाता है कि सॉकेट IP डेटाग्राम को फ्रैगमेंट करने की अनुमति देता है या नहीं। |
| [get_DualMode](./get_dualmode/)() | एक मान प्राप्त करता है जो दर्शाता है कि सॉकेट ड्यूल-मोड में है या नहीं। |
| [get_EnableBroadcast](./get_enablebroadcast/)() | एक मान प्राप्त करता है जो दर्शाता है कि सॉकेट ब्रॉडकास्ट पैकेट की अनुमति देता है या नहीं। |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | एक मान प्राप्त करता है जो दर्शाता है कि केवल एक प्रक्रिया सॉकेट को पोर्ट से बाइंड कर सकती है या नहीं। |
| [get_IsBound](./get_isbound/)() | एक मान लौटाता है जो दर्शाता है कि सॉकेट किसी विशिष्ट स्थानीय पोर्ट से बंधा है या नहीं। |
| [get_LingerState](./get_lingerstate/)() | एक मान प्राप्त करता है जो दर्शाता है कि सॉकेट सभी पेंडिंग डेटा भेजने के प्रयास में बंद होने में देरी करेगा या नहीं। |
| [get_LocalEndPoint](./get_localendpoint/)() | स्थानीय एंडपॉइंट लौटाता है। |
| [get_MulticastLoopback](./get_multicastloopback/)() | एक मान प्राप्त करता है जो दर्शाता है कि सॉकेट आउटगोइंग मल्टीकास्ट पैकेट प्राप्त करता है या नहीं। |
| [get_NoDelay](./get_nodelay/)() | एक मान प्राप्त करता है जो दर्शाता है कि सॉकेट नैगल एल्गोरिद्म का उपयोग कर रहा है या नहीं। |
| static [get_OSSupportsIPv4](./get_ossupportsipv4/)() | एक मान लौटाता है जो दर्शाता है कि ऑपरेटिंग सिस्टम और नेटवर्क एडैप्टर IPv4 का समर्थन करते हैं या नहीं। |
| static [get_OSSupportsIPv6](./get_ossupportsipv6/)() | एक मान लौटाता है जो दर्शाता है कि ऑपरेटिंग सिस्टम और नेटवर्क एडैप्टर IPv6 का समर्थन करते हैं या नहीं। |
| [get_ProtocolType](./get_protocoltype/)() | प्रोटोकॉल प्रकार लौटाता है। |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | रिसीव बफ़र आकार प्राप्त करता है। |
| [get_ReceiveTimeout](./get_receivetimeout/)() | एक अवधि प्राप्त करता है जिसके बाद 'Receive' कॉल टाइम आउट हो जाएगी। |
| [get_RemoteEndPoint](./get_remoteendpoint/)() | रिमोट एंडपॉइंट लौटाता है। |
| [get_SendBufferSize](./get_sendbuffersize/)() | सेंड बफ़र आकार प्राप्त करता है। |
| [get_SendTimeout](./get_sendtimeout/)() | एक अवधि प्राप्त करता है जिसके बाद 'Send' कॉल टाइम आउट हो जाएगी। |
| [get_SocketType](./get_sockettype/)() | सॉकेट प्रकार लौटाता है। |
| static [get_SupportsIPv4](./get_supportsipv4/)() | RTTI जानकारी। |
| [get_Ttl](./get_ttl/)() | TTL मान प्राप्त करता है। |
| [GetImpl](./getimpl/)() const | इम्प्लीमेंटेशन के लिए एक पॉइंटर लौटाता है। |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName) | निर्दिष्ट विकल्प नाम से संबंधित मान लौटाता है। |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | निर्दिष्ट विकल्प नाम से संबंधित मान प्राप्त करता है। |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | निर्दिष्ट विकल्प नाम से संबंधित मान लौटाता है। |
| [IOControl](./iocontrol/)(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | सॉकेट के लिए लो-लेवल ऑपरेटिंग मोड सेट करता है। |
| [IOControl](./iocontrol/)(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | सॉकेट के लिए लो-लेवल ऑपरेटिंग मोड सेट करता है। |
| [Listen](./listen/)(int32_t) | सॉकेट की स्थिति को 'listen' में बदलता है। |
| [Poll](./poll/)(int32_t, SelectMode) | निर्दिष्ट पोलिंग मोड के आधार पर सॉकेट की स्थिति लौटाता है। |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरेज़ में लिखता है। |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरेज़ में लिखता है। |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरेज़ में लिखता है। |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) | निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है। |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | निर्दिष्ट डेटा को सॉकेट को भेजता है। |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है। |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है। |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है। |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है। |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है। |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है। |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है। |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है। |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) | निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है। |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) | निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है। |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) | निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है। |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) | निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है। |
| [set_Blocking](./set_blocking/)(bool) | एक मान सेट करता है जो दर्शाता है कि सॉकेट ब्लॉकिंग मोड में है या नहीं। |
| [set_ConnectionTimeout](./set_connectiontimeout/)(int32_t) | कनेक्शन टाइमआउट सेट करता है। |
| [set_DontFragment](./set_dontfragment/)(bool) | एक मान सेट करता है जो दर्शाता है कि सॉकेट IP डेटाग्राम को फ्रैगमेंट करने की अनुमति देता है या नहीं। |
| [set_DualMode](./set_dualmode/)(bool) | एक मान सेट करता है जो दर्शाता है कि सॉकेट ड्यूल-मोड में है या नहीं। |
| [set_EnableBroadcast](./set_enablebroadcast/)(bool) | एक मान सेट करता है जो दर्शाता है कि सॉकेट ब्रॉडकास्ट पैकेट की अनुमति देता है या नहीं। |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | एक मान सेट करता है जो दर्शाता है कि केवल एक प्रक्रिया सॉकेट को पोर्ट से बाइंड कर सकती है या नहीं। |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | एक मान सेट करता है जो दर्शाता है कि सॉकेट सभी पेंडिंग डेटा भेजने के प्रयास में बंद होने में देरी करेगा या नहीं। |
| [set_MulticastLoopback](./set_multicastloopback/)(bool) | एक मान सेट करता है जो दर्शाता है कि सॉकेट आउटगोइंग मल्टीकास्ट पैकेट प्राप्त करता है या नहीं। |
| [set_NoDelay](./set_nodelay/)(bool) | एक मान सेट करता है जो दर्शाता है कि सॉकेट नैगल एल्गोरिदम का उपयोग कर रहा है या नहीं। |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | रिसीव बफ़र आकार सेट करता है। |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | 'Receive' कॉल के टाइमआउट होने के बाद की अवधि सेट करता है। |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | सेन्ड बफ़र आकार सेट करता है। |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | 'Send' कॉल के टाइमआउट होने के बाद की अवधि सेट करता है। |
| [set_Ttl](./set_ttl/)(int16_t) | TTL मान सेट करता है। |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | निर्दिष्ट सॉकेट विकल्प को निर्दिष्ट मान पर सेट करता है। |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | निर्दिष्ट सॉकेट विकल्प को निर्दिष्ट मान पर सेट करता है। |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, bool) | निर्दिष्ट सॉकेट विकल्प को निर्दिष्ट मान पर सेट करता है। |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::SharedPtr\<Object\>) | निर्दिष्ट सॉकेट विकल्प को निर्दिष्ट मान पर सेट करता है। |
| [Shutdown](./shutdown/)(SocketShutdown) | सॉकेट के भेजने और प्राप्त करने के कार्यों को निष्क्रिय करता है। |
| [Socket](./socket/)(System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | एक नया उदाहरण बनाता है। |
| [Socket](./socket/)(System::Net::Sockets::AddressFamily, System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | एक नया उदाहरण बनाता है। |
| virtual [~Socket](./~socket/)() | वर्तमान इंस्टेंस को नष्ट करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [ImplPtr](./implptr/) | सॉकेट कार्यान्वयन। |
## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
