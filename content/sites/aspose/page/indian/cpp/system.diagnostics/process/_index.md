---
title: "System::Diagnostics::Process class"
linktitle: "Process"
second_title: "Aspose.Page C++ के लिए"
description: "System::Diagnostics::Process class। प्रक्रिया जानकारी और हेरफेर को संलग्न करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 300
url: /hi/cpp/system.diagnostics/process/
---
## Process class


प्रक्रिया जानकारी और हेरफेर को संलग्न करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों के तर्क के रूप में पास करें।

```cpp
class Process : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_EnableRaisingEvents](./get_enableraisingevents/)() const | प्राप्त करता है कि प्रक्रिया समाप्त होने पर Exited इवेंट उठाया जाना चाहिए या नहीं। |
| [get_ExitCode](./get_exitcode/)() const | प्रक्रिया का एग्ज़िट कोड प्राप्त करता है। |
| [get_PrivateMemorySize64](./get_privatememorysize64/)() const | प्रक्रिया की निजी मेमोरी सेट आकार प्राप्त करता है। |
| [get_ProcessName](./get_processname/)() const | प्रक्रिया का नाम प्राप्त करता है। |
| [get_StandardError](./get_standarderror/)() const | प्रक्रिया त्रुटि आउटपुट से पढ़ने के लिए रीडर प्रदान करता है। लागू नहीं किया गया है। |
| [get_StandardOutput](./get_standardoutput/)() const | प्रक्रिया मानक आउटपुट से पढ़ने के लिए रीडर प्रदान करता है। लागू नहीं किया गया है। |
| [get_StartInfo](./get_startinfo/)() const | प्रक्रिया प्रारंभ जानकारी प्राप्त करता है। |
| [get_WorkingSet64](./get_workingset64/)() const | प्रक्रिया मेमोरी कार्य सेट आकार प्राप्त करता है। |
| static [GetCurrentProcess](./getcurrentprocess/)() | वर्तमान प्रक्रिया की जानकारी प्राप्त करता है। केवल [Windows](../../system.windows/)। |
| [GetOutputText](./getoutputtext/)() const | प्रक्रिया आउटपुट टेक्स्ट प्राप्त करता है। |
| [set_EnableRaisingEvents](./set_enableraisingevents/)(bool) | सेट करता है कि प्रक्रिया समाप्त होने पर इवेंट Exited उठाया जाना चाहिए या नहीं। |
| [Start](./start/)() | पूर्व-परिभाषित पैरामीटरों के साथ प्रक्रिया शुरू करता है। |
| static [Start](./start/)(const String\&, const String\&) | निर्दिष्ट पथ और तर्कों के साथ प्रक्रिया शुरू करता है। |
| static [Start](./start/)(const SharedPtr\<ProcessStartInfo\>\&) | निर्दिष्ट पथ और तर्कों के साथ प्रक्रिया शुरू करता है। |
| [WaitForExit](./waitforexit/)(int) | प्रक्रिया के समाप्त होने की प्रतीक्षा करता है। लागू नहीं किया गया है। |
| [WaitForExit](./waitforexit/)() | प्रक्रिया के समाप्त होने की प्रतीक्षा करता है, जब तक यह समाप्त नहीं हो जाता तब तक वापस नहीं लौटता। |
| virtual [~Process](./~process/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
