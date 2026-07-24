---
title: "System::Security::Permissions::SecurityPermission क्लास"
linktitle: "SecurityPermission"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Permissions::SecurityPermission क्लास। सुरक्षा अनुमति का वर्णन करने वाली क्लास। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 100
url: /hi/cpp/system.security.permissions/securitypermission/
---
## SecurityPermission class


सुरक्षा अनुमति का वर्णन करने वाली क्लास। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class SecurityPermission : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Flags](./get_flags/)() | RTTI जानकारी। |
| [IsUnrestricted](./isunrestricted/)() | जाँचता है कि अनुमति अप्रतिबंधित है या नहीं। |
| [SecurityPermission](./securitypermission/)(PermissionState) | निर्माता। |
| [SecurityPermission](./securitypermission/)(SecurityPermissionFlag) | निर्माता। |
| [set_Flags](./set_flags/)(SecurityPermissionFlag) | अनुमति से जुड़े फ़्लैग सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Security::Permissions](../)
* Library [Aspose.Page for C++](../../)
