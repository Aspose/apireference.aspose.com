---
title: "System::Data::SqlClient::SqlConnectionStringBuilder क्लास"
linktitle: "SqlConnectionStringBuilder"
second_title: "Aspose.Page C++ के लिए"
description: "System::Data::SqlClient::SqlConnectionStringBuilder क्लास। SQL-आधारित कनेक्शन बिल्डर। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शन के आर्गुमेंट के रूप में पास करें।"
type: docs
weight: 100
url: /hi/cpp/system.data.sqlclient/sqlconnectionstringbuilder/
---
## SqlConnectionStringBuilder class


SQL-आधारित कनेक्शन बिल्डर। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शन के आर्गुमेंट के रूप में पास करें।

```cpp
class SqlConnectionStringBuilder : public System::Data::Common::DbConnectionStringBuilder
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_DataSource](./get_datasource/)() const | डेटा स्रोत प्राप्त करता है (उदा. होस्टनेम और पोर्ट)। |
| [get_Encrypt](./get_encrypt/)() const | लाइन पर एन्क्रिप्शन सक्षम है या नहीं जांचता है। |
| [get_InitialCatalog](./get_initialcatalog/)() const | कनेक्शन से जुड़ी डेटाबेस का नाम प्राप्त करता है। |
| [get_NetworkLibrary](./get_networklibrary/)() const | उपयोग की गई नेटवर्क लाइब्रेरी का नाम प्राप्त करता है। |
| [get_Password](./get_password/)() const | डेटाबेस से कनेक्ट करने के लिए उपयोग किया गया पासवर्ड प्राप्त करता है। |
| [get_TrustServerCertificate](./get_trustservercertificate/)() const | जांचता है कि कनेक्शन ट्रस्ट सर्वर सर्टिफिकेट का उपयोग करके सुरक्षित है या नहीं। |
| [get_UserID](./get_userid/)() const | कनेक्शन के लिए उपयोग किया गया यूज़र आईडी प्राप्त करता है। |
| [idx_get](./idx_get/)(String) override | RTTI जानकारी। |
| [idx_set](./idx_set/)(String, Object::ptr) override | कीडेड ऑब्जेक्ट को सेट करता है। |
| [set_DataSource](./set_datasource/)(const String\&) | डेटा स्रोत प्राप्त करता है (उदा. होस्टनेम और पोर्ट)। |
| [set_Encrypt](./set_encrypt/)(bool) | एन्क्रिप्शन को चालू या बंद करता है। |
| [set_InitialCatalog](./set_initialcatalog/)(const String\&) | कनेक्शन से जुड़ी डेटाबेस का नाम सेट करता है। |
| [set_NetworkLibrary](./set_networklibrary/)(const String\&) | उपयोग करने के लिए नेटवर्क लाइब्रेरी चुनता है। |
| [set_Password](./set_password/)(const String\&) | डेटाबेस से कनेक्ट होने के लिए उपयोग किया जाने वाला पासवर्ड सेट करता है। |
| [set_TrustServerCertificate](./set_trustservercertificate/)(bool) | निर्धारित करता है कि क्या कनेक्शन ट्रस्ट सर्वर प्रमाणपत्र का उपयोग करके सुरक्षित है। |
| [set_UserID](./set_userid/)(const String\&) | कनेक्शन के लिए उपयोग किए जाने वाले यूज़र आईडी को सेट करता है। |
## संबंधित देखें

* Class [DbConnectionStringBuilder](../../system.data.common/dbconnectionstringbuilder/)
* Namespace [System::Data::SqlClient](../)
* Library [Aspose.Page for C++](../../)
