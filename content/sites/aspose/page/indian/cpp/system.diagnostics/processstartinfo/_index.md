---
title: "System::Diagnostics::ProcessStartInfo क्लास"
linktitle: "ProcessStartInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Diagnostics::ProcessStartInfo क्लास। प्रक्रिया प्रारंभ पैरामीटरों का वर्णन करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 400
url: /hi/cpp/system.diagnostics/processstartinfo/
---
## ProcessStartInfo class


प्रक्रिया प्रारंभ पैरामीटरों का वर्णन करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class ProcessStartInfo : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Arguments](./get_arguments/)() const | प्रक्रिया तर्क प्राप्त करता है। |
| [get_CreateNoWindow](./get_createnowindow/)() const | NoWindow प्रॉपर्टी प्राप्त करता है। |
| [get_EnvironmentVariables](./get_environmentvariables/)() const | प्रक्रिया पर्यावरण चर प्राप्त करता है। |
| [get_FileName](./get_filename/)() const | प्रक्रिया फ़ाइल नाम प्राप्त करता है। |
| [get_RedirectStandardError](./get_redirectstandarderror/)() const | RedirectStandardError प्रॉपर्टी प्राप्त करता है। |
| [get_RedirectStandardInput](./get_redirectstandardinput/)() const | RedirectStandardInput प्रॉपर्टी प्राप्त करता है। |
| [get_RedirectStandardOutput](./get_redirectstandardoutput/)() const | RedirectStandardOutput प्रॉपर्टी प्राप्त करता है। |
| [get_UseShellExecute](./get_useshellexecute/)() const | UseShellExecute प्रॉपर्टी प्राप्त करता है। |
| [get_WindowStyle](./get_windowstyle/)() const | विंडो शैली प्राप्त करता है। |
| [get_WorkingDirectory](./get_workingdirectory/)() const | प्रक्रिया की कार्यशील निर्देशिका प्राप्त करता है। |
| [ProcessStartInfo](./processstartinfo/)() | खाली स्टार्ट इन्फो ऑब्जेक्ट बनाता है। |
| [ProcessStartInfo](./processstartinfo/)(const String\&) | स्टार्ट इन्फो ऑब्जेक्ट बनाता है। |
| [ProcessStartInfo](./processstartinfo/)(const String\&, const String\&) | स्टार्ट इन्फो ऑब्जेक्ट बनाता है। |
| [set_Arguments](./set_arguments/)(const String\&) | प्रक्रिया तर्क सेट करता है। |
| [set_CreateNoWindow](./set_createnowindow/)(bool) | NoWindow प्रॉपर्टी सेट करता है। |
| [set_FileName](./set_filename/)(const String\&) | प्रक्रिया फ़ाइल नाम सेट करता है। |
| [set_RedirectStandardError](./set_redirectstandarderror/)(bool) | RedirectStandardError प्रॉपर्टी सेट करता है। |
| [set_RedirectStandardInput](./set_redirectstandardinput/)(bool) | RedirectStandardInput प्रॉपर्टी सेट करता है। |
| [set_RedirectStandardOutput](./set_redirectstandardoutput/)(bool) | RedirectStandardOutput प्रॉपर्टी सेट करता है। |
| [set_UseShellExecute](./set_useshellexecute/)(bool) | UseShellExecute प्रॉपर्टी सेट करता है। |
| [set_WindowStyle](./set_windowstyle/)(ProcessWindowStyle) | विंडो शैली सेट करता है। |
| [set_WorkingDirectory](./set_workingdirectory/)(const String\&) | प्रक्रिया की कार्य निर्देशिका सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
