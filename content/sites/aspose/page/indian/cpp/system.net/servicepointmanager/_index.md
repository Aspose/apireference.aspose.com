---
title: "System::Net::ServicePointManager क्लास"
linktitle: "ServicePointManager"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::ServicePointManager क्लास। ServicePoint क्लास की इंस्टेंस के जीवनचक्र चरणों (निर्माण, रखरखाव, और हटाना) का प्रबंधन करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर को फ़ंक्शन्स में आर्ग्यूमेंट के रूप में पास करें।"
type: docs
weight: 3200
url: /hi/cpp/system.net/servicepointmanager/
---
## ServicePointManager class


[ServicePoint](../servicepoint/) क्लास की इंस्टेंस के जीवनचक्र चरणों (निर्माण, रखरखाव, और हटाना) का प्रबंधन करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर को फ़ंक्शन्स में आर्ग्यूमेंट के रूप में पास करें।

```cpp
class ServicePointManager : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [get_CertificatePolicy](./get_certificatepolicy/)() | एक प्रमाणपत्र नीति प्राप्त करता है। |
| static [get_CheckCertificateRevocationList](./get_checkcertificaterevocationlist/)() | एक मान प्राप्त करता है जो दर्शाता है कि क्या प्रमाणपत्र को प्रमाणपत्र प्राधिकरण रिवोकेशन सूची के विरुद्ध जांचा जाना चाहिए। |
| static [get_DefaultConnectionLimit](./get_defaultconnectionlimit/)() | ServicePoint- क्लास की इंस्टेंस द्वारा अनुमत अधिकतम समवर्ती कनेक्शनों की संख्या प्राप्त करता है। |
| static [get_DnsRefreshTimeout](./get_dnsrefreshtimeout/)() | एक टाइमआउट (मिलीसेकंड में) प्राप्त करता है जिसके दौरान DNS रिज़ॉल्यूशन को वैध माना जाता है। |
| static [get_EnableDnsRoundRobin](./get_enablednsroundrobin/)() | एक मान प्राप्त करता है जो दर्शाता है कि क्या DNS रिज़ॉल्यूशन लागू IP पतों के बीच घुमाया जाता है। |
| static [get_EncryptionPolicy](./get_encryptionpolicy/)() | वर्तमान इंस्टेंस द्वारा उपयोग की जाने वाली एन्क्रिप्शन नीति लौटाता है। |
| static [get_Expect100Continue](./get_expect100continue/)() | एक मान प्राप्त करता है जो दर्शाता है कि ServicePoint- क्लास की इंस्टेंस 100-Continue व्यवहार का उपयोग करती हैं या नहीं। |
| static [get_MaxServicePointIdleTime](./get_maxservicepointidletime/)() | ServicePoint- क्लास की इंस्टेंस का अधिकतम निष्क्रिय समय प्राप्त करता है। |
| static [get_MaxServicePoints](./get_maxservicepoints/)() | वर्तमान इंस्टेंस द्वारा प्रबंधित किए जा सकने वाले ServicePoint- क्लास की अधिकतम इंस्टेंस संख्या प्राप्त करता है। |
| static [get_ReusePort](./get_reuseport/)() | एक मान प्राप्त करता है जो दर्शाता है कि आउटपुट कनेक्शन सॉकेट्स 'SO_REUSE_UNICASTPORT' विकल्प का उपयोग करते हैं या नहीं। |
| static [get_SecurityProtocol](./get_securityprotocol/)() | वर्तमान इंस्टेंस द्वारा प्रबंधित ServicePoint- क्लास की इंस्टेंस द्वारा उपयोग किए जाने वाले सुरक्षा प्रोटोकॉल प्रकार को प्राप्त करता है। |
| static [get_ServerCertificateValidationCallback](./get_servercertificatevalidationcallback/)() | एक कॉलबैक प्राप्त करता है जो सर्वर प्रमाणपत्र को मान्य करने के लिए उपयोग किया जाता है। |
| static [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | एक मान प्राप्त करता है जो दर्शाता है कि ServicePoint- क्लास की इंस्टेंस Nagle एल्गोरिद्म का उपयोग करती हैं या नहीं। |
| static [set_CertificatePolicy](./set_certificatepolicy/)(System::SharedPtr\<ICertificatePolicy\>) | एक प्रमाणपत्र नीति सेट करता है। |
| static [set_CheckCertificateRevocationList](./set_checkcertificaterevocationlist/)(bool) | एक मान सेट करता है जो दर्शाता है कि क्या प्रमाणपत्र को प्रमाणपत्र प्राधिकरण रिवोकेशन सूची के विरुद्ध जांचा जाना चाहिए। |
| static [set_DefaultConnectionLimit](./set_defaultconnectionlimit/)(int32_t) | ServicePoint- क्लास की इंस्टेंस द्वारा अनुमत अधिकतम समवर्ती कनेक्शनों की संख्या सेट करता है। |
| static [set_DnsRefreshTimeout](./set_dnsrefreshtimeout/)(int32_t) | एक टाइमआउट (मिलीसेकंड में) सेट करता है जिसके दौरान DNS रिज़ॉल्यूशन को वैध माना जाता है। |
| static [set_EnableDnsRoundRobin](./set_enablednsroundrobin/)(bool) | एक मान सेट करता है जो दर्शाता है कि क्या DNS रिज़ॉल्यूशन लागू IP पतों के बीच घुमाया जाता है। |
| static [set_Expect100Continue](./set_expect100continue/)(bool) | एक मान सेट करता है जो दर्शाता है कि ServicePoint-क्लास की इंस्टेंसेज़ 100-Continue व्यवहार का उपयोग करती हैं। |
| static [set_MaxServicePointIdleTime](./set_maxservicepointidletime/)(int32_t) | ServicePoint-क्लास की इंस्टेंसेज़ का अधिकतम निष्क्रिय समय सेट करता है। |
| static [set_MaxServicePoints](./set_maxservicepoints/)(int32_t) | वर्तमान इंस्टेंस द्वारा प्रबंधित किए जा सकने वाले ServicePoint-क्लास की इंस्टेंसेज़ की अधिकतम संख्या सेट करता है। |
| static [set_ReusePort](./set_reuseport/)(bool) | एक मान सेट करता है जो दर्शाता है कि आउटपुट कनेक्शन सॉकेट्स 'SO_REUSE_UNICASTPORT' विकल्प का उपयोग करते हैं या नहीं। |
| static [set_SecurityProtocol](./set_securityprotocol/)(SecurityProtocolType) | वर्तमान इंस्टेंस द्वारा प्रबंधित ServicePoint-क्लास की इंस्टेंसेज़ द्वारा उपयोग किए जाने वाले सुरक्षा प्रोटोकॉल प्रकार को सेट करता है। |
| static [set_ServerCertificateValidationCallback](./set_servercertificatevalidationcallback/)(Security::RemoteCertificateValidationCallback) | सर्वर प्रमाणपत्र को मान्य करने के लिए उपयोग किए जाने वाले कॉलबैक को सेट करता है। |
| static [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | एक मान सेट करता है जो दर्शाता है कि ServicePoint-क्लास की इंस्टेंसेज़ Nagle एल्गोरिद्म का उपयोग करती हैं या नहीं। |
| static [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | 'Keep-Alive' विकल्प सक्षम है या नहीं, यह दर्शाने वाला मान सेट करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [DefaultNonPersistentConnectionLimit](./defaultnonpersistentconnectionlimit/) | RTTI जानकारी। |
| static [DefaultPersistentConnectionLimit](./defaultpersistentconnectionlimit/) | स्थायी कनेक्शनों की डिफ़ॉल्ट संख्या। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
