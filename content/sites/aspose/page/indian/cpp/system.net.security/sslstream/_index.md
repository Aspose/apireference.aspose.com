---
title: "System::Net::Security::SslStream क्लास"
linktitle: "SslStream"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Security::SslStream क्लास। एक स्ट्रीम जो SSL प्रोटोकॉल का उपयोग करके सर्वर और वैकल्पिक रूप से क्लाइंट को C++ में प्रमाणित करता है।"
type: docs
weight: 200
url: /hi/cpp/system.net.security/sslstream/
---
## SslStream class


एक स्ट्रीम जो सर्वर को प्रमाणित करने और वैकल्पिक रूप से क्लाइंट को प्रमाणित करने के लिए SSL प्रोटोकॉल का उपयोग करता है।

```cpp
class SslStream : public System::Net::Security::AuthenticatedStream
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String) | कनेक्शन के क्लाइंट-साइड को प्रमाणित करता है। |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) | कनेक्शन के क्लाइंट-साइड को प्रमाणित करता है। |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | एक असिंक्रोनस रीड ऑपरेशन शुरू करता है। |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | एक असिंक्रोनस राइट ऑपरेशन शुरू करता है। |
| [Close](./close/)() override | स्ट्रीम को बंद करता है। |
| [Dispose](./dispose/)(bool) override | वर्तमान ऑब्जेक्ट द्वारा उपयोग किए गए सभी संसाधनों को मुक्त करता है और स्ट्रीम को बंद करता है। |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | निर्दिष्ट असिंक्रोनस रीड ऑपरेशन के पूरा होने तक प्रतीक्षा करता है। |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | एक असिंक्रोनस राइट ऑपरेशन समाप्त करता है। निर्दिष्ट असिंक्रोनस राइट ऑपरेशन के पूरा होने तक प्रतीक्षा करता है। |
| [Flush](./flush/)() override | इस स्ट्रीम के बफ़र को साफ़ करता है और सभी बफ़र किए गए डेटा को अंतर्निहित स्टोरेज में लिखता है। |
| [get_CanRead](./get_canread/)() const override | निर्धारित करता है कि स्ट्रीम पढ़ने योग्य है या नहीं। |
| [get_CanSeek](./get_canseek/)() const override | निर्धारित करता है कि क्या स्ट्रीम सीकिंग का समर्थन करता है। |
| [get_CanTimeout](./get_cantimeout/)() const override | एक मान प्राप्त करता है जो निर्धारित करता है कि क्या वर्तमान स्ट्रीम टाइम‑आउट हो सकता है। |
| [get_CanWrite](./get_canwrite/)() const override | निर्धारित करता है कि क्या स्ट्रीम लिखने योग्य है। |
| virtual [get_CheckCertRevocationStatus](./get_checkcertrevocationstatus/)() | एक मान लौटाता है जो दर्शाता है कि प्रमाणपत्र सत्यापन प्रक्रिया के दौरान सर्टिफिकेट रिवोक्शन लिस्ट जाँची गई है या नहीं। |
| virtual [get_CipherAlgorithm](./get_cipheralgorithm/)() | एन्क्रिप्शन एल्गोरिद्म लौटाता है। |
| virtual [get_CipherStrength](./get_cipherstrength/)() | उपयोग किए गए एन्क्रिप्शन एल्गोरिद्म की शक्ति लौटाता है। |
| virtual [get_HashAlgorithm](./get_hashalgorithm/)() | हैश एल्गोरिद्म लौटाता है। |
| virtual [get_HashStrength](./get_hashstrength/)() | उपयोग किए गए हैश एल्गोरिद्म की शक्ति लौटाता है। |
| [get_IsAuthenticated](./get_isauthenticated/)() const override | एक मान लौटाता है जो दर्शाता है कि प्रमाणीकरण सफलतापूर्वक पास हुआ है। |
| [get_IsEncrypted](./get_isencrypted/)() const override | एक मान लौटाता है जो दर्शाता है कि इस स्ट्रीम के द्वारा भेजा गया डेटा एन्क्रिप्टेड है। |
| [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const override | एक मान लौटाता है जो दर्शाता है कि सर्वर और क्लाइंट दोनों प्रमाणित हैं। |
| [get_IsServer](./get_isserver/)() const override | एक मान लौटाता है जो दर्शाता है कि कनेक्शन की स्थानीय पक्ष सर्वर है। |
| [get_IsSigned](./get_issigned/)() const override | एक मान लौटाता है जो दर्शाता है कि इस स्ट्रीम के द्वारा भेजा गया डेटा साइन किया गया है। |
| virtual [get_KeyExchangeStrength](./get_keyexchangestrength/)() | उपयोग किए गए की एक्सचेंज एल्गोरिद्म की शक्ति लौटाता है। |
| [get_Length](./get_length/)() const override | स्ट्रीम की लंबाई बाइट्स में लौटाता है। |
| virtual [get_LocalCertificate](./get_localcertificate/)() | स्थानीय एंडपॉइंट को प्रमाणित करने के लिए उपयोग किए गए प्रमाणपत्र को लौटाता है। |
| [get_Position](./get_position/)() const override | स्ट्रीम की वर्तमान स्थिति लौटाता है। |
| [get_ReadTimeout](./get_readtimeout/)() const override | एक मान मिलिसेकंड में प्राप्त करता है जो निर्धारित करता है कि टाइम‑आउट होने से पहले स्ट्रीम कितनी देर तक पढ़ने का प्रयास करेगा। |
| virtual [get_RemoteCertificate](./get_remotecertificate/)() | रिमोट एंडपॉइंट को प्रमाणित करने के लिए उपयोग किए गए प्रमाणपत्र को लौटाता है। |
| virtual [get_SslProtocol](./get_sslprotocol/)() | SSL प्रोटोकॉल को लौटाता है। |
| [get_WriteTimeout](./get_writetimeout/)() const override | एक मान प्राप्त करता है, मिलीसेकंड में, जो निर्धारित करता है कि टाइमआउट होने से पहले स्ट्रीम लिखने का प्रयास कितनी देर तक करेगा। |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है। |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है। |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की स्थिति सेट करता है। |
| [set_Position](./set_position/)(int64_t) override | स्ट्रीम की स्थिति सेट करता है। |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | एक मान सेट करता है जो निर्धारित करता है कि वर्तमान स्ट्रीम टाइमआउट हो सकता है या नहीं। |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | एक मान सेट करता है, मिलीसेकंड में, जो निर्धारित करता है कि टाइमआउट होने से पहले स्ट्रीम पढ़ने का प्रयास कितनी देर तक करेगा। |
| [SetLength](./setlength/)(int64_t) override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की लंबाई सेट करता है। |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>) | एक नया उदाहरण बनाता है। |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool) | एक नया उदाहरण बनाता है। |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) | एक नया उदाहरण बनाता है। |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) | एक नया उदाहरण बनाता है। |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) | एक नया उदाहरण बनाता है। |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&) | निर्दिष्ट बाइट एरे को स्ट्रीम में लिखता है। |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है। |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&) | निर्दिष्ट बाइट एरे को स्ट्रीम में लिखता है। |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Null](../../system.io/stream/null/) | एक स्ट्रीम जिसमें कोई अंतर्निहित संग्रह नहीं है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [AsyncResultType](./asyncresulttype/) | RTTI जानकारी। |
| [StreamImplementationPtr](./streamimplementationptr/) | इम्प्लीमेंटेशन के पॉइंटर का प्रकार। |
## संबंधित देखें

* Class [AuthenticatedStream](../authenticatedstream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
