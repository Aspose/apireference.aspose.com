---
title: "System::Threading::Tasks::ResultTask क्लास"
linktitle: "ResultTask"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Tasks::ResultTask क्लास। एक Task विशेषीकरण जो C++ में पूर्णता पर परिणाम मान लौटाता है।"
type: docs
weight: 100
url: /hi/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


एक [Task](../task/) विशेषीकरण जो पूर्णता पर परिणाम मान लौटाता है।

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| पैरामीटर | विवरण |
| --- | --- |
| T | टास्क द्वारा लौटाए गए परिणाम मान का प्रकार |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ConfigureAwait](./configureawait/)(bool) const | यह निर्धारित करता है कि इस परिणाम टास्क पर await कैसे संदर्भ कैप्चर के संबंध में व्यवहार करे। |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | एक continuation बनाता है जो परिणाम टास्क के पूर्ण होने पर निष्पादित होता है। |
| [get_Result](./get_result/)() const | असिंक्रोनस ऑपरेशन का परिणाम प्राप्त करता है। |
| [GetAwaiter](./getawaiter/)() const | Await के साथ उपयोग के लिए इस परिणाम टास्क का awaiter प्राप्त करता है। |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | एक फ़ंक्शन जो मान लौटाता है, के साथ एक [ResultTask](./) बनाता है। |
| [ResultTask](./resulttask/)() | आंतरिक कार्यान्वयन। उपयोगकर्ता कोड के लिए नहीं। |
| [ResultTask](./resulttask/)(const T\&) | निर्दिष्ट परिणाम के साथ परिणाम टास्क बनाने के लिए आंतरिक कंस्ट्रक्टर। |
| [set_Result](./set_result/)(const T\&) | टास्क के लिए परिणाम मान सेट करता है। |
## टिप्पणियाँ



एक असिंक्रोनस ऑपरेशन का प्रतिनिधित्व करता है जो परिणाम उत्पन्न करता है, .NET में [System.Threading.Tasks.Task<TResult>](../task/) के समान।
## संबंधित देखें

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
