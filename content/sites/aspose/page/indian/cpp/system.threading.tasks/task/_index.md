---
title: "System::Threading::Tasks::Task क्लास"
linktitle: "Task"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Tasks::Task क्लास। एक असिंक्रोनस ऑपरेशन का प्रतिनिधित्व करता है जिसे C++ में await किया जा सकता है और अन्य टास्कों के साथ संयोजित किया जा सकता है।"
type: docs
weight: 300
url: /hi/cpp/system.threading.tasks/task/
---
## Task class


एक असिंक्रोनस ऑपरेशन का प्रतिनिधित्व करता है जिसे प्रतीक्षा किया जा सकता है और अन्य टास्क के साथ संयोजित किया जा सकता है।

```cpp
class Task : public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Activate](./activate/)(TaskScheduler *) | टास्क को शेड्यूलर पर निष्पादन के लिए सक्रिय करता है। |
| [AddContinuation](./addcontinuation/)(const Action<>\&) | पूरा होने पर निष्पादित होने के लिए एक निरंतरता कार्रवाई जोड़ता है। |
| [Complete](./complete/)() | टास्क को पूर्ण के रूप में चिह्नित करता है और टास्क को समाप्त करता है। |
| [ConfigureAwait](./configureawait/)(bool) const | इस टास्क पर await कैसे व्यवहार करे, संदर्भ कैप्चर के संबंध में कॉन्फ़िगर करता है। |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | एक निरंतरता बनाता है जो टास्क के पूर्ण होने पर निष्पादित होती है। |
| [Dispose](./dispose/)() override | टास्क से जुड़े संसाधनों को रिलीज़ करता है। |
| [Execute](./execute/)() | टास्क का फ़ंक्शन निष्पादित करता है। |
| [get_AsyncState](./get_asyncstate/)() const | टास्क से जुड़े उपयोगकर्ता-परिभाषित स्टेट ऑब्जेक्ट को प्राप्त करता है। |
| static [get_CompletedTask](./get_completedtask/)() | एक पूर्ण टास्क (सिंगलटन) प्राप्त करता है। |
| static [get_CurrentId](./get_currentid/)() |  |
| [get_Id](./get_id/)() const | टास्क के लिए आईडी प्राप्त करता है। |
| [get_IsCanceled](./get_iscanceled/)() const | टास्क रद्दीकरण के कारण पूर्ण हुआ है या नहीं, प्राप्त करता है। |
| [get_IsCompleted](./get_iscompleted/)() const | टास्क पूर्ण हुआ है या नहीं, प्राप्त करता है। |
| [get_IsFaulted](./get_isfaulted/)() const | टास्क अनहैंडल्ड एक्सेप्शन के कारण पूर्ण हुआ है या नहीं, प्राप्त करता है। |
| [get_Scheduler](./get_scheduler/)() const | इस टास्क से जुड़े शेड्यूलर को प्राप्त करता है। |
| [get_Status](./get_status/)() const | टास्क की वर्तमान स्थिति को प्राप्त करता है। |
| [GetAwaiter](./getawaiter/)() const | Await के साथ उपयोग के लिए इस टास्क का awaiter प्राप्त करता है। |
| [RunSynchronously](./runsynchronously/)() | वर्तमान थ्रेड पर टास्क को सिंक्रोनस रूप से चलाता है। |
| [RunSynchronously](./runsynchronously/)(const SharedPtr\<TaskScheduler\>\&) | निर्दिष्ट शेड्यूलर का उपयोग करके टास्क को सिंक्रोनस रूप से चलाता है। |
| [set_Function](./set_function/)(const FunctionT\&) | आंतरिक फ़ंक्शन को निष्पादित करने के लिए सेट करता है। |
| [set_Scheduler](./set_scheduler/)(TaskScheduler *) | इस कार्य से जुड़े शेड्यूलर को सेट करता है। |
| [set_Status](./set_status/)(TaskStatus) | कार्य की स्थिति सेट करता है। |
| [Start](./start/)() | डिफ़ॉल्ट शेड्यूलर का उपयोग करके कार्य निष्पादन शुरू करता है। |
| [Start](./start/)(const SharedPtr\<TaskScheduler\>\&) | निर्दिष्ट शेड्यूलर का उपयोग करके कार्य निष्पादन शुरू करता है। |
| [Task](./task/)(const Action<>\&) | एक निष्पादित करने योग्य कार्रवाई के साथ एक [Task](./) बनाता है। |
| [Task](./task/)(const Action<>\&, const CancellationToken\&) | एक कार्रवाई और रद्दीकरण टोकन के साथ एक [Task](./) बनाता है। |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) | एक स्थिति-युक्त कार्रवाई और स्थिति वस्तु के साथ एक [Task](./) बनाता है। |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) | स्थिति-युक्त कार्रवाई, स्थिति, और रद्दीकरण टोकन के साथ एक [Task](./) बनाता है। |
| [Task](./task/)() | अप्रारंभित कार्यों को बनाने के लिए आंतरिक कंस्ट्रक्टर। |
| [Wait](./wait/)(const CancellationToken\&) const | रद्दीकरण समर्थन के साथ कार्य के पूर्ण होने की प्रतीक्षा करता है। |
| [Wait](./wait/)() const | कार्य के पूर्ण होने की प्रतीक्षा करता है। |
| [~Task](./~task/)() | डिस्ट्रक्टर। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [FunctionT](./functiont/) | आंतरिक कार्यान्वयन। उपयोगकर्ता कोड के लिए नहीं। |
## टिप्पणियाँ


.NET में [System.Threading.Tasks.Task](./) के समान एक C++ कार्यान्वयन प्रदान करता है, जो रद्दीकरण, निरंतरता, और async/await पैटर्न का समर्थन करता है।
## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
